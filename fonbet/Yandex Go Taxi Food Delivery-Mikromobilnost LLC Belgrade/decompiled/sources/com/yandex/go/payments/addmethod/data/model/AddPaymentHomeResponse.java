package com.yandex.go.payments.addmethod.data.model;

import defpackage.c20;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oo31;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u001a\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse;", "", "Companion", "BindDialog", "HomeToolbar", "com/yandex/go/payments/addmethod/data/model/s", "TrailButtonLink", "InputField", "Validation", "PhoneFormat", "LengthRestrictions", "ActionButton", "HomeActionButtonState", "HomeStateCondition", "com/yandex/go/payments/addmethod/data/model/c", "CloseAction", "StartBindingAction", "OpenLinkAction", "OpenBindUrlAction", "CloseFlowAndOpenBindUrlAction", "DeeplinkAction", "Footer", "PrerequisiteScreen", "HomeInfoScreen", "DisplayType", "FieldType", "ButtonState", "$serializer", "com/yandex/go/payments/addmethod/data/model/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddPaymentHomeResponse {
    public static final i Companion = new i();
    public final BindDialog a;
    public final PrerequisiteScreen b;
    public final HomeInfoScreen c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$ButtonState;", "", "Companion", "com/yandex/go/payments/addmethod/data/model/f", "ENABLED", "DISABLED", "BUSY", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ButtonState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ButtonState[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final ButtonState BUSY;
        public static final f Companion;
        public static final ButtonState DISABLED;
        public static final ButtonState ENABLED;

        static {
            ButtonState buttonState = new ButtonState("ENABLED", 0);
            ENABLED = buttonState;
            ButtonState buttonState2 = new ButtonState("DISABLED", 1);
            DISABLED = buttonState2;
            ButtonState buttonState3 = new ButtonState("BUSY", 2);
            BUSY = buttonState3;
            ButtonState[] buttonStateArr = {buttonState, buttonState2, buttonState3};
            $VALUES = buttonStateArr;
            $ENTRIES = kotlin.enums.a.a(buttonStateArr);
            Companion = new f();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c20(11));
        }

        public static ButtonState valueOf(String str) {
            return (ButtonState) Enum.valueOf(ButtonState.class, str);
        }

        public static ButtonState[] values() {
            return (ButtonState[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$CloseAction;", "Lcom/yandex/go/payments/addmethod/data/model/c;", "<init>", "()V", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CloseAction extends c {
        public static final g Companion = new g();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$CloseFlowAndOpenBindUrlAction;", "Lcom/yandex/go/payments/addmethod/data/model/c;", "<init>", "()V", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CloseFlowAndOpenBindUrlAction extends c {
        public static final h Companion = new h();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$DisplayType;", "", "Companion", "com/yandex/go/payments/addmethod/data/model/k", "BOTTOM", "FULLSCREEN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class DisplayType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ DisplayType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final DisplayType BOTTOM;
        public static final k Companion;
        public static final DisplayType FULLSCREEN;

        static {
            DisplayType displayType = new DisplayType("BOTTOM", 0);
            BOTTOM = displayType;
            DisplayType displayType2 = new DisplayType("FULLSCREEN", 1);
            FULLSCREEN = displayType2;
            DisplayType[] displayTypeArr = {displayType, displayType2};
            $VALUES = displayTypeArr;
            $ENTRIES = kotlin.enums.a.a(displayTypeArr);
            Companion = new k();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c20(12));
        }

        public static DisplayType valueOf(String str) {
            return (DisplayType) Enum.valueOf(DisplayType.class, str);
        }

        public static DisplayType[] values() {
            return (DisplayType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$FieldType;", "", "Companion", "com/yandex/go/payments/addmethod/data/model/l", "PHONE_NUMBER", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class FieldType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ FieldType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final l Companion;
        public static final FieldType PHONE_NUMBER;

        static {
            FieldType fieldType = new FieldType("PHONE_NUMBER", 0);
            PHONE_NUMBER = fieldType;
            FieldType[] fieldTypeArr = {fieldType};
            $VALUES = fieldTypeArr;
            $ENTRIES = kotlin.enums.a.a(fieldTypeArr);
            Companion = new l();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c20(13));
        }

        public static FieldType valueOf(String str) {
            return (FieldType) Enum.valueOf(FieldType.class, str);
        }

        public static FieldType[] values() {
            return (FieldType[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$OpenBindUrlAction;", "Lcom/yandex/go/payments/addmethod/data/model/c;", "<init>", "()V", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/v", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class OpenBindUrlAction extends c {
        public static final v Companion = new v();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$StartBindingAction;", "Lcom/yandex/go/payments/addmethod/data/model/c;", "<init>", "()V", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class StartBindingAction extends c {
        public static final z Companion = new z();
    }

    public /* synthetic */ AddPaymentHomeResponse(int i, BindDialog bindDialog, PrerequisiteScreen prerequisiteScreen, HomeInfoScreen homeInfoScreen) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bindDialog;
        }
        if ((i & 2) == 0) {
            this.b = new PrerequisiteScreen(0);
        } else {
            this.b = prerequisiteScreen;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = homeInfoScreen;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$DeeplinkAction;", "Lcom/yandex/go/payments/addmethod/data/model/c;", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class DeeplinkAction extends c {
        public static final j Companion = new j();
        public final String a;

        public DeeplinkAction(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public DeeplinkAction() {
            this.a = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$OpenLinkAction;", "Lcom/yandex/go/payments/addmethod/data/model/c;", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/w", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class OpenLinkAction extends c {
        public static final w Companion = new w();
        public final String a;

        public OpenLinkAction(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public OpenLinkAction() {
            this.a = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$HomeStateCondition;", "", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/p", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class HomeStateCondition {
        public static final p Companion = new p();
        public final Boolean a;
        public final Boolean b;

        public /* synthetic */ HomeStateCondition(int i, Boolean bool, Boolean bool2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = bool;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = bool2;
            }
        }

        public HomeStateCondition(int i) {
            this.a = null;
            this.b = null;
        }

        public HomeStateCondition() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$HomeToolbar;", "", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/q", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class HomeToolbar {
        public static final q Companion = new q();
        public final String a;
        public final s b;

        public /* synthetic */ HomeToolbar(int i, String str, s sVar) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = sVar;
            }
        }

        public HomeToolbar() {
            this.a = null;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$LengthRestrictions;", "", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/u", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class LengthRestrictions {
        public static final u Companion = new u();
        public final int a;
        public final int b;

        public /* synthetic */ LengthRestrictions(int i, int i2, int i3) {
            this.a = (i & 1) == 0 ? 0 : i2;
            if ((i & 2) == 0) {
                this.b = Integer.MAX_VALUE;
            } else {
                this.b = i3;
            }
        }

        public LengthRestrictions() {
            this.a = 0;
            this.b = Integer.MAX_VALUE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$PhoneFormat;", "", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/x", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PhoneFormat {
        public static final x Companion = new x();
        public final String a;
        public final String b;

        public /* synthetic */ PhoneFormat(int i, String str, String str2) {
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
        }

        public PhoneFormat() {
            this.a = "";
            this.b = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$PrerequisiteScreen;", "", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/y", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PrerequisiteScreen {
        public static final y Companion = new y();
        public final String a;
        public final String b;

        public /* synthetic */ PrerequisiteScreen(int i, String str, String str2) {
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
        }

        public PrerequisiteScreen(int i) {
            this.a = "";
            this.b = "";
        }

        public PrerequisiteScreen() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$Footer;", "", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/m", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Footer {
        public static final m Companion = new m();
        public final FormattedText a;
        public final c b;

        public /* synthetic */ Footer(int i, FormattedText formattedText, c cVar) {
            this.a = (i & 1) == 0 ? new FormattedText(0) : formattedText;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = cVar;
            }
        }

        public Footer() {
            this.a = new FormattedText(0);
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$TrailButtonLink;", "Lcom/yandex/go/payments/addmethod/data/model/s;", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/a0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TrailButtonLink extends s {
        public static final a0 Companion = new a0();
        public final String a;
        public final c b;

        public TrailButtonLink(int i, String str, c cVar) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = new CloseAction();
            } else {
                this.b = cVar;
            }
        }

        public TrailButtonLink() {
            CloseAction closeAction = new CloseAction();
            this.a = "";
            this.b = closeAction;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$HomeActionButtonState;", "", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/n", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class HomeActionButtonState {
        public static final n Companion = new n();
        public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c20(14)), null};
        public final String a;
        public final ButtonState b;
        public final HomeStateCondition c;

        public /* synthetic */ HomeActionButtonState(int i, String str, ButtonState buttonState, HomeStateCondition homeStateCondition) {
            this.a = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.b = ButtonState.ENABLED;
            } else {
                this.b = buttonState;
            }
            if ((i & 4) == 0) {
                this.c = new HomeStateCondition(0);
            } else {
                this.c = homeStateCondition;
            }
        }

        public HomeActionButtonState() {
            ButtonState buttonState = ButtonState.ENABLED;
            HomeStateCondition homeStateCondition = new HomeStateCondition(0);
            this.a = null;
            this.b = buttonState;
            this.c = homeStateCondition;
        }
    }

    public AddPaymentHomeResponse() {
        PrerequisiteScreen prerequisiteScreen = new PrerequisiteScreen(0);
        this.a = null;
        this.b = prerequisiteScreen;
        this.c = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$Validation;", "", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/b0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Validation {
        public static final b0 Companion = new b0();
        public static final i3y[] e;
        public final FieldType a;
        public final LengthRestrictions b;
        public final String c;
        public final List d;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            e = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new c20(17)), null, null, kotlin.a.b(lazyThreadSafetyMode, new c20(18))};
        }

        public /* synthetic */ Validation(int i, FieldType fieldType, LengthRestrictions lengthRestrictions, String str, List list) {
            this.a = (i & 1) == 0 ? FieldType.PHONE_NUMBER : fieldType;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = lengthRestrictions;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
            if ((i & 8) == 0) {
                this.d = EmptyList.a;
            } else {
                this.d = list;
            }
        }

        public Validation() {
            this(0);
        }

        public Validation(int i) {
            this.a = FieldType.PHONE_NUMBER;
            this.b = null;
            this.c = null;
            this.d = EmptyList.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$ActionButton;", "", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ActionButton {
        public static final d Companion = new d();
        public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c20(7))};
        public final String a;
        public final boolean b;
        public final c c;
        public final List d;

        public /* synthetic */ ActionButton(int i, String str, boolean z, c cVar, List list) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = true;
            } else {
                this.b = z;
            }
            if ((i & 4) == 0) {
                this.c = new CloseAction();
            } else {
                this.c = cVar;
            }
            if ((i & 8) == 0) {
                this.d = EmptyList.a;
            } else {
                this.d = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionButton)) {
                return false;
            }
            ActionButton actionButton = (ActionButton) obj;
            return jl40.l(this.a, actionButton.a) && this.b == actionButton.b && jl40.l(this.c, actionButton.c) && jl40.l(this.d, actionButton.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b)) * 31);
        }

        public final String toString() {
            StringBuilder l = oo31.l("ActionButton(title=", this.a, ", isMainButton=", ", action=", this.b);
            l.append(this.c);
            l.append(", conditionsStates=");
            l.append(this.d);
            l.append(Extension.C_BRAKE);
            return l.toString();
        }

        public ActionButton() {
            CloseAction closeAction = new CloseAction();
            this.a = "";
            this.b = true;
            this.c = closeAction;
            this.d = EmptyList.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$HomeInfoScreen;", "", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class HomeInfoScreen {
        public static final o Companion = new o();
        public static final i3y[] f;
        public final String a;
        public final List b;
        public final Footer c;
        public final HomeToolbar d;
        public final DisplayType e;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            f = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new c20(15)), null, null, kotlin.a.b(lazyThreadSafetyMode, new c20(16))};
        }

        public /* synthetic */ HomeInfoScreen(int i, String str, List list, Footer footer, HomeToolbar homeToolbar, DisplayType displayType) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = footer;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = homeToolbar;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = displayType;
            }
        }

        public HomeInfoScreen() {
            this.a = "";
            this.b = EmptyList.a;
            this.c = null;
            this.d = null;
            this.e = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$InputField;", "", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/t", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class InputField {
        public static final t Companion = new t();
        public final String a;
        public final boolean b;
        public final String c;
        public final Validation d;
        public final String e;

        public /* synthetic */ InputField(int i, String str, boolean z, String str2, Validation validation, String str3) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = new Validation(0);
            } else {
                this.d = validation;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str3;
            }
        }

        public InputField() {
            Validation validation = new Validation(0);
            this.a = "";
            this.b = false;
            this.c = "";
            this.d = validation;
            this.e = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$BindDialog;", "", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class BindDialog {
        public static final e Companion = new e();
        public static final i3y[] h;
        public final String a;
        public final String b;
        public final List c;
        public final Footer d;
        public final List e;
        public final HomeToolbar f;
        public final DisplayType g;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            h = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new c20(8)), null, kotlin.a.b(lazyThreadSafetyMode, new c20(9)), null, kotlin.a.b(lazyThreadSafetyMode, new c20(10))};
        }

        public /* synthetic */ BindDialog(int i, String str, String str2, List list, Footer footer, List list2, HomeToolbar homeToolbar, DisplayType displayType) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            int i2 = i & 4;
            EmptyList emptyList = EmptyList.a;
            if (i2 == 0) {
                this.c = emptyList;
            } else {
                this.c = list;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = footer;
            }
            if ((i & 16) == 0) {
                this.e = emptyList;
            } else {
                this.e = list2;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = homeToolbar;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = displayType;
            }
        }

        public BindDialog() {
            this.a = "";
            this.b = null;
            EmptyList emptyList = EmptyList.a;
            this.c = emptyList;
            this.d = null;
            this.e = emptyList;
            this.f = null;
            this.g = null;
        }
    }
}
