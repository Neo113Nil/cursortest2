package xsna;

import android.app.Activity;
import android.content.DialogInterface;
import android.widget.TextView;
import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.dto.stories.model.clickable.ClickableMusic;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vkontakte.android.R;

/* compiled from: StoryViewMusicDelegate.kt */
/* loaded from: classes6.dex */
public final class fmm0 implements DialogInterface.OnDismissListener {
    public final uov b;
    public final MusicRestrictionPopupDisplayer c;
    public final anm0 d;
    public ClickableMusic e;
    public final TextView f;
    public dcn g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;

    public fmm0(mkm0 mkm0Var, MusicRestrictionPopupDisplayer musicRestrictionPopupDisplayer, anm0 anm0Var) {
        this.b = mkm0Var;
        this.c = musicRestrictionPopupDisplayer;
        this.d = anm0Var;
        this.f = (TextView) mkm0Var.getView().findViewById(R.id.story_music_restriction_text);
    }

    public final boolean a(ClickableMusic clickableMusic) {
        MusicDynamicRestriction musicDynamicRestriction = clickableMusic.f;
        if (!this.k) {
            return false;
        }
        if ((musicDynamicRestriction != null && !this.h) || this.i) {
            return false;
        }
        uov uovVar = this.b;
        uovVar.pause();
        if (musicDynamicRestriction == null || !this.h) {
            Activity h = e3m.h(uovVar.getCtx());
            if (h == null) {
                return false;
            }
            this.g = b6m.a().b(h, clickableMusic.e, new gkc0(this, 16), new rzl0(this, 4));
        } else {
            this.c.a(musicDynamicRestriction, new ezb0(this, 1));
        }
        this.j = true;
        return true;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.j = false;
        dcn dcnVar = this.g;
        if (dcnVar != null) {
            dcnVar.dismiss();
        }
    }
}
