package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;
import xsna.mp90;

/* compiled from: PastCallDialogDetailsActionView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class bp90 extends ConstraintLayout {
    public final k59<mp90.b> t;
    public final boolean u;
    public final ImageView v;
    public final TextView w;
    public static final int x = View.generateViewId();
    public static final int y = View.generateViewId();
    public static final int z = View.generateViewId();
    public static final int A = View.generateViewId();
    public static final int B = View.generateViewId();
    public static final int C = View.generateViewId();
    public static final int D = View.generateViewId();
    public static final int E = View.generateViewId();
    public static final int F = View.generateViewId();

    /* JADX WARN: Multi-variable type inference failed */
    public bp90(Context context, k59<? super mp90.b> k59Var, boolean z2) {
        super(context);
        this.t = k59Var;
        this.u = z2;
        LayoutInflater.from(context).inflate(R.layout.voip_history_past_call_details_action_view, (ViewGroup) this, true);
        setBackgroundResource(R.drawable.vk_highlight);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.v = (ImageView) findViewById(R.id.past_call_details_action_icon);
        this.w = (TextView) findViewById(R.id.past_call_details_action_title);
    }
}
