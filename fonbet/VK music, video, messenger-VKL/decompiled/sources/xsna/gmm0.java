package xsna;

import android.content.DialogInterface;
import android.widget.TextView;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vkontakte.android.R;

/* compiled from: StoryViewMusicPlaylistDelegate.kt */
/* loaded from: classes6.dex */
public final class gmm0 implements DialogInterface.OnDismissListener {
    public final uov b;
    public final TextView c;
    public boolean d;
    public boolean e;
    public boolean f;

    public gmm0(mkm0 mkm0Var, MusicRestrictionPopupDisplayer musicRestrictionPopupDisplayer) {
        this.b = mkm0Var;
        this.c = (TextView) mkm0Var.getView().findViewById(R.id.story_music_restriction_text);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.e = false;
    }
}
