package com.yandex.go.slot.ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.b;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.slot.api.ui.SlotItemUiState$Body$Alignment;
import com.yandex.go.slot.api.ui.SlotItemUiState$Body$Ellipsize;
import com.yandex.go.slot.api.ui.SlotItemUiState$Size;
import com.yandex.go.slot.api.ui.SlotItemUiState$Trail$AccordionChevron$ChevronState;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ass0;
import defpackage.ats0;
import defpackage.bdc;
import defpackage.bss0;
import defpackage.cma1;
import defpackage.css0;
import defpackage.dss0;
import defpackage.dzg0;
import defpackage.ess0;
import defpackage.fss0;
import defpackage.g18;
import defpackage.gdc;
import defpackage.gss0;
import defpackage.gtq0;
import defpackage.hg;
import defpackage.hpo0;
import defpackage.hss0;
import defpackage.i3y;
import defpackage.iss0;
import defpackage.jl40;
import defpackage.jss0;
import defpackage.k4o;
import defpackage.kdc;
import defpackage.kss0;
import defpackage.lss0;
import defpackage.mqg0;
import defpackage.mqs0;
import defpackage.mss0;
import defpackage.mxp0;
import defpackage.nac;
import defpackage.nqs0;
import defpackage.nss0;
import defpackage.oss0;
import defpackage.pav;
import defpackage.pfv;
import defpackage.ppr0;
import defpackage.pss0;
import defpackage.qje;
import defpackage.qke;
import defpackage.qss0;
import defpackage.quq0;
import defpackage.rqs0;
import defpackage.rss0;
import defpackage.s8o;
import defpackage.sss0;
import defpackage.tje;
import defpackage.tqs0;
import defpackage.tss0;
import defpackage.u8b1;
import defpackage.uss0;
import defpackage.vss0;
import defpackage.w511;
import defpackage.wh;
import defpackage.xlp0;
import defpackage.xng0;
import defpackage.xrs0;
import defpackage.xss0;
import defpackage.yrs0;
import defpackage.yss0;
import defpackage.z3h0;
import defpackage.z750;
import defpackage.zrs0;
import defpackage.zss0;
import defpackage.zy11;
import java.lang.ref.WeakReference;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.JCP;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.SwitchComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;

