package xsna;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.ShuffleMode;
import com.vk.music.playlist.ModernPlaylistModel;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import java.util.List;

/* compiled from: AudioPlaylistHolder.kt */
/* loaded from: classes4.dex */
public final class nt4 extends m56<AudioPlaylistAttachment> implements View.OnClickListener, blc0, View.OnAttachStateChangeListener {
    public static final /* synthetic */ int U = 0;
    public final u750 D;
    public final ThumbsImageView E;
    public final AppCompatImageView F;
    public final AppCompatTextView G;
    public final AppCompatTextView H;
    public final AppCompatTextView I;
    public final VkButton J;
    public final VkButton K;
    public final AppCompatImageView L;
    public final AppCompatTextView M;
    public boolean N;
    public final feb0 O;
    public final bdk0 P;
    public final mt4 Q;
    public View.OnClickListener R;
    public e6o S;
    public e6o T;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nt4(ViewGroup viewGroup, u2b0 u2b0Var, u750 u750Var, ModernPlaylistModel modernPlaylistModel) {
        super(r0);
        gs4 gs4Var = new gs4(viewGroup.getContext());
        this.D = u750Var;
        this.E = gs4Var.getSnippetImageView();
        this.F = gs4Var.getAttachChevron();
        this.G = gs4Var.getAttachTitle();
        this.H = gs4Var.getAttachSubtitle();
        this.I = gs4Var.getAttachSubsubtitle();
        this.J = gs4Var.getListenButton();
        this.K = gs4Var.getFollowButton();
        RecyclerView tracksView = gs4Var.getTracksView();
        this.L = gs4Var.getRemoveButton();
        this.M = gs4Var.getShowAllView();
        feb0 feb0Var = new feb0(u2b0Var, modernPlaylistModel);
        this.O = feb0Var;
        bdk0 bdk0Var = new bdk0(feb0Var, new qi3(1, this, nt4.class, "playItem", "playItem(Lcom/vk/dto/music/MusicTrack;)V", 0, 1));
        this.P = bdk0Var;
        this.Q = new mt4(this);
        int b = cn70.b(8);
        Y6();
        this.itemView.addOnAttachStateChangeListener(this);
        this.itemView.getContext();
        tracksView.setLayoutManager(new LinearLayoutManager());
        tracksView.setAdapter(bdk0Var);
        tracksView.setHasFixedSize(true);
        int b2 = cn70.b(6);
        qcy<Object>[] qcyVarArr = bwt0.a;
        gs4Var.setPaddingRelative(b, b, b, b2);
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        this.N = z;
        bwt0.p0(this.L, z);
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        this.P.h = s6oVar;
        ba baVar = s6oVar.e;
        this.S = s6oVar.a(this, baVar);
        View.OnClickListener onClickListener = this.R;
        if (onClickListener != null) {
            this.T = s6oVar.a(onClickListener, baVar);
        }
        Y6();
    }

