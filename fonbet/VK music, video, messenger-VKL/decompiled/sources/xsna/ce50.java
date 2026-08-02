package xsna;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.PlayState;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayPlaylistSource;
import com.vk.music.player.e;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.music.view.ThumbsImageView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.k840;
import xsna.r5b0;

/* compiled from: MusicTrackView.kt */
/* loaded from: classes3.dex */
public final class ce50 extends ViewGroup implements View.OnClickListener, View.OnLongClickListener {
    public MusicPlaybackLaunchContext b;
    public MusicTrack c;
    public List<MusicTrack> d;
    public String e;
    public final u2b0 f;
    public final SpannableStringBuilder g;
    public final u750 h;
    public final a i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final ImageView m;
    public final ThumbsImageView n;
    public final ImageView o;
    public final ImageView p;

    /* compiled from: MusicTrackView.kt */
    public static final class a extends e.a {
        public a() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            ce50 ce50Var = ce50.this;
            MusicTrack musicTrack = ce50Var.c;
            if (musicTrack != null) {
                ce50Var.a(musicTrack);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce50(Context context) {
        super(context);
        Float valueOf = Float.valueOf(13.0f);
        this.b = MusicPlaybackLaunchContext.d;
        this.d = EmptyList.b;
        this.f = k840.a.g().b();
        this.g = new SpannableStringBuilder();
        s750 s750Var = k840.a.e;
        this.h = s750Var == null ? null : s750Var;
        this.i = new a();
        TextView textView = new TextView(getContext());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine();
        textView.setIncludeFontPadding(false);
        textView.setTextColor(dhr0.Y(R.attr.vk_ui_text_primary, textView.getContext()));
        textView.setLines(1);
        FontFamily fontFamily = FontFamily.REGULAR;
        com.vk.typography.b.k(textView, fontFamily, Float.valueOf(16.0f), 4);
        this.j = textView;
        TextView textView2 = new TextView(getContext());
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine();
        textView2.setIncludeFontPadding(false);
        textView2.setTextColor(dhr0.Y(R.attr.vk_ui_text_secondary, textView2.getContext()));
        com.vk.typography.b.k(textView2, fontFamily, valueOf, 4);
        textView2.setLines(1);
        this.k = textView2;
        TextView textView3 = new TextView(getContext());
        textView3.setIncludeFontPadding(false);
        textView3.setTextColor(dhr0.Y(R.attr.vk_ui_text_secondary, textView3.getContext()));
        textView3.setSingleLine();
        com.vk.typography.b.k(textView3, fontFamily, valueOf, 4);
        textView3.setGravity(8388613);
        this.l = textView3;
        ImageView imageView = new ImageView(getContext());
        imageView.setId(R.id.music_track_view_explicit);
        imageView.setImageDrawable(enj.e(R.drawable.ic_explicit_16, R.attr.vk_ui_icon_tertiary, imageView.getContext()));
        this.m = imageView;
        ThumbsImageView thumbsImageView = new ThumbsImageView(getContext(), null, 6, 0);
        thumbsImageView.setHasBorderLine(true);
        thumbsImageView.setRadiusCorner(iah0.b(4.0f));
        this.n = thumbsImageView;
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setId(R.id.music_track_view_more);
        dhr0.a.l0(imageView2, R.drawable.vk_icon_more_vertical_16, R.attr.vk_ui_icon_tertiary);
        imageView2.setBackgroundResource(R.drawable.vk_highlight_circle);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        bwt0.h0(this, imageView2);
        this.o = imageView2;
        ImageView imageView3 = new ImageView(getContext());
        imageView3.setId(R.id.audio_playing_indicator);
        imageView3.setBackgroundResource(R.drawable.music_dark_round_rect);
        float b = iah0.b(10.0f);
        r5b0.b bVar = new r5b0.b(imageView3.getContext());
        bVar.a(R.integer.music_playing_drawable_rect_count);
        bVar.g(R.dimen.music_playing_drawable_rect_width);
        bVar.e(R.dimen.music_playing_drawable_rect_height);
        bVar.d(R.dimen.music_playing_drawable_rect_corners);
        bVar.f(R.dimen.music_playing_drawable_rect_min_height);
        bVar.c(R.color.vk_white);
        bVar.b(R.dimen.music_playing_drawable_gap);
        bVar.j = new float[]{b, iah0.b(16.0f), iah0.b(18.0f), b};
        imageView3.setImageDrawable(new r5b0(bVar));
        this.p = imageView3;
        setBackgroundResource(R.drawable.highlight);
        View[] viewArr = {textView, textView2, textView3, thumbsImageView, imageView, imageView3, imageView2};
        for (int i = 0; i < 7; i++) {
            addView(viewArr[i]);
        }
    }

    public final void a(MusicTrack musicTrack) {
        u2b0 u2b0Var = this.f;
        boolean y0 = u2b0Var.y0(musicTrack);
        ImageView imageView = this.p;
        if (!y0 || u2b0Var.m0().i()) {
            imageView.setVisibility(8);
            imageView.setActivated(false);
        } else {
            imageView.setVisibility(0);
            imageView.setActivated(u2b0Var.h());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f.P0(this.i, true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        StartPlayPlaylistSource startPlayPlaylistSource;
        if (view.getId() == R.id.music_track_view_more) {
            Context context = getContext();
            Activity h = context != null ? e3m.h(context) : null;
            MusicTrack musicTrack = this.c;
            if (h == null || musicTrack == null) {
                return;
            }
            ic40.r(lyd.g().w(), h, MusicBottomSheetLaunchPoint.App.b, musicTrack, this.b, null, false, false, null, null, 496);
            return;
        }
        MusicTrack musicTrack2 = this.c;
        if (musicTrack2 != null) {
            String valueOf = String.valueOf(musicTrack2.b);
            String valueOf2 = String.valueOf(musicTrack2.c.b);
            String str = musicTrack2.y;
            if (str == null) {
                str = "";
            }
            this.h.I(valueOf, valueOf2, str, this.b.t());
            String str2 = this.e;
            if (str2 != null) {
                Set<Integer> set = Playlist.P;
                List c0 = drm0.c0(str2, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6);
                Pair pair = new Pair(Long.valueOf(Long.parseLong((String) c0.get(0))), Integer.valueOf(Integer.parseInt((String) c0.get(1))));
                startPlayPlaylistSource = new StartPlayPlaylistSource(new PlaySourceMeta.PlaylistPlaySourceMeta("", false, new UserId(((Number) pair.d()).longValue()), ((Number) pair.g()).intValue(), 0, null, 48, null), null, null, null, 14, null);
            } else {
                startPlayPlaylistSource = null;
            }
            this.f.N0(new lqk0(startPlayPlaylistSource, musicTrack2, this.d, this.b, 0, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 1008));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.n0(this.i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int a2 = iah0.a(3.0f);
        int a3 = iah0.a(6.0f);
        int a4 = iah0.a(7.0f);
        int a5 = iah0.a(12.0f);
        int paddingLeft = getPaddingLeft();
        TextView textView = this.j;
        int measuredHeight = textView.getMeasuredHeight();
        int measuredWidth = textView.getMeasuredWidth();
        TextView textView2 = this.l;
        int measuredHeight2 = textView2.getMeasuredHeight();
        int measuredWidth2 = textView2.getMeasuredWidth();
        ThumbsImageView thumbsImageView = this.n;
        int measuredWidth3 = thumbsImageView.getMeasuredWidth();
        ImageView imageView = this.m;
        int measuredHeight3 = imageView.getMeasuredHeight();
        int i5 = (i4 - i2) / 2;
        int i6 = measuredWidth3 + paddingLeft;
        thumbsImageView.layout(paddingLeft, a3, i6, thumbsImageView.getMeasuredHeight() + a3);
        this.p.layout(paddingLeft, a3, i6, thumbsImageView.getMeasuredHeight() + a3);
        int i7 = (i3 - i) - paddingLeft;
        ImageView imageView2 = this.o;
        imageView2.layout(i7 - imageView2.getMeasuredWidth(), i5 - (imageView2.getMeasuredHeight() / 2), i7, (imageView2.getMeasuredHeight() / 2) + i5);
        int i8 = measuredHeight2 / 2;
        textView2.layout(imageView2.getLeft() - measuredWidth2, i5 - i8, imageView2.getLeft(), i5 + i8);
        int left = textView2.getLeft() - measuredHeight3;
        int i9 = measuredHeight3 / 2;
        imageView.layout(left, i5 - i9, textView2.getLeft(), i5 + i9);
        int i10 = i6 + a5;
        int i11 = measuredHeight + a4 + a2;
        textView.layout(i10, a4, measuredWidth + i10, i11);
        TextView textView3 = this.k;
        textView3.layout(i10, i11, textView3.getMeasuredWidth() + i10, textView3.getMeasuredHeight() + i11 + a2);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Context context = getContext();
        Activity h = context != null ? e3m.h(context) : null;
        MusicTrack musicTrack = this.c;
        if (h == null || musicTrack == null) {
            return false;
        }
        fl4 g = lyd.g();
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = this.b;
        int i = fl4.a;
        g.k(h, musicTrack, musicPlaybackLaunchContext, "");
        return true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int a2 = iah0.a(12.0f);
        int a3 = iah0.a(7.0f);
        int a4 = iah0.a(3.0f);
        int a5 = iah0.a(4.0f);
        TextView textView = this.l;
        int measuredWidth = bwt0.K(textView) ? textView.getMeasuredWidth() : 0;
        ImageView imageView = this.m;
        int measuredWidth2 = (bwt0.K(imageView) ? imageView.getMeasuredWidth() : 0) + measuredWidth;
        ImageView imageView2 = this.o;
        int measuredWidth3 = (bwt0.K(imageView2) ? imageView2.getMeasuredWidth() : 0) + measuredWidth2 + a5;
        textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(iah0.a(16.0f), Integer.MIN_VALUE));
        imageView.measure(View.MeasureSpec.makeMeasureSpec(iah0.a(16.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(iah0.a(16.0f), 1073741824));
        imageView2.measure(View.MeasureSpec.makeMeasureSpec(iah0.a(36.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(iah0.a(36.0f), 1073741824));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iah0.a(40.0f), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iah0.a(40.0f), 1073741824);
        ThumbsImageView thumbsImageView = this.n;
        thumbsImageView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.p.measure(View.MeasureSpec.makeMeasureSpec(iah0.a(40.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(iah0.a(40.0f), 1073741824));
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(i) - thumbsImageView.getMeasuredWidth()) - measuredWidth3) - a2, 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iah0.a(20.0f), Integer.MIN_VALUE);
        TextView textView2 = this.j;
        textView2.measure(makeMeasureSpec3, makeMeasureSpec4);
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(i) - thumbsImageView.getMeasuredWidth()) - measuredWidth3) - a2, 1073741824);
        int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(iah0.a(20.0f), Integer.MIN_VALUE);
        TextView textView3 = this.k;
        textView3.measure(makeMeasureSpec5, makeMeasureSpec6);
        int measuredHeight = textView3.getMeasuredHeight() + textView2.getMeasuredHeight() + a3 + a4 + a3;
        int measuredHeight2 = thumbsImageView.getMeasuredHeight() + a3 + a3;
        int size = View.MeasureSpec.getSize(i);
        if (measuredHeight2 > measuredHeight) {
            measuredHeight = measuredHeight2;
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(measuredHeight));
    }
}
