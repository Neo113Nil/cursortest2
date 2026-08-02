package xsna;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayState;
import com.vk.music.player.e;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import com.vkontakte.android.data.PostInteract;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable;
import xsna.e3m;

/* compiled from: AudioAttachView.java */
/* loaded from: classes4.dex */
public final class hc4 extends ViewGroup implements View.OnClickListener, View.OnLongClickListener, too0 {
    public static final int v = e43.a.getResources().getDimensionPixelSize(R.dimen.post_attach_common_remove_button_size);

    @Nullable
    public MusicTrack b;
    public boolean c;
    public ArrayList<MusicTrack> d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final ImageView h;
    public final ImageView i;
    public final AppCompatImageView j;
    public String k;
    public PostInteract l;
    public final ProgressBar m;
    public boolean n;
    public boolean o;
    public final SpannableStringBuilder p;
    public final b q;

    @NonNull
    public final lm4 r;

    @Nullable
    public View.OnClickListener s;

    @Nullable
    public View.OnClickListener t;
    public e6o u;

    /* compiled from: AudioAttachView.java */
    public class a extends LayerDrawable implements Animatable {
        public int b;

        @Override // android.graphics.drawable.Animatable
        public final boolean isRunning() {
            return ((Animatable) getDrawable(this.b)).isRunning();
        }

        @Override // android.graphics.drawable.Animatable
        public final void start() {
            ((Animatable) getDrawable(this.b)).start();
        }

        @Override // android.graphics.drawable.Animatable
        public final void stop() {
            ((Animatable) getDrawable(this.b)).stop();
        }
    }

    /* compiled from: AudioAttachView.java */
    public class b extends e.a {
        public b() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            MusicTrack musicTrack;
            if (fVar == null) {
                return;
            }
            MusicTrack f = fVar.f();
            boolean z = false;
            hc4 hc4Var = hc4.this;
            if (f == null || (musicTrack = hc4Var.b) == null || f.c.b != musicTrack.c.b || f.b != musicTrack.b) {
                hc4Var.setPlaying(false);
                hc4Var.a(false);
                return;
            }
            hc4Var.setPlaying(playState == PlayState.PLAYING);
            if (!fVar.n() && !playState.i()) {
                z = true;
            }
            hc4Var.a(z);
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void W3(com.vk.music.player.f fVar) {
            MusicTrack musicTrack;
            MusicTrack f = fVar.f();
            hc4 hc4Var = hc4.this;
            if (f == null || (musicTrack = hc4Var.b) == null || f.c.b != musicTrack.c.b || f.b != musicTrack.b) {
                hc4Var.a(false);
            } else {
                hc4Var.a(!fVar.n());
            }
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void o2(com.vk.music.player.f fVar) {
            MusicTrack musicTrack;
            MusicTrack f = fVar.f();
            hc4 hc4Var = hc4.this;
            if (f == null || (musicTrack = hc4Var.b) == null || f.c.b != musicTrack.c.b || f.b != musicTrack.b) {
                hc4Var.a(false);
            } else {
                hc4Var.a(!fVar.n());
            }
        }
    }

