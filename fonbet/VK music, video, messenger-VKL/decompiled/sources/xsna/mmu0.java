package xsna;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: VkCompositeActionButtonDateView.kt */
/* loaded from: classes18.dex */
public final class mmu0 extends FrameLayout {
    public final VkText b;
    public final VkText c;
    public final Object d;
    public tlo0 e;
    public tlo0 f;
    public int g;

    public mmu0(Context context) {
        super(context, null, 0);
        this.d = msy.a(LazyThreadSafetyMode.NONE, new icn0(this, context));
        LayoutInflater.from(context).inflate(R.layout.pds_composite_action_button_date, (ViewGroup) this, true);
        this.b = (VkText) findViewById(R.id.pds_composite_action_button_month);
        this.c = (VkText) findViewById(R.id.pds_composite_action_button_day);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final GradientDrawable getBackgroundDrawable() {
        return (GradientDrawable) this.d.getValue();
    }

    private final void setUpDay(tlo0 tlo0Var) {
        boolean z = tlo0Var != null;
        VkText vkText = this.c;
        f4m.E(vkText, z);
        vkText.setText(tlo0Var != null ? tlo0Var.a(getContext()) : null);
    }

    private final void setUpMonth(tlo0 tlo0Var) {
        boolean z = tlo0Var != null;
        VkText vkText = this.b;
        f4m.E(vkText, z);
        vkText.setText(tlo0Var != null ? tlo0Var.a(getContext()) : null);
    }

    public final tlo0 getDay() {
        return this.f;
    }

    public final tlo0 getMonth() {
        return this.e;
    }

    public final int getWidgetColor() {
        return this.g;
    }

    public final void setDay(tlo0 tlo0Var) {
        this.f = tlo0Var;
        setUpDay(tlo0Var);
    }

    public final void setMonth(tlo0 tlo0Var) {
        this.e = tlo0Var;
        setUpMonth(tlo0Var);
    }

    public final void setWidgetColor(int i) {
        if (this.g != i) {
            this.g = i;
            GradientDrawable backgroundDrawable = getBackgroundDrawable();
            backgroundDrawable.setColor(i);
            setBackground(backgroundDrawable);
        }
    }
}
