package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class zyy0 extends RelativeLayout {
    public static final int j = View.generateViewId();
    public final wvy0 b;
    public final RelativeLayout.LayoutParams c;
    public final whz0 d;
    public final x9z0 e;
    public final c1z0 f;
    public final r5z0 g;
    public kiw h;
    public kiw i;

    public zyy0(Context context) {
        super(context);
        setBackgroundColor(0);
        c1z0 c1z0Var = new c1z0(context);
        this.f = c1z0Var;
        whz0 whz0Var = new whz0(context);
        this.d = whz0Var;
        int i = j;
        whz0Var.setId(i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        whz0Var.setLayoutParams(layoutParams);
        c1z0.n(whz0Var, "image_view");
        addView(whz0Var);
        wvy0 wvy0Var = new wvy0(context);
        this.b = wvy0Var;
        wvy0Var.a(ywy0.a((int) tj0.a(1, 28.0f, context)), false);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        this.c = layoutParams2;
        layoutParams2.addRule(7, i);
        layoutParams2.addRule(6, i);
        wvy0Var.setLayoutParams(layoutParams2);
        x9z0 x9z0Var = new x9z0(context);
        this.e = x9z0Var;
        r5z0 r5z0Var = new r5z0(context, null);
        this.g = r5z0Var;
        r5z0Var.setVisibility(8);
        int b = c1z0Var.b(10);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = b;
        layoutParams3.gravity = 16;
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.setMargins(b, b, b, b);
        layoutParams4.addRule(5, i);
        layoutParams4.addRule(6, i);
        linearLayout.setOrientation(0);
        linearLayout.addView(x9z0Var);
        linearLayout.addView(r5z0Var, layoutParams3);
        c1z0.n(wvy0Var, "close_button");
        addView(wvy0Var);
        c1z0.n(x9z0Var, "age_bordering");
        addView(linearLayout, layoutParams4);
    }

    public final void a() {
        Point q = c1z0.q(getContext());
        int i = q.x;
        int i2 = q.y;
        if (i <= 0 || i2 <= 0) {
            return;
        }
        kiw kiwVar = ((float) i) / ((float) i2) > 1.0f ? this.i : this.h;
        if (kiwVar == null && (kiwVar = this.i) == null) {
            kiwVar = this.h;
        }
        if (kiwVar == null) {
            return;
        }
        this.d.setImageData(kiwVar);
    }

    @NonNull
    public wvy0 getCloseButton() {
        return this.b;
    }

    @NonNull
    public ImageView getImageView() {
        return this.d;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a();
    }

    public void setAgeRestrictions(@NonNull String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        x9z0 x9z0Var = this.e;
        if (isEmpty) {
            x9z0Var.setVisibility(8);
            return;
        }
        x9z0Var.a(-7829368, 0);
        c1z0 c1z0Var = this.f;
        x9z0Var.setPadding(c1z0Var.b(2), 0, 0, 0);
        x9z0Var.setTextColor(-1118482);
        x9z0Var.a(-1118482, c1z0Var.b(3));
        x9z0Var.setBackgroundColor(1711276032);
        x9z0Var.setText(str);
    }
}
