package xsna;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.libvideo.tooltips.WatchLaterTooltip;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: VideoBottomSheet.kt */
/* loaded from: classes2.dex */
public final class f6s0 extends s770 {
    public final /* synthetic */ e6s0 c;
    public final /* synthetic */ Context d;

    public f6s0(e6s0 e6s0Var, Context context) {
        this.c = e6s0Var;
        this.d = context;
    }

    @Override // xsna.s770
    public final /* bridge */ /* synthetic */ void m(hkp hkpVar, Object obj, int i) {
        s(hkpVar, (e520) obj);
    }

    @Override // xsna.s770
    public final void n(hkp hkpVar, Object obj, int i, List list) {
        e520 e520Var = (e520) obj;
        int i2 = e520Var.g;
        s(hkpVar, e520Var);
        if (list.isEmpty() || !list.contains("getting_qualities")) {
            return;
        }
        ((ImageView) hkpVar.f(R.id.action_icon)).setVisibility(8);
        VkSpinner vkSpinner = (VkSpinner) hkpVar.f(R.id.getting_qualities_progress);
        vkSpinner.setVisibility(0);
        if (i2 != 0) {
            vkSpinner.getIndeterminateDrawable().setTint(this.d.getColor(i2));
        } else {
            vkSpinner.getIndeterminateDrawable().setTint(e6s0.d(this.c));
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
        hkpVar.d(view.findViewById(R.id.action_description));
        hkpVar.d(view.findViewById(R.id.getting_qualities_progress));
        return hkpVar;
    }

    public final void s(hkp hkpVar, e520 e520Var) {
        e6s0 e6s0Var = this.c;
        s6s0 s6s0Var = e6s0Var.d;
        int i = e520Var.a;
        View f = hkpVar.f(R.id.actionContent);
        boolean z = e520Var.o;
        f.setEnabled(z);
        TextView textView = (TextView) hkpVar.f(R.id.action_text);
        Context context = this.d;
        textView.setText(e520Var.a(context));
        if (z) {
            int i2 = e520Var.h;
            if (i2 != 0) {
                textView.setTextColor(context.getColor(i2));
            }
        } else {
            textView.setTextColor(e3m.f(e6s0.g, context));
        }
        ImageView imageView = (ImageView) hkpVar.f(R.id.action_icon);
        imageView.setImageResource(e520Var.b);
        if (z) {
            int i3 = e520Var.g;
            if (i3 != 0) {
                imageView.setColorFilter(context.getColor(i3));
            } else {
                imageView.setColorFilter(e6s0.d(e6s0Var));
            }
        } else {
            imageView.setColorFilter(e3m.f(e6s0.h, context));
        }
        TextView textView2 = (TextView) hkpVar.f(R.id.action_description);
        String str = e520Var.m;
        if (str == null) {
            int i4 = e520Var.l;
            str = i4 != 0 ? context.getString(i4) : null;
        }
        if (str != null) {
            textView2.setText(str);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        if (i == R.id.download && !hg10.g(s6s0Var)) {
            textView.addOnLayoutChangeListener(new com.vk.libvideo.bottomsheet.a(textView));
        }
        if (i != hmq.c.b || hg10.g(s6s0Var)) {
            return;
        }
        new WatchLaterTooltip(hkpVar.f(R.id.action_icon)).a(WatchLaterTooltip.Hint.ACTION);
    }
}
