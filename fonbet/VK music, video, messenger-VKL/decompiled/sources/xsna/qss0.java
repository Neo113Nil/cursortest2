package xsna;

import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.vk.libvideo.api.pip2.VideoContainerFragmentEntry;
import com.vk.libvideo.live.impl.fragment.VideoLiveFragment;
import kotlin.NoWhenBranchMatchedException;
import xsna.kds0;

/* compiled from: VideoLiveFragmentEntry.kt */
/* loaded from: classes3.dex */
public final class qss0 implements VideoContainerFragmentEntry {
    public static final rfc e = fpf0.a(VideoLiveFragment.class);
    public oqx0 a;
    public final VideoContainerFragmentEntry.Type b = VideoContainerFragmentEntry.Type.Live;
    public final VideoContainerFragmentEntry.LaunchMode c = VideoContainerFragmentEntry.LaunchMode.OneShot;
    public final Fragment d;

    public qss0(Bundle bundle, Fragment fragment) {
        if (fragment == null) {
            fragment = new VideoLiveFragment();
            fragment.setArguments(bundle);
        }
        this.d = fragment;
    }

    public final void a() {
        Window window;
        FragmentActivity activity = this.d.getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            this.a = new oqx0(window, window.getDecorView());
        }
        oqx0 oqx0Var = this.a;
        if (oqx0Var == null) {
            return;
        }
        oqx0Var.a.g(2);
        oqx0Var.a.b(519);
    }

    @Override // com.vk.libvideo.api.pip2.VideoContainerFragmentEntry
    public final boolean a0() {
        return false;
    }

    @Override // com.vk.libvideo.api.pip2.VideoContainerFragmentEntry
    public final Fragment g() {
        return this.d;
    }

    @Override // com.vk.libvideo.api.pip2.VideoContainerFragmentEntry
    public final VideoContainerFragmentEntry.Type getType() {
        return this.b;
    }

    @Override // com.vk.libvideo.api.pip2.VideoContainerFragmentEntry
    public final VideoContainerFragmentEntry.LaunchMode h() {
        return this.c;
    }

    @Override // com.vk.libvideo.api.pip2.VideoContainerFragmentEntry
    public final void i(kds0 kds0Var) {
        if (kds0Var instanceof kds0.c) {
            return;
        }
        if (kds0Var instanceof kds0.a) {
            a();
        } else if (kds0Var instanceof kds0.d) {
            a();
        } else if (!(kds0Var instanceof kds0.b)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