@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0090\u0001\u0091\u0001B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00132\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u00132\u0006\u0010,\u001a\u00020+2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00132\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b3\u0010$J\u000f\u00104\u001a\u00020\u0000H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u0007H\u0014¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0013H\u0014¢\u0006\u0004\b9\u0010&J\u0017\u0010<\u001a\u00020\u00132\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u0013¢\u0006\u0004\b>\u0010&J\u0017\u0010?\u001a\u00020\u00072\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0013H\u0002¢\u0006\u0004\bA\u0010&J%\u0010C\u001a\u00020\u0013*\u00020B2\u0006\u0010,\u001a\u00020+2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\bC\u0010DJ%\u0010E\u001a\u00020\u0013*\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020BH\u0002¢\u0006\u0004\bG\u0010HJ\u001f\u0010M\u001a\u00020L2\u0006\u0010\u001f\u001a\u00020I2\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020LH\u0002¢\u0006\u0004\bO\u0010PJ\u0019\u0010Q\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0013H\u0002¢\u0006\u0004\bS\u0010&J\u000f\u0010T\u001a\u00020\u0013H\u0002¢\u0006\u0004\bT\u0010&J\u0017\u0010V\u001a\u00020U2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\bV\u0010WJ\u000f\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u0013H\u0002¢\u0006\u0004\b[\u0010&J%\u0010\\\u001a\u00020\u0013*\u00020B2\u0006\u0010,\u001a\u00020+2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\\\u0010DJ\u001b\u0010_\u001a\u00020\u0013*\u00020\u00012\u0006\u0010^\u001a\u00020]H\u0002¢\u0006\u0004\b_\u0010`J\u0013\u0010b\u001a\u00020\u0007*\u00020aH\u0002¢\u0006\u0004\bb\u0010cJ\u0013\u0010e\u001a\u00020\u0007*\u00020dH\u0002¢\u0006\u0004\be\u0010fJ\u000f\u0010h\u001a\u00020gH\u0002¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020gH\u0002¢\u0006\u0004\bj\u0010iJ\u001f\u0010m\u001a\u00020g2\u0006\u0010k\u001a\u00020\u00072\u0006\u0010l\u001a\u00020\u0007H\u0002¢\u0006\u0004\bm\u0010nJ\u001f\u0010o\u001a\u00020g2\u0006\u0010k\u001a\u00020\u00072\u0006\u0010l\u001a\u00020\u0007H\u0002¢\u0006\u0004\bo\u0010nR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010pR\u0018\u0010r\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u001e\u0010u\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u001e\u0010w\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010vR\u0016\u0010y\u001a\u00020x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010{\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010}\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u0019\u0010\u007f\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0081\u0001\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010~R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001a\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001b\u0010\u0087\u0001\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001b\u0010\u0089\u0001\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R \u0010\u008f\u0001\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001¨\u0006\u0092\u0001"}, d2 = {"Lcom/yandex/go/slot/ui/view/SlotItemViewComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Lyss0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILpav;)V", "Lxss0;", "uiState", "", "isLoading", "Lrqs0;", "actionEvent", "Lzy11;", "render", "(Lxss0;ZLrqs0;)V", "Lgss0;", "lead", "renderLead", "(Lgss0;)V", "Lcss0;", "body", "renderBody", "(Lcss0;)V", "Ltss0;", "trail", "renderTrail", "(Ltss0;Lrqs0;)V", "isChecked", "setSwitchTrailChecked", "(Z)V", "toggleSwitchTrail", "()V", "Lkdc;", "color", "setColor", "(Lkdc;)V", "Lnqs0;", "action", "setAction", "(Lnqs0;Lrqs0;)V", "Lcom/yandex/go/slot/api/ui/SlotItemUiState$Size;", "size", "setSize", "(Lcom/yandex/go/slot/api/ui/SlotItemUiState$Size;)V", "renderLoading", "asView", "()Lcom/yandex/go/slot/ui/view/SlotItemViewComponent;", "measuredHeight", "determineItemHeight", "(I)I", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "compensateLeadFramePadding", "getHeight", "(Lcom/yandex/go/slot/api/ui/SlotItemUiState$Size;)I", "applyAccessibilityDelegate", "Landroid/view/View;", "setActionInternal", "(Landroid/view/View;Lnqs0;Lrqs0;)V", "renderTrailInternal", "(Lru/yandex/taxi/design/ListItemComponent;Ltss0;Lrqs0;)V", "getLoadingTrailView", "()Landroid/view/View;", "Loss0;", "Landroid/graphics/drawable/Drawable;", "backgroundDrawable", "Lcom/yandex/go/design/view/GoImageView;", "getNewTrailIconSpot", "(Loss0;Landroid/graphics/drawable/Drawable;)Lcom/yandex/go/design/view/GoImageView;", "getNewTrailIcon", "()Lcom/yandex/go/design/view/GoImageView;", "onChangeAccordionState", "(Lrqs0;)V", "changeAccordionState", "rotateAccordionChevron", "Landroid/widget/ImageView;", "newAccordionChevronIcon", "(Lkdc;)Landroid/widget/ImageView;", "Landroid/animation/ValueAnimator;", "getChevronAnimator", "()Landroid/animation/ValueAnimator;", "ensureTrailLoading", "setTrailAction", "Lbss0;", "column", "setupTextColumn", "(Lru/yandex/taxi/design/ListItemComponent;Lbss0;)V", "Lcom/yandex/go/slot/api/ui/SlotItemUiState$Body$Alignment;", "toTextAlignment", "(Lcom/yandex/go/slot/api/ui/SlotItemUiState$Body$Alignment;)I", "Lcom/yandex/go/slot/api/ui/SlotItemUiState$Body$Ellipsize;", "toEllipsizeMode", "(Lcom/yandex/go/slot/api/ui/SlotItemUiState$Body$Ellipsize;)I", "Landroid/view/ViewGroup$MarginLayoutParams;", "createAccordionChevronLayoutParams", "()Landroid/view/ViewGroup$MarginLayoutParams;", "createButtonOrSwitchTrailLayoutParams", "width", "height", "createIconSpotTrailLayoutParams", "(II)Landroid/view/ViewGroup$MarginLayoutParams;", "createTrailLayoutParams", "Lpav;", "Lg18;", "imageLoadRequest", "Lg18;", "Ljava/lang/ref/WeakReference;", "currentLeadDrawable", "Ljava/lang/ref/WeakReference;", "currentTrailDrawable", "Lcom/yandex/go/slot/ui/view/SlotItemViewComponent$BodyMode;", "bodyMode", "Lcom/yandex/go/slot/ui/view/SlotItemViewComponent$BodyMode;", "lastTrail", "Ltss0;", "currentAction", "Lnqs0;", "currentActionEvent", "Lrqs0;", "currentTrailAction", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lkdc;", "Lcom/yandex/go/slot/api/ui/SlotItemUiState$Trail$AccordionChevron$ChevronState;", "accordionChevronState", "Lcom/yandex/go/slot/api/ui/SlotItemUiState$Trail$AccordionChevron$ChevronState;", "accordionChevronImageView", "Landroid/widget/ImageView;", "accordionChevronAnimator", "Landroid/animation/ValueAnimator;", "transparentAttr$delegate", "Li3y;", "getTransparentAttr", "()Lkdc;", "transparentAttr", "a", "BodyMode", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SlotItemViewComponent extends ListItemComponent implements yss0 {
    private ValueAnimator accordionChevronAnimator;
    private ImageView accordionChevronImageView;
    private SlotItemUiState$Trail$AccordionChevron$ChevronState accordionChevronState;
    private kdc backgroundColor;
    private BodyMode bodyMode;
    private nqs0 currentAction;
    private rqs0 currentActionEvent;
    private WeakReference<Drawable> currentLeadDrawable;
    private nqs0 currentTrailAction;
    private WeakReference<Drawable> currentTrailDrawable;
    private g18 imageLoadRequest;
    private final pav imageLoader;
    private tss0 lastTrail;

    /* renamed from: transparentAttr$delegate, reason: from kotlin metadata */
    private final i3y transparentAttr;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/slot/ui/view/SlotItemViewComponent$BodyMode;", "", JCP.RAW_PREFIX, "SINGLE_COLUMN", "DOUBLE_COLUMN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class BodyMode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ BodyMode[] $VALUES;
        public static final BodyMode DOUBLE_COLUMN;
        public static final BodyMode NONE;
        public static final BodyMode SINGLE_COLUMN;

        static {
            BodyMode bodyMode = new BodyMode(JCP.RAW_PREFIX, 0);
            NONE = bodyMode;
            BodyMode bodyMode2 = new BodyMode("SINGLE_COLUMN", 1);
            SINGLE_COLUMN = bodyMode2;
            BodyMode bodyMode3 = new BodyMode("DOUBLE_COLUMN", 2);
            DOUBLE_COLUMN = bodyMode3;
            BodyMode[] bodyModeArr = {bodyMode, bodyMode2, bodyMode3};
            $VALUES = bodyModeArr;
            $ENTRIES = kotlin.enums.a.a(bodyModeArr);
        }

        public static BodyMode valueOf(String str) {
            return (BodyMode) Enum.valueOf(BodyMode.class, str);
        }

        public static BodyMode[] values() {
            return (BodyMode[]) $VALUES.clone();
        }
    }

    public static final class a extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
            super.onInitializeAccessibilityNodeInfo(view, whVar);
            whVar.v(true);
        }
    }

    public SlotItemViewComponent(Context context, AttributeSet attributeSet, int i, pav pavVar) {
        super(context, attributeSet, i);
        this.imageLoader = pavVar;
        this.imageLoadRequest = g18.u1;
        this.bodyMode = BodyMode.NONE;
        this.lastTrail = rss0.a;
        this.currentAction = new mqs0();
        this.currentTrailAction = new mqs0();
        this.accordionChevronState = SlotItemUiState$Trail$AccordionChevron$ChevronState.DOWN;
        this.transparentAttr = kotlin.a.b(LazyThreadSafetyMode.NONE, new tqs0(18));
        setUseAutoAccessibilityDelegate(false);
        title().setIncludeFontPadding(false);
        subtitle().setIncludeFontPadding(false);
        b.p(this, new a());
    }

    private final void applyAccessibilityDelegate() {
        boolean z = this.currentAction instanceof mqs0;
        boolean z2 = this.currentTrailAction instanceof mqs0;
        SwitchComponent switchComponent = (SwitchComponent) getTrailViewAs(SwitchComponent.class);
        if (!z && z2 && switchComponent != null) {
            b.p(this, switchComponent.getDefaultAccessibilityDelegate());
            switchComponent.setImportantForAccessibility(2);
        } else if (z || !z2) {
            b.p(this, null);
        } else {
            hg.a(this);
        }
    }

    private final void changeAccordionState() {
        SlotItemUiState$Trail$AccordionChevron$ChevronState slotItemUiState$Trail$AccordionChevron$ChevronState;
        int i = ats0.b[this.accordionChevronState.ordinal()];
        if (i == 1) {
            slotItemUiState$Trail$AccordionChevron$ChevronState = SlotItemUiState$Trail$AccordionChevron$ChevronState.DOWN;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            slotItemUiState$Trail$AccordionChevron$ChevronState = SlotItemUiState$Trail$AccordionChevron$ChevronState.UP;
        }
        this.accordionChevronState = slotItemUiState$Trail$AccordionChevron$ChevronState;
    }

    private final ViewGroup.MarginLayoutParams createAccordionChevronLayoutParams() {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(tje.u(24, getContext()), tje.u(24, getContext()));
        marginLayoutParams.setMarginEnd(tje.u(8, getContext()));
        return marginLayoutParams;
    }

    private final ViewGroup.MarginLayoutParams createButtonOrSwitchTrailLayoutParams() {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, tje.u(32, getContext()));
        marginLayoutParams.setMargins(tje.u(8, getContext()), tje.u(12, getContext()), tje.u(16, getContext()), tje.u(12, getContext()));
        return marginLayoutParams;
    }

    private final ViewGroup.MarginLayoutParams createIconSpotTrailLayoutParams(int width, int height) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(width, height);
        marginLayoutParams.setMargins(tje.u(8, getContext()), tje.u(8, getContext()), tje.u(16, getContext()), tje.u(8, getContext()));
        return marginLayoutParams;
    }

    private final ViewGroup.MarginLayoutParams createTrailLayoutParams(int width, int height) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(width, height);
        marginLayoutParams.setMargins(tje.u(16, getContext()), tje.u(16, getContext()), tje.u(16, getContext()), tje.u(16, getContext()));
        return marginLayoutParams;
    }

    private final void ensureTrailLoading() {
        View trailViewAs = getTrailViewAs(View.class);
        if (trailViewAs != null) {
            trailViewAs.setEnabled(isEnabled() && !(this.currentTrailAction instanceof mqs0));
        }
    }

    private final ValueAnimator getChevronAnimator() {
        ValueAnimator ofFloat;
        int i = ats0.b[this.accordionChevronState.ordinal()];
        if (i == 1) {
            ofFloat = ValueAnimator.ofFloat(0.0f, -180.0f);
            ofFloat.setDuration(800L);
            ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            ofFloat = ValueAnimator.ofFloat(-180.0f, 0.0f);
            ofFloat.setDuration(500L);
            ofFloat.setInterpolator(new OvershootInterpolator(0.5f));
        }
        ofFloat.addUpdateListener(new mxp0(15, this));
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getChevronAnimator$lambda$2(SlotItemViewComponent slotItemViewComponent, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ImageView imageView = slotItemViewComponent.accordionChevronImageView;
        if (imageView != null) {
            imageView.setRotation(floatValue);
        }
    }

    private final int getHeight(SlotItemUiState$Size size) {
        int i = ats0.a[size.ordinal()];
        if (i == 1) {
            return tje.u(32, getContext());
        }
        if (i == 2) {
            return tje.u(40, getContext());
        }
        if (i == 3) {
            return tje.u(48, getContext());
        }
        if (i == 4) {
            return tje.u(56, getContext());
        }
        w511.b();
        return 0;
    }

    private final View getLoadingTrailView() {
        Drawable y = tje.y(z3h0.ic_slot_trail_loading_rounded, getContext());
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        GoImageView goImageView = new GoImageView(getContext(), null, 0, 6, null);
        goImageView.setLayoutParams(createTrailLayoutParams(-2, -2));
        ShimmeringFrameLayout shimmeringFrameLayout = new ShimmeringFrameLayout(getContext(), null, 0, 6, null);
        shimmeringFrameLayout.setLayoutParams(createTrailLayoutParams(tje.u(24, shimmeringFrameLayout.getContext()), tje.u(24, shimmeringFrameLayout.getContext())));
        shimmeringFrameLayout.setCenterColor(qje.t(xng0.bgMain, shimmeringFrameLayout.getContext()));
        goImageView.setImageDrawable(y);
        frameLayout.addView(goImageView);
        frameLayout.addView(shimmeringFrameLayout);
        shimmeringFrameLayout.setShimmering(true);
        return frameLayout;
    }

    private final GoImageView getNewTrailIcon() {
        GoImageView goImageView = new GoImageView(getContext(), null, 0, 6, null);
        goImageView.setLayoutParams(new FrameLayout.LayoutParams(tje.u(56, goImageView.getContext()), tje.u(56, goImageView.getContext())));
        goImageView.setPadding(tje.u(16, goImageView.getContext()), tje.u(16, goImageView.getContext()), tje.u(16, goImageView.getContext()), tje.u(16, goImageView.getContext()));
        return goImageView;
    }

    private final GoImageView getNewTrailIconSpot(oss0 trail, Drawable backgroundDrawable) {
        GoImageView goImageView = new GoImageView(getContext(), null, 0, 6, null);
        goImageView.setLayoutParams(createIconSpotTrailLayoutParams(trail.b, trail.c));
        goImageView.setPadding(tje.u(8, goImageView.getContext()), tje.u(8, goImageView.getContext()), tje.u(8, goImageView.getContext()), tje.u(8, goImageView.getContext()));
        goImageView.setImageDrawable(trail.a);
        goImageView.setBackground(backgroundDrawable);
        return goImageView;
    }

    private final kdc getTransparentAttr() {
        return (kdc) this.transparentAttr.getValue();
    }

    private final ImageView newAccordionChevronIcon(kdc color) {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(createAccordionChevronLayoutParams());
        imageView.setImageBitmap(u8b1.h(dzg0.chevron_round_down, imageView.getContext()));
        imageView.setImageTintList(ColorStateList.valueOf(s8o.m(color, imageView.getContext())));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        if (this.accordionChevronState == SlotItemUiState$Trail$AccordionChevron$ChevronState.UP) {
            imageView.setRotation(-180.0f);
        }
        return imageView;
    }

    private final void onChangeAccordionState(rqs0 actionEvent) {
        ValueAnimator valueAnimator = this.accordionChevronAnimator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            changeAccordionState();
            if (actionEvent != null) {
                actionEvent.a(new mqs0(), new uss0(this.accordionChevronState));
            }
            rotateAccordionChevron();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderLead$lambda$0(SlotItemViewComponent slotItemViewComponent, gss0 gss0Var) {
        slotItemViewComponent.setLeadImage(((dss0) gss0Var).d);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderLead$lambda$1(SlotItemViewComponent slotItemViewComponent, Drawable drawable) {
        slotItemViewComponent.getLeadImageView().setAlpha(0.0f);
        cma1.J(slotItemViewComponent.getLeadImageView());
        return zy11.a;
    }

    private final void renderTrailInternal(ListItemComponent listItemComponent, tss0 tss0Var, rqs0 rqs0Var) {
        GoImageView goImageView;
        View newTrailIconSpot;
        int t;
        if (tss0Var instanceof rss0) {
            listItemComponent.clearTrailView();
            listItemComponent.setTrailMode(0);
            listItemComponent.setTrailVisibility(8);
        } else if (tss0Var instanceof pss0) {
            listItemComponent.clearTrailView();
            View loadingTrailView = getLoadingTrailView();
            listItemComponent.setTrailVisibility(0);
            listItemComponent.setTrailView(loadingTrailView);
        } else if (tss0Var instanceof qss0) {
            listItemComponent.clearTrailView();
            listItemComponent.setTrailVisibility(0);
            listItemComponent.setTrailMode(2);
            z750 navigationIconParams = listItemComponent.getNavigationIconParams();
            navigationIconParams.b = ((qss0) tss0Var).a;
            navigationIconParams.a();
        } else if (tss0Var instanceof hss0) {
            listItemComponent.clearTrailView();
            listItemComponent.setTrailVisibility(0);
            hss0 hss0Var = (hss0) tss0Var;
            this.accordionChevronState = hss0Var.b;
            ImageView newAccordionChevronIcon = newAccordionChevronIcon(hss0Var.a);
            this.accordionChevronImageView = newAccordionChevronIcon;
            listItemComponent.setTrailView(newAccordionChevronIcon);
            listItemComponent.setDebounceClickListener(new hpo0(3, this, rqs0Var, listItemComponent));
        } else if (tss0Var instanceof sss0) {
            listItemComponent.setTrailVisibility(0);
            SwitchComponent switchComponent = (SwitchComponent) listItemComponent.getTrailViewAs(SwitchComponent.class);
            if (switchComponent == null) {
                SwitchComponent switchComponent2 = new SwitchComponent(listItemComponent.getContext(), null, 0, 6, null);
                switchComponent2.setLayoutParams(createButtonOrSwitchTrailLayoutParams());
                switchComponent2.setEnabled(true);
                switchComponent2.setHapticEnabled(true);
                switchComponent = switchComponent2;
            }
            sss0 sss0Var = (sss0) tss0Var;
            switchComponent.setChecked(sss0Var.a);
            if (sss0Var.b) {
                listItemComponent.setDebounceClickListener(new zss0(switchComponent, listItemComponent));
            }
            listItemComponent.setTrailVerticalGravity(0);
            listItemComponent.setTrailView(switchComponent);
        } else if (tss0Var instanceof mss0) {
            listItemComponent.setTrailVisibility(0);
            ButtonComponent buttonComponent = (ButtonComponent) listItemComponent.getTrailViewAs(ButtonComponent.class);
            if (buttonComponent == null) {
                ButtonComponent buttonComponent2 = new ButtonComponent(listItemComponent.getContext(), null, 0, 6, null);
                buttonComponent2.setLayoutParams(createButtonOrSwitchTrailLayoutParams());
                buttonComponent2.setButtonSize(0);
                buttonComponent = buttonComponent2;
            }
            mss0 mss0Var = (mss0) tss0Var;
            lss0 lss0Var = mss0Var.b;
            buttonComponent.setText(mss0Var.a);
            boolean l = jl40.l(lss0Var, jss0.a);
            kss0 kss0Var = kss0.a;
            if (l) {
                t = qje.t(xng0.controlMinor, buttonComponent.getContext());
            } else if (jl40.l(lss0Var, kss0Var)) {
                t = qje.t(xng0.bgMain, buttonComponent.getContext());
            } else {
                if (!jl40.l(lss0Var, iss0.a)) {
                    w511.b();
                    return;
                }
                t = qje.t(xng0.controlMain, buttonComponent.getContext());
            }
            buttonComponent.setButtonBackground(t);
            if (jl40.l(lss0Var, kss0Var)) {
                buttonComponent.setOutline(tje.v(buttonComponent.getContext(), 0.5f), new bdc(xng0.line));
            } else {
                buttonComponent.setOutline(0, new bdc(xng0.bgTransparent));
            }
            setTrailAction(buttonComponent, mss0Var.c, rqs0Var);
            if (this.currentTrailAction instanceof mqs0) {
                buttonComponent.setRippleColor(new gdc(mqg0.transparent));
            } else {
                buttonComponent.setRippleColor(t);
            }
            listItemComponent.setTrailVerticalGravity(0);
            listItemComponent.setTrailView(buttonComponent);
        } else if (tss0Var instanceof oss0) {
            WeakReference<Drawable> weakReference = this.currentTrailDrawable;
            Drawable drawable = weakReference != null ? weakReference.get() : null;
            oss0 oss0Var = (oss0) tss0Var;
            Drawable drawable2 = oss0Var.a;
            if (jl40.l(drawable, drawable2) && (this.lastTrail instanceof oss0)) {
                return;
            }
            Drawable l2 = c.l(dzg0.oval_shape, listItemComponent);
            l2.mutate();
            l2.setTint(s8o.m(oss0Var.d, listItemComponent.getContext()));
            if (this.lastTrail instanceof oss0) {
                GoImageView goImageView2 = (GoImageView) listItemComponent.getTrailViewAs(GoImageView.class);
                if (goImageView2 != null) {
                    goImageView2.setImageDrawable(drawable2);
                    goImageView2.setBackground(l2);
                    newTrailIconSpot = goImageView2;
                } else {
                    newTrailIconSpot = getNewTrailIconSpot(oss0Var, l2);
                }
            } else {
                newTrailIconSpot = getNewTrailIconSpot(oss0Var, l2);
            }
            listItemComponent.setTrailVisibility(0);
            listItemComponent.setTrailView(newTrailIconSpot);
            this.currentTrailDrawable = new WeakReference<>(drawable2);
        } else {
            if (!(tss0Var instanceof nss0)) {
                w511.b();
                return;
            }
            if (this.lastTrail instanceof nss0) {
                goImageView = (GoImageView) listItemComponent.getTrailViewAs(GoImageView.class);
                if (goImageView == null) {
                    goImageView = getNewTrailIcon();
                }
            } else {
                goImageView = getNewTrailIcon();
            }
            nss0 nss0Var = (nss0) tss0Var;
            Drawable drawable3 = nss0Var.a;
            goImageView.setImageDrawable(drawable3);
            listItemComponent.setTrailVisibility(0);
            nqs0 nqs0Var = nss0Var.c;
            if (nqs0Var instanceof mqs0) {
                goImageView.setOnClickListener(null);
                goImageView.setImportantForAccessibility(2);
            } else {
                c.z(new xlp0(7, rqs0Var, nqs0Var, listItemComponent), goImageView);
                goImageView.setContentDescription(nss0Var.b);
                goImageView.setImportantForAccessibility(1);
                goImageView.setEnabled(true);
            }
            listItemComponent.setTrailView(goImageView);
            this.currentTrailAction = nqs0Var;
            this.currentTrailDrawable = new WeakReference<>(drawable3);
        }
        if (!(tss0Var instanceof oss0) && !(tss0Var instanceof nss0)) {
            this.currentTrailDrawable = null;
        }
        this.lastTrail = tss0Var;
        this.currentActionEvent = rqs0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderTrailInternal$lambda$0(SlotItemViewComponent slotItemViewComponent, rqs0 rqs0Var, ListItemComponent listItemComponent) {
        slotItemViewComponent.onChangeAccordionState(rqs0Var);
        qke.E(listItemComponent.getContext(), HapticController$Effect.CLICK_MEDIUM, false, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderTrailInternal$lambda$2(SwitchComponent switchComponent, ListItemComponent listItemComponent) {
        switchComponent.toggleWithAnimation();
        qke.E(listItemComponent.getContext(), HapticController$Effect.CLICK_MEDIUM, false, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderTrailInternal$lambda$7(rqs0 rqs0Var, nqs0 nqs0Var, ListItemComponent listItemComponent) {
        if (rqs0Var != null) {
            rqs0Var.a(nqs0Var, vss0.a);
        }
        qke.E(listItemComponent.getContext(), HapticController$Effect.CLICK_MEDIUM, false, 8);
        return zy11.a;
    }

    private final void rotateAccordionChevron() {
        ValueAnimator chevronAnimator = getChevronAnimator();
        this.accordionChevronAnimator = chevronAnimator;
        if (chevronAnimator != null) {
            chevronAnimator.start();
        }
    }

    private final void setActionInternal(View view, nqs0 nqs0Var, rqs0 rqs0Var) {
        boolean z = nqs0Var instanceof mqs0;
        boolean z2 = !z;
        if (z) {
            view.setOnClickListener(null);
        } else {
            c.z(new xlp0(6, rqs0Var, nqs0Var, view), view);
        }
        view.setEnabled(z2);
        this.currentActionEvent = rqs0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setActionInternal$lambda$0(rqs0 rqs0Var, nqs0 nqs0Var, View view) {
        if (rqs0Var != null) {
            rqs0Var.a(nqs0Var, vss0.a);
        }
        qke.E(view.getContext(), HapticController$Effect.CLICK_MEDIUM, false, 8);
        return zy11.a;
    }

    private final void setTrailAction(View view, nqs0 nqs0Var, rqs0 rqs0Var) {
        setActionInternal(view, nqs0Var, rqs0Var);
        this.currentTrailAction = nqs0Var;
        applyAccessibilityDelegate();
    }

    private final void setupTextColumn(ListItemComponent listItemComponent, bss0 bss0Var) {
        ass0 ass0Var = bss0Var.g;
        listItemComponent.setTitleAlignment(toTextAlignment(ass0Var.a));
        listItemComponent.setTitleMaxLines(ass0Var.b);
        SlotItemUiState$Body$Ellipsize slotItemUiState$Body$Ellipsize = ass0Var.d;
        SlotItemUiState$Body$Ellipsize slotItemUiState$Body$Ellipsize2 = SlotItemUiState$Body$Ellipsize.MIDDLE;
        if (slotItemUiState$Body$Ellipsize == slotItemUiState$Body$Ellipsize2) {
            listItemComponent.ellipsizeTitleMiddle(true);
        } else {
            listItemComponent.setTitleEllipsizeMode(toEllipsizeMode(slotItemUiState$Body$Ellipsize));
            listItemComponent.ellipsizeTitleMiddle(false);
        }
        listItemComponent.setTitleTextColor(bss0Var.b);
        Integer num = bss0Var.c;
        if (num != null) {
            listItemComponent.setTitleTextSizePx(num.intValue());
        }
        listItemComponent.setTitle(bss0Var.a);
        listItemComponent.setSubtitleAlignment(toTextAlignment(ass0Var.a));
        listItemComponent.setSubtitleMaxLines(ass0Var.c);
        SlotItemUiState$Body$Ellipsize slotItemUiState$Body$Ellipsize3 = ass0Var.e;
        if (slotItemUiState$Body$Ellipsize3 == slotItemUiState$Body$Ellipsize2) {
            listItemComponent.ellipsizeSubtitleMiddle(true);
        } else {
            listItemComponent.setSubTitleEllipsizeMode(toEllipsizeMode(slotItemUiState$Body$Ellipsize3));
            listItemComponent.ellipsizeSubtitleMiddle(false);
        }
        listItemComponent.setSubtitleTextColor(bss0Var.e);
        Integer num2 = bss0Var.f;
        if (num2 != null) {
            listItemComponent.setSubtitleTextSizePx(num2.intValue());
        }
        listItemComponent.setSubtitle(bss0Var.d);
    }

    private final int toEllipsizeMode(SlotItemUiState$Body$Ellipsize slotItemUiState$Body$Ellipsize) {
        int i = ats0.d[slotItemUiState$Body$Ellipsize.ordinal()];
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 0;
        }
        w511.b();
        return 0;
    }

    private final int toTextAlignment(SlotItemUiState$Body$Alignment slotItemUiState$Body$Alignment) {
        int i = ats0.c[slotItemUiState$Body$Alignment.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        w511.b();
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bdc transparentAttr_delegate$lambda$0() {
        return new bdc(xng0.bgTransparent);
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, ru.yandex.taxi.design.DividerAwareComponent, com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        kdc kdcVar = this.backgroundColor;
        if (kdcVar != null) {
            setColor(kdcVar);
        }
    }

    public final void compensateLeadFramePadding() {
        this.leadFrame.setPaddingRelative(tje.u(12, getContext()), 0, 0, 0);
    }

    @Override // ru.yandex.taxi.design.ListItemComponent
    public int determineItemHeight(int measuredHeight) {
        return Math.min(measuredHeight, getMinimumHeight());
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        g18 g18Var = this.imageLoadRequest;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.imageLoadRequest = null;
        WeakReference<Drawable> weakReference = this.currentLeadDrawable;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.currentAction = new mqs0();
        this.currentActionEvent = null;
        this.lastTrail = rss0.a;
        super.onDetachedFromWindow();
    }

    @Override // defpackage.yss0
    public void render(xss0 uiState, boolean isLoading, rqs0 actionEvent) {
        renderLead(uiState.a);
        renderBody(uiState.b);
        renderTrail(uiState.c, actionEvent);
        nqs0 nqs0Var = uiState.d;
        setAction(nqs0Var, actionEvent);
        setSize(uiState.e);
        renderLoading(isLoading);
        this.currentActionEvent = actionEvent;
        this.currentAction = nqs0Var;
        invalidateComponent();
    }

    @Override // defpackage.yss0
    public void renderBody(css0 body) {
        if (jl40.l(body, yrs0.a)) {
            setTitle((CharSequence) null);
            setSubtitle((CharSequence) null);
            this.bodyMode = BodyMode.NONE;
            return;
        }
        boolean z = body instanceof zrs0;
        rss0 rss0Var = rss0.a;
        if (z) {
            setTrailCompanionText((CharSequence) null);
            setTrailCompanionSubtext(null);
            if (this.bodyMode == BodyMode.DOUBLE_COLUMN) {
                clearTrailView();
            }
            if (!jl40.l(this.lastTrail, rss0Var)) {
                renderTrailInternal(this, this.lastTrail, this.currentActionEvent);
            }
            setupTextColumn(this, ((zrs0) body).a);
            this.bodyMode = BodyMode.SINGLE_COLUMN;
            return;
        }
        if (!(body instanceof xrs0)) {
            w511.b();
            return;
        }
        ListItemComponent listItemComponent = (ListItemComponent) getTrailViewAs(ListItemComponent.class);
        if (listItemComponent == null) {
            ListItemComponent listItemComponent2 = new ListItemComponent(getContext(), null, 0, 6, null);
            listItemComponent2.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            listItemComponent = listItemComponent2;
        }
        xrs0 xrs0Var = (xrs0) body;
        setupTextColumn(listItemComponent, xrs0Var.b);
        setTrailVisibility(0);
        setTrailView(listItemComponent);
        if (!jl40.l(this.lastTrail, rss0Var)) {
            renderTrailInternal(listItemComponent, this.lastTrail, this.currentActionEvent);
        }
        setupTextColumn(this, xrs0Var.a);
        this.bodyMode = BodyMode.DOUBLE_COLUMN;
    }

    @Override // defpackage.yss0
    public void renderLead(gss0 lead) {
        if (lead instanceof ess0) {
            clearLeadView();
            return;
        }
        if (lead instanceof fss0) {
            WeakReference<Drawable> weakReference = this.currentLeadDrawable;
            Drawable drawable = weakReference != null ? weakReference.get() : null;
            fss0 fss0Var = (fss0) lead;
            Drawable drawable2 = fss0Var.a;
            if (jl40.l(drawable, drawable2)) {
                return;
            }
            if (fss0Var.b) {
                getLeadImageView().setAlpha(0.0f);
                setLeadImage(drawable2);
                cma1.J(getLeadImageView());
            } else {
                getLeadImageView().setAlpha(1.0f);
                setLeadImage(drawable2);
            }
            this.currentLeadDrawable = new WeakReference<>(drawable2);
            return;
        }
        if (!(lead instanceof dss0)) {
            w511.b();
            return;
        }
        dss0 dss0Var = (dss0) lead;
        setLeadImage(dss0Var.d);
        g18 g18Var = this.imageLoadRequest;
        if (g18Var != null) {
            g18Var.cancel();
        }
        nac nacVar = (nac) this.imageLoader.a(getLeadImageView());
        nacVar.f(dss0Var.b, dss0Var.c);
        nacVar.g(pfv.a);
        nacVar.i = new ppr0(16, this, lead);
        nacVar.h = new quq0(17, this);
        this.imageLoadRequest = nacVar.c(dss0Var.a);
    }

    @Override // defpackage.yss0
    public void renderLoading(boolean isLoading) {
        setEnabled(!isLoading);
        ensureTrailLoading();
        if (isLoading) {
            startProgressAnimation();
        } else {
            stopProgressAnimation();
        }
    }

    @Override // defpackage.yss0
    public void renderTrail(tss0 trail, rqs0 actionEvent) {
        ListItemComponent listItemComponent = this.bodyMode == BodyMode.SINGLE_COLUMN ? this : (ListItemComponent) getTrailViewAs(ListItemComponent.class);
        if (listItemComponent != null) {
            renderTrailInternal(listItemComponent, trail, actionEvent);
        }
        this.lastTrail = trail;
        this.currentActionEvent = actionEvent;
        this.currentTrailAction = trail instanceof mss0 ? ((mss0) trail).c : trail instanceof nss0 ? ((nss0) trail).c : new mqs0();
    }

    @Override // defpackage.yss0
    public void setAction(nqs0 action, rqs0 actionEvent) {
        setActionInternal(this, action, actionEvent);
        this.currentAction = action;
        applyAccessibilityDelegate();
    }

    @Override // defpackage.yss0
    public void setColor(kdc color) {
        if (this.lastTrail instanceof qss0) {
            setBackgroundDrawable(new RippleDrawable(gtq0.e(qje.t(xng0.bgMinor, getContext())), new ColorDrawable(jl40.l(color, getTransparentAttr()) ? qje.t(xng0.bgMain, getContext()) : s8o.m(color, getContext())), null));
        } else {
            setBackgroundColor(color);
        }
        this.backgroundColor = color;
    }

    @Override // defpackage.yss0
    public void setSize(SlotItemUiState$Size size) {
        setMinHeight(getHeight(size));
        setVerticalPadding(0);
    }

    @Override // defpackage.yss0
    public void setSwitchTrailChecked(boolean isChecked) {
        SwitchComponent switchComponent = (SwitchComponent) getTrailViewAs(SwitchComponent.class);
        if (switchComponent != null) {
            switchComponent.setCheckedWithAnimation(isChecked);
        }
    }

    public void toggleSwitchTrail() {
        SwitchComponent switchComponent = (SwitchComponent) getTrailViewAs(SwitchComponent.class);
        if (switchComponent != null) {
            switchComponent.toggleWithAnimation();
        }
    }

    @Override // defpackage.yss0
    public SlotItemViewComponent asView() {
        return this;
    }

    public SlotItemViewComponent(Context context, AttributeSet attributeSet, pav pavVar) {
        this(context, attributeSet, 0, pavVar, 4, null);
    }

    public SlotItemViewComponent(Context context, pav pavVar) {
        this(context, null, 0, pavVar, 6, null);
    }

    public /* synthetic */ SlotItemViewComponent(Context context, AttributeSet attributeSet, int i, pav pavVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, pavVar);
    }
}
