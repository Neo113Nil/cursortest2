package yads;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes10.dex */
public final class vs implements zf0 {
    public final kz1 a;
    public final us b;

    public vs(kz1 kz1Var, us usVar) {
        this.a = kz1Var;
        this.b = usVar;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.a.getClass();
        TextView textView = (TextView) viewGroup.findViewById(R$id.call_to_action);
        if (textView != null) {
            us usVar = this.b;
            usVar.a.postDelayed(new p43(textView, usVar.b), 2000L);
        }
    }

    @Override // yads.zf0
    public final void c() {
        us usVar = this.b;
        usVar.a.removeCallbacksAndMessages(null);
        usVar.b.cancel();
    }
}
