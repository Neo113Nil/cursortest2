package xsna;

import android.content.res.Resources;
import android.graphics.Bitmap;
import kotlin.Pair;

/* compiled from: MusicPlayerNotificationBuilder.kt */
/* loaded from: classes3.dex */
public final class zx40 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Resources c;

    public zx40(yx40 yx40Var, int i, Resources resources) {
        this.b = i;
        this.c = resources;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (s101.q(bitmap)) {
            return io.reactivex.rxjava3.core.q.N(new Pair(bitmap, null));
        }
        return mcr0.g(this.c, this.b).U(new iw3(new wh1(28), 23));
    }
}
