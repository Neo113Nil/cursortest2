package com.yandex.go.shortcuts.impl.view.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.yandex.go.design.view.GoLinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0011\u0010\u000fR\"\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/shortcuts/impl/view/adapter/PersonalSliderShortcutViewHolder$DisallowInterceptLinearLayout", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "disallowIntercept", "Z", "getDisallowIntercept", "()Z", "setDisallowIntercept", "(Z)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PersonalSliderShortcutViewHolder$DisallowInterceptLinearLayout extends GoLinearLayout {
    private boolean disallowIntercept;

    public /* synthetic */ PersonalSliderShortcutViewHolder$DisallowInterceptLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        getParent().requestDisallowInterceptTouchEvent(this.disallowIntercept);
        return super.dispatchTouchEvent(ev);
    }

    public final boolean getDisallowIntercept() {
        return this.disallowIntercept;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
    
        if (r0 != 3) goto L11;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        if (action != 1) {
            if (action == 2) {
                requestDisallowInterceptTouchEvent(this.disallowIntercept);
            }
            return super.onTouchEvent(event);
        }
        requestDisallowInterceptTouchEvent(!this.disallowIntercept);
        return super.onTouchEvent(event);
    }

    public final void setDisallowIntercept(boolean z) {
        this.disallowIntercept = z;
    }

    public PersonalSliderShortcutViewHolder$DisallowInterceptLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public PersonalSliderShortcutViewHolder$DisallowInterceptLinearLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public PersonalSliderShortcutViewHolder$DisallowInterceptLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.disallowIntercept = true;
        requestDisallowInterceptTouchEvent(true);
    }

    public PersonalSliderShortcutViewHolder$DisallowInterceptLinearLayout(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
