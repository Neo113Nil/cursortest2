package xsna;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import xsna.cri;
import xsna.dxr;
import xsna.q630;

/* compiled from: AndroidView.android.kt */
/* loaded from: classes11.dex */
public final class ae2 {
    public static final h a = h.i;

    /* compiled from: AndroidView.android.kt */
    public static final class a extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ izs<Context, View> $factory;
        final /* synthetic */ q630 $modifier;
        final /* synthetic */ izs<View, s3q0> $update;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, izs izsVar, izs izsVar2, q630 q630Var) {
            super(2);
            this.$factory = izsVar;
            this.$modifier = q630Var;
            this.$update = izsVar2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            izs<Context, View> izsVar = this.$factory;
            q630 q630Var = this.$modifier;
            ae2.a(ne7.I(this.$$changed | 1), this.$$default, aVar, izsVar, this.$update, q630Var);
            return s3q0.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AndroidView.android.kt */
    public static final class b<T> extends Lambda implements wzs<LayoutNode, izs<? super T, ? extends s3q0>, s3q0> {
        public static final b i = new b(2);

        @Override // xsna.wzs
        public final s3q0 invoke(LayoutNode layoutNode, Object obj) {
            ae2.c(layoutNode).setResetBlock((izs) obj);
            return s3q0.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AndroidView.android.kt */
    public static final class c<T> extends Lambda implements wzs<LayoutNode, izs<? super T, ? extends s3q0>, s3q0> {
        public static final c i = new c(2);

        @Override // xsna.wzs
        public final s3q0 invoke(LayoutNode layoutNode, Object obj) {
            ae2.c(layoutNode).setUpdateBlock((izs) obj);
            return s3q0.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AndroidView.android.kt */
    public static final class d<T> extends Lambda implements wzs<LayoutNode, izs<? super T, ? extends s3q0>, s3q0> {
        public static final d i = new d(2);

        @Override // xsna.wzs
        public final s3q0 invoke(LayoutNode layoutNode, Object obj) {
            ae2.c(layoutNode).setReleaseBlock((izs) obj);
            return s3q0.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AndroidView.android.kt */
    public static final class e<T> extends Lambda implements wzs<LayoutNode, izs<? super T, ? extends s3q0>, s3q0> {
        public static final e i = new e(2);

        @Override // xsna.wzs
        public final s3q0 invoke(LayoutNode layoutNode, Object obj) {
            ae2.c(layoutNode).setUpdateBlock((izs) obj);
            return s3q0.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AndroidView.android.kt */
    public static final class f<T> extends Lambda implements wzs<LayoutNode, izs<? super T, ? extends s3q0>, s3q0> {
        public static final f i = new f(2);

        @Override // xsna.wzs
        public final s3q0 invoke(LayoutNode layoutNode, Object obj) {
            ae2.c(layoutNode).setReleaseBlock((izs) obj);
            return s3q0.a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    public static final class g extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ izs<Context, T> $factory;
        final /* synthetic */ q630 $modifier;
        final /* synthetic */ izs<T, s3q0> $onRelease;
        final /* synthetic */ izs<T, s3q0> $onReset;
        final /* synthetic */ izs<T, s3q0> $update;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(izs<? super Context, ? extends T> izsVar, q630 q630Var, izs<? super T, s3q0> izsVar2, izs<? super T, s3q0> izsVar3, izs<? super T, s3q0> izsVar4, int i, int i2) {
            super(2);
            this.$factory = izsVar;
            this.$modifier = q630Var;
            this.$onReset = izsVar2;
            this.$onRelease = izsVar3;
            this.$update = izsVar4;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            ae2.b(this.$factory, this.$modifier, this.$onReset, this.$onRelease, this.$update, aVar, ne7.I(this.$$changed | 1), this.$$default);
            return s3q0.a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    public static final class h extends Lambda implements izs<View, s3q0> {
        public static final h i = new h(1);

        @Override // xsna.izs
        public final /* bridge */ /* synthetic */ s3q0 invoke(View view) {
            return s3q0.a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    public static final class i extends Lambda implements gzs<LayoutNode> {
        final /* synthetic */ int $compositeKeyHash;
        final /* synthetic */ Context $context;
        final /* synthetic */ izs<Context, T> $factory;
        final /* synthetic */ View $ownerView;
        final /* synthetic */ cvi $parentReference;
        final /* synthetic */ m1h0 $stateRegistry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(Context context, izs<? super Context, ? extends T> izsVar, cvi cviVar, m1h0 m1h0Var, int i, View view) {
            super(0);
            this.$context = context;
            this.$factory = izsVar;
            this.$parentReference = cviVar;
            this.$stateRegistry = m1h0Var;
            this.$compositeKeyHash = i;
            this.$ownerView = view;
        }

        @Override // xsna.gzs
        public final LayoutNode invoke() {
            return new dxt0(this.$context, this.$factory, this.$parentReference, this.$stateRegistry, this.$compositeKeyHash, (androidx.compose.ui.node.p) this.$ownerView).getLayoutNode();
        }
    }

    /* compiled from: AndroidView.android.kt */
    public static final class j extends Lambda implements wzs<LayoutNode, q630, s3q0> {
        public static final j i = new j(2);

        @Override // xsna.wzs
        public final s3q0 invoke(LayoutNode layoutNode, q630 q630Var) {
            ae2.c(layoutNode).setModifier(q630Var);
            return s3q0.a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    public static final class k extends Lambda implements wzs<LayoutNode, azl, s3q0> {
        public static final k i = new k(2);

        @Override // xsna.wzs
        public final s3q0 invoke(LayoutNode layoutNode, azl azlVar) {
            ae2.c(layoutNode).setDensity(azlVar);
            return s3q0.a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    public static final class l extends Lambda implements wzs<LayoutNode, f5z, s3q0> {
        public static final l i = new l(2);

        @Override // xsna.wzs
        public final s3q0 invoke(LayoutNode layoutNode, f5z f5zVar) {
            ae2.c(layoutNode).setLifecycleOwner(f5zVar);
            return s3q0.a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    public static final class m extends Lambda implements wzs<LayoutNode, z1h0, s3q0> {
        public static final m i = new m(2);

        @Override // xsna.wzs
        public final s3q0 invoke(LayoutNode layoutNode, z1h0 z1h0Var) {
            ae2.c(layoutNode).setSavedStateRegistryOwner(z1h0Var);
            return s3q0.a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    public static final class n extends Lambda implements wzs<LayoutNode, LayoutDirection, s3q0> {
        public static final n i = new n(2);

        /* compiled from: AndroidView.android.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LayoutDirection.values().length];
                try {
                    iArr[LayoutDirection.Ltr.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LayoutDirection.Rtl.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // xsna.wzs
        public final s3q0 invoke(LayoutNode layoutNode, LayoutDirection layoutDirection) {
            dxt0 c = ae2.c(layoutNode);
            int i2 = a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            int i3 = 1;
            if (i2 == 1) {
                i3 = 0;
            } else if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            c.setLayoutDirection(i3);
            return s3q0.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i2, int i3, androidx.compose.runtime.a aVar, izs izsVar, izs izsVar2, q630 q630Var) {
        int i4;
        q630 q630Var2;
        int i5;
        izs izsVar3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-1783766393);
        if ((i2 & 6) == 0) {
            i4 = (M.y(izsVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                i4 |= M.y(izsVar2) ? 256 : 128;
            }
            if (M.t(i4 & 1, (i4 & 147) == 146)) {
                M.h();
                izsVar3 = izsVar2;
            } else {
                q630 q630Var3 = i6 != 0 ? q630.a.a : q630Var2;
                h hVar = a;
                izs izsVar4 = i5 != 0 ? hVar : izsVar2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1783766393, i4, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:104)");
                }
                int i7 = (i4 & 14) | 3072 | (i4 & 112) | ((i4 << 6) & 57344);
                q630 q630Var4 = q630Var3;
                b(izsVar, q630Var4, null, hVar, izsVar4, M, i7, 4);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var2 = q630Var4;
                izsVar3 = izsVar4;
            }
            s = M.s();
            if (s == null) {
                s.d = new a(i2, i3, izsVar, izsVar3, q630Var2);
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        if (M.t(i4 & 1, (i4 & 147) == 146)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends View> void b(izs<? super Context, ? extends T> izsVar, q630 q630Var, izs<? super T, s3q0> izsVar2, izs<? super T, s3q0> izsVar3, izs<? super T, s3q0> izsVar4, androidx.compose.runtime.a aVar, int i2, int i3) {
        int i4;
        q630 q630Var2;
        int i5;
        izs<? super T, s3q0> izsVar5;
        int i6;
        izs<? super T, s3q0> izsVar6;
        int i7;
        izs<? super T, s3q0> izsVar7;
        q630 q630Var3;
        izs<? super T, s3q0> izsVar8;
        izs<? super T, s3q0> izsVar9;
        izs<? super T, s3q0> izsVar10;
        androidx.compose.runtime.f s;
        izs<? super T, s3q0> izsVar11;
        androidx.compose.runtime.a M = aVar.M(-180024211);
        if ((i2 & 6) == 0) {
            i4 = (M.y(izsVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                izsVar5 = izsVar2;
                i4 |= M.y(izsVar5) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    izsVar6 = izsVar3;
                    i4 |= M.y(izsVar6) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        izsVar7 = izsVar4;
                        i4 |= M.y(izsVar7) ? 16384 : 8192;
                        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
                            q630 q630Var4 = i8 != 0 ? q630.a.a : q630Var2;
                            izs<? super T, s3q0> izsVar12 = i5 != 0 ? null : izsVar5;
                            izs<? super T, s3q0> izsVar13 = a;
                            izs<? super T, s3q0> izsVar14 = i6 != 0 ? izsVar13 : izsVar6;
                            if (i7 == 0) {
                                izsVar13 = izsVar7;
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-180024211, i4, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                            }
                            int hashCode = Long.hashCode(n34.n(M));
                            q630 c2 = qri.c(M, q630Var4.g(nvr.a).g(dxr.a.a).g(exr.a).g(zwr.a));
                            azl azlVar = (azl) M.r(uvi.h);
                            LayoutDirection layoutDirection = (LayoutDirection) M.r(uvi.n);
                            sy90 D = M.D();
                            f5z f5zVar = (f5z) M.r(bvz.a);
                            z1h0 z1h0Var = (z1h0) M.r(vvz.a);
                            if (izsVar12 != null) {
                                M.K(1313917368);
                                gzs<LayoutNode> d2 = d(izsVar, M, i4 & 14);
                                if (!(M.N() instanceof myp0)) {
                                    n34.r();
                                    throw null;
                                }
                                M.H();
                                if (M.L()) {
                                    M.I(d2);
                                } else {
                                    M.f();
                                }
                                izsVar11 = izsVar13;
                                e(M, c2, hashCode, azlVar, f5zVar, z1h0Var, layoutDirection, D);
                                k9q0.w(M, izsVar12, b.i);
                                k9q0.w(M, izsVar11, c.i);
                                k9q0.w(M, izsVar14, d.i);
                                M.G();
                                M.j();
                            } else {
                                izsVar11 = izsVar13;
                                M.K(1314774735);
                                gzs<LayoutNode> d3 = d(izsVar, M, i4 & 14);
                                if (!(M.N() instanceof myp0)) {
                                    n34.r();
                                    throw null;
                                }
                                M.P();
                                if (M.L()) {
                                    M.I(d3);
                                } else {
                                    M.f();
                                }
                                e(M, c2, hashCode, azlVar, f5zVar, z1h0Var, layoutDirection, D);
                                k9q0.w(M, izsVar11, e.i);
                                k9q0.w(M, izsVar14, f.i);
                                M.G();
                                M.j();
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            q630Var3 = q630Var4;
                            izsVar8 = izsVar12;
                            izsVar9 = izsVar14;
                            izsVar10 = izsVar11;
                        } else {
                            M.h();
                            q630Var3 = q630Var2;
                            izsVar8 = izsVar5;
                            izsVar9 = izsVar6;
                            izsVar10 = izsVar7;
                        }
                        s = M.s();
                        if (s != null) {
                            s.d = new g(izsVar, q630Var3, izsVar8, izsVar9, izsVar10, i2, i3);
                            return;
                        }
                        return;
                    }
                    izsVar7 = izsVar4;
                    if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
                    }
                    s = M.s();
                    if (s != null) {
                    }
                }
                izsVar6 = izsVar3;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                izsVar7 = izsVar4;
                if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
                }
                s = M.s();
                if (s != null) {
                }
            }
            izsVar5 = izsVar2;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            izsVar6 = izsVar3;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            izsVar7 = izsVar4;
            if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        izsVar5 = izsVar2;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        izsVar6 = izsVar3;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        izsVar7 = izsVar4;
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
        }
        s = M.s();
        if (s != null) {
        }
    }

    public static final dxt0 c(LayoutNode layoutNode) {
        dxt0 dxt0Var = layoutNode.p;
        if (dxt0Var != null) {
            return dxt0Var;
        }
        throw pm0.f("Required value was null.");
    }

    public static final <T extends View> gzs<LayoutNode> d(izs<? super Context, ? extends T> izsVar, androidx.compose.runtime.a aVar, int i2) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2030558801, i2, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:252)");
        }
        int hashCode = Long.hashCode(n34.n(aVar));
        Context context = (Context) aVar.r(AndroidCompositionLocals_androidKt.b);
        cvi z = n34.z(aVar);
        m1h0 m1h0Var = (m1h0) aVar.r(o1h0.a);
        View view = (View) aVar.r(AndroidCompositionLocals_androidKt.f);
        boolean y = ((((i2 & 14) ^ 6) > 4 && aVar.J(izsVar)) || (i2 & 6) == 4) | aVar.y(context) | aVar.y(z) | aVar.y(m1h0Var) | aVar.o(hashCode) | aVar.y(view);
        Object x = aVar.x();
        if (y || x == a.C0011a.a) {
            Object iVar = new i(context, izsVar, z, m1h0Var, hashCode, view);
            aVar.R(iVar);
            x = iVar;
        }
        gzs<LayoutNode> gzsVar = (gzs) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return gzsVar;
    }

    public static final <T extends View> void e(androidx.compose.runtime.a aVar, q630 q630Var, int i2, azl azlVar, f5z f5zVar, z1h0 z1h0Var, LayoutDirection layoutDirection, svi sviVar) {
        cri.h7.getClass();
        k9q0.w(aVar, sviVar, cri.a.e);
        k9q0.w(aVar, q630Var, j.i);
        k9q0.w(aVar, azlVar, k.i);
        k9q0.w(aVar, f5zVar, l.i);
        k9q0.w(aVar, z1h0Var, m.i);
        k9q0.w(aVar, layoutDirection, n.i);
        k9q0.w(aVar, Integer.valueOf(i2), cri.a.g);
    }
}
