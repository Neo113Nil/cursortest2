package xsna;

import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: RequestPermissionVhOld.kt */
/* loaded from: classes2.dex */
public final class h8g0 extends vfz<f8g0> {
    public final e8g0 l;
    public f8g0 m;

    public h8g0(View view, e8g0 e8g0Var) {
        super(view);
        this.l = e8g0Var;
        bwt0.i0((TextView) this.itemView.findViewById(R.id.permission_banner_btn), new uv20(this, 28));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(f8g0 f8g0Var) {
        this.m = f8g0Var;
    }
}
