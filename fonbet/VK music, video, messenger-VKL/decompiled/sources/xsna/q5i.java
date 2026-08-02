package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.common.Attachment;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.EntryTitle;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.attachment.CompactAttachmentStyle;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.error.VkPlayerException;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioArtistAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.AudioCuratorAttachment;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: CompactAudioAttachmentHolder.kt */
/* loaded from: classes4.dex */
public final class q5i extends tb6 implements View.OnAttachStateChangeListener, com.vk.music.player.e {
    public final cr4 E;
    public final txq F;
    public final int G;
    public final Object H;
    public final Object I;
    public boolean J;
    public boolean K;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q5i(ViewGroup viewGroup, cr4 cr4Var) {
        super(r0);
        txq txqVar = new txq(viewGroup.getContext());
        txqVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.E = cr4Var;
        txq txqVar2 = (txq) this.itemView;
        this.F = txqVar2;
        this.G = cn70.b(40);
        bb bbVar = new bb(this, 27);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.H = msy.a(lazyThreadSafetyMode, bbVar);
        this.I = msy.a(lazyThreadSafetyMode, new cb(this, 28));
        this.itemView.addOnAttachStateChangeListener(this);
        txqVar2.setItemClickListener(new ey0(this, 24));
        txqVar2.setPhotoClickListener(new eb(this, 26));
        txqVar2.setPlayButtonClickListener(new n5i(this, 0));
        txqVar2.setAddOrRemoveButtonClickListener(new jcg(this, 7));
        txqVar2.setButtonClickListener(new g4g(this, 7));
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    public static s3q0 X6(q5i q5iVar) {
        txq txqVar = q5iVar.F;
        cr4 cr4Var = q5iVar.E;
        Attachment attachment = q5iVar.D;
        if (attachment != null) {
            NewsEntry t6 = q5iVar.t6();
            hd60.a().r1(t6);
            PromoPost promoPost = t6 instanceof PromoPost ? (PromoPost) t6 : null;
            AdsAudioPixelsContainer adsAudioPixelsContainer = promoPost != null ? promoPost.I : null;
            if (attachment instanceof AudioAttachment) {
                lm4 Y6 = q5iVar.Y6();
                AudioAttachment audioAttachment = (AudioAttachment) attachment;
                Y6.getClass();
                Y6.i(audioAttachment.f, audioAttachment.g, audioAttachment.h, audioAttachment.i, adsAudioPixelsContainer);
                super.W6(txqVar);
            } else if (attachment instanceof AudioArtistAttachment) {
                AudioArtistAttachment audioArtistAttachment = (AudioArtistAttachment) attachment;
                ((fa40) cr4Var.e.getValue()).a(audioArtistAttachment.f.b, audioArtistAttachment.h);
            } else if (attachment instanceof AudioCuratorAttachment) {
                xf40 xf40Var = (xf40) cr4Var.f.getValue();
                AudioCuratorAttachment audioCuratorAttachment = (AudioCuratorAttachment) attachment;
                String str = audioCuratorAttachment.f.b;
                String str2 = audioCuratorAttachment.h;
                xf40Var.getClass();
                xf40.b(str, str2);
            } else if (attachment instanceof AudioPlaylistAttachment) {
                lm4.j(q5iVar.Y6(), (AudioPlaylistAttachment) attachment, (u750) cr4Var.g.getValue(), (feb0) q5iVar.I.getValue());
            } else if (attachment instanceof PodcastAttachment) {
                PodcastAttachment podcastAttachment = (PodcastAttachment) attachment;
                if (podcastAttachment.Eb()) {
                    q5iVar.W6(txqVar);
                } else {
                    q5iVar.Y6().k(podcastAttachment, q5iVar.t6(), q5iVar.u, q5iVar.w);
                }
            }
        }
        return s3q0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r0.f.B() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r0.f.v != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean f7(Attachment attachment) {
        if (attachment instanceof AudioPlaylistAttachment) {
            AudioPlaylistAttachment audioPlaylistAttachment = (AudioPlaylistAttachment) attachment;
            if (!audioPlaylistAttachment.f.Fb()) {
            }
        }
        if (attachment instanceof PodcastAttachment) {
            PodcastAttachment podcastAttachment = (PodcastAttachment) attachment;
            if (!podcastAttachment.Eb()) {
            }
        }
        return (attachment instanceof AudioAttachment) || (attachment instanceof AudioArtistAttachment) || (attachment instanceof AudioCuratorAttachment);
    }

    @Override // com.vk.music.player.e
    public final void N3(PlayState playState, com.vk.music.player.f fVar) {
        Attachment attachment = this.D;
        if (attachment instanceof AudioAttachment) {
            c7((AudioAttachment) attachment, playState, fVar);
            return;
        }
        if (attachment instanceof PodcastAttachment) {
            d7((PodcastAttachment) attachment, playState, fVar);
        } else if (attachment instanceof AudioPlaylistAttachment) {
            b7((AudioPlaylistAttachment) attachment, playState, fVar);
        } else {
            e7(false);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // xsna.tb6
    public final void T6(com.vk.dto.common.Attachment r18, com.vk.feed.core.models.attachment.CompactAttachmentStyle r19) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.q5i.T6(com.vk.dto.common.Attachment, com.vk.feed.core.models.attachment.CompactAttachmentStyle):void");
    }

    @Override // com.vk.music.player.e
    public final void W3(com.vk.music.player.f fVar) {
        Attachment attachment = this.D;
        if (attachment instanceof AudioAttachment) {
            i7((AudioAttachment) attachment, fVar);
        } else if (attachment instanceof AudioPlaylistAttachment) {
            j7((AudioPlaylistAttachment) attachment, fVar);
        } else {
            h7(false);
        }
    }

    @Override // xsna.tb6
    public final void W6(View view) {
        Attachment attachment = this.D;
        if (attachment == null) {
            return;
        }
        if (!(attachment instanceof AudioAttachment)) {
            super.W6(view);
            return;
        }
        super.W6(view);
        AudioAttachment audioAttachment = (AudioAttachment) attachment;
        Y6().g(this.itemView.getContext(), audioAttachment.f, audioAttachment.g, audioAttachment.h, audioAttachment.i, 0, null);
        hd60.a().r1(t6());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final lm4 Y6() {
        return (lm4) this.H.getValue();
    }

    public final void b7(AudioPlaylistAttachment audioPlaylistAttachment, PlayState playState, com.vk.music.player.f fVar) {
        if (audioPlaylistAttachment.f.Fb()) {
            return;
        }
        Playlist playlist = audioPlaylistAttachment.f;
        if (playlist.v != 0) {
            boolean z = false;
            if (!Y6().d(playlist)) {
                e7(false);
                h7(false);
                return;
            }
            e7(playState == PlayState.PLAYING);
            if ((fVar == null || !fVar.n()) && !playState.i()) {
                z = true;
            }
            h7(z);
        }
    }

    public final void c7(AudioAttachment audioAttachment, PlayState playState, com.vk.music.player.f fVar) {
        MusicTrack musicTrack = audioAttachment.f;
        MusicTrack f = fVar != null ? fVar.f() : null;
        boolean z = false;
        if (f == null || musicTrack == null || !epx.f(f.c, musicTrack.c) || f.b != musicTrack.b) {
            e7(false);
            h7(false);
            return;
        }
        e7(playState == PlayState.PLAYING);
        if (!fVar.n() && !playState.i()) {
            z = true;
        }
        h7(z);
    }

    public final void d7(PodcastAttachment podcastAttachment, PlayState playState, com.vk.music.player.f fVar) {
        MusicTrack musicTrack = podcastAttachment.f;
        if (podcastAttachment.Eb() || podcastAttachment.f.B()) {
            return;
        }
        if ((fVar != null ? fVar.f() : null) == null || !epx.f(musicTrack, fVar.f())) {
            e7(false);
        } else {
            e7(playState == PlayState.PLAYING);
        }
    }

    public final void e7(boolean z) {
        if (this.itemView.getParent() == null || this.J == z) {
            return;
        }
        this.J = z;
        this.F.setPlayingState(z);
    }

    public final void h7(boolean z) {
        EntryTitle entryTitle;
        Text text;
        if (this.K == z) {
            return;
        }
        this.K = z;
        txq txqVar = this.F;
        if (z) {
            txqVar.b(this.itemView.getResources().getString(R.string.audio_ad_title), true);
        } else {
            CompactAttachmentStyle compactAttachmentStyle = this.C;
            txqVar.b((compactAttachmentStyle == null || (entryTitle = compactAttachmentStyle.g) == null || (text = entryTitle.b) == null) ? null : text.b, false);
        }
    }

    public final void i7(AudioAttachment audioAttachment, com.vk.music.player.f fVar) {
        MusicTrack f = fVar.f();
        MusicTrack musicTrack = audioAttachment.f;
        if (f == null || musicTrack == null || !epx.f(f.c, musicTrack.c) || f.b != musicTrack.b) {
            h7(false);
        } else {
            h7(!fVar.n());
        }
    }

    public final void j7(AudioPlaylistAttachment audioPlaylistAttachment, com.vk.music.player.f fVar) {
        if (!audioPlaylistAttachment.f.Fb()) {
            Playlist playlist = audioPlaylistAttachment.f;
            if (playlist.v != 0) {
                if (Y6().d(playlist)) {
                    h7(!fVar.n());
                    return;
                } else {
                    h7(false);
                    return;
                }
            }
        }
        h7(false);
    }

    @Override // com.vk.music.player.e
    public final void o2(com.vk.music.player.f fVar) {
        Attachment attachment = this.D;
        if (attachment instanceof AudioAttachment) {
            i7((AudioAttachment) attachment, fVar);
        } else if (attachment instanceof AudioPlaylistAttachment) {
            j7((AudioPlaylistAttachment) attachment, fVar);
        } else {
            h7(false);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Y6().e(this);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Y6().f(this);
        feb0 feb0Var = (feb0) this.I.getValue();
        io.reactivex.rxjava3.disposables.c cVar = feb0Var.c;
        if (cVar != null) {
            cVar.dispose();
        }
        feb0Var.c = null;
    }

    @Override // com.vk.music.player.e
    public final boolean t3(VkPlayerException vkPlayerException) {
        return false;
    }

    @Override // com.vk.music.player.e
    public final void B1() {
    }

    @Override // com.vk.music.player.e
    public final void K1() {
    }

    @Override // com.vk.music.player.e
    public final void n3() {
    }

    @Override // com.vk.music.player.e
    public final void x0() {
    }

    @Override // com.vk.music.player.e
    public final void z3() {
    }

    @Override // com.vk.music.player.e
    public final void onError(String str) {
    }

    @Override // com.vk.music.player.e
    public final void y4(List<PlayerTrack> list) {
    }
}
