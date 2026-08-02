package com.yandex.plus.home.feature.webviews.internal.error;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.bb1;
import defpackage.eaj0;
import defpackage.emh0;
import defpackage.i1k0;
import defpackage.lld0;
import defpackage.sls;
import defpackage.v9h0;
import defpackage.ybf;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internal/error/DefaultHomeErrorView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Llld0;", "stringsResolver", "Lkotlin/Function0;", "Lzy11;", "onRetryClick", "<init>", "(Landroid/content/Context;Llld0;Lsls;)V", "setupRetryButton", "()V", "Llld0;", "Lsls;", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultHomeErrorView extends FrameLayout {
    private final sls onRetryClick;
    private final lld0 stringsResolver;

    public DefaultHomeErrorView(Context context, lld0 lld0Var, sls slsVar) {
        super(context);
        this.stringsResolver = lld0Var;
        this.onRetryClick = slsVar;
        bb1.v(this, emh0.plus_sdk_web_view_error_view, true);
        setupRetryButton();
    }

    private final void setupRetryButton() {
        View findViewById = findViewById(v9h0.retry_button);
        new i1k0(findViewById, this.stringsResolver);
        bb1.L(findViewById, new eaj0(1, new ybf(27, this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupRetryButton$lambda$0(DefaultHomeErrorView defaultHomeErrorView) {
        defaultHomeErrorView.onRetryClick.invoke();
        return zy11.a;
    }
}
