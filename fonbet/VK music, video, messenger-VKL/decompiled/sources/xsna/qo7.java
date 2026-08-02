package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.modal.Mode;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import xsna.q630;

/* compiled from: BookingEditDeleteConfirmationModal.kt */
/* loaded from: classes18.dex */
public final class qo7 {
    public final mtk0 a;
    public final wh50 b;
    public final q630 c;
    public final q630 d;
    public final q630 e;
    public final q630 f;
    public final q630 g;
    public final q630 h;
    public final q630 i;

    public qo7(izs izsVar, mtk0 mtk0Var) {
        this.a = mtk0Var;
        this.b = androidx.compose.runtime.k.b(izsVar);
        q630.a aVar = q630.a.a;
        q630 f = txj0.f(aVar, 1.0f);
        this.c = f;
        this.d = s200.D(f, 16);
        this.e = txj0.h(aVar, 10);
        this.f = txj0.h(aVar, 20);
        this.g = txj0.h(aVar, 32);
        this.h = txj0.h(aVar, 12);
        this.i = txj0.h(aVar, 8);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-528235893);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-528235893, i2, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditDeleteConfirmationModalImpl.Content (BookingEditDeleteConfirmationModal.kt:64)");
            }
            BookingEditScreenState.g gVar = (BookingEditScreenState.g) this.a.getValue();
            if (gVar == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new o85(this, i, 1);
                    return;
                }
                return;
            }
            Mode mode = Mode.Card;
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(this, 9);
                M.R(x);
            }
            aVar2 = M;
            a030.b(mode, (gzs) x, null, null, null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, false, null, false, null, null, false, null, null, kai.c(-420339351, new po7(0, this, gVar), M), aVar2, 6, 100663296, 262140);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630.a.a;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s2 = aVar2.s();
        if (s2 != null) {
            s2.d = new r85(this, q630Var2, i, 1);
        }
    }
}
