package com.yandex.urbanads.internal.divkit.extensions.scrollinteraction;

import android.view.MotionEvent;
import android.view.View;
import defpackage.sls;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/urbanads/internal/divkit/extensions/scrollinteraction/ScrollInteractionTouchListener;", "Landroid/view/View$OnTouchListener;", "Lkotlin/Function0;", "Lzy11;", "onFocus", "onBlur", "<init>", "(Lsls;Lsls;)V", "", "newState", "updateState", "(Z)V", "Landroid/view/View;", "view", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Lsls;", "focused", "Z", "urbanads-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScrollInteractionTouchListener implements View.OnTouchListener {
    private boolean focused;
    private final sls onBlur;
    private final sls onFocus;

    public ScrollInteractionTouchListener(sls slsVar, sls slsVar2) {
        this.onFocus = slsVar;
        this.onBlur = slsVar2;
    }

    private final void updateState(boolean newState) {
        if (this.focused != newState) {
            this.focused = newState;
            if (newState) {
                this.onFocus.invoke();
            } else {
                this.onBlur.invoke();
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent event) {
        Integer valueOf = event != null ? Integer.valueOf(event.getAction()) : null;
        if ((valueOf != null && valueOf.intValue() == 0) || (valueOf != null && valueOf.intValue() == 2)) {
            updateState(true);
        } else if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
            updateState(false);
        }
        return false;
    }
}
