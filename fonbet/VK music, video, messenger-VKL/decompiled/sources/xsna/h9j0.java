package xsna;

import androidx.compose.runtime.a;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.Locale;
import xsna.q630;

/* compiled from: ShareTimeView.kt */
/* loaded from: classes7.dex */
public final class h9j0 {
    public static final void a(final int i, boolean z, final izs<? super Boolean, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i2) {
        final boolean z2;
        androidx.compose.runtime.a M = aVar.M(2005903824);
        int i3 = (M.o(i) ? 4 : 2) | i2 | (M.l(z) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2005903824, i3, -1, "com.vk.video.ui.share.impl.presentation.views.ShareTimeView (ShareTimeView.kt:21)");
            }
            q630 h = txj0.h(q630.a.a, 48);
            int i4 = i / 3600;
            int i5 = (i / 60) % 60;
            int i6 = i % 60;
            String O = d370.O(R.string.video_share_dialog_start_with, new Object[]{i4 > 0 ? String.format(Locale.getDefault(), "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)}, 3)) : String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i6)}, 2))}, M);
            boolean z3 = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object x = M.x();
            if (z3 || x == a.C0011a.a) {
                x = new pl80(izsVar, z, 1);
                M.R(x);
            }
            z2 = z;
            eku0.d(O, (gzs) x, h, z2, null, false, false, M, ((i3 << 6) & 7168) | 384, 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            z2 = z;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, i2, izsVar, z2) { // from class: xsna.g9j0
                public final /* synthetic */ int b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ izs d;

                {
                    this.c = z2;
                    this.d = izsVar;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    h9j0.a(this.b, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
