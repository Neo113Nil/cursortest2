package xsna;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: CommunitySettingsActionsModalBottomSheet.kt */
/* loaded from: classes5.dex */
public final class t1i extends s770 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public t1i(Context context, int i, int i2) {
        this.c = context;
        this.d = i;
        this.e = i2;
    }

    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        e520 e520Var = (e520) obj;
        TextView textView = (TextView) hkpVar.f(R.id.action_text);
        Context context = this.c;
        textView.setText(e520Var.a(context));
        int i2 = e520Var.h;
        if (i2 != 0) {
            textView.setTextColor(context.getColor(i2));
        } else {
            textView.setTextColor(this.d);
        }
        ImageView imageView = (ImageView) hkpVar.f(R.id.action_icon);
        imageView.setImageResource(e520Var.b);
        int i3 = e520Var.g;
        if (i3 != 0) {
            imageView.setColorFilter(context.getColor(i3));
        } else {
            imageView.setColorFilter(this.e);
        }
        if (e520Var.j) {
            f4m.j(imageView);
        } else {
            imageView.setVisibility(0);
        }
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.d(view.findViewById(R.id.actionContent));
        hkpVar.d(view.findViewById(R.id.action_text));
        View findViewById = view.findViewById(R.id.action_icon);
        ((ImageView) findViewById).setVisibility(0);
        hkpVar.d(findViewById);
        return hkpVar;
    }
}
