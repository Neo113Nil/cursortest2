package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.image_viewer.ScalingContentFrameLayout;
import com.yandex.go.image_viewer.ScalingContentViewPager;
import ru.yandex.taxi.design.StoryProgressComponent;

/* loaded from: classes12.dex */
public final class jss implements zo31 {
    public final ScalingContentFrameLayout a;
    public final AppCompatImageView b;
    public final AppCompatImageView c;
    public final StoryProgressComponent d;
    public final ScalingContentViewPager e;

    public jss(ScalingContentFrameLayout scalingContentFrameLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, StoryProgressComponent storyProgressComponent, ScalingContentViewPager scalingContentViewPager) {
        this.a = scalingContentFrameLayout;
        this.b = appCompatImageView;
        this.c = appCompatImageView2;
        this.d = storyProgressComponent;
        this.e = scalingContentViewPager;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
