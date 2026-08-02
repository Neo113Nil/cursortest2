package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lib.actionslistview.R$styleable;
import java.util.List;

/* compiled from: VkLibActionsListView.kt */
/* loaded from: classes13.dex */
public class d2v0 extends RecyclerView implements too0 {
    public final esn b;
    public final u50 c;
    public d00 d;
    public cu e;
    public final int f;
    public final int g;
    public final int h;

    public d2v0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        esn esnVar = new esn();
        esnVar.a = 0;
        esnVar.b = 0;
        esnVar.c = 0;
        int[] iArr = R$styleable.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        float f = 1;
        esnVar.a = obtainStyledAttributes.getDimensionPixelSize(1, (int) Math.ceil(getDisplayMetrics().density * f));
        esnVar.b = obtainStyledAttributes.getDimensionPixelSize(2, (int) Math.ceil(f * getDisplayMetrics().density));
        esnVar.c = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        this.b = esnVar;
        u50 u50Var = new u50();
        u50Var.a = null;
        u50Var.b = 0;
        u50Var.c = 0;
        u50Var.d = 0;
        u50Var.e = null;
        u50Var.f = 0;
        u50Var.g = 0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        u50Var.a = obtainStyledAttributes2.getDrawable(3);
        u50Var.b = obtainStyledAttributes2.getDimensionPixelSize(9, 0);
        u50Var.c = obtainStyledAttributes2.getDimensionPixelSize(8, 0);
        u50Var.d = obtainStyledAttributes2.getDimensionPixelSize(4, 0);
        if (obtainStyledAttributes2.hasValue(5)) {
            u50Var.e = Integer.valueOf(obtainStyledAttributes2.getColor(5, -16777216));
        }
        u50Var.f = obtainStyledAttributes2.getDimensionPixelSize(7, (int) ((16 * getDisplayMetrics().scaledDensity) + 0.5f));
        u50Var.g = obtainStyledAttributes2.getColor(6, -16777216);
        obtainStyledAttributes2.recycle();
        this.c = u50Var;
        this.d = new d00(esnVar);
        this.e = new cu(context, u50Var);
        setLayoutManager(new LinearLayoutManager(1, false));
        addItemDecoration(this.d);
        setAdapter(this.e);
        if (attributeSet != null) {
            this.f = dhr0.B("vklib_alv_optionIconTint", attributeSet);
            this.g = dhr0.B("vklib_alv_optionLabelTextColor", attributeSet);
            this.h = dhr0.B("vklib_alv_dividerColor", attributeSet);
        }
    }

    @Override // xsna.too0
    public final void Ng() {
        abg0 abg0Var = dhr0.t;
        setActionIconColor(abg0Var.c(this.f));
        setActionLabelTextColor(abg0Var.c(this.g));
        setDividerColor(abg0Var.c(this.h));
    }

    public final void a() {
        cu cuVar = this.e;
        uy<Object> uyVar = cuVar.g;
        List<? extends zt<?>> list = cuVar.f;
        cu cuVar2 = new cu(getContext(), this.c);
        cuVar2.g = uyVar;
        cuVar2.f = list;
        cuVar2.notifyDataSetChanged();
        this.e = cuVar2;
        setAdapter(cuVar2);
    }

    public final void c() {
        removeItemDecoration(this.d);
        d00 d00Var = new d00(this.b);
        this.d = d00Var;
        addItemDecoration(d00Var);
    }

    public final DisplayMetrics getDisplayMetrics() {
        return Resources.getSystem().getDisplayMetrics();
    }

    public final void setActionBackground(int i) {
        if (i == 0) {
            setActionBackground((Drawable) null);
        } else {
            m33.a(i, getContext());
        }
    }

    public final void setActionClickListener(uy<?> uyVar) {
        this.e.g = uyVar;
    }

    public final void setActionIconColor(int i) {
        this.c.e = Integer.valueOf(i);
        a();
    }

    public final void setActionIconLabelSpace(int i) {
        this.c.d = i;
        a();
    }

    public final void setActionLabelTextColor(int i) {
        this.c.g = i;
        a();
    }

    public final void setActionLabelTextSize(int i) {
        this.c.f = i;
        a();
    }

    public final void setActionPaddingEnd(int i) {
        this.c.c = i;
        a();
    }

    public final void setActionPaddingStart(int i) {
        this.c.b = i;
        a();
    }

    public final void setActions(List<? extends zt<?>> list) {
        RecyclerView.o layoutManager;
        cu cuVar = this.e;
        cuVar.f = list;
        cuVar.notifyDataSetChanged();
        if (list.isEmpty() || (layoutManager = getLayoutManager()) == null) {
            return;
        }
        layoutManager.scrollToPosition(0);
    }

    public final void setDividerColor(int i) {
        this.b.c = i;
        c();
    }

    public final void setDividerHeight(int i) {
        this.b.a = i;
        c();
    }

    public final void setDividerSize(int i) {
        this.b.b = i;
        c();
    }

    public final void setActionBackground(Drawable drawable) {
        this.c.a = drawable;
        a();
    }

    public d2v0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
