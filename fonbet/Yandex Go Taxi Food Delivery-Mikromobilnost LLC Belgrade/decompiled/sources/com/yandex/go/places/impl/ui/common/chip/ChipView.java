package com.yandex.go.places.impl.ui.common.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.places.impl.ui.common.chip.ChipView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.cma1;
import defpackage.dug0;
import defpackage.gi80;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jqb;
import defpackage.kdc;
import defpackage.kqb;
import defpackage.lqb;
import defpackage.ny61;
import defpackage.o6h0;
import defpackage.s8o;
import defpackage.sls;
import defpackage.uuh0;
import defpackage.w0d;
import defpackage.w511;
import defpackage.x4e;
import defpackage.xng0;
import defpackage.zpb;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001AB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\r¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0011¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00106\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00102R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R(\u0010@\u001a\u00020\u0015*\u00020:2\u0006\u0010;\u001a\u00020\u00158B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lcom/yandex/go/places/impl/ui/common/chip/ChipView;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "refreshState", "()V", "Llqb;", "", "obtainCurrentText", "(Llqb;)Ljava/lang/CharSequence;", "Lzpb;", "Landroid/graphics/drawable/Drawable;", "obtainCurrentBackground", "(Lzpb;)Landroid/graphics/drawable/Drawable;", "Lkdc;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "createBackground", "(Lkdc;)Landroid/graphics/drawable/Drawable;", "", "isSelected", "setSelected", "(Z)V", "isTriggered", "setTriggered", "image", "setSelectedImage", "(Landroid/graphics/drawable/Drawable;)V", "chipTexts", "setTexts", "(Llqb;)V", "chipBackgroundColors", "setBackgroundColors", "(Lzpb;)V", "color", "setBackgroundColorSingle", "(Lkdc;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lgi80;", "binding", "Lgi80;", "", "rippleColor$delegate", "Li3y;", "getRippleColor", "()I", "rippleColor", "cornerRadius$delegate", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "Lcom/yandex/go/places/impl/ui/common/chip/ChipView$a;", "chipViewState", "Lcom/yandex/go/places/impl/ui/common/chip/ChipView$a;", "Lcom/yandex/go/design/view/GoImageView;", "value", "getHasImage", "(Lcom/yandex/go/design/view/GoImageView;)Z", "setHasImage", "(Lcom/yandex/go/design/view/GoImageView;Z)V", "hasImage", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ChipView extends GoConstraintLayout {
    public static final int $stable = 8;
    private final gi80 binding;
    private a chipViewState;

    /* renamed from: cornerRadius$delegate, reason: from kotlin metadata */
    private final i3y cornerRadius;

    /* renamed from: rippleColor$delegate, reason: from kotlin metadata */
    private final i3y rippleColor;

    public ChipView(Context context) {
        super(context, null, 0, 0, 14, null);
        LayoutInflater.from(context).inflate(uuh0.organization_filter_chip_item, this);
        int i = o6h0.deselect_button;
        GoImageView goImageView = (GoImageView) cma1.O(i, this);
        if (goImageView != null) {
            i = o6h0.text;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
            if (robotoTextView != null) {
                i = o6h0.trigger_mark;
                GoImageView goImageView2 = (GoImageView) cma1.O(i, this);
                if (goImageView2 != null) {
                    this.binding = new gi80(this, goImageView, robotoTextView, goImageView2);
                    final int i2 = 0;
                    sls slsVar = new sls(this) { // from class: nqb
                        public final /* synthetic */ ChipView b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            int rippleColor_delegate$lambda$0;
                            int i3 = i2;
                            ChipView chipView = this.b;
                            switch (i3) {
                                case 0:
                                    rippleColor_delegate$lambda$0 = ChipView.rippleColor_delegate$lambda$0(chipView);
                                    break;
                                default:
                                    rippleColor_delegate$lambda$0 = ChipView.cornerRadius_delegate$lambda$0(chipView);
                                    break;
                            }
                            return Integer.valueOf(rippleColor_delegate$lambda$0);
                        }
                    };
                    LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                    this.rippleColor = kotlin.a.b(lazyThreadSafetyMode, slsVar);
                    final int i3 = 1;
                    this.cornerRadius = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: nqb
                        public final /* synthetic */ ChipView b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            int rippleColor_delegate$lambda$0;
                            int i32 = i3;
                            ChipView chipView = this.b;
                            switch (i32) {
                                case 0:
                                    rippleColor_delegate$lambda$0 = ChipView.rippleColor_delegate$lambda$0(chipView);
                                    break;
                                default:
                                    rippleColor_delegate$lambda$0 = ChipView.cornerRadius_delegate$lambda$0(chipView);
                                    break;
                            }
                            return Integer.valueOf(rippleColor_delegate$lambda$0);
                        }
                    });
                    this.chipViewState = new a();
                    refreshState();
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int cornerRadius_delegate$lambda$0(ChipView chipView) {
        return c.d(dug0.discovery_organizations_chip_corner_radius, chipView);
    }

    private final Drawable createBackground(kdc backgroundColor) {
        w0d w0dVar = new w0d();
        w0dVar.h = getCornerRadius();
        w0dVar.a = s8o.m(backgroundColor, getContext());
        w0dVar.g = true;
        w0dVar.e = Integer.valueOf(getRippleColor());
        return w0dVar.a();
    }

    private final int getCornerRadius() {
        return ((Number) this.cornerRadius.getValue()).intValue();
    }

    private final boolean getHasImage(GoImageView goImageView) {
        Object tag = goImageView.getTag();
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final int getRippleColor() {
        return ((Number) this.rippleColor.getValue()).intValue();
    }

    private final Drawable obtainCurrentBackground(zpb zpbVar) {
        boolean isSelected = isSelected();
        a aVar = this.chipViewState;
        if (isSelected) {
            Drawable drawable = aVar.d;
            if (drawable != null) {
                return drawable;
            }
            Drawable createBackground = createBackground(zpbVar.b);
            this.chipViewState = a.a(this.chipViewState, null, null, null, createBackground, false, 23);
            return createBackground;
        }
        Drawable drawable2 = aVar.c;
        if (drawable2 != null) {
            return drawable2;
        }
        Drawable createBackground2 = createBackground(zpbVar.a);
        this.chipViewState = a.a(this.chipViewState, null, null, createBackground2, null, false, 27);
        return createBackground2;
    }

    private final CharSequence obtainCurrentText(lqb lqbVar) {
        if (lqbVar instanceof kqb) {
            return ((kqb) lqbVar).a;
        }
        if (lqbVar instanceof jqb) {
            jqb jqbVar = (jqb) lqbVar;
            return isSelected() ? jqbVar.b : jqbVar.a;
        }
        w511.b();
        return null;
    }

    private final void refreshState() {
        Drawable drawable;
        gi80 gi80Var = this.binding;
        int i = 8;
        gi80Var.d.setVisibility(this.chipViewState.e ? 0 : 8);
        gi80Var.c.setText(obtainCurrentText(this.chipViewState.a));
        GoImageView goImageView = gi80Var.b;
        if (isSelected() && getHasImage(this.binding.b)) {
            i = 0;
        }
        goImageView.setVisibility(i);
        ChipView chipView = gi80Var.a;
        zpb zpbVar = this.chipViewState.b;
        if (zpbVar == null || (drawable = obtainCurrentBackground(zpbVar)) == null) {
            drawable = this.chipViewState.c;
        }
        chipView.setBackground(drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rippleColor_delegate$lambda$0(ChipView chipView) {
        return c.c(xng0.controlPressed, chipView);
    }

    private final void setHasImage(GoImageView goImageView, boolean z) {
        goImageView.setTag(Boolean.valueOf(z));
    }

    @Override // com.yandex.go.design.view.GoConstraintLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.chipViewState = a.a(this.chipViewState, null, null, null, null, false, 19);
        refreshState();
    }

    public final void setBackgroundColorSingle(kdc color) {
        this.chipViewState = a.a(this.chipViewState, null, null, createBackground(color), null, false, 27);
        refreshState();
    }

    public final void setBackgroundColors(zpb chipBackgroundColors) {
        this.chipViewState = a.a(this.chipViewState, null, chipBackgroundColors, null, null, false, 29);
        refreshState();
    }

    @Override // android.view.View
    public void setSelected(boolean isSelected) {
        super.setSelected(isSelected);
        refreshState();
    }

    public final void setSelectedImage(Drawable image) {
        this.binding.b.setImageDrawable(image);
        setHasImage(this.binding.b, image != null);
        refreshState();
    }

    public final void setTexts(lqb chipTexts) {
        this.chipViewState = a.a(this.chipViewState, chipTexts, null, null, null, false, 30);
        refreshState();
    }

    public final void setTriggered(boolean isTriggered) {
        this.chipViewState = a.a(this.chipViewState, null, null, null, null, isTriggered, 15);
        refreshState();
    }

    public static final class a {
        public final lqb a;
        public final zpb b;
        public final Drawable c;
        public final Drawable d;
        public final boolean e;

        public a() {
            this(new kqb(""), null, null, null, false);
        }

        public static a a(a aVar, lqb lqbVar, zpb zpbVar, Drawable drawable, Drawable drawable2, boolean z, int i) {
            if ((i & 1) != 0) {
                lqbVar = aVar.a;
            }
            lqb lqbVar2 = lqbVar;
            if ((i & 2) != 0) {
                zpbVar = aVar.b;
            }
            zpb zpbVar2 = zpbVar;
            if ((i & 4) != 0) {
                drawable = aVar.c;
            }
            Drawable drawable3 = drawable;
            if ((i & 8) != 0) {
                drawable2 = aVar.d;
            }
            Drawable drawable4 = drawable2;
            if ((i & 16) != 0) {
                z = aVar.e;
            }
            aVar.getClass();
            return new a(lqbVar2, zpbVar2, drawable3, drawable4, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c) && jl40.l(this.d, aVar.d) && this.e == aVar.e;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            zpb zpbVar = this.b;
            int hashCode2 = (hashCode + (zpbVar == null ? 0 : zpbVar.hashCode())) * 31;
            Drawable drawable = this.c;
            int hashCode3 = (hashCode2 + (drawable == null ? 0 : drawable.hashCode())) * 31;
            Drawable drawable2 = this.d;
            return Boolean.hashCode(this.e) + ((hashCode3 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChipViewState(chipTexts=");
            sb.append(this.a);
            sb.append(", backgroundColors=");
            sb.append(this.b);
            sb.append(", baseBackground=");
            sb.append(this.c);
            sb.append(", selectedBackground=");
            sb.append(this.d);
            sb.append(", isTriggered=");
            return x4e.i(sb, this.e, Extension.C_BRAKE);
        }

        public a(lqb lqbVar, zpb zpbVar, Drawable drawable, Drawable drawable2, boolean z) {
            this.a = lqbVar;
            this.b = zpbVar;
            this.c = drawable;
            this.d = drawable2;
            this.e = z;
        }
    }
}
