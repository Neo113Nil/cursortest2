package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xsna.dvy0;
import xsna.uhz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class t7z0 extends muy0 implements dvy0.a {
    public final dvy0 b;
    public final loy0 c;
    public final gdy0 d;
    public final auy0 e;
    public final ImageView f;
    public final Button g;
    public final FrameLayout h;
    public final int i;
    public final int j;
    public uhz0.a k;

    public t7z0(Context context, boolean z, int i, int i2) {
        super(context);
        this.i = i;
        this.j = i2;
        dvy0 dvy0Var = new dvy0(context);
        this.b = dvy0Var;
        dvy0Var.setAdVideoViewListener(this);
        addView(dvy0Var, new ViewGroup.LayoutParams(-1, -1));
        this.c = kqz0.a(context, z);
        auy0 auy0Var = new auy0(context);
        this.e = auy0Var;
        auy0Var.setPadding((int) tj0.a(1, 6, context));
        addView(auy0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        muy0.a(frameLayout, (int) tj0.a(1, 12, context));
        frameLayout.setBackgroundColor(-870572770);
        addView(frameLayout);
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setId(View.generateViewId());
        float f = 8;
        muy0.a(imageView, (int) tj0.a(1, f, context));
        frameLayout.addView(imageView);
        Button button = new Button(context);
        this.g = button;
        muy0.a(button, (int) tj0.a(1, f, context));
        frameLayout.addView(button);
        gdy0 gdy0Var = new gdy0(context);
        this.d = gdy0Var;
        addView(gdy0Var);
    }

    @NonNull
    public ImageView getAdIcon() {
        return this.f;
    }

    @NonNull
    public dvy0 getAdVideoView() {
        return this.b;
    }

    @NonNull
    public Button getCtaButton() {
        return this.g;
    }

    @NonNull
    public gdy0 getProgressView() {
        return this.d;
    }

    @NonNull
    public loy0 getVideoPlayer() {
        return this.c;
    }

    @NonNull
    public auy0 getVolumeButton() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        c1z0 c1z0Var = new c1z0(getContext());
        this.b.layout(0, 0, i5, i6);
        int b = c1z0Var.b(48);
        float f = 6;
        int b2 = c1z0Var.b(f);
        float f2 = 16;
        int b3 = i6 - c1z0Var.b(f2);
        this.e.layout(b2, b3 - b, b + b2, b3);
        int b4 = c1z0Var.b(190);
        int b5 = c1z0Var.b(56);
        float f3 = 13;
        int b6 = i5 - c1z0Var.b(f3);
        int b7 = i6 - c1z0Var.b(f2);
        this.h.layout(b6 - b4, b7 - b5, b6, b7);
        int b8 = c1z0Var.b(44);
        int b9 = c1z0Var.b(f);
        int i7 = (b5 - b8) / 2;
        this.f.layout(b9, i7, b9 + b8, i7 + b8);
        this.g.layout((b9 * 2) + b8, i7, b4 - b9, b5 - b9);
        int b10 = c1z0Var.b(3);
        int b11 = c1z0Var.b(f3);
        this.d.layout(b11, i6 - b10, i5 - b11, i6);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        c1z0 c1z0Var = new c1z0(getContext());
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        int b = c1z0Var.b(48);
        this.e.measure(View.MeasureSpec.makeMeasureSpec(b, 1073741824), View.MeasureSpec.makeMeasureSpec(b, 1073741824));
        this.h.measure(View.MeasureSpec.makeMeasureSpec(c1z0Var.b(190), 1073741824), View.MeasureSpec.makeMeasureSpec(c1z0Var.b(56), 1073741824));
        int b2 = c1z0Var.b(44);
        this.f.measure(View.MeasureSpec.makeMeasureSpec(b2, 1073741824), View.MeasureSpec.makeMeasureSpec(b2, 1073741824));
        this.g.measure(View.MeasureSpec.makeMeasureSpec(c1z0Var.b(128), 1073741824), View.MeasureSpec.makeMeasureSpec(b2, 1073741824));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(size - (c1z0Var.b(13) * 2), 1073741824), View.MeasureSpec.makeMeasureSpec(c1z0Var.b(3), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override // xsna.dvy0.a
    public final void r() {
        uhz0.a aVar;
        loy0 loy0Var = this.c;
        if (!(loy0Var instanceof qfy0)) {
            uhz0.a aVar2 = this.k;
            if (aVar2 != null) {
                aVar2.a("Playback within no hardware accelerated view is available only with ExoPlayer");
                return;
            }
            return;
        }
        dvy0 dvy0Var = this.b;
        dvy0Var.setViewMode(1);
        dvy0Var.b(this.i, this.j);
        qfy0 qfy0Var = (qfy0) loy0Var;
        qfy0Var.A(dvy0Var);
        if (!qfy0Var.isPlaying() || (aVar = this.k) == null) {
            return;
        }
        aVar.k();
    }

    public void setPlayableVideoListener(@Nullable uhz0.a aVar) {
        this.k = aVar;
        this.c.x(aVar);
    }
}
