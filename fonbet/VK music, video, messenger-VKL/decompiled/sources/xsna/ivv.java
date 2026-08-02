package xsna;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.core.ui.image.VKImageController;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;

/* compiled from: IdentityHeaderView.kt */
/* loaded from: classes6.dex */
public final class ivv extends LinearLayout {
    public static final int f = iah0.a(72);
    public final VKImageController<View> b;
    public final View c;
    public final TextView d;
    public final TextView e;

    public ivv(Context context) {
        super(context, null, 0);
        ifx0 ifx0Var = e370.c;
        VKImageController<View> create = (ifx0Var != null ? ifx0Var : null).b().create(context);
        this.b = create;
        View view = ((com.vk.core.ui.image.c) create).getView();
        this.c = view;
        TextView textView = new TextView(context);
        this.d = textView;
        TextView textView2 = new TextView(context);
        this.e = textView2;
        int a = iah0.a(18);
        setPadding(a, iah0.a(28), a, a);
        setOrientation(1);
        int i = f;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        s3q0 s3q0Var = s3q0.a;
        addView(view, layoutParams);
        TypedValue typedValue = krv0.a;
        krv0.q(textView, R.attr.vk_ui_text_muted);
        textView.setGravity(1);
        com.vk.typography.b.k(textView, FontFamily.MEDIUM, Float.valueOf(20.0f), 4);
        textView.setPadding(0, iah0.a(16), 0, 0);
        addView(textView, new LinearLayout.LayoutParams(-1, -2));
        textView2.setGravity(1);
        com.vk.typography.b.k(textView, FontFamily.REGULAR, Float.valueOf(14.0f), 4);
        krv0.q(textView2, R.attr.vk_ui_text_subhead);
        textView2.setPadding(0, iah0.a(8), 0, 0);
    }

    public final void setMessage(int i) {
        this.e.setText(getContext().getString(i));
    }
}
