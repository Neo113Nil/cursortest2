#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK Yandex Go Taxi Food Delivery."""

import json
import os

from reportlab.lib import colors
from reportlab.lib.enums import TA_LEFT
from reportlab.lib.pagesizes import A4
from reportlab.lib.styles import ParagraphStyle
from reportlab.lib.units import mm
from reportlab.pdfbase import pdfmetrics
from reportlab.pdfbase.ttfonts import TTFont
from reportlab.platypus import Paragraph, SimpleDocTemplate, Spacer, Table, TableStyle

BASE = os.path.dirname(os.path.abspath(__file__))
OUT = os.path.join(BASE, "report.pdf")
CHECKS = os.path.join(BASE, "domain_checks.json")

FONT_DIR = "/usr/share/fonts/truetype/dejavu"
pdfmetrics.registerFont(TTFont("DJ", os.path.join(FONT_DIR, "DejaVuSans.ttf")))
pdfmetrics.registerFont(TTFont("DJ-B", os.path.join(FONT_DIR, "DejaVuSans-Bold.ttf")))

H1 = ParagraphStyle("H1", fontName="DJ-B", fontSize=16, leading=20,
                    spaceAfter=8, textColor=colors.HexColor("#12263f"))
H2 = ParagraphStyle("H2", fontName="DJ-B", fontSize=12.5, leading=16,
                    spaceBefore=12, spaceAfter=6,
                    textColor=colors.HexColor("#12263f"))
BODY = ParagraphStyle("BODY", fontName="DJ", fontSize=9.3, leading=13.4,
                      alignment=TA_LEFT, spaceAfter=5)
CELL = ParagraphStyle("CELL", fontName="DJ", fontSize=8.2, leading=10.8)
CELL_B = ParagraphStyle("CELL_B", fontName="DJ-B", fontSize=8.2, leading=10.8)
CELL_SM = ParagraphStyle("CELL_SM", fontName="DJ", fontSize=6.6, leading=8.2)
CELL_SM_B = ParagraphStyle("CELL_SM_B", fontName="DJ-B", fontSize=6.6, leading=8.2)
SMALL = ParagraphStyle("SMALL", fontName="DJ", fontSize=8.4, leading=11.6,
                       textColor=colors.HexColor("#444444"), spaceAfter=6)

GRID = colors.HexColor("#b9c2cc")
HEAD_BG = colors.HexColor("#1f3b57")
ALT_BG = colors.HexColor("#f2f5f8")


def esc(text):
    return (str(text).replace("&", "&amp;").replace("<", "&lt;")
            .replace(">", "&gt;"))


def kv_table(rows, widths=(52 * mm, 118 * mm), header=None, compact=False):
    key_style = CELL_SM_B if compact else CELL_B
    val_style = CELL_SM if compact else CELL
    data = []
    if header:
        data.append([
            Paragraph('<font color="#ffffff">%s</font>' % esc(header[0]),
                      CELL_SM_B if compact else CELL_B),
            Paragraph('<font color="#ffffff">%s</font>' % esc(header[1]),
                      CELL_SM_B if compact else CELL_B),
        ])
    for k, v in rows:
        data.append([Paragraph(esc(k), key_style), Paragraph(esc(v), val_style)])
    t = Table(data, colWidths=list(widths), repeatRows=1 if header else 0)
    style = [
        ("GRID", (0, 0), (-1, -1), 0.4, GRID),
        ("VALIGN", (0, 0), (-1, -1), "TOP"),
        ("LEFTPADDING", (0, 0), (-1, -1), 3 if compact else 4),
        ("RIGHTPADDING", (0, 0), (-1, -1), 3 if compact else 4),
        ("TOPPADDING", (0, 0), (-1, -1), 2 if compact else 3),
        ("BOTTOMPADDING", (0, 0), (-1, -1), 2 if compact else 3),
    ]
    if header:
        style.append(("BACKGROUND", (0, 0), (-1, 0), HEAD_BG))
    start = 1 if header else 0
    for i in range(start, len(data)):
        if (i - start) % 2 == 1:
            style.append(("BACKGROUND", (0, i), (-1, i), ALT_BG))
    t.setStyle(TableStyle(style))
    return t


