package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.splash.presentation.ClippedFrameLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class j250 implements zo31 {
    public final FrameLayout a;
    public final ClippedFrameLayout b;
    public final AppCompatImageView c;
    public final FrameLayout d;
    public final AppCompatImageView e;
    public final AppCompatImageView f;
    public final RobotoTextView g;
    public final View h;

    public j250(FrameLayout frameLayout, ClippedFrameLayout clippedFrameLayout, AppCompatImageView appCompatImageView, FrameLayout frameLayout2, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, RobotoTextView robotoTextView, View view) {
        this.a = frameLayout;
        this.b = clippedFrameLayout;
        this.c = appCompatImageView;
        this.d = frameLayout2;
        this.e = appCompatImageView2;
        this.f = appCompatImageView3;
        this.g = robotoTextView;
        this.h = view;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }

    public final FrameLayout o() {
        return this.a;
    }
}
