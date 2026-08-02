package androidx.cardview.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import defpackage.wp8;

/* loaded from: classes10.dex */
public final class a implements wp8 {
    public Drawable a;
    public final /* synthetic */ CardView b;

    public a(CardView cardView) {
        this.b = cardView;
    }

    public final void a(int i, int i2, int i3, int i4) {
        CardView cardView = this.b;
        cardView.mShadowBounds.set(i, i2, i3, i4);
        Rect rect = cardView.mContentPadding;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }
}
