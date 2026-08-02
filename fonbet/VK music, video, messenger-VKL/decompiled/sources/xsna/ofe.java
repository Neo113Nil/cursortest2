package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.gl.tf.Tensorflow;
import xsna.q630;

/* compiled from: ClipsHintWrapperImpl.kt */
/* loaded from: classes17.dex */
public final class ofe {
    public static final ofe a = new ofe();

    public final void a(String str, gzs<s3q0> gzsVar, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar, androidx.compose.runtime.a aVar, int i) {
        String str2;
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-369047914);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (M.J(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(wzsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-369047914, i2, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.ClipsHintWrapperImpl.HintWrapper (ClipsHintWrapperImpl.kt:19)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new a(gzsVar);
                M.R(x);
            }
            aVar2 = M;
            o9v0.a(str2, (a) x, q630.a.a, null, null, null, null, null, null, null, null, null, null, false, null, true, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, kai.c(1938391209, new mfe(0, wzsVar), M), aVar2, (i2 & 14) | Tensorflow.FRAME_WIDTH, 805502976, 491512);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new nfe(this, str, gzsVar, wzsVar, i, 0);
        }
    }

    /* compiled from: ClipsHintWrapperImpl.kt */
    public static final class a implements etv0 {
        public final wh50 a = androidx.compose.runtime.k.b(Boolean.TRUE);
        public final /* synthetic */ gzs<s3q0> b;

        public a(gzs<s3q0> gzsVar) {
            this.b = gzsVar;
        }

        @Override // xsna.etv0
        public final void b(boolean z) {
            setVisible(false);
            this.b.invoke();
        }

        @Override // xsna.etv0
        public final boolean isVisible() {
            return ((Boolean) ((zak0) this.a).getValue()).booleanValue();
        }

        @Override // xsna.etv0
        public final void setVisible(boolean z) {
            ((zak0) this.a).setValue(Boolean.valueOf(z));
        }

        @Override // xsna.etv0
        public final void a() {
        }
    }
}
