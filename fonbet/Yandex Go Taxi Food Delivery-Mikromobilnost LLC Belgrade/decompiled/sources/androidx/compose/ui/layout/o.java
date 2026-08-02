package androidx.compose.ui.layout;

import androidx.compose.ui.unit.LayoutDirection;
import defpackage.ca10;
import defpackage.fwi;
import defpackage.k6w;
import defpackage.n8e;
import defpackage.tls;
import defpackage.wa30;
import defpackage.y6i0;
import defpackage.z5w;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public abstract class o implements ca10 {
    public int a;
    public int b;
    public long c = 0;
    public long w = p.b;
    public long x = 0;

    public static abstract class a implements fwi {
        public boolean a;

        /* JADX WARN: Multi-variable type inference failed */
        public static final void a(a aVar, o oVar) {
            aVar.getClass();
            if (oVar instanceof wa30) {
                ((wa30) oVar).g(aVar.a);
            }
        }

        public static void m(a aVar, o oVar, long j) {
            aVar.getClass();
            a(aVar, oVar);
            oVar.s0(z5w.c(j, oVar.x), 0.0f, null);
        }

        public static void o(a aVar, o oVar, int i, int i2) {
            long j = (i << 32) | (i2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            if (aVar.d() == LayoutDirection.Ltr || aVar.e() == 0) {
                a(aVar, oVar);
                oVar.s0(z5w.c(j, oVar.x), 0.0f, null);
            } else {
                long e = (((aVar.e() - oVar.a) - ((int) (j >> 32))) << 32) | (((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                a(aVar, oVar);
                oVar.s0(z5w.c(e, oVar.x), 0.0f, null);
            }
        }

        public static void q(a aVar, o oVar, int i, int i2) {
            tls tlsVar = p.a;
            long j = (i << 32) | (i2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            LayoutDirection d = aVar.d();
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            PlaceableKt$DefaultLayerBlock$1 placeableKt$DefaultLayerBlock$1 = PlaceableKt$DefaultLayerBlock$1.w;
            if (d == layoutDirection || aVar.e() == 0) {
                a(aVar, oVar);
                oVar.s0(z5w.c(j, oVar.x), 0.0f, placeableKt$DefaultLayerBlock$1);
            } else {
                long e = (((aVar.e() - oVar.a) - ((int) (j >> 32))) << 32) | (((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                a(aVar, oVar);
                oVar.s0(z5w.c(e, oVar.x), 0.0f, placeableKt$DefaultLayerBlock$1);
            }
        }

        public static void u(a aVar, o oVar, long j) {
            tls tlsVar = p.a;
            LayoutDirection d = aVar.d();
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            PlaceableKt$DefaultLayerBlock$1 placeableKt$DefaultLayerBlock$1 = PlaceableKt$DefaultLayerBlock$1.w;
            if (d == layoutDirection || aVar.e() == 0) {
                a(aVar, oVar);
                oVar.s0(z5w.c(j, oVar.x), 0.0f, placeableKt$DefaultLayerBlock$1);
            } else {
                int e = (aVar.e() - oVar.a) - ((int) (j >> 32));
                long j2 = ((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                a(aVar, oVar);
                oVar.s0(z5w.c(j2 | (e << 32), oVar.x), 0.0f, placeableKt$DefaultLayerBlock$1);
            }
        }

        public static /* synthetic */ void x(a aVar, o oVar, int i, int i2, tls tlsVar, int i3) {
            if ((i3 & 8) != 0) {
                tls tlsVar2 = p.a;
                tlsVar = PlaceableKt$DefaultLayerBlock$1.w;
            }
            aVar.v(oVar, i, i2, 0.0f, tlsVar);
        }

        public static void y(a aVar, o oVar, long j) {
            tls tlsVar = p.a;
            aVar.getClass();
            a(aVar, oVar);
            oVar.s0(z5w.c(j, oVar.x), 0.0f, PlaceableKt$DefaultLayerBlock$1.w);
        }

        public float b(r rVar) {
            return Float.NaN;
        }

        public abstract LayoutDirection d();

        public abstract int e();

        public final void g(o oVar, int i, int i2, float f) {
            long j = (i2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (i << 32);
            a(this, oVar);
            oVar.s0(z5w.c(j, oVar.x), f, null);
        }

        @Override // defpackage.fwi
        public float getDensity() {
            return 1.0f;
        }

        @Override // defpackage.fwi
        public float u0() {
            return 1.0f;
        }

        public final void v(o oVar, int i, int i2, float f, tls tlsVar) {
            long j = (i2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (i << 32);
            a(this, oVar);
            oVar.s0(z5w.c(j, oVar.x), f, tlsVar);
        }
    }

    public int m0() {
        return (int) (this.c & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    public int n0() {
        return (int) (this.c >> 32);
    }

    public final void o0() {
        this.a = y6i0.d((int) (this.c >> 32), n8e.k(this.w), n8e.i(this.w));
        this.b = y6i0.d((int) (this.c & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), n8e.j(this.w), n8e.h(this.w));
        int i = this.a;
        long j = this.c;
        this.x = (((i - ((int) (j >> 32))) / 2) << 32) | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & ((r0 - ((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) / 2));
    }

    public abstract void s0(long j, float f, tls tlsVar);

    public void x0(long j, float f, androidx.compose.ui.graphics.layer.a aVar) {
        s0(j, f, null);
    }

    public final void y0(long j) {
        if (k6w.a(this.c, j)) {
            return;
        }
        this.c = j;
        o0();
    }

    public final void z0(long j) {
        if (n8e.c(this.w, j)) {
            return;
        }
        this.w = j;
        o0();
    }
}
