package xsna;

import android.content.Context;
import androidx.compose.material.SnackbarDuration;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: SnackbarHost.kt */
/* loaded from: classes11.dex */
public final class b8k0 {

    /* compiled from: SnackbarHost.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            try {
                iArr[SnackbarDuration.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnackbarDuration.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SnackbarDuration.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(k7k0 k7k0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        k7k0 k7k0Var2;
        jai jaiVar = sp.f;
        androidx.compose.runtime.a M = aVar.M(1354335728);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? M.J(k7k0Var) : M.y(k7k0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(jaiVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1354335728, i2, -1, "androidx.compose.material.FadeInFadeOutWithScale (SnackbarHost.kt:245)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new siq();
                M.R(x);
            }
            final siq siqVar = (siq) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-726638443, 6, -1, "androidx.compose.material.getString (Strings.android.kt:25)");
            }
            M.r(AndroidCompositionLocals_androidKt.a);
            final String string = ((Context) M.r(AndroidCompositionLocals_androidKt.b)).getResources().getString(R.string.mc2_snackbar_pane_title);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object obj = siqVar.a;
            ArrayList arrayList = siqVar.b;
            if (epx.f(k7k0Var, obj)) {
                k7k0Var2 = k7k0Var;
                M.K(95881138);
                M.j();
            } else {
                M.K(93279711);
                siqVar.a = k7k0Var;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add((k7k0) ((qiq) arrayList.get(i3)).a);
                }
                final ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(k7k0Var)) {
                    arrayList3.add(k7k0Var);
                }
                arrayList.clear();
                ArrayList a2 = hgz.a(arrayList3);
                int size2 = a2.size();
                int i4 = 0;
                while (i4 < size2) {
                    final k7k0 k7k0Var3 = (k7k0) a2.get(i4);
                    final k7k0 k7k0Var4 = k7k0Var;
                    arrayList.add(new qiq(k7k0Var3, kai.c(-1032415134, new yzs() { // from class: xsna.y7k0
                        @Override // xsna.yzs
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            Boolean bool;
                            Object c8k0Var;
                            if2 if2Var;
                            a.C0011a.C0012a c0012a;
                            wzs wzsVar = (wzs) obj2;
                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                            int intValue = ((Integer) obj4).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= aVar2.y(wzsVar) ? 4 : 2;
                            }
                            if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-1032415134, intValue, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:257)");
                                }
                                k7k0 k7k0Var5 = k7k0.this;
                                boolean f = epx.f(k7k0Var5, k7k0Var4);
                                int i5 = f ? 150 : 75;
                                int i6 = (!f || hgz.a(arrayList3).size() == 1) ? 0 : 75;
                                dtp0 dtp0Var = new dtp0(i5, i6, luo.d);
                                boolean y = aVar2.y(k7k0Var5);
                                siq siqVar2 = siqVar;
                                boolean y2 = y | aVar2.y(siqVar2);
                                Object x2 = aVar2.x();
                                a.C0011a.C0012a c0012a2 = a.C0011a.a;
                                if (y2 || x2 == c0012a2) {
                                    x2 = new fy0(21, k7k0Var5, siqVar2);
                                    aVar2.R(x2);
                                }
                                gzs gzsVar = (gzs) x2;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1016418159, 0, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:340)");
                                }
                                Object x3 = aVar2.x();
                                if (x3 == c0012a2) {
                                    x3 = qf2.a(!f ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    aVar2.R(x3);
                                }
                                if2 if2Var2 = (if2) x3;
                                Boolean valueOf = Boolean.valueOf(f);
                                boolean y3 = aVar2.y(if2Var2) | aVar2.l(f) | aVar2.y(dtp0Var) | aVar2.J(gzsVar);
                                Object x4 = aVar2.x();
                                if (y3 || x4 == c0012a2) {
                                    bool = valueOf;
                                    if2Var = if2Var2;
                                    c0012a = c0012a2;
                                    c8k0Var = new c8k0(if2Var, f, dtp0Var, gzsVar, null);
                                    aVar2.R(c8k0Var);
                                } else {
                                    c8k0Var = x4;
                                    bool = valueOf;
                                    if2Var = if2Var2;
                                    c0012a = c0012a2;
                                }
                                bap.g(bool, (wzs) c8k0Var, aVar2, 0);
                                kq2<T, V> kq2Var = if2Var.c;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                dtp0 dtp0Var2 = new dtp0(i5, i6, luo.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(2003504988, 0, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:350)");
                                }
                                Object x5 = aVar2.x();
                                if (x5 == c0012a) {
                                    x5 = qf2.a(f ? 0.8f : 1.0f);
                                    aVar2.R(x5);
                                }
                                if2 if2Var3 = (if2) x5;
                                Boolean valueOf2 = Boolean.valueOf(f);
                                boolean y4 = aVar2.y(if2Var3) | aVar2.l(f) | aVar2.y(dtp0Var2);
                                Object x6 = aVar2.x();
                                if (y4 || x6 == c0012a) {
                                    x6 = new d8k0(if2Var3, f, dtp0Var2, null);
                                    aVar2.R(x6);
                                }
                                bap.g(valueOf2, (wzs) x6, aVar2, 0);
                                kq2<T, V> kq2Var2 = if2Var3.c;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                q630 b = rdu.b(q630.a.a, ((Number) ((zak0) kq2Var2.c).getValue()).floatValue(), ((Number) ((zak0) kq2Var2.c).getValue()).floatValue(), ((Number) ((zak0) kq2Var.c).getValue()).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 131064);
                                boolean l = aVar2.l(f);
                                String str = string;
                                boolean J = l | aVar2.J(str) | aVar2.y(k7k0Var5);
                                Object x7 = aVar2.x();
                                if (J || x7 == c0012a) {
                                    x7 = new z7k0(f, str, k7k0Var5, 0);
                                    aVar2.R(x7);
                                }
                                q630 b2 = egi0.b(b, false, (izs) x7);
                                dt1.a.getClass();
                                cp10 d = ja8.d(dt1.a.b, false);
                                int m = n34.m(aVar2);
                                sy90 D = aVar2.D();
                                q630 c = qri.c(aVar2, b2);
                                cri.h7.getClass();
                                LayoutNode.a aVar3 = cri.a.b;
                                if (aVar2.N() == null) {
                                    n34.r();
                                    throw null;
                                }
                                aVar2.H();
                                if (aVar2.L()) {
                                    aVar2.I(aVar3);
                                } else {
                                    aVar2.f();
                                }
                                k9q0.w(aVar2, d, cri.a.f);
                                k9q0.w(aVar2, D, cri.a.e);
                                cri.a.b bVar = cri.a.g;
                                if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m))) {
                                    kr.a(m, aVar2, m, bVar);
                                }
                                k9q0.w(aVar2, c, cri.a.d);
                                wzsVar.invoke(aVar2, Integer.valueOf(intValue & 14));
                                aVar2.G();
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar2.h();
                            }
                            return s3q0.a;
                        }
                    }, M)));
                    i4++;
                    k7k0Var = k7k0Var4;
                }
                k7k0Var2 = k7k0Var;
                M.j();
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int m = n34.m(M);
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            cri.a.b bVar = cri.a.g;
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m))) {
                kr.a(m, M, m, bVar);
            }
            k9q0.w(M, c, cri.a.d);
            siqVar.c = n34.o(M);
            M.K(-1757732554);
            int size3 = arrayList.size();
            for (int i5 = 0; i5 < size3; i5++) {
                qiq qiqVar = (qiq) arrayList.get(i5);
                k7k0 k7k0Var5 = (k7k0) qiqVar.a;
                jai jaiVar2 = qiqVar.b;
                M.W(-1515535286, k7k0Var5);
                jaiVar2.invoke(kai.c(2017516783, new com.vk.movika.tools.controls.seekbar.i(k7k0Var5, 15), M), M, 6);
                M.a0();
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            k7k0Var2 = k7k0Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mka(k7k0Var2, q630Var, i, 2);
        }
    }

    public static final void b(e8k0 e8k0Var, q630 q630Var, yzs yzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1351125615);
        if ((i & 6) == 0) {
            i2 = (M.J(e8k0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | Tensorflow.FRAME_WIDTH;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            yzsVar = sp.f;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1351125615, i3, -1, "androidx.compose.material.SnackbarHost (SnackbarHost.kt:155)");
            }
            k7k0 k7k0Var = (k7k0) ((zak0) e8k0Var.a).getValue();
            kl klVar = (kl) M.r(uvi.a);
            boolean y = M.y(k7k0Var) | M.y(klVar);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new a8k0(k7k0Var, klVar, null);
                M.R(x);
            }
            bap.g(k7k0Var, (wzs) x, M, 0);
            k7k0 k7k0Var2 = (k7k0) ((zak0) e8k0Var.a).getValue();
            int i4 = i3 & 1008;
            q630.a aVar2 = q630.a.a;
            a(k7k0Var2, aVar2, M, i4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new or3(e8k0Var, q630Var, yzsVar, i);
        }
    }
}
