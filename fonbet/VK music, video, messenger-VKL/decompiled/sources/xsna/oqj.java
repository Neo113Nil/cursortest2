package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.vkontakte.android.R;

/* compiled from: ControlsButtonBase.kt */
/* loaded from: classes8.dex */
public abstract class oqj extends AppCompatImageView {
    public oqj(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, 0);
        int c = x5r0.c();
        super.setPadding(c, c, c, c);
        setImageTintList(ColorStateList.valueOf(context.getColor(R.color.one_video_white)));
        setBackgroundResource(R.drawable.one_video_ripple_circle_white);
        setImageResource(i);
        Integer valueOf = i2 == 0 ? null : Integer.valueOf(i2);
        setContentDescription(valueOf != null ? context.getString(valueOf.intValue()) : null);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int i) {
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    public final void setImageTintList(ColorStateList colorStateList) {
        super.setImageTintList(colorStateList);
    }
}
