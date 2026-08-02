package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.vk.dto.hints.HintId;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.music.design.view.download.DownloadingView;
import com.vk.music.player.AdvertisementInfo;
import com.vk.music.player.PlayerAction;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.domain.state.LyricsMode;
import com.vk.music.player.domain.state.PlayerControlsMode;
import com.vk.music.player.domain.state.b;
import com.vk.music.player.presentation.main.BigPlayerLayout;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.e3m;

/* compiled from: CompositeMusicPlayerSkinRenderer.kt */
/* loaded from: classes3.dex */
public final class uti {
    public final y17 a;
    public final l07 b;
    public final h4i0 c;
    public final mb40 d;
    public final u2b0 e;
    public final DecimalFormat f;
    public MusicTrack g;
    public boolean h;
    public com.vk.music.player.domain.state.a i;

    public uti(y17 y17Var, l07 l07Var, h4i0 h4i0Var, mb40 mb40Var, u2b0 u2b0Var, DecimalFormat decimalFormat) {
        this.a = y17Var;
        this.b = l07Var;
        this.c = h4i0Var;
        this.d = mb40Var;
        this.e = u2b0Var;
        this.f = decimalFormat;
        LyricsMode lyricsMode = LyricsMode.COLLAPSED;
        lo3 lo3Var = new lo3(this, 1);
        this.i = new com.vk.music.player.domain.state.a();
        jjc.f(lo3Var, y17Var.a);
        jjc.f(lo3Var, y17Var.f);
        jjc.f(lo3Var, y17Var.g);
        jjc.f(lo3Var, y17Var.r);
        jjc.f(lo3Var, y17Var.v);
        jjc.f(lo3Var, y17Var.l);
        jjc.f(lo3Var, y17Var.m);
        jjc.f(lo3Var, y17Var.k);
        jjc.f(lo3Var, y17Var.o);
        jjc.f(lo3Var, y17Var.n);
        jjc.f(lo3Var, y17Var.p);
        jjc.f(lo3Var, y17Var.q);
        jjc.f(lo3Var, y17Var.w);
        c();
    }

