package com.yandex.go.safety.center.experiment;

import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.av31;
import defpackage.bdc;
import defpackage.c6z;
import defpackage.d6z;
import defpackage.gdc;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ibl0;
import defpackage.jrl0;
import defpackage.jsq0;
import defpackage.jst;
import defpackage.k4o;
import defpackage.kdc;
import defpackage.ksq0;
import defpackage.mqg0;
import defpackage.oyr;
import defpackage.scc;
import defpackage.vn11;
import defpackage.xng0;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0010\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment;", "Lvn11;", "Lc6z;", "Companion", "ButtonPlace", "Strategy", "SafetyCenterButton", "ButtonType", "EmergencyTicket", "CrashDetection", "Fallback", "Instruction", PlusPayUiKitInflaterFactory.NAME_BUTTON, "InstructionsWebViewConfig", "ButtonStyle", "Action", "L10nKey", "L10nTemplateParam", "com/yandex/go/safety/center/experiment/f", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SafetyCenterExperiment implements vn11, c6z {
    public static final f Companion = new f();
    public static final i3y[] s;
    public static final List t;
    public static final SafetyCenterExperiment u;
    public final boolean b;
    public final Map c;
    public final jsq0 d;
    public final EmergencyTicket e;
    public final CrashDetection f;
    public final Fallback g;
    public final String h;
    public final String i;
    public final List j;
    public final InstructionsWebViewConfig k;
    public final int l;
    public final int m;
    public final List n;
    public final String o;
    public final SafetyCenterWebConfig p;
    public final EnumMap q;
    public Boolean r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment$Action;", "", "Companion", "com/yandex/go/safety/center/experiment/a", "CALL_EMERGENCY", "CALL_DRIVER", "CONTACT_SUPPORT", "CALL_ANY_NUMBER", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Action {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Action CALL_ANY_NUMBER;
        public static final Action CALL_DRIVER;
        public static final Action CALL_EMERGENCY;
        public static final Action CONTACT_SUPPORT;
        public static final a Companion;

        static {
            Action action = new Action("CALL_EMERGENCY", 0);
            CALL_EMERGENCY = action;
            Action action2 = new Action("CALL_DRIVER", 1);
            CALL_DRIVER = action2;
            Action action3 = new Action("CONTACT_SUPPORT", 2);
            CONTACT_SUPPORT = action3;
            Action action4 = new Action("CALL_ANY_NUMBER", 3);
            CALL_ANY_NUMBER = action4;
            Action[] actionArr = {action, action2, action3, action4};
            $VALUES = actionArr;
            $ENTRIES = kotlin.enums.a.a(actionArr);
            Companion = new a();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ibl0(19));
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment$ButtonPlace;", "", "Companion", "com/yandex/go/safety/center/experiment/c", "RIDE_DETAILS", "SIDEBAR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ButtonPlace {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ButtonPlace[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final c Companion;
        public static final ButtonPlace RIDE_DETAILS;
        public static final ButtonPlace SIDEBAR;

        static {
            ButtonPlace buttonPlace = new ButtonPlace("RIDE_DETAILS", 0);
            RIDE_DETAILS = buttonPlace;
            ButtonPlace buttonPlace2 = new ButtonPlace("SIDEBAR", 1);
            SIDEBAR = buttonPlace2;
            ButtonPlace[] buttonPlaceArr = {buttonPlace, buttonPlace2};
            $VALUES = buttonPlaceArr;
            $ENTRIES = kotlin.enums.a.a(buttonPlaceArr);
            Companion = new c();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ibl0(24));
        }

        public static ButtonPlace valueOf(String str) {
            return (ButtonPlace) Enum.valueOf(ButtonPlace.class, str);
        }

        public static ButtonPlace[] values() {
            return (ButtonPlace[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment$ButtonStyle;", "", "Lkdc;", C0553n3.g, "Lkdc;", "b", "()Lkdc;", "textColor", "c", "Companion", "com/yandex/go/safety/center/experiment/d", "RED", "YELLOW", "GRAY", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ButtonStyle {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ButtonStyle[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final d Companion;
        public static final ButtonStyle GRAY;
        public static final ButtonStyle RED;
        public static final ButtonStyle YELLOW;
        private final kdc background;
        private final kdc textColor;

        static {
            ButtonStyle buttonStyle = new ButtonStyle(0, new gdc(mqg0.component_red_toxic), new gdc(mqg0.component_white), "RED");
            RED = buttonStyle;
            ButtonStyle buttonStyle2 = new ButtonStyle(1, new bdc(xng0.controlMain), new bdc(xng0.textOnControl), "YELLOW");
            YELLOW = buttonStyle2;
            ButtonStyle buttonStyle3 = new ButtonStyle(2, new bdc(xng0.controlMinor), new bdc(xng0.textOnControlMinor), "GRAY");
            GRAY = buttonStyle3;
            ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2, buttonStyle3};
            $VALUES = buttonStyleArr;
            $ENTRIES = kotlin.enums.a.a(buttonStyleArr);
            Companion = new d();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ibl0(25));
        }

        public ButtonStyle(int i, kdc kdcVar, kdc kdcVar2, String str) {
            this.background = kdcVar;
            this.textColor = kdcVar2;
        }

        public static ButtonStyle valueOf(String str) {
            return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
        }

        public static ButtonStyle[] values() {
            return (ButtonStyle[]) $VALUES.clone();
        }

        /* renamed from: b, reason: from getter */
        public final kdc getBackground() {
            return this.background;
        }

        /* renamed from: c, reason: from getter */
        public final kdc getTextColor() {
            return this.textColor;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment$ButtonType;", "", "Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment$L10nKey;", "titleKey", "Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment$L10nKey;", "b", "()Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment$L10nKey;", "Companion", "com/yandex/go/safety/center/experiment/e", "EMERGENCY", "FAQ", "CONTACTS", "SHARE_ROUTE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ButtonType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ButtonType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final ButtonType CONTACTS;
        public static final e Companion;
        public static final ButtonType EMERGENCY;
        public static final ButtonType FAQ;
        public static final ButtonType SHARE_ROUTE;
        private final L10nKey titleKey;

        static {
            ButtonType buttonType = new ButtonType("EMERGENCY", 0, L10nKey.EMERGENCY_LINK_TITLE);
            EMERGENCY = buttonType;
            ButtonType buttonType2 = new ButtonType("FAQ", 1, L10nKey.INSTRUCTIONS_LINK_TITLE);
            FAQ = buttonType2;
            ButtonType buttonType3 = new ButtonType("CONTACTS", 2, L10nKey.TRUSTED_CONTACTS_LINK_TITLE);
            CONTACTS = buttonType3;
            ButtonType buttonType4 = new ButtonType("SHARE_ROUTE", 3, L10nKey.SHARE_LINK_TITLE);
            SHARE_ROUTE = buttonType4;
            ButtonType[] buttonTypeArr = {buttonType, buttonType2, buttonType3, buttonType4};
            $VALUES = buttonTypeArr;
            $ENTRIES = kotlin.enums.a.a(buttonTypeArr);
            Companion = new e();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ibl0(26));
        }

        public ButtonType(String str, int i, L10nKey l10nKey) {
            this.titleKey = l10nKey;
        }

        public static ButtonType valueOf(String str) {
            return (ButtonType) Enum.valueOf(ButtonType.class, str);
        }

        public static ButtonType[] values() {
            return (ButtonType[]) $VALUES.clone();
        }

        /* renamed from: b, reason: from getter */
        public final L10nKey getTitleKey() {
            return this.titleKey;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\bJ\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bP¨\u0006Q"}, d2 = {"Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment$L10nKey;", "", "", "key", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "", "template", "Z", "b", "()Z", "MAIN_BUTTON_LINK_TITLE", "MAIN_BUTTON_MENU_LINK_TITLE", "MAIN_SCREEN_TITLE", "INSTRUCTIONS_LINK_TITLE", "INSTRUCTIONS_SCREEN_TITLE", "SHARE_LINK_TITLE", "SHARE_SCREEN_TITLE", "SHARE_SCREEN_ADD_CONTACTS_LINK_TITLE", "SHARE_SCREEN_SEND_OTHER_LINK_TITLE", "SHARE_SCREEN_SEND_OTHER_SMS_TEMPLATE", "SHARE_SCREEN_SENDING_TITLE", "SHARE_SCREEN_SENDING_CANCEL", "SHARE_SCREEN_SENDING_SUCCESS", "SHARE_SCREEN_SENDING_ERROR", "SHARE_SCREEN_FRAUDER_SMS_TEMPLATE", "SHARE_SCREEN_PROMO_TITLE", "SHARE_SCREEN_PROMO_DESCRIPTION", "SHARE_SCREEN_PROMO_ADD_LINK_TITLE", "SHARE_SCREEN_PROMO_LATER_LINK_TITLE", "TRUSTED_CONTACTS_LINK_TITLE", "TRUSTED_CONTACTS_SCREEN_TITLE", "TRUSTED_CONTACTS_SCREEN_DESCRIPTION", "TRUSTED_CONTACTS_ADD_LINK_TITLE", "TRUSTED_CONTACTS_ADD_MORE_LINK_TITLE", "TRUSTED_CONTACTS_DONE_LINK_TITLE", "TRUSTED_CONTACTS_SELECT_SCREEN_TITLE", "TRUSTED_CONTACTS_SELECT_SCREEN_SEARCH_PLACEHOLDER", "TRUSTED_CONTACTS_SELECT_SCREEN_ADD_LINK_TITLE", "TRUSTED_CONTACTS_PERMISSION_REQUEST", "TRUSTED_CONTACTS_SELECT_NUMBER_TITLE", "TRUSTED_CONTACTS_NOTIFY_LINK_TITLE", "TRUSTED_CONTACTS_NOTIFY_DESCRIPTION", "TRUSTED_CONTACTS_NOTIFY_DESCRIPTION_NO_TRIP", "TRUSTED_CONTACTS_NOTIFY_LINK_SENDING_TITLE", "TRUSTED_CONTACTS_NOTIFY_SENDING_TITLE", "TRUSTED_CONTACTS_NOTIFY_SENDING_CANCEL", "TRUSTED_CONTACTS_NOTIFY_SENDING_SUCCESS", "TRUSTED_CONTACTS_NOTIFY_SENDING_ERROR", "TRUSTED_CONTACTS_NOTIFY_FRAUDER_SMS_TEMPLATE", "TRUSTED_CONTACTS_NOTIFY_FRAUDER_SMS_TEMPLATE_NO_TRIP", "EMERGENCY_LINK_TITLE", "EMERGENCY_SCREEN_TITLE", "EMERGENCY_SCREEN_DESCRIPTION", "EMERGENCY_SCREEN_LOCATION_TITLE", "EMERGENCY_SCREEN_NOTIFY_CONTACTS_LINK_TITLE", "EMERGENCY_SCREEN_NOTIFY_CONTACTS_MANUALLY_LINK_TITLE", "EMERGENCY_SCREEN_ADD_CONTACTS_LINK_TITLE", "EMERGENCY_SCREEN_CALL_EMERGENCY_LINK_TITLE", "EMERGENCY_TRIGGERED_PUSH_NOTIFICATION", "EMERGENCY_FRAUDER_SMS_TEMPLATE", "EMERGENCY_FRAUDER_SMS_TEMPLATE_NO_TRIP", "CRASH_DETECTION_NOTIFICATION", "CRASH_DETECTION_SCREEN_TITLE", "CRASH_DETECTION_SCREEN_DESCRIPTION", "CRASH_DETECTION_FALSE_POSITIVE_LINK_TITLE", "CRASH_DETECTION_TRUE_POSITIVE_LINK_TITLE", "CRASH_DETECTION_TRUE_POSITIVE_SCREEN_TITLE", "CRASH_DETECTION_REQUEST_NEW_RIDE_LINK_TITLE", "CRASH_DETECTION_NOTIFY_TRUSTED_CONTACTS_FRAUDER_SMS_TEMPLATE", "CRASH_DETECTION_NOTIFY_TRUSTED_CONTACTS_SCREEN_TITLE", "CRASH_DETECTION_NOTIFY_TRUSTED_CONTACTS_DESCRIPTION", "CRASH_DETECTION_NOTIFY_TRUSTED_CONTACTS_CANCEL", "CRASH_DETECTION_NOTIFY_TRUSTED_CONTACTS_SEND", "CRASH_DETECTION_REQUEST_NEW_RIDE_CONFIRM_TITLE", "CRASH_DETECTION_REQUEST_NEW_RIDE_CONFIRM_DESCRIPTION", "CRASH_DETECTION_REQUEST_NEW_RIDE_CONFIRM_YES", "CRASH_DETECTION_REQUEST_NEW_RIDE_CONFIRM_NO", "ERROR_SECTION_NOT_LOADED", "ERROR_TRUSTED_CONTACTS_NOTIFICATION_FAILED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class L10nKey {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ L10nKey[] $VALUES;
        public static final L10nKey CRASH_DETECTION_FALSE_POSITIVE_LINK_TITLE;
        public static final L10nKey CRASH_DETECTION_NOTIFICATION;
        public static final L10nKey CRASH_DETECTION_NOTIFY_TRUSTED_CONTACTS_CANCEL;
        public static final L10nKey CRASH_DETECTION_NOTIFY_TRUSTED_CONTACTS_DESCRIPTION;
        public static final L10nKey CRASH_DETECTION_NOTIFY_TRUSTED_CONTACTS_FRAUDER_SMS_TEMPLATE;
        public static final L10nKey CRASH_DETECTION_NOTIFY_TRUSTED_CONTACTS_SCREEN_TITLE;
        public static final L10nKey CRASH_DETECTION_NOTIFY_TRUSTED_CONTACTS_SEND;
        public static final L10nKey CRASH_DETECTION_REQUEST_NEW_RIDE_CONFIRM_DESCRIPTION;
        public static final L10nKey CRASH_DETECTION_REQUEST_NEW_RIDE_CONFIRM_NO;
        public static final L10nKey CRASH_DETECTION_REQUEST_NEW_RIDE_CONFIRM_TITLE;
        public static final L10nKey CRASH_DETECTION_REQUEST_NEW_RIDE_CONFIRM_YES;
        public static final L10nKey CRASH_DETECTION_REQUEST_NEW_RIDE_LINK_TITLE;
        public static final L10nKey CRASH_DETECTION_SCREEN_DESCRIPTION;
        public static final L10nKey CRASH_DETECTION_SCREEN_TITLE;
        public static final L10nKey CRASH_DETECTION_TRUE_POSITIVE_LINK_TITLE;
        public static final L10nKey CRASH_DETECTION_TRUE_POSITIVE_SCREEN_TITLE;
        public static final L10nKey EMERGENCY_FRAUDER_SMS_TEMPLATE;
        public static final L10nKey EMERGENCY_FRAUDER_SMS_TEMPLATE_NO_TRIP;
        public static final L10nKey EMERGENCY_LINK_TITLE;
        public static final L10nKey EMERGENCY_SCREEN_ADD_CONTACTS_LINK_TITLE;
        public static final L10nKey EMERGENCY_SCREEN_CALL_EMERGENCY_LINK_TITLE;
        public static final L10nKey EMERGENCY_SCREEN_DESCRIPTION;
        public static final L10nKey EMERGENCY_SCREEN_LOCATION_TITLE;
        public static final L10nKey EMERGENCY_SCREEN_NOTIFY_CONTACTS_LINK_TITLE;
        public static final L10nKey EMERGENCY_SCREEN_NOTIFY_CONTACTS_MANUALLY_LINK_TITLE;
        public static final L10nKey EMERGENCY_SCREEN_TITLE;
        public static final L10nKey EMERGENCY_TRIGGERED_PUSH_NOTIFICATION;
        public static final L10nKey ERROR_SECTION_NOT_LOADED;
        public static final L10nKey ERROR_TRUSTED_CONTACTS_NOTIFICATION_FAILED;
        public static final L10nKey INSTRUCTIONS_LINK_TITLE;
        public static final L10nKey INSTRUCTIONS_SCREEN_TITLE;
        public static final L10nKey MAIN_BUTTON_LINK_TITLE;
        public static final L10nKey MAIN_BUTTON_MENU_LINK_TITLE;
        public static final L10nKey MAIN_SCREEN_TITLE;
        public static final L10nKey SHARE_LINK_TITLE;
        public static final L10nKey SHARE_SCREEN_ADD_CONTACTS_LINK_TITLE;
        public static final L10nKey SHARE_SCREEN_FRAUDER_SMS_TEMPLATE;
        public static final L10nKey SHARE_SCREEN_PROMO_ADD_LINK_TITLE;
        public static final L10nKey SHARE_SCREEN_PROMO_DESCRIPTION;
        public static final L10nKey SHARE_SCREEN_PROMO_LATER_LINK_TITLE;
        public static final L10nKey SHARE_SCREEN_PROMO_TITLE;
        public static final L10nKey SHARE_SCREEN_SENDING_CANCEL;
        public static final L10nKey SHARE_SCREEN_SENDING_ERROR;
        public static final L10nKey SHARE_SCREEN_SENDING_SUCCESS;
        public static final L10nKey SHARE_SCREEN_SENDING_TITLE;
        public static final L10nKey SHARE_SCREEN_SEND_OTHER_LINK_TITLE;
        public static final L10nKey SHARE_SCREEN_SEND_OTHER_SMS_TEMPLATE;
        public static final L10nKey SHARE_SCREEN_TITLE;
        public static final L10nKey TRUSTED_CONTACTS_ADD_LINK_TITLE;
        public static final L10nKey TRUSTED_CONTACTS_ADD_MORE_LINK_TITLE;
        public static final L10nKey TRUSTED_CONTACTS_DONE_LINK_TITLE;
        public static final L10nKey TRUSTED_CONTACTS_LINK_TITLE;
        public static final L10nKey TRUSTED_CONTACTS_NOTIFY_DESCRIPTION;
        public static final L10nKey TRUSTED_CONTACTS_NOTIFY_DESCRIPTION_NO_TRIP;
        public static final L10nKey TRUSTED_CONTACTS_NOTIFY_FRAUDER_SMS_TEMPLATE;
        public static final L10nKey TRUSTED_CONTACTS_NOTIFY_FRAUDER_SMS_TEMPLATE_NO_TRIP;
        public static final L10nKey TRUSTED_CONTACTS_NOTIFY_LINK_SENDING_TITLE;
        public static final L10nKey TRUSTED_CONTACTS_NOTIFY_LINK_TITLE;
        public static final L10nKey TRUSTED_CONTACTS_NOTIFY_SENDING_CANCEL;
        public static final L10nKey TRUSTED_CONTACTS_NOTIFY_SENDING_ERROR;
        public static final L10nKey TRUSTED_CONTACTS_NOTIFY_SENDING_SUCCESS;
        public static final L10nKey TRUSTED_CONTACTS_NOTIFY_SENDING_TITLE;
        public static final L10nKey TRUSTED_CONTACTS_PERMISSION_REQUEST;
        public static final L10nKey TRUSTED_CONTACTS_SCREEN_DESCRIPTION;
        public static final L10nKey TRUSTED_CONTACTS_SCREEN_TITLE;
        public static final L10nKey TRUSTED_CONTACTS_SELECT_NUMBER_TITLE;
        public static final L10nKey TRUSTED_CONTACTS_SELECT_SCREEN_ADD_LINK_TITLE;
        public static final L10nKey TRUSTED_CONTACTS_SELECT_SCREEN_SEARCH_PLACEHOLDER;
        public static final L10nKey TRUSTED_CONTACTS_SELECT_SCREEN_TITLE;
        private final String key;
        private final boolean template;

        static {
            L10nKey l10nKey = new L10nKey("MAIN_BUTTON_LINK_TITLE", 0, "sc_main_button_link_title", false);
            MAIN_BUTTON_LINK_TITLE = l10nKey;
            L10nKey l10nKey2 = new L10nKey("MAIN_BUTTON_MENU_LINK_TITLE", 1, "sc_main_button_menu_link_title", false);
            MAIN_BUTTON_MENU_LINK_TITLE = l10nKey2;
            L10nKey l10nKey3 = new L10nKey("MAIN_SCREEN_TITLE", 2, "sc_main_screen_title", false);
            MAIN_SCREEN_TITLE = l10nKey3;
            L10nKey l10nKey4 = new L10nKey("INSTRUCTIONS_LINK_TITLE", 3, "sc_instructions_link_title", false);
            INSTRUCTIONS_LINK_TITLE = l10nKey4;
            L10nKey l10nKey5 = new L10nKey("INSTRUCTIONS_SCREEN_TITLE", 4, "sc_instructions_screen_title", false);
            INSTRUCTIONS_SCREEN_TITLE = l10nKey5;
            L10nKey l10nKey6 = new L10nKey("SHARE_LINK_TITLE", 5, "sc_share_link_title", false);
            SHARE_LINK_TITLE = l10nKey6;
            L10nKey l10nKey7 = new L10nKey("SHARE_SCREEN_TITLE", 6, "sc_share_screen_title", false);
            SHARE_SCREEN_TITLE = l10nKey7;
            L10nKey l10nKey8 = new L10nKey("SHARE_SCREEN_ADD_CONTACTS_LINK_TITLE", 7, "sc_share_screen_add_contacts_link_title", false);
            SHARE_SCREEN_ADD_CONTACTS_LINK_TITLE = l10nKey8;
            L10nKey l10nKey9 = new L10nKey("SHARE_SCREEN_SEND_OTHER_LINK_TITLE", 8, "sc_share_screen_send_other_link_title", false);
            SHARE_SCREEN_SEND_OTHER_LINK_TITLE = l10nKey9;
            L10nKey l10nKey10 = new L10nKey("SHARE_SCREEN_SEND_OTHER_SMS_TEMPLATE", 9, "sc_share_screen_send_other_sms_template", false);
            SHARE_SCREEN_SEND_OTHER_SMS_TEMPLATE = l10nKey10;
            L10nKey l10nKey11 = new L10nKey("SHARE_SCREEN_SENDING_TITLE", 10, "sc_share_screen_sending_title", false);
            SHARE_SCREEN_SENDING_TITLE = l10nKey11;
            L10nKey l10nKey12 = new L10nKey("SHARE_SCREEN_SENDING_CANCEL", 11, "sc_share_screen_sending_cancel", false);
            SHARE_SCREEN_SENDING_CANCEL = l10nKey12;
            L10nKey l10nKey13 = new L10nKey("SHARE_SCREEN_SENDING_SUCCESS", 12, "sc_share_screen_sending_success", false);
            SHARE_SCREEN_SENDING_SUCCESS = l10nKey13;
            L10nKey l10nKey14 = new L10nKey("SHARE_SCREEN_SENDING_ERROR", 13, "sc_share_screen_sending_error", false);
            SHARE_SCREEN_SENDING_ERROR = l10nKey14;
            L10nKey l10nKey15 = new L10nKey("SHARE_SCREEN_FRAUDER_SMS_TEMPLATE", 14, "sc_share_screen_frauder_sms_template", false);
            SHARE_SCREEN_FRAUDER_SMS_TEMPLATE = l10nKey15;
            L10nKey l10nKey16 = new L10nKey("SHARE_SCREEN_PROMO_TITLE", 15, "sc_share_screen_promo_title", false);
            SHARE_SCREEN_PROMO_TITLE = l10nKey16;
            L10nKey l10nKey17 = new L10nKey("SHARE_SCREEN_PROMO_DESCRIPTION", 16, "sc_share_screen_promo_description", false);
            SHARE_SCREEN_PROMO_DESCRIPTION = l10nKey17;
            L10nKey l10nKey18 = new L10nKey("SHARE_SCREEN_PROMO_ADD_LINK_TITLE", 17, "sc_share_screen_promo_add_link_title", false);
            SHARE_SCREEN_PROMO_ADD_LINK_TITLE = l10nKey18;
            L10nKey l10nKey19 = new L10nKey("SHARE_SCREEN_PROMO_LATER_LINK_TITLE", 18, "sc_share_screen_promo_later_link_title", false);
            SHARE_SCREEN_PROMO_LATER_LINK_TITLE = l10nKey19;
            L10nKey l10nKey20 = new L10nKey("TRUSTED_CONTACTS_LINK_TITLE", 19, "sc_trusted_contacts_link_title", false);
            TRUSTED_CONTACTS_LINK_TITLE = l10nKey20;
            L10nKey l10nKey21 = new L10nKey("TRUSTED_CONTACTS_SCREEN_TITLE", 20, "sc_trusted_contacts_screen_title", false);
            TRUSTED_CONTACTS_SCREEN_TITLE = l10nKey21;
            L10nKey l10nKey22 = new L10nKey("TRUSTED_CONTACTS_SCREEN_DESCRIPTION", 21, "sc_trusted_contacts_screen_description", false);
            TRUSTED_CONTACTS_SCREEN_DESCRIPTION = l10nKey22;
            L10nKey l10nKey23 = new L10nKey("TRUSTED_CONTACTS_ADD_LINK_TITLE", 22, "sc_trusted_contacts_add_link_title", false);
            TRUSTED_CONTACTS_ADD_LINK_TITLE = l10nKey23;
            L10nKey l10nKey24 = new L10nKey("TRUSTED_CONTACTS_ADD_MORE_LINK_TITLE", 23, "sc_trusted_contacts_add_more_link_title", false);
            TRUSTED_CONTACTS_ADD_MORE_LINK_TITLE = l10nKey24;
            L10nKey l10nKey25 = new L10nKey("TRUSTED_CONTACTS_DONE_LINK_TITLE", 24, "sc_trusted_contacts_done_link_title", false);
            TRUSTED_CONTACTS_DONE_LINK_TITLE = l10nKey25;
            L10nKey l10nKey26 = new L10nKey("TRUSTED_CONTACTS_SELECT_SCREEN_TITLE", 25, "sc_trusted_contacts_select_screen_title", false);
            TRUSTED_CONTACTS_SELECT_SCREEN_TITLE = l10nKey26;
            L10nKey l10nKey27 = new L10nKey("TRUSTED_CONTACTS_SELECT_SCREEN_SEARCH_PLACEHOLDER", 26, "sc_trusted_contacts_select_screen_search_placeholder", false);
            TRUSTED_CONTACTS_SELECT_SCREEN_SEARCH_PLACEHOLDER = l10nKey27;
            L10nKey l10nKey28 = new L10nKey("TRUSTED_CONTACTS_SELECT_SCREEN_ADD_LINK_TITLE", 27, "sc_trusted_contacts_select_screen_add_link_title", false);
            TRUSTED_CONTACTS_SELECT_SCREEN_ADD_LINK_TITLE = l10nKey28;
            L10nKey l10nKey29 = new L10nKey("TRUSTED_CONTACTS_PERMISSION_REQUEST", 28, "sc_trusted_contacts_permission_request", false);
            TRUSTED_CONTACTS_PERMISSION_REQUEST = l10nKey29;
            L10nKey l10nKey30 = new L10nKey("TRUSTED_CONTACTS_SELECT_NUMBER_TITLE", 29, "sc_trusted_contacts_select_number_title", false);
            TRUSTED_CONTACTS_SELECT_NUMBER_TITLE = l10nKey30;
            L10nKey l10nKey31 = new L10nKey("TRUSTED_CONTACTS_NOTIFY_LINK_TITLE", 30, "sc_trusted_contacts_notify_link_title", false);
            TRUSTED_CONTACTS_NOTIFY_LINK_TITLE = l10nKey31;
            L10nKey l10nKey32 = new L10nKey("TRUSTED_CONTACTS_NOTIFY_DESCRIPTION", 31, "sc_trusted_contacts_notify_description", false);
            TRUSTED_CONTACTS_NOTIFY_DESCRIPTION = l10nKey32;
            L10nKey l10nKey33 = new L10nKey("TRUSTED_CONTACTS_NOTIFY_DESCRIPTION_NO_TRIP", 32, "sc_trusted_contacts_notify_description_no_trip", false);
            TRUSTED_CONTACTS_NOTIFY_DESCRIPTION_NO_TRIP = l10nKey33;
            L10nKey l10nKey34 = new L10nKey("TRUSTED_CONTACTS_NOTIFY_LINK_SENDING_TITLE", 33, "sc_trusted_contacts_notify_link_sending_title", false);
            TRUSTED_CONTACTS_NOTIFY_LINK_SENDING_TITLE = l10nKey34;
            L10nKey l10nKey35 = new L10nKey("TRUSTED_CONTACTS_NOTIFY_SENDING_TITLE", 34, "sc_trusted_contacts_notify_sending_title", false);
            TRUSTED_CONTACTS_NOTIFY_SENDING_TITLE = l10nKey35;
            L10nKey l10nKey36 = new L10nKey("TRUSTED_CONTACTS_NOTIFY_SENDING_CANCEL", 35, "sc_trusted_contacts_notify_sending_cancel", false);
            TRUSTED_CONTACTS_NOTIFY_SENDING_CANCEL = l10nKey36;
            L10nKey l10nKey37 = new L10nKey("TRUSTED_CONTACTS_NOTIFY_SENDING_SUCCESS", 36, "sc_trusted_contacts_notify_sending_success", false);
            TRUSTED_CONTACTS_NOTIFY_SENDING_SUCCESS = l10nKey37;
            L10nKey l10nKey38 = new L10nKey("TRUSTED_CONTACTS_NOTIFY_SENDING_ERROR", 37, "sc_trusted_contacts_notify_sending_error", false);
            TRUSTED_CONTACTS_NOTIFY_SENDING_ERROR = l10nKey38;
            L10nKey l10nKey39 = new L10nKey("TRUSTED_CONTACTS_NOTIFY_FRAUDER_SMS_TEMPLATE", 38, "sc_trusted_contacts_notify_frauder_sms_template", false);
            TRUSTED_CONTACTS_NOTIFY_FRAUDER_SMS_TEMPLATE = l10nKey39;
            L10nKey l10nKey40 = new L10nKey("TRUSTED_CONTACTS_NOTIFY_FRAUDER_SMS_TEMPLATE_NO_TRIP", 39, "sc_trusted_contacts_notify_frauder_sms_template_no_trip", false);
            TRUSTED_CONTACTS_NOTIFY_FRAUDER_SMS_TEMPLATE_NO_TRIP = l10nKey40;
            L10nKey l10nKey41 = new L10nKey("EMERGENCY_LINK_TITLE", 40, "sc_emergency_link_title_tmpl", true);
            EMERGENCY_LINK_TITLE = l10nKey41;
            L10nKey l10nKey42 = new L10nKey("EMERGENCY_SCREEN_TITLE", 41, "sc_emergency_screen_title_tmpl", true);
            EMERGENCY_SCREEN_TITLE = l10nKey42;
            L10nKey l10nKey43 = new L10nKey("EMERGENCY_SCREEN_DESCRIPTION", 42, "sc_emergency_screen_description", false);
            EMERGENCY_SCREEN_DESCRIPTION = l10nKey43;
            L10nKey l10nKey44 = new L10nKey("EMERGENCY_SCREEN_LOCATION_TITLE", 43, "sc_emergency_screen_location_title", false);
            EMERGENCY_SCREEN_LOCATION_TITLE = l10nKey44;
            L10nKey l10nKey45 = new L10nKey("EMERGENCY_SCREEN_NOTIFY_CONTACTS_LINK_TITLE", 44, "sc_emergency_screen_notify_contacts_link_title", false);
            EMERGENCY_SCREEN_NOTIFY_CONTACTS_LINK_TITLE = l10nKey45;
            L10nKey l10nKey46 = new L10nKey("EMERGENCY_SCREEN_NOTIFY_CONTACTS_MANUALLY_LINK_TITLE", 45, "sc_emergency_screen_notify_contacts_manually_link_title", false);
            EMERGENCY_SCREEN_NOTIFY_CONTACTS_MANUALLY_LINK_TITLE = l10nKey46;
            L10nKey l10nKey47 = new L10nKey("EMERGENCY_SCREEN_ADD_CONTACTS_LINK_TITLE", 46, "sc_emergency_screen_add_contacts_link_title", false);
            EMERGENCY_SCREEN_ADD_CONTACTS_LINK_TITLE = l10nKey47;
            L10nKey l10nKey48 = new L10nKey("EMERGENCY_SCREEN_CALL_EMERGENCY_LINK_TITLE", 47, "sc_emergency_screen_call_emergency_link_title", false);
            EMERGENCY_SCREEN_CALL_EMERGENCY_LINK_TITLE = l10nKey48;
            L10nKey l10nKey49 = new L10nKey("EMERGENCY_TRIGGERED_PUSH_NOTIFICATION", 48, "sc_emergency_triggered_push_notification", false);
            EMERGENCY_TRIGGERED_PUSH_NOTIFICATION = l10nKey49;
            L10nKey l10nKey50 = new L10nKey("EMERGENCY_FRAUDER_SMS_TEMPLATE", 49, "sc_emergency_frauder_sms_template", false);
            EMERGENCY_FRAUDER_SMS_TEMPLATE = l10nKey50;
            L10nKey l10nKey51 = new L10nKey("EMERGENCY_FRAUDER_SMS_TEMPLATE_NO_TRIP", 50, "sc_emergency_frauder_sms_template_no_trip", false);
            EMERGENCY_FRAUDER_SMS_TEMPLATE_NO_TRIP = l10nKey51;
            L10nKey l10nKey52 = new L10nKey("CRASH_DETECTION_NOTIFICATION", 51, "sc_crash_detection_notification", false);
            CRASH_DETECTION_NOTIFICATION = l10nKey52;
            L10nKey l10nKey53 = new L10nKey("CRASH_DETECTION_SCREEN_TITLE", 52, "sc_crash_detection_screen_title", false);
            CRASH_DETECTION_SCREEN_TITLE = l10nKey53;
            L10nKey l10nKey54 = new L10nKey("CRASH_DETECTION_SCREEN_DESCRIPTION", 53, "sc_crash_detection_screen_description", false);
            CRASH_DETECTION_SCREEN_DESCRIPTION = l10nKey54;
            L10nKey l10nKey55 = new L10nKey("CRASH_DETECTION_FALSE_POSITIVE_LINK_TITLE", 54, "sc_crash_detection_false_positive_link_title", false);
            CRASH_DETECTION_FALSE_POSITIVE_LINK_TITLE = l10nKey55;
            L10nKey l10nKey56 = new L10nKey("CRASH_DETECTION_TRUE_POSITIVE_LINK_TITLE", 55, "sc_crash_detection_true_positive_link_title", false);
            CRASH_DETECTION_TRUE_POSITIVE_LINK_TITLE = l10nKey56;
            L10nKey l10nKey57 = new L10nKey("CRASH_DETECTION_TRUE_POSITIVE_SCREEN_TITLE", 56, "sc_crash_detection_true_positive_screen_title", false);
            CRASH_DETECTION_TRUE_POSITIVE_SCREEN_TITLE = l10nKey57;
            L10nKey l10nKey58 = new L10nKey("CRASH_DETECTION_REQUEST_NEW_RIDE_LINK_TITLE", 57, "sc_crash_detection_request_new_ride_link_title", false);
            CRASH_DETECTION_REQUEST_NEW_RIDE_LINK_TITLE = l10nKey58;
            L10nKey l10nKey59 = new L10nKey("CRASH_DETECTION_NOTIFY_TRUSTED_CONTACTS_FRAUDER_SMS_TEMPLATE", 58, "sc_crash_detection_notify_trusted_contacts_frauder_sms_template", false);
            CRASH_DETECTION_NOTIFY_TRUSTED_CONTACTS_FRAUDER_SMS_TEMPLATE = l10nKey59;
            L10nKey l10nKey60 = new L10nKey("CRASH_DETECTION_NOTIFY_TRUSTED_CONTACTS_SCREEN_TITLE", 59, "sc_crash_detection_notify_trusted_contacts_screen_title", false);
            CRASH_DETECTION_NOTIFY_TRUSTED_CONTACTS_SCREEN_TITLE = l10nKey60;
            L10nKey l10nKey61 = new L10nKey("CRASH_DETECTION_NOTIFY_TRUSTED_CONTACTS_DESCRIPTION", 60, "sc_crash_detection_notify_trusted_contacts_description", false);
            CRASH_DETECTION_NOTIFY_TRUSTED_CONTACTS_DESCRIPTION = l10nKey61;
            L10nKey l10nKey62 = new L10nKey("CRASH_DETECTION_NOTIFY_TRUSTED_CONTACTS_CANCEL", 61, "sc_crash_detection_notify_trusted_contacts_cancel", false);
            CRASH_DETECTION_NOTIFY_TRUSTED_CONTACTS_CANCEL = l10nKey62;
            L10nKey l10nKey63 = new L10nKey("CRASH_DETECTION_NOTIFY_TRUSTED_CONTACTS_SEND", 62, "sc_crash_detection_notify_trusted_contacts_send", false);
            CRASH_DETECTION_NOTIFY_TRUSTED_CONTACTS_SEND = l10nKey63;
            L10nKey l10nKey64 = new L10nKey("CRASH_DETECTION_REQUEST_NEW_RIDE_CONFIRM_TITLE", 63, "sc_crash_detection_request_new_ride_confirm_title", false);
            CRASH_DETECTION_REQUEST_NEW_RIDE_CONFIRM_TITLE = l10nKey64;
            L10nKey l10nKey65 = new L10nKey("CRASH_DETECTION_REQUEST_NEW_RIDE_CONFIRM_DESCRIPTION", 64, "sc_crash_detection_request_new_ride_confirm_description", false);
            CRASH_DETECTION_REQUEST_NEW_RIDE_CONFIRM_DESCRIPTION = l10nKey65;
            L10nKey l10nKey66 = new L10nKey("CRASH_DETECTION_REQUEST_NEW_RIDE_CONFIRM_YES", 65, "sc_crash_detection_request_new_ride_confirm_yes", false);
            CRASH_DETECTION_REQUEST_NEW_RIDE_CONFIRM_YES = l10nKey66;
            L10nKey l10nKey67 = new L10nKey("CRASH_DETECTION_REQUEST_NEW_RIDE_CONFIRM_NO", 66, "sc_crash_detection_request_new_ride_confirm_no", false);
            CRASH_DETECTION_REQUEST_NEW_RIDE_CONFIRM_NO = l10nKey67;
            L10nKey l10nKey68 = new L10nKey("ERROR_SECTION_NOT_LOADED", 67, "sc_error_section_not_loaded", false);
            ERROR_SECTION_NOT_LOADED = l10nKey68;
            L10nKey l10nKey69 = new L10nKey("ERROR_TRUSTED_CONTACTS_NOTIFICATION_FAILED", 68, "sc_error_trusted_contacts_notification_failed", false);
            ERROR_TRUSTED_CONTACTS_NOTIFICATION_FAILED = l10nKey69;
            L10nKey[] l10nKeyArr = {l10nKey, l10nKey2, l10nKey3, l10nKey4, l10nKey5, l10nKey6, l10nKey7, l10nKey8, l10nKey9, l10nKey10, l10nKey11, l10nKey12, l10nKey13, l10nKey14, l10nKey15, l10nKey16, l10nKey17, l10nKey18, l10nKey19, l10nKey20, l10nKey21, l10nKey22, l10nKey23, l10nKey24, l10nKey25, l10nKey26, l10nKey27, l10nKey28, l10nKey29, l10nKey30, l10nKey31, l10nKey32, l10nKey33, l10nKey34, l10nKey35, l10nKey36, l10nKey37, l10nKey38, l10nKey39, l10nKey40, l10nKey41, l10nKey42, l10nKey43, l10nKey44, l10nKey45, l10nKey46, l10nKey47, l10nKey48, l10nKey49, l10nKey50, l10nKey51, l10nKey52, l10nKey53, l10nKey54, l10nKey55, l10nKey56, l10nKey57, l10nKey58, l10nKey59, l10nKey60, l10nKey61, l10nKey62, l10nKey63, l10nKey64, l10nKey65, l10nKey66, l10nKey67, l10nKey68, l10nKey69};
            $VALUES = l10nKeyArr;
            $ENTRIES = kotlin.enums.a.a(l10nKeyArr);
        }

        public L10nKey(String str, int i, String str2, boolean z) {
            this.key = str2;
            this.template = z;
        }

        public static L10nKey valueOf(String str) {
            return (L10nKey) Enum.valueOf(L10nKey.class, str);
        }

        public static L10nKey[] values() {
            return (L10nKey[]) $VALUES.clone();
        }

        /* renamed from: a, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getTemplate() {
            return this.template;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment$L10nTemplateParam;", "", "PHONE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class L10nTemplateParam {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ L10nTemplateParam[] $VALUES;
        public static final L10nTemplateParam PHONE;

        static {
            L10nTemplateParam l10nTemplateParam = new L10nTemplateParam("PHONE", 0);
            PHONE = l10nTemplateParam;
            L10nTemplateParam[] l10nTemplateParamArr = {l10nTemplateParam};
            $VALUES = l10nTemplateParamArr;
            $ENTRIES = kotlin.enums.a.a(l10nTemplateParamArr);
        }

        public static L10nTemplateParam valueOf(String str) {
            return (L10nTemplateParam) Enum.valueOf(L10nTemplateParam.class, str);
        }

        public static L10nTemplateParam[] values() {
            return (L10nTemplateParam[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment$Strategy;", "", "Companion", "com/yandex/go/safety/center/experiment/m", "ALWAYS", "NEVER", "ONLY_WITH_TRUSTED_CONTACTS", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Strategy {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Strategy[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Strategy ALWAYS;
        public static final m Companion;
        public static final Strategy NEVER;
        public static final Strategy ONLY_WITH_TRUSTED_CONTACTS;
        public static final Strategy UNKNOWN;

        static {
            Strategy strategy = new Strategy("ALWAYS", 0);
            ALWAYS = strategy;
            Strategy strategy2 = new Strategy("NEVER", 1);
            NEVER = strategy2;
            Strategy strategy3 = new Strategy("ONLY_WITH_TRUSTED_CONTACTS", 2);
            ONLY_WITH_TRUSTED_CONTACTS = strategy3;
            Strategy strategy4 = new Strategy("UNKNOWN", 3);
            UNKNOWN = strategy4;
            Strategy[] strategyArr = {strategy, strategy2, strategy3, strategy4};
            $VALUES = strategyArr;
            $ENTRIES = kotlin.enums.a.a(strategyArr);
            Companion = new m();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jrl0(1));
        }

        public static Strategy valueOf(String str) {
            return (Strategy) Enum.valueOf(Strategy.class, str);
        }

        public static Strategy[] values() {
            return (Strategy[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        s = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new ibl0(15)), kotlin.a.b(lazyThreadSafetyMode, new ibl0(16)), null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new ibl0(17)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new ibl0(18)), null, null};
        t = scc.g(new SafetyCenterButton(ButtonType.SHARE_ROUTE), new SafetyCenterButton(ButtonType.EMERGENCY), new SafetyCenterButton(ButtonType.FAQ), new SafetyCenterButton(ButtonType.CONTACTS));
        u = new SafetyCenterExperiment(0);
    }

    public /* synthetic */ SafetyCenterExperiment(int i, boolean z, Map map, jsq0 jsq0Var, EmergencyTicket emergencyTicket, CrashDetection crashDetection, Fallback fallback, String str, String str2, List list, InstructionsWebViewConfig instructionsWebViewConfig, int i2, int i3, List list2, String str3, SafetyCenterWebConfig safetyCenterWebConfig) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = ksq0.a;
        } else {
            this.d = jsq0Var;
        }
        if ((i & 8) == 0) {
            this.e = new EmergencyTicket(0);
        } else {
            this.e = emergencyTicket;
        }
        if ((i & 16) == 0) {
            this.f = new CrashDetection(0);
        } else {
            this.f = crashDetection;
        }
        if ((i & 32) == 0) {
            this.g = new Fallback(0);
        } else {
            this.g = fallback;
        }
        if ((i & 64) == 0) {
            this.h = null;
        } else {
            this.h = str;
        }
        if ((i & 128) == 0) {
            this.i = null;
        } else {
            this.i = str2;
        }
        if ((i & 256) == 0) {
            this.j = EmptyList.a;
        } else {
            this.j = list;
        }
        if ((i & 512) == 0) {
            this.k = InstructionsWebViewConfig.b;
        } else {
            this.k = instructionsWebViewConfig;
        }
        if ((i & 1024) == 0) {
            this.l = 0;
        } else {
            this.l = i2;
        }
        if ((i & 2048) == 0) {
            this.m = 0;
        } else {
            this.m = i3;
        }
        this.n = (i & 4096) == 0 ? t : list2;
        this.o = (i & 8192) == 0 ? "" : str3;
        if ((i & 16384) == 0) {
            this.p = null;
        } else {
            this.p = safetyCenterWebConfig;
        }
        this.q = new EnumMap(L10nTemplateParam.class);
        this.r = null;
    }

    public final String a(L10nKey l10nKey) {
        String Y = d6z.Y(this, l10nKey.getKey());
        return l10nKey.getTemplate() ? String.format(Y, Arrays.copyOf(new Object[]{(String) this.q.get(L10nTemplateParam.PHONE)}, 1)) : Y;
    }

    public final boolean b() {
        if (!this.b) {
            return false;
        }
        if (this.r == null) {
            for (L10nKey l10nKey : L10nKey.values()) {
                if (d6z.Y(this, l10nKey.getKey()).length() == 0) {
                    this.r = Boolean.FALSE;
                    jst.e.j(new IllegalStateException(oyr.p("L10n field ", l10nKey.getKey(), " is empty. Safety center disabled.")));
                }
            }
            if (this.r == null) {
                this.r = Boolean.TRUE;
            }
        }
        return this.r.booleanValue();
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment$Fallback;", "", "Companion", "$serializer", "com/yandex/go/safety/center/experiment/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Fallback {
        public static final i Companion = new i();
        public final String a;

        public /* synthetic */ Fallback(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public Fallback(int i) {
            this.a = "";
        }

        public Fallback() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment$InstructionsWebViewConfig;", "", "Companion", "com/yandex/go/safety/center/experiment/k", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class InstructionsWebViewConfig {
        public static final k Companion = new k();
        public static final InstructionsWebViewConfig b = new InstructionsWebViewConfig(0);
        public final String a;

        public /* synthetic */ InstructionsWebViewConfig(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public InstructionsWebViewConfig(int i) {
            this.a = "";
        }

        public InstructionsWebViewConfig() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment$SafetyCenterButton;", "", "Companion", "$serializer", "com/yandex/go/safety/center/experiment/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SafetyCenterButton {
        public static final l Companion = new l();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jrl0(0)), null};
        public final ButtonType a;
        public final String b;

        public /* synthetic */ SafetyCenterButton(int i, ButtonType buttonType, String str) {
            this.a = (i & 1) == 0 ? null : buttonType;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
        }

        public SafetyCenterButton(ButtonType buttonType) {
            this.a = buttonType;
            this.b = "";
        }

        public SafetyCenterButton() {
            this(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment$CrashDetection;", "", "Companion", "$serializer", "com/yandex/go/safety/center/experiment/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CrashDetection {
        public static final g Companion = new g();
        public final boolean a;
        public final boolean b;
        public final int c;

        public /* synthetic */ CrashDetection(int i, int i2, boolean z, boolean z2) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z2;
            }
            if ((i & 4) == 0) {
                this.c = 0;
            } else {
                this.c = i2;
            }
        }

        public CrashDetection(int i) {
            this.a = false;
            this.b = false;
            this.c = 0;
        }

        public CrashDetection() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment$EmergencyTicket;", "", "Companion", "$serializer", "com/yandex/go/safety/center/experiment/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class EmergencyTicket {
        public static final h Companion = new h();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ibl0(27))};
        public final int a;
        public final int b;
        public final Strategy c;

        public /* synthetic */ EmergencyTicket(int i, int i2, int i3, Strategy strategy) {
            if ((i & 1) == 0) {
                this.a = 0;
            } else {
                this.a = i2;
            }
            if ((i & 2) == 0) {
                this.b = 0;
            } else {
                this.b = i3;
            }
            if ((i & 4) == 0) {
                this.c = Strategy.UNKNOWN;
            } else {
                this.c = strategy;
            }
        }

        public EmergencyTicket() {
            this(0);
        }

        public EmergencyTicket(int i) {
            Strategy strategy = Strategy.UNKNOWN;
            this.a = 0;
            this.b = 0;
            this.c = strategy;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment$Button;", "", "Companion", "$serializer", "com/yandex/go/safety/center/experiment/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Button {
        public static final b Companion = new b();
        public static final i3y[] f;
        public final String a;
        public final ButtonStyle b;
        public final Action c;
        public final Map d;
        public final Map e;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            f = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new ibl0(20)), kotlin.a.b(lazyThreadSafetyMode, new ibl0(21)), kotlin.a.b(lazyThreadSafetyMode, new ibl0(22)), kotlin.a.b(lazyThreadSafetyMode, new ibl0(23))};
        }

        public /* synthetic */ Button(int i, String str, ButtonStyle buttonStyle, Action action, Map map, Map map2) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = ButtonStyle.GRAY;
            } else {
                this.b = buttonStyle;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = action;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = map;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = map2;
            }
        }

        public Button() {
            ButtonStyle buttonStyle = ButtonStyle.GRAY;
            this.a = "";
            this.b = buttonStyle;
            this.c = null;
            this.d = null;
            this.e = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment$Instruction;", "Lav31;", "Companion", "$serializer", "com/yandex/go/safety/center/experiment/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static class Instruction implements av31 {
        public static final j Companion = new j();
        public static final i3y[] h;
        public final String a;
        public final String b;
        public final String c;
        public final boolean d;
        public final String e;
        public final List f;
        public final List g;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            h = new i3y[]{null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new ibl0(28)), kotlin.a.b(lazyThreadSafetyMode, new ibl0(29))};
        }

        public /* synthetic */ Instruction(int i, String str, String str2, String str3, boolean z, String str4, List list, List list2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = false;
            } else {
                this.d = z;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str4;
            }
            int i2 = i & 32;
            EmptyList emptyList = EmptyList.a;
            if (i2 == 0) {
                this.f = emptyList;
            } else {
                this.f = list;
            }
            if ((i & 64) == 0) {
                this.g = emptyList;
            } else {
                this.g = list2;
            }
        }

        public Instruction(String str, String str2, String str3, List list, List list2, boolean z) {
            this.a = "car_crash";
            this.b = str;
            this.c = str2;
            this.d = z;
            this.e = str3;
            this.f = list;
            this.g = list2;
        }
    }

    public SafetyCenterExperiment() {
        this(0);
    }

    public SafetyCenterExperiment(int i) {
        Map f = kotlin.collections.b.f();
        jsq0 jsq0Var = ksq0.a;
        EmergencyTicket emergencyTicket = new EmergencyTicket(0);
        CrashDetection crashDetection = new CrashDetection(0);
        Fallback fallback = new Fallback(0);
        this.b = false;
        this.c = f;
        this.d = jsq0Var;
        this.e = emergencyTicket;
        this.f = crashDetection;
        this.g = fallback;
        this.h = null;
        this.i = null;
        this.j = EmptyList.a;
        this.k = InstructionsWebViewConfig.b;
        this.l = 0;
        this.m = 0;
        this.n = t;
        this.o = "";
        this.p = null;
        this.q = new EnumMap(L10nTemplateParam.class);
    }
}
