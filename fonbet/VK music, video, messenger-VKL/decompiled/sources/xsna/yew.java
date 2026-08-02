package xsna;

import android.content.Context;
import android.text.Editable;
import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class yew implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yew(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                afw afwVar = (afw) this.c;
                Context context = (Context) this.d;
                Editable text = afwVar.c.getText();
                StringBuilder sb = new StringBuilder();
                int length = text.length();
                for (int i = 0; i < length; i++) {
                    char charAt = text.charAt(i);
                    if (Character.isDigit(charAt) || charAt == '+') {
                        sb.append(charAt);
                    }
                }
                String obj = sb.toString();
                a1w a1wVar = q1w.a;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                io.reactivex.rxjava3.core.x n = hg1.n(a1wVar.C(afwVar, new s8j(obj, o25.a().L())), context, false, null, 62);
                asu0 asu0Var = asu0.a;
                afwVar.e.b(io.reactivex.rxjava3.kotlin.c.e(n.q(asu0Var.c()).m(asu0Var.d()), new irt(1), new com.vk.im.ui.fragments.b(afwVar, 0)));
                break;
            case 1:
                ((c1f0) this.c).q.invoke((yaw) this.d);
                break;
            default:
                tij0 tij0Var = (tij0) this.c;
                wzs wzsVar = (wzs) this.d;
                sij0 sij0Var = tij0Var.l;
                if (sij0Var != null) {
                    wzsVar.invoke(Integer.valueOf(sij0Var.b), sij0Var.d);
                    break;
                }
                break;
        }
    }
}
