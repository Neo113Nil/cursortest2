package com.yandex.go.shortcuts.dto.response;

import defpackage.b64;
import defpackage.ej2;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/LottieAnimation;", "Lcom/yandex/go/shortcuts/dto/response/d;", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/v", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class LottieAnimation extends d {
    public static final v Companion = new v();
    public final int a;
    public final int b;
    public final double c;
    public final c d;

    public /* synthetic */ LottieAnimation(int i, int i2, int i3, double d, c cVar) {
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
            this.c = 0.0d;
        } else {
            this.c = d;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = cVar;
        }
    }

    public static final /* synthetic */ void f(LottieAnimation lottieAnimation, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || lottieAnimation.a != 0) {
            yjdVar.A(0, lottieAnimation.a, serialDescriptor);
        }
        if (yjdVar.F() || lottieAnimation.b != 0) {
            yjdVar.A(1, lottieAnimation.b, serialDescriptor);
        }
        if (yjdVar.F() || Double.compare(lottieAnimation.c, 0.0d) != 0) {
            yjdVar.E(serialDescriptor, 2, lottieAnimation.c);
        }
        if (!yjdVar.F() && lottieAnimation.d == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 3, ej2.e, lottieAnimation.d);
    }

    @Override // com.yandex.go.shortcuts.dto.response.d
    public final AnimationSourceType a() {
        return AnimationSourceType.LOTTIE_ANIMATION;
    }

    /* renamed from: b, reason: from getter */
    public final int getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public final double getC() {
        return this.c;
    }

    /* renamed from: d, reason: from getter */
    public final c getD() {
        return this.d;
    }

    /* renamed from: e, reason: from getter */
    public final int getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieAnimation)) {
            return false;
        }
        LottieAnimation lottieAnimation = (LottieAnimation) obj;
        return this.a == lottieAnimation.a && this.b == lottieAnimation.b && Double.compare(this.c, lottieAnimation.c) == 0 && jl40.l(this.d, lottieAnimation.d);
    }

    public final int hashCode() {
        int a = unr0.a(oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
        c cVar = this.d;
        return a + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "LottieAnimation(count=", ", tapCount=", ", delay=");
        s.append(this.c);
        s.append(", source=");
        s.append(this.d);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }

    public LottieAnimation(int i, int i2, double d, c cVar) {
        this.a = i;
        this.b = i2;
        this.c = d;
        this.d = cVar;
    }

    public LottieAnimation() {
        this(0, 0, 0.0d, null);
    }
}
