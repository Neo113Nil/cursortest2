package com.yandex.plus.home.feature.webviews.internal.container;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import defpackage.dje;
import defpackage.gje;
import defpackage.nvg0;
import defpackage.sls;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u0012J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u0012J\u000f\u0010\u001c\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001e¨\u0006\""}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internal/container/SimpleContentViewContainer;", "Landroid/widget/FrameLayout;", "Ldje;", "Landroid/content/Context;", "context", "", "isSlideAnimationEnabled", "Lgje;", "viewHolder", "Lkotlin/Function0;", "Lzy11;", "onHidden", "<init>", "(Landroid/content/Context;ZLgje;Lsls;)V", "", "getOutOfScreenTranslation", "()F", "show", "()V", "hide", "onStart", "onResume", "onPause", "onStop", "disableSwipeClose", "enableSwipeClose", "onHasStartedBeingOverlapped", "onHasStoppedBeingOverlapped", "onBackPressed", "()Z", "Z", "Lgje;", "Lsls;", "isContentVisible", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SimpleContentViewContainer extends FrameLayout implements dje {
    private boolean isContentVisible;
    private final boolean isSlideAnimationEnabled;
    private final sls onHidden;
    private final gje viewHolder;

    public SimpleContentViewContainer(Context context, boolean z, gje gjeVar, sls slsVar) {
        super(context);
        this.isSlideAnimationEnabled = z;
        this.viewHolder = gjeVar;
        this.onHidden = slsVar;
        this.isContentVisible = true;
        float dimension = getResources().getDimension(nvg0.plus_sdk_mu_1);
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.m(this, dimension);
        addView(gjeVar.getView());
    }

    private final float getOutOfScreenTranslation() {
        return getContext().getResources().getConfiguration().getLayoutDirection() == 1 ? -getWidth() : getWidth();
    }

    @Override // defpackage.dje
    public void disableSwipeClose() {
    }

    @Override // defpackage.dje
    public void enableSwipeClose() {
    }

    @Override // defpackage.dje
    public void hide() {
        if (this.isSlideAnimationEnabled) {
            setTranslationX(0.0f);
            animate().translationX(getOutOfScreenTranslation()).setListener(new AnimatorListenerAdapter() { // from class: com.yandex.plus.home.feature.webviews.internal.container.SimpleContentViewContainer$hide$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animation) {
                    sls slsVar;
                    slsVar = SimpleContentViewContainer.this.onHidden;
                    slsVar.invoke();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    sls slsVar;
                    slsVar = SimpleContentViewContainer.this.onHidden;
                    slsVar.invoke();
                }
            });
        } else {
            this.isContentVisible = false;
            this.onHidden.invoke();
        }
    }

    @Override // defpackage.dje
    public boolean onBackPressed() {
        if (this.viewHolder.onBackPressed()) {
            return true;
        }
        if (!this.isContentVisible || getTranslationX() == getWidth()) {
            return false;
        }
        hide();
        return true;
    }

    @Override // defpackage.dje
    public void onHasStartedBeingOverlapped() {
        this.viewHolder.onHasStartedBeingOverlapped();
    }

    @Override // defpackage.dje
    public void onHasStoppedBeingOverlapped() {
        this.viewHolder.onHasStoppedBeingOverlapped();
    }

    @Override // defpackage.dje
    public void onPause() {
        this.viewHolder.onPause();
    }

    @Override // defpackage.dje
    public void onResume() {
        this.viewHolder.onResume();
    }

    @Override // defpackage.dje
    public void onStart() {
        this.viewHolder.onStart();
    }

    @Override // defpackage.dje
    public void onStop() {
        this.viewHolder.onStop();
    }

    @Override // defpackage.dje
    public void show() {
        if (this.isSlideAnimationEnabled) {
            setTranslationX(getOutOfScreenTranslation());
            animate().translationX(0.0f);
        }
    }
}
