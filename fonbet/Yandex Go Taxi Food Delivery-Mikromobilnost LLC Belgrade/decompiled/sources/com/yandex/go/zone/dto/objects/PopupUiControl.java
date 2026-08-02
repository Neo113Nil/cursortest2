package com.yandex.go.zone.dto.objects;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.yud0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/yandex/go/zone/dto/objects/PopupUiControl;", "", "Companion", "com/yandex/go/zone/dto/objects/a3", "com/yandex/go/zone/dto/objects/b3", "com/yandex/go/zone/dto/objects/e3", "Deeplink", "OpenSummaryAddress", "com/yandex/go/zone/dto/objects/j3", "CancelOrders", "com/yandex/go/zone/dto/objects/f3", "PopupUiControlType", "$serializer", "go-client-android.internal_libs:taxi_shared_dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PopupUiControl {
    public static final f3 Companion = new f3();
    public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new yud0(15)), null};
    public static final PopupUiControl f = new PopupUiControl(0);
    public final String a;
    public final String b;
    public final PopupUiControlType c;
    public final a3 d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/PopupUiControl$PopupUiControlType;", "", "Companion", "com/yandex/go/zone/dto/objects/k3", "BUTTON", "SLIDER", "go-client-android.internal_libs:taxi_shared_dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class PopupUiControlType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PopupUiControlType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final PopupUiControlType BUTTON;
        public static final k3 Companion;
        public static final PopupUiControlType SLIDER;

        static {
            PopupUiControlType popupUiControlType = new PopupUiControlType("BUTTON", 0);
            BUTTON = popupUiControlType;
            PopupUiControlType popupUiControlType2 = new PopupUiControlType("SLIDER", 1);
            SLIDER = popupUiControlType2;
            PopupUiControlType[] popupUiControlTypeArr = {popupUiControlType, popupUiControlType2};
            $VALUES = popupUiControlTypeArr;
            $ENTRIES = kotlin.enums.a.a(popupUiControlTypeArr);
            Companion = new k3();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new yud0(21));
        }

        public static PopupUiControlType valueOf(String str) {
            return (PopupUiControlType) Enum.valueOf(PopupUiControlType.class, str);
        }

        public static PopupUiControlType[] values() {
            return (PopupUiControlType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ PopupUiControl(int i, String str, String str2, PopupUiControlType popupUiControlType, a3 a3Var) {
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
            this.c = PopupUiControlType.BUTTON;
        } else {
            this.c = popupUiControlType;
        }
        if ((i & 8) == 0) {
            this.d = e3.INSTANCE;
        } else {
            this.d = a3Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupUiControl)) {
            return false;
        }
        PopupUiControl popupUiControl = (PopupUiControl) obj;
        return jl40.l(this.a, popupUiControl.a) && jl40.l(this.b, popupUiControl.b) && this.c == popupUiControl.c && jl40.l(this.d, popupUiControl.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("PopupUiControl(text=", this.a, ", subtitle=", this.b, ", type=");
        v.append(this.c);
        v.append(", action=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/PopupUiControl$Deeplink;", "Lcom/yandex/go/zone/dto/objects/a3;", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/g3", "go-client-android.internal_libs:taxi_shared_dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Deeplink extends a3 {
        public static final g3 Companion = new g3();
        public final String a;

        public Deeplink(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Deeplink) && jl40.l(this.a, ((Deeplink) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Deeplink(deeplink=", this.a, Extension.C_BRAKE);
        }

        public Deeplink(String str) {
            this.a = str;
        }

        public Deeplink() {
            this("");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/PopupUiControl$OpenSummaryAddress;", "Lcom/yandex/go/zone/dto/objects/a3;", "Companion", "FocusField", "$serializer", "com/yandex/go/zone/dto/objects/h3", "go-client-android.internal_libs:taxi_shared_dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class OpenSummaryAddress extends a3 {
        public static final h3 Companion = new h3();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new yud0(18))};
        public final FocusField a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/zone/dto/objects/PopupUiControl$OpenSummaryAddress$FocusField;", "", "Companion", "com/yandex/go/zone/dto/objects/i3", "SOURCE", "DESTINATION", "UNKNOWN", "go-client-android.internal_libs:taxi_shared_dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        /* loaded from: classes13.dex */
        public static final class FocusField {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ FocusField[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final i3 Companion;
            public static final FocusField DESTINATION;
            public static final FocusField SOURCE;
            public static final FocusField UNKNOWN;

            static {
                FocusField focusField = new FocusField("SOURCE", 0);
                SOURCE = focusField;
                FocusField focusField2 = new FocusField("DESTINATION", 1);
                DESTINATION = focusField2;
                FocusField focusField3 = new FocusField("UNKNOWN", 2);
                UNKNOWN = focusField3;
                FocusField[] focusFieldArr = {focusField, focusField2, focusField3};
                $VALUES = focusFieldArr;
                $ENTRIES = kotlin.enums.a.a(focusFieldArr);
                Companion = new i3();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new yud0(19));
            }

            public static FocusField valueOf(String str) {
                return (FocusField) Enum.valueOf(FocusField.class, str);
            }

            public static FocusField[] values() {
                return (FocusField[]) $VALUES.clone();
            }
        }

        public OpenSummaryAddress(int i, FocusField focusField) {
            if ((i & 1) == 0) {
                this.a = FocusField.UNKNOWN;
            } else {
                this.a = focusField;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenSummaryAddress) && this.a == ((OpenSummaryAddress) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenSummaryAddress(focusField=" + this.a + Extension.C_BRAKE;
        }

        public OpenSummaryAddress() {
            this.a = FocusField.UNKNOWN;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/PopupUiControl$CancelOrders;", "Lcom/yandex/go/zone/dto/objects/a3;", "Companion", "DoneNotification", "$serializer", "com/yandex/go/zone/dto/objects/c3", "go-client-android.internal_libs:taxi_shared_dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class CancelOrders extends a3 {
        public static final c3 Companion = new c3();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new yud0(16)), null};
        public final List a;
        public final DoneNotification b;

        public CancelOrders(int i, List list, DoneNotification doneNotification) {
            this.a = (i & 1) == 0 ? EmptyList.a : list;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = doneNotification;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CancelOrders)) {
                return false;
            }
            CancelOrders cancelOrders = (CancelOrders) obj;
            return jl40.l(this.a, cancelOrders.a) && jl40.l(this.b, cancelOrders.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            DoneNotification doneNotification = this.b;
            return hashCode + (doneNotification == null ? 0 : doneNotification.hashCode());
        }

        public final String toString() {
            return "CancelOrders(orderIdsForCancel=" + this.a + ", doneNotification=" + this.b + Extension.C_BRAKE;
        }

        public CancelOrders(List list, DoneNotification doneNotification) {
            this.a = list;
            this.b = doneNotification;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/PopupUiControl$CancelOrders$DoneNotification;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/d3", "go-client-android.internal_libs:taxi_shared_dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class DoneNotification {
            public static final d3 Companion = new d3();
            public final String a;
            public final String b;

            public /* synthetic */ DoneNotification(int i, String str, String str2) {
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

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DoneNotification)) {
                    return false;
                }
                DoneNotification doneNotification = (DoneNotification) obj;
                return jl40.l(this.a, doneNotification.a) && jl40.l(this.b, doneNotification.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return unr0.p("DoneNotification(title=", this.a, ", iconTag=", this.b, Extension.C_BRAKE);
            }

            public DoneNotification(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public DoneNotification() {
                this("", "");
            }
        }

        public CancelOrders() {
            this(EmptyList.a, null);
        }
    }

    public PopupUiControl() {
        this(0);
    }

    public PopupUiControl(int i) {
        PopupUiControlType popupUiControlType = PopupUiControlType.BUTTON;
        e3 e3Var = e3.INSTANCE;
        this.a = "";
        this.b = "";
        this.c = popupUiControlType;
        this.d = e3Var;
    }
}
