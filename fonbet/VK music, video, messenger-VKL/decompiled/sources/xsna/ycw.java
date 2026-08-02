package xsna;

import com.vk.music.player.PlaybackActionMeta;

/* compiled from: ImSettingsDialogThemeFragment.kt */
/* loaded from: classes2.dex */
public final class ycw implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ycw(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                com.vk.im.ui.components.theme_chooser.b bVar = (com.vk.im.ui.components.theme_chooser.b) this.c;
                bVar.getClass();
                bVar.b1(new j6l0(bVar, 9));
                break;
            default:
                eck0 eck0Var = ((l650) this.c).h;
                PlaybackActionMeta playbackActionMeta = new PlaybackActionMeta(6, 0L, 2, null);
                if (eck0Var.c.getState().i()) {
                    eck0Var.m(playbackActionMeta);
                } else {
                    eck0Var.j(playbackActionMeta.b);
                }
                break;
        }
        return s3q0.a;
    }
}
