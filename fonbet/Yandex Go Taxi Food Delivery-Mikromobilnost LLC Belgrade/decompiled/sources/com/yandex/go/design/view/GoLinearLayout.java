package com.yandex.go.design.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.bdc;
import defpackage.cdc;
import defpackage.dg4;
import defpackage.fg4;
import defpackage.gg4;
import defpackage.gtq0;
import defpackage.hg4;
import defpackage.jl40;
import defpackage.kh4;
import defpackage.nwy0;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u0019\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\f2\b\b\u0001\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u0015J\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0004¢\u0006\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/widget/LinearLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lzy11;", "refreshBackground", "()V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "color", "setBackgroundColor", "(I)V", "resid", "setBackgroundResource", "Landroid/graphics/drawable/Drawable;", C0553n3.g, "setBackgroundDrawable", "(Landroid/graphics/drawable/Drawable;)V", "setBackground", "attrId", "setBackgroundAttr", "Lhg4;", "updateBackground", "(Lhg4;)V", "", "emptyBackground", "()Z", "Lkh4;", "backgroundHolder", "Lkh4;", "useBackgroundHolder", "Z", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public class GoLinearLayout extends LinearLayout implements nwy0 {
    private final kh4 backgroundHolder;
    private boolean useBackgroundHolder;

    public GoLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        kh4 kh4Var = new kh4();
        this.backgroundHolder = kh4Var;
        this.useBackgroundHolder = true;
        kh4Var.a(context, attributeSet, getBackground());
    }

    private final void refreshBackground() {
        this.useBackgroundHolder = false;
        setBackgroundDrawable(this.backgroundHolder.b(getContext()));
        this.useBackgroundHolder = true;
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean allowTraverse() {
        return true;
    }

    public void applyTheme(ThemeType themeType) {
        refreshBackground();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final boolean emptyBackground() {
        return jl40.l(this.backgroundHolder.a, gg4.a);
    }

    @Override // android.view.View
    public void setBackground(Drawable background) {
        if (this.useBackgroundHolder) {
            updateBackground(gtq0.T(background));
        } else {
            super.setBackground(background);
        }
    }

    public final void setBackgroundAttr(int attrId) {
        updateBackground(new dg4(new bdc(attrId)));
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        if (this.useBackgroundHolder) {
            updateBackground(new dg4(new cdc(color)));
        } else {
            super.setBackgroundColor(color);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable background) {
        if (this.useBackgroundHolder) {
            updateBackground(gtq0.T(background));
        } else {
            super.setBackgroundDrawable(background);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int resid) {
        if (this.useBackgroundHolder) {
            updateBackground(new fg4(resid));
        } else {
            super.setBackgroundResource(resid);
        }
    }

    public final void updateBackground(hg4 background) {
        this.backgroundHolder.a = background;
        refreshBackground();
    }

    public GoLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public GoLinearLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public GoLinearLayout(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ GoLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
