package com.yandex.go.parks.nearest.presentation.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import androidx.core.view.b;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.c6h0;
import defpackage.evu0;
import defpackage.juh0;
import defpackage.kux0;
import defpackage.mqg0;
import defpackage.qdb1;
import defpackage.rp31;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0015¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00158TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0017¨\u0006("}, d2 = {"Lcom/yandex/go/parks/nearest/presentation/ui/TaxiNearestZoneErrorModalView;", "Lcom/yandex/go/parks/nearest/presentation/ui/NearestZoneErrorModalView;", "Landroid/content/Context;", "context", "Ljava/lang/Runnable;", "onChangeAddressClick", "onInfoClick", "", "titleText", "subtitleText", "infoText", "onLocationClick", "<init>", "(Landroid/content/Context;Ljava/lang/Runnable;Ljava/lang/Runnable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/View;", "getFocusedForAccessibilityViewOnAppear", "()Landroid/view/View;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Ljava/lang/Runnable;", "Ljava/lang/String;", "Lru/yandex/taxi/design/ListTitleComponent;", "title", "Lru/yandex/taxi/design/ListTitleComponent;", "Lru/yandex/taxi/design/ButtonComponent;", "changeAddressButton", "Lru/yandex/taxi/design/ButtonComponent;", "Lru/yandex/taxi/design/ListTextComponent;", "info", "Lru/yandex/taxi/design/ListTextComponent;", "Lru/yandex/taxi/widget/RobotoTextView;", "errorSubtitle", "Lru/yandex/taxi/widget/RobotoTextView;", "getCardContentViewLayoutRes", "cardContentViewLayoutRes", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TaxiNearestZoneErrorModalView extends NearestZoneErrorModalView {
    private final ButtonComponent changeAddressButton;
    private final RobotoTextView errorSubtitle;
    private final ListTextComponent info;
    private final String infoText;
    private final Runnable onInfoClick;
    private final Runnable onLocationClick;
    private final String subtitleText;
    private final ListTitleComponent title;
    private final String titleText;

    public TaxiNearestZoneErrorModalView(Context context, Runnable runnable, Runnable runnable2, String str, String str2, String str3, Runnable runnable3) {
        super(context, runnable);
        this.onInfoClick = runnable2;
        this.titleText = str;
        this.subtitleText = str2;
        this.infoText = str3;
        this.onLocationClick = runnable3;
        int i = c6h0.nearest_zone_error_title;
        WeakHashMap weakHashMap = b.a;
        this.title = (ListTitleComponent) ((View) rp31.d(this, i));
        this.changeAddressButton = (ButtonComponent) ((View) rp31.d(this, c6h0.nearest_change_address_button));
        this.info = (ListTextComponent) ((View) rp31.d(this, c6h0.nearest_zone_error_info));
        this.errorSubtitle = (RobotoTextView) ((View) rp31.d(this, c6h0.nearest_zone_error_subtitle));
        setInterceptOnBackPress(false);
        setDismissOnTouchOutside(false);
        setClickable(false);
        setInterceptOnBackPress(false);
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(TaxiNearestZoneErrorModalView taxiNearestZoneErrorModalView) {
        taxiNearestZoneErrorModalView.onLocationClick.run();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return juh0.nearest_zone_error_modal_view;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public View getFocusedForAccessibilityViewOnAppear() {
        return this.title;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        c.B(this.info, this.onInfoClick);
        this.changeAddressButton.setDebounceClickListener(getOnChangeAddressClick());
        int i = 1;
        b.q(this.title, true);
        this.title.setTitle(this.titleText);
        this.info.setText(this.infoText);
        String str2 = this.infoText;
        if (str2 == null || evu0.J(str2)) {
            this.info.setVisibility(8);
        } else {
            SpannableString spannableString = new SpannableString(this.infoText);
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
            this.info.setText(spannableString);
            this.info.setVisibility(0);
        }
        String str3 = this.infoText;
        if ((str3 == null || evu0.J(str3)) && ((str = this.subtitleText) == null || evu0.J(str))) {
            this.title.setTitleAlignment(1);
        } else {
            this.title.setTitleAlignment(0);
        }
        String str4 = this.subtitleText;
        if (str4 == null || evu0.J(str4)) {
            this.errorSubtitle.setVisibility(8);
        } else {
            this.errorSubtitle.setImportantForAccessibility(1);
            this.errorSubtitle.setText(this.subtitleText);
            this.errorSubtitle.setVisibility(0);
            this.errorSubtitle.setContentDescription(this.subtitleText);
        }
        if (this.onLocationClick != null) {
            qdb1.d(this, new kux0(i, this));
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.info.setOnClickListener(null);
        this.changeAddressButton.setDebounceClickListener(null);
    }

    public /* synthetic */ TaxiNearestZoneErrorModalView(Context context, Runnable runnable, Runnable runnable2, String str, String str2, String str3, Runnable runnable3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : runnable, (i & 4) != 0 ? null : runnable2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : runnable3);
    }
}