PERMISSIONS = (
    "android.permission.FOREGROUND_SERVICE_LOCATION, "
    "android.permission.RECORD_AUDIO, "
    "android.permission.MODIFY_AUDIO_SETTINGS, "
    "android.permission.INTERNET, "
    "android.permission.ACCESS_FINE_LOCATION, "
    "android.permission.ACCESS_COARSE_LOCATION, "
    "android.permission.VIBRATE (minSdkVersion=29), "
    "android.permission.CALL_PHONE, "
    "android.permission.READ_PHONE_STATE, "
    "android.permission.WAKE_LOCK, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.FOREGROUND_SERVICE, "
    "android.permission.FOREGROUND_SERVICE_DATA_SYNC, "
    "android.permission.WRITE_EXTERNAL_STORAGE (maxSdkVersion=28), "
    "android.permission.POST_NOTIFICATIONS, "
    "ru.yandex.taxi.ORDER_NOTIFICATION, "
    "com.google.android.gms.permission.AD_ID, "
    "com.yandex.yphone.permission.WRITE, "
    "android.permission.SYSTEM_ALERT_WINDOW, "
    "android.permission.READ_EXTERNAL_STORAGE (maxSdkVersion=32), "
    "android.permission.CAMERA, "
    "android.permission.USE_FULL_SCREEN_INTENT, "
    "android.permission.ACCESS_WIFI_STATE, "
    "android.permission.BLUETOOTH_SCAN, "
    "android.permission.CHANGE_WIFI_STATE, "
    "android.permission.ACCESS_BACKGROUND_LOCATION, "
    "android.permission.POST_PROMOTED_NOTIFICATIONS, "
    "android.permission.DETECT_SCREEN_CAPTURE, "
    "android.permission.DETECT_SCREEN_RECORDING, "
    "android.permission.GET_ACCOUNTS (maxSdkVersion=22), "
    "android.permission.USE_CREDENTIALS, "
    "android.permission.MANAGE_ACCOUNTS, "
    "android.permission.AUTHENTICATE_ACCOUNTS, "
    "android.permission.READ_SYNC_SETTINGS, "
    "android.permission.WRITE_SYNC_SETTINGS, "
    "com.yandex.permission.READ_CREDENTIALS, "
    "com.yandex.permission.AM_COMMUNICATION, "
    "android.permission.BLUETOOTH (maxSdkVersion=30), "
    "android.permission.BLUETOOTH_CONNECT, "
    "android.permission.NFC, "
    "android.permission.READ_CONTACTS, "
    "android.permission.BLUETOOTH_ADMIN (maxSdkVersion=30), "
    "android.permission.RECEIVE_BOOT_COMPLETED, "
    "com.google.android.c2dm.permission.RECEIVE, "
    "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE, "
    "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
    "android.permission.ACCESS_ADSERVICES_AD_ID, "
    "com.android.vending.BILLING, "
    "android.permission.USE_BIOMETRIC, "
    "android.permission.USE_FINGERPRINT, "
    "ru.yandex.taxi.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION, "
    "com.yandex.yphone.permission.READ, "
    "com.sec.android.provider.badge.permission.READ, "
    "com.sec.android.provider.badge.permission.WRITE, "
    "com.htc.launcher.permission.READ_SETTINGS, "
    "com.htc.launcher.permission.UPDATE_SHORTCUT, "
    "com.sonyericsson.home.permission.BROADCAST_BADGE, "
    "com.sonymobile.home.permission.PROVIDER_INSERT_BADGE, "
    "com.anddoes.launcher.permission.UPDATE_COUNT, "
    "com.majeur.launcher.permission.UPDATE_BADGE, "
    "com.huawei.android.launcher.permission.CHANGE_BADGE, "
    "com.huawei.android.launcher.permission.READ_SETTINGS, "
    "com.huawei.android.launcher.permission.WRITE_SETTINGS, "
    "android.permission.READ_APP_BADGE, "
    "com.oppo.launcher.permission.READ_SETTINGS, "
    "com.oppo.launcher.permission.WRITE_SETTINGS, "
    "me.everything.badger.permission.BADGE_COUNT_READ, "
    "me.everything.badger.permission.BADGE_COUNT_WRITE"
)

