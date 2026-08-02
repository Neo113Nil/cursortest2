package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.imageloader.view.VKImageView;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vkontakte.android.R;
import xsna.nov;

/* compiled from: ClipStatSticker.kt */
/* loaded from: classes6.dex */
public final class rcd extends nxt0 {
    public final int f;
    public final SpannableStringBuilder g;
    public final View h;

    public rcd(int i, SpannableStringBuilder spannableStringBuilder, Context context) {
        super(context);
        this.f = i;
        this.g = spannableStringBuilder;
        View inflate = LayoutInflater.from(context).inflate(R.layout.sticker_clip_stat, (ViewGroup) null);
        this.h = inflate;
        VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.image);
        TextView textView = (TextView) inflate.findViewById(R.id.text);
        addView(inflate);
        vKImageView.setImageResource(i);
        textView.setText(spannableStringBuilder);
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov C0() {
        float f = getContext().getResources().getDisplayMetrics().density;
        Bitmap createBitmap = Bitmap.createBitmap((int) (getWidth() * f), (int) (getHeight() * f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        canvas.scale(f, f);
        draw(canvas);
        l0u0 l0u0Var = new l0u0(createBitmap, getMeasuredWidth() * 2, WebStickerType.CLIP_STAT, "");
        l0u0Var.q = rcd.class;
        nov.a.b(this, l0u0Var);
        return l0u0Var;
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov E0(nov novVar) {
        return super.E0(new rcd(this.f, this.g, getContext()));
    }

    @Override // xsna.nxt0, xsna.nov
    public float getOriginalHeight() {
        return getMeasuredHeight() != 0 ? getMeasuredHeight() : iah0.f().heightPixels * 0.4f;
    }

    @Override // xsna.nxt0, xsna.nov
    public float getOriginalWidth() {
        float f = iah0.f().widthPixels * 0.7f;
        View view = this.h;
        return f + view.getPaddingStart() + view.getPaddingEnd();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.h.layout(i, i2, i3, i4);
    }

    @Override // xsna.nxt0, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) getOriginalWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(iah0.f().heightPixels), Integer.MIN_VALUE);
        View view = this.h;
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}
