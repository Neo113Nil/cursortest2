package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vkontakte.android.R;

/* compiled from: RetryView.kt */
/* loaded from: classes13.dex */
public final class ifg0 extends LinearLayout implements View.OnClickListener {
    public xa80 b;
    public final View c;

    public ifg0(Context context) {
        super(context, null, 0);
        setClickable(true);
        setOrientation(1);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setGravity(17);
        LayoutInflater.from(context).inflate(R.layout.user_discover_retry_view, this);
        View findViewById = findViewById(R.id.error_button);
        this.c = findViewById;
        bwt0.h0(this, findViewById);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xa80 xa80Var;
        if (!epx.f(view, this.c) || (xa80Var = this.b) == null) {
            return;
        }
        xa80Var.b();
    }

    public final void setOnRetryClickListener(xa80 xa80Var) {
        this.b = xa80Var;
    }
}
