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
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.imageloader.view.VKImageView;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vkontakte.android.R;
import java.util.List;
import xsna.nov;

/* compiled from: MusicSharingSticker.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class p550 extends nxt0 {
    public final MusicTrack f;

    @SuppressLint({"InflateParams"})
    public final View g;
    public boolean h;
    public final VKImageView i;
    public final CardView j;

    public p550(Context context, MusicTrack musicTrack) {
        super(context);
        String str;
        this.f = musicTrack;
        View inflate = LayoutInflater.from(context).inflate(R.layout.sticker_music_sharing, (ViewGroup) null);
        this.g = inflate;
        int a = e3m.a(R.dimen.story_view_audio_placeholder_size, context);
        int i = (int) (iah0.f().widthPixels * 0.8d);
        addView(inflate);
        TextView textView = (TextView) inflate.findViewById(R.id.sticker_music_sharing_tv_music);
        Drawable a2 = m33.a(R.drawable.vk_icon_error_circle_fill_overlay_12, getContext());
        Drawable mutate = a2 != null ? a2.mutate() : null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("  ");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(musicTrack.d);
        if (mutate != null && musicTrack.Lb()) {
            mutate.setBounds(0, 0, cn70.b(24), cn70.b(24));
            spannableStringBuilder.setSpan(new ImageSpan(mutate, 0), 1, 2, 33);
            spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
        }
        lfo0 lfo0Var = new lfo0(textView);
        lfo0Var.c = spannableStringBuilder;
        lfo0Var.b = spannableStringBuilder2;
        lfo0Var.d = true;
        int i2 = iah0.f().widthPixels;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int marginStart = i2 - (marginLayoutParams != null ? marginLayoutParams.getMarginStart() : 0);
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        textView.setText(lfo0.b(lfo0Var, marginStart - (marginLayoutParams2 != null ? marginLayoutParams2.getMarginEnd() : 0), textView.getMaxLines(), 4));
        TextView textView2 = (TextView) inflate.findViewById(R.id.sticker_music_sharing_tv_author);
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
        textView2.setText(ucp.i(drm0.p0(sb.toString()).toString()));
        VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.audio_image);
        this.i = vKImageView;
        CardView cardView = (CardView) inflate.findViewById(R.id.card_view_audio_image);
        this.j = cardView;
        String Kb = musicTrack.Kb(i);
        if (musicTrack.Jb() == null || Kb == null) {
            vKImageView.getLayoutParams().height = a;
            vKImageView.getLayoutParams().width = a;
            vKImageView.setColorFilter(context.getColor(R.color.vk_black_alpha24), PorterDuff.Mode.SRC_IN);
            bwt0.p0(inflate.findViewById(R.id.label), false);
            ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.container);
            bwt0.m0(viewGroup.getLayoutParams().width, -2, viewGroup);
        } else {
            cardView.setBackground((MaterialShapeDrawable) w750.b.getValue());
            vKImageView.load(Kb);
        }
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
        l0u0 l0u0Var = new l0u0(createBitmap, getMeasuredWidth() * 2, WebStickerType.MUSIC, "");
        l0u0Var.q = p550.class;
        l0u0Var.t = this.f;
        l0u0Var.s = new com.vk.movika.sdk.base.ui.i(20, this, l0u0Var);
        nov.a.b(this, l0u0Var);
        return l0u0Var;
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov E0(nov novVar) {
        return super.E0(new p550(getContext(), this.f));
    }

    public final List<PointF> getClickableArea() {
        x7l0 x7l0Var = x7l0.b;
        return x7l0.a(this.i, getStickerMatrix());
    }

    @Override // xsna.nxt0, xsna.nov
    public float getMaxScaleLimit() {
        return 1.5f;
    }

    public final MusicTrack getMusic() {
        return this.f;
    }

    @Override // xsna.nxt0, xsna.nov
    public float getOriginalHeight() {
        return this.g.getMeasuredHeight();
    }

    @Override // xsna.nxt0, xsna.nov
    public float getOriginalWidth() {
        return this.g.getMeasuredWidth();
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