    public final void a(com.vk.music.player.domain.state.a aVar) {
        Pair pair;
        int i;
        int i2;
        String str;
        int i3;
        y17 y17Var = this.a;
        ImageButton imageButton = y17Var.q;
        TextView textView = y17Var.g;
        TextView textView2 = y17Var.e;
        TextView textView3 = y17Var.d;
        TextView textView4 = y17Var.f;
        TextView textView5 = y17Var.h;
        TextView textView6 = y17Var.j;
        SeekBar seekBar = y17Var.t;
        TextView textView7 = y17Var.k;
        View view = y17Var.w;
        ThumbsImageView thumbsImageView = y17Var.s;
        ImageButton imageButton2 = y17Var.p;
        ImageButton imageButton3 = y17Var.n;
        TextView textView8 = y17Var.i;
        ImageButton imageButton4 = y17Var.l;
        DownloadingView downloadingView = y17Var.r;
        BigPlayerLayout bigPlayerLayout = y17Var.a;
        ImageButton imageButton5 = y17Var.m;
        this.i = aVar;
        com.vk.music.player.domain.state.b bVar = aVar.q;
        if (bVar instanceof b.d) {
            thumbsImageView.setThumb(null);
            textView3.setText((CharSequence) null);
            textView2.setText((CharSequence) null);
            textView4.setText((CharSequence) null);
            textView.setText((CharSequence) null);
            bwt0.p0(imageButton5, true);
            int i4 = 0;
            bwt0.p0(imageButton4, false);
            bwt0.p0(downloadingView, false);
            bwt0.p0(textView8, false);
            sdy.t(y17Var.o, false);
            sdy.t(imageButton5, false);
            sdy.t(imageButton4, false);
            sdy.t(imageButton3, false);
            sdy.t(imageButton2, false);
            sdy.t(imageButton, false);
            y17Var.v.setVisibility(8);
            int[] constraintSetIds = bigPlayerLayout.getConstraintSetIds();
            int length = constraintSetIds.length;
            int i5 = 0;
            while (i5 < length) {
                androidx.constraintlayout.widget.b Z4 = bigPlayerLayout.Z4(constraintSetIds[i5]);
                Z4.k(R.id.more, 3, R.id.play_pause, 3);
                Z4.k(R.id.more, 4, R.id.play_pause, 4);
                Z4.k(R.id.more, 7, i4, 7);
                Z4.G(R.id.more, 7, cn70.b(16));
                Z4.h(R.id.more, 6);
                Z4.k(R.id.add, 3, R.id.play_pause, 3);
                Z4.k(R.id.add, 4, R.id.play_pause, 4);
                Z4.k(R.id.add, 6, i4, 6);
                Z4.G(R.id.add, 6, cn70.b(16));
                Z4.h(R.id.add, 7);
                i5++;
                i4 = 0;
            }
            return;
        }
        boolean z = bVar instanceof b.f;
        l07 l07Var = this.b;
        if (z) {
            b.f fVar = (b.f) bVar;
            b(aVar, fVar.c, (Set) fVar.a);
            if (aVar.s) {
                imageButton5.setVisibility(8);
                downloadingView.setVisibility(0);
                downloadingView.a(di40.a(aVar.p), true);
                i2 = 0;
            } else if (aVar.r) {
                downloadingView.setVisibility(8);
                baf0 baf0Var = l07Var.b;
                if (baf0Var == null) {
                    baf0Var = null;
                }
                imageButton5.setImageDrawable(baf0Var);
                i2 = 0;
                imageButton5.setVisibility(0);
                sdy.t(imageButton5, true);
            } else {
                i2 = 0;
                downloadingView.setVisibility(8);
                baf0 baf0Var2 = l07Var.b;
                if (baf0Var2 == null) {
                    baf0Var2 = null;
                }
                imageButton5.setImageDrawable(baf0Var2);
                imageButton5.setVisibility(0);
                sdy.t(imageButton5, false);
            }
            imageButton4.setVisibility(i2);
            imageButton3.setVisibility(i2);
            imageButton2.setVisibility(i2);
            baf0 baf0Var3 = l07Var.f;
            if (baf0Var3 == null) {
                baf0Var3 = null;
            }
            imageButton2.setImageDrawable(baf0Var3);
            imageButton2.setContentDescription(bigPlayerLayout.getContext().getString(R.string.music_talkback_next));
            baf0 baf0Var4 = l07Var.d;
            if (baf0Var4 == null) {
                baf0Var4 = null;
            }
            imageButton3.setImageDrawable(baf0Var4);
            imageButton3.setContentDescription(bigPlayerLayout.getContext().getString(R.string.music_talkback_prev));
            textView8.setVisibility(8);
            textView7.setVisibility(8);
            seekBar.setVisibility(0);
            textView6.setVisibility(0);
            textView5.setVisibility(0);
            view.setVisibility(0);
            int[] constraintSetIds2 = bigPlayerLayout.getConstraintSetIds();
            int i6 = 0;
            for (int length2 = constraintSetIds2.length; i6 < length2; length2 = length2) {
                bigPlayerLayout.Z4(constraintSetIds2[i6]).G(R.id.more, 7, l07Var.z);
                i6++;
                constraintSetIds2 = constraintSetIds2;
            }
            sdy.t(imageButton3, ((Set) fVar.a).contains(PlayerAction.changeTrackPrev));
            sdy.t(imageButton2, ((Set) fVar.a).contains(PlayerAction.changeTrackNext));
            boolean z2 = fVar.c.p;
            boolean z3 = z2 || aVar.l != LyricsMode.COLLAPSED;
            if (view.isEnabled() != z3) {
                view.setEnabled(z3);
            }
            view.setAlpha(z3 ? 1.0f : 0.5f);
            if (z2 && aVar.l == LyricsMode.COLLAPSED && !this.h) {
                this.h = true;
                pla.e().b().h(y17Var.w, HintId.MUSIC_LYRICS_BUTTON.getId(), null, null, null);
            }
            MusicTrack musicTrack = fVar.c;
            TextView textView9 = y17Var.z;
            View view2 = y17Var.u;
            lmc.c(textView9, musicTrack.d, musicTrack.e, true, musicTrack.s);
            TextView textView10 = y17Var.A;
            ucp ucpVar = ucp.a;
            StringBuilder sb = new StringBuilder();
            List<Artist> list = musicTrack.t;
            if (list != null) {
                str = s490.i(list);
            } else {
                str = musicTrack.h;
                if (str == null) {
                    str = "";
                }
            }
            sb.append(str);
            sb.append(' ');
            sb.append(s490.c(musicTrack.u));
            textView10.setText(ucp.i(drm0.p0(sb.toString()).toString()));
            if (aVar.l != LyricsMode.COLLAPSED) {
                Drawable background = view2.getBackground();
                w7g w7gVar = background instanceof w7g ? (w7g) background : null;
                if (w7gVar == null) {
                    w7gVar = new w7g();
                }
                int i7 = aVar.v;
                w7gVar.e = new int[]{n8g.l(i7, 0), n8g.l(i7, 128)};
                view2.setBackground(w7gVar);
                view2.invalidate();
                int a = iah0.a(8);
                view2.setPadding(a, a, a, a);
                baf0 baf0Var5 = l07Var.o;
                if (baf0Var5 == null) {
                    baf0Var5 = null;
                }
                thumbsImageView.setEmptyPlaceholder(baf0Var5);
                thumbsImageView.setBackground(e3m.f(R.attr.vk_ui_image_placeholder_alpha, bigPlayerLayout.getContext()));
                thumbsImageView.setCornerRadius(l07Var.C);
                view.setBackgroundResource(R.drawable.bg_switch_lyrics);
                i3 = 0;
                xo2.f(y17Var.x, false, true, 300L);
                xo2.f(y17Var.y, true, true, 300L);
                if (musicTrack.equals(this.g)) {
                    boolean z4 = aVar.o == PlayerControlsMode.HIDDEN;
                    ty0 ty0Var = new ty0(aVar, y17Var, this, 6);
                    int i8 = z4 ? R.id.lyrics_maximized : R.id.lyrics_expanded;
                    if (bigPlayerLayout.getCurrentState() != R.id.player_landscape && bigPlayerLayout.getCurrentState() != R.id.player_split_screen) {
                        if (bigPlayerLayout.getCurrentState() == i8) {
                            ty0Var.invoke();
                        } else {
                            k07 k07Var = new k07(ty0Var, bigPlayerLayout);
                            if (bigPlayerLayout.g0 == null) {
                                bigPlayerLayout.g0 = new CopyOnWriteArrayList<>();
                            }
                            bigPlayerLayout.g0.add(k07Var);
                            bigPlayerLayout.k5(i8);
                        }
                    }
                    i3 = 0;
                } else {
                    this.g = musicTrack;
                    y17Var.b.L2(lz6.a);
                    y17Var.B.scrollToPosition(0);
                }
            } else {
                view2.setBackground(null);
                view2.invalidate();
                view2.setPadding(0, 0, 0, 0);
                baf0 baf0Var6 = l07Var.n;
                if (baf0Var6 == null) {
                    baf0Var6 = null;
                }
                thumbsImageView.setEmptyPlaceholder(baf0Var6);
                thumbsImageView.setBackground(e3m.f(R.attr.vk_ui_background_modal, bigPlayerLayout.getContext()));
                thumbsImageView.setCornerRadius(l07Var.B);
                view.setBackgroundResource(0);
                xo2.f(y17Var.x, true, true, 300L);
                xo2.f(y17Var.y, false, true, 300L);
                this.g = musicTrack;
                if (bigPlayerLayout.getCurrentState() == R.id.lyrics_expanded || bigPlayerLayout.getCurrentState() == R.id.lyrics_maximized) {
                    bigPlayerLayout.k5(R.id.lyrics_collapsed);
                }
                ca00 ca00Var = y17Var.C;
                int itemCount = ca00Var.getItemCount();
                ca00Var.clear();
                if (itemCount > 0) {
                    i3 = 0;
                    ca00Var.notifyItemRangeRemoved(0, itemCount);
                }
                i3 = 0;
            }
            textView2.setVisibility(i3);
            textView.setVisibility(i3);
            textView4.setText((CharSequence) null);
            textView4.setVisibility(4);
            textView3.setVisibility(4);
            if (fVar.c.P) {
                imageButton4.setVisibility(i3);
                baf0 baf0Var7 = l07Var.q;
                if (baf0Var7 == null) {
                    baf0Var7 = null;
                }
                imageButton4.setImageDrawable(baf0Var7);
                sdy.t(imageButton4, true);
                imageButton4.setContentDescription(bigPlayerLayout.getContext().getString(R.string.music_track_dislike_on_talkback));
            } else {
                imageButton4.setVisibility(i3);
                baf0 baf0Var8 = l07Var.p;
                if (baf0Var8 == null) {
                    baf0Var8 = null;
                }
                imageButton4.setImageDrawable(baf0Var8);
                sdy.t(imageButton4, true);
                imageButton4.setContentDescription(bigPlayerLayout.getContext().getString(R.string.music_track_dislike_off_talkback));
            }
            for (int i9 : bigPlayerLayout.getConstraintSetIds()) {
                int currentState = bigPlayerLayout.getCurrentState();
                if (currentState == R.id.lyrics_collapsed) {
                    androidx.constraintlayout.widget.b Z42 = bigPlayerLayout.Z4(i9);
                    Z42.k(R.id.more, 3, R.id.title_container, 3);
                    Z42.k(R.id.more, 4, R.id.artist, 4);
                    Z42.k(R.id.more, 7, 0, 7);
                    Z42.G(R.id.more, 7, cn70.b(16));
                    Z42.h(R.id.more, 6);
                    Z42.k(R.id.add, 3, R.id.play_pause, 3);
                    Z42.k(R.id.add, 4, R.id.play_pause, 4);
                    Z42.k(R.id.add, 7, 0, 7);
                    Z42.G(R.id.add, 7, cn70.b(16));
                    Z42.h(R.id.add, 6);
                    Z42.k(R.id.downloading, 3, R.id.play_pause, 3);
                    Z42.k(R.id.downloading, 4, R.id.play_pause, 4);
                    Z42.k(R.id.downloading, 7, 0, 7);
                    Z42.G(R.id.downloading, 7, cn70.b(16));
                    Z42.h(R.id.downloading, 6);
                    Z42.k(R.id.switch_lyrics, 3, R.id.title_container, 3);
                    Z42.k(R.id.switch_lyrics, 4, R.id.artist, 4);
                    Z42.k(R.id.switch_lyrics, 7, R.id.more, 6);
                    Z42.G(R.id.switch_lyrics, 7, cn70.b(16));
                    Z42.h(R.id.switch_lyrics, 6);
                } else if (currentState == R.id.lyrics_expanded) {
                    androidx.constraintlayout.widget.b Z43 = bigPlayerLayout.Z4(i9);
                    Z43.k(R.id.switch_lyrics, 3, R.id.title_compact_container, 3);
                    Z43.k(R.id.switch_lyrics, 4, R.id.artist_compact, 4);
                    Z43.k(R.id.switch_lyrics, 7, 0, 7);
                    Z43.G(R.id.switch_lyrics, 7, cn70.b(16));
                    Z43.h(R.id.switch_lyrics, 6);
                } else {
                    androidx.constraintlayout.widget.b Z44 = bigPlayerLayout.Z4(i9);
                    Z44.k(R.id.more, 3, R.id.title_container, 3);
                    Z44.k(R.id.more, 4, R.id.artist, 4);
                    Z44.k(R.id.more, 7, 0, 7);
                    Z44.G(R.id.more, 7, cn70.b(16));
                    Z44.h(R.id.more, 6);
                    Z44.k(R.id.add, 3, R.id.play_pause, 3);
                    Z44.k(R.id.add, 4, R.id.play_pause, 4);
                    Z44.k(R.id.add, 7, 0, 7);
                    Z44.G(R.id.add, 7, cn70.b(16));
                    Z44.h(R.id.add, 6);
                    Z44.k(R.id.downloading, 3, R.id.play_pause, 3);
                    Z44.k(R.id.downloading, 4, R.id.play_pause, 4);
                    Z44.k(R.id.downloading, 7, 0, 7);
                    Z44.G(R.id.downloading, 7, cn70.b(16));
                    Z44.h(R.id.downloading, 6);
                }
            }
            return;
        }
        boolean z5 = bVar instanceof b.h;
        DecimalFormat decimalFormat = this.f;
        u2b0 u2b0Var = this.e;
        if (z5) {
            b.h hVar = (b.h) bVar;
            b(aVar, hVar.c, (Set) hVar.a);
            baf0 baf0Var9 = l07Var.m;
            if (baf0Var9 == null) {
                baf0Var9 = null;
            }
            thumbsImageView.setEmptyPlaceholder(baf0Var9);
            float l = u2b0Var.l();
            bwt0.p0(imageButton4, false);
            textView7.setText(decimalFormat.format(l));
            bwt0.p0(imageButton3, true);
            bwt0.p0(imageButton2, true);
            baf0 baf0Var10 = l07Var.g;
            if (baf0Var10 == null) {
                baf0Var10 = null;
            }
            imageButton2.setImageDrawable(baf0Var10);
            imageButton2.setContentDescription(bigPlayerLayout.getContext().getString(R.string.accessibility_rewind_on_15_sec_forward));
            baf0 baf0Var11 = l07Var.e;
            if (baf0Var11 == null) {
                baf0Var11 = null;
            }
            imageButton3.setImageDrawable(baf0Var11);
            imageButton3.setContentDescription(bigPlayerLayout.getContext().getString(R.string.accessibility_rewind_on_15_sec_backward));
            bwt0.p0(textView8, false);
            bwt0.p0(textView7, true);
            bwt0.p0(imageButton5, false);
            bwt0.p0(downloadingView, false);
            bwt0.p0(seekBar, true);
            bwt0.p0(textView6, true);
            bwt0.p0(textView5, true);
            bwt0.p0(view, false);
            for (int i10 : bigPlayerLayout.getConstraintSetIds()) {
                androidx.constraintlayout.widget.b Z45 = bigPlayerLayout.Z4(i10);
                Z45.G(R.id.speed, 6, l07Var.x);
                Z45.G(R.id.more, 7, l07Var.z);
            }
            sdy.t(imageButton3, true);
            sdy.t(imageButton2, true);
            for (int i11 : bigPlayerLayout.getConstraintSetIds()) {
                if (bigPlayerLayout.getCurrentState() == R.id.lyrics_collapsed) {
                    androidx.constraintlayout.widget.b Z46 = bigPlayerLayout.Z4(i11);
                    Z46.k(R.id.more, 3, R.id.play_pause, 3);
                    Z46.k(R.id.more, 4, R.id.play_pause, 4);
                    Z46.k(R.id.more, 7, 0, 7);
                    Z46.G(R.id.more, 7, cn70.b(16));
                    Z46.h(R.id.more, 6);
                } else {
                    androidx.constraintlayout.widget.b Z47 = bigPlayerLayout.Z4(i11);
                    Z47.k(R.id.more, 3, R.id.play_pause, 3);
                    Z47.k(R.id.more, 4, R.id.play_pause, 4);
                    Z47.k(R.id.more, 7, R.id.title_container, 7);
                    Z47.G(R.id.more, 7, cn70.b(16));
                    Z47.h(R.id.more, 6);
                }
            }
            return;
        }
        if (bVar instanceof b.g) {
            b.g gVar = (b.g) bVar;
            b(aVar, gVar.c, (Set) gVar.a);
            baf0 baf0Var12 = l07Var.n;
            if (baf0Var12 == null) {
                baf0Var12 = null;
            }
            thumbsImageView.setEmptyPlaceholder(baf0Var12);
            float l2 = u2b0Var.l();
            bwt0.p0(imageButton4, false);
            textView7.setText(decimalFormat.format(l2));
            bwt0.p0(imageButton3, true);
            bwt0.p0(imageButton2, true);
            baf0 baf0Var13 = l07Var.g;
            if (baf0Var13 == null) {
                baf0Var13 = null;
            }
            imageButton2.setImageDrawable(baf0Var13);
            imageButton2.setContentDescription(bigPlayerLayout.getContext().getString(R.string.accessibility_rewind_on_15_sec_forward));
            baf0 baf0Var14 = l07Var.e;
            if (baf0Var14 == null) {
                baf0Var14 = null;
            }
            imageButton3.setImageDrawable(baf0Var14);
            imageButton3.setContentDescription(bigPlayerLayout.getContext().getString(R.string.accessibility_rewind_on_15_sec_backward));
            bwt0.p0(textView8, false);
            bwt0.p0(textView7, true);
            bwt0.p0(imageButton5, false);
            bwt0.p0(downloadingView, false);
            bwt0.p0(seekBar, true);
            bwt0.p0(textView6, true);
            bwt0.p0(textView5, true);
            bwt0.p0(view, false);
            textView4.setTextColor(e3m.f(R.attr.vk_ui_text_secondary, textView4.getContext()));
            for (int i12 : bigPlayerLayout.getConstraintSetIds()) {
                androidx.constraintlayout.widget.b Z48 = bigPlayerLayout.Z4(i12);
                Z48.G(R.id.speed, 6, l07Var.x);
                Z48.G(R.id.more, 7, l07Var.z);
            }
            sdy.t(imageButton3, true);
            sdy.t(imageButton2, true);
            int i13 = 0;
            sdy.t(imageButton, false);
            int[] constraintSetIds3 = bigPlayerLayout.getConstraintSetIds();
            int length3 = constraintSetIds3.length;
            int i14 = 0;
            while (i14 < length3) {
                androidx.constraintlayout.widget.b Z49 = bigPlayerLayout.Z4(constraintSetIds3[i14]);
                Z49.k(R.id.more, 3, R.id.play_pause, 3);
                Z49.k(R.id.more, 4, R.id.play_pause, 4);
                Z49.k(R.id.more, 7, i13, 7);
                Z49.G(R.id.more, 7, cn70.b(16));
                Z49.h(R.id.more, 6);
                i14++;
                i13 = 0;
            }
            return;
        }
        if (bVar instanceof b.C1334b) {
            b.C1334b c1334b = (b.C1334b) bVar;
            b(aVar, c1334b.c, (Set) c1334b.a);
            float l3 = u2b0Var.l();
            bwt0.p0(imageButton4, false);
            textView4.setVisibility(0);
            textView3.setVisibility(0);
            textView.setVisibility(4);
            textView2.setVisibility(4);
            textView7.setText(decimalFormat.format(l3));
            bwt0.p0(imageButton3, true);
            bwt0.p0(imageButton2, true);
            baf0 baf0Var15 = l07Var.g;
            if (baf0Var15 == null) {
                baf0Var15 = null;
            }
            imageButton2.setImageDrawable(baf0Var15);
            imageButton2.setContentDescription(bigPlayerLayout.getContext().getString(R.string.accessibility_rewind_on_15_sec_forward));
            baf0 baf0Var16 = l07Var.e;
            if (baf0Var16 == null) {
                baf0Var16 = null;
            }
            imageButton3.setImageDrawable(baf0Var16);
            imageButton3.setContentDescription(bigPlayerLayout.getContext().getString(R.string.accessibility_rewind_on_15_sec_backward));
            bwt0.p0(textView8, false);
            bwt0.p0(textView7, true);
            bwt0.p0(imageButton5, false);
            bwt0.p0(downloadingView, false);
            bwt0.p0(imageButton4, false);
            bwt0.p0(seekBar, true);
            bwt0.p0(textView6, true);
            bwt0.p0(textView5, true);
            bwt0.p0(view, false);
            for (int i15 : bigPlayerLayout.getConstraintSetIds()) {
                androidx.constraintlayout.widget.b Z410 = bigPlayerLayout.Z4(i15);
                Z410.G(R.id.speed, 6, l07Var.x);
                Z410.G(R.id.more, 7, l07Var.z);
            }
            MusicTrack b = u2b0Var.b();
            textView4.setText(b != null ? b.h : null);
            textView4.setTextColor(e3m.f(R.attr.vk_ui_text_secondary, textView4.getContext()));
            sdy.t(imageButton3, true);
            sdy.t(imageButton2, true);
            for (int i16 : bigPlayerLayout.getConstraintSetIds()) {
                if (bigPlayerLayout.getCurrentState() == R.id.lyrics_collapsed) {
                    androidx.constraintlayout.widget.b Z411 = bigPlayerLayout.Z4(i16);
                    Z411.k(R.id.more, 3, R.id.play_pause, 3);
                    Z411.k(R.id.more, 4, R.id.play_pause, 4);
                    Z411.k(R.id.more, 7, 0, 7);
                    Z411.G(R.id.more, 7, cn70.b(16));
                    Z411.h(R.id.more, 6);
                } else {
                    androidx.constraintlayout.widget.b Z412 = bigPlayerLayout.Z4(i16);
                    Z412.k(R.id.more, 3, R.id.play_pause, 3);
                    Z412.k(R.id.more, 4, R.id.play_pause, 4);
                    Z412.k(R.id.more, 7, R.id.title_container, 7);
                    Z412.G(R.id.more, 7, cn70.b(16));
                    Z412.h(R.id.more, 6);
                }
            }
            return;
        }
        if (bVar instanceof b.c) {
            b.c cVar = (b.c) bVar;
            b(aVar, cVar.c, (Set) cVar.a);
            thumbsImageView.setEmptyPlaceholder(R.drawable.vk_icon_song_outline_56);
            textView7.setText(decimalFormat.format(u2b0Var.l()));
            bwt0.p0(imageButton3, false);
            bwt0.p0(imageButton2, false);
            bwt0.p0(textView8, false);
            bwt0.p0(textView7, true);
            bwt0.p0(imageButton5, false);
            bwt0.p0(downloadingView, false);
            bwt0.p0(imageButton4, false);
            bwt0.p0(seekBar, false);
            bwt0.p0(textView6, false);
            bwt0.p0(textView5, false);
            bwt0.p0(view, false);
            for (int i17 : bigPlayerLayout.getConstraintSetIds()) {
                androidx.constraintlayout.widget.b Z413 = bigPlayerLayout.Z4(i17);
                Z413.G(R.id.speed, 6, l07Var.y);
                Z413.G(R.id.more, 7, l07Var.A);
            }
            int i18 = R.id.more;
            int[] constraintSetIds4 = bigPlayerLayout.getConstraintSetIds();
            int length4 = constraintSetIds4.length;
            int i19 = 0;
            while (i19 < length4) {
                androidx.constraintlayout.widget.b Z414 = bigPlayerLayout.Z4(constraintSetIds4[i19]);
                Z414.k(i18, 3, R.id.play_pause, 3);
                Z414.k(i18, 4, R.id.play_pause, 4);
                Z414.k(i18, 7, 0, 7);
                Z414.G(i18, 7, cn70.b(16));
                Z414.h(i18, 6);
                i19++;
                i18 = R.id.more;
            }
            return;
        }
        if (bVar instanceof b.e) {
            b.e eVar = (b.e) bVar;
            b(aVar, eVar.c, (Set) eVar.a);
            thumbsImageView.setEmptyPlaceholder(R.drawable.vk_icon_song_outline_56);
            textView7.setText(decimalFormat.format(u2b0Var.l()));
            bwt0.p0(imageButton3, true);
            bwt0.p0(imageButton2, true);
            baf0 baf0Var17 = l07Var.g;
            if (baf0Var17 == null) {
                baf0Var17 = null;
            }
            imageButton2.setImageDrawable(baf0Var17);
            imageButton2.setContentDescription(bigPlayerLayout.getContext().getString(R.string.accessibility_rewind_on_15_sec_forward));
            baf0 baf0Var18 = l07Var.e;
            if (baf0Var18 == null) {
                baf0Var18 = null;
            }
            imageButton3.setImageDrawable(baf0Var18);
            imageButton3.setContentDescription(bigPlayerLayout.getContext().getString(R.string.accessibility_rewind_on_15_sec_backward));
            bwt0.p0(textView8, false);
            bwt0.p0(textView7, true);
            bwt0.p0(imageButton5, false);
            bwt0.p0(downloadingView, false);
            bwt0.p0(imageButton4, false);
            bwt0.p0(seekBar, true);
            bwt0.p0(textView6, true);
            bwt0.p0(textView5, true);
            bwt0.p0(view, false);
            for (int i20 : bigPlayerLayout.getConstraintSetIds()) {
                androidx.constraintlayout.widget.b Z415 = bigPlayerLayout.Z4(i20);
                Z415.G(R.id.speed, 6, l07Var.x);
                Z415.G(R.id.more, 7, l07Var.z);
            }
            sdy.t(imageButton3, true);
            sdy.t(imageButton2, true);
            for (int i21 : bigPlayerLayout.getConstraintSetIds()) {
                androidx.constraintlayout.widget.b Z416 = bigPlayerLayout.Z4(i21);
                Z416.k(R.id.more, 3, R.id.play_pause, 3);
                Z416.k(R.id.more, 4, R.id.play_pause, 4);
                Z416.k(R.id.more, 7, 0, 7);
                Z416.G(R.id.more, 7, cn70.b(16));
                Z416.h(R.id.more, 6);
            }
            return;
        }
        boolean z6 = bVar instanceof b.i;
        h4i0 h4i0Var = this.c;
        if (z6) {
            b.i iVar = (b.i) bVar;
            b(aVar, iVar.c, (Set) iVar.a);
            if (aVar.t) {
                baf0 baf0Var19 = l07Var.c;
                if (baf0Var19 == null) {
                    baf0Var19 = null;
                }
                imageButton5.setImageDrawable(baf0Var19);
                imageButton5.setContentDescription(bigPlayerLayout.getContext().getString(R.string.music_radio_talkback_unfollow));
                sdy.t(imageButton5, true);
            } else {
                baf0 baf0Var20 = l07Var.b;
                if (baf0Var20 == null) {
                    baf0Var20 = null;
                }
                imageButton5.setImageDrawable(baf0Var20);
                imageButton5.setContentDescription(bigPlayerLayout.getContext().getString(R.string.music_radio_talkback_follow));
                sdy.t(imageButton5, aVar.r);
            }
            imageButton5.setVisibility(0);
            h4i0Var.f = false;
            seekBar.setVisibility(0);
            textView8.setVisibility(0);
            textView4.setText(bigPlayerLayout.getContext().getString(R.string.auido_radiostation_artist));
            textView4.setTextColor(l07Var.w);
            thumbsImageView.setEmptyPlaceholder(R.drawable.vk_icon_radiowaves_around_outline_96);
            imageButton3.setVisibility(0);
            imageButton2.setVisibility(0);
            baf0 baf0Var21 = l07Var.f;
            if (baf0Var21 == null) {
                baf0Var21 = null;
            }
            imageButton2.setImageDrawable(baf0Var21);
            imageButton2.setContentDescription(bigPlayerLayout.getContext().getString(R.string.music_talkback_next));
            baf0 baf0Var22 = l07Var.d;
            if (baf0Var22 == null) {
                baf0Var22 = null;
            }
            imageButton3.setImageDrawable(baf0Var22);
            imageButton3.setContentDescription(bigPlayerLayout.getContext().getString(R.string.music_talkback_prev));
            List<PlayerTrack> list2 = aVar.d;
            com.vk.music.player.f fVar2 = aVar.a;
            sdy.t(imageButton3, list2.indexOf(fVar2 != null ? fVar2.c : null) > 0);
            com.vk.music.player.f fVar3 = aVar.a;
            sdy.t(imageButton2, list2.indexOf(fVar3 != null ? fVar3.c : null) < list2.size() + (-1));
            textView7.setVisibility(8);
            downloadingView.setVisibility(8);
            textView6.setVisibility(8);
            textView5.setVisibility(8);
            view.setVisibility(8);
            for (int i22 : bigPlayerLayout.getConstraintSetIds()) {
                bigPlayerLayout.Z4(i22).G(R.id.more, 7, l07Var.z);
            }
            for (int i23 : bigPlayerLayout.getConstraintSetIds()) {
                if (bigPlayerLayout.getCurrentState() == R.id.lyrics_collapsed) {
                    androidx.constraintlayout.widget.b Z417 = bigPlayerLayout.Z4(i23);
                    Z417.k(R.id.more, 3, R.id.play_pause, 3);
                    Z417.k(R.id.more, 4, R.id.play_pause, 4);
                    Z417.k(R.id.more, 6, 0, 6);
                    Z417.G(R.id.more, 6, cn70.b(16));
                    Z417.h(R.id.more, 7);
                    Z417.k(R.id.add, 3, R.id.play_pause, 3);
                    Z417.k(R.id.add, 4, R.id.play_pause, 4);
                    Z417.k(R.id.add, 7, 0, 7);
                    Z417.G(R.id.add, 7, cn70.b(16));
                    Z417.h(R.id.add, 6);
                } else {
                    androidx.constraintlayout.widget.b Z418 = bigPlayerLayout.Z4(i23);
                    Z418.k(R.id.more, 3, R.id.play_pause, 3);
                    Z418.k(R.id.more, 4, R.id.play_pause, 4);
                    Z418.k(R.id.more, 6, R.id.title_container, 6);
                    Z418.G(R.id.more, 6, cn70.b(16));
                    Z418.h(R.id.more, 7);
                    Z418.k(R.id.add, 3, R.id.play_pause, 3);
                    Z418.k(R.id.add, 4, R.id.play_pause, 4);
                    Z418.k(R.id.add, 7, 0, 7);
                    Z418.G(R.id.add, 7, cn70.b(16));
                    Z418.h(R.id.add, 6);
                }
            }
            return;
        }
        if (!(bVar instanceof b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        b.a aVar2 = (b.a) bVar;
        TextView textView11 = y17Var.v;
        ImageButton imageButton6 = y17Var.o;
        textView8.setVisibility(8);
        AdvertisementInfo advertisementInfo = aVar2.c;
        boolean z7 = advertisementInfo != null ? advertisementInfo.d : false;
        textView11.setVisibility(0);
        textView11.setText(z7 ? R.string.music_ad_go_to_banner : R.string.disable_music_ad);
        textView4.setText(z7 ? bigPlayerLayout.getContext().getString(R.string.disable_music_ad) : "");
        textView4.setVisibility(z7 ? 0 : 8);
        textView4.setTextColor(l07Var.s);
        textView.setText((CharSequence) null);
        textView.setVisibility(8);
        textView2.setVisibility(8);
        textView3.setVisibility(0);
        lmc.c(textView3, bigPlayerLayout.getContext().getString(R.string.audio_ad_title), "", false, false);
        lmc.c(textView2, bigPlayerLayout.getContext().getString(R.string.audio_ad_title), "", false, false);
        thumbsImageView.setEmptyPlaceholder(R.drawable.vk_icon_song_outline_56);
        AdvertisementInfo advertisementInfo2 = aVar2.c;
        thumbsImageView.setThumb(advertisementInfo2 != null ? new Thumb(advertisementInfo2.c) : null);
        thumbsImageView.setOverlayImage(l07Var.r);
        h4i0Var.e = false;
        h4i0Var.f = ((Set) aVar2.a).contains(PlayerAction.seek);
        if (aVar.c.h()) {
            baf0 baf0Var23 = l07Var.i;
            if (baf0Var23 == null) {
                baf0Var23 = null;
            }
            pair = new Pair(baf0Var23, bigPlayerLayout.getContext().getString(R.string.music_talkback_pause));
        } else {
            baf0 baf0Var24 = l07Var.h;
            if (baf0Var24 == null) {
                baf0Var24 = null;
            }
            pair = new Pair(baf0Var24, bigPlayerLayout.getContext().getString(R.string.music_talkback_play));
        }
        Drawable drawable = (Drawable) pair.d();
        String str2 = (String) pair.g();
        imageButton6.setImageDrawable(drawable);
        imageButton6.setContentDescription(str2);
        downloadingView.setVisibility(8);
        textView7.setVisibility(8);
        imageButton4.setVisibility(8);
        baf0 baf0Var25 = l07Var.b;
        if (baf0Var25 == null) {
            baf0Var25 = null;
        }
        imageButton5.setImageDrawable(baf0Var25);
        imageButton5.setVisibility(0);
        sdy.t(imageButton5, false);
        sdy.t(imageButton6, ((Set) aVar2.a).contains(PlayerAction.playPause));
        sdy.t(imageButton, ((Set) aVar2.a).contains(PlayerAction.more));
        sdy.t(imageButton3, false);
        sdy.t(imageButton2, false);
        for (int i24 : bigPlayerLayout.getConstraintSetIds()) {
            bigPlayerLayout.Z4(i24).G(R.id.more, 7, l07Var.z);
        }
        view.setVisibility(8);
        if (bigPlayerLayout.getCurrentState() == R.id.lyrics_expanded || bigPlayerLayout.getCurrentState() == R.id.lyrics_maximized) {
            i = R.id.lyrics_collapsed;
            bigPlayerLayout.k5(R.id.lyrics_collapsed);
        } else {
            i = R.id.lyrics_collapsed;
        }
        for (int i25 : bigPlayerLayout.getConstraintSetIds()) {
            if (bigPlayerLayout.getCurrentState() == i) {
                androidx.constraintlayout.widget.b Z419 = bigPlayerLayout.Z4(i25);
                Z419.k(R.id.more, 3, R.id.play_pause, 3);
                Z419.k(R.id.more, 4, R.id.play_pause, 4);
                Z419.k(R.id.more, 7, 0, 7);
                Z419.G(R.id.more, 7, cn70.b(16));
                Z419.h(R.id.more, 6);
                Z419.k(R.id.add, 3, R.id.play_pause, 3);
                Z419.k(R.id.add, 4, R.id.play_pause, 4);
                Z419.k(R.id.add, 6, 0, 6);
                Z419.G(R.id.add, 6, cn70.b(16));
                Z419.h(R.id.add, 7);
            } else {
                androidx.constraintlayout.widget.b Z420 = bigPlayerLayout.Z4(i25);
                Z420.k(R.id.more, 3, R.id.play_pause, 3);
                Z420.k(R.id.more, 4, R.id.play_pause, 4);
                Z420.k(R.id.more, 7, 0, 7);
                Z420.G(R.id.more, 7, cn70.b(16));
                Z420.h(R.id.more, 6);
                Z420.k(R.id.add, 3, R.id.play_pause, 3);
                Z420.k(R.id.add, 4, R.id.play_pause, 4);
                Z420.k(R.id.add, 6, R.id.title_container, 6);
                Z420.G(R.id.add, 6, cn70.b(16));
                Z420.h(R.id.add, 7);
            }
        }
    }

    public final void b(com.vk.music.player.domain.state.a aVar, MusicTrack musicTrack, Set set) {
        baf0 baf0Var;
        List<Artist> list = musicTrack.u;
        List<Artist> list2 = musicTrack.t;
        y17 y17Var = this.a;
        TextView textView = y17Var.v;
        ThumbsImageView thumbsImageView = y17Var.s;
        BigPlayerLayout bigPlayerLayout = y17Var.a;
        TextView textView2 = y17Var.d;
        TextView textView3 = y17Var.e;
        ImageButton imageButton = y17Var.l;
        ImageButton imageButton2 = y17Var.o;
        TextView textView4 = y17Var.f;
        TextView textView5 = y17Var.g;
        bwt0.p0(textView, false);
        lmc.c(textView2, musicTrack.d, musicTrack.e, true, musicTrack.Lb());
        lmc.c(textView3, musicTrack.d, musicTrack.e, true, musicTrack.Lb());
        boolean z = aVar.q instanceof b.f;
        String str = "";
        l07 l07Var = this.b;
        if (z) {
            bwt0.p0(imageButton, true);
            bwt0.p0(textView5, true);
            bwt0.p0(textView3, true);
            textView4.setText((CharSequence) null);
            bwt0.p0(textView4, false);
            bwt0.p0(textView2, false);
            ucp ucpVar = ucp.a;
            StringBuilder sb = new StringBuilder();
            if (list2 != null) {
                str = s490.i(list2);
            } else {
                String str2 = musicTrack.h;
                if (str2 != null) {
                    str = str2;
                }
            }
            sb.append(str);
            sb.append(' ');
            sb.append(s490.c(list));
            textView5.setText(ucp.i(drm0.p0(sb.toString()).toString()));
            textView5.setTextColor(l07Var.s);
        } else {
            bwt0.p0(imageButton, false);
            textView5.setText((CharSequence) null);
            bwt0.p0(textView5, false);
            bwt0.p0(textView3, false);
            bwt0.p0(textView4, true);
            bwt0.p0(textView2, true);
            ucp ucpVar2 = ucp.a;
            StringBuilder sb2 = new StringBuilder();
            if (list2 != null) {
                str = s490.i(list2);
            } else {
                String str3 = musicTrack.h;
                if (str3 != null) {
                    str = str3;
                }
            }
            sb2.append(str);
            sb2.append(' ');
            sb2.append(s490.c(list));
            textView4.setText(ucp.i(drm0.p0(sb2.toString()).toString()));
            textView4.setTextColor(l07Var.s);
        }
        if (!aVar.c.h() ? (baf0Var = l07Var.h) == null : (baf0Var = l07Var.i) == null) {
            baf0Var = null;
        }
        imageButton2.setImageDrawable(baf0Var);
        imageButton2.setContentDescription(aVar.c.h() ? bigPlayerLayout.getContext().getString(R.string.music_talkback_pause) : bigPlayerLayout.getContext().getString(R.string.music_talkback_play));
        sdy.t(imageButton2, set.contains(PlayerAction.playPause));
        sdy.t(y17Var.q, set.contains(PlayerAction.more));
        h4i0 h4i0Var = this.c;
        h4i0Var.e = true;
        h4i0Var.f = set.contains(PlayerAction.seek);
        Thumb Jb = musicTrack.Jb();
        y17Var.c.e = Jb != null ? musicTrack.Fb() : null;
        thumbsImageView.setThumb(Jb);
        thumbsImageView.setOverlayImage(null);
    }

    public final void c() {
        y17 y17Var = this.a;
        BigPlayerLayout bigPlayerLayout = y17Var.a;
        Context context = bigPlayerLayout.getContext();
        abg0 abg0Var = dhr0.t;
        baf0 b = abg0Var.b(R.drawable.vk_icon_add_24, R.attr.vk_ui_background_content_inverse);
        l07 l07Var = this.b;
        l07Var.b = b;
        l07Var.c = abg0Var.b(R.drawable.vk_icon_done_outline_24, R.attr.vk_ui_background_content_inverse);
        l07Var.d = abg0Var.b(R.drawable.vk_icon_skip_previous_48, R.attr.vk_ui_background_content_inverse);
        l07Var.e = abg0Var.b(R.drawable.vk_icon_replay_15_36, R.attr.vk_ui_background_content_inverse);
        l07Var.f = abg0Var.b(R.drawable.vk_icon_skip_next_48, R.attr.vk_ui_background_content_inverse);
        l07Var.g = abg0Var.b(R.drawable.ic_forward_15_36, R.attr.vk_ui_background_content_inverse);
        l07Var.h = abg0Var.b(R.drawable.vk_icon_play_48, R.attr.vk_ui_background_content_inverse);
        l07Var.i = abg0Var.b(R.drawable.vk_icon_pause_48, R.attr.vk_ui_background_content_inverse);
        l07Var.j = abg0Var.b(R.drawable.vertical_dots, R.attr.vk_ui_background_content_inverse);
        l07Var.k = abg0Var.b(R.drawable.vk_icon_text_tt_outline_24, R.attr.vk_ui_background_content_inverse);
        l07Var.l = abg0Var.b(R.drawable.vk_icon_text_tt_dot_bottom_outline_28, R.attr.vk_ui_background_content_inverse);
        l07Var.p = abg0Var.b(R.drawable.vk_icon_thumbs_down_outline_24, R.attr.vk_ui_background_content_inverse);
        l07Var.q = abg0Var.b(R.drawable.vk_icon_thumbs_down_24, R.attr.vk_ui_background_content_inverse);
        int i = l07Var.a;
        l07Var.m = abg0Var.b(R.drawable.ic_podcast_96, i);
        l07Var.n = abg0Var.b(R.drawable.vk_icon_song_outline_56, i);
        l07Var.o = abg0Var.b(R.drawable.vk_icon_song_outline_32, i);
        e3m.a aVar = e3m.a;
        l07Var.r = m33.a(R.drawable.player_ad_gradient, context);
        l07Var.s = abg0Var.c(R.attr.vk_ui_text_accent);
        l07Var.t = abg0Var.c(R.attr.vk_ui_icon_accent);
        l07Var.u = context.getColor(R.color.audio_ad_progress_color);
        l07Var.v = abg0Var.c(R.attr.vk_ui_text_primary);
        l07Var.w = abg0Var.c(R.attr.vk_ui_text_secondary);
        l07Var.x = e3m.a(R.dimen.music_player_speed_margin_normal, context);
        l07Var.y = e3m.a(R.dimen.music_player_speed_margin_play_only, context);
        l07Var.z = e3m.a(R.dimen.music_player_more_margin_normal, context);
        l07Var.A = e3m.a(R.dimen.music_player_more_margin_play_only, context);
        l07Var.B = e3m.a(R.dimen.music_player_big_thumb_corner_radius, context);
        l07Var.C = e3m.a(R.dimen.music_player_small_thumb_corner_radius, context);
        y17Var.t.setProgressDrawable(m33.a(R.drawable.music_progress_with_padding, bigPlayerLayout.getContext()));
        DownloadingView downloadingView = y17Var.r;
        downloadingView.f = e3m.f(R.attr.vk_ui_background_content_inverse, bigPlayerLayout.getContext());
        Drawable drawable = downloadingView.c;
        if (drawable != null) {
            DownloadingView.b(downloadingView.h, drawable, downloadingView.j);
        }
        Drawable drawable2 = downloadingView.d;
        if (drawable2 != null) {
            DownloadingView.b(downloadingView.g, drawable2, downloadingView.i);
        }
        downloadingView.k.setLineColor(downloadingView.h);
        h4i0 h4i0Var = this.c;
        l07 l07Var2 = h4i0Var.c;
        h4i0Var.a(h4i0Var.e ? l07Var2.t : l07Var2.u, h4i0Var.i, true);
        ImageButton imageButton = y17Var.q;
        baf0 baf0Var = l07Var.j;
        if (baf0Var == null) {
            baf0Var = null;
        }
        imageButton.setImageDrawable(baf0Var);
        ImageView imageView = y17Var.x;
        baf0 baf0Var2 = l07Var.k;
        if (baf0Var2 == null) {
            baf0Var2 = null;
        }
        imageView.setImageDrawable(baf0Var2);
        ImageView imageView2 = y17Var.y;
        baf0 baf0Var3 = l07Var.l;
        imageView2.setImageDrawable(baf0Var3 != null ? baf0Var3 : null);
        y17Var.D.b = e3m.f(R.attr.vk_ui_background_content, bigPlayerLayout.getContext());
        a(this.i);
    }

    public final zy6 d(com.vk.music.player.domain.state.a aVar, int i) {
        com.vk.music.player.f fVar;
        if (i == R.id.play_pause) {
            return hz6.a;
        }
        if (i != R.id.more || (fVar = aVar.a) == null) {
            return null;
        }
        return new wz6(fVar);
    }
}
