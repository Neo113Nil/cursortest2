package com.ybsdk.widgets.common.banners;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.common.YbButtonView;
import defpackage.cma1;
import defpackage.fch0;
import defpackage.hbv;
import defpackage.j4c;
import defpackage.k4o;
import defpackage.n461;
import defpackage.njb;
import defpackage.ny61;
import defpackage.nyg0;
import defpackage.poh0;
import defpackage.rje;
import defpackage.sls;
import defpackage.ung0;
import defpackage.unr0;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002 !B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017¢\u0006\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/ybsdk/widgets/common/banners/PromoBannerMediumView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/ybsdk/widgets/common/banners/PromoBannerMediumView$a;", ClidProvider.STATE, "Lhbv;", "bindImageData", "(Lcom/ybsdk/widgets/common/banners/PromoBannerMediumView$a;)Lhbv;", "Lzy11;", "bindTitleData", "(Lcom/ybsdk/widgets/common/banners/PromoBannerMediumView$a;)Lzy11;", "bindSubTitleData", "bindButtonData", "bindCloseButtonData", "render", "(Lcom/ybsdk/widgets/common/banners/PromoBannerMediumView$a;)V", "Lkotlin/Function0;", "listener", "setOnCloseClickListener", "(Lsls;)V", "setOnActionButtonClickListener", "setOnBannerClickListener", "Ln461;", "binding", "Ln461;", "a", "ButtonMode", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PromoBannerMediumView extends CardView {
    private final n461 binding;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/widgets/common/banners/PromoBannerMediumView$ButtonMode;", "", "<init>", "(Ljava/lang/String;I)V", "GONE", "INVISIBLE", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonMode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ButtonMode[] $VALUES;
        public static final ButtonMode GONE = new ButtonMode("GONE", 0);
        public static final ButtonMode INVISIBLE = new ButtonMode("INVISIBLE", 1);

        private static final /* synthetic */ ButtonMode[] $values() {
            return new ButtonMode[]{GONE, INVISIBLE};
        }

        static {
            ButtonMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private ButtonMode(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static ButtonMode valueOf(String str) {
            return (ButtonMode) Enum.valueOf(ButtonMode.class, str);
        }

        public static ButtonMode[] values() {
            return (ButtonMode[]) $VALUES.clone();
        }
    }

    public static final class a {
        public final ButtonMode a = ButtonMode.INVISIBLE;
        public final boolean b = true;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return unr0.e(this.a.hashCode() * 961, 28629151, this.b);
        }

        public final String toString() {
            return "State(title=null, message=null, buttonData=null, buttonMode=" + this.a + ", image=null, isClosable=" + this.b + ", titleColor=null, subtitleColor=null, backgroundColor=null, closeButtonColor=null, closeBackgroundColor=null)";
        }
    }

    public PromoBannerMediumView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(poh0.ybsdk_promo_banner_medium, this);
        int i2 = fch0.button;
        YbButtonView ybButtonView = (YbButtonView) cma1.O(i2, this);
        if (ybButtonView != null) {
            i2 = fch0.closeButton;
            CloseBannerButtonView closeBannerButtonView = (CloseBannerButtonView) cma1.O(i2, this);
            if (closeBannerButtonView != null) {
                i2 = fch0.constraintLayout;
                if (((ConstraintLayout) cma1.O(i2, this)) != null) {
                    i2 = fch0.image;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
                    if (appCompatImageView != null) {
                        i2 = fch0.subtitle;
                        TextView textView = (TextView) cma1.O(i2, this);
                        if (textView != null) {
                            i2 = fch0.title;
                            TextView textView2 = (TextView) cma1.O(i2, this);
                            if (textView2 != null) {
                                this.binding = new n461(this, ybButtonView, closeBannerButtonView, appCompatImageView, textView, textView2);
                                setBackground((GradientDrawable) context.getDrawable(nyg0.ybsdk_promo_banner_medium_background));
                                setElevation(0.0f);
                                return;
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final zy11 bindButtonData(a state) {
        n461 n461Var = this.binding;
        int i = com.ybsdk.widgets.common.banners.a.a[state.a.ordinal()];
        if (i == 1) {
            n461Var.b.setVisibility(8);
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            n461Var.b.setVisibility(4);
        }
        return null;
    }

    private final zy11 bindCloseButtonData(a state) {
        CloseBannerButtonView closeBannerButtonView = this.binding.c;
        closeBannerButtonView.setVisibility(state.b ? 0 : 8);
        return closeBannerButtonView.render(new j4c(rje.a(closeBannerButtonView.getContext(), ung0.ybColor_fill_default_300), Integer.valueOf(rje.a(closeBannerButtonView.getContext(), ung0.ybColor_fill_default_0))));
    }

    private final hbv bindImageData(a state) {
        AppCompatImageView appCompatImageView = this.binding.d;
        state.getClass();
        appCompatImageView.setVisibility(8);
        return null;
    }

    private final zy11 bindSubTitleData(a state) {
        TextView textView = this.binding.e;
        state.getClass();
        textView.setText(d.a(getContext(), Text.Empty.INSTANCE));
        return null;
    }

    private final zy11 bindTitleData(a state) {
        TextView textView = this.binding.f;
        state.getClass();
        textView.setText(d.a(getContext(), Text.Empty.INSTANCE));
        return null;
    }

    public final void render(a state) {
        bindImageData(state);
        bindTitleData(state);
        bindSubTitleData(state);
        bindButtonData(state);
        bindCloseButtonData(state);
    }

    public final void setOnActionButtonClickListener(sls listener) {
        this.binding.b.setOnClickListener(new njb(29, listener));
    }

    public final void setOnBannerClickListener(sls listener) {
        this.binding.a.setOnClickListener(new njb(27, listener));
    }

    public final void setOnCloseClickListener(sls listener) {
        this.binding.c.setOnClickListener(new njb(28, listener));
    }

    public PromoBannerMediumView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PromoBannerMediumView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public PromoBannerMediumView(Context context) {
        this(context, null, 0, 6, null);
    }
}
