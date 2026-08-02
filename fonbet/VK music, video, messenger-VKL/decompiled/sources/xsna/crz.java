package xsna;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.video.ui.upload.impl.publish.presentation.publish.compose.dialog.exitconfirm.ExitConfirmDialogViewState;
import com.vk.video.ui.upload.impl.publish.presentation.publish.compose.dialog.publicationdate.PublicationDateDialogViewState;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import xsna.kdh0;
import xsna.q630;
import xsna.yqx0;

/* compiled from: Loaded.kt */
/* loaded from: classes7.dex */
public final class crz {
    public static final void a(kdh0.a aVar, izs<? super dbe0, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(781743536);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(781743536, i2, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.screen.Dialogs (Loaded.kt:267)");
            }
            PublicationDateDialogViewState publicationDateDialogViewState = aVar.p;
            ExitConfirmDialogViewState exitConfirmDialogViewState = aVar.q;
            if (publicationDateDialogViewState != null) {
                M.K(1609154710);
                bbe0.a(aVar.p, izsVar, null, M, i2 & 112);
            } else {
                M.K(1600055218);
            }
            M.j();
            if (exitConfirmDialogViewState != null) {
                M.K(1609317150);
                z4q.a(exitConfirmDialogViewState, izsVar, null, M, i2 & 112);
            } else {
                M.K(1600055218);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n85(aVar, izsVar, i, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final kdh0.a aVar, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        q630 q630Var2;
        Object obj;
        androidx.compose.runtime.a M = aVar2.M(560315247);
        int i2 = i | (M.J(aVar) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        boolean z = true;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(560315247, i3, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.screen.Loaded (Loaded.kt:61)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            Object obj2 = x;
            if (x == c0012a) {
                HashSet hashSet = iah0.a;
                Boolean valueOf = Boolean.valueOf(fnj.d(context));
                M.R(valueOf);
                obj2 = valueOf;
            }
            final boolean booleanValue = ((Boolean) obj2).booleanValue();
            final xvy a = zvy.a(0, 3, M);
            boolean J = M.J(a);
            Object x2 = M.x();
            Object obj3 = x2;
            if (J || x2 == c0012a) {
                f1m b = bbk0.b(new nly(a, z ? 1 : 0));
                M.R(b);
                obj3 = b;
            }
            Iterator it = ((List) ((mtk0) obj3).getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (epx.f(((xuy) obj).getKey(), "ITEM_KEY_ADVANCED")) {
                        break;
                    }
                }
            }
            boolean z2 = obj != null;
            Boolean valueOf2 = Boolean.valueOf(z2);
            int i4 = i3 & 112;
            boolean l = (i4 == 32) | M.l(z2);
            Object x3 = M.x();
            Object obj4 = x3;
            if (l || x3 == c0012a) {
                arz arzVar = new arz(null, izsVar, z2);
                M.R(arzVar);
                obj4 = arzVar;
            }
            bap.g(valueOf2, (wzs) obj4, M, 0);
            Boolean valueOf3 = Boolean.valueOf(aVar.h.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1466917860, 6, -1, "androidx.compose.foundation.layout.<get-ime> (WindowInsets.android.kt:160)");
            }
            WeakHashMap<View, yqx0> weakHashMap = yqx0.w;
            te2 te2Var = yqx0.a.c(M).c;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean z3 = epx.f(valueOf3, Boolean.TRUE) && ((Boolean) androidx.compose.runtime.k.c(Boolean.valueOf(te2Var.e().d > 0), M, 0).getValue()).booleanValue();
            Boolean valueOf4 = Boolean.valueOf(z3);
            boolean l2 = M.l(z3) | M.J(a);
            Object x4 = M.x();
            Object obj5 = x4;
            if (l2 || x4 == c0012a) {
                brz brzVar = new brz(z3, a, null);
                M.R(brzVar);
                obj5 = brzVar;
            }
            bap.g(valueOf4, (wzs) obj5, M, 0);
            q630.a aVar3 = q630.a.a;
            img0.a(aVar, izsVar, aVar3, kai.c(1000023258, new yzs() { // from class: xsna.xqz
                @Override // xsna.yzs
                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                    s890 s890Var = (s890) obj6;
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj7;
                    int intValue = ((Integer) obj8).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar4.J(s890Var) ? 4 : 2;
                    }
                    if (aVar4.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1000023258, intValue, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.screen.Loaded.<anonymous> (Loaded.kt:97)");
                        }
                        q630 C = s200.C(q630.a.a, s890Var);
                        kdh0.a aVar5 = aVar;
                        boolean J2 = aVar4.J(aVar5);
                        izs izsVar2 = izsVar;
                        boolean J3 = J2 | aVar4.J(izsVar2);
                        Object x5 = aVar4.x();
                        if (J3 || x5 == a.C0011a.a) {
                            x5 = new grh(aVar5, booleanValue, izsVar2);
                            aVar4.R(x5);
                        }
                        x1v0.a(C, xvy.this, null, null, null, null, false, null, (izs) x5, aVar4, 0, IronSourceError.ERROR_CODE_INIT_FAILED);
                        crz.c(aVar5, izsVar2, aVar4, 0);
                        crz.a(aVar5, izsVar2, aVar4, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), M, (i3 & 14) | 3072 | i4 | 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new b6v(aVar, izsVar, q630Var2, i, 1);
        }
    }

    public static final void c(kdh0.a aVar, izs<? super dbe0, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(-753708871);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-753708871, i2, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.screen.Modals (Loaded.kt:255)");
            }
            if (aVar.o) {
                M.K(348193725);
                wvr0.a((i2 >> 3) & 14, M, izsVar, null);
            } else {
                M.K(339323881);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zd0(aVar, izsVar, i, 2);
        }
    }
}
