package xsna;

import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import java.util.Map;
import xsna.woy;
import xsna.ytm0;

/* compiled from: SubcomposeLayout.kt */
/* loaded from: classes11.dex */
public final class xoy extends LayoutNode.d {
    public final /* synthetic */ woy b;
    public final /* synthetic */ wzs<ztm0, o6j, dp10> c;

    /* compiled from: SubcomposeLayout.kt */
    public static final class a implements dp10 {
        public final /* synthetic */ dp10 a;
        public final /* synthetic */ woy b;
        public final /* synthetic */ int c;
        public final /* synthetic */ dp10 d;

        public a(dp10 dp10Var, woy woyVar, int i, dp10 dp10Var2) {
            this.b = woyVar;
            this.c = i;
            this.d = dp10Var2;
            this.a = dp10Var;
        }

        @Override // xsna.dp10
        public final int getHeight() {
            return this.a.getHeight();
        }

        @Override // xsna.dp10
        public final int getWidth() {
            return this.a.getWidth();
        }

        @Override // xsna.dp10
        public final void j() {
            int i;
            int i2 = this.c;
            woy woyVar = this.b;
            woyVar.f = i2;
            this.d.j();
            ci50<Object> ci50Var = woyVar.n;
            ph50<Object, ytm0.b> ph50Var = woyVar.m;
            long[] jArr = ph50Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((255 & j) < 128) {
                                int i7 = (i3 << 3) + i6;
                                Object obj = ph50Var.b[i7];
                                ytm0.b bVar = (ytm0.b) ph50Var.c[i7];
                                int i8 = ci50Var.i(obj);
                                i = i4;
                                if (i8 < 0 || i8 >= woyVar.f) {
                                    if (i8 >= 0) {
                                        Object[] objArr = ci50Var.b;
                                        Object obj2 = objArr[i8];
                                        objArr[i8] = xtm0.b;
                                    }
                                    if (woyVar.k.a(obj)) {
                                        bVar.dispose();
                                    }
                                    ph50Var.o(i7);
                                }
                            } else {
                                i = i4;
                            }
                            j >>= i;
                            i6++;
                            i4 = i;
                        }
                        if (i5 != i4) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            woyVar.g(woyVar.e);
        }

        @Override // xsna.dp10
        public final izs<srg0, s3q0> k() {
            return this.a.k();
        }

        @Override // xsna.dp10
        public final Map<gt1, Integer> q() {
            return this.a.q();
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    public static final class b implements dp10 {
        public final /* synthetic */ dp10 a;
        public final /* synthetic */ woy b;
        public final /* synthetic */ int c;
        public final /* synthetic */ dp10 d;

        public b(dp10 dp10Var, woy woyVar, int i, dp10 dp10Var2) {
            this.b = woyVar;
            this.c = i;
            this.d = dp10Var2;
            this.a = dp10Var;
        }

        @Override // xsna.dp10
        public final int getHeight() {
            return this.a.getHeight();
        }

        @Override // xsna.dp10
        public final int getWidth() {
            return this.a.getWidth();
        }

        @Override // xsna.dp10
        public final void j() {
            int i = this.c;
            woy woyVar = this.b;
            woyVar.e = i;
            this.d.j();
            if (woyVar.b.i == null) {
                woyVar.g(woyVar.e);
            }
        }

        @Override // xsna.dp10
        public final izs<srg0, s3q0> k() {
            return this.a.k();
        }

        @Override // xsna.dp10
        public final Map<gt1, Integer> q() {
            return this.a.q();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xoy(woy woyVar, wzs<? super ztm0, ? super o6j, ? extends dp10> wzsVar, String str) {
        super(str);
        this.b = woyVar;
        this.c = wzsVar;
    }

    @Override // xsna.cp10
    public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
        woy woyVar = this.b;
        woy.c cVar = woyVar.i;
        cVar.b = ep10Var.getLayoutDirection();
        cVar.c = ep10Var.getDensity();
        cVar.d = ep10Var.getFontScale();
        boolean z1 = ep10Var.z1();
        wzs<ztm0, o6j, dp10> wzsVar = this.c;
        if (z1 || woyVar.b.i == null) {
            woyVar.e = 0;
            dp10 invoke = wzsVar.invoke(cVar, new o6j(j));
            return new b(invoke, woyVar, woyVar.e, invoke);
        }
        woyVar.f = 0;
        dp10 invoke2 = wzsVar.invoke(woyVar.j, new o6j(j));
        return new a(invoke2, woyVar, woyVar.f, invoke2);
    }
}
