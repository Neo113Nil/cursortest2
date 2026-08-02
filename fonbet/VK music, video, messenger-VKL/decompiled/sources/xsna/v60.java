package xsna;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: ActionVh.kt */
/* loaded from: classes13.dex */
public final class v60 extends RecyclerView.e0 {
    public static final /* synthetic */ int q = 0;
    public final View l;
    public final ImageView m;
    public final TextView n;
    public zt<Object> o;
    public uy<Object> p;

    public v60(View view, u50 u50Var) {
        super(view);
        Drawable.ConstantState constantState;
        Drawable newDrawable;
        this.l = view;
        ImageView imageView = (ImageView) view.findViewById(R.id.icon);
        this.m = imageView;
        TextView textView = (TextView) view.findViewById(R.id.label);
        this.n = textView;
        Drawable drawable = u50Var.a;
        view.setBackground((drawable == null || (constantState = drawable.getConstantState()) == null || (newDrawable = constantState.newDrawable()) == null) ? null : newDrawable.mutate());
        view.setPaddingRelative(u50Var.b, 0, u50Var.c, 0);
        view.setOnClickListener(new yb(this, 1));
        Integer num = u50Var.e;
        if (num != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
        }
        textView.setTextSize(0, u50Var.f);
        textView.setTextColor(u50Var.g);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        marginLayoutParams.setMarginStart(u50Var.d);
        textView.setLayoutParams(marginLayoutParams);
    }
}
