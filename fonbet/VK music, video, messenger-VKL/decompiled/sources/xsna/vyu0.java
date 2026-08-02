package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.ListIterator;
import xsna.cri;
import xsna.dt1;
import xsna.k8s;
import xsna.q630;

/* compiled from: VkHorizontalFormFieldGroup.kt */
/* loaded from: classes17.dex */
public final class vyu0 {
    public static final void a(final k8s.a aVar, final g8s g8sVar, q630 q630Var, final h8s h8sVar, e8s e8sVar, f8s f8sVar, androidx.compose.runtime.a aVar2, final int i, final int i2) {
        q630 q630Var2;
        int i3;
        e8s e8sVar2;
        int i4;
        f8s f8sVar2;
        int i5;
        final f8s f8sVar3;
        androidx.compose.runtime.a M = aVar2.M(-316744512);
        int i6 = i | (M.J(g8sVar) ? 32 : 16);
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 = i6 | 384;
            q630Var2 = q630Var;
        } else {
            q630Var2 = q630Var;
            i3 = i6 | (M.J(q630Var2) ? 256 : 128);
        }
        int i8 = i3 | (M.J(h8sVar) ? 2048 : 1024);
        int i9 = i2 & 8;
        if (i9 != 0) {
            i4 = i8 | 24576;
            e8sVar2 = e8sVar;
        } else {
            e8sVar2 = e8sVar;
            i4 = i8 | (M.J(e8sVar2) ? 16384 : 8192);
        }
        int i10 = i2 & 16;
        if (i10 != 0) {
            i5 = i4 | 196608;
            f8sVar2 = f8sVar;
        } else {
            f8sVar2 = f8sVar;
            i5 = i4 | (M.J(f8sVar2) ? 131072 : 65536);
        }
        if (M.t(i5 & 1, (74897 & i5) != 74896)) {
            if (i7 != 0) {
                q630Var2 = q630.a.a;
            }
            if (i9 != 0) {
                e8sVar2 = null;
            }
            f8s f8sVar4 = i10 != 0 ? null : f8sVar2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-316744512, i5, -1, "com.vk.core.compose.component.form.GroupField (VkHorizontalFormFieldGroup.kt:92)");
            }
            nvu0.b(g8sVar, false, q630Var2, h8sVar, e8sVar2, f8sVar4, M, ((i5 >> 3) & 14) | 48 | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f8sVar3 = f8sVar4;
        } else {
            M.h();
            f8sVar3 = f8sVar2;
        }
        final q630 q630Var3 = q630Var2;
        final e8s e8sVar3 = e8sVar2;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(g8sVar, q630Var3, h8sVar, e8sVar3, f8sVar3, i, i2) { // from class: xsna.uyu0
                public final /* synthetic */ g8s c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ h8s e;
                public final /* synthetic */ e8s f;
                public final /* synthetic */ f8s g;
                public final /* synthetic */ int h;

                {
                    this.h = i2;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    vyu0.a(k8s.a.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I, this.h);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(odv odvVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(694676790);
        if ((i & 6) == 0) {
            i2 = (M.J(odvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(694676790, i2, -1, "com.vk.core.compose.component.form.Scoped (VkHorizontalFormFieldGroup.kt:54)");
            }
            q630 F = s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.v);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.K(1227343298);
            ListIterator<ndv> listIterator = odvVar.b.listIterator();
            while (true) {
                duk0 duk0Var = (duk0) listIterator;
                if (!duk0Var.hasNext()) {
                    break;
                } else {
                    ((ndv) duk0Var.next()).a.invoke(tpg0.a, M, 6);
                }
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ks3(odvVar, q630Var, i, 11);
        }
    }

    /* JADX WARN: Finally extract failed */
    public static final void c(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        int i2;
        uh50 C;
        androidx.compose.runtime.a M = aVar.M(-883155232);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-883155232, i2, -1, "com.vk.core.compose.component.form.VkHorizontalFormFieldGroup (VkHorizontalFormFieldGroup.kt:38)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new odv();
                M.R(x);
            }
            odv odvVar = (odv) x;
            odvVar.a.clear();
            izsVar.invoke(odvVar);
            ArrayList arrayList = odvVar.a;
            SnapshotStateList<ndv> snapshotStateList = odvVar.b;
            dak0 j = qak0.j();
            uh50 uh50Var = j instanceof uh50 ? (uh50) j : null;
            if (uh50Var == null || (C = uh50Var.C(null, null)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                dak0 j2 = C.j();
                try {
                    snapshotStateList.clear();
                    snapshotStateList.addAll(arrayList);
                    arrayList.clear();
                    s3q0 s3q0Var = s3q0.a;
                    C.w().a();
                    C.c();
                    b(odvVar, q630Var, M, (i2 << 3) & 112);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } finally {
                    dak0.q(j2);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C.c();
                    throw th2;
                }
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new g4o(q630Var, izsVar, i, 4);
        }
    }
}