AD_NETWORKS = (
    "Yandex Mobile Ads / Yandex Advertising Network "
    "(com.yandex.mobile.ads, пакет yads, com.monetization.ads), "
    "Yandex Urban Ads (com.yandex.urbanads)"
)

ANALYTICS = (
    "AppMetrica 8.2.0 (io.appmetrica) + AppMetrica Push 4.2.1, "
    "Adjust 5.0.2 (com.adjust.sdk, app.adjust.io), "
    "Firebase Analytics, Firebase Crashlytics, Firebase Cloud Messaging, "
    "Google Advertising ID / Play Install Referrer, "
    "Google Play Services Measurement"
)

LIBRARIES = (
    "androidx (appcompat, activity, fragment, browser/Custom Tabs, webkit, "
    "biometric, compose, work, lifecycle, room, datastore, camera, "
    "credentials, emoji2, window), "
    "Kotlin 2.4.0 / kotlinx-coroutines / kotlinx-serialization / "
    "kotlinx-datetime, "
    "OkHttp3, Okio, Retrofit2, Coil / Coil3, "
    "Google Play Services (ads-identifier, auth, base, basement, "
    "cloud-messaging, fido, identity, location, maps, measurement, "
    "mlkit barcode/face/text, tasks, wallet, gcm, iid), "
    "Firebase (analytics, crashlytics, messaging, installations, "
    "datatransport), Play Billing, Install Referrer, Feature Delivery, "
    "Integrity, "
    "Adjust, AppMetrica, "
    "com.yandex (go, passport, payment/paymentsdk, plus, mapkit, "
    "messaging/messenger, mobile.ads, urbanads, div/div2, alicekit, "
    "auth, browser, fintechsdk, yphone, voip_calls), "
    "com.ybsdk (Yandex Bank), "
    "ru.yandex (taxi, video, logistics, tankerapp, alice, in_app_calls), "
    "Flutter embedding + flutter_inappwebview "
    "(com.pichillilorenzo), "
    "WebRTC (org.webrtc / com.cloudwebrtc), Twilio, "
    "Apollo GraphQL, Lottie (com.airbnb.lottie), "
    "Facebook Shimmer, Koin (org.koin), BouncyCastle, "
    "AltBeacon, Splitties, Skeletor, Flex engine, "
    "NAlice / NYT (Yango/Quark), "
    "ulpxtkuiuctcbdiaddrzlfvlg (Yandex APK packer ru.yandextaxi.packer)"
)

SHARED_PREFS = (
    "Штатные хранилища сервиса: settings, experiments / "
    "experiments_current_session / experiments_overrides, "
    "prefs_location / explorer_last_location_prefs, "
    "polling, promotions, stories, badges, clid, "
    "common_storage, app_environment, "
    "passport_init / passport_sso_pref / authorization_cookie_store / "
    "cookie_storage, "
    "antirobot_prefs (антифрод Yandex, не cloaking), "
    "metrica_settings и AppMetrica BLE prefs, "
    "adjust_keys, "
    "com.google.android.gms.measurement.prefs / "
    "firebase crashlytics/messaging/common prefs, "
    "play_install_referrer_prefs, "
    "FlutterSharedPreferences, "
    "finsdk_shared_prefs / payment_kit_theme_prefs / "
    "com.yandex.plus.pay.experiments, "
    "messenger_*, logistics_hidden_deliveries_data, "
    "ru_yandex_plus_existing_screens_repository, "
    "divkit_shared_preferences, layers_map_object_prefs. "
    "Ключей offer_url / gate / white-page / cloak нет."
)

