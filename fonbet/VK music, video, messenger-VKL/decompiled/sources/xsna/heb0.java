package xsna;

import android.view.ViewGroup;
import com.vk.music.view.ThumbsImageView;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PlaylistThumbVC.kt */
/* loaded from: classes2.dex */
public final class heb0 {
    public static final float i = cn70.c(3);
    public ThumbsImageView a;
    public ThumbsImageView b;
    public ThumbsImageView c;
    public v01 d;
    public final Object e;
    public final Object f;
    public final Object g;
    public vvn h;

    public heb0() {
        ubw ubwVar = new ubw(this, 25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, ubwVar);
        this.f = msy.a(lazyThreadSafetyMode, new wp40(this, 13));
        this.g = msy.a(lazyThreadSafetyMode, new ye80(this, 4));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(ThumbsImageView thumbsImageView) {
        thumbsImageView.setCornerRadius(((Number) this.g.getValue()).floatValue());
        ViewGroup.LayoutParams layoutParams = thumbsImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        ?? r1 = this.e;
        layoutParams.height = ((Number) r1.getValue()).intValue();
        layoutParams.width = ((Number) r1.getValue()).intValue();
        thumbsImageView.setLayoutParams(layoutParams);
    }
}
