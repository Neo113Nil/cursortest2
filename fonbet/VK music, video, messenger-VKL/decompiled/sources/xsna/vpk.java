package xsna;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.google.android.material.shape.MaterialShapeDrawable;

/* compiled from: CutoutDrawable.java */
/* loaded from: classes13.dex */
public class vpk extends MaterialShapeDrawable {
    public static final /* synthetic */ int c = 0;

    @NonNull
    public a b;

    /* compiled from: CutoutDrawable.java */
    @TargetApi(18)
    public static class b extends vpk {
        @Override // com.google.android.material.shape.MaterialShapeDrawable
        public final void drawStrokeShape(@NonNull Canvas canvas) {
            if (this.b.v.isEmpty()) {
                super.drawStrokeShape(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(this.b.v);
            super.drawStrokeShape(canvas);
            canvas.restore();
        }
    }

    public final void b(float f, float f2, float f3, float f4) {
        RectF rectF = this.b.v;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    @NonNull
    public final Drawable mutate() {
        this.b = new a(this.b);
        return this;
    }

    /* compiled from: CutoutDrawable.java */
    public static final class a extends MaterialShapeDrawable.c {

        @NonNull
        public final RectF v;

        public a(com.google.android.material.shape.a aVar, RectF rectF) {
            super(aVar);
            this.v = rectF;
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable.c, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            b bVar = new b(this);
            bVar.b = this;
            bVar.invalidateSelf();
            return bVar;
        }

        public a(a aVar) {
            super(aVar);
            this.v = aVar.v;
        }
    }
}