SUSPICIOUS_WORDS = (
    "antirobot / antirobot_prefs (com.yandex.go.antirobot, "
    "ru.yandex.mt.antirobot — капча/антифрод авторизации Yandex, "
    "не cloaking), "
    "whitelist / blacklist (форматы видеоплеера ru.yandex.video и "
    "base URL CDN, не white/dirty traffic), "
    "offer (промо Yandex Plus / multimodal / superapp, не CPA-оффер), "
    "landing / startLandingUrl (лендинги Yandex Bank SDK), "
    "redirect (OAuth / оплата / навигация), "
    "bot (тексты «Вы не робот?» на платёжных applink-доменах "
    "Yandex при проверке), "
    "click_id (аналитика кликов в мессенджере/интентах), "
    "webview / loadUrl (Passport, Payment, Flutter in-app browser, "
    "помощь — не gate→оффер), "
    "bridge (JS↔Android в платежах/Quark)"
)

DOMAIN_NOTES = {
    "am.applink.pay.yandex.ru": (
        "Боевой applink-хост оплаты Yandex: в коде Passport он стоит рядом с "
        "passport.yandex.ru / passport.yango.com как доверенный адрес входа и "
        "платежей. При внешней проверке открылась капча «Вы не робот?» "
        "(защита Yandex от автоматических запросов). VirusTotal 0/91. "
        "Это штатный платёжный контур, не скрытый оффер."
    ),
    "am.applink.sandbox.pay.yandex.ru": (
        "Песочница того же applink-платежного контура (sandbox). В списке "
        "доверенных хостов Passport рядом с боевым am.applink.pay.yandex.ru. "
        "Проверка также упирается в капчу антибота; детекций VirusTotal нет. "
        "Нужен для тестовых платежей, не для фильтрации «белого» трафика."
    ),
    "aomedia.org": (
        "Сайт Alliance for Open Media. В SDK рекламы/плеера (yads и media) "
        "встречается служебная схема метаданных "
        "https://aomedia.org/emsg/ID3 для видео. Открывается официальная "
        "страница организации; VirusTotal 0/91. Техническая ссылка кодека, "
        "не рекламный лендинг."
    ),
    "aomediacodec.github.io": (
        "Документация кодеков AOMedia на GitHub Pages (часто тянется "
        "медиастеком). Сейчас страница отдаёт 404 GitHub Pages; VirusTotal "
        "0/91. Остаток ссылки из видео/рекламного плеера, без роли «gate»."
    ),
    "app.adjust.io": (
        "Служебный хост SDK Adjust (атрибуция установок, версия android5.0.2). "
        "Приложение шлёт сюда события атрибуции, а не URL оффера. Прямой "
        "ответ «Url not found»; VirusTotal 0/91. Известная аналитика, не "
        "cloaking-домен."
    ),
    "app.tanker.yandex.net": (
        "Боевой адрес модуля Яндекс Заправки / Cartech "
        "(ru.yandex.tankerapp.go): при старте подставляется "
        "https://app.tanker.yandex.net. VirusTotal 0/91, ответа страницы нет. "
        "Штатный сервис заправок внутри Yandex Go."
    ),
    "app.tst.tanker.yandex.net": (
        "Тестовый стенд тех же заправок: в CartechDynamicApiImpl при "
        "isTesting выбирается https://app.tst.tanker.yandex.net вместо "
        "боевого. VirusTotal 0/91. Отладочный хост продукта, не оффер."
    ),
    "bertonhasebe.com": (
        "Сайт дизайнера шрифтов Berton Hasebe (Commercial Type). В сборке "
        "есть шрифты Druk (drive_uikit), в метаданных которых обычно "
        "прописан этот адрес. Сейчас «Website under construction»; "
        "VirusTotal 0/91. Лицензия/автор шрифта, не сетевой gate."
    ),
}


def load_checks():
    with open(CHECKS, "r", encoding="utf-8") as f:
        return json.load(f)


CHECKS_DATA = load_checks()
CHECKED_DOMAINS = [c["domain"] for c in CHECKS_DATA.get("checked", [])]

