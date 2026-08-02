package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.view.View;
import com.vk.imageloader.view.VKImageView;
import com.vk.superapp.api.dto.story.WebStickerType;
import xsna.nov;

/* compiled from: QuestionAvatarSticker.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes15.dex */
public final class qpe0 extends nxt0 implements upe0 {
    public final String f;
    public final float g;
    public final float h;
    public final VKImageView i;

    public qpe0(Context context, String str) {
        super(context);
        this.f = str;
        int b = cn70.b(156);
        float f = b;
        this.g = f;
        this.h = f;
        VKImageView vKImageView = new VKImageView(context, null, 6, 0);
        vKImageView.setRound(true);
        vKImageView.y0(cn70.b(4), -1);
        vKImageView.setPaintFilterBitmap(true);
        this.i = vKImageView;
        vKImageView.o0(str, null);
        vKImageView.measure(View.MeasureSpec.makeMeasureSpec(b, 1073741824), View.MeasureSpec.makeMeasureSpec(b, 1073741824));
        addView(vKImageView);
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov C0() {
        float f = getContext().getResources().getDisplayMetrics().density;
        Bitmap createBitmap = Bitmap.createBitmap((int) (getWidth() * f), (int) (getHeight() * f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        canvas.scale(f, f);
        draw(canvas);
        ad7 ad7Var = new ad7(createBitmap, getMeasuredWidth() * 2, WebStickerType.PHOTO, "");
        nov.a.b(this, ad7Var);
        return ad7Var;
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov E0(nov novVar) {
        return super.E0(new qpe0(getContext(), this.f));
    }

    @Override // xsna.nxt0, xsna.nov
    public float getOriginalHeight() {
        return this.h;
    }

    @Override // xsna.nxt0, xsna.nov
    public float getOriginalWidth() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.i.layout(i, i2, i3, i4);
    }
}
