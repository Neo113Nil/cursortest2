package com.yandex.go.payments.paymentlist.experiments.info_modal;

import defpackage.b64;
import defpackage.c6z;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ks90;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.w96;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/paymentlist/experiments/info_modal/PaymentMethodSelectionInfoModalExperiment;", "Lw96;", "Lc6z;", "Companion", "ModalDescription", "com/yandex/go/payments/paymentlist/experiments/info_modal/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentMethodSelectionInfoModalExperiment extends w96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] e;
    public static final PaymentMethodSelectionInfoModalExperiment f;
    public final boolean b;
    public final Map c;
    public final List d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new ks90(12)), kotlin.a.b(lazyThreadSafetyMode, new ks90(13))};
        f = new PaymentMethodSelectionInfoModalExperiment(0);
    }

    public /* synthetic */ PaymentMethodSelectionInfoModalExperiment(int i, List list, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 4) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public PaymentMethodSelectionInfoModalExperiment() {
        this(0);
    }

    public PaymentMethodSelectionInfoModalExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        this.b = false;
        this.c = f2;
        this.d = EmptyList.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/paymentlist/experiments/info_modal/PaymentMethodSelectionInfoModalExperiment$ModalDescription;", "", "Companion", "$serializer", "com/yandex/go/payments/paymentlist/experiments/info_modal/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class ModalDescription {
        public static final b Companion = new b();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public /* synthetic */ ModalDescription(String str, String str2, String str3, String str4, int i, String str5) {
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
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str4;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str5;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getC() {
            return this.c;
        }

        /* renamed from: b, reason: from getter */
        public final String getD() {
            return this.d;
        }

        /* renamed from: c, reason: from getter */
        public final String getE() {
            return this.e;
        }

        /* renamed from: d, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: e, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ModalDescription)) {
                return false;
            }
            ModalDescription modalDescription = (ModalDescription) obj;
            return jl40.l(this.a, modalDescription.a) && jl40.l(this.b, modalDescription.b) && jl40.l(this.c, modalDescription.c) && jl40.l(this.d, modalDescription.d) && jl40.l(this.e, modalDescription.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder v = b64.v("ModalDescription(titleKey=", this.a, ", subtitleKey=", this.b, ", buttonKey=");
            g8e.D(v, this.c, ", imageTag=", this.d, ", paymentType=");
            return oyr.t(v, this.e, Extension.C_BRAKE);
        }

        public ModalDescription() {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
            this.e = "";
        }
    }
}
