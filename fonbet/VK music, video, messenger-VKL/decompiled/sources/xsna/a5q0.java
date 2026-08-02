package xsna;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* compiled from: RippleHostView.android.kt */
/* loaded from: classes11.dex */
public final class a5q0 extends RippleDrawable {
    public final boolean b;
    public l5g c;
    public Integer d;
    public boolean e;

    public a5q0(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.b = z;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.b) {
            this.e = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.e = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.e;
    }
}
