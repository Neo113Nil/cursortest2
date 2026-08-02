package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.rlottie.RLottieDrawable;
import com.vkontakte.android.R;

/* compiled from: FeedReactionView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes18.dex */
public final class e3r extends f3r {
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int[] g;
    public boolean h;
    public final VkImage i;
    public final FeedAnimatedView j;

    public e3r(Context context, int i, int i2, int i3, f2f0 f2f0Var) {
        super(context);
        this.b = i;
        this.c = i2;
        float f = i2 / i;
        int b = an10.b(i3 * f);
        this.d = b;
        int i4 = (b * 2) + i2;
        this.e = i4;
        this.f = (i2 - i) / 2;
        this.g = new int[2];
        new Rect();
        a aVar = new a();
        VkImage vkImage = new VkImage(context, null, 6, 0);
        vkImage.setLayoutParams(new ViewGroup.LayoutParams(i2, i2));
        bwt0.p0(vkImage, true);
        vkImage.setScaleType(ImageView.ScaleType.FIT_XY);
        vkImage.setPlaceholderImage(R.drawable.user_placeholder);
        this.i = vkImage;
        FeedAnimatedView feedAnimatedView = new FeedAnimatedView(context, null, 6);
        feedAnimatedView.setLayoutParams(new ViewGroup.LayoutParams(i4, i4));
        feedAnimatedView.setAnimationSize(i4);
        feedAnimatedView.setPlaceholderImage(R.drawable.user_placeholder);
        feedAnimatedView.setOnLoadAnimationCallback(aVar);
        feedAnimatedView.setSafeZoneSize(b);
        this.j = feedAnimatedView;
        String b2 = f2f0Var.b();
        String c = f2f0Var.c();
        if (b2 == null || b2.length() == 0 || !RLottieDrawable.s) {
            bwt0.p0(feedAnimatedView, false);
            bwt0.p0(vkImage, true);
            vkImage.o0(c, null);
        } else {
            bwt0.p0(vkImage, false);
            bwt0.p0(feedAnimatedView, true);
            feedAnimatedView.e(b2, false);
        }
        setScale(1.0f / f);
        addView(vkImage);
        addView(feedAnimatedView);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // xsna.f3r
    public final void a() {
        this.h = false;
        this.j.setAnimating(false);
    }

    @Override // xsna.f3r
    public final void b() {
        this.h = true;
        this.j.setAnimating(true);
    }

    @Override // xsna.f3r
    public final void c() {
        this.h = false;
        this.j.g();
    }

    @Override // xsna.f3r
    public final void d(float f, float f2) {
        VkImage vkImage = this.i;
        vkImage.setPivotX(f);
        vkImage.setPivotY(f2);
        int i = this.d;
        float f3 = i + f;
        FeedAnimatedView feedAnimatedView = this.j;
        feedAnimatedView.setPivotX(f3);
        feedAnimatedView.setPivotY(i + f2);
    }

    @Override // xsna.f3r
    public final void e() {
        this.h = false;
        this.j.setAnimating(false);
    }

    @Override // xsna.f3r
    public int[] getLocation() {
        int[] iArr = this.g;
        getLocationOnScreen(iArr);
        return iArr;
    }

    @Override // xsna.f3r
    public float getScale() {
        return this.i.getScaleX();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        VkImage vkImage = this.i;
        boolean K = bwt0.K(vkImage);
        int i5 = this.b;
        int i6 = this.f;
        if (K) {
            vkImage.layout(-i6, -i6, i6 + i5, i6 + i5);
        }
        FeedAnimatedView feedAnimatedView = this.j;
        if (bwt0.K(feedAnimatedView)) {
            int i7 = this.d;
            feedAnimatedView.layout((-i6) - i7, (-i6) - i7, i6 + i5 + i7, i6 + i5 + i7);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        FeedAnimatedView feedAnimatedView = this.j;
        if (bwt0.K(feedAnimatedView)) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.e, 1073741824);
            feedAnimatedView.measure(makeMeasureSpec, makeMeasureSpec);
        }
        VkImage vkImage = this.i;
        if (bwt0.K(vkImage)) {
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.c, 1073741824);
            vkImage.measure(makeMeasureSpec2, makeMeasureSpec2);
        }
        super.onMeasure(i, i2);
    }

    @Override // xsna.f3r
    public void setScale(float f) {
        VkImage vkImage = this.i;
        vkImage.setScaleX(f);
        vkImage.setScaleY(f);
        FeedAnimatedView feedAnimatedView = this.j;
        feedAnimatedView.setScaleX(f);
        feedAnimatedView.setScaleY(f);
    }

    /* compiled from: FeedReactionView.kt */
    public static final class a implements a780 {
        public a() {
        }

        @Override // xsna.a780
        public final void onSuccess() {
            e3r e3rVar = e3r.this;
            if (e3rVar.h) {
                e3rVar.b();
            }
        }

        @Override // xsna.a780
        public final void a() {
        }
    }
}
