package com.yandex.go.payments.addmethod.data.model;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.tn41;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/WebviewBindingFlow;", "Lcom/yandex/go/payments/addmethod/data/model/g0;", "Companion", "PaymentMethodBindResponseSignal", "PaymentMethodBindResponseSignalAction", "PaymentMethodBindResponseSignalParam", "SignalParamPayload", "$serializer", "com/yandex/go/payments/addmethod/data/model/o0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class WebviewBindingFlow extends g0 {
    public static final o0 Companion = new o0();
    public static final i3y[] g = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tn41(9)), null, null};
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final int e;
    public final String f;

    public WebviewBindingFlow(int i, int i2, String str, String str2, String str3, String str4, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
        this.e = (i & 16) == 0 ? 0 : i2;
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebviewBindingFlow)) {
            return false;
        }
        WebviewBindingFlow webviewBindingFlow = (WebviewBindingFlow) obj;
        return jl40.l(this.a, webviewBindingFlow.a) && jl40.l(this.b, webviewBindingFlow.b) && jl40.l(this.c, webviewBindingFlow.c) && jl40.l(this.d, webviewBindingFlow.d) && this.e == webviewBindingFlow.e && jl40.l(this.f, webviewBindingFlow.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return this.f.hashCode() + oyr.b(this.e, unr0.c((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("WebviewBindingFlow(bindingSuccessText=", this.a, ", bindingFailureText=", this.b, ", bindingLoadingText=");
        tse0.x(this.c, ", paymentMethodBindResponseSignal=", ", webviewLoaderTimeout=", v, this.d);
        return xvz.h(this.e, ", bindUrl=", this.f, Extension.C_BRAKE, v);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/WebviewBindingFlow$SignalParamPayload;", "", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/u0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class SignalParamPayload {
        public static final u0 Companion = new u0();
        public final String a;

        public /* synthetic */ SignalParamPayload(int i, String str) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SignalParamPayload) && jl40.l(this.a, ((SignalParamPayload) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return oyr.p("SignalParamPayload(message=", this.a, Extension.C_BRAKE);
        }

        public SignalParamPayload() {
            this.a = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/WebviewBindingFlow$PaymentMethodBindResponseSignalAction;", "", "Companion", "Type", "$serializer", "com/yandex/go/payments/addmethod/data/model/q0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class PaymentMethodBindResponseSignalAction {
        public static final q0 Companion = new q0();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tn41(11)), null};
        public final Type a;
        public final SignalParamPayload b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/WebviewBindingFlow$PaymentMethodBindResponseSignalAction$Type;", "", "Companion", "com/yandex/go/payments/addmethod/data/model/r0", "OPEN_EXTERNAL_URL", "OPEN_OTP", "OTP_SUCCESS", "OTP_FAILED", "BINDING_SUCCESS", "BINDING_FAILED", "WEBVIEW_LOADED", "SHOW_ERROR_MESSAGE", "PHONE_ALREADY_BOUND_ERROR", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Type {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final Type BINDING_FAILED;
            public static final Type BINDING_SUCCESS;
            public static final r0 Companion;
            public static final Type OPEN_EXTERNAL_URL;
            public static final Type OPEN_OTP;
            public static final Type OTP_FAILED;
            public static final Type OTP_SUCCESS;
            public static final Type PHONE_ALREADY_BOUND_ERROR;
            public static final Type SHOW_ERROR_MESSAGE;
            public static final Type UNKNOWN;
            public static final Type WEBVIEW_LOADED;

            static {
                Type type = new Type("OPEN_EXTERNAL_URL", 0);
                OPEN_EXTERNAL_URL = type;
                Type type2 = new Type("OPEN_OTP", 1);
                OPEN_OTP = type2;
                Type type3 = new Type("OTP_SUCCESS", 2);
                OTP_SUCCESS = type3;
                Type type4 = new Type("OTP_FAILED", 3);
                OTP_FAILED = type4;
                Type type5 = new Type("BINDING_SUCCESS", 4);
                BINDING_SUCCESS = type5;
                Type type6 = new Type("BINDING_FAILED", 5);
                BINDING_FAILED = type6;
                Type type7 = new Type("WEBVIEW_LOADED", 6);
                WEBVIEW_LOADED = type7;
                Type type8 = new Type("SHOW_ERROR_MESSAGE", 7);
                SHOW_ERROR_MESSAGE = type8;
                Type type9 = new Type("PHONE_ALREADY_BOUND_ERROR", 8);
                PHONE_ALREADY_BOUND_ERROR = type9;
                Type type10 = new Type("UNKNOWN", 9);
                UNKNOWN = type10;
                Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10};
                $VALUES = typeArr;
                $ENTRIES = kotlin.enums.a.a(typeArr);
                Companion = new r0();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tn41(12));
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public /* synthetic */ PaymentMethodBindResponseSignalAction(int i, Type type, SignalParamPayload signalParamPayload) {
            this.a = (i & 1) == 0 ? Type.UNKNOWN : type;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = signalParamPayload;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentMethodBindResponseSignalAction)) {
                return false;
            }
            PaymentMethodBindResponseSignalAction paymentMethodBindResponseSignalAction = (PaymentMethodBindResponseSignalAction) obj;
            return this.a == paymentMethodBindResponseSignalAction.a && jl40.l(this.b, paymentMethodBindResponseSignalAction.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            SignalParamPayload signalParamPayload = this.b;
            return hashCode + (signalParamPayload == null ? 0 : signalParamPayload.hashCode());
        }

        public final String toString() {
            return "PaymentMethodBindResponseSignalAction(type=" + this.a + ", payload=" + this.b + Extension.C_BRAKE;
        }

        public PaymentMethodBindResponseSignalAction() {
            this(0);
        }

        public PaymentMethodBindResponseSignalAction(int i) {
            this.a = Type.UNKNOWN;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/WebviewBindingFlow$PaymentMethodBindResponseSignalParam;", "", "Companion", "Action", "$serializer", "com/yandex/go/payments/addmethod/data/model/t0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class PaymentMethodBindResponseSignalParam {
        public static final t0 Companion = new t0();
        public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tn41(13)), null};
        public final String a;
        public final Action b;
        public final String c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/WebviewBindingFlow$PaymentMethodBindResponseSignalParam$Action;", "", "Companion", "com/yandex/go/payments/addmethod/data/model/s0", "URL", "PAYMENT_METHOD_ID", "STATUS", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Action {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Action[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final s0 Companion;
            public static final Action PAYMENT_METHOD_ID;
            public static final Action STATUS;
            public static final Action UNKNOWN;
            public static final Action URL;

            static {
                Action action = new Action("URL", 0);
                URL = action;
                Action action2 = new Action("PAYMENT_METHOD_ID", 1);
                PAYMENT_METHOD_ID = action2;
                Action action3 = new Action("STATUS", 2);
                STATUS = action3;
                Action action4 = new Action("UNKNOWN", 3);
                UNKNOWN = action4;
                Action[] actionArr = {action, action2, action3, action4};
                $VALUES = actionArr;
                $ENTRIES = kotlin.enums.a.a(actionArr);
                Companion = new s0();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tn41(14));
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) $VALUES.clone();
            }
        }

        public /* synthetic */ PaymentMethodBindResponseSignalParam(int i, String str, Action action, String str2) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = Action.UNKNOWN;
            } else {
                this.b = action;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentMethodBindResponseSignalParam)) {
                return false;
            }
            PaymentMethodBindResponseSignalParam paymentMethodBindResponseSignalParam = (PaymentMethodBindResponseSignalParam) obj;
            return jl40.l(this.a, paymentMethodBindResponseSignalParam.a) && this.b == paymentMethodBindResponseSignalParam.b && jl40.l(this.c, paymentMethodBindResponseSignalParam.c);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            String str = this.c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PaymentMethodBindResponseSignalParam(signalParam=");
            sb.append(this.a);
            sb.append(", actionParam=");
            sb.append(this.b);
            sb.append(", signalParamValue=");
            return oyr.t(sb, this.c, Extension.C_BRAKE);
        }

        public PaymentMethodBindResponseSignalParam() {
            Action action = Action.UNKNOWN;
            this.a = "";
            this.b = action;
            this.c = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/WebviewBindingFlow$PaymentMethodBindResponseSignal;", "", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/p0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class PaymentMethodBindResponseSignal {
        public static final p0 Companion = new p0();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tn41(10))};
        public final String a;
        public final PaymentMethodBindResponseSignalAction b;
        public final List c;

        public /* synthetic */ PaymentMethodBindResponseSignal(int i, String str, PaymentMethodBindResponseSignalAction paymentMethodBindResponseSignalAction, List list) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = new PaymentMethodBindResponseSignalAction(0);
            } else {
                this.b = paymentMethodBindResponseSignalAction;
            }
            if ((i & 4) == 0) {
                this.c = EmptyList.a;
            } else {
                this.c = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentMethodBindResponseSignal)) {
                return false;
            }
            PaymentMethodBindResponseSignal paymentMethodBindResponseSignal = (PaymentMethodBindResponseSignal) obj;
            return jl40.l(this.a, paymentMethodBindResponseSignal.a) && jl40.l(this.b, paymentMethodBindResponseSignal.b) && jl40.l(this.c, paymentMethodBindResponseSignal.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PaymentMethodBindResponseSignal(signal=");
            sb.append(this.a);
            sb.append(", action=");
            sb.append(this.b);
            sb.append(", params=");
            return ly3.s(sb, this.c, Extension.C_BRAKE);
        }

        public PaymentMethodBindResponseSignal() {
            PaymentMethodBindResponseSignalAction paymentMethodBindResponseSignalAction = new PaymentMethodBindResponseSignalAction(0);
            this.a = "";
            this.b = paymentMethodBindResponseSignalAction;
            this.c = EmptyList.a;
        }
    }

    public WebviewBindingFlow() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = EmptyList.a;
        this.e = 0;
        this.f = "";
    }
}
