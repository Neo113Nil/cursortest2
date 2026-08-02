package xsna;

import android.content.Context;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class zvy0 extends LinearLayout {
    public final ImageView b;
    public final TextView c;
    public final Button d;

    public zvy0(Context context) {
        super(context);
        setOrientation(1);
        setGravity(17);
        setBackgroundColor(-1728053248);
        c1z0 c1z0Var = new c1z0(context);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setAdjustViewBounds(true);
        float f = 80;
        addView(imageView, new LinearLayout.LayoutParams(c1z0Var.b(f), c1z0Var.b(f)));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTypeface(null, 1);
        textView.setTextColor(-1);
        textView.setTextSize(1, 22.0f);
        float f2 = 50;
        textView.setPadding(c1z0Var.b(f2), 0, c1z0Var.b(f2), 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = c1z0Var.b(10);
        addView(textView, layoutParams);
        Button button = new Button(context);
        this.d = button;
        button.setBackgroundColor(-16733198);
        button.setTextColor(-1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = c1z0Var.b(25);
        float b = c1z0Var.b(8);
        button.setClipToOutline(true);
        button.setOutlineProvider(new yvy0(b));
        button.setMinimumWidth(c1z0Var.b(120));
        button.setMinimumHeight(c1z0Var.b(44));
        addView(button, layoutParams2);
    }

    @NonNull
    public Button getCtaButton() {
        return this.d;
    }

    @NonNull
    public ImageView getIconView() {
        return this.b;
    }

    @NonNull
    public TextView getTitleView() {
        return this.c;
    }
}
