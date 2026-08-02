package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.podcast.PodcastInfo;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayState;
import com.vk.music.player.e;
import com.vkontakte.android.R;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: PodcastTrailerHolder.kt */
/* loaded from: classes3.dex */
public final class sjb0 extends dib0<PodcastInfo> implements View.OnClickListener, View.OnAttachStateChangeListener {
    public final gjb0 n;
    public final b o;
    public final VkCell p;
    public boolean q;
    public String r;
    public boolean s;
    public final bpn0 t;

    /* compiled from: PodcastTrailerHolder.kt */
    public static final class a implements VkCell.f {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlayPauseIconParams(background=");
            sb.append(this.a);
            sb.append(", contentDescription=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: PodcastTrailerHolder.kt */
    public final class b extends e.a {
        public MusicTrack b = null;

        /* compiled from: PodcastTrailerHolder.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PlayState.values().length];
                try {
                    iArr[PlayState.PLAYING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PlayState.PAUSED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            MusicTrack f = fVar != null ? fVar.f() : null;
            sjb0 sjb0Var = sjb0.this;
            if (f == null || !epx.f(this.b, fVar.f())) {
                sjb0Var.q = false;
                sjb0Var.q6();
            } else {
                sjb0Var.q = playState == PlayState.PLAYING;
                sjb0Var.q6();
            }
            a(playState, fVar);
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void W3(com.vk.music.player.f fVar) {
            a(sjb0.this.n.m0(), fVar);
        }

        public final void a(PlayState playState, com.vk.music.player.f fVar) {
            long j;
            long j2;
            Episode episode;
            int h;
            Episode episode2;
            if ((fVar != null ? fVar.f() : null) == null || !epx.f(this.b, fVar.f()) || fVar.e() <= 0) {
                MusicTrack musicTrack = this.b;
                long j3 = musicTrack != null ? musicTrack.f * 1000 : 0L;
                j = (musicTrack == null || (episode = musicTrack.w) == null) ? 0L : episode.d;
                j2 = j3;
            } else {
                j2 = fVar.e();
                int i = playState == null ? -1 : a.$EnumSwitchMapping$0[playState.ordinal()];
                if (i == 1 || i == 2) {
                    h = fVar.h();
                } else {
                    MusicTrack f = fVar.f();
                    if (f == null || (episode2 = f.w) == null) {
                        h = fVar.h();
                    } else {
                        j = episode2.d;
                    }
                }
                j = h;
            }
            Context context = e43.a;
            String c = pq3.c(context != null ? context : null, j2, j);
            sjb0 sjb0Var = sjb0.this;
            if (TextUtils.equals(c, sjb0Var.r)) {
                return;
            }
            sjb0Var.r = c;
            sjb0Var.q6();
        }
    }

    public sjb0(ViewGroup viewGroup, sib0 sib0Var) {
        super(viewGroup, R.layout.music_podcast_page_trailer_item, 0);
        this.n = sib0Var;
        this.o = new b();
        VkCell vkCell = (VkCell) this.itemView.findViewById(R.id.cell);
        this.p = vkCell;
        this.r = "";
        this.t = new bpn0(new u110(this, 9));
        this.itemView.addOnAttachStateChangeListener(this);
        vkCell.c(new gky(17), new k3i(4));
        q6();
        vkCell.setOnClickListener(this);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        MusicTrack musicTrack = ((PodcastInfo) obj).d;
        if (musicTrack == null) {
            return;
        }
        this.s = musicTrack.Lb();
        b bVar = this.o;
        bVar.b = musicTrack;
        gjb0 gjb0Var = this.n;
        bVar.N3(gjb0Var.m0(), gjb0Var.H());
        q6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MusicTrack musicTrack;
        if (jjc.b() || (musicTrack = ((PodcastInfo) this.m).d) == null || !epx.f(view, this.p)) {
            return;
        }
        this.n.H5(musicTrack, (MusicPlaybackLaunchContext) this.t.getValue());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.n.y2(this.o);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.n.n0(this.o);
    }

    public final void q6() {
        boolean z = this.q;
        VkCell.Left.b a2 = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.e(new a(z ? R.drawable.ic_attachment_audio_pause : R.drawable.ic_attachment_audio_play, z ? R.string.music_talkback_pause : R.string.music_talkback_play), new Size(cn70.b(40), cn70.b(40))));
        VkCell vkCell = this.p;
        vkCell.setLeft(a2);
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        tlo0.f h = tq.h(tlo0.Companion, R.string.podcast_trailer_title);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        vkCell.setMiddle(VkCell.Middle.a.a(aVar, new VkCell.Middle.e(h, 1, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), new VkCell.Middle.d(new tlo0.h(this.r), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, this.s ? new VkCell.Middle.d.b.C0815b(new gko(R.drawable.vk_icon_explicit_12), k1u0.c.a, 4) : null, 18), null, 12));
        vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.d(new b290(this, 5), new tlo0.f(R.string.music_talkback_more), 4), null, 27));
    }
}
