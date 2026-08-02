package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: PastBroadcastsBottomSheet.kt */
/* loaded from: classes7.dex */
public final class un90 extends s770 {
    public final /* synthetic */ Context c;

    public un90(Context context) {
        this.c = context;
    }

    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        e520 e520Var = (e520) obj;
        TextView textView = (TextView) hkpVar.f(R.id.action_text);
        ImageView imageView = (ImageView) hkpVar.f(R.id.action_icon);
        Context context = this.c;
        textView.setText(e520Var.a(context));
        imageView.setImageResource(e520Var.b);
        int i2 = e520Var.g;
        if (i2 == 0) {
            imageView.setColorFilter(dhr0.t.c(R.attr.vk_ui_action_sheet_text));
        } else {
            textView.setTextColor(context.getColor(i2));
            imageView.setColorFilter(context.getColor(i2));
        }
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.d(view.findViewById(R.id.action_text));
        View findViewById = view.findViewById(R.id.action_icon);
        ImageView imageView = (ImageView) findViewById;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        float f = 24;
        layoutParams.width = iah0.a(f);
        layoutParams.height = iah0.a(f);
        imageView.setLayoutParams(layoutParams);
        imageView.setVisibility(0);
        hkpVar.d(findViewById);
        return hkpVar;
    }
}