    public hc4(Context context) {
        super(context);
        this.b = null;
        this.c = false;
        this.d = null;
        this.k = "";
        this.n = false;
        this.o = false;
        this.p = new SpannableStringBuilder();
        this.q = new b();
        this.r = new lm4();
        Context context2 = getContext();
        setClipChildren(false);
        TextView textView = new TextView(context2);
        this.e = textView;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.e.setSingleLine();
        this.e.setIncludeFontPadding(false);
        this.e.setTextColor(dhr0.Y(R.attr.vk_ui_text_primary, context2));
        this.e.setLines(1);
        com.vk.typography.b.k(this.e, FontFamily.MEDIUM, Float.valueOf(15.0f), 4);
        addView(this.e);
        TextView textView2 = new TextView(context2);
        this.f = textView2;
        textView2.setEllipsize(truncateAt);
        this.f.setSingleLine();
        this.f.setIncludeFontPadding(false);
        this.f.setTextColor(dhr0.Y(R.attr.vk_ui_text_secondary, context2));
        this.f.setTextSize(2, 14.0f);
        this.f.setLines(1);
        addView(this.f);
        TextView textView3 = new TextView(context2);
        this.g = textView3;
        textView3.setIncludeFontPadding(false);
        this.g.setTextColor(dhr0.Y(R.attr.vk_ui_text_secondary, context2));
        this.g.setTextSize(2, 13.0f);
        this.g.setSingleLine();
        this.g.setGravity(8388613);
        addView(this.g);
        ImageView imageView = new ImageView(context2);
        this.i = imageView;
        imageView.setImageResource(R.drawable.ic_attachment_audio_play);
        this.i.setId(R.id.play_button);
        this.i.setContentDescription(context2.getString(R.string.music_talkback_play));
        addView(this.i);
        ImageView imageView2 = new ImageView(context2);
        this.h = imageView2;
        e3m.a aVar = e3m.a;
        imageView2.setImageDrawable(m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, context2));
        this.h.setId(R.id.explicit);
        addView(this.h);
        ProgressBar progressBar = new ProgressBar(context2, null, android.R.attr.progressBarStyleHorizontal);
        this.m = progressBar;
        progressBar.setLayerType(1, null);
        IndeterminateHorizontalProgressDrawable indeterminateHorizontalProgressDrawable = new IndeterminateHorizontalProgressDrawable(context2);
        int color = context2.getColor(R.color.vk_orange);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        indeterminateHorizontalProgressDrawable.setColorFilter(color, mode);
        indeterminateHorizontalProgressDrawable.setShowBackground(false);
        indeterminateHorizontalProgressDrawable.setUseIntrinsicPadding(false);
        a aVar2 = new a(new Drawable[]{dhr0.t.b(R.drawable.progress_audio_attach, R.attr.vk_ui_separator_primary_alpha), indeterminateHorizontalProgressDrawable});
        aVar2.b = 1;
        this.m.setIndeterminateDrawable(aVar2);
        addView(this.m);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
        this.j = appCompatImageView;
        dhr0.a.j0(appCompatImageView, R.attr.vk_ui_icon_secondary, mode);
        this.j.setId(R.id.posting_attachment_holder_remove);
        this.j.setImageResource(R.drawable.vk_icon_cancel_24);
        this.j.setContentDescription(getContext().getString(R.string.delete));
        this.j.setVisibility(8);
        addView(this.j);
        View.OnClickListener onClickListener = this.u;
        onClickListener = onClickListener == null ? this : onClickListener;
        setOnClickListener(onClickListener);
        this.i.setOnClickListener(onClickListener);
        this.j.setOnClickListener(onClickListener);
    }

    private void setPlayViewState(Context context) {
        this.c = false;
        this.i.setImageResource(R.drawable.ic_attachment_audio_play);
        this.i.setContentDescription(context.getString(R.string.music_talkback_play));
    }

    @Override // xsna.too0
    public final void Ng() {
        LayerDrawable layerDrawable = (LayerDrawable) this.m.getIndeterminateDrawable();
        Drawable drawable = layerDrawable.getDrawable(0);
        dhr0.a.getClass();
        int f = e3m.f(R.attr.vk_ui_separator_primary_alpha, dhr0.E());
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(f, mode);
        layerDrawable.getDrawable(1).setColorFilter(getContext().getColor(R.color.vk_orange), mode);
    }

