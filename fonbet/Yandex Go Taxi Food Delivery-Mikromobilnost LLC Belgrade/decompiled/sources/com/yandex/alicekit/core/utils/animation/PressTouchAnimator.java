package com.yandex.alicekit.core.utils.animation;

import android.animation.Animator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import defpackage.jc90;
import defpackage.l76;
import defpackage.z83;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R(\u0010\"\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\"\u0010#\u0012\u0004\b'\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\u000f¨\u0006)"}, d2 = {"Lcom/yandex/alicekit/core/utils/animation/PressTouchAnimator;", "Landroid/view/View$OnTouchListener;", "Landroid/animation/Animator$AnimatorListener;", "Landroid/view/View;", "view", "", "initialValue", "Ljc90;", "parameterAnimator", "<init>", "(Landroid/view/View;FLjc90;)V", "", "newState", "Lzy11;", "setNewState", "(I)V", "", "expectation", "checkStateTransition", "(IZ)V", "Landroid/animation/Animator;", "animator", "onAnimationEnd", "(Landroid/animation/Animator;)V", "onAnimationStart", "onAnimationCancel", "onAnimationRepeat", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Landroid/view/View;", "F", "Ljc90;", ClidProvider.STATE, CA20Status.STATUS_USER_I, "getState", "()I", "setState", "getState$annotations", "()V", "core-utils_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PressTouchAnimator implements View.OnTouchListener, Animator.AnimatorListener {
    private final float initialValue;
    private final jc90 parameterAnimator;
    private int state;
    private final View view;

    public PressTouchAnimator(View view, float f, jc90 jc90Var) {
        this.view = view;
        this.initialValue = f;
        this.parameterAnimator = jc90Var;
    }

    private final void checkStateTransition(int newState, boolean expectation) {
        z83.h("Bad state transition " + this.state + " => " + newState, expectation);
    }

    public static /* synthetic */ void getState$annotations() {
    }

    private final void setNewState(int newState) {
        if (newState == 0) {
            checkStateTransition(newState, this.state == 4);
        } else if (newState == 1) {
            int i = this.state;
            checkStateTransition(newState, i == 0 || i == 4 || i == 2);
            if (this.state != 2) {
                jc90 jc90Var = this.parameterAnimator;
                ViewPropertyAnimator listener = this.view.animate().setListener(this);
                float f = this.initialValue;
                this.parameterAnimator.getClass();
                ((l76) jc90Var).getClass();
                listener.setDuration(100L).alpha(f * 0.6f).start();
            }
        } else if (newState == 2) {
            checkStateTransition(newState, this.state == 1);
        } else if (newState == 3) {
            checkStateTransition(newState, this.state == 1);
        } else if (newState != 4) {
            checkStateTransition(newState, false);
        } else {
            int i2 = this.state;
            checkStateTransition(newState, i2 == 1 || i2 == 3 || i2 == 2);
            jc90 jc90Var2 = this.parameterAnimator;
            ViewPropertyAnimator listener2 = this.view.animate().setListener(this);
            float f2 = this.initialValue;
            ((l76) jc90Var2).getClass();
            listener2.setDuration(100L).alpha(f2).start();
        }
        this.state = newState;
    }

    public final int getState() {
        return this.state;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.state;
        if (i == 1) {
            setNewState(3);
        } else if (i != 2) {
            setNewState(0);
        } else {
            setNewState(4);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent event) {
        z83.b("Each view must have its own animator.", this.view, view);
        if (view.isEnabled() && view.isClickable() && view.hasOnClickListeners()) {
            int action = event.getAction();
            if (action == 0) {
                setNewState(1);
            } else if (action == 1) {
                int i = this.state;
                if (i == 1) {
                    setNewState(2);
                } else if (i != 2) {
                    setNewState(4);
                }
            } else if (action == 3) {
                setNewState(4);
            }
        }
        return false;
    }

    public final void setState(int i) {
        this.state = i;
    }
}
