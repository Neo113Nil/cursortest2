package xsna;

import android.media.MediaMetadataRetriever;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class i020 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ i020(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                ((MediaMetadataRetriever) obj).setDataSource(str);
                return s3q0.a;
            default:
                k720 k720Var = k720.a;
                String u = brm0.u((byte[]) obj);
                if (drm0.D(u, "error", false)) {
                    u = "";
                }
                return new Pair(str, u);
        }
    }
}
