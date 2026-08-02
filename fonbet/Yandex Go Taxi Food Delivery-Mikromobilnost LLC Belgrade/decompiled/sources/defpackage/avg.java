package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes4.dex */
public final class avg extends gfe {
    public final acj a;
    public zug b;

    public avg(acj acjVar) {
        this.a = acjVar;
    }

    @Override // defpackage.gfe
    public final boolean b(elc elcVar) {
        return false;
    }

    @Override // defpackage.ws11
    public final View onCreateView(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(roh0.debug_content, viewGroup, false);
        viewGroup.addView(inflate);
        LinearLayout linearLayout = (LinearLayout) inflate;
        int i = kch0.details;
        TextView textView = (TextView) cma1.O(i, inflate);
        if (textView != null) {
            i = kch0.message;
            TextView textView2 = (TextView) cma1.O(i, inflate);
            if (textView2 != null) {
                this.b = new zug(linearLayout, textView, textView2, 0);
                return linearLayout;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.ws11
    public final void onDestroyView(View view) {
        this.b = null;
    }

    @Override // defpackage.ws11
    public final void onUpdateState(Object obj) {
        nie nieVar = (nie) obj;
        this.a.invoke();
        if (Boolean.FALSE.booleanValue()) {
            yug yugVar = (yug) nieVar.c;
            zug zugVar = this.b;
            if (zugVar != null) {
                zugVar.d.setText(yugVar.a);
                zugVar.c.setText(yugVar.b);
            }
        }
    }
}
