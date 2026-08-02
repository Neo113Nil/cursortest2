package com.yandex.go.splash.preload;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.cma1;
import defpackage.epe0;
import defpackage.fkh0;
import defpackage.gpe0;
import defpackage.jpe0;
import defpackage.k7d0;
import defpackage.ny61;
import defpackage.o61;
import defpackage.tje;
import defpackage.v7h0;
import java.util.HashMap;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.progress.CircularProgressBar;

/* loaded from: classes13.dex */
public final class c {
    public final a a;
    public final gpe0 b;
    public final ConstraintLayout c;

    public c(Context context, final a aVar) {
        this.a = aVar;
        View inflate = LayoutInflater.from(context).inflate(fkh0.preload_splash_blocking, (ViewGroup) null, false);
        int i = v7h0.loading_progress_bar;
        CircularProgressBar circularProgressBar = (CircularProgressBar) cma1.O(i, inflate);
        if (circularProgressBar != null) {
            i = v7h0.message_right_space;
            Space space = (Space) cma1.O(i, inflate);
            if (space != null) {
                i = v7h0.message_text_view;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView != null) {
                    i = v7h0.retry_button;
                    ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                    if (buttonComponent != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        this.b = new gpe0(constraintLayout, circularProgressBar, space, robotoTextView, buttonComponent);
                        this.c = constraintLayout;
                        circularProgressBar.setVisibility(8);
                        robotoTextView.setVisibility(8);
                        buttonComponent.setVisibility(8);
                        buttonComponent.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.splash.preload.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar2 = a.this;
                                com.yandex.go.coroutines.b.g(aVar2.Jg(), null, null, new PreloadSplashPresenter$startLoading$1(aVar2, null), 3);
                            }
                        });
                        tje.j(new k7d0(17, this), constraintLayout);
                        constraintLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.splash.preload.PreloadSplashViewHolder$InnerOnAttachStateChangeListener
                            private boolean attached;

                            public final boolean getAttached() {
                                return this.attached;
                            }

                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewAttachedToWindow(View v) {
                                v.requestApplyInsets();
                                c cVar = c.this;
                                a aVar2 = cVar.a;
                                aVar2.Bg(new jpe0(cVar));
                                epe0 epe0Var = aVar2.x;
                                o61 o61Var = epe0Var.a;
                                o61Var.getClass();
                                o61Var.a.a("BlockingLaunch.started", new HashMap(), 1, new HashMap());
                                epe0Var.b.c(PreloadSplashAnalytics$MarkedEvents.Splash);
                                com.yandex.go.coroutines.b.g(aVar2.Jg(), null, null, new PreloadSplashPresenter$startLoading$1(aVar2, null), 3);
                                this.attached = true;
                            }

                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewDetachedFromWindow(View v) {
                                if (this.attached) {
                                    c.this.a.Cg();
                                    this.attached = false;
                                }
                            }

                            public final void setAttached(boolean z) {
                                this.attached = z;
                            }
                        });
                        constraintLayout.setVisibility(8);
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }
}
