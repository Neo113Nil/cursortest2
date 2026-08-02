package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.vk.clips.viewer.impl.feed.view.ClipFeedLikeFlyView;
import com.vkontakte.android.R;
import kotlin.random.Random;
import xsna.e3m;

/* compiled from: LikeAnimationHelper.kt */
/* loaded from: classes17.dex */
public final class d6z {
    public static final int d;
    public static final int e;
    public final Context a;
    public final w6d b;
    public boolean c;

    static {
        int a = iah0.a(120);
        d = a;
        e = a / 2;
    }

    public d6z(Context context, w6d w6dVar) {
        this.a = context;
        this.b = w6dVar;
        SystemClock.elapsedRealtime();
    }

    public final void a(float f, float f2, int i, boolean z) {
        ClipFeedLikeFlyView clipFeedLikeFlyView = this.b.s;
        if (z) {
            SystemClock.elapsedRealtime();
        }
        clipFeedLikeFlyView.setMImageSizePx(i);
        Random.Default r1 = Random.b;
        r1.getClass();
        double g = Random.c.g();
        Context context = this.a;
        Drawable drawable = null;
        if (g < 0.2d || this.c) {
            this.c = false;
            Integer num = (Integer) j5g.w0(e43.l(Integer.valueOf(z ? R.drawable.vk_icon_lis_120 : R.drawable.vk_icon_pic_lis_48), Integer.valueOf(z ? R.drawable.vk_icon_unicorn_120 : R.drawable.vk_icon_pic_unicorn_48), Integer.valueOf(z ? R.drawable.vk_icon_cat_120 : R.drawable.vk_icon_pic_cat_48), Integer.valueOf(z ? R.drawable.vk_icon_dog_120 : R.drawable.vk_icon_pic_dog_48), Integer.valueOf(z ? R.drawable.vk_icon_frog_120 : R.drawable.vk_icon_pic_frog_48), z ? Integer.valueOf(R.drawable.vk_icon_like_120) : null), r1);
            if (num != null) {
                int intValue = num.intValue();
                e3m.a aVar = e3m.a;
                drawable = m33.a(intValue, context);
            }
        } else if (z) {
            e3m.a aVar2 = e3m.a;
            drawable = m33.a(R.drawable.vk_icon_like_120, context);
        }
        if (drawable != null) {
            clipFeedLikeFlyView.a(f, f2, 0, drawable);
        }
    }
}
