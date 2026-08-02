package defpackage;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;

/* loaded from: classes4.dex */
public abstract class gvg extends v0x {
    @Override // defpackage.v0x
    public final x0 d(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(uoh0.section_debug, viewGroup, false);
        int i = nch0.details;
        TextView textView = (TextView) cma1.O(i, inflate);
        if (textView != null) {
            i = nch0.message;
            TextView textView2 = (TextView) cma1.O(i, inflate);
            if (textView2 != null) {
                fvg fvgVar = new fvg(new zug((LinearLayout) inflate, textView, textView2, 2));
                textView2.setTextSize(16.0f);
                textView.setTextSize(15.0f);
                textView.setTypeface(Typeface.MONOSPACE);
                return fvgVar;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.v0x
    public final void h(x0 x0Var) {
        fvg fvgVar = (fvg) x0Var;
        fvgVar.N.d.setText((CharSequence) null);
        fvgVar.N.c.setText((CharSequence) null);
    }
}
