package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.unity3d.services.UnityAdsConstants;
import xsna.beo0;

/* compiled from: TooltipDrawable.java */
/* loaded from: classes13.dex */
public final class i5p0 extends MaterialShapeDrawable implements beo0.b {

    @Nullable
    public CharSequence b;

    @NonNull
    public final Context c;

    @Nullable
    public final Paint.FontMetrics d;

    @NonNull
    public final beo0 e;

    @NonNull
    public final a f;

    @NonNull
    public final Rect g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public int n;
    public float o;
    public float p;
    public float q;
    public float r;

    /* compiled from: TooltipDrawable.java */
    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i9 = iArr[0];
            i5p0 i5p0Var = i5p0.this;
            i5p0Var.n = i9;
            view.getWindowVisibleDisplayFrame(i5p0Var.g);
        }
    }

    public i5p0(@NonNull Context context, int i) {
        super(context, null, 0, i);
        this.d = new Paint.FontMetrics();
        beo0 beo0Var = new beo0(this);
        this.e = beo0Var;
        this.f = new a();
        this.g = new Rect();
        this.o = 1.0f;
        this.p = 1.0f;
        this.q = 0.5f;
        this.r = 1.0f;
        this.c = context;
        float f = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = beo0Var.a;
        textPaint.density = f;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    public final float b() {
        int i;
        Rect rect = this.g;
        if (((rect.right - getBounds().right) - this.n) - this.k < 0) {
            i = ((rect.right - getBounds().right) - this.n) - this.k;
        } else {
            if (((rect.left - getBounds().left) - this.n) + this.k <= 0) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            i = ((rect.left - getBounds().left) - this.n) + this.k;
        }
        return i;
    }

    public final rv70 c() {
        float f = -b();
        float width = ((float) (getBounds().width() - (Math.sqrt(2.0d) * this.m))) / 2.0f;
        return new rv70(new ho00(this.m), Math.min(Math.max(f, -width), width));
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        float b = b();
        float f = (float) (-((Math.sqrt(2.0d) * this.m) - this.m));
        canvas.scale(this.o, this.p, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.q) + getBounds().top);
        canvas.translate(b, f);
        super.draw(canvas);
        if (this.b == null) {
            canvas2 = canvas;
        } else {
            float centerY = getBounds().centerY();
            beo0 beo0Var = this.e;
            TextPaint textPaint = beo0Var.a;
            Paint.FontMetrics fontMetrics = this.d;
            textPaint.getFontMetrics(fontMetrics);
            int i = (int) (centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            if (beo0Var.g != null) {
                textPaint.drawableState = getState();
                beo0Var.g.e(this.c, beo0Var.a, beo0Var.b);
                textPaint.setAlpha((int) (this.r * 255.0f));
            }
            CharSequence charSequence = this.b;
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), r0.centerX(), i, textPaint);
        }
        canvas2.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.e.a.getTextSize(), this.j);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.h * 2;
        CharSequence charSequence = this.b;
        return (int) Math.max(f + (charSequence == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.e.a(charSequence.toString())), this.i);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.l) {
            com.google.android.material.shape.a shapeAppearanceModel = getShapeAppearanceModel();
            shapeAppearanceModel.getClass();
            new wog0();
            new wog0();
            new wog0();
            new wog0();
            new ryo();
            new ryo();
            new ryo();
            new ryo();
            wuj wujVar = shapeAppearanceModel.a;
            wuj wujVar2 = shapeAppearanceModel.b;
            wuj wujVar3 = shapeAppearanceModel.c;
            wuj wujVar4 = shapeAppearanceModel.d;
            uuj uujVar = shapeAppearanceModel.e;
            uuj uujVar2 = shapeAppearanceModel.f;
            uuj uujVar3 = shapeAppearanceModel.g;
            uuj uujVar4 = shapeAppearanceModel.h;
            ryo ryoVar = shapeAppearanceModel.i;
            ryo ryoVar2 = shapeAppearanceModel.j;
            ryo ryoVar3 = shapeAppearanceModel.l;
            rv70 c = c();
            com.google.android.material.shape.a aVar = new com.google.android.material.shape.a();
            aVar.a = wujVar;
            aVar.b = wujVar2;
            aVar.c = wujVar3;
            aVar.d = wujVar4;
            aVar.e = uujVar;
            aVar.f = uujVar2;
            aVar.g = uujVar3;
            aVar.h = uujVar4;
            aVar.i = ryoVar;
            aVar.j = ryoVar2;
            aVar.k = c;
            aVar.l = ryoVar3;
            setShapeAppearanceModel(aVar);
        }
    }
}
