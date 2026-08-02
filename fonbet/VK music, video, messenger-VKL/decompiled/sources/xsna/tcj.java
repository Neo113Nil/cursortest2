package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: ContactsPromoView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class tcj extends LinearLayout {
    public static final /* synthetic */ int f = 0;
    public final qcj b;
    public final TextView c;
    public final View d;
    public final View e;

    /* compiled from: ContactsPromoView.kt */
    public interface a {
    }

    public tcj(Context context, qcj qcjVar) {
        super(context);
        this.b = qcjVar;
        View.inflate(context, R.layout.vkim_contact_promo_landing, this);
        setOrientation(1);
        float f2 = 28;
        setPadding(iah0.a(f2), iah0.a(32), iah0.a(f2), iah0.a(20));
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView = (TextView) findViewById(R.id.tv_action_button);
        this.c = textView;
        jjc.g(textView, new scj(1, this, tcj.class, "onActionButtonClick", "onActionButtonClick(Landroid/view/View;)V", 0));
        this.d = findViewById(R.id.iv_icon);
        this.e = findViewById(R.id.tv_caption_description);
        Drawable a2 = dhr0.t.a(R.drawable.vk_icon_chevron_24);
        textView.setCompoundDrawablePadding(iah0.a(8));
        his0.u(textView, a2, ColorStateList.valueOf(e3m.f(R.attr.vk_legacy_button_primary_foreground, context)));
    }

    public final a getCallback() {
        return this.b;
    }

    public final void setActionBtnVisible(boolean z) {
        bwt0.p0(this.c, z);
    }

    public final void setActionText(String str) {
        this.c.setText(str);
    }

    public final void setCaptionDescriptionVisible(boolean z) {
        bwt0.p0(this.e, z);
    }

    public final void setIconVisible(boolean z) {
        bwt0.p0(this.d, z);
    }
}
