package xsna;

import android.content.Context;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.widget.TextView;
import com.vk.common.links.AwayLink;
import com.vk.common.links.LinksParserData;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.core.view.links.LinkedTextView;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.podcast.impl.ui.page.PodcastFragment;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.k1u0;
import xsna.qjc;
import xsna.tlo0;

/* compiled from: PodcastEpisodeHeaderViewHolder.kt */
/* loaded from: classes3.dex */
public final class bhb0 extends se50<MusicTrack> implements View.OnAttachStateChangeListener, View.OnClickListener {
    public boolean A;
    public String B;
    public final SpannableStringBuilder C;
    public final qjb0 D;
    public final bpn0 E;
    public final qaz F;
    public final chb0 G;
    public final com.vk.music.podcast.impl.ui.episode.b n;
    public final izs<MusicTrack, s3q0> o;
    public final ThumbsImageView p;
    public final TextView q;
    public final TextView r;
    public final VkGroupHeader s;
    public final LinkedTextView t;
    public final VkCell u;
    public final View v;
    public final View w;
    public final TextView x;
    public final TextView y;
    public MusicTrack z;

    /* compiled from: PodcastEpisodeHeaderViewHolder.kt */
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

    public bhb0(final View view, com.vk.music.podcast.impl.ui.episode.b bVar, bjk bjkVar) {
        super(view);
        this.n = bVar;
        this.o = bjkVar;
        ThumbsImageView thumbsImageView = (ThumbsImageView) view.findViewById(R.id.audio_image);
        thumbsImageView.setRadiusCorner(iah0.b(10.0f));
        this.p = thumbsImageView;
        this.q = (TextView) view.findViewById(R.id.audio_title);
        this.r = (TextView) view.findViewById(R.id.audio_artist);
        VkGroupHeader vkGroupHeader = (VkGroupHeader) view.findViewById(R.id.audio_description_header);
        this.s = vkGroupHeader;
        LinkedTextView linkedTextView = (LinkedTextView) view.findViewById(R.id.audio_description);
        this.t = linkedTextView;
        VkCell vkCell = (VkCell) view.findViewById(R.id.cell);
        this.u = vkCell;
        this.v = view.findViewById(R.id.second_divider);
        View findViewById = view.findViewById(R.id.help_hint);
        this.w = findViewById;
        this.x = (TextView) findViewById.findViewById(R.id.title);
        this.y = (TextView) findViewById.findViewById(R.id.description);
        this.B = "";
        this.C = new SpannableStringBuilder();
        this.D = new qjb0(view.getContext(), bVar.l);
        this.E = new bpn0(new hk70(this, 5));
        qaz qazVar = new qaz(new qjc.a() { // from class: xsna.ahb0
            @Override // xsna.qjc.a
            public final void I(AwayLink awayLink) {
                MusicTrack musicTrack = bhb0.this.z;
                if (musicTrack == null) {
                    return;
                }
                PodcastFragment.a aVar = new PodcastFragment.a(musicTrack.c);
                MusicPlaybackLaunchContext musicPlaybackLaunchContext = MusicPlaybackLaunchContext.v;
                if (!musicPlaybackLaunchContext.equals(MusicPlaybackLaunchContext.d) && musicPlaybackLaunchContext.t().length() > 0) {
                    aVar.j.putString("ref", musicPlaybackLaunchContext.t());
                }
                aVar.y(jnj.a(musicTrack.V));
                aVar.k(view.getContext());
            }
        });
        this.F = qazVar;
        this.itemView.addOnAttachStateChangeListener(this);
        vkGroupHeader.setTitle(new VkGroupHeader.d(tq.h(tlo0.Companion, R.string.podcast_episode_description_header), null, null, null, 0, 510));
        vkGroupHeader.setSize(VkGroupHeader.Size.Medium);
        linkedTextView.setCanShowMessageOptions(true);
        linkedTextView.setTextIsSelectable(true);
        vkCell.c(new j0r(17), new f07((byte) 0, 9));
        l6();
        vkCell.setOnClickListener(this);
        qazVar.b = true;
        findViewById.setOnClickListener(this);
        this.G = new chb0(this);
    }

