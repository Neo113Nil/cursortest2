package com.yandex.go.user_profile.ui.primary;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.ultima_mode.profile.mvp.ProfileUltimaModeView;
import defpackage.a9h0;
import defpackage.agh0;
import defpackage.bdc;
import defpackage.bff0;
import defpackage.cdc;
import defpackage.cma1;
import defpackage.dj3;
import defpackage.dzg0;
import defpackage.evu0;
import defpackage.exu0;
import defpackage.fhf0;
import defpackage.gff0;
import defpackage.gky;
import defpackage.hff0;
import defpackage.hky;
import defpackage.hv11;
import defpackage.i20;
import defpackage.iff0;
import defpackage.ii30;
import defpackage.irs0;
import defpackage.jff0;
import defpackage.klh0;
import defpackage.kyh0;
import defpackage.lh2;
import defpackage.lk51;
import defpackage.mrg0;
import defpackage.nac;
import defpackage.ncf0;
import defpackage.ny61;
import defpackage.o7r0;
import defpackage.ocf0;
import defpackage.pav;
import defpackage.pff0;
import defpackage.pho;
import defpackage.pwy0;
import defpackage.q5z;
import defpackage.qbv;
import defpackage.qcf0;
import defpackage.qff0;
import defpackage.qje;
import defpackage.r0d0;
import defpackage.rcf0;
import defpackage.rff0;
import defpackage.rp31;
import defpackage.scf0;
import defpackage.sff0;
import defpackage.sgf0;
import defpackage.tcf0;
import defpackage.tls;
import defpackage.tv11;
import defpackage.twg0;
import defpackage.ucf0;
import defpackage.uef0;
import defpackage.ugf0;
import defpackage.ul21;
import defpackage.vcf0;
import defpackage.w511;
import defpackage.wcf0;
import defpackage.xdf;
import defpackage.xng0;
import defpackage.y130;
import defpackage.ycf0;
import defpackage.yo90;
import defpackage.yoh0;
import defpackage.yu11;
import defpackage.z750;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;
import ru.yandex.taxi.design.FloatingTitleToolbarComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.settings.profile.UserInfoProfileView;
import ru.yandex.taxi.widget.BindingModalView;
import ru.yandex.taxi.widget.SingleClickScrollView;
import ru.yandex.taxi.widget.utils.e;
import ru.yandex.taxi.zalogin.LinkAccountsViewFactoryImpl$createLinkAccountsView$1;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u001f\u00106\u001a\u00020\u00072\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020,H\u0002¢\u0006\u0004\b6\u00107J\u001f\u00109\u001a\u00020\u00072\u0006\u00108\u001a\u00020,2\u0006\u00105\u001a\u00020,H\u0002¢\u0006\u0004\b9\u0010:J\u001f\u0010<\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020;2\u0006\u00105\u001a\u00020,H\u0002¢\u0006\u0004\b<\u0010=J\u001f\u0010@\u001a\u00020\u00072\u0006\u0010?\u001a\u00020>2\u0006\u00105\u001a\u00020,H\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0007H\u0002¢\u0006\u0004\bB\u0010CR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010DR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010ER\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010FR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010GR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010NR\u0014\u0010P\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010NR\u0014\u0010Q\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010NR\u0014\u0010T\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010NR\u0014\u0010U\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010NR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010XR\u0018\u0010[\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010\\¨\u0006^"}, d2 = {"Lcom/yandex/go/user_profile/ui/primary/ProfileModalView;", "Lru/yandex/taxi/widget/BindingModalView;", "Luef0;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Ladf0;", "Lzy11;", "handleAction", "Lpav;", "imageLoader", "Lru/yandex/taxi/settings/profile/UserInfoProfileView;", "userInfo", "Lgky;", "linkAccountsViewFactory", "Lfhf0;", "ultimaViewFactory", "<init>", "(Landroid/content/Context;Ltls;Lpav;Lru/yandex/taxi/settings/profile/UserInfoProfileView;Lgky;Lfhf0;)V", "Ly130;", "insetsType", "()Ly130;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Luef0;", "Lsgf0;", "uiState", "render", "(Lsgf0;)V", "Lhv11;", "ultimaModeStateInfo", "applyUltimaModeState", "(Lhv11;)V", "", "formattedPhone", "applyPhone", "(Ljava/lang/String;)V", "Llk51;", "yandexPlusInfo", "applyPlusInfo", "(Llk51;)V", "", "visible", "applyLinkAccountsVisibility", "(Z)V", "Lsff0;", "applyRating", "(Lsff0;)V", "Lul21;", "emailState", "disableProfileEditing", "applyEmail", "(Lul21;Z)V", "highlight", "setEmailHighlight", "(ZZ)V", "Ljff0;", "applyName", "(Ljff0;Z)V", "Li20;", ClidProvider.STATE, "applyActiveOrdersState", "(Li20;Z)V", "requestToolbarAccessibilityFocus", "()V", "Ltls;", "Lpav;", "Lru/yandex/taxi/settings/profile/UserInfoProfileView;", "Lgky;", "Lfhf0;", "Lru/yandex/taxi/design/FloatingTitleToolbarComponent;", "toolbarComponent", "Lru/yandex/taxi/design/FloatingTitleToolbarComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "emailItem", "Lru/yandex/taxi/design/ListItemComponent;", "phoneItem", "plusItem", "contentView", "Landroid/view/ViewGroup;", "logoutItem", "nameItem", "ratingItem", "Ljava/lang/Runnable;", "accessibilityFocusCallback", "Ljava/lang/Runnable;", "showCreateNameModalCallback", "Landroid/view/View;", "linkAccountsView", "Landroid/view/View;", "ultimaModeView", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ProfileModalView extends BindingModalView<uef0> {
    public static final int $stable = 8;
    private final Runnable accessibilityFocusCallback;
    private final ViewGroup contentView;
    private final ListItemComponent emailItem;
    private final tls handleAction;
    private final pav imageLoader;
    private View linkAccountsView;
    private final gky linkAccountsViewFactory;
    private final ListItemComponent logoutItem;
    private final ListItemComponent nameItem;
    private final ListItemComponent phoneItem;
    private final ListItemComponent plusItem;
    private final ListItemComponent ratingItem;
    private final Runnable showCreateNameModalCallback;
    private final FloatingTitleToolbarComponent toolbarComponent;
    private View ultimaModeView;
    private final fhf0 ultimaViewFactory;
    private final UserInfoProfileView userInfo;

    public ProfileModalView(Context context, tls tlsVar, pav pavVar, UserInfoProfileView userInfoProfileView, gky gkyVar, fhf0 fhf0Var) {
        super(context);
        this.handleAction = tlsVar;
        this.imageLoader = pavVar;
        this.userInfo = userInfoProfileView;
        this.linkAccountsViewFactory = gkyVar;
        this.ultimaViewFactory = fhf0Var;
        int i = a9h0.toolbar;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        FloatingTitleToolbarComponent floatingTitleToolbarComponent = (FloatingTitleToolbarComponent) ((View) rp31.d(this, i));
        this.toolbarComponent = floatingTitleToolbarComponent;
        this.emailItem = (ListItemComponent) ((View) rp31.d(this, a9h0.email_item));
        this.phoneItem = (ListItemComponent) ((View) rp31.d(this, a9h0.phone_item));
        this.plusItem = (ListItemComponent) ((View) rp31.d(this, agh0.plus_list_item));
        this.contentView = (ViewGroup) ((View) rp31.d(this, a9h0.profile_content));
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(this, a9h0.logout_item));
        this.logoutItem = listItemComponent;
        this.nameItem = (ListItemComponent) ((View) rp31.d(this, a9h0.name_item));
        this.ratingItem = (ListItemComponent) ((View) rp31.d(this, a9h0.rating_item));
        bff0 bff0Var = new bff0(this, 2);
        this.accessibilityFocusCallback = bff0Var;
        this.showCreateNameModalCallback = new bff0(this, 3);
        floatingTitleToolbarComponent.setTitleView(userInfoProfileView);
        userInfoProfileView.setDebounceClickListener(new bff0(this, 4));
        bdc bdcVar = new bdc(xng0.textMain);
        listItemComponent.setTitleTextColor(bdcVar);
        listItemComponent.setSubtitleTextColor(bdcVar);
        listItemComponent.setDebounceClickListener(new bff0(this, 5));
        floatingTitleToolbarComponent.setOnBackClickListener(new bff0(this, 6));
        floatingTitleToolbarComponent.postDelayed(bff0Var, 500L);
        setAnimationDelegate(lh2.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ProfileModalView profileModalView) {
        profileModalView.handleAction.invoke(scf0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ProfileModalView profileModalView) {
        profileModalView.handleAction.invoke(ncf0.a);
    }

    private final void applyActiveOrdersState(i20 state, boolean disableProfileEditing) {
        UserInfoProfileView userInfoProfileView = this.userInfo;
        boolean z = state.a;
        boolean z2 = state.b;
        userInfoProfileView.setEnabled(z);
        ListItemComponent listItemComponent = this.phoneItem;
        boolean z3 = state.a;
        listItemComponent.setEnabled(z3);
        this.phoneItem.setTrailMode((!z3 || disableProfileEditing) ? 0 : 2);
        this.logoutItem.setEnabled(z2);
        this.logoutItem.setSubtitle(state.c);
        this.logoutItem.setContentAlpha(z2 ? 1.0f : 0.5f);
    }

    private final void applyEmail(ul21 emailState, boolean disableProfileEditing) {
        ListItemComponent listItemComponent = this.emailItem;
        boolean z = emailState.d;
        String str = emailState.a;
        listItemComponent.setVisibility(z ? 0 : 8);
        this.emailItem.setTitle(str);
        this.emailItem.title().setVisibility(evu0.J(str) ? 8 : 0);
        this.emailItem.setSubtitle(emailState.b);
        setEmailHighlight(emailState.c, disableProfileEditing);
    }

    private final void applyLinkAccountsVisibility(boolean visible) {
        if (visible && this.linkAccountsView == null) {
            gky gkyVar = this.linkAccountsViewFactory;
            ViewGroup viewGroup = this.contentView;
            Events$Zalogin$LinkageContext events$Zalogin$LinkageContext = Events$Zalogin$LinkageContext.PROFILE;
            hky hkyVar = (hky) gkyVar;
            hkyVar.getClass();
            ListItemComponent listItemComponent = (ListItemComponent) LayoutInflater.from(viewGroup.getContext()).inflate(yoh0.link_accounts_view, viewGroup, false);
            listItemComponent.addOnAttachStateChangeListener(new LinkAccountsViewFactoryImpl$createLinkAccountsView$1(listItemComponent, hkyVar, events$Zalogin$LinkageContext));
            ViewGroup viewGroup2 = this.contentView;
            viewGroup2.addView(listItemComponent, viewGroup2.indexOfChild(this.phoneItem));
            this.linkAccountsView = listItemComponent;
        }
        View view = this.linkAccountsView;
        if (view != null) {
            view.setVisibility(visible ? 0 : 8);
        }
    }

    private final void applyName(jff0 uiState, boolean disableProfileEditing) {
        int i = 8;
        if (uiState instanceof iff0) {
            this.nameItem.setVisibility(8);
            return;
        }
        if (!(uiState instanceof hff0)) {
            if (!(uiState instanceof gff0)) {
                w511.b();
                return;
            }
            this.nameItem.setTitle(kyh0.user_profile_name_title);
            this.nameItem.title().setVisibility(8);
            this.nameItem.setSubtitle(((gff0) uiState).a);
            this.nameItem.setSubtitleColorAttr(xng0.textMain);
            this.nameItem.setVisibility(0);
            if (disableProfileEditing) {
                return;
            }
            this.nameItem.setDebounceClickListener(new bff0(this, 9));
            return;
        }
        this.nameItem.setTitle("");
        this.nameItem.title().setVisibility(8);
        this.nameItem.setSubtitle(kyh0.user_profile_name_hint);
        this.nameItem.setSubtitleColorAttr(xng0.textMinor);
        this.nameItem.setVisibility(0);
        boolean z = ((hff0) uiState).a;
        if (z) {
            this.contentView.postDelayed(this.showCreateNameModalCallback, 100L);
            if (disableProfileEditing) {
                return;
            }
            this.nameItem.setDebounceClickListener(new bff0(this, 7));
            return;
        }
        if (z) {
            w511.b();
        } else {
            if (disableProfileEditing) {
                return;
            }
            this.nameItem.setDebounceClickListener(new bff0(this, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyName$lambda$0(ProfileModalView profileModalView) {
        profileModalView.handleAction.invoke(new ycf0(false));
        if (ru.yandex.taxi.design.utils.c.p(profileModalView) != null) {
            profileModalView.handleAction.invoke(wcf0.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyName$lambda$1(ProfileModalView profileModalView) {
        profileModalView.handleAction.invoke(ocf0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyName$lambda$2(ProfileModalView profileModalView) {
        profileModalView.handleAction.invoke(ocf0.a);
    }

    private final void applyPhone(String formattedPhone) {
        if (formattedPhone == null || evu0.J(formattedPhone)) {
            this.phoneItem.setVisibility(8);
        } else {
            this.phoneItem.setVisibility(0);
            this.phoneItem.setSubtitle(formattedPhone);
        }
    }

    private final void applyPlusInfo(lk51 yandexPlusInfo) {
        ListItemComponent listItemComponent = this.plusItem;
        if (yandexPlusInfo == lk51.e) {
            listItemComponent.setVisibility(8);
            this.emailItem.setDividers(DividerPosition.NONE, DividerType.NONE);
            return;
        }
        listItemComponent.setVisibility(0);
        this.plusItem.setTitle(yandexPlusInfo.c);
        this.plusItem.setSubtitle(yandexPlusInfo.d);
        ((nac) this.imageLoader.a(this.plusItem.getLeadImageView())).b(new qbv(yandexPlusInfo.a));
        this.emailItem.setDividers(DividerPosition.BOTTOM, DividerType.MARGIN);
        ListItemComponent listItemComponent2 = this.plusItem;
        listItemComponent2.setLeadImagePadding(ru.yandex.taxi.design.utils.c.d(mrg0.go_design_m_space, listItemComponent2));
        ListItemComponent listItemComponent3 = this.plusItem;
        listItemComponent3.setLeadImageSize(ru.yandex.taxi.design.utils.c.h(84, listItemComponent3));
    }

    private final void applyRating(sff0 uiState) {
        if (uiState instanceof pff0) {
            this.ratingItem.setVisibility(8);
            return;
        }
        if (uiState instanceof qff0) {
            this.ratingItem.setTitle(kyh0.user_profile_rating_title);
            this.ratingItem.setSubtitle(((qff0) uiState).a);
            this.ratingItem.setVisibility(0);
            this.ratingItem.setTrailMode(0);
            this.ratingItem.setTrailContainerClickListener(null);
            return;
        }
        if (!(uiState instanceof rff0)) {
            w511.b();
            return;
        }
        this.ratingItem.setTitle(kyh0.user_profile_rating_title);
        rff0 rff0Var = (rff0) uiState;
        this.ratingItem.setSubtitle(rff0Var.a);
        this.ratingItem.setVisibility(0);
        String str = rff0Var.c;
        z750 navigationIconParams = this.ratingItem.getNavigationIconParams();
        navigationIconParams.d = evu0.J(str) ? twg0.ic_rating_info : dzg0.chevron_next;
        navigationIconParams.b = new bdc(xng0.textMain);
        navigationIconParams.a();
        this.ratingItem.setTrailMode(2);
        this.ratingItem.setDebounceClickListener(new yo90(28, this, rff0Var));
        this.ratingItem.setTrailCompanionText(str);
        this.ratingItem.setTrailCompanionTextMaxLines(1);
        this.ratingItem.setTrailCompanionTextEllipsize(TextUtils.TruncateAt.END);
        OneShotPreDrawListener.add(this.ratingItem, new ii30(17, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyRating$lambda$0(ProfileModalView profileModalView, sff0 sff0Var) {
        profileModalView.handleAction.invoke(new ucf0(((rff0) sff0Var).b));
    }

    private final void applyUltimaModeState(hv11 ultimaModeStateInfo) {
        int i;
        if (ultimaModeStateInfo.a && this.ultimaModeView == null) {
            fhf0 fhf0Var = this.ultimaViewFactory;
            Context context = getContext();
            ugf0 ugf0Var = (ugf0) ((dj3) fhf0Var).a.get();
            context.getClass();
            ugf0Var.getClass();
            exu0 exu0Var = ugf0Var.b;
            q5z.h(exu0Var);
            pwy0 pwy0Var = ugf0Var.f;
            q5z.h(pwy0Var);
            com.yandex.go.ultima_mode.action.a aVar = ugf0Var.i;
            q5z.h(aVar);
            irs0 irs0Var = ugf0Var.c;
            q5z.h(irs0Var);
            yu11 yu11Var = ugf0Var.h;
            q5z.h(yu11Var);
            xdf xdfVar = ugf0Var.d;
            q5z.h(xdfVar);
            e eVar = ugf0Var.e;
            q5z.h(eVar);
            com.yandex.go.ultima_mode.profile.state.a aVar2 = new com.yandex.go.ultima_mode.profile.state.a(irs0Var, yu11Var, new com.yandex.go.ultima_mode.ui.header.state.a(xdfVar, eVar, yu11Var), new com.yandex.go.ultima_mode.ui.progress_bar.state.a(xdfVar, eVar));
            tv11 tv11Var = ugf0Var.j;
            q5z.h(tv11Var);
            com.yandex.go.ultima_mode.preferences.a aVar3 = ugf0Var.k;
            q5z.h(aVar3);
            pho phoVar = ugf0Var.g;
            q5z.h(phoVar);
            ProfileUltimaModeView profileUltimaModeView = new ProfileUltimaModeView(context, exu0Var, new com.yandex.go.ultima_mode.profile.mvp.a(pwy0Var, aVar, aVar2, tv11Var, aVar3, new o7r0(phoVar)), ugf0Var);
            i = 0;
            this.contentView.addView(profileUltimaModeView, 0);
            this.ultimaModeView = profileUltimaModeView;
        } else {
            i = 0;
        }
        View view = this.ultimaModeView;
        if (view != null) {
            if (!ultimaModeStateInfo.a) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(ProfileModalView profileModalView) {
        return profileModalView.getBinding().a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$0(ProfileModalView profileModalView) {
        profileModalView.handleAction.invoke(rcf0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$0(ProfileModalView profileModalView) {
        profileModalView.handleAction.invoke(vcf0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$1(ProfileModalView profileModalView) {
        profileModalView.handleAction.invoke(tcf0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$2(ProfileModalView profileModalView) {
        profileModalView.handleAction.invoke(qcf0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestToolbarAccessibilityFocus() {
        this.toolbarComponent.requestToolbarAccessibilityFocus();
    }

    private final void setEmailHighlight(boolean highlight, boolean disableProfileEditing) {
        int t = qje.t(highlight ? xng0.textOnControl : xng0.textMain, getContext());
        this.emailItem.setBackground(getContext().getDrawable(highlight ? dzg0.component_selected_list_item_bg : dzg0.component_default_list_item_bg));
        this.emailItem.setTitleTextColor(t);
        this.emailItem.setSubtitleTextColor(t);
        if (disableProfileEditing) {
            return;
        }
        z750 navigationIconParams = this.emailItem.getNavigationIconParams();
        navigationIconParams.b = new cdc(t);
        navigationIconParams.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCreateNameModalCallback$lambda$0(ProfileModalView profileModalView) {
        profileModalView.handleAction.invoke(new ycf0(true));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.BindingModalView
    public uef0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(klh0.profile_layout, parent, false);
        int i = a9h0.email_item;
        if (((ListItemComponent) cma1.O(i, inflate)) != null) {
            i = a9h0.logout_item;
            if (((ListItemComponent) cma1.O(i, inflate)) != null) {
                i = a9h0.name_item;
                if (((ListItemComponent) cma1.O(i, inflate)) != null) {
                    i = a9h0.phone_item;
                    if (((ListItemComponent) cma1.O(i, inflate)) != null) {
                        i = a9h0.profile_content;
                        if (((LinearLayout) cma1.O(i, inflate)) != null) {
                            i = a9h0.profile_scroll_view;
                            if (((SingleClickScrollView) cma1.O(i, inflate)) != null) {
                                i = a9h0.rating_item;
                                if (((ListItemComponent) cma1.O(i, inflate)) != null) {
                                    i = a9h0.toolbar;
                                    if (((FloatingTitleToolbarComponent) cma1.O(i, inflate)) != null) {
                                        return new uef0((FrameLayout) inflate);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public y130 insetsType() {
        return new y130(1, new r0d0(24, this));
    }

    public final void render(sgf0 uiState) {
        applyPhone(uiState.b);
        applyPlusInfo(uiState.g);
        applyLinkAccountsVisibility(uiState.f);
        applyRating(uiState.d);
        jff0 jff0Var = uiState.e;
        boolean z = uiState.n;
        applyName(jff0Var, z);
        applyEmail(uiState.c, z);
        applyActiveOrdersState(uiState.h, z);
        applyUltimaModeState(uiState.i);
        if (!uiState.k || z) {
            this.userInfo.setTrailContainerClickListener(null);
        } else {
            this.userInfo.setTrailContainerClickListener(new bff0(this, 10));
        }
        ListItemComponent listItemComponent = this.emailItem;
        if (z) {
            listItemComponent.setDebounceClickListener(null);
            this.phoneItem.setDebounceClickListener(null);
        } else {
            listItemComponent.setDebounceClickListener(new bff0(this, 0));
            this.phoneItem.setDebounceClickListener(new bff0(this, 1));
        }
    }
}
