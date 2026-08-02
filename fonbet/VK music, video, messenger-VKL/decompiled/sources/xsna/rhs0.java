package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import com.vk.dto.common.VideoFile;

/* compiled from: VideoDownloadButton.kt */
/* loaded from: classes16.dex */
public final class rhs0 {
    public static final void a(final long j, final m9o m9oVar, final gzs gzsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        gzs gzsVar2;
        q630 q630Var2;
        m9o m9oVar2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar;
        androidx.compose.runtime.a M = aVar.M(-2033567009);
        if ((i & 6) == 0) {
            i2 = (M.p(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(m9oVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            gzsVar2 = gzsVar;
            i2 |= M.y(gzsVar2) ? 256 : 128;
        } else {
            gzsVar2 = gzsVar;
        }
        if ((i & 3072) == 0) {
            q630Var2 = q630Var;
            i2 |= M.J(q630Var2) ? 2048 : 1024;
        } else {
            q630Var2 = q630Var;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2033567009, i3, -1, "com.vk.fullscreenvideo.icons.download.VideoDownloadButton (VideoDownloadButton.kt:21)");
            }
            VideoFile videoFile = m9oVar.c;
            Object r1 = videoFile != null ? videoFile.r1() : null;
            boolean J = M.J(r1);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (J || x == obj) {
                x = (j8o) gzsVar2.invoke();
                M.R(x);
            }
            final j8o j8oVar = (j8o) x;
            if (j8oVar == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    final gzs gzsVar3 = gzsVar2;
                    final q630 q630Var3 = q630Var2;
                    wzsVar = new wzs() { // from class: xsna.nhs0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            rhs0.a(j, m9oVar, gzsVar3, q630Var3, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                            return s3q0.a;
                        }
                    };
                    s.d = wzsVar;
                }
                return;
            }
            M.W(-47761862, r1);
            int i4 = i3 & 112;
            boolean y = M.y(j8oVar) | ((i3 & 896) == 256) | ((i3 & 14) == 4) | (i4 == 32);
            Object x2 = M.x();
            if (y || x2 == obj) {
                Object obj2 = new izs() { // from class: xsna.ohs0
                    @Override // xsna.izs
                    public final Object invoke(Object obj3) {
                        j8o j8oVar2;
                        j8o j8oVar3 = j8o.this;
                        if ((j8oVar3.getView().getParent() != null ? j8oVar3 : null) == null || (j8oVar2 = (j8o) gzsVar.invoke()) == null) {
                            j8oVar2 = j8oVar3;
                        }
                        View view = j8oVar2.getView();
                        view.setTag(j8oVar2);
                        boolean isAttachedToWindow = view.isAttachedToWindow();
                        long j2 = j;
                        m9o m9oVar3 = m9oVar;
                        if (!isAttachedToWindow) {
                            view.addOnAttachStateChangeListener(new qhs0(view, j8oVar3, j2, m9oVar3));
                            return view;
                        }
                        j8oVar3.setTint(f870.H(j2));
                        j8oVar3.b(m9oVar3.b, m9oVar3.a);
                        return view;
                    }
                };
                m9oVar2 = m9oVar;
                M.R(obj2);
                x2 = obj2;
            } else {
                m9oVar2 = m9oVar;
            }
            izs izsVar = (izs) x2;
            boolean J2 = M.J(r1) | (i4 == 32);
            Object x3 = M.x();
            if (J2 || x3 == obj) {
                x3 = new l1k0(6, m9oVar2, r1);
                M.R(x3);
            }
            aVar2 = M;
            ae2.a((i3 >> 6) & 112, 0, aVar2, izsVar, (izs) x3, q630Var);
            aVar2.a0();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            m9oVar2 = m9oVar;
            aVar2 = M;
            aVar2.h();
        }
        s = aVar2.s();
        if (s != null) {
            final m9o m9oVar3 = m9oVar2;
            wzsVar = new wzs() { // from class: xsna.phs0
                @Override // xsna.wzs
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    rhs0.a(j, m9oVar3, gzsVar, q630Var, (androidx.compose.runtime.a) obj3, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
            s.d = wzsVar;
        }
    }
}
