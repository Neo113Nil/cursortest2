package xsna;

import android.content.Context;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class yii implements zzs {
    public final /* synthetic */ int b;

    public /* synthetic */ yii(int i) {
        this.b = i;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        switch (this.b) {
            case 0:
                z37 z37Var = (z37) obj;
                hv70 hv70Var = (hv70) obj2;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    i = (aVar.J(z37Var) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= aVar.J(hv70Var) ? 32 : 16;
                }
                if (aVar.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1672765563, i, -1, "com.vk.music.podcast.impl.ui.offlinepage.presentation.compose.ComposableSingletons$OfflinePodcastEpisodesMviComposeComponentKt.lambda$-1672765563.<anonymous> (OfflinePodcastEpisodesMviComposeComponent.kt:109)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-94430144, new h08(2, hv70Var, z37Var), aVar), aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                n250 n250Var = new n250((Context) obj4);
                n250Var.setText((String) obj3);
                return n250Var;
        }
    }
}