    public final void a(boolean z) {
        CharSequence d;
        boolean z2 = this.o;
        if (z2 != z || (z2 && this.n)) {
            boolean z3 = false;
            boolean z4 = !this.n && z;
            this.o = z4;
            boolean z5 = !z4;
            bwt0.p0(this.f, z5);
            if (!z4 && !this.n) {
                z3 = true;
            }
            bwt0.p0(this.g, z3);
            bwt0.p0(this.h, z5);
            bwt0.p0(this.m, z4);
            if (z4) {
                d = getResources().getString(R.string.audio_ad_title);
            } else {
                Context context = getContext();
                MusicTrack musicTrack = this.b;
                d = s490.d(context, musicTrack.d, musicTrack.e, R.attr.vk_ui_text_secondary);
            }
            this.e.setText(d);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.e(this.q);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (jjc.b()) {
            return;
        }
        int id = view.getId();
        if (id == R.id.posting_attachment_holder_remove) {
            View.OnClickListener onClickListener = this.s;
            if (onClickListener != null) {
                onClickListener.onClick(view);
                return;
            }
            return;
        }
        lm4 lm4Var = this.r;
        if (id == R.id.play_button) {
            MusicTrack musicTrack = this.b;
            ArrayList<MusicTrack> arrayList = this.d;
            String str = this.k;
            PostInteract postInteract = this.l;
            lm4Var.getClass();
            lm4Var.i(musicTrack, arrayList, str, postInteract, null);
            this.t.onClick(view);
            return;
        }
        Context context = getContext();
        MusicTrack musicTrack2 = this.b;
        ArrayList<MusicTrack> arrayList2 = this.d;
        String str2 = this.k;
        PostInteract postInteract2 = this.l;
        lm4Var.getClass();
        lm4Var.g(context, musicTrack2, arrayList2, str2, postInteract2, 0, null);
        this.t.onClick(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.r.f(this.q);
        super.onDetachedFromWindow();
        this.o = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int a2 = iah0.a(3.0f);
        int a3 = iah0.a(6.0f);
        int a4 = iah0.a(7.0f);
        int a5 = iah0.a(9.0f);
        int a6 = iah0.a(12.0f);
        int paddingLeft = getPaddingLeft();
        int measuredHeight = this.e.getMeasuredHeight();
        int measuredWidth = this.e.getMeasuredWidth();
        int measuredHeight2 = this.g.getMeasuredHeight();
        int measuredWidth2 = this.g.getMeasuredWidth();
        int measuredWidth3 = this.i.getMeasuredWidth();
        int measuredHeight3 = this.h.getMeasuredHeight();
        int i5 = bwt0.K(this.j) ? paddingLeft + measuredWidth3 + a6 + measuredWidth + a2 : (((i3 - i) - paddingLeft) - measuredWidth2) - measuredHeight3;
        int i6 = bwt0.K(this.j) ? paddingLeft + measuredWidth3 + a6 + measuredWidth + measuredHeight3 : (((i3 - i) - paddingLeft) - measuredWidth2) - a2;
        int i7 = bwt0.K(this.j) ? a4 : a4 + measuredHeight + a2;
        int a7 = bwt0.K(this.j) ? a4 + measuredHeight : lr.a(a4, measuredHeight, a2, measuredHeight2);
        int measuredHeight4 = ((i4 - i2) - this.j.getMeasuredHeight()) / 2;
        int i8 = measuredWidth3 + paddingLeft;
        ImageView imageView = this.i;
        imageView.layout(paddingLeft, a3, i8, imageView.getMeasuredHeight() + a3);
        int i9 = i8 + a6;
        int i10 = measuredHeight + a4;
        int i11 = i10 + a2;
        this.e.layout(i9, a4, measuredWidth + i9, i11);
        int i12 = i3 - i;
        int i13 = i12 - paddingLeft;
        this.g.layout(i13 - measuredWidth2, i11, i13, measuredHeight2 + i11 + a2);
        this.h.layout(i5, i7, i6, a7);
        TextView textView = this.f;
        textView.layout(i9, i11, textView.getMeasuredWidth() + i9, this.f.getMeasuredHeight() + i11 + a2);
        AppCompatImageView appCompatImageView = this.j;
        appCompatImageView.layout(i13 - appCompatImageView.getMeasuredWidth(), measuredHeight4, i12 - getPaddingRight(), this.j.getMeasuredHeight() + measuredHeight4);
        int i14 = i10 + a5;
        ProgressBar progressBar = this.m;
        progressBar.layout(i9, i14, progressBar.getMeasuredWidth() + i9, this.m.getMeasuredHeight() + i14);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        MusicTrack musicTrack = this.b;
        if (musicTrack != null) {
            if ((e3m.h(getContext()) == null ? false : !g620.f().k0().a(r1)) && this.r.c(musicTrack, MusicPlaybackLaunchContext.p)) {
                cvk.u(R.string.audio_added_to_queue, false);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        this.g.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(iah0.a(16.0f), Integer.MIN_VALUE));
        this.h.measure(View.MeasureSpec.makeMeasureSpec(iah0.a(16.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(iah0.a(16.0f), 1073741824));
        int i3 = v;
        this.j.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        int a2 = iah0.a(12.0f);
        int a3 = iah0.a(7.0f);
        int a4 = iah0.a(3.0f);
        int a5 = iah0.a(4.0f);
        int a6 = iah0.a(6.0f);
        int measuredWidth = this.h.getMeasuredWidth() + this.g.getMeasuredWidth() + a5 + a5;
        int measuredWidth2 = this.h.getMeasuredWidth() + this.j.getMeasuredWidth() + a6;
        int i4 = bwt0.K(this.j) ? measuredWidth2 : 0;
        if (bwt0.K(this.j)) {
            measuredWidth = measuredWidth2;
        }
        this.i.measure(View.MeasureSpec.makeMeasureSpec(iah0.a(40.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(iah0.a(40.0f), 1073741824));
        this.e.measure(View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(i) - this.i.getMeasuredWidth()) - i4) - a2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iah0.a(20.0f), Integer.MIN_VALUE));
        this.f.measure(View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(i) - this.i.getMeasuredWidth()) - measuredWidth) - a2, 1073741824), View.MeasureSpec.makeMeasureSpec(iah0.a(20.0f), Integer.MIN_VALUE));
        this.m.measure(View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(i) - this.i.getMeasuredWidth()) - i4) - a2, 1073741824), View.MeasureSpec.makeMeasureSpec(iah0.a(2.0f), 1073741824));
        int measuredHeight = this.f.getMeasuredHeight() + this.e.getMeasuredHeight() + a3 + a4 + a3;
        int measuredHeight2 = this.i.getMeasuredHeight() + a3 + a3;
        int size = View.MeasureSpec.getSize(i);
        if (measuredHeight2 > measuredHeight) {
            measuredHeight = measuredHeight2;
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(measuredHeight));
    }

    public void setData(MusicTrack musicTrack) {
        this.b = musicTrack;
        Context context = getContext();
        String str = musicTrack.d;
        String str2 = musicTrack.e;
        TextView textView = this.e;
        Float valueOf = Float.valueOf(textView.getTextSize());
        ucp ucpVar = ucp.a;
        textView.setText(ucp.j(s490.d(context, str, str2, R.attr.vk_ui_text_secondary), valueOf));
        TextView textView2 = this.f;
        textView2.setText(ucp.j(fai.k(musicTrack), Float.valueOf(textView2.getTextSize())));
        textView2.setVisibility(0);
        ProgressBar progressBar = this.m;
        progressBar.setVisibility(8);
        progressBar.setIndeterminate(true);
        bwt0.p0(this.h, musicTrack.Lb());
        this.g.setText(String.format("%d:%02d", Integer.valueOf(musicTrack.f / 60), Integer.valueOf(musicTrack.f % 60)));
        Context context2 = getContext();
        SpannableStringBuilder spannableStringBuilder = this.p;
        spannableStringBuilder.clear();
        spannableStringBuilder.append(fai.d(musicTrack));
        spannableStringBuilder.append((CharSequence) "-").append((CharSequence) musicTrack.d).append((CharSequence) ", ");
        spannableStringBuilder.append((CharSequence) f870.p(context2, musicTrack.f, musicTrack.s));
        setContentDescription(spannableStringBuilder);
        setOnLongClickListener(this);
        lm4 lm4Var = this.r;
        u2b0 u2b0Var = lm4Var.a;
        u2b0 u2b0Var2 = lm4Var.a;
        MusicTrack b2 = u2b0Var.b();
        if (b2 == null || !b2.equals(musicTrack)) {
            setPlayViewState(context2);
        } else {
            if (u2b0Var2.h()) {
                this.c = true;
                ImageView imageView = this.i;
                imageView.setImageResource(R.drawable.ic_attachment_audio_pause);
                imageView.setContentDescription(context2.getString(R.string.music_talkback_pause));
            } else {
                setPlayViewState(context2);
            }
            a(true ^ u2b0Var2.I1());
        }
        setAlpha(musicTrack.B() ? 0.5f : 1.0f);
    }

    public void setPlayClickListener(@Nullable View.OnClickListener onClickListener) {
        this.t = onClickListener;
    }

    public void setPlaying(boolean z) {
        if (getParent() == null) {
            return;
        }
        this.c = z;
        this.i.setImageResource(z ? R.drawable.ic_attachment_audio_pause : R.drawable.ic_attachment_audio_play);
        this.i.setContentDescription(getContext().getString(this.c ? R.string.music_talkback_pause : R.string.music_talkback_play));
    }

    public void setPostingMode(boolean z) {
        this.n = z;
        bwt0.p0(this.g, !z);
        a(!z);
    }

    public void setRemoveButtonVisible(boolean z) {
        bwt0.p0(this.j, z);
    }

    public void setRemoveClickListener(@Nullable View.OnClickListener onClickListener) {
        this.s = onClickListener;
    }
}
