package xsna;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import androidx.core.app.NotificationCompat;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class vbz0 extends ProgressBar implements paz0 {
    public vbz0(Context context) {
        super(context, null, R.style.Widget.ProgressBar.Horizontal);
        ujz0 ujz0Var = new ujz0(context);
        rvy0 rvy0Var = new rvy0(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, ujz0Var.a.get(ujz0.f)));
        int i = rvy0.h;
        SparseIntArray sparseIntArray = rvy0Var.a;
        int i2 = sparseIntArray.get(i);
        int i3 = sparseIntArray.get(rvy0.g);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
        shapeDrawable.getPaint().setColor(i3);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
        shapeDrawable2.getPaint().setColor(i2);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, new ClipDrawable(shapeDrawable2, 8388611, 1)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        setProgressDrawable(layerDrawable);
        setIndeterminate(false);
    }

    @Override // xsna.paz0
    public void setMaxTime(float f) {
        setMax((int) (f * 1000.0f));
    }

    @Override // xsna.paz0
    public void setTimeChanged(float f) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, NotificationCompat.CATEGORY_PROGRESS, getProgress(), (int) (f * 1000.0f));
        ofInt.setDuration(500L);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.start();
    }

    public void setVisible(boolean z) {
        setVisibility(z ? 0 : 8);
    }
}
