package com.yandex.go.superapp.web.modal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.superapp.web.view.SuperAppWebView;
import defpackage.dzg0;
import defpackage.f8h0;
import defpackage.pkh0;
import defpackage.rp31;
import defpackage.vjp0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.eatskit.WebContentView;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/yandex/go/superapp/web/modal/WebModalViewContent;", "Landroid/widget/FrameLayout;", "Lvjp0;", "Landroid/content/Context;", "context", "Lcom/yandex/go/superapp/web/view/SuperAppWebView;", "superAppWebView", "<init>", "(Landroid/content/Context;Lcom/yandex/go/superapp/web/view/SuperAppWebView;)V", "", "canScrollUp", "()Z", "Ljava/lang/Runnable;", "onBackPressed", "Lzy11;", "showToolbar", "(Ljava/lang/Runnable;)V", "onClosePressed", "showCloseButton", "Lcom/yandex/go/superapp/web/view/SuperAppWebView;", "getSuperAppWebView", "()Lcom/yandex/go/superapp/web/view/SuperAppWebView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/yandex/taxi/eatskit/WebContentView;", "contentView", "Lru/yandex/taxi/eatskit/WebContentView;", "getContentView", "()Lru/yandex/taxi/eatskit/WebContentView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class WebModalViewContent extends FrameLayout implements vjp0 {
    private final ConstraintLayout container;
    private final WebContentView contentView;
    private final SuperAppWebView superAppWebView;

    public WebModalViewContent(Context context, SuperAppWebView superAppWebView) {
        super(context);
        this.superAppWebView = superAppWebView;
        ru.yandex.taxi.design.utils.c.q(this, pkh0.web_modal_view_content, true);
        int i = f8h0.container;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.container = (ConstraintLayout) ((View) rp31.d(this, i));
        this.contentView = (WebContentView) ((View) rp31.d(this, f8h0.superapp_content));
        ((ViewGroup) ((View) rp31.d(this, f8h0.root))).addView(superAppWebView, 0);
    }

    @Override // defpackage.vjp0
    public boolean canScrollUp() {
        return this.superAppWebView.canScrollUp() || this.contentView.getHasSwipeArea();
    }

    public final ConstraintLayout getContainer() {
        return this.container;
    }

    public final WebContentView getContentView() {
        return this.contentView;
    }

    public final SuperAppWebView getSuperAppWebView() {
        return this.superAppWebView;
    }

    public final void showCloseButton(Runnable onClosePressed) {
        ToolbarComponent toolbarComponent = (ToolbarComponent) findViewById(f8h0.superapp_toolbar);
        if (toolbarComponent == null) {
            return;
        }
        toolbarComponent.setTrailImage(dzg0.ic_cross_close);
        toolbarComponent.setTrailContainerClickListener(onClosePressed);
    }

    public final void showToolbar(Runnable onBackPressed) {
        ToolbarComponent toolbarComponent = (ToolbarComponent) findViewById(f8h0.superapp_toolbar);
        if (toolbarComponent == null) {
            return;
        }
        toolbarComponent.setVisibility(0);
        toolbarComponent.setOnNavigationClickListener(onBackPressed);
    }
}
