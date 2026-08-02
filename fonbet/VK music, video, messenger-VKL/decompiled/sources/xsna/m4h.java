package xsna;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: CommunityIconLessBottomSheetMenu.kt */
/* loaded from: classes5.dex */
public final class m4h extends s770 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public m4h(Context context, int i, int i2) {
        this.c = context;
        this.d = i;
        this.e = i2;
    }

    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        e520 e520Var = (e520) obj;
        TextView textView = (TextView) hkpVar.f(R.id.action_text);
        textView.setText(e520Var.a(this.c));
        if (e520Var.f) {
            textView.setTextColor(this.d);
        } else {
            textView.setTextColor(this.e);
        }
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.e(view.findViewById(R.id.action_text));
        return hkpVar;
    }
}
