package xsna;

import android.graphics.PorterDuff;
import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: CommunityMediaDiscoverGridItemHolder.kt */
/* loaded from: classes4.dex */
public final class z9h implements b780 {
    public final /* synthetic */ aah b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public z9h(aah aahVar, boolean z, boolean z2, boolean z3) {
        this.b = aahVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
        aah aahVar = this.b;
        View view = aahVar.J;
        boolean z = this.c;
        boolean z2 = this.d;
        view.setVisibility(!z || !z2 ? 4 : 0);
        aahVar.M.setVisibility(z2 ? 0 : 8);
        aahVar.N.setVisibility(z2 ? 0 : 8);
        TextView textView = aahVar.M;
        abg0 abg0Var = dhr0.t;
        textView.setTextColor(abg0Var.c(R.attr.vk_ui_text_contrast));
        aahVar.N.setTextColor(abg0Var.c(R.attr.vk_ui_text_contrast));
        if (this.e) {
            aahVar.K.setColorFilter(abg0Var.c(R.attr.vk_ui_text_contrast), PorterDuff.Mode.MULTIPLY);
        } else {
            aahVar.K.clearColorFilter();
        }
    }

    @Override // xsna.b780
    public final void g(String str) {
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
    }

    @Override // xsna.b780
    public final void b(String str, Throwable th) {
    }
}
