package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.dw20;

/* compiled from: TechBugReportBottomSheet.kt */
/* loaded from: classes2.dex */
public final class u7o0 extends kq6 {
    public final Context c;
    public final az2 d;
    public final w7u e;
    public final w110 f;
    public VkInputSelect g;

    public u7o0(FragmentActivity fragmentActivity, az2 az2Var, w7u w7uVar, w110 w110Var) {
        this.c = fragmentActivity;
        this.d = az2Var;
        this.e = w7uVar;
        this.f = w110Var;
    }

    @Override // xsna.kq6
    public final dw20 a() {
        Context context = this.c;
        View inflate = LayoutInflater.from(context).inflate(R.layout.video_tech_bugreport, (ViewGroup) null);
        this.g = (VkInputSelect) inflate.findViewById(R.id.edit_text);
        dw20.b d0 = ((dw20.b) new dw20.b(context, null).p(false).r()).q(false).a0(new dck0(this, 5)).d0(new mqe0(this, 18));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) context.getString(R.string.video_tech_bugreport));
        FontFamily fontFamily = FontFamily.MEDIUM;
        int i = a.C1933a.C1934a.$EnumSwitchMapping$0[TextSizeUnit.SP.ordinal()];
        float f = 16.0f;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = com.vk.typography.b.b(16.0f);
        }
        nik0.a(spannableStringBuilder, cqi.a(Font.Companion, fontFamily, f, context), 0, spannableStringBuilder.length());
        dw20.b bVar = (dw20.b) d0.w0(spannableStringBuilder);
        bVar.g();
        bVar.d.D = inflate;
        dw20.b K0 = bVar.T(R.string.video_tech_bugreport_cancel, new cy20(15)).h0(R.string.video_tech_bugreport_send, new vpj0(this, 7)).K0(21);
        dhr0.a.getClass();
        return K0.u0(dhr0.u().c).I0("tech_bug_report");
    }
}