    @Override // xsna.m56
    public final void T6(AudioPlaylistAttachment audioPlaylistAttachment) {
        AudioPlaylistAttachment audioPlaylistAttachment2 = audioPlaylistAttachment;
        Playlist playlist = audioPlaylistAttachment2.f;
        boolean u = xx1.u(playlist);
        String str = playlist.i;
        CharSequence charSequence = playlist.h;
        int i = playlist.v;
        if (!u) {
            charSequence = s490.d(this.itemView.getContext(), charSequence, str, R.attr.vk_ui_text_primary);
        }
        AppCompatTextView appCompatTextView = this.G;
        appCompatTextView.setText(charSequence);
        if (!xx1.u(playlist)) {
            str = c9b0.g(this.itemView.getContext(), playlist);
        }
        AppCompatTextView appCompatTextView2 = this.H;
        xo9.A(appCompatTextView2, str);
        boolean z = false;
        bwt0.p0(this.F, (!bwt0.K(appCompatTextView2) || xx1.w(playlist) || xx1.u(playlist)) ? false : true);
        appCompatTextView2.setEnabled((xx1.u(playlist) || xx1.w(playlist)) ? false : true);
        this.I.setText(playlist.Eb() ? c9b0.a(playlist.l, this.itemView.getContext(), playlist.n) : enj.f(R.plurals.music_songs, i, this.itemView.getContext()));
        int dimensionPixelSize = playlist.Eb() ? this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.music_snippet_album_offset) : this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.music_snippet_playlist_offset);
        AppCompatTextView appCompatTextView3 = this.M;
        appCompatTextView3.setCompoundDrawablePadding(dimensionPixelSize);
        awt0.x(this.M, dimensionPixelSize, 0, 0, 0, 14);
        if (playlist.Fb() || playlist.y.isEmpty() || playlist.y.size() == 1) {
            appCompatTextView3.setText(playlist.Eb() ? R.string.music_playlist_open_all_album : R.string.music_playlist_open_all_playlist);
        } else {
            appCompatTextView3.setText(enj.f(R.plurals.music_playlist_show_all_tracks, i, this.itemView.getContext()));
        }
        boolean e = xx1.e(playlist);
        VkButton vkButton = this.K;
        if (e) {
            Integer valueOf = Integer.valueOf(R.drawable.vk_icon_write_24);
            int[] iArr = VkButton.W;
            vkButton.a5(true, valueOf);
            vkButton.setText(R.string.music_edit_button_label);
        } else {
            this.O.b.getClass();
            if (ModernPlaylistModel.E(playlist)) {
                vkButton.setText(R.string.music_added_button_label);
                vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_done_16));
            } else {
                vkButton.setText(R.string.music_attach_button_label);
                vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_add_16));
            }
        }
        kt4 kt4Var = new kt4(0, new lt4(0, this, nt4.class, "isAdvertisement", "isAdvertisement()Z", 0), mcy.class, "get", "get()Ljava/lang/Object;", 0, 0);
        ThumbsImageView thumbsImageView = this.E;
        thumbsImageView.setIgnoreTrafficSaverPredicate(kt4Var);
        Thumb thumb = playlist.m;
        if (thumb != null) {
            thumbsImageView.setThumb(thumb);
        } else {
            thumbsImageView.setThumbs(playlist.p);
        }
        bwt0.p0(vkButton, !playlist.Fb());
        if (!playlist.Fb() && i != 0) {
            z = true;
        }
        bwt0.p0(this.J, z);
        s490.a(appCompatTextView, playlist.k, e3m.f(R.attr.vk_ui_icon_secondary, appCompatTextView.getContext()));
        X6(audioPlaylistAttachment2);
    }

    public final void X6(AudioPlaylistAttachment audioPlaylistAttachment) {
        Playlist playlist = audioPlaylistAttachment.f;
        List<MusicTrack> subList = playlist.y.size() > 3 ? playlist.y.subList(0, 3) : playlist.y;
        bdk0 bdk0Var = this.P;
        if (epx.f(bdk0Var.g, playlist) && subList.equals(bdk0Var.y0())) {
            bdk0Var.notifyDataSetChanged();
        } else {
            bdk0Var.g = playlist;
            bdk0Var.setItems(subList);
        }
    }

    public final void Y6() {
        View.OnClickListener onClickListener = this.S;
        if (onClickListener == null) {
            onClickListener = this;
        }
        this.itemView.setOnClickListener(onClickListener);
        this.J.setOnClickListener(onClickListener);
        this.K.setOnClickListener(onClickListener);
        this.H.setOnClickListener(onClickListener);
        this.M.setOnClickListener(onClickListener);
        View.OnClickListener onClickListener2 = this.R;
        if (onClickListener2 != null) {
            e6o e6oVar = this.T;
            if (e6oVar != null) {
                onClickListener2 = e6oVar;
            }
            this.L.setOnClickListener(onClickListener2);
        }
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
        this.R = onClickListener;
        s6o s6oVar = this.q;
        this.T = s6oVar != null ? s6oVar.a(onClickListener, s6oVar.e) : null;
        Y6();
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        AudioPlaylistAttachment audioPlaylistAttachment;
        Activity h;
        if (jjc.b() || (audioPlaylistAttachment = (AudioPlaylistAttachment) this.C) == null) {
            return;
        }
        if (this.N) {
            cvk.u(R.string.music_playlist_interation_forbidden, false);
            return;
        }
        int id = view.getId();
        feb0 feb0Var = this.O;
        if (id == R.id.audio_attachment_listen_btn) {
            this.D.f0("all");
            feb0Var.b(audioPlaylistAttachment.f, MusicPlaybackLaunchContext.Fb(audioPlaylistAttachment.g), 0, null, ShuffleMode.SHUFFLE_AUTO);
            hd60.a().r1(t6());
            return;
        }
        if (id == R.id.audio_attachment_follow_toggle_btn) {
            AudioPlaylistAttachment audioPlaylistAttachment2 = (AudioPlaylistAttachment) this.C;
            if (audioPlaylistAttachment2 == null) {
                return;
            }
            Playlist playlist = audioPlaylistAttachment2.f;
            if (xx1.e(playlist)) {
                hd60.a().p1(this.itemView.getContext(), playlist);
                return;
            }
            feb0Var.b.getClass();
            if (ModernPlaylistModel.E(playlist)) {
                je50.b(view.getContext(), playlist, new tx(3, this, audioPlaylistAttachment2));
                return;
            } else {
                feb0Var.d(playlist, MusicPlaybackLaunchContext.Fb(audioPlaylistAttachment2.g));
                hd60.a().u0(t6());
                return;
            }
        }
        if (id != R.id.attach_subtitle) {
            W6(view);
            return;
        }
        AudioPlaylistAttachment audioPlaylistAttachment3 = (AudioPlaylistAttachment) this.C;
        if (audioPlaylistAttachment3 == null) {
            return;
        }
        Playlist playlist2 = audioPlaylistAttachment3.f;
        if (xx1.w(playlist2) || (h = e3m.h(this.itemView.getContext())) == null) {
            return;
        }
        if (playlist2.Eb()) {
            hd60.a().Y0(h, playlist2, MusicPlaybackLaunchContext.Fb(audioPlaylistAttachment3.g));
        } else if (fkq0.c(playlist2.c)) {
            gd60.Z0(hd60.a(), h, playlist2.c, null, null, 12);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.O.a.P0(this.Q, true);
        AudioPlaylistAttachment audioPlaylistAttachment = (AudioPlaylistAttachment) this.C;
        if (audioPlaylistAttachment != null) {
            X6(audioPlaylistAttachment);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        mt4 mt4Var = this.Q;
        feb0 feb0Var = this.O;
        feb0Var.a.n0(mt4Var);
        io.reactivex.rxjava3.disposables.c cVar = feb0Var.c;
        if (cVar != null) {
            cVar.dispose();
        }
        feb0Var.c = null;
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
    }
}
