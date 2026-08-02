package com.yandex.go.mainscreen.superapp.impl.header.presentation.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.b;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.mainscreen.superapp.analytics.SuperappMainAnalytics$HeaderShownReason;
import com.yandex.go.mainscreen.superapp.analytics.SuperappMainAnalytics$HeaderTappedElementName;
import com.yandex.go.mainscreen.superapp.impl.header.presentation.header.SuperappMainFloatingHeader;
import com.yandex.go.mainscreen.superapp.impl.header.presentation.header.delegates.HeaderTranslationDelegate$State;
import defpackage.cxq0;
import defpackage.dcw0;
import defpackage.f0w0;
import defpackage.hxx;
import defpackage.i3y;
import defpackage.ibw0;
import defpackage.jlh;
import defpackage.kpr;
import defpackage.m2h0;
import defpackage.m950;
import defpackage.mj10;
import defpackage.nj10;
import defpackage.pep0;
import defpackage.qbw0;
import defpackage.rcu;
import defpackage.rp31;
import defpackage.sls;
import defpackage.t0w0;
import defpackage.tje;
import defpackage.u9w0;
import defpackage.w49;
import defpackage.w511;
import defpackage.wwg;
import defpackage.xbw0;
import defpackage.xw31;
import defpackage.y49;
import defpackage.ybw0;
import defpackage.yih0;
import defpackage.zy11;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.settings.MainMenuButton;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00172\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00172\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u00101R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lcom/yandex/go/mainscreen/superapp/impl/header/presentation/header/SuperappMainFloatingHeader;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Lxbw0;", "Lrcu;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "isTransparent", "Ldcw0;", "presenter", "Lmj10;", "menuBadgeFactory", "Lf0w0;", "logoViewDelegate", "Lw49;", "cashbackViewFactory", "Lzy11;", "init", "(ZLdcw0;Lmj10;Lf0w0;Lw49;)V", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "onDetachedFromWindow", "()V", "Lybw0;", "uiState", "render", "(Lybw0;)V", "Lcom/yandex/go/mainscreen/superapp/impl/header/presentation/header/delegates/HeaderTranslationDelegate$State;", ClidProvider.STATE, "onStateChanged", "(Lcom/yandex/go/mainscreen/superapp/impl/header/presentation/header/delegates/HeaderTranslationDelegate$State;)V", "Lru/yandex/taxi/settings/MainMenuButton;", "mainMenuButton$delegate", "Li3y;", "getMainMenuButton", "()Lru/yandex/taxi/settings/MainMenuButton;", "mainMenuButton", "Landroid/view/View;", "cashbackViewHolder$delegate", "getCashbackViewHolder", "()Landroid/view/View;", "cashbackViewHolder", "Ldcw0;", "Ly49;", "cashbackView", "Ly49;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public class SuperappMainFloatingHeader extends GoConstraintLayout implements xbw0, rcu {
    private y49 cashbackView;

    /* renamed from: cashbackViewHolder$delegate, reason: from kotlin metadata */
    private final i3y cashbackViewHolder;

    /* renamed from: mainMenuButton$delegate, reason: from kotlin metadata */
    private final i3y mainMenuButton;
    private dcw0 presenter;

    public SuperappMainFloatingHeader(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        final int i3 = 0;
        sls slsVar = new sls(this) { // from class: obw0
            public final /* synthetic */ SuperappMainFloatingHeader b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                MainMenuButton mainMenuButton_delegate$lambda$0;
                View cashbackViewHolder_delegate$lambda$0;
                int i4 = i3;
                SuperappMainFloatingHeader superappMainFloatingHeader = this.b;
                switch (i4) {
                    case 0:
                        mainMenuButton_delegate$lambda$0 = SuperappMainFloatingHeader.mainMenuButton_delegate$lambda$0(superappMainFloatingHeader);
                        return mainMenuButton_delegate$lambda$0;
                    default:
                        cashbackViewHolder_delegate$lambda$0 = SuperappMainFloatingHeader.cashbackViewHolder_delegate$lambda$0(superappMainFloatingHeader);
                        return cashbackViewHolder_delegate$lambda$0;
                }
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.mainMenuButton = a.b(lazyThreadSafetyMode, slsVar);
        final int i4 = 1;
        this.cashbackViewHolder = a.b(lazyThreadSafetyMode, new sls(this) { // from class: obw0
            public final /* synthetic */ SuperappMainFloatingHeader b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                MainMenuButton mainMenuButton_delegate$lambda$0;
                View cashbackViewHolder_delegate$lambda$0;
                int i42 = i4;
                SuperappMainFloatingHeader superappMainFloatingHeader = this.b;
                switch (i42) {
                    case 0:
                        mainMenuButton_delegate$lambda$0 = SuperappMainFloatingHeader.mainMenuButton_delegate$lambda$0(superappMainFloatingHeader);
                        return mainMenuButton_delegate$lambda$0;
                    default:
                        cashbackViewHolder_delegate$lambda$0 = SuperappMainFloatingHeader.cashbackViewHolder_delegate$lambda$0(superappMainFloatingHeader);
                        return cashbackViewHolder_delegate$lambda$0;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View cashbackViewHolder_delegate$lambda$0(SuperappMainFloatingHeader superappMainFloatingHeader) {
        int i = yih0.cashback_view_holder;
        WeakHashMap weakHashMap = b.a;
        return (View) rp31.d(superappMainFloatingHeader, i);
    }

    private final View getCashbackViewHolder() {
        return (View) this.cashbackViewHolder.getValue();
    }

    private final MainMenuButton getMainMenuButton() {
        return (MainMenuButton) this.mainMenuButton.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 init$lambda$1(dcw0 dcw0Var) {
        dcw0Var.z.g();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 init$lambda$2(dcw0 dcw0Var) {
        ibw0 ibw0Var = dcw0Var.C;
        SuperappMainAnalytics$HeaderTappedElementName superappMainAnalytics$HeaderTappedElementName = SuperappMainAnalytics$HeaderTappedElementName.Logo;
        ibw0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("element_name", superappMainAnalytics$HeaderTappedElementName.getEventValue());
        ibw0Var.a.a("SuperappMain.Header.Tapped", hashMap, 1, new HashMap());
        ((pep0) dcw0Var.E).f((m950) dcw0Var.A.get(), new u9w0(dcw0Var.B.h()), hxx.a);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MainMenuButton mainMenuButton_delegate$lambda$0(SuperappMainFloatingHeader superappMainFloatingHeader) {
        int i = yih0.menu_button;
        WeakHashMap weakHashMap = b.a;
        return (MainMenuButton) ((View) rp31.d(superappMainFloatingHeader, i));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        dcw0 dcw0Var;
        if (ev.getAction() == 1 && xw31.o(this, getCashbackViewHolder(), ev) && (dcw0Var = this.presenter) != null) {
            ibw0 ibw0Var = dcw0Var.C;
            SuperappMainAnalytics$HeaderTappedElementName superappMainAnalytics$HeaderTappedElementName = SuperappMainAnalytics$HeaderTappedElementName.FintechWidget;
            ibw0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("element_name", superappMainAnalytics$HeaderTappedElementName.getEventValue());
            ibw0Var.a.a("SuperappMain.Header.Tapped", hashMap, 1, new HashMap());
        }
        return super.dispatchTouchEvent(ev);
    }

    public final void init(boolean isTransparent, final dcw0 presenter, mj10 menuBadgeFactory, f0w0 logoViewDelegate, w49 cashbackViewFactory) {
        if (isTransparent) {
            setBackground(null);
        }
        int i = yih0.logo_view;
        WeakHashMap weakHashMap = b.a;
        ImageView imageView = (ImageView) ((View) rp31.d(this, i));
        ((jlh) logoViewDelegate).getClass();
        imageView.setImageResource(m2h0.ic_go_logo);
        dcw0 dcw0Var = this.presenter;
        if (dcw0Var != null) {
            dcw0Var.Cg();
        }
        this.presenter = presenter;
        this.cashbackView = ((t0w0) cashbackViewFactory).a(this);
        final int i2 = 1;
        if (isAttachedToWindow()) {
            dcw0 dcw0Var2 = this.presenter;
            if (dcw0Var2 != null) {
                dcw0Var2.Bg(this);
                tje.N(dcw0Var2.Jg(), null, null, new SuperappMainScreenFloatingPresenter$attachView$1(dcw0Var2, this, null), 3);
            }
            dcw0 dcw0Var3 = this.presenter;
            if (dcw0Var3 != null) {
                kpr kprVar = dcw0Var3.D;
                ibw0 ibw0Var = dcw0Var3.C;
                SuperappMainAnalytics$HeaderShownReason superappMainAnalytics$HeaderShownReason = kprVar.a;
                ibw0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put(CRLReasonCodeExtension.REASON, superappMainAnalytics$HeaderShownReason.getEventValue());
                ibw0Var.a.a("SuperappMain.Header.Shown", hashMap, 1, new HashMap());
                kprVar.a = SuperappMainAnalytics$HeaderShownReason.ReturnBack;
            }
            y49 y49Var = this.cashbackView;
            if (y49Var != null) {
                ((cxq0) y49Var).D();
            }
        } else {
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.mainscreen.superapp.impl.header.presentation.header.SuperappMainFloatingHeader$init$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    this.removeOnAttachStateChangeListener(this);
                    dcw0 dcw0Var4 = this.presenter;
                    if (dcw0Var4 != null) {
                        SuperappMainFloatingHeader superappMainFloatingHeader = this;
                        dcw0Var4.Bg(superappMainFloatingHeader);
                        tje.N(dcw0Var4.Jg(), null, null, new SuperappMainScreenFloatingPresenter$attachView$1(dcw0Var4, superappMainFloatingHeader, null), 3);
                    }
                    dcw0 dcw0Var5 = this.presenter;
                    if (dcw0Var5 != null) {
                        kpr kprVar2 = dcw0Var5.D;
                        ibw0 ibw0Var2 = dcw0Var5.C;
                        SuperappMainAnalytics$HeaderShownReason superappMainAnalytics$HeaderShownReason2 = kprVar2.a;
                        ibw0Var2.getClass();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put(CRLReasonCodeExtension.REASON, superappMainAnalytics$HeaderShownReason2.getEventValue());
                        ibw0Var2.a.a("SuperappMain.Header.Shown", hashMap2, 1, new HashMap());
                        kprVar2.a = SuperappMainAnalytics$HeaderShownReason.ReturnBack;
                    }
                    y49 y49Var2 = this.cashbackView;
                    if (y49Var2 != null) {
                        ((cxq0) y49Var2).D();
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }
            });
        }
        final int i3 = 0;
        c.z(new sls() { // from class: pbw0
            @Override // defpackage.sls
            public final Object invoke() {
                zy11 init$lambda$1;
                zy11 init$lambda$2;
                int i4 = i3;
                dcw0 dcw0Var4 = presenter;
                switch (i4) {
                    case 0:
                        init$lambda$1 = SuperappMainFloatingHeader.init$lambda$1(dcw0Var4);
                        return init$lambda$1;
                    default:
                        init$lambda$2 = SuperappMainFloatingHeader.init$lambda$2(dcw0Var4);
                        return init$lambda$2;
                }
            }
        }, getMainMenuButton());
        c.z(new sls() { // from class: pbw0
            @Override // defpackage.sls
            public final Object invoke() {
                zy11 init$lambda$1;
                zy11 init$lambda$2;
                int i4 = i2;
                dcw0 dcw0Var4 = presenter;
                switch (i4) {
                    case 0:
                        init$lambda$1 = SuperappMainFloatingHeader.init$lambda$1(dcw0Var4);
                        return init$lambda$1;
                    default:
                        init$lambda$2 = SuperappMainFloatingHeader.init$lambda$2(dcw0Var4);
                        return init$lambda$2;
                }
            }
        }, (View) rp31.d(this, yih0.logo_view));
        ((nj10) menuBadgeFactory).a(getMainMenuButton());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        dcw0 dcw0Var = this.presenter;
        if (dcw0Var != null) {
            dcw0Var.Cg();
        }
        y49 y49Var = this.cashbackView;
        if (y49Var != null) {
            ((cxq0) y49Var).z();
        }
        super.onDetachedFromWindow();
    }

    @Override // defpackage.rcu
    public void onStateChanged(HeaderTranslationDelegate$State state) {
        int i = qbw0.a[state.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return;
                }
                w511.b();
                return;
            }
            dcw0 dcw0Var = this.presenter;
            if (dcw0Var != null) {
                kpr kprVar = dcw0Var.D;
                if (kprVar.b) {
                    kprVar.b = false;
                    return;
                }
                return;
            }
            return;
        }
        dcw0 dcw0Var2 = this.presenter;
        if (dcw0Var2 != null) {
            kpr kprVar2 = dcw0Var2.D;
            if (kprVar2.b) {
                return;
            }
            kprVar2.b = true;
            ibw0 ibw0Var = dcw0Var2.C;
            SuperappMainAnalytics$HeaderShownReason superappMainAnalytics$HeaderShownReason = SuperappMainAnalytics$HeaderShownReason.ScrollUp;
            ibw0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put(CRLReasonCodeExtension.REASON, superappMainAnalytics$HeaderShownReason.getEventValue());
            ibw0Var.a.a("SuperappMain.Header.Shown", hashMap, 1, new HashMap());
        }
    }

    @Override // defpackage.eyi0
    public void render(ybw0 uiState) {
        wwg.U(getMainMenuButton(), uiState.a);
    }

    public SuperappMainFloatingHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public SuperappMainFloatingHeader(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public SuperappMainFloatingHeader(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ SuperappMainFloatingHeader(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
