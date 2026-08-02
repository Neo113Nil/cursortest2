package xsna;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vkontakte.android.R;
import xsna.cq8;

/* compiled from: ButtonVhOld.kt */
/* loaded from: classes2.dex */
public final class wr8 extends vfz<cq8> {
    public final dp8 l;
    public final TextView m;
    public final ImageView n;
    public final TextView o;
    public final View p;
    public final VkOnboardingHighlighter q;
    public cq8 r;

    public wr8(View view, dp8 dp8Var) {
        super(view);
        this.l = dp8Var;
        this.m = (TextView) this.itemView.findViewById(R.id.vkim_btn);
        this.n = (ImageView) this.itemView.findViewById(R.id.vkim_icon);
        this.o = (TextView) this.itemView.findViewById(R.id.vkim_cnt);
        this.p = this.itemView.findViewById(R.id.vkim_dot);
        this.q = (VkOnboardingHighlighter) this.itemView.findViewById(R.id.vkim_highlighter);
        bwt0.i0(this.itemView, new com.vk.movika.sdk.base.observable.c(this, 12));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(cq8 cq8Var) {
        cq8 cq8Var2 = cq8Var;
        int i = cq8Var2.e;
        this.r = cq8Var2;
        int i2 = cq8Var2.c;
        TextView textView = this.m;
        textView.setText(i2);
        omw.d(this.n, cq8Var2.d, R.attr.vk_ui_icon_accent);
        boolean z = cq8Var2.f;
        boolean z2 = !z && i > 0;
        TextView textView2 = this.o;
        bwt0.p0(textView2, z2);
        textView2.setText(String.valueOf(i));
        bwt0.p0(this.p, z);
        if (cq8Var2.g) {
            f4m.t(cn70.b(8), this.itemView);
        }
        if (!(cq8Var2 instanceof cq8.e) || !((cq8.e) cq8Var2).h) {
            textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_accent));
            return;
        }
        StringBuilder sb = new StringBuilder("<u>");
        VkOnboardingHighlighter vkOnboardingHighlighter = this.q;
        sb.append(vkOnboardingHighlighter.getResources().getString(i2));
        sb.append("</u>");
        vkOnboardingHighlighter.setText(sb.toString());
        vkOnboardingHighlighter.post(new nq4(vkOnboardingHighlighter, 3));
        textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary_invariably));
    }
}
