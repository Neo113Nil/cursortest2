package com.yandex.go.taxi.order.details.v1.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.cma1;
import defpackage.f2y;
import defpackage.jl40;
import defpackage.kdc;
import defpackage.mrg0;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.o0q0;
import defpackage.p8h0;
import defpackage.q0q0;
import defpackage.r0q0;
import defpackage.s0q0;
import defpackage.s8o;
import defpackage.tje;
import defpackage.w0d;
import defpackage.w511;
import defpackage.zkh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/yandex/go/taxi/order/details/v1/ui/SectionDetailView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "bgColor", "Lzy11;", "setRoundedBackground", "(I)V", "Ls0q0;", "iconState", "renderIcon", "(Ls0q0;)V", "Lo0q0;", "content", "render", "(Lo0q0;)V", "Lf2y;", "binding", "Lf2y;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SectionDetailView extends ConstraintLayout implements nwy0 {
    public static final int $stable = 8;
    private final f2y binding;

    public SectionDetailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(zkh0.layout_section_detail, this);
        int i = p8h0.icon_image;
        ImageView imageView = (ImageView) cma1.O(i, this);
        if (imageView != null) {
            i = p8h0.title;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
            if (robotoTextView != null) {
                this.binding = new f2y(this, imageView, robotoTextView);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final void renderIcon(s0q0 iconState) {
        if (jl40.l(iconState, q0q0.a)) {
            if (this.binding.b.getVisibility() == 0) {
                cma1.L(this.binding.b);
            }
        } else {
            if (!(iconState instanceof r0q0)) {
                w511.b();
                return;
            }
            if (this.binding.b.getVisibility() != 0 || this.binding.b.hasTransientState()) {
                cma1.J(this.binding.b);
            }
            this.binding.b.setImageDrawable(((r0q0) iconState).a);
        }
    }

    private final void setRoundedBackground(int bgColor) {
        float r = tje.r(mrg0.button_component_default_rounded_corners_radius, getContext());
        w0d w0dVar = new w0d();
        w0dVar.a = bgColor;
        w0dVar.h = r;
        setBackground(w0dVar.a());
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public /* bridge */ void applyTheme(ThemeType themeType) {
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void render(o0q0 content) {
        f2y f2yVar = this.binding;
        f2yVar.c.setText(content.a);
        f2yVar.c.setContentDescription(content.a);
        renderIcon(content.c);
        kdc kdcVar = content.b;
        if (kdcVar != null) {
            setRoundedBackground(s8o.m(kdcVar, getContext()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SectionDetailView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ SectionDetailView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
