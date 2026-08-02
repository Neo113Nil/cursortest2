package com.yandex.go.image_viewer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\u0002\b\b¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/yandex/go/image_viewer/ScalingContentViewPager;", "Landroidx/viewpager/widget/ViewPager;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/jvm/JvmOverloads;", "scaling", "", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ScalingContentViewPager extends ViewPager {
    private boolean scaling;

    public /* synthetic */ ScalingContentViewPager(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Integer valueOf = ev != null ? Integer.valueOf(ev.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 5) {
            this.scaling = true;
        } else if (valueOf != null && valueOf.intValue() == 6) {
            this.scaling = false;
        }
        if (this.scaling) {
            return false;
        }
        return super.onInterceptTouchEvent(ev);
    }

    public ScalingContentViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScalingContentViewPager(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
