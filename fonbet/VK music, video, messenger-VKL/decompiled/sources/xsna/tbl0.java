package xsna;

import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: StickersQuestionOptionsBottomSheet.kt */
/* loaded from: classes6.dex */
public final class tbl0 extends s770 {
    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        vbl0 vbl0Var = (vbl0) obj;
        TextView textView = (TextView) hkpVar.f(R.id.action_text);
        textView.setText(vbl0Var.a.a(textView.getContext()));
        textView.setTextColor(dhr0.Y(vbl0Var.b, textView.getContext()));
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.d(view.findViewById(R.id.action_text));
        return hkpVar;
    }
}
