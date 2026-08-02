package xsna;

import androidx.fragment.app.FragmentActivity;

/* compiled from: ProfileSharingRouter.kt */
/* loaded from: classes5.dex */
public final class ozd0 {
    public final Object a;
    public final Object b;

    public ozd0() {
        this.a = new bpn0(new im80(6));
        this.b = new bpn0(new buc0(10));
    }

    public com.vk.music.player.playback.d a() {
        return (com.vk.music.player.playback.d) ((bpn0) this.a).getValue();
    }

    public com.vk.music.player.playback.b b() {
        return (com.vk.music.player.playback.b) ((bpn0) this.b).getValue();
    }

    public ozd0(FragmentActivity fragmentActivity, kbj0 kbj0Var) {
        this.a = fragmentActivity;
        this.b = kbj0Var;
    }
}
