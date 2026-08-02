package com.yandex.go.user_profile.settings.main;

import android.content.Context;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.account.phonish_upgrade.o;
import com.yandex.go.ui.CircleLoadingImageView;
import defpackage.aog0;
import defpackage.bv11;
import defpackage.evu0;
import defpackage.f1h0;
import defpackage.g18;
import defpackage.hg;
import defpackage.kyh0;
import defpackage.lbm;
import defpackage.mdh;
import defpackage.mrg0;
import defpackage.nac;
import defpackage.nfv;
import defpackage.ngd0;
import defpackage.nn21;
import defpackage.ny61;
import defpackage.o4i0;
import defpackage.obv;
import defpackage.oeh0;
import defpackage.on21;
import defpackage.pav;
import defpackage.pv01;
import defpackage.rol0;
import defpackage.rp31;
import defpackage.rqh0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.usg0;
import defpackage.uyj;
import defpackage.vrg0;
import defpackage.yn21;
import defpackage.zn21;
import defpackage.zy11;
import kotlin.Metadata;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 @2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001AB#\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u000eJ\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001d\u0010\u0013J\u0017\u0010\u001e\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001e\u0010\u0013J\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010\u0013J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\u000eJ\u000f\u0010\"\u001a\u00020\fH\u0014¢\u0006\u0004\b\"\u0010\u000eJ\u000f\u0010#\u001a\u00020\fH\u0014¢\u0006\u0004\b#\u0010\u000eJ\u0017\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u00101\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lcom/yandex/go/user_profile/settings/main/UserInfoView;", "Lru/yandex/taxi/design/ListItemComponent;", "Lnn21;", "Lnwy0;", "Landroid/content/Context;", "context", "Lon21;", "userInfoPresenter", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lon21;Lpav;)V", "Lzy11;", "showSubtitleWithoutUltimaBadge", "()V", "cancelBadgeLoading", "", "url", "showPhoto", "(Ljava/lang/String;)V", "Lcom/yandex/go/ui/CircleLoadingImageView;", "createCircleLoadingImageView", "(Landroid/content/Context;)Lcom/yandex/go/ui/CircleLoadingImageView;", "setUserPhotoAccessibility", "Lzn21;", "userInfo", "setUserInfo", "(Lzn21;)V", "avatarUrl", "setCircleLoadingImage", "setImage", "badgeUrl", "showYaPlusStatus", "hideYaPlusStatus", "onAttachedToWindow", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lon21;", "Lpav;", "Lru/yandex/taxi/widget/b;", "autofitHelper", "Lru/yandex/taxi/widget/b;", "", "imagePadding", CA20Status.STATUS_USER_I, "imageSize", "userPlaceholder", "", "imageIsPlaceholder", "Z", "Lg18;", "badgeLoader", "Lg18;", "circleLoadingImageView", "Lcom/yandex/go/ui/CircleLoadingImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "ultimaBadge", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/view/View;", "ultimaBadgeContainer", "Landroid/view/View;", "Companion", "yn21", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UserInfoView extends ListItemComponent implements nn21 {
    private static final yn21 Companion = new yn21();
    private final ru.yandex.taxi.widget.b autofitHelper;
    private g18 badgeLoader;
    private final CircleLoadingImageView circleLoadingImageView;
    private boolean imageIsPlaceholder;
    private final pav imageLoader;
    private final int imagePadding;
    private final int imageSize;
    private final AppCompatImageView ultimaBadge;
    private final View ultimaBadgeContainer;
    private final on21 userInfoPresenter;
    private final int userPlaceholder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInfoView(Context context, on21 on21Var, pav pavVar) {
        super(context, Xml.asAttributeSet(context.getResources().getXml(o4i0.empty)), aog0.userInfoViewStyle);
        Companion.getClass();
        this.userInfoPresenter = on21Var;
        this.imageLoader = pavVar;
        ru.yandex.taxi.widget.b n = ngd0.n(subtitle(), null, 0);
        n.d(11.0f, 1);
        this.autofitHelper = n;
        this.imagePadding = tje.r(mrg0.go_design_m_space, getContext());
        this.imageSize = tje.r(usg0.list_user_component_avatar_size, getContext());
        this.userPlaceholder = f1h0.ic_user;
        this.badgeLoader = g18.u1;
        setClickable(true);
        setUseAutoAccessibilityDelegate(false);
        hg.a(this);
        setDividers(DividerPosition.NONE, DividerType.NONE);
        setTitleEllipsizeMode(1);
        setTitleMaxLines(2);
        setMinHeight(tje.r(vrg0.main_menu_auth_height, getContext()));
        this.circleLoadingImageView = createCircleLoadingImageView(context);
        View inflate = LayoutInflater.from(context).inflate(rqh0.user_ultima_badge, (ViewGroup) this, false);
        this.ultimaBadgeContainer = inflate;
        this.ultimaBadge = (AppCompatImageView) ((View) rp31.d(inflate, oeh0.iv_ultima));
        labelsContainer().addView(inflate);
    }

    private final void cancelBadgeLoading() {
        this.badgeLoader.cancel();
    }

    private final CircleLoadingImageView createCircleLoadingImageView(Context context) {
        CircleLoadingImageView circleLoadingImageView = new CircleLoadingImageView(context, null, 0, 6, null);
        circleLoadingImageView.init(this.imageLoader);
        int i = this.imageSize;
        circleLoadingImageView.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        circleLoadingImageView.setPadding(this.imagePadding);
        circleLoadingImageView.setImportantForAccessibility(2);
        return circleLoadingImageView;
    }

    private final void setUserPhotoAccessibility() {
        setLeadImportantForAccessibility(1);
        setLeadContentDescription(getContext().getString(kyh0.profile_accessibility_photo));
    }

    private final void showPhoto(String url) {
        setLeadImage(this.userPlaceholder);
        setLeadImageSize(this.imageSize);
        setLeadImagePadding(this.imagePadding);
        setMinimumHeight(this.imageSize);
        setUserPhotoAccessibility();
        lbm a = this.imageLoader.a(getLeadImageView());
        int i = this.imageSize;
        nac nacVar = (nac) a;
        nacVar.f(i, i);
        nacVar.g(nfv.a);
        nacVar.i = new pv01(19, this);
        nacVar.c(url);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showPhoto$lambda$0(UserInfoView userInfoView) {
        userInfoView.setLeadImage(userInfoView.userPlaceholder);
        userInfoView.imageIsPlaceholder = true;
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSubtitleWithoutUltimaBadge() {
        subtitle().setVisibility(0);
        this.ultimaBadgeContainer.setVisibility(8);
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, ru.yandex.taxi.design.DividerAwareComponent, com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        if (this.imageIsPlaceholder) {
            setLeadImage(this.userPlaceholder);
        }
    }

    @Override // defpackage.nn21
    public void hideYaPlusStatus() {
        clearTrailView();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        on21 on21Var = this.userInfoPresenter;
        on21Var.Bg(this);
        tpr t = kotlinx.coroutines.flow.e.t(new a(new tpr[]{new n(new c(on21Var.y.f), new UserInfoPresenter$attachView$authEventFlow$2(on21Var, null)), new rol0(new UserInfoPresenter$attachView$phoneFlow$1(on21Var, null)), new e(on21Var.G.h), on21Var.B.d, new com.yandex.go.account.phonish_upgrade.n(((o) on21Var.D).b.d()), kotlinx.coroutines.flow.e.t(new com.yandex.go.ultima_mode.domain.b(((com.yandex.go.ultima_mode.domain.c) on21Var.E).a.c)), on21Var.F.a()}, on21Var));
        on21Var.K.getClass();
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        tje.N(on21Var.Jg(), null, null, new UserInfoPresenter$attachView$$inlined$collectIn$1(kotlinx.coroutines.flow.e.F(t, mdhVar), null, this), 3);
        tje.N(on21Var.Jg(), null, null, new UserInfoPresenter$collectPlusInfo$$inlined$collectIn$1(kotlinx.coroutines.flow.e.F(new m0(on21Var.H.b(), new g(((com.yandex.go.payments.paymentlist.data.c) on21Var.I).u), new UserInfoPresenter$collectPlusInfo$2(on21Var, null)), mdhVar), null, on21Var), 3);
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (isInEditMode()) {
            return;
        }
        this.userInfoPresenter.Cg();
        cancelBadgeLoading();
    }

    public final void setCircleLoadingImage(String avatarUrl) {
        if (avatarUrl == null || evu0.J(avatarUrl)) {
            clearLeadView();
            setLeadImagePadding(0);
        } else {
            setLeadImagePadding(0);
            setLeadView(this.circleLoadingImageView);
            setUserPhotoAccessibility();
            this.circleLoadingImageView.setImage(avatarUrl, this.imageSize);
        }
    }

    public final void setImage(String avatarUrl) {
        if (avatarUrl != null && !evu0.J(avatarUrl)) {
            showPhoto(avatarUrl);
        } else {
            clearLeadView();
            setLeadImagePadding(0);
        }
    }

    @Override // defpackage.nn21
    public void setUserInfo(zn21 userInfo) {
        setTitle(userInfo.a);
        setSubtitle(userInfo.b);
        subtitle().setContentDescription(userInfo.c);
        this.autofitHelper.b(userInfo.e);
        subtitle().setMaxLines(userInfo.d);
        bv11 bv11Var = userInfo.f;
        cancelBadgeLoading();
        String str = bv11Var.a;
        if (str == null || evu0.J(str)) {
            showSubtitleWithoutUltimaBadge();
            return;
        }
        nac nacVar = (nac) this.imageLoader.a(this.ultimaBadge);
        nacVar.i = new UserInfoView$setUserInfo$1(0, this, UserInfoView.class, "showSubtitleWithoutUltimaBadge", "showSubtitleWithoutUltimaBadge()V", 0);
        String str2 = bv11Var.a;
        if (str2 == null) {
            ny61.g("Required value was null.");
            return;
        }
        this.badgeLoader = nacVar.b(new obv(str2, null, 6, 0));
        this.ultimaBadge.setContentDescription(bv11Var.b);
        subtitle().setVisibility(8);
        this.ultimaBadgeContainer.setVisibility(0);
    }

    @Override // defpackage.nn21
    public void showYaPlusStatus(String badgeUrl) {
        ((nac) this.imageLoader.a(getTrailImageView())).c(badgeUrl);
    }
}
