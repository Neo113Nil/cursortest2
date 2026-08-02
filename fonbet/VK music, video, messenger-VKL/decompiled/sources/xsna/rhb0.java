package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.music.MusicTrack;
import com.vk.imageloader.view.VKImageView;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayState;
import com.vk.music.player.e;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.r5b0;
import xsna.tlo0;

/* compiled from: PodcastItemViewHolder.kt */
/* loaded from: classes3.dex */
public final class rhb0 extends dib0<MusicTrack> implements View.OnClickListener, View.OnAttachStateChangeListener {
    public final gjb0 n;
    public final VkCell o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final bpn0 t;
    public final b u;
    public int v;
    public final MusicPlaybackLaunchContext w;

    /* compiled from: PodcastItemViewHolder.kt */
    public static final class a implements VkCell.f {
    }

    /* compiled from: PodcastItemViewHolder.kt */
    public final class b extends e.a {
        public MusicTrack b = null;

        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            boolean z = playState == PlayState.PLAYING;
            boolean z2 = (fVar != null ? fVar.f() : null) != null && epx.f(this.b, fVar.f());
            rhb0 rhb0Var = rhb0.this;
            int i = R.string.podcasts_item_action_listen;
            if (z2) {
                VKImageView vKImageView = (VKImageView) rhb0Var.q.getValue();
                if (vKImageView != null) {
                    vKImageView.setVisibility(0);
                }
                VKImageView vKImageView2 = (VKImageView) rhb0Var.q.getValue();
                if (vKImageView2 != null) {
                    vKImageView2.setActivated(z);
                }
                if (z) {
                    i = R.string.podcasts_item_state_playing;
                }
                rhb0Var.v = i;
            } else {
                VKImageView vKImageView3 = (VKImageView) rhb0Var.q.getValue();
                if (vKImageView3 != null) {
                    vKImageView3.setVisibility(8);
                }
                VKImageView vKImageView4 = (VKImageView) rhb0Var.q.getValue();
                if (vKImageView4 != null) {
                    vKImageView4.setActivated(false);
                }
                rhb0Var.v = R.string.podcasts_item_action_listen;
            }
            MusicTrack musicTrack = (MusicTrack) rhb0Var.m;
            if (musicTrack != null) {
                rhb0Var.q6(musicTrack);
            }
        }
    }

    /* compiled from: PodcastItemViewHolder.kt */
    public static final class c implements VkCell.e {
        public final boolean a;

        /* compiled from: PodcastItemViewHolder.kt */
        public static final class a implements VkCell.d {
            public final LinearLayout a;
            public final /* synthetic */ c b;

            public a(Context context, c cVar) {
                this.b = cVar;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                wg40 wg40Var = new wg40(context);
                wg40Var.setId(R.id.download_indicator);
                linearLayout.addView(wg40Var, new LinearLayout.LayoutParams(cn70.b(36), cn70.b(44)));
                VKImageView vKImageView = new VKImageView(context, null, 6, 0);
                vKImageView.setId(R.id.audio_menu);
                vKImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                vKImageView.setImageResource(R.drawable.vk_icon_more_vertical_16);
                gpo0.f(vKImageView, Integer.valueOf(R.attr.vk_ui_icon_secondary));
                linearLayout.addView(vKImageView, new LinearLayout.LayoutParams(cn70.b(32), cn70.b(44)));
                this.a = linearLayout;
            }

            @Override // com.vk.core.view.components.cell.VkCell.d
            public final void a(VkCell.f fVar) {
                bwt0.p0(this.a.findViewById(R.id.download_indicator), this.b.a);
            }

            @Override // com.vk.core.view.components.cell.VkCell.d
            public final View getView() {
                return this.a;
            }
        }

        public c(boolean z) {
            this.a = z;
        }

        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context, this);
        }
    }

    /* compiled from: PodcastItemViewHolder.kt */
    public static final class d implements VkCell.f {
    }

    public rhb0(ViewGroup viewGroup, sib0 sib0Var) {
        super(viewGroup, R.layout.podcast_item_playlist, 0);
        wg40 wg40Var;
        this.n = sib0Var;
        VkCell vkCell = (VkCell) this.itemView;
        this.o = vkCell;
        b290 b290Var = new b290(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a2 = msy.a(lazyThreadSafetyMode, b290Var);
        this.p = a2;
        Lazy a3 = msy.a(lazyThreadSafetyMode, new in60(this, 9));
        this.q = a3;
        Lazy a4 = msy.a(lazyThreadSafetyMode, new lva0(this, 2));
        this.r = a4;
        Lazy a5 = msy.a(lazyThreadSafetyMode, new su80(this, 5));
        this.s = a5;
        this.t = new bpn0(new kk1(20));
        this.u = new b();
        this.v = R.string.podcasts_item_action_listen;
        this.w = (sib0Var.l.Gb().equals("kids_section") ? MusicPlaybackLaunchContext.y : MusicPlaybackLaunchContext.x).Eb(32).Cb(sib0Var.l.Gb());
        this.itemView.addOnAttachStateChangeListener(this);
        this.itemView.setOnClickListener(this);
        vkCell.c(new zos(16), new j21((byte) 0, 11));
        vkCell.setRightExtraViewController(new c(s6()));
        vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.e(new a(), new Size(cn70.b(72), cn70.b(72)))));
        vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, new VkCell.Right.e.d(new d(), new Size(cn70.b(s6() ? 80 : 38), cn70.b(48))), null, null, 29));
        View view = (View) a5.getValue();
        if (view != null) {
            view.setOnClickListener(this);
        }
        ThumbsImageView thumbsImageView = (ThumbsImageView) a2.getValue();
        if (thumbsImageView != null) {
            thumbsImageView.setOnClickListener(this);
        }
        ThumbsImageView thumbsImageView2 = (ThumbsImageView) a2.getValue();
        if (thumbsImageView2 != null) {
            thumbsImageView2.setEmptyPlaceholder(R.drawable.vk_icon_podcast_24);
        }
        VKImageView vKImageView = (VKImageView) a3.getValue();
        if (vKImageView != null) {
            float b2 = iah0.b(10.0f);
            r5b0.b bVar = new r5b0.b(vKImageView.getContext());
            bVar.a(R.integer.music_playing_drawable_rect_count);
            bVar.d(R.dimen.music_playing_drawable_rect_corners);
            bVar.g(R.dimen.music_playing_drawable_rect_width);
            bVar.e(R.dimen.music_playing_drawable_rect_height);
            bVar.f(R.dimen.music_playing_drawable_rect_min_height);
            bVar.c(R.color.music_playing_drawable_rect_white);
            bVar.b(R.dimen.music_playing_drawable_gap);
            bVar.j = new float[]{b2, iah0.b(16.0f), iah0.b(18.0f), b2};
            vKImageView.setImageDrawable(new r5b0(bVar));
        }
        wg40 wg40Var2 = (wg40) a4.getValue();
        if (wg40Var2 != null) {
            bwt0.p0(wg40Var2, s6());
        }
        if (!s6() || (wg40Var = (wg40) a4.getValue()) == null) {
            return;
        }
        wg40Var.setDownloadedIcon(R.drawable.vk_icon_arrow_down_circle_16);
        wg40Var.setNotLoadedIcon(Integer.valueOf(R.drawable.vk_icon_download_outline_16));
        wg40Var.setContentDescriptionProvider(new k220(11));
        wg40Var.setOnClickListener(this);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vif0
    public final void i6(Object obj) {
        wg40 wg40Var;
        MusicTrack musicTrack = (MusicTrack) obj;
        float f = !musicTrack.B() ? 1.0f : 0.64f;
        ?? r1 = this.p;
        ThumbsImageView thumbsImageView = (ThumbsImageView) r1.getValue();
        if (thumbsImageView != null) {
            thumbsImageView.setThumb(musicTrack.Jb());
        }
        ThumbsImageView thumbsImageView2 = (ThumbsImageView) r1.getValue();
        if (thumbsImageView2 != null) {
            thumbsImageView2.setAlpha(f);
        }
        View view = (View) this.s.getValue();
        if (view != null) {
            view.setContentDescription(this.itemView.getContext().getString(R.string.music_talkback_more));
        }
        q6(musicTrack);
        b bVar = this.u;
        bVar.b = musicTrack;
        gjb0 gjb0Var = this.n;
        bVar.N3(gjb0Var.m0(), gjb0Var.H());
        if (!s6() || (wg40Var = (wg40) this.r.getValue()) == null) {
            return;
        }
        wg40Var.setDownloadState(di40.a(musicTrack.J));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MusicTrack musicTrack = (MusicTrack) this.m;
        if (musicTrack == null) {
            return;
        }
        boolean f = epx.f(view, this.itemView);
        gjb0 gjb0Var = this.n;
        if (f) {
            gjb0Var.V4(musicTrack);
            return;
        }
        if (epx.f(view, (ThumbsImageView) this.p.getValue())) {
            gjb0Var.H5(musicTrack, this.w);
        } else if (epx.f(view, (View) this.s.getValue())) {
            gjb0Var.x5(musicTrack);
        } else if (epx.f(view, (wg40) this.r.getValue())) {
            gjb0Var.f4(musicTrack);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.n.y2(this.u);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.n.n0(this.u);
    }

    public final void q6(MusicTrack musicTrack) {
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        tlo0.a aVar2 = tlo0.Companion;
        String str = musicTrack.d;
        if (str == null) {
            str = "";
        }
        tlo0.h d2 = oq.d(aVar2, str);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        VkCell.Middle.b a2 = VkCell.Middle.a.a(aVar, new VkCell.Middle.e(d2, 2, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), new VkCell.Middle.d(new tlo0.f(this.v), new oe5(16, this, musicTrack), 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 48), null, 12);
        VkCell vkCell = this.o;
        vkCell.setMiddle(a2);
        vkCell.setAlpha(!musicTrack.B() ? 1.0f : 0.64f);
        AppCompatTextView appCompatTextView = (AppCompatTextView) vkCell.findViewById(R.id.ds_internal_cell_middle_subtitle);
        if (appCompatTextView != null) {
            jno0.c(appCompatTextView, R.attr.vk_ui_text_accent);
        }
    }

    public final boolean s6() {
        return ((Boolean) this.t.getValue()).booleanValue() && !this.n.g7();
    }
}
