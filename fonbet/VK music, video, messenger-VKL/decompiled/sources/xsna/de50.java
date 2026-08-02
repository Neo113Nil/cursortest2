package xsna;

import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.attachpicker.base.BaseAttachPickerFragment;
import com.vk.attachpicker.impl.fragment.AttachMusicFragment;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vkontakte.android.R;

/* compiled from: MusicTrackViewHolder.kt */
/* loaded from: classes15.dex */
public final class de50 extends vif0<MusicTrack> implements fsv<MusicTrack> {
    public final vz4 n;
    public final AttachMusicFragment o;
    public final u2b0 p;
    public final BaseAttachPickerFragment.b<MusicTrack> q;
    public final ow2 r;
    public final TextView s;

    public de50(ViewGroup viewGroup, zom0 zom0Var, vz4 vz4Var, AttachMusicFragment attachMusicFragment, u2b0 u2b0Var) {
        super(viewGroup, R.layout.music_audio_item_poster, 0);
        this.n = vz4Var;
        this.o = attachMusicFragment;
        this.p = u2b0Var;
        BaseAttachPickerFragment.b<MusicTrack> bVar = new BaseAttachPickerFragment.b<>((ViewGroup) this.itemView, zom0Var);
        this.q = bVar;
        ub50 ub50Var = new ub50(null);
        ub50Var.h = this.itemView;
        ub50Var.e(null);
        ub50Var.m = u2b0Var;
        ub50Var.j = this;
        ow2 a = ub50Var.a(viewGroup);
        this.r = a;
        this.s = (TextView) a.itemView.findViewById(R.id.audio_duration);
        hvt0.b(this.itemView, R.id.audio_image, this);
        bVar.d = new rg5(this, 2);
    }

    @Override // xsna.fsv
    public final void Ig(int i, MusicTrack musicTrack) {
        Object obj = this.m;
        if (obj == null) {
            return;
        }
        if (i != R.id.audio_image) {
            AttachMusicFragment attachMusicFragment = this.o;
            if (attachMusicFragment != null) {
                attachMusicFragment.li(getAdapterPosition(), obj);
                return;
            }
            return;
        }
        u2b0 u2b0Var = this.p;
        PlayState m0 = u2b0Var.m0();
        if (epx.f(this.m, u2b0Var.b()) && (m0 == PlayState.PAUSED || m0 == PlayState.PLAYING)) {
            u2b0Var.w1(new PlaybackActionMeta(6, 0L, 2, null));
        } else {
            this.n.a(getAdapterPosition());
        }
    }

    @Override // xsna.vif0
    public final void i6(MusicTrack musicTrack) {
        MusicTrack musicTrack2 = musicTrack;
        if (musicTrack2 == null) {
            return;
        }
        this.q.a(musicTrack2);
        this.r.V5("", false, getAdapterPosition(), musicTrack2);
    }

    @Override // xsna.fsv, android.view.MenuItem.OnMenuItemClickListener, android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        super.onMenuItemClick(menuItem);
        return true;
    }
}