MAIN_ROWS = [
    ("Название приложения",
     "Yandex Go Taxi Food Delivery (ru.yandex.taxi), версия 5.89.0 "
     "(versionCode 50128354), разработчик Mikromobilnost LLC Belgrade"),
    ("Android Gradle Plugin", "9.2.1"),
    ("minSdk", "29"),
    ("targetSdk", "36"),
    ("Kotlin", "да, 2.4.0"),
    ("Web View", "да"),
    ("Custom Tabs", "да"),
    ("Рекламные сети", AD_NETWORKS),
    ("Аналитика", ANALYTICS),
    ("Permissions", PERMISSIONS),
    ("Libraries", LIBRARIES),
    ("Подозрительные домены",
     ", ".join(CHECKED_DOMAINS) if CHECKED_DOMAINS else "нет"),
    ("SharedPreferences", SHARED_PREFS),
    ("Есть ли клоака", "нет"),
    ("Подозрительные слова", SUSPICIOUS_WORDS),
]


def build():
    with open(CHECKS, "r", encoding="utf-8") as f:
        checks = json.load(f)
    by_domain = {c["domain"]: c for c in checks.get("checked", [])}

    doc = SimpleDocTemplate(
        OUT, pagesize=A4,
        leftMargin=18 * mm, rightMargin=18 * mm,
        topMargin=15 * mm, bottomMargin=15 * mm,
        title="Отчёт по анализу APK — Yandex Go Taxi Food Delivery",
        author="Анализ Android APK",
    )

    story = []
    story.append(Paragraph("Отчёт по анализу Android-приложения", H1))
    story.append(Paragraph(
        "Yandex Go Taxi Food Delivery &mdash; Mikromobilnost LLC Belgrade "
        "&mdash; ru.yandex.taxi (версия 5.89.0)", BODY))
    story.append(Paragraph(
        "Разобраны: ru.yandex.taxi.xapk, apk/ru.yandex.taxi.apk, "
        "apk/config.arm64_v8a.apk, apk/config.xxhdpi.apk, meta.json, "
        "domain_checks.json / domain_checks.md, "
        "decompiled/resources/AndroidManifest.xml, res/values/strings.xml и "
        "декомпилированные исходники (Application/MainActivity/StartActivity, "
        "LaunchApi, Passport/Payment WebView, yads / monetization.ads, "
        "Adjust, AppMetrica, Flutter in-appwebview, packer "
        "ulpxtkuiuctcbdiaddrzlfvlg). Точка входа: YandexTaxiApplication → "
        "MainActivity (карта такси); StartActivity / WebViewActivity — "
        "переход на MainActivity без HTTP-gate оффера.", SMALL))

    story.append(Paragraph("SDK / стек", H2))
    story.append(kv_table(
        MAIN_ROWS, widths=(42 * mm, 128 * mm),
        header=("Параметр", "Значение"), compact=True))

    if CHECKED_DOMAINS:
        story.append(Paragraph("Проверка подозрительных доменов", H2))
        story.append(Paragraph(
            "Данные ниже взяты как есть из готовых проверок пайплайна "
            "(domain_checks.json / domain_checks.md): сводка VirusTotal, полный "
            "список Security vendors' analysis и три дополнительных пункта "
            "в конце.", SMALL))

        for dom in CHECKED_DOMAINS:
            rec = by_domain.get(dom)
            if not rec:
                continue
            rows = [(r["param"], r["value"]) for r in rec.get("table_rows", [])]
            story.append(Paragraph("Проверка домена: %s" % esc(dom), H2))
            story.append(kv_table(
                rows, widths=(62 * mm, 108 * mm),
                header=("Параметр / движок", "Значение / вердикт")))
            note = DOMAIN_NOTES.get(dom)
            if note:
                story.append(Paragraph(esc(note), BODY))
            story.append(Spacer(1, 3 * mm))

    doc.build(story)
    print("saved:", OUT)


if __name__ == "__main__":
    build()
