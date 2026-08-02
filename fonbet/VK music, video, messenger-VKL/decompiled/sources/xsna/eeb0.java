package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistOwner;
import com.vk.dto.music.Thumb;
import com.vk.music.view.ThumbsImageView;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import xsna.nov;

/* compiled from: PlaylistSharingSticker.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class eeb0 extends nxt0 {
    public final Playlist f;

    @SuppressLint({"InflateParams"})
    public final View g;
    public boolean h;
    public final ThumbsImageView i;
    public final CardView j;

    public eeb0(Context context, Playlist playlist) {
        super(context);
        String str;
        this.f = playlist;
        String str2 = null;
        View inflate = LayoutInflater.from(context).inflate(R.layout.sticker_music_playlist_sharing, (ViewGroup) null);
        this.g = inflate;
        int a = e3m.a(R.dimen.story_view_audio_placeholder_size, context);
        addView(inflate);
        TextView textView = (TextView) inflate.findViewById(R.id.sticker_music_sharing_tv_music);
        Drawable mutate = enj.d(R.drawable.vk_icon_explicit_24, R.color.vk_white, getContext()).mutate();
        mutate.setAlpha(142);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("  ");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(playlist.h);
        if (playlist.k) {
            mutate.setBounds(0, 0, cn70.b(24), cn70.b(24));
            spannableStringBuilder.setSpan(new ImageSpan(mutate, 0), 1, 2, 33);
            spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
        }
        lfo0 lfo0Var = new lfo0(textView);
        lfo0Var.c = spannableStringBuilder;
        lfo0Var.b = spannableStringBuilder2;
        int i = iah0.f().widthPixels;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int marginStart = i - (marginLayoutParams != null ? marginLayoutParams.getMarginStart() : 0);
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        textView.setText(lfo0.b(lfo0Var, marginStart - (marginLayoutParams2 != null ? marginLayoutParams2.getMarginEnd() : 0), textView.getMaxLines(), 4));
        PlaylistOwner playlistOwner = playlist.q;
        if (playlistOwner != null && (str = playlistOwner.e) != null) {
            str2 = str;
        } else if (playlistOwner != null) {
            str2 = playlistOwner.c;
        }
        str2 = (str2 == null || str2.length() == 0) ? playlist.o : str2;
        ((TextView) inflate.findViewById(R.id.sticker_music_sharing_tv_author)).setText(playlist.Gb() ? context.getString(R.string.story_playlist, str2) : playlist.Eb() ? context.getString(R.string.story_album, str2) : playlist.i);
        ThumbsImageView thumbsImageView = (ThumbsImageView) inflate.findViewById(R.id.playlist_foreground_image);
        this.i = thumbsImageView;
        CardView cardView = (CardView) inflate.findViewById(R.id.card_view_audio_image);
        this.j = cardView;
        Thumb thumb = playlist.m;
        if (thumb != null) {
            thumbsImageView.setThumb(thumb);
        } else {
            List<Thumb> list = playlist.p;
            if (list != null && !list.isEmpty()) {
                thumbsImageView.setThumbs(playlist.p);
            }
        }
        Thumb thumb2 = playlist.m;
        List<Thumb> singletonList = thumb2 != null ? Collections.singletonList(thumb2) : playlist.p;
        List<Thumb> list2 = singletonList;
        if (list2 == null || list2.isEmpty()) {
            bwt0.p0(cardView, true);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.audio_image);
            if (imageView != null) {
                imageView.setColorFilter(context.getColor(R.color.vk_black_alpha24), PorterDuff.Mode.SRC_IN);
                imageView.getLayoutParams().height = a;
                imageView.getLayoutParams().width = a;
            }
            bwt0.p0(thumbsImageView, false);
            bwt0.p0(inflate.findViewById(R.id.label), false);
            ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.container);
            bwt0.m0(viewGroup.getLayoutParams().width, -2, viewGroup);
        } else {
            thumbsImageView.setThumbs(singletonList);
        }
        thumbsImageView.setBackground((MaterialShapeDrawable) w750.b.getValue());
        inflate.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(iah0.f().widthPixels), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(iah0.f().heightPixels), Integer.MIN_VALUE));
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov C0() {
        float f = getContext().getResources().getDisplayMetrics().density;
        Bitmap createBitmap = Bitmap.createBitmap((int) (getWidth() * f), (int) (getHeight() * f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        canvas.scale(f, f);
        draw(canvas);
        l0u0 l0u0Var = new l0u0(createBitmap, getMeasuredWidth() * 2, WebStickerType.MUSIC_PLAYLIST, "");
        l0u0Var.q = eeb0.class;
        l0u0Var.t = this.f;
        l0u0Var.s = new vq6(19, this, l0u0Var);
        nov.a.b(this, l0u0Var);
        return l0u0Var;
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov E0(nov novVar) {
        return super.E0(new eeb0(getContext(), this.f));
    }

    public final List<PointF> getClickableArea() {
        View view = this.i;
        if (!bwt0.K(view)) {
            view = this.j;
        }
        x7l0 x7l0Var = x7l0.b;
        return x7l0.a(view, getStickerMatrix());
    }

    @Override // xsna.nxt0, xsna.nov
    public float getMaxScaleLimit() {
        return 1.5f;
    }

    @Override // xsna.nxt0, xsna.nov
    public float getOriginalHeight() {
        return this.g.getMeasuredHeight();
    }

    @Override // xsna.nxt0, xsna.nov
    public float getOriginalWidth() {
        return this.g.getMeasuredWidth();
    }

    public final Playlist getPlaylist() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.g.layout(i, i2, i3, i4);
    }

    @Override // xsna.nxt0, xsna.nov
    public void setRemovable(boolean z) {
        this.h = z;
    }

    @Override // xsna.nxt0, xsna.nov
    public final boolean v0() {
        return this.h;
    }
}
