package xsna;

import com.vk.clips.editor.templates.impl.player.MusicPlayerState;
import xsna.u850;

/* compiled from: MusicStoriesPlayerHolder.kt */
/* loaded from: classes16.dex */
public final class t850 {
    public static final MusicPlayerState a(u850 u850Var) {
        return u850Var.equals(u850.f.a) ? MusicPlayerState.PREPARED : u850Var.equals(u850.i.a) ? MusicPlayerState.STOPPED : MusicPlayerState.OTHER;
    }
}