    @Override // xsna.se50
    public final void b6(MusicTrack musicTrack) {
        MusicTrack musicTrack2 = musicTrack;
        this.z = musicTrack2;
        this.p.setThumb(musicTrack2.Jb());
        ucp ucpVar = ucp.a;
        CharSequence i = ucp.i(musicTrack2.d);
        TextView textView = this.q;
        textView.setText(i);
        if (musicTrack2.s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(i);
            spannableStringBuilder.append((CharSequence) "  ");
            Context context = textView.getContext();
            e3m.a aVar = e3m.a;
            dqa dqaVar = new dqa(m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, context));
            dqaVar.b = cn70.b(1);
            spannableStringBuilder.setSpan(dqaVar, i.length() + 1, i.length() + 2, 0);
            textView.setText(new SpannedString(spannableStringBuilder));
        }
        Episode episode = musicTrack2.w;
        View view = this.v;
        com.vk.music.podcast.impl.ui.episode.b bVar = this.n;
        if (episode != null) {
            String str = episode.e;
            boolean isEmpty = TextUtils.isEmpty(str);
            VkGroupHeader vkGroupHeader = this.s;
            LinkedTextView linkedTextView = this.t;
            if (isEmpty) {
                bwt0.p0(vkGroupHeader, false);
                bwt0.p0(linkedTextView, false);
                bwt0.p0(view, false);
            } else {
                sdz a2 = xwk.d().a();
                int i2 = musicTrack2.f;
                MusicPlaybackLaunchContext musicPlaybackLaunchContext = (MusicPlaybackLaunchContext) this.E.getValue();
                qjb0 qjb0Var = this.D;
                qjb0Var.d = musicTrack2;
                qjb0Var.e = musicPlaybackLaunchContext;
                CharSequence i3 = ucp.i(a2.d(str, new LinksParserData(41867, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, i2, (taz) qjb0Var, false, 10238)));
                if (!bVar.k) {
                    i3 = a2.h(i3);
                    if (i3 instanceof Spannable) {
                        x7q[] x7qVarArr = (x7q[]) ((Spannable) i3).getSpans(0, i3.length(), x7q.class);
                        x7q x7qVar = x7qVarArr != null ? (x7q) rl3.O(x7qVarArr) : null;
                        if (x7qVar != null) {
                            x7qVar.m = new v3o(this, 7);
                        }
                    }
                }
                if (!TextUtils.equals(i3, linkedTextView.getText())) {
                    linkedTextView.setText(i3);
                }
                bwt0.p0(vkGroupHeader, true);
                bwt0.p0(linkedTextView, true);
                bwt0.p0(view, true);
            }
        }
        SpannableStringBuilder spannableStringBuilder2 = this.C;
        spannableStringBuilder2.clear();
        String str2 = musicTrack2.h;
        if (str2 != null && str2.length() != 0) {
            spannableStringBuilder2.append((CharSequence) musicTrack2.h);
            spannableStringBuilder2.setSpan(this.F, 0, spannableStringBuilder2.length(), 0);
        }
        if (musicTrack2.z > 0) {
            if (spannableStringBuilder2.length() > 0) {
                spannableStringBuilder2.append((CharSequence) " · ");
            }
            spannableStringBuilder2.append((CharSequence) pvo0.j(((int) musicTrack2.z) * 1000, false, false));
        }
        this.r.setText(spannableStringBuilder2);
        this.G.N3(bVar.l.m0(), bVar.l.H());
        l7v b = pla.e().b();
        HintId hintId = HintId.INFO_PODCASTS_CATALOG_HINT;
        Hint p = b.p(hintId.getId());
        boolean a3 = pla.e().b().a(hintId.getId());
        View view2 = this.w;
        if (!a3 || p == null) {
            bwt0.p0(view2, false);
            bwt0.p0(view, true);
        } else {
            String str3 = p.d;
            this.x.setText(p.c);
            TextView textView2 = this.y;
            textView2.setText(str3);
            bwt0.p0(textView2, !(str3 == null || str3.length() == 0));
            bwt0.p0(view2, true);
            bwt0.p0(view, false);
        }
        l6();
    }

    public final void l6() {
        boolean z = this.A;
        int i = z ? R.string.podcasts_talkback_pause : R.string.podcasts_talkback_play;
        int i2 = z ? R.drawable.ic_attachment_audio_pause : R.drawable.ic_attachment_audio_play;
        int i3 = z ? R.string.podcasts_item_state_playing : R.string.podcasts_item_action_listen;
        VkCell.Left.b a2 = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.e(new a(i2, i), new Size(cn70.b(40), cn70.b(40))));
        VkCell vkCell = this.u;
        vkCell.setLeft(a2);
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        tlo0.f h = tq.h(tlo0.Companion, i3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        VkCell.Middle.e eVar = new VkCell.Middle.e(h, 1, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50);
        tlo0.h hVar = new tlo0.h(this.B);
        MusicTrack musicTrack = this.z;
        vkCell.setMiddle(VkCell.Middle.a.a(aVar, eVar, new VkCell.Middle.d(hVar, (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (musicTrack == null || !musicTrack.s) ? null : new VkCell.Middle.d.b.C0815b(new gko(R.drawable.vk_icon_explicit_16), new k1u0.a(new x7g(R.attr.vk_ui_icon_secondary)), 4), 18), null, 12));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        MusicTrack musicTrack = this.z;
        if (musicTrack == null || jjc.b()) {
            return;
        }
        if (epx.f(view, this.u)) {
            this.o.invoke(musicTrack);
            return;
        }
        if (epx.f(view, this.w)) {
            this.n.getClass();
            l7v b = pla.e().b();
            HintId hintId = HintId.INFO_PODCASTS_CATALOG_HINT;
            Hint p = b.p(hintId.getId());
            if (p == null) {
                return;
            }
            if (epx.f(p.b, hintId.getId()) && (context = this.itemView.getContext()) != null) {
                xwk.d().e().a(context, "https://" + a0a.d + "/podcasts");
            }
            pla.e().b().b(p.b);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.n.l.P0(this.G, true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.n.l.n0(this.G);
    }
}
