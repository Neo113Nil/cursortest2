package yads;

import android.view.ViewGroup;
import android.widget.TextView;
import com.monetization.ads.fullscreen.template.view.CallToActionView;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes10.dex */
public final class xs implements zf0 {
    public final x12 a;
    public final kz1 b;

    public /* synthetic */ xs(x12 x12Var) {
        this(x12Var, new kz1());
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.b.getClass();
        TextView textView = (TextView) viewGroup.findViewById(R$id.call_to_action);
        dr2 adType = this.a.getAdType();
        if (!(textView instanceof CallToActionView) || adType == dr2.d) {
            return;
        }
        ((CallToActionView) textView).a();
    }

    public xs(x12 x12Var, kz1 kz1Var) {
        this.a = x12Var;
        this.b = kz1Var;
    }

    @Override // yads.zf0
    public final void c() {
    }
}
