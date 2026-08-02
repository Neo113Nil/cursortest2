package defpackage;

import android.animation.ValueAnimator;
import com.yandex.alicekit.core.artist.MorphablePathArtistDrawable;

/* loaded from: classes11.dex */
public final /* synthetic */ class i730 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ ValueAnimator c;

    public /* synthetic */ i730(tls tlsVar, ValueAnimator valueAnimator, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = valueAnimator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                MorphablePathArtistDrawable.setPathDataListener$lambda$1(this.b, this.c, valueAnimator);
                break;
            default:
                com.lightside.artists.MorphablePathArtistDrawable.setPathDataListener$lambda$2(this.b, this.c, valueAnimator);
                break;
        }
    }
}
