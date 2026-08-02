package com.yandex.go.payments.cards.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.dfb;
import defpackage.e6h0;
import defpackage.lh;
import defpackage.luh0;
import defpackage.rp31;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/go/payments/cards/ui/CardTrailView;", "Landroid/widget/LinearLayout;", "Llh;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "selected", "Landroid/graphics/drawable/Drawable;", "drawable", "Lzy11;", "setCheckMark", "(ZLandroid/graphics/drawable/Drawable;)V", BackendConfig.Restrictions.ENABLED, "setEnabled", "(Z)V", "visible", "setInfoIconVisible", "Landroidx/core/view/AccessibilityDelegateCompat;", "provideAccessibilityDelegate", "()Landroidx/core/view/AccessibilityDelegateCompat;", "Landroid/widget/ImageView;", "checkMark", "Landroid/widget/ImageView;", "infoIcon", "Ldfb;", "externalAccessibilityDelegate", "Ldfb;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CardTrailView extends LinearLayout implements lh {
    public static final int $stable = 8;
    private final ImageView checkMark;
    private final dfb externalAccessibilityDelegate;
    private final ImageView infoIcon;

    public CardTrailView(Context context) {
        super(context);
        this.externalAccessibilityDelegate = new dfb();
        ru.yandex.taxi.design.utils.c.q(this, luh0.card_trail_view, true);
        int i = e6h0.check_mark;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.checkMark = (ImageView) ((View) rp31.d(this, i));
        this.infoIcon = (ImageView) ((View) rp31.d(this, e6h0.info_icon));
    }

    @Override // defpackage.lh
    /* renamed from: provideAccessibilityDelegate */
    public AccessibilityDelegateCompat getDefaultAccessibilityDelegate() {
        return this.externalAccessibilityDelegate;
    }

    public final void setCheckMark(boolean selected, Drawable drawable) {
        this.externalAccessibilityDelegate.a = selected;
        this.checkMark.setImageDrawable(drawable);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.externalAccessibilityDelegate.b = enabled;
    }

    public final void setInfoIconVisible(boolean visible) {
        this.infoIcon.setVisibility(visible ? 0 : 8);
    }
}
