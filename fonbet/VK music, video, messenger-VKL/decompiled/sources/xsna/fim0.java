package xsna;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: StoryStatisticsViewersPopupMenuDelegate.kt */
/* loaded from: classes6.dex */
public final class fim0 extends s770 {
    public final /* synthetic */ Context c;

    public fim0(Context context) {
        this.c = context;
    }

    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        iim0 iim0Var = (iim0) obj;
        ImageView imageView = (ImageView) hkpVar.f(R.id.icon);
        TextView textView = (TextView) hkpVar.f(R.id.title);
        imageView.setImageDrawable(dhr0.x(iim0Var.a, R.attr.vk_ui_icon_accent_themed, this.c));
        textView.setText(iim0Var.b);
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.d(view.findViewById(R.id.icon));
        hkpVar.d(view.findViewById(R.id.title));
        return hkpVar;
    }
}
