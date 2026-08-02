package com.yandex.go.taxi.order.details.v1.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.b64;
import defpackage.jl40;
import defpackage.njb;
import defpackage.oyr;
import defpackage.sls;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.w511;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001+B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010#\u001a\u00020\f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0!¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(R\u0016\u0010\u0014\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010*¨\u0006,"}, d2 = {"Lcom/yandex/go/taxi/order/details/v1/ui/DetailsCardListItem;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/yandex/go/taxi/order/details/v1/ui/c;", "chevron", "Lzy11;", "renderChevron", "(Lcom/yandex/go/taxi/order/details/v1/ui/c;)V", "Lcom/yandex/go/taxi/order/details/v1/ui/d;", "trailMode", "renderTrailIcon", "(Lcom/yandex/go/taxi/order/details/v1/ui/d;)V", "Lcom/yandex/go/taxi/order/details/v1/ui/a;", "trail", "renderActionButton", "(Lcom/yandex/go/taxi/order/details/v1/ui/a;)V", "Lcom/yandex/go/taxi/order/details/v1/ui/b;", "renderAttributedText", "(Lcom/yandex/go/taxi/order/details/v1/ui/b;)V", "Lru/yandex/taxi/design/ButtonComponent;", "getActionButtonView", "()Lru/yandex/taxi/design/ButtonComponent;", "Lcom/yandex/go/taxi/order/details/v1/ui/DetailsCardListItem$a;", "style", "applyStyle", "(Lcom/yandex/go/taxi/order/details/v1/ui/DetailsCardListItem$a;)V", "Lkotlin/Function0;", "block", "setClickActionListener", "(Lsls;)V", "Landroid/view/View$OnClickListener;", "listener", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Lcom/yandex/go/taxi/order/details/v1/ui/f;", "Lcom/yandex/go/taxi/order/details/v1/ui/f;", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DetailsCardListItem extends ListItemComponent {
    public static final int $stable = 8;
    private f trail;

    public /* synthetic */ DetailsCardListItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final ButtonComponent getActionButtonView() {
        return (ButtonComponent) getTrailViewAs(ButtonComponent.class);
    }

    private final void renderActionButton(com.yandex.go.taxi.order.details.v1.ui.a trail) {
        ButtonComponent buttonComponent = new ButtonComponent(getContext(), null, 0, 6, null);
        buttonComponent.setText(trail.a);
        buttonComponent.setButtonTitleColor(trail.b);
        buttonComponent.setButtonSize(0);
        int i = trail.c;
        buttonComponent.setButtonBackground(i);
        buttonComponent.setRippleColor(i);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        List list = trail.d;
        if (list.size() == 1) {
            int intValue = ((Number) kotlin.collections.a.P(list)).intValue();
            marginLayoutParams.setMargins(intValue, intValue, intValue, intValue);
        } else {
            marginLayoutParams.setMargins(!list.isEmpty() ? ((Number) list.get(0)).intValue() : 0, list.size() > 1 ? ((Number) list.get(1)).intValue() : 0, list.size() > 2 ? ((Number) list.get(2)).intValue() : 0, list.size() > 3 ? ((Number) list.get(3)).intValue() : 0);
        }
        buttonComponent.setLayoutParams(marginLayoutParams);
        setTrailVerticalGravity(0);
        setTrailView(buttonComponent);
    }

    private final void renderAttributedText(b trail) {
        RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
        robotoTextView.setText(trail.a);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int intValue = ((Number) kotlin.collections.a.P(trail.b)).intValue();
        marginLayoutParams.setMargins(intValue, intValue, intValue, intValue);
        robotoTextView.setLayoutParams(marginLayoutParams);
        setTrailVerticalGravity(0);
        setTrailView(robotoTextView);
    }

    private final void renderChevron(c chevron) {
        setTrailMode(2);
        getNavigationIconParams().b = chevron.a;
    }

    private final void renderTrailIcon(d trailMode) {
        setTrailImage(trailMode.a);
    }

    public final void applyStyle(a style) {
        setLeadImagePadding(style.a);
        setSubtitleAboveTitle(style.e);
        setTitleMaxLines(style.b);
        setSubtitleMaxLines(style.c);
        ellipsizeTitleMiddle(style.d);
        f fVar = this.trail;
        f fVar2 = style.f;
        if (!jl40.l(fVar, fVar2)) {
            this.trail = fVar2;
            if (fVar2 instanceof e) {
                setTrailMode(((e) fVar2).a);
            } else if (fVar2 instanceof c) {
                renderChevron((c) fVar2);
            } else if (fVar2 instanceof d) {
                renderTrailIcon((d) fVar2);
            } else if (fVar2 instanceof com.yandex.go.taxi.order.details.v1.ui.a) {
                renderActionButton((com.yandex.go.taxi.order.details.v1.ui.a) fVar2);
            } else {
                if (!(fVar2 instanceof b)) {
                    w511.b();
                    return;
                }
                renderAttributedText((b) fVar2);
            }
        }
        invalidateComponent();
    }

    public final void setClickActionListener(sls block) {
        setOnClickListener(new njb(4, block));
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, android.view.View
    public void setOnClickListener(View.OnClickListener listener) {
        if (!(this.trail instanceof com.yandex.go.taxi.order.details.v1.ui.a)) {
            super.setOnClickListener(listener);
            return;
        }
        super.setOnClickListener(null);
        ButtonComponent actionButtonView = getActionButtonView();
        if (actionButtonView != null) {
            actionButtonView.setOnClickListener(listener);
        }
    }

    public DetailsCardListItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DetailsCardListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.trail = e.b;
    }

    public DetailsCardListItem(Context context) {
        this(context, null, 0, 6, null);
    }

    public static final class a {
        public static final a g = new a(0, 0, false, false, (f) null, 63);
        public final int a;
        public final int b;
        public final int c;
        public final boolean d;
        public final boolean e;
        public final f f;

        public /* synthetic */ a(int i, int i2, boolean z, boolean z2, f fVar, int i3) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 2 : i2, 2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? new e(0) : fVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && jl40.l(this.f, aVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + unr0.e(unr0.e(oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder s = b64.s(this.a, this.b, "Style(leadIconPadding=", ", titleMaxLines=", ", subtitleMaxLines=");
            tse0.z(s, this.c, ", isCenteredEllipsize=", this.d, ", isSubtitleAboveTitle=");
            s.append(this.e);
            s.append(", trail=");
            s.append(this.f);
            s.append(Extension.C_BRAKE);
            return s.toString();
        }

        public a(int i, int i2, int i3, boolean z, boolean z2, f fVar) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = z;
            this.e = z2;
            this.f = fVar;
        }

        public a() {
            this(0, 0, false, false, (f) null, 63);
        }
    }
}
