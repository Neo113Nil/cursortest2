package com.yandex.go.scooters.background;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ajl0;
import defpackage.cma1;
import defpackage.e230;
import defpackage.h8;
import defpackage.jl40;
import defpackage.mqg0;
import defpackage.v130;
import defpackage.vpa;
import defpackage.wzm0;
import defpackage.zgz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.animation.AnimUtils$AnimationStartEndListener;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010#¨\u0006%"}, d2 = {"Lcom/yandex/go/scooters/background/ScootersBackgroundModalView;", "Lru/yandex/taxi/widget/ModalView;", "Lwzm0;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Le230;", "insetsType", "()Le230;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Ljava/lang/Runnable;", "onBackPressedListener", "setOnBackPressedListener", "(Ljava/lang/Runnable;)V", "startAction", "endAction", "animateDismiss", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "view", "attach", "(Landroid/view/View;)V", "detach", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersBackgroundModalView extends ModalView implements wzm0 {
    public static final int $stable = 8;

    public ScootersBackgroundModalView(Context context) {
        super(context);
        setAnimateOnAppearing(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detach$lambda$0() {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        cma1.L(getContent()).setListener(new AnimUtils$AnimationStartEndListener(startAction, endAction));
    }

    @Override // defpackage.wzm0
    public void attach(View view) {
        if (jl40.l(view.getParent(), this)) {
            zgz.a(null, new IllegalArgumentException("Attach already attached view"));
        } else if (view.getParent() != null) {
            zgz.a(null, new IllegalArgumentException("Attach view with unknown parent"));
        } else {
            addView(view);
            cma1.J(view);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        return this;
    }

    @Override // defpackage.wzm0
    public void detach(View view) {
        if (view.getParent() == null) {
            zgz.a(null, new IllegalArgumentException("Detach view with parent null"));
        } else if (jl40.l(view.getParent(), this)) {
            cma1.L(view).setListener(new AnimUtils$AnimationStartEndListener(new vpa(21), new ajl0(11, this, view)));
        } else {
            zgz.a(null, new IllegalArgumentException("Detach view with unknown parent"));
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new v130(3);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        setInterceptOnBackPress(false);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Iterable iterable;
        super.onDetachedFromWindow();
        h8 h8Var = new h8(3, this);
        if (h8Var.hasNext()) {
            Object next = h8Var.next();
            if (h8Var.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (h8Var.hasNext()) {
                    arrayList.add(h8Var.next());
                }
                iterable = arrayList;
            } else {
                iterable = Collections.singletonList(next);
            }
        } else {
            iterable = EmptyList.a;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((View) it.next()).animate().cancel();
        }
        removeAllViews();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void setOnBackPressedListener(Runnable onBackPressedListener) {
    }
}
