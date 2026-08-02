package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.group.header.GroupHeader$Right;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: GamesCatalogSectionHeader.kt */
/* loaded from: classes17.dex */
public final class cet {
    public static final void a(final xdt xdtVar, final rha rhaVar, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        com.vk.core.compose.component.semantics.a aVar3;
        final q630 q630Var2 = q630Var;
        androidx.compose.runtime.a M = aVar.M(1903290273);
        if ((i & 6) == 0) {
            i2 = (M.J(xdtVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(rhaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var2) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1903290273, i2, -1, "com.vk.games.presentation.components.GamesCatalogSectionHeader (GamesCatalogSectionHeader.kt:30)");
            }
            String O = d370.O(R.string.vk_accessibility_header, new Object[]{xdtVar.c}, M);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = bap.j(EmptyCoroutineContext.b, M);
                M.R(x2);
            }
            Object obj2 = (yvj) x2;
            if (xdtVar.d) {
                M.K(-1237216802);
                mlg0 a = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false);
                int i3 = i2 & 896;
                int i4 = i2 & 14;
                boolean y = M.y(obj2) | (i3 == 256) | (i4 == 4);
                Object x3 = M.x();
                if (y || x3 == obj) {
                    x3 = new com.vk.movika.sdk.base.ui.u0(obj2, izsVar, xdtVar, 1);
                    M.R(x3);
                }
                q630 b = ojc.b(q630Var2, sg50Var, a, false, null, (gzs) x3, 28);
                String str = xdtVar.c;
                if (rhaVar.a) {
                    M.K(-1236620610);
                    boolean J = M.J(O);
                    Object x4 = M.x();
                    if (J || x4 == obj) {
                        x4 = new com.vk.movika.sdk.base.logic.processor.b(O, 1);
                        M.R(x4);
                    }
                    aVar3 = com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3);
                    M.j();
                } else {
                    M.K(-1236508886);
                    SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
                    SemanticsConfiguration.Priority priority = SemanticsConfiguration.Priority.High;
                    boolean J2 = M.J(O);
                    Object x5 = M.x();
                    if (J2 || x5 == obj) {
                        x5 = new com.vk.movika.sdk.base.logic.processor.c(O, 3);
                        M.R(x5);
                    }
                    com.vk.core.compose.component.semantics.a aVar4 = new com.vk.core.compose.component.semantics.a((izs) x5, mode, priority);
                    M.j();
                    aVar3 = aVar4;
                }
                com.vk.core.compose.component.group.header.f a2 = f.a.a(str, null, null, null, null, null, aVar3, null, false, M, 805306368, 446);
                boolean z = (i3 == 256) | (i4 == 4);
                Object x6 = M.x();
                if (z || x6 == obj) {
                    x6 = new sk(15, izsVar, xdtVar);
                    M.R(x6);
                }
                com.vk.core.compose.component.group.header.g.b(a2, b, null, null, null, GroupHeader$Right.c.a(null, null, GroupHeader$Right.b.a.C0746a.a(3072, 6, M, null, null, (gzs) x6), null, M, 11), false, M, 0, 92);
                M.j();
                q630Var2 = q630Var;
                aVar2 = M;
            } else {
                M.K(-1235877354);
                boolean J3 = M.J(O);
                Object x7 = M.x();
                if (J3 || x7 == obj) {
                    x7 = new zdt(O, 0);
                    M.R(x7);
                }
                q630Var2 = q630Var;
                com.vk.core.compose.component.group.header.g.b(f.a.a(xdtVar.c, null, null, null, null, null, null, null, false, M, 805306368, 510), egi0.b(q630Var2, false, (izs) x7), null, null, null, null, false, M, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                aVar2 = M;
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.aet
                @Override // xsna.wzs
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    cet.a(xdt.this, rhaVar, izsVar, q630Var2, (androidx.compose.runtime.a) obj3, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
