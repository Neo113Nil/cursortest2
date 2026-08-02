package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ServiceCell.kt */
/* loaded from: classes18.dex */
public final class noi0 extends LinearLayout {
    public final Object b;
    public final Object c;
    public final Object d;
    public String e;
    public String f;
    public String g;

    public noi0(Context context) {
        super(context, null, 0);
        q010 q010Var = new q010(this, 29);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, q010Var);
        this.c = msy.a(lazyThreadSafetyMode, new g880(this, 19));
        this.d = msy.a(lazyThreadSafetyMode, new m960(this, 26));
        this.e = "";
        this.g = "";
        LayoutInflater.from(context).inflate(R.layout.service_cell, this);
        setOrientation(0);
        int a = e3m.a(R.dimen.vk_ui_base_padding_horizontal, context);
        f4m.l(a, a, this);
        int a2 = e3m.a(R.dimen.vk_ui_spacing_size_xs, context);
        f4m.B(a2, a2, this);
        setBackground(e3m.e(R.attr.selectableItemBackground, context));
        getOldPriceText().setPaintFlags(getOldPriceText().getPaintFlags() | 16);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getOldPriceText() {
        return (TextView) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getPriceText() {
        return (TextView) this.d.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getTitleText() {
        return (TextView) this.b.getValue();
    }

    public final String getOldPrice() {
        return this.f;
    }

    public final String getPrice() {
        return this.g;
    }

    public final String getTitle() {
        return this.e;
    }

    public final void setOldPrice(String str) {
        this.f = str;
        getOldPriceText().setText(str);
        getOldPriceText().setVisibility(str != null ? 0 : 8);
        getOldPriceText().setContentDescription(str != null ? getContext().getString(R.string.ecomm_service_cell_old_price, str) : null);
    }

    public final void setPrice(String str) {
        this.g = str;
        getPriceText().setText(str);
    }

    public final void setTitle(String str) {
        this.e = str;
        getTitleText().setText(str);
    }
}
