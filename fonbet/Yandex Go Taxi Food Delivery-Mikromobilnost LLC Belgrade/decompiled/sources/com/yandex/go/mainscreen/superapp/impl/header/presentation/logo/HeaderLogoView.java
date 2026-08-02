package com.yandex.go.mainscreen.superapp.impl.header.presentation.logo;

import android.content.Context;
import android.graphics.Bitmap;
import defpackage.f0w0;
import defpackage.jlh;
import defpackage.m2h0;
import defpackage.nwy0;
import defpackage.pwy0;
import defpackage.qpo;
import defpackage.rau;
import defpackage.sau;
import defpackage.tje;
import kotlin.Metadata;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ShimmeringImageView;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B+\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u0012J\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"¨\u0006#"}, d2 = {"Lcom/yandex/go/mainscreen/superapp/impl/header/presentation/logo/HeaderLogoView;", "Lru/yandex/taxi/widget/ShimmeringImageView;", "Lrau;", "Lnwy0;", "Landroid/content/Context;", "context", "Lsau;", "presenter", "Lpwy0;", "themeSwitcherProvider", "Lf0w0;", "superAppHeaderLogoViewDelegate", "<init>", "(Landroid/content/Context;Lsau;Lpwy0;Lf0w0;)V", "", "isLogoShort", "Lzy11;", "setDefaultLogoResource", "(Z)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/graphics/Bitmap;", "bitmap", "smooth", "setLogoBitmap", "(Landroid/graphics/Bitmap;Z)V", "setDefaultLogo", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lsau;", "Lpwy0;", "Lf0w0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HeaderLogoView extends ShimmeringImageView implements rau, nwy0 {
    private final sau presenter;
    private final f0w0 superAppHeaderLogoViewDelegate;
    private final pwy0 themeSwitcherProvider;

    public HeaderLogoView(Context context, sau sauVar, pwy0 pwy0Var, f0w0 f0w0Var) {
        super(context, null, 0, 6, null);
        this.presenter = sauVar;
        this.themeSwitcherProvider = pwy0Var;
        this.superAppHeaderLogoViewDelegate = f0w0Var;
    }

    private final void setDefaultLogoResource(boolean isLogoShort) {
        int i;
        boolean z = this.themeSwitcherProvider.getThemeType() == ThemeType.LIGHT;
        f0w0 f0w0Var = this.superAppHeaderLogoViewDelegate;
        if (isLogoShort) {
            ((jlh) f0w0Var).getClass();
            i = z ? m2h0.ic_default_logo_short : m2h0.ic_default_logo_short_night;
        } else {
            ((jlh) f0w0Var).getClass();
            i = z ? m2h0.ic_default_logo : m2h0.ic_default_logo_night;
        }
        setImageResource(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setLogoBitmap$lambda$0(HeaderLogoView headerLogoView, Bitmap bitmap) {
        headerLogoView.setImageBitmap(bitmap);
        headerLogoView.animate().setDuration(50L).alpha(1.0f);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        setDefaultLogoResource(false);
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTransitionName("splash_logo_transition");
        sau sauVar = this.presenter;
        sauVar.Bg(this);
        tje.N(sauVar.Jg(), null, null, new HeaderLogoPresenter$attachView$1(this, sauVar, null), 3);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // defpackage.rau
    public void setDefaultLogo(boolean isLogoShort) {
        setDefaultLogoResource(isLogoShort);
    }

    @Override // defpackage.rau
    public void setLogoBitmap(Bitmap bitmap, boolean smooth) {
        if (!smooth) {
            setImageBitmap(bitmap);
        } else {
            animate().cancel();
            animate().setDuration(50L).alpha(0.0f).withEndAction(new qpo(24, this, bitmap));
        }
    }
}
