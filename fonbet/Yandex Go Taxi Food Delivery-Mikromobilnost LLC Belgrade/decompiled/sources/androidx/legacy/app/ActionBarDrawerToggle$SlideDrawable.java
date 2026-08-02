package androidx.legacy.app;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import defpackage.sr;

/* loaded from: classes10.dex */
class ActionBarDrawerToggle$SlideDrawable extends InsetDrawable implements Drawable.Callback {
    private final boolean mHasMirroring;
    private float mOffset;
    private float mPosition;
    private final Rect mTmpRect;
    final /* synthetic */ sr this$0;

    public ActionBarDrawerToggle$SlideDrawable(sr srVar, Drawable drawable) {
        super(drawable, 0);
        this.mHasMirroring = true;
        this.mTmpRect = new Rect();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        copyBounds(this.mTmpRect);
        canvas.save();
        throw null;
    }

    public float getPosition() {
        return this.mPosition;
    }

    public void setOffset(float f) {
        this.mOffset = f;
        invalidateSelf();
    }

    public void setPosition(float f) {
        this.mPosition = f;
        invalidateSelf();
    }
}
