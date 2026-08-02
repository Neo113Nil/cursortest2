package com.yandex.go.yb.api.domain.model;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/go/yb/api/domain/model/YbScreenSource;", "", "", "openReason", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "OVERDRAFT", "OVERDRAFT_SELECTOR", "OVERDRAFT_TOPUP_ACTION", "SUMMARY", "RIDE", "MENU", "DEEPLINK", "PROMO_OBJECT", "OVERDRAFT_INFORMER", "WEB_PLUS_HOME", "PUSH", "LPM", "DRIVE", "MENU_ITEM", "WEB_EATSKIT", "ADDRESS_SELECTION", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class YbScreenSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YbScreenSource[] $VALUES;
    public static final YbScreenSource ADDRESS_SELECTION;
    public static final YbScreenSource DEEPLINK;
    public static final YbScreenSource DRIVE;
    public static final YbScreenSource LPM;
    public static final YbScreenSource MENU;
    public static final YbScreenSource MENU_ITEM;
    public static final YbScreenSource OVERDRAFT;
    public static final YbScreenSource OVERDRAFT_INFORMER;
    public static final YbScreenSource OVERDRAFT_SELECTOR;
    public static final YbScreenSource OVERDRAFT_TOPUP_ACTION;
    public static final YbScreenSource PROMO_OBJECT;
    public static final YbScreenSource PUSH;
    public static final YbScreenSource RIDE;
    public static final YbScreenSource SUMMARY;
    public static final YbScreenSource WEB_EATSKIT;
    public static final YbScreenSource WEB_PLUS_HOME;
    private final String openReason;

    static {
        YbScreenSource ybScreenSource = new YbScreenSource("OVERDRAFT", 0, "overdraft");
        OVERDRAFT = ybScreenSource;
        YbScreenSource ybScreenSource2 = new YbScreenSource("OVERDRAFT_SELECTOR", 1, "overdraft_selector");
        OVERDRAFT_SELECTOR = ybScreenSource2;
        YbScreenSource ybScreenSource3 = new YbScreenSource("OVERDRAFT_TOPUP_ACTION", 2, "overdraft_topup_action");
        OVERDRAFT_TOPUP_ACTION = ybScreenSource3;
        YbScreenSource ybScreenSource4 = new YbScreenSource("SUMMARY", 3, "summary");
        SUMMARY = ybScreenSource4;
        YbScreenSource ybScreenSource5 = new YbScreenSource("RIDE", 4, "ride");
        RIDE = ybScreenSource5;
        YbScreenSource ybScreenSource6 = new YbScreenSource("MENU", 5, "menu");
        MENU = ybScreenSource6;
        YbScreenSource ybScreenSource7 = new YbScreenSource("DEEPLINK", 6, Constants.DEEPLINK);
        DEEPLINK = ybScreenSource7;
        YbScreenSource ybScreenSource8 = new YbScreenSource("PROMO_OBJECT", 7, "promo_object");
        PROMO_OBJECT = ybScreenSource8;
        YbScreenSource ybScreenSource9 = new YbScreenSource("OVERDRAFT_INFORMER", 8, "overdraft_informer");
        OVERDRAFT_INFORMER = ybScreenSource9;
        YbScreenSource ybScreenSource10 = new YbScreenSource("WEB_PLUS_HOME", 9, "web_plus_home");
        WEB_PLUS_HOME = ybScreenSource10;
        YbScreenSource ybScreenSource11 = new YbScreenSource("PUSH", 10, Constants.PUSH);
        PUSH = ybScreenSource11;
        YbScreenSource ybScreenSource12 = new YbScreenSource("LPM", 11, "lpm");
        LPM = ybScreenSource12;
        YbScreenSource ybScreenSource13 = new YbScreenSource("DRIVE", 12, TariffOrderFlow.ORDER_FLOW_DRIVE_KEY);
        DRIVE = ybScreenSource13;
        YbScreenSource ybScreenSource14 = new YbScreenSource("MENU_ITEM", 13, "menu_item");
        MENU_ITEM = ybScreenSource14;
        YbScreenSource ybScreenSource15 = new YbScreenSource("WEB_EATSKIT", 14, "web_eatskit");
        WEB_EATSKIT = ybScreenSource15;
        YbScreenSource ybScreenSource16 = new YbScreenSource("ADDRESS_SELECTION", 15, "address_selection");
        ADDRESS_SELECTION = ybScreenSource16;
        YbScreenSource[] ybScreenSourceArr = {ybScreenSource, ybScreenSource2, ybScreenSource3, ybScreenSource4, ybScreenSource5, ybScreenSource6, ybScreenSource7, ybScreenSource8, ybScreenSource9, ybScreenSource10, ybScreenSource11, ybScreenSource12, ybScreenSource13, ybScreenSource14, ybScreenSource15, ybScreenSource16};
        $VALUES = ybScreenSourceArr;
        $ENTRIES = a.a(ybScreenSourceArr);
    }

    public YbScreenSource(String str, int i, String str2) {
        this.openReason = str2;
    }

    public static YbScreenSource valueOf(String str) {
        return (YbScreenSource) Enum.valueOf(YbScreenSource.class, str);
    }

    public static YbScreenSource[] values() {
        return (YbScreenSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getOpenReason() {
        return this.openReason;
    }
}
