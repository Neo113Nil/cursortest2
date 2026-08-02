package com.yandex.go.mainscreen.superapp.impl.header.presentation.header;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.mainscreen.superapp.impl.clarifyaddress.presentation.ButtonsAlignment;
import com.yandex.go.mainscreen.superapp.impl.clarifyaddress.presentation.b;
import com.yandex.go.mainscreen.superapp.impl.foundation.data.repository.SuperAppLogoPositionRepository$LogoPosition;
import com.yandex.go.mainscreen.superapp.impl.header.domain.h;
import com.yandex.go.mainscreen.superapp.impl.header.domain.i;
import com.yandex.go.mainscreen.superapp.impl.header.domain.k;
import com.yandex.go.mainscreen.superapp.impl.header.experiment.CurrentAddressModalExperiment;
import com.yandex.go.mainscreen.superapp.impl.header.experiment.SuperAppMainScreenLogoImageExperiment;
import com.yandex.go.mainscreen.superapp.impl.header.presentation.header.SuperAppMainScreenHeader;
import defpackage.bei;
import defpackage.c2w0;
import defpackage.cxq0;
import defpackage.d2w0;
import defpackage.e0w0;
import defpackage.e2w0;
import defpackage.e37;
import defpackage.e4w0;
import defpackage.ei;
import defpackage.f2w0;
import defpackage.f4w0;
import defpackage.g4w0;
import defpackage.h0w0;
import defpackage.h4w0;
import defpackage.j2w0;
import defpackage.jbh;
import defpackage.ljc0;
import defpackage.lnv0;
import defpackage.m2h0;
import defpackage.mdh;
import defpackage.mj10;
import defpackage.nj10;
import defpackage.nzm;
import defpackage.o00;
import defpackage.pwz0;
import defpackage.qje;
import defpackage.r1w0;
import defpackage.rp31;
import defpackage.rqo;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.w49;
import defpackage.w511;
import defpackage.wju;
import defpackage.wth0;
import defpackage.x27;
import defpackage.xlp0;
import defpackage.xng0;
import defpackage.y9y0;
import defpackage.yih0;
import defpackage.yul;
import defpackage.zo31;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewBottomRounded$1;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.experiments.d;
import ru.yandex.taxi.settings.MainMenuButton;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002OEB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JY\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000eH\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0014¢\u0006\u0004\b&\u0010%J\u0019\u0010)\u001a\u00020 2\b\u0010(\u001a\u0004\u0018\u00010'H\u0017¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J'\u00105\u001a\u00020\u000e2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u001f\u00109\u001a\u00020\u000e2\u0006\u00108\u001a\u0002072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b9\u0010:J\u001f\u0010=\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020;2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u000eH\u0002¢\u0006\u0004\b?\u0010%J\u0017\u0010@\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u000eH\u0002¢\u0006\u0004\bB\u0010%J\u000f\u0010C\u001a\u00020\u000eH\u0002¢\u0006\u0004\bC\u0010%J\u000f\u0010D\u001a\u00020\u000eH\u0002¢\u0006\u0004\bD\u0010%R\u001c\u0010F\u001a\b\u0018\u00010ER\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010HR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010IR\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010JR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010KR\u0016\u0010L\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010MR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010MR\u0018\u0010P\u001a\u00060OR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010MR\u0016\u0010S\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010M¨\u0006V"}, d2 = {"Lcom/yandex/go/mainscreen/superapp/impl/header/presentation/header/SuperAppMainScreenHeader;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Le4w0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lh4w0;", "uiState", "Lzy11;", "render", "(Lh4w0;)V", "Lh0w0;", "presenter", "Lw49;", "cashbackViewFactory", "Lkotlin/Function0;", "Landroid/view/View;", "headerViewProvider", "Lcom/yandex/go/mainscreen/superapp/impl/foundation/data/repository/SuperAppLogoPositionRepository$LogoPosition;", "logoPosition", "Lcom/yandex/go/mainscreen/superapp/impl/clarifyaddress/presentation/b;", "clarifyAddressPresenter", "Lmj10;", "menuBadgeFactory", "Lr1w0;", "binding", "", "isOptimizedShimmeringEnabled", "init", "(Lh0w0;Lw49;Lsls;Lcom/yandex/go/mainscreen/superapp/impl/foundation/data/repository/SuperAppLogoPositionRepository$LogoPosition;Lcom/yandex/go/mainscreen/superapp/impl/clarifyaddress/presentation/b;Lmj10;Lr1w0;Z)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lru/yandex/taxi/design/ButtonComponent;", "button", "Le37;", ClidProvider.STATE, "Lpwz0;", CRLReasonCodeExtension.REASON, "initButton", "(Lru/yandex/taxi/design/ButtonComponent;Le37;Lpwz0;)V", "Lcom/yandex/go/mainscreen/superapp/impl/clarifyaddress/presentation/ButtonsAlignment;", "buttonsAlignment", "resolveActionsAlignment", "(Lcom/yandex/go/mainscreen/superapp/impl/clarifyaddress/presentation/ButtonsAlignment;Lh4w0;)V", "Lwju;", "hintState", "initHint", "(Lwju;Lpwz0;)V", "replaceChildrenByComponent", "configureMenuBadge", "(Lmj10;)V", "onAttach", "listenToLayoutChanges", "updateCurrentAddressViewDrawableTint", "Lc2w0;", "holder", "Lc2w0;", "Lcom/yandex/go/mainscreen/superapp/impl/clarifyaddress/presentation/b;", "Lh0w0;", "Lsls;", "Lw49;", "loadingState", "Z", "modalEnabled", "Ld2w0;", "mvpView", "Ld2w0;", "headerStateUpdated", "headerYOnScreen", CA20Status.STATUS_USER_I, "isAttachCalled", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuperAppMainScreenHeader extends GoConstraintLayout implements e4w0 {
    private w49 cashbackViewFactory;
    private b clarifyAddressPresenter;
    private boolean headerStateUpdated;
    private sls headerViewProvider;
    private int headerYOnScreen;
    private c2w0 holder;
    private boolean isAttachCalled;
    private boolean isOptimizedShimmeringEnabled;
    private boolean loadingState;
    private boolean modalEnabled;
    private final d2w0 mvpView;
    private h0w0 presenter;

    public SuperAppMainScreenHeader(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.loadingState = true;
        this.mvpView = new d2w0(this);
        this.headerYOnScreen = -1;
        setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewBottomRounded$1(tje.u(24, getContext())));
        setClipToOutline(true);
        setBackgroundColor(qje.t(xng0.bgMain, getContext()));
    }

    private final void configureMenuBadge(mj10 menuBadgeFactory) {
        MainMenuButton mainMenuButton;
        c2w0 c2w0Var = this.holder;
        if (c2w0Var == null || (mainMenuButton = c2w0Var.b) == null) {
            return;
        }
        ((nj10) menuBadgeFactory).a(mainMenuButton);
    }

    private final void initButton(ButtonComponent button, e37 state, pwz0 reason) {
        boolean z = state instanceof x27;
        button.setVisibility(z ? 0 : 8);
        if (z) {
            x27 x27Var = (x27) state;
            button.setText(x27Var.b());
            b bVar = this.clarifyAddressPresenter;
            if (bVar != null) {
                button.setDebounceClickListener(new lnv0(6, new xlp0(19, bVar, x27Var, reason)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initButton$lambda$1$0(b bVar, e37 e37Var, pwz0 pwz0Var) {
        bVar.Ng(((x27) e37Var).a(), pwz0Var);
        return zy11.a;
    }

    private final void initHint(wju hintState, pwz0 reason) {
        ListItemComponent listItemComponent;
        ListItemComponent listItemComponent2;
        ListItemComponent listItemComponent3;
        ListItemComponent listItemComponent4;
        ListItemComponent listItemComponent5;
        ListItemComponent listItemComponent6;
        ListItemComponent listItemComponent7;
        c2w0 c2w0Var = this.holder;
        if (c2w0Var != null && (listItemComponent7 = c2w0Var.i) != null) {
            listItemComponent7.setVisibility(0);
        }
        c2w0 c2w0Var2 = this.holder;
        if (c2w0Var2 != null && (listItemComponent6 = c2w0Var2.i) != null) {
            listItemComponent6.setTitle(hintState.c());
        }
        c2w0 c2w0Var3 = this.holder;
        if (c2w0Var3 != null && (listItemComponent5 = c2w0Var3.i) != null) {
            listItemComponent5.setSubtitle(hintState.b());
        }
        View inflate = LayoutInflater.from(getContext()).inflate(wth0.super_app_main_screen_promo_lead, (ViewGroup) null);
        bei.k(m2h0.ic_address_picker, (ImageView) inflate.findViewById(yih0.lead_background));
        c2w0 c2w0Var4 = this.holder;
        if (c2w0Var4 != null && (listItemComponent4 = c2w0Var4.i) != null) {
            listItemComponent4.setLeadView(inflate);
        }
        b bVar = this.clarifyAddressPresenter;
        if (bVar != null) {
            xlp0 xlp0Var = new xlp0(20, bVar, hintState, reason);
            c2w0 c2w0Var5 = this.holder;
            if (c2w0Var5 != null && (listItemComponent3 = c2w0Var5.i) != null) {
                listItemComponent3.setDebounceClickListener(new lnv0(7, xlp0Var));
            }
            boolean z = hintState.a() instanceof ljc0;
            c2w0 c2w0Var6 = this.holder;
            if (c2w0Var6 != null && (listItemComponent2 = c2w0Var6.i) != null) {
                listItemComponent2.setTrailVisibility(z ? 8 : 0);
            }
        }
        ei eiVar = new ei(23);
        c2w0 c2w0Var7 = this.holder;
        if (c2w0Var7 == null || (listItemComponent = c2w0Var7.i) == null) {
            return;
        }
        androidx.core.view.b.p(listItemComponent, eiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initHint$lambda$0$0(b bVar, wju wjuVar, pwz0 pwz0Var) {
        bVar.Ng(wjuVar.a(), pwz0Var);
        return zy11.a;
    }

    private final void listenToLayoutChanges() {
        addOnLayoutChangeListener(new yul(1, this, new int[2]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r0.getVisibility() == 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void listenToLayoutChanges$lambda$0(SuperAppMainScreenHeader superAppMainScreenHeader, int[] iArr, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Object value;
        superAppMainScreenHeader.getLocationOnScreen(iArr);
        boolean z = true;
        int i9 = iArr[1];
        if (superAppMainScreenHeader.headerStateUpdated || superAppMainScreenHeader.headerYOnScreen != i9) {
            superAppMainScreenHeader.headerYOnScreen = i9;
            superAppMainScreenHeader.headerStateUpdated = false;
            h0w0 h0w0Var = superAppMainScreenHeader.presenter;
            if (h0w0Var != null) {
                c2w0 c2w0Var = superAppMainScreenHeader.holder;
                if (c2w0Var != null) {
                    SuperAppMainScreenHeader superAppMainScreenHeader2 = c2w0Var.m;
                    int i10 = yih0.clarify_address_view;
                    WeakHashMap weakHashMap = androidx.core.view.b.a;
                    View view2 = (View) rp31.d(superAppMainScreenHeader2, i10);
                    if (view2 != null) {
                    }
                }
                z = false;
                int i11 = i4 - i2;
                r0 r0Var = h0w0Var.y.a;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, new f2w0(z, i11)));
            }
        }
    }

    private final void onAttach() {
        View view;
        cxq0 cxq0Var;
        View view2;
        MainMenuButton mainMenuButton;
        if (this.isAttachCalled) {
            return;
        }
        h0w0 h0w0Var = this.presenter;
        if (h0w0Var != null) {
            d2w0 d2w0Var = this.mvpView;
            if (!h0w0Var.Eg()) {
                h0w0Var.Bg(d2w0Var);
                e0w0 e0w0Var = h0w0Var.z;
                rqo rqoVar = e0w0Var.a;
                CurrentAddressModalExperiment.Companion.getClass();
                jbh jbhVar = (jbh) rqoVar;
                tpr t = e.t(new i(new tpr[]{((h) e0w0Var.d).b(), d.b(jbhVar.e(SuperAppMainScreenLogoImageExperiment.k)), ((y9y0) e0w0Var.j.get()).f(), new k(d.b(jbhVar.d(CurrentAddressModalExperiment.o))), new com.yandex.go.preload.d(e0w0Var.c.c.c), d.b(e0w0Var.e), e0w0Var.f.a, e0w0Var.h.c}, e0w0Var));
                e0w0Var.b.getClass();
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                tpr F = e.F(t, mdhVar);
                h0w0Var.B.getClass();
                tje.N(h0w0Var.Jg(), null, null, new SuperAppHeaderPresenter$attachView$$inlined$safeCollectIn$1(e.F(F, mdhVar), null, d2w0Var), 3);
            }
            c2w0 c2w0Var = this.holder;
            if (c2w0Var != null && (mainMenuButton = c2w0Var.b) != null) {
                c.z(new SuperAppMainScreenHeader$onAttach$1$1(0, h0w0Var, h0w0.class, "onMenuClicked", "onMenuClicked()V", 0), mainMenuButton);
            }
            c2w0 c2w0Var2 = this.holder;
            if (c2w0Var2 != null && (view2 = c2w0Var2.e) != null) {
                c.z(new SuperAppMainScreenHeader$onAttach$1$2(0, h0w0Var, h0w0.class, "openCurrentAddressModal", "openCurrentAddressModal()V", 0), view2);
            }
        }
        b bVar = this.clarifyAddressPresenter;
        if (bVar != null) {
            bVar.Mg(this);
        }
        c2w0 c2w0Var3 = this.holder;
        if (c2w0Var3 != null && (cxq0Var = c2w0Var3.h) != null) {
            cxq0Var.D();
        }
        c2w0 c2w0Var4 = this.holder;
        if (c2w0Var4 != null && (view = c2w0Var4.g) != null) {
            view.setPaddingRelative(0, 0, tje.u(8, getContext()), 0);
        }
        updateCurrentAddressViewDrawableTint();
        this.isAttachCalled = true;
    }

    private final void replaceChildrenByComponent() {
        sls slsVar = this.headerViewProvider;
        if (slsVar != null) {
            final c2w0 c2w0Var = this.holder;
            if (c2w0Var != null) {
                SuperAppMainScreenHeader superAppMainScreenHeader = c2w0Var.m;
                int i = yih0.logo_view;
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                c.w((View) rp31.d(superAppMainScreenHeader, i), (View) slsVar.invoke());
                final int u = tje.u(2, getContext());
                View view = c2w0Var.f;
                if (view != null) {
                    view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: b2w0
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                            SuperAppMainScreenHeader.replaceChildrenByComponent$lambda$0$0$0(u, this, c2w0Var, view2, i2, i3, i4, i5, i6, i7, i8, i9);
                        }
                    });
                }
            }
            this.mvpView.h(this.loadingState, this.modalEnabled);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void replaceChildrenByComponent$lambda$0$0$0(int i, SuperAppMainScreenHeader superAppMainScreenHeader, c2w0 c2w0Var, View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int width;
        if (i4 - i2 > 0 && (width = ((i2 - i) - (superAppMainScreenHeader.getWidth() / 2)) * 2) > 0 && c2w0Var.d.getMaxWidth() != width) {
            c2w0Var.d.setMaxWidth(width);
        }
    }

    private final void resolveActionsAlignment(ButtonsAlignment buttonsAlignment, h4w0 uiState) {
        ButtonComponent buttonComponent;
        LinearLayout linearLayout;
        ButtonComponent buttonComponent2;
        LinearLayout linearLayout2;
        int u = ((uiState instanceof g4w0) && (((g4w0) uiState).b.b() instanceof x27)) ? tje.u(4, getContext()) : 0;
        int i = e2w0.a[buttonsAlignment.ordinal()];
        if (i == 1) {
            c2w0 c2w0Var = this.holder;
            if (c2w0Var != null && (linearLayout = c2w0Var.j) != null) {
                linearLayout.setOrientation(0);
            }
            c2w0 c2w0Var2 = this.holder;
            if (c2w0Var2 == null || (buttonComponent = c2w0Var2.k) == null) {
                return;
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) buttonComponent.getLayoutParams();
            layoutParams.setMargins(0, 0, u, 0);
            buttonComponent.setLayoutParams(layoutParams);
            return;
        }
        if (i != 2) {
            w511.b();
            return;
        }
        c2w0 c2w0Var3 = this.holder;
        if (c2w0Var3 != null && (linearLayout2 = c2w0Var3.j) != null) {
            linearLayout2.setOrientation(1);
        }
        c2w0 c2w0Var4 = this.holder;
        if (c2w0Var4 == null || (buttonComponent2 = c2w0Var4.k) == null) {
            return;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) buttonComponent2.getLayoutParams();
        layoutParams2.setMargins(0, 0, 0, u);
        buttonComponent2.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCurrentAddressViewDrawableTint() {
        RobotoTextView robotoTextView;
        c2w0 c2w0Var = this.holder;
        if (c2w0Var == null || (robotoTextView = c2w0Var.d) == null) {
            return;
        }
        robotoTextView.setCompoundDrawableTintList(ColorStateList.valueOf(qje.t(xng0.textMain, getContext())));
    }

    @Override // com.yandex.go.design.view.GoConstraintLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        ButtonComponent buttonComponent;
        ButtonComponent buttonComponent2;
        LinearLayout linearLayout;
        View view;
        super.applyTheme(themeType);
        setBackgroundColor(qje.t(xng0.bgMain, getContext()));
        c2w0 c2w0Var = this.holder;
        if (c2w0Var != null && (view = c2w0Var.a) != null) {
            view.setBackgroundColor(qje.t(xng0.bgMain, getContext()));
        }
        c2w0 c2w0Var2 = this.holder;
        if (c2w0Var2 != null && (linearLayout = c2w0Var2.j) != null) {
            linearLayout.setBackgroundColor(qje.t(xng0.bgMain, getContext()));
        }
        c2w0 c2w0Var3 = this.holder;
        if (c2w0Var3 != null && (buttonComponent2 = c2w0Var3.k) != null) {
            buttonComponent2.setButtonBackground(qje.t(xng0.controlMinor, getContext()));
        }
        c2w0 c2w0Var4 = this.holder;
        if (c2w0Var4 != null && (buttonComponent = c2w0Var4.k) != null) {
            buttonComponent.setButtonTitleColor(qje.t(xng0.textOnControlMinor, getContext()));
        }
        updateCurrentAddressViewDrawableTint();
    }

    public final void init(h0w0 presenter, w49 cashbackViewFactory, sls headerViewProvider, SuperAppLogoPositionRepository$LogoPosition logoPosition, b clarifyAddressPresenter, mj10 menuBadgeFactory, r1w0 binding, boolean isOptimizedShimmeringEnabled) {
        zo31 zo31Var;
        this.presenter = presenter;
        this.cashbackViewFactory = cashbackViewFactory;
        this.headerViewProvider = headerViewProvider;
        this.clarifyAddressPresenter = clarifyAddressPresenter;
        this.isOptimizedShimmeringEnabled = isOptimizedShimmeringEnabled;
        LayoutInflater from = LayoutInflater.from(getContext());
        int i = e2w0.b[logoPosition.ordinal()];
        if (i != 1) {
            zo31Var = binding;
            if (i != 2) {
                if (i != 3) {
                    w511.b();
                    return;
                } else {
                    removeAllViews();
                    zo31Var = isOptimizedShimmeringEnabled ? j2w0.r(from, this) : j2w0.q(from, this);
                }
            } else if (binding == null) {
                removeAllViews();
                zo31Var = nzm.r(from, this);
            }
        } else {
            removeAllViews();
            zo31Var = isOptimizedShimmeringEnabled ? j2w0.p(from, this) : j2w0.o(from, this);
        }
        this.holder = new c2w0(this, zo31Var);
        configureMenuBadge(menuBadgeFactory);
        replaceChildrenByComponent();
        listenToLayoutChanges();
        onAttach();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        onAttach();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        cxq0 cxq0Var;
        MainMenuButton mainMenuButton;
        super.onDetachedFromWindow();
        this.isAttachCalled = false;
        c2w0 c2w0Var = this.holder;
        if (c2w0Var != null && (mainMenuButton = c2w0Var.b) != null) {
            mainMenuButton.setOnClickListener(null);
        }
        c2w0 c2w0Var2 = this.holder;
        if (c2w0Var2 != null && (cxq0Var = c2w0Var2.h) != null) {
            cxq0Var.z();
        }
        h0w0 h0w0Var = this.presenter;
        if (h0w0Var != null) {
            h0w0Var.Cg();
        }
        b bVar = this.clarifyAddressPresenter;
        if (bVar != null) {
            bVar.Cg();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return true;
    }

    @Override // defpackage.eyi0
    public void render(h4w0 uiState) {
        ListItemComponent listItemComponent;
        c2w0 c2w0Var = this.holder;
        if (c2w0Var != null) {
            SuperAppMainScreenHeader superAppMainScreenHeader = c2w0Var.m;
            int i = yih0.clarify_address_view;
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            View view = (View) rp31.d(superAppMainScreenHeader, i);
            if (view != null) {
                view.setVisibility(!(uiState instanceof f4w0) ? 0 : 8);
            }
        }
        if (uiState instanceof g4w0) {
            g4w0 g4w0Var = (g4w0) uiState;
            o00 o00Var = g4w0Var.b;
            pwz0 pwz0Var = g4w0Var.c;
            initHint(g4w0Var.a, pwz0Var);
            c2w0 c2w0Var2 = this.holder;
            if (c2w0Var2 != null && (listItemComponent = c2w0Var2.i) != null) {
                listItemComponent.setSubtitleAboveTitle(false);
            }
            resolveActionsAlignment(o00Var.a(), uiState);
            c2w0 c2w0Var3 = this.holder;
            if (c2w0Var3 != null) {
                initButton(c2w0Var3.k, o00Var.c(), pwz0Var);
                initButton(c2w0Var3.l, o00Var.b(), pwz0Var);
            }
        }
        this.headerStateUpdated = true;
    }

    public SuperAppMainScreenHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public SuperAppMainScreenHeader(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public SuperAppMainScreenHeader(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ SuperAppMainScreenHeader(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
