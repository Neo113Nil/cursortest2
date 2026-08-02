package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes10.dex */
public final class v01 extends ea0 {
    public final TextView a;

    public v01(View view) {
        super(view);
        this.a = (TextView) view.findViewById(R$id.item_text);
    }

    @Override // yads.ea0
    public final void a(ba0 ba0Var) {
        this.a.setText(((w90) ba0Var).a);
    }
}
