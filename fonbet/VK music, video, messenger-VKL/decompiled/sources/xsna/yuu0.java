package xsna;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.vk.feed.tool.view.newsfeed.layout.VkFeedOverlayFrameLayout;
import com.vk.imageloader.R$styleable;
import xsna.e3m;

/* compiled from: VkFeedOverlayViewDelegate.kt */
/* loaded from: classes18.dex */
public final class yuu0 {
    public final VkFeedOverlayFrameLayout a;
    public final Rect b = new Rect();
    public final Drawable c;
    public final boolean d;
    public final boolean e;

    public yuu0(VkFeedOverlayFrameLayout vkFeedOverlayFrameLayout, AttributeSet attributeSet) {
        this.a = vkFeedOverlayFrameLayout;
        TypedArray obtainStyledAttributes = vkFeedOverlayFrameLayout.getContext().obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId != 0) {
                Context context = vkFeedOverlayFrameLayout.getContext();
                e3m.a aVar = e3m.a;
                Drawable a = m33.a(resourceId, context);
                Drawable drawable = this.c;
                if (drawable != null) {
                    drawable.setCallback(null);
                }
                this.c = a;
                if (a != null) {
                    a.setCallback(vkFeedOverlayFrameLayout);
                }
                vkFeedOverlayFrameLayout.invalidate();
            }
            this.d = obtainStyledAttributes.getBoolean(3, this.d);
            this.e = obtainStyledAttributes.getBoolean(2, this.e);
            obtainStyledAttributes.recycle();
            vkFeedOverlayFrameLayout.setWillNotDraw(false);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
