package com.yandex.go.payments.promo;

import defpackage.auu0;
import defpackage.c6z;
import defpackage.f9a0;
import defpackage.gsq0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.n96;
import defpackage.t7a0;
import defpackage.yjd;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/promo/PaymentMethodsPromoBannerExperiment;", "Ln96;", "Lc6z;", "Companion", "PromoBannerDto", "com/yandex/go/payments/promo/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentMethodsPromoBannerExperiment extends n96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] e;
    public static final PaymentMethodsPromoBannerExperiment f;
    public final boolean b;
    public final List c;
    public final Map d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new f9a0(10)), kotlin.a.b(lazyThreadSafetyMode, new f9a0(11))};
        f = new PaymentMethodsPromoBannerExperiment(0);
    }

    public /* synthetic */ PaymentMethodsPromoBannerExperiment(int i, List list, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? null : list;
        if ((i & 4) == 0) {
            this.d = kotlin.collections.b.f();
        } else {
            this.d = map;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.d;
    }

    public PaymentMethodsPromoBannerExperiment(int i) {
        this.b = false;
        this.c = null;
        this.d = kotlin.collections.b.f();
    }

    public PaymentMethodsPromoBannerExperiment() {
        this(0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/promo/PaymentMethodsPromoBannerExperiment$PromoBannerDto;", "", "Companion", "$serializer", "com/yandex/go/payments/promo/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes5.dex */
    public static final class PromoBannerDto {
        public static final b Companion = new b();
        public static final i3y[] l = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new t7a0(13)), null, null, null, null, null, null, null, null};
        public final String a;
        public final Integer b;
        public final Set c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final String k;

        public /* synthetic */ PromoBannerDto(int i, String str, Integer num, Set set, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num;
            }
            if ((i & 4) == 0) {
                this.c = EmptySet.a;
            } else {
                this.c = set;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str2;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str3;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = str4;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = str5;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = str6;
            }
            if ((i & 256) == 0) {
                this.i = null;
            } else {
                this.i = str7;
            }
            if ((i & 512) == 0) {
                this.j = null;
            } else {
                this.j = str8;
            }
            if ((i & 1024) == 0) {
                this.k = null;
            } else {
                this.k = str9;
            }
        }

        public static final /* synthetic */ void l(PromoBannerDto promoBannerDto, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || !jl40.l(promoBannerDto.a, "")) {
                yjdVar.o(serialDescriptor, 0, promoBannerDto.a);
            }
            if (yjdVar.F() || promoBannerDto.b != null) {
                yjdVar.g(serialDescriptor, 1, h6w.a, promoBannerDto.b);
            }
            if (yjdVar.F() || !jl40.l(promoBannerDto.c, EmptySet.a)) {
                yjdVar.e(serialDescriptor, 2, (KSerializer) l[2].getValue(), promoBannerDto.c);
            }
            if (yjdVar.F() || promoBannerDto.d != null) {
                yjdVar.g(serialDescriptor, 3, auu0.a, promoBannerDto.d);
            }
            if (yjdVar.F() || !jl40.l(promoBannerDto.e, "")) {
                yjdVar.o(serialDescriptor, 4, promoBannerDto.e);
            }
            if (yjdVar.F() || promoBannerDto.f != null) {
                yjdVar.g(serialDescriptor, 5, auu0.a, promoBannerDto.f);
            }
            if (yjdVar.F() || promoBannerDto.g != null) {
                yjdVar.g(serialDescriptor, 6, auu0.a, promoBannerDto.g);
            }
            if (yjdVar.F() || promoBannerDto.h != null) {
                yjdVar.g(serialDescriptor, 7, auu0.a, promoBannerDto.h);
            }
            if (yjdVar.F() || promoBannerDto.i != null) {
                yjdVar.g(serialDescriptor, 8, auu0.a, promoBannerDto.i);
            }
            if (yjdVar.F() || promoBannerDto.j != null) {
                yjdVar.g(serialDescriptor, 9, auu0.a, promoBannerDto.j);
            }
            if (!yjdVar.F() && promoBannerDto.k == null) {
                return;
            }
            yjdVar.g(serialDescriptor, 10, auu0.a, promoBannerDto.k);
        }

        /* renamed from: b, reason: from getter */
        public final String getD() {
            return this.d;
        }

        /* renamed from: c, reason: from getter */
        public final String getK() {
            return this.k;
        }

        /* renamed from: d, reason: from getter */
        public final String getG() {
            return this.g;
        }

        /* renamed from: e, reason: from getter */
        public final String getH() {
            return this.h;
        }

        /* renamed from: f, reason: from getter */
        public final String getA() {
            return this.a;
        }

        /* renamed from: g, reason: from getter */
        public final String getJ() {
            return this.j;
        }

        /* renamed from: h, reason: from getter */
        public final Set getC() {
            return this.c;
        }

        /* renamed from: i, reason: from getter */
        public final String getI() {
            return this.i;
        }

        /* renamed from: j, reason: from getter */
        public final String getE() {
            return this.e;
        }

        /* renamed from: k, reason: from getter */
        public final String getF() {
            return this.f;
        }

        public PromoBannerDto() {
            this.a = "";
            this.b = null;
            this.c = EmptySet.a;
            this.d = null;
            this.e = "";
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
        }
    }
}
