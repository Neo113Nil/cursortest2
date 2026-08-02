package yads;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import xsna.an10;
import xsna.sa6;

/* loaded from: classes10.dex */
public final class s61 extends LinearLayout {
    public final pg0 a;
    public final er b;
    public final TextView c;
    public final View.OnClickListener d;

    public s61(Context context, pg0 pg0Var) {
        super(context);
        this.a = pg0Var;
        this.b = new er(context, pg0Var);
        this.c = new TextView(context);
        this.d = new sa6(this, 13);
        a(context);
    }

    public static final void a(s61 s61Var, View view) {
        boolean isSelected = s61Var.b.isSelected();
        s61Var.b.setSelected(!isSelected);
        s61Var.c.setVisibility(!isSelected ? 0 : 8);
    }

    public final void setDescription(String str) {
        this.c.setText(str);
    }

    public final void a(Context context) {
        setOrientation(0);
        this.a.getClass();
        int a = pg0.a(context, 4.0f);
        setPadding(a, a, a, a);
        this.b.setOnClickListener(this.d);
        addView(this.b);
        this.a.getClass();
        int b = an10.b(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        this.c.setPadding(b, b, b, b);
        this.a.getClass();
        int b2 = an10.b(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setStroke(b2, -65536);
        this.c.setBackgroundDrawable(gradientDrawable);
        addView(this.c);
        this.a.getClass();
        int b3 = an10.b(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams.setMargins(b3, 0, b3, b3);
        this.c.setLayoutParams(layoutParams);
        this.c.setVisibility(8);
    }
}
