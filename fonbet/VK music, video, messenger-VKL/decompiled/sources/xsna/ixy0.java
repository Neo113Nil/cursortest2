package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ixy0 extends FrameLayout {
    public final ImageView b;

    public ixy0(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(imageView, layoutParams);
    }

    public void setImageBitmap(@Nullable Bitmap bitmap) {
        this.b.setImageBitmap(bitmap);
    }
}
