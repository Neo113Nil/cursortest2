package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.libvideo.api.minimizable.VideoMinimizableScreenArgs;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.api.pip2.VideoContainerFragmentEntry;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.kds0;
import xsna.vxs0;

/* compiled from: DiscoveryFragmentEntry.kt */
/* loaded from: classes7.dex */
public final class han implements VideoContainerFragmentEntry {
    public static final rfc i = fpf0.a(VideoMinimizableDiscoveryFragment.class);
    public final VideoMinimizablePlayerComponent a;
    public final Bundle b;
    public final gjs0 c;
    public final io.reactivex.rxjava3.disposables.b d;
    public final Object e;
    public final VideoContainerFragmentEntry.Type f;
    public final VideoContainerFragmentEntry.LaunchMode g;
    public final Fragment h;

    public han(VideoMinimizablePlayerComponent videoMinimizablePlayerComponent, Bundle bundle, gjs0 gjs0Var, Fragment fragment) {
        this.a = videoMinimizablePlayerComponent;
        this.b = bundle;
        this.c = gjs0Var;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.d = bVar;
        this.e = msy.a(LazyThreadSafetyMode.NONE, new qo0(14));
        this.f = VideoContainerFragmentEntry.Type.Discovery;
        this.g = VideoContainerFragmentEntry.LaunchMode.SingleInstance;
        if (fragment == null) {
            fragment = new VideoMinimizableDiscoveryFragment();
            fragment.setArguments(bundle);
        }
        this.h = fragment;
        bVar.b(videoMinimizablePlayerComponent.b3().subscribe(new b00(new qqe(this, 10), 21)));
    }

    public static VideoMinimizableScreenArgs a(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("screen_args_key", VideoMinimizableScreenArgs.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("screen_args_key");
            if (!(parcelable3 instanceof VideoMinimizableScreenArgs)) {
                parcelable3 = null;
            }
            parcelable = (VideoMinimizableScreenArgs) parcelable3;
        }
        return (VideoMinimizableScreenArgs) parcelable;
    }

    @Override // com.vk.libvideo.api.pip2.VideoContainerFragmentEntry
    public final boolean a0() {
        VideoMinimizablePlayerComponent videoMinimizablePlayerComponent = this.a;
        VideoMinimizableState P0 = videoMinimizablePlayerComponent.b3().P0();
        boolean z = false;
        if (P0 != null && com.vk.libvideo.api.minimizable.a.d(P0)) {
            z = true;
        }
        if (z) {
            videoMinimizablePlayerComponent.zb().b(vxs0.a.a);
        }
        return z;
    }

    public final void b() {
        VideoMinimizableScreenArgs a = a(this.b);
        if (a == null) {
            return;
        }
        ((Window) this.c.a.invoke()).getAttributes().layoutInDisplayCutoutMode = 1;
        VideoMinimizablePlayerComponent videoMinimizablePlayerComponent = this.a;
        videoMinimizablePlayerComponent.zb().b(new vxs0.e(a));
        c(videoMinimizablePlayerComponent.b3().P0());
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void c(VideoMinimizableState videoMinimizableState) {
        boolean z = videoMinimizableState instanceof VideoMinimizableState.Pip;
        gjs0 gjs0Var = this.c;
        if (z) {
            ((Window) gjs0Var.a.invoke()).getDecorView().setSystemUiVisibility(5894);
            return;
        }
        if (com.vk.libvideo.api.minimizable.a.e(videoMinimizableState)) {
            ((Window) gjs0Var.a.invoke()).getDecorView().setSystemUiVisibility(1792);
            d(false);
            return;
        }
        if (com.vk.libvideo.api.minimizable.a.j(videoMinimizableState)) {
            d(true);
            ((Window) gjs0Var.a.invoke()).getDecorView().setSystemUiVisibility(5894);
            return;
        }
        if (!(videoMinimizableState instanceof VideoMinimizableState.Animating)) {
            ((Window) gjs0Var.a.invoke()).getDecorView().setSystemUiVisibility(1792);
            return;
        }
        VideoMinimizableState.Animating animating = (VideoMinimizableState.Animating) videoMinimizableState;
        FragmentActivity activity = this.h.getActivity();
        if (activity == null) {
            return;
        }
        VideoMinimizableState videoMinimizableState2 = animating.b;
        float f = animating.d;
        Float valueOf = ((videoMinimizableState2 instanceof VideoMinimizableState.Expanded) && com.vk.libvideo.api.minimizable.a.g(animating.c)) ? Float.valueOf(f) : null;
        int i2 = R.color.vk_gray_1000;
        ?? r6 = this.e;
        if (valueOf != null) {
            float floatValue = valueOf.floatValue();
            if (((Boolean) r6.getValue()).booleanValue()) {
                i2 = R.color.vk_black;
            }
            gjs0.a(gjs0Var, activity.getColor(i2), -16777216, floatValue, 24);
            return;
        }
        if (((Boolean) r6.getValue()).booleanValue() && com.vk.libvideo.api.minimizable.a.f(animating)) {
            float f2 = f / 0.27666667f;
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            int c = dhr0.t.c(android.R.attr.navigationBarColor);
            if (((Boolean) r6.getValue()).booleanValue()) {
                i2 = R.color.vk_black;
            }
            gjs0.a(gjs0Var, c, activity.getColor(i2), f2, 16);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void d(boolean z) {
        int color;
        FragmentActivity activity = this.h.getActivity();
        if (activity == null) {
            return;
        }
        if (z) {
            color = -16777216;
        } else {
            color = activity.getColor(((Boolean) this.e.getValue()).booleanValue() ? R.color.vk_black : R.color.vk_gray_1000);
        }
        jkg jkgVar = this.c.b;
        jkgVar.invoke(Boolean.TRUE, Integer.valueOf(color));
        jkgVar.invoke(Boolean.FALSE, Integer.valueOf(color));
    }

    @Override // com.vk.libvideo.api.pip2.VideoContainerFragmentEntry
    public final Fragment g() {
        return this.h;
    }

    @Override // com.vk.libvideo.api.pip2.VideoContainerFragmentEntry
    public final VideoContainerFragmentEntry.Type getType() {
        return this.f;
    }

    @Override // com.vk.libvideo.api.pip2.VideoContainerFragmentEntry
    public final VideoContainerFragmentEntry.LaunchMode h() {
        return this.g;
    }

    @Override // com.vk.libvideo.api.pip2.VideoContainerFragmentEntry
    public final void i(kds0 kds0Var) {
        boolean z = kds0Var instanceof kds0.c;
        VideoMinimizablePlayerComponent videoMinimizablePlayerComponent = this.a;
        if (z) {
            VideoMinimizableScreenArgs a = a(((kds0.c) kds0Var).a);
            if (a == null) {
                return;
            }
            videoMinimizablePlayerComponent.zb().b(new vxs0.e(a));
            return;
        }
        if (kds0Var instanceof kds0.a) {
            b();
            return;
        }
        if (kds0Var instanceof kds0.d) {
            b();
        } else {
            if (!(kds0Var instanceof kds0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            this.d.e();
            videoMinimizablePlayerComponent.zb().b(vxs0.c.a);
            videoMinimizablePlayerComponent.b3().onNext(VideoMinimizableState.Hidden.b);
        }
    }
}
