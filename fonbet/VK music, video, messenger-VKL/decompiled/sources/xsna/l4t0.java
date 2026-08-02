package xsna;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: VideoPlaylistBottomSheet.kt */
/* loaded from: classes2.dex */
public final class l4t0 extends s770 {
    public final /* synthetic */ Context c;

    public l4t0(Context context) {
        this.c = context;
    }

    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        e520 e520Var = (e520) obj;
        TextView textView = (TextView) hkpVar.f(R.id.action_text);
        Context context = this.c;
        textView.setText(e520Var.a(context));
        ImageView imageView = (ImageView) hkpVar.f(R.id.action_icon);
        imageView.setImageResource(e520Var.b);
        int i2 = e520Var.g;
        imageView.setColorFilter(i2 != 0 ? context.getColor(i2) : e3m.f(R.attr.vk_ui_action_sheet_text, context));
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.d(view.findViewById(R.id.action_text));
        View findViewById = view.findViewById(R.id.action_icon);
        ((ImageView) findViewById).setVisibility(0);
        hkpVar.d(findViewById);
        return hkpVar;
    }
}
