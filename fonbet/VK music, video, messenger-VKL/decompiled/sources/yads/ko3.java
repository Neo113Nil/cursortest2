package yads;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes10.dex */
public final class ko3 implements zf0 {
    public final kz1 a;

    public /* synthetic */ ko3() {
        this(new kz1());
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.a.getClass();
        TextView textView = (TextView) viewGroup.findViewById(R$id.warning);
        if (textView != null) {
            textView.setSelected(true);
        }
    }

    public ko3(kz1 kz1Var) {
        this.a = kz1Var;
    }

    @Override // yads.zf0
    public final void c() {
    }
}
