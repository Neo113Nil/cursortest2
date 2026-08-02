package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;
import xsna.bzp0;

/* compiled from: FullscreenErrorView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes15.dex */
public final class zxs extends ConstraintLayout {
    public final gzs<s3q0> t;
    public final yxs u;
    public final TextView v;
    public final TextView w;

    public zxs(Context context, bzp0.b bVar, gzs<s3q0> gzsVar) {
        super(hnj.a(context));
        this.t = gzsVar;
        this.u = new yxs(this, bVar);
        LayoutInflater.from(hnj.a(context)).inflate(R.layout.vk_auth_fullscreen_error_layout, this);
        this.v = (TextView) findViewById(R.id.fullscreen_error_title);
        this.w = (TextView) findViewById(R.id.fullscreen_error_message);
        ((Button) findViewById(R.id.fullscreen_error_try_again_button)).setOnClickListener(new wcd(this, 4));
    }

    public final gzs<s3q0> getDismissCallback() {
        return this.t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yxs yxsVar = this.u;
        zxs zxsVar = yxsVar.a;
        bzp0.b bVar = yxsVar.b;
        zxsVar.v.setText(bVar.c);
        zxsVar.w.setText(bVar.a);
    }
}
