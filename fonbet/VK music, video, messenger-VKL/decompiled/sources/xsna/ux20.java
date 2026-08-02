package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.wx20;

/* compiled from: ModalBottomSheetMenu.kt */
/* loaded from: classes17.dex */
public final class ux20 extends s770 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ izs<View, s3q0> g;

    public ux20(int i, Context context, int i2, int i3, wx20.a aVar) {
        this.c = i;
        this.d = context;
        this.e = i2;
        this.f = i3;
        this.g = aVar;
    }

    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        e520 e520Var = (e520) obj;
        boolean z = e520Var.f;
        TextView textView = (TextView) hkpVar.f(R.id.action_text);
        textView.setText(e520Var.a(this.d));
        int i2 = e520Var.b;
        int i3 = this.e;
        if (i2 == 0 && z) {
            textView.setTextColor(i3);
        } else {
            textView.setTextColor(this.c);
        }
        ImageView imageView = (ImageView) hkpVar.f(R.id.action_icon);
        imageView.setImageResource(i2);
        if (z) {
            imageView.setColorFilter(i3);
        } else {
            imageView.setColorFilter(this.f);
        }
        if (e520Var.j) {
            f4m.j(imageView);
        } else {
            imageView.setVisibility(0);
        }
        if (e520Var.i) {
            f4m.a(imageView, new cy0(18, this.g, imageView));
        }
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        Rect rect = ywt0.a;
        View findViewById = view.findViewById(R.id.action_text);
        ((TextView) findViewById).setTextColor(this.c);
        s3q0 s3q0Var = s3q0.a;
        View findViewById2 = view.findViewById(R.id.action_icon);
        ((ImageView) findViewById2).setVisibility(0);
        View findViewById3 = view.findViewById(R.id.action_check_icon);
        f4m.j(findViewById3);
        hkpVar.e(findViewById, findViewById2, findViewById3);
        return hkpVar;
    }
}
