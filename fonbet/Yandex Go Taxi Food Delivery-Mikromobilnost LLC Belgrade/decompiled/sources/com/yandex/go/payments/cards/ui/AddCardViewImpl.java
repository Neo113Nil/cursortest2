package com.yandex.go.payments.cards.ui;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.DateKeyListener;
import android.text.method.DigitsKeyListener;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.yandex.go.payments.cards.domain.model.UserCardProfileParams;
import com.yandex.go.payments.cards.pci_dss.data.model.PciDssCardData;
import com.yandex.go.payments.cards.pci_dss.ui.AddCardPciDssViewHolder$AfterTextChangedWatcherAdapter;
import com.yandex.go.payments.cards.pci_dss.ui.CreditCardTextWatcher;
import com.yandex.go.payments.cards.pci_dss.ui.ExpiryTextWatcher;
import com.yandex.go.payments.cards.ui.AddCardViewImpl;
import com.yandex.go.payments.cards.ui.add.AddCardModalView;
import com.yandex.go.payments.data.u;
import com.yandex.go.payments.domain.q0;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.a90;
import defpackage.ba0;
import defpackage.bdc;
import defpackage.bia0;
import defpackage.cma1;
import defpackage.ddf;
import defpackage.dzg0;
import defpackage.e6h0;
import defpackage.evu0;
import defpackage.ga0;
import defpackage.ib0;
import defpackage.jb0;
import defpackage.jj91;
import defpackage.jst;
import defpackage.ka0;
import defpackage.kb0;
import defpackage.kyh0;
import defpackage.l8x;
import defpackage.luh0;
import defpackage.m2v;
import defpackage.m6;
import defpackage.nb0;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.ob0;
import defpackage.py90;
import defpackage.q5t0;
import defpackage.qb0;
import defpackage.qje;
import defpackage.qk21;
import defpackage.qy90;
import defpackage.ra0;
import defpackage.rju;
import defpackage.rp31;
import defpackage.tc8;
import defpackage.tf;
import defpackage.tje;
import defpackage.ua0;
import defpackage.utg0;
import defpackage.va0;
import defpackage.w931;
import defpackage.wjh;
import defpackage.xng0;
import defpackage.xqw;
import defpackage.xw31;
import defpackage.y2h0;
import defpackage.y80;
import defpackage.ymu;
import defpackage.yng0;
import defpackage.yqb;
import defpackage.zy11;
import defpackage.zzs;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.bubble.BubbleTextComponent;
import ru.yandex.taxi.design.bubble.decorator.HintBubbleDecorator$Position;
import ru.yandex.taxi.payment_options.model.pci_dss.CardType;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 j2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001kB'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0015¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0015¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u001fH\u0016¢\u0006\u0004\b+\u0010\"J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b,\u0010\u0018J\u001f\u0010/\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020#H\u0016¢\u0006\u0004\b/\u0010)J\u0017\u00101\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u0015H\u0016¢\u0006\u0004\b1\u0010\u0018J\u0017\u00104\u001a\u00020\u000e2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0015H\u0016¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\u00152\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u000eH\u0002¢\u0006\u0004\b<\u0010\u0010J\u0017\u0010?\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u000eH\u0002¢\u0006\u0004\bA\u0010\u0010J\u000f\u0010B\u001a\u00020\u000eH\u0002¢\u0006\u0004\bB\u0010\u0010J\u000f\u0010C\u001a\u00020\u000eH\u0002¢\u0006\u0004\bC\u0010\u0010J\u001f\u0010F\u001a\u00020\u00152\u0006\u0010E\u001a\u00020D2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bJ\u0010IJ\u0011\u0010K\u001a\u0004\u0018\u00010=H\u0002¢\u0006\u0004\bK\u0010LR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010MR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010NR\u0016\u0010O\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010VR\u0014\u0010X\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010VR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010_\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010a\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010VR\u0014\u0010b\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010VR\u0014\u0010c\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010`R\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010i¨\u0006l"}, d2 = {"Lcom/yandex/go/payments/cards/ui/AddCardViewImpl;", "Lcom/yandex/go/payments/cards/ui/AddCardView;", "Lba0;", "Lnwy0;", "Landroid/content/Context;", "context", "Lva0;", "presenter", "Lra0;", "pciDssPresenter", "Lbia0;", "resourceProvider", "<init>", "(Landroid/content/Context;Lva0;Lra0;Lbia0;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "resume", "pause", "onDismiss", "", BackendConfig.Restrictions.ENABLED, "setConfirmButtonEnabled", "(Z)V", "visible", "setCardScanButtonVisible", "Lru/yandex/taxi/payment_options/model/pci_dss/CardType;", "cardType", "setCardImage", "(Lru/yandex/taxi/payment_options/model/pci_dss/CardType;)V", "", "visibility", "setYbLogoVisibility", "(I)V", "", "contentDescription", "setYbContentDescription", "(Ljava/lang/String;)V", "title", "showTopTrailing", "(Ljava/lang/String;Ljava/lang/String;)V", "cvnLength", "updateCvnComment", "setNfcCardScanIconVisible", "text", "accessibilityText", "setNfcCardScanTooltipText", "isPanLong", "updateCardIconVisibility", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "applyThemeForChildrenByDefault", "()Z", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "applyIsTextScaleBig", "Landroid/app/Activity;", "activity", "onResume", "(Landroid/app/Activity;)V", "setupBubbleCvnHelp", "setupNfcScanCardTooltip", "updateNfcScanCardTooltipTranslations", "Lru/yandex/taxi/design/bubble/BubbleTextComponent;", "bubble", "isTouchInsideBubble", "(Lru/yandex/taxi/design/bubble/BubbleTextComponent;Landroid/view/MotionEvent;)Z", "showBubble", "(Lru/yandex/taxi/design/bubble/BubbleTextComponent;)V", "hideBubble", "getActivity", "()Landroid/app/Activity;", "Lva0;", "Lbia0;", "isSystemTextScaleBig", "Z", "Lcom/yandex/go/payments/cards/ui/CardNumberPadView;", "cardNumberPadView", "Lcom/yandex/go/payments/cards/ui/CardNumberPadView;", "Landroid/widget/ImageView;", "cardScan", "Landroid/widget/ImageView;", "cardImage", "ybLogo", "Landroid/widget/TextView;", "topTrailInfo", "Landroid/widget/TextView;", "Landroidx/cardview/widget/CardView;", "cardContainer", "Landroidx/cardview/widget/CardView;", "bubbleCvnHelp", "Lru/yandex/taxi/design/bubble/BubbleTextComponent;", "iconCvnHelp", "nfcCardScanIcon", "nfcCardScanIconBubble", "Lq5t0;", "softInputModeHolder", "Lq5t0;", "Lcom/yandex/go/payments/cards/pci_dss/ui/b;", "viewHolder", "Lcom/yandex/go/payments/cards/pci_dss/ui/b;", "Companion", "qb0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddCardViewImpl extends AddCardView implements ba0, nwy0 {
    public static final int $stable = 8;

    @Deprecated
    public static final float BIG_FONT_SCALE_THRESHOLD = 1.3f;
    private static final qb0 Companion = new qb0();
    private final BubbleTextComponent bubbleCvnHelp;
    private final CardView cardContainer;
    private final ImageView cardImage;
    private final CardNumberPadView cardNumberPadView;
    private final ImageView cardScan;
    private final ImageView iconCvnHelp;
    private boolean isSystemTextScaleBig;
    private final ImageView nfcCardScanIcon;
    private final BubbleTextComponent nfcCardScanIconBubble;
    private final va0 presenter;
    private final bia0 resourceProvider;
    private final q5t0 softInputModeHolder;
    private final TextView topTrailInfo;
    private final com.yandex.go.payments.cards.pci_dss.ui.b viewHolder;
    private final ImageView ybLogo;

    public AddCardViewImpl(Context context, va0 va0Var, ra0 ra0Var, bia0 bia0Var) {
        super(context);
        this.presenter = va0Var;
        this.resourceProvider = bia0Var;
        ru.yandex.taxi.design.utils.c.q(this, luh0.add_card_view, true);
        int i = e6h0.number_pad;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.cardNumberPadView = (CardNumberPadView) ((View) rp31.d(this, i));
        this.cardScan = (ImageView) ((View) rp31.d(this, e6h0.card_scan));
        this.cardImage = (ImageView) ((View) rp31.d(this, e6h0.card_image));
        this.ybLogo = (ImageView) ((View) rp31.d(this, e6h0.yb_logo));
        this.topTrailInfo = (TextView) ((View) rp31.d(this, e6h0.top_trailing_info));
        this.cardContainer = (CardView) ((View) rp31.d(this, e6h0.card_container));
        this.bubbleCvnHelp = (BubbleTextComponent) ((View) rp31.d(this, e6h0.bubble_cvn_help));
        this.iconCvnHelp = (ImageView) ((View) rp31.d(this, e6h0.ic_cvn_help));
        this.nfcCardScanIcon = (ImageView) ((View) rp31.d(this, e6h0.nfc_card_scan_icon));
        this.nfcCardScanIconBubble = (BubbleTextComponent) ((View) rp31.d(this, e6h0.nfc_card_scan_icon_bubble));
        Activity activity = getActivity();
        if (activity == null) {
            ny61.g("Required value was null.");
            throw null;
        }
        this.softInputModeHolder = new q5t0(activity);
        this.viewHolder = new com.yandex.go.payments.cards.pci_dss.ui.b(this, ra0Var, getContext().getColor(R.color.holo_red_dark), xng0.textMain);
        setupBubbleCvnHelp();
        setupNfcScanCardTooltip();
        applyIsTextScaleBig();
    }

    private final void applyIsTextScaleBig() {
        this.isSystemTextScaleBig = getContext().getResources().getConfiguration().fontScale >= 1.3f;
    }

    private final Activity getActivity() {
        return jj91.b(getContext());
    }

    private final void hideBubble(BubbleTextComponent bubble) {
        if (bubble.getVisibility() == 0) {
            bubble.hide(true);
        }
    }

    private final boolean isTouchInsideBubble(BubbleTextComponent bubble, MotionEvent event) {
        if (bubble.getVisibility() != 0) {
            return false;
        }
        return xw31.l((int) event.getRawX(), (int) event.getRawY(), 0, bubble);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(AddCardViewImpl addCardViewImpl, View view) {
        ra0 ra0Var = addCardViewImpl.viewHolder.a;
        tc8 tc8Var = ra0Var.o;
        if (!tc8Var.b()) {
            jst.e.w(new IllegalStateException("addCard should not be called without filled data"));
            return;
        }
        m6 m6Var = ra0Var.e;
        xqw xqwVar = ra0Var.g;
        a90 a90Var = (a90) xqwVar;
        AddCardModalView.createAddCardView$lambda$0((AddCardModalView) m6Var.b, m2v.g(a90Var.b, a90Var, null, new PciDssCardData(tc8Var.a, tc8Var.b, tc8Var.c, tc8Var.d), null, new w931(null)));
    }

    private final void onResume(Activity activity) {
        if ((activity.getCurrentFocus() instanceof EditText) || tje.L(getContext())) {
            return;
        }
        this.viewHolder.e.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setCardScanButtonVisible$lambda$0(AddCardViewImpl addCardViewImpl) {
        addCardViewImpl.viewHolder.a();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setNfcCardScanTooltipText$lambda$0(AddCardViewImpl addCardViewImpl) {
        addCardViewImpl.showBubble(addCardViewImpl.nfcCardScanIconBubble);
    }

    private final void setupBubbleCvnHelp() {
        rju rjuVar = new rju(getContext());
        rjuVar.b(new bdc(xng0.textMain));
        rjuVar.g(HintBubbleDecorator$Position.OFFSET_END);
        this.bubbleCvnHelp.setDecorator(rjuVar);
        this.bubbleCvnHelp.showCloseIcon(false);
        ru.yandex.taxi.design.utils.c.z(new nb0(this, 2), this.iconCvnHelp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupBubbleCvnHelp$lambda$0(AddCardViewImpl addCardViewImpl) {
        addCardViewImpl.showBubble(addCardViewImpl.bubbleCvnHelp);
        return zy11.a;
    }

    private final void setupNfcScanCardTooltip() {
        rju rjuVar = new rju(getContext());
        rjuVar.b(new bdc(xng0.textMain));
        rjuVar.g(HintBubbleDecorator$Position.OFFSET_END);
        this.nfcCardScanIconBubble.setDecorator(rjuVar);
        this.nfcCardScanIconBubble.showCloseIcon(false);
        this.nfcCardScanIconBubble.setTextGravity(17);
    }

    private final void showBubble(BubbleTextComponent bubble) {
        if (tje.L(getContext()) || bubble.getVisibility() == 0) {
            return;
        }
        bubble.show(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showTopTrailing$lambda$0(AddCardViewImpl addCardViewImpl) {
        jb0 jb0Var = addCardViewImpl.presenter.x.b;
        if (jb0Var != null) {
            jb0Var.c.run();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateNfcScanCardTooltipTranslations() {
        float width = (this.nfcCardScanIcon.getWidth() / 2.0f) + this.nfcCardScanIcon.getX() + this.cardContainer.getX();
        if (!xw31.n(getContext())) {
            width -= getWidth();
        }
        float y = ((this.nfcCardScanIcon.getY() + this.cardContainer.getY()) + tje.r(utg0.nfc_bubble_vertical_offset, getContext())) - getHeight();
        this.nfcCardScanIconBubble.setTranslationX(width);
        this.nfcCardScanIconBubble.setTranslationY(y);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        int t = qje.t(yng0.cardBackgroundColor, getContext());
        int t2 = qje.t(xng0.textMain, getContext());
        this.cardContainer.setCardBackgroundColor(t);
        this.cardScan.setImageTintList(ColorStateList.valueOf(t2));
        this.nfcCardScanIcon.setImageTintList(ColorStateList.valueOf(t2));
        this.ybLogo.setImageDrawable(tje.y(y2h0.ic_yb_logo, getContext()));
        androidx.core.widget.b.a(this.topTrailInfo, ColorStateList.valueOf(t2));
    }

    @Override // defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (!isTouchInsideBubble(this.bubbleCvnHelp, event) && !isTouchInsideBubble(this.nfcCardScanIconBubble, event)) {
            if (event.getActionMasked() == 0) {
                hideBubble(this.bubbleCvnHelp);
                hideBubble(this.nfcCardScanIconBubble);
            }
            super.dispatchTouchEvent(event);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        va0 va0Var = this.presenter;
        va0Var.Bg(this);
        updateCvnComment(va0Var.z.b());
        kb0 kb0Var = va0Var.x;
        ib0 ib0Var = kb0Var.a;
        jb0 jb0Var = kb0Var.b;
        int i = 0;
        boolean z = jb0Var != null;
        int i2 = ib0Var != null ? 0 : 8;
        int i3 = 4;
        if (z && ib0Var == null) {
            i2 = 4;
        }
        ((ba0) va0Var.Dg()).setYbLogoVisibility(i2);
        if (ib0Var != null) {
            ((ba0) va0Var.Dg()).setYbContentDescription(ib0Var.a);
        }
        if (jb0Var != null) {
            String str = jb0Var.a;
            String str2 = jb0Var.b;
            if (evu0.J(str2)) {
                str2 = str;
            }
            ((ba0) va0Var.Dg()).showTopTrailing(str, str2);
        }
        ga0 ga0Var = kb0Var.c;
        ((ba0) va0Var.Dg()).setNfcCardScanIconVisible(ga0Var != null);
        if (ga0Var != null) {
            ((ba0) va0Var.Dg()).setNfcCardScanTooltipText(ga0Var.a, ga0Var.b);
        }
        wjh wjhVar = (wjh) va0Var.y;
        wjhVar.getClass();
        wjh.b.add(va0Var);
        wjhVar.a.getWindow().setFlags(8192, 8192);
        com.yandex.go.payments.cards.pci_dss.ui.b bVar = this.viewHolder;
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = bVar.i;
        AddCardPciDssViewHolder$AfterTextChangedWatcherAdapter addCardPciDssViewHolder$AfterTextChangedWatcherAdapter = bVar.m;
        CreditCardTextWatcher creditCardTextWatcher = bVar.l;
        com.yandex.go.payments.cards.pci_dss.ui.b.b(keyboardAwareRobotoEditText, addCardPciDssViewHolder$AfterTextChangedWatcherAdapter, creditCardTextWatcher);
        bVar.e.setDividerFocusedBottomSpace(0);
        keyboardAwareRobotoEditText.setFilters(new InputFilter[]{new DigitsKeyListener(), creditCardTextWatcher});
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText2 = bVar.k;
        AddCardPciDssViewHolder$AfterTextChangedWatcherAdapter addCardPciDssViewHolder$AfterTextChangedWatcherAdapter2 = bVar.p;
        ExpiryTextWatcher expiryTextWatcher = bVar.o;
        com.yandex.go.payments.cards.pci_dss.ui.b.b(keyboardAwareRobotoEditText2, addCardPciDssViewHolder$AfterTextChangedWatcherAdapter2, expiryTextWatcher);
        bVar.f.setDividerFocusedBottomSpace(0);
        keyboardAwareRobotoEditText2.setFilters(new InputFilter[]{new DateKeyListener(), expiryTextWatcher});
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText3 = bVar.j;
        com.yandex.go.payments.cards.pci_dss.ui.b.b(keyboardAwareRobotoEditText3, bVar.n, null);
        AnimatedListItemInputComponent animatedListItemInputComponent = bVar.g;
        animatedListItemInputComponent.setDividerFocusedBottomSpace(0);
        animatedListItemInputComponent.setFilters(new InputFilter[]{new DigitsKeyListener()});
        keyboardAwareRobotoEditText3.setTransformationMethod(new PasswordTransformationMethod());
        ra0 ra0Var = bVar.a;
        ra0Var.c(new ua0(bVar));
        ra0Var.n = ra0Var.j.b(new ddf(7, ra0Var));
        va0 va0Var2 = ra0Var.h;
        ((ba0) va0Var2.Dg()).updateCvnComment(ra0Var.o.a().b());
        ((ba0) va0Var2.Dg()).setCardScanButtonVisible(ra0Var.f.i());
        q0 q0Var = ra0Var.k;
        ka0 ka0Var = ((a90) ra0Var.g).a.a;
        zzs zzsVar = ka0Var.c;
        Integer num = ka0Var.b;
        String str3 = ka0Var.d;
        if (str3 == null) {
            str3 = ra0Var.i.a();
        }
        UserCardProfileParams userCardProfileParams = new UserCardProfileParams(zzsVar, num, str3);
        u uVar = q0Var.a;
        r0 r0Var = uVar.c;
        qk21 qk21Var = new qk21(userCardProfileParams, null);
        r0Var.getClass();
        r0Var.m(null, qk21Var);
        uVar.b(userCardProfileParams);
        q5t0 q5t0Var = this.softInputModeHolder;
        Activity activity = q5t0Var.a;
        q5t0Var.b = activity.getWindow().getAttributes().softInputMode;
        activity.getWindow().setSoftInputMode(2);
        this.cardNumberPadView.setConfirmButtonText(kyh0.credit_cards_add);
        this.cardNumberPadView.setOnConfirmClickedListener(new tf(i3, this));
        this.cardNumberPadView.setFocusedViewSupplier(new ob0(i, this));
        this.cardNumberPadView.showDecimalSeparator(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q5t0 q5t0Var = this.softInputModeHolder;
        if (q5t0Var.b != -1) {
            q5t0Var.a.getWindow().setSoftInputMode(q5t0Var.b);
        }
        this.cardNumberPadView.setOnConfirmClickedListener(null);
        this.cardNumberPadView.setFocusedViewSupplier(null);
        this.cardScan.setOnClickListener(null);
        this.presenter.Cg();
        com.yandex.go.payments.cards.pci_dss.ui.b bVar = this.viewHolder;
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = bVar.i;
        keyboardAwareRobotoEditText.setCustomSelectionActionModeCallback(null);
        keyboardAwareRobotoEditText.removeTextChangedListener(bVar.l);
        keyboardAwareRobotoEditText.removeTextChangedListener(bVar.m);
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText2 = bVar.j;
        keyboardAwareRobotoEditText2.setCustomSelectionActionModeCallback(null);
        keyboardAwareRobotoEditText2.setOnFocusChangeListener(null);
        keyboardAwareRobotoEditText2.setOnTouchListener(null);
        keyboardAwareRobotoEditText2.removeTextChangedListener(bVar.n);
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText3 = bVar.k;
        keyboardAwareRobotoEditText3.setCustomSelectionActionModeCallback(null);
        keyboardAwareRobotoEditText3.removeTextChangedListener(bVar.p);
        keyboardAwareRobotoEditText3.setOnTouchListener(null);
        bVar.a.d();
    }

    @Override // com.yandex.go.payments.cards.ui.AddCardView
    public void onDismiss() {
        ra0 ra0Var = this.viewHolder.a;
        ymu ymuVar = ra0Var.m;
        l8x l8xVar = (l8x) ymuVar.c;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        ymuVar.c = null;
        ra0Var.m = ra0.p;
        a90 a90Var = (a90) ra0Var.g;
        ((Runnable) a90Var.b.c).run();
        ((y80) a90Var.b.b).n(null);
    }

    @Override // com.yandex.go.payments.cards.ui.AddCardView
    public void pause() {
        this.presenter.pause();
    }

    @Override // com.yandex.go.payments.cards.ui.AddCardView
    public void resume() {
        this.presenter.resume();
        Activity activity = getActivity();
        if (activity != null) {
            onResume(activity);
        }
    }

    @Override // defpackage.ba0
    public void setCardImage(CardType cardType) {
        Drawable drawable;
        if (getLayoutDirection() == 0) {
            ImageView imageView = this.cardImage;
            bia0 bia0Var = this.resourceProvider;
            Context context = getContext();
            ((qy90) bia0Var).getClass();
            int i = py90.b[cardType.ordinal()];
            if (i != 18) {
                switch (i) {
                    case 1:
                        drawable = context.getDrawable(y2h0.ic_payment_amer_exp);
                        break;
                    case 2:
                        drawable = context.getDrawable(y2h0.ic_payment_diners);
                        break;
                    case 3:
                        drawable = context.getDrawable(y2h0.ic_payment_discover_network);
                        break;
                    case 4:
                        drawable = context.getDrawable(y2h0.ic_payment_jcb);
                        break;
                    case 5:
                        drawable = context.getDrawable(y2h0.ic_payment_mastercard);
                        break;
                    case 6:
                        drawable = context.getDrawable(y2h0.ic_payment_visa);
                        break;
                    case 7:
                        drawable = context.getDrawable(y2h0.ic_payment_maestro);
                        break;
                    case 8:
                        drawable = context.getDrawable(y2h0.ic_payment_mir);
                        break;
                    case 9:
                        drawable = context.getDrawable(y2h0.ic_payment_unionpay);
                        break;
                    case 10:
                        drawable = context.getDrawable(y2h0.ic_payment_dinacard);
                        break;
                    case 11:
                        drawable = context.getDrawable(y2h0.ic_payment_uzcard);
                        break;
                    case 12:
                        drawable = context.getDrawable(y2h0.ic_payment_humo);
                        break;
                    case 13:
                        drawable = context.getDrawable(y2h0.ic_payment_troy);
                        break;
                    case 14:
                        drawable = context.getDrawable(y2h0.ic_payment_elcart);
                        break;
                    case 15:
                        drawable = context.getDrawable(y2h0.ic_payment_belkart);
                        break;
                    default:
                        drawable = null;
                        break;
                }
            } else {
                drawable = context.getDrawable(y2h0.ic_payment_maal);
            }
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // defpackage.ba0
    public void setCardScanButtonVisible(boolean visible) {
        ImageView imageView = this.cardScan;
        if (!visible) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        ru.yandex.taxi.design.utils.c.z(new nb0(this, 1), this.cardScan);
    }

    @Override // defpackage.ba0
    public void setConfirmButtonEnabled(boolean enabled) {
        this.cardNumberPadView.setConfirmButtonEnabled(enabled);
    }

    @Override // defpackage.ba0
    public void setNfcCardScanIconVisible(boolean visible) {
        this.nfcCardScanIcon.setVisibility(visible ? 0 : 8);
    }

    @Override // defpackage.ba0
    public void setNfcCardScanTooltipText(String text, String accessibilityText) {
        Runnable runnable;
        if (text.length() > 0) {
            final int i = 0;
            runnable = new Runnable(this) { // from class: pb0
                public final /* synthetic */ AddCardViewImpl b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    AddCardViewImpl addCardViewImpl = this.b;
                    switch (i2) {
                        case 0:
                            AddCardViewImpl.setNfcCardScanTooltipText$lambda$0(addCardViewImpl);
                            break;
                        default:
                            addCardViewImpl.updateNfcScanCardTooltipTranslations();
                            break;
                    }
                }
            };
        } else {
            runnable = null;
        }
        ru.yandex.taxi.design.utils.c.B(this.nfcCardScanIcon, runnable);
        this.nfcCardScanIconBubble.setText(text);
        final int i2 = 1;
        Runnable runnable2 = new Runnable(this) { // from class: pb0
            public final /* synthetic */ AddCardViewImpl b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                AddCardViewImpl addCardViewImpl = this.b;
                switch (i22) {
                    case 0:
                        AddCardViewImpl.setNfcCardScanTooltipText$lambda$0(addCardViewImpl);
                        break;
                    default:
                        addCardViewImpl.updateNfcScanCardTooltipTranslations();
                        break;
                }
            }
        };
        Rect rect = xw31.a;
        if (!isLaidOut() || isLayoutRequested()) {
            xw31.c(this, runnable2);
        } else {
            runnable2.run();
        }
        androidx.core.view.b.p(this.nfcCardScanIcon, new yqb(accessibilityText, 4, this.cardScan));
    }

    @Override // defpackage.ba0
    public void setYbContentDescription(String contentDescription) {
        this.ybLogo.setContentDescription(contentDescription);
        if (contentDescription == null || contentDescription.length() == 0) {
            this.ybLogo.setImportantForAccessibility(0);
        } else {
            this.ybLogo.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.ba0
    public void setYbLogoVisibility(int visibility) {
        this.ybLogo.setVisibility(visibility);
    }

    @Override // defpackage.ba0
    public void showTopTrailing(String title, String contentDescription) {
        this.topTrailInfo.setVisibility(0);
        this.topTrailInfo.setText(title);
        this.topTrailInfo.setSingleLine(true);
        this.topTrailInfo.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        this.topTrailInfo.setContentDescription(contentDescription);
        this.topTrailInfo.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, tje.y(dzg0.chevron_next_text_size_caption, getContext()), (Drawable) null);
        ru.yandex.taxi.design.utils.c.z(new nb0(this, 0), this.topTrailInfo);
    }

    @Override // defpackage.ba0
    public void updateCardIconVisibility(boolean isPanLong) {
        if (this.isSystemTextScaleBig) {
            if (isPanLong && this.cardImage.getVisibility() == 0) {
                cma1.L(this.cardImage);
            } else {
                if (isPanLong || this.cardImage.getVisibility() == 0) {
                    return;
                }
                cma1.J(this.cardImage);
            }
        }
    }

    @Override // defpackage.ba0
    public void updateCvnComment(int cvnLength) {
        BubbleTextComponent bubbleTextComponent = this.bubbleCvnHelp;
        ((qy90) this.resourceProvider).getClass();
        bubbleTextComponent.setText(getContext().getString(cvnLength != 3 ? cvnLength != 4 ? kyh0.add_card_cvn_explain : kyh0.add_card_4dbc_explain : kyh0.add_card_cvn_explain));
    }
}
