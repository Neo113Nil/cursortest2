package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import defpackage.ct31;
import defpackage.e890;
import defpackage.ffx;
import defpackage.phl0;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0001\u001aB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R8\u0010\u001c\u001a&\u0012\u0004\u0012\u00020\u0012\u0012\b\u0012\u00060\u001aR\u00020\u00000\u0019j\u0012\u0012\u0004\u0012\u00020\u0012\u0012\b\u0012\u00060\u001aR\u00020\u0000`\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/yandex/div/internal/widget/tabs/RtlViewPager;", "Landroidx/viewpager/widget/ViewPager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getCurrentItem", "()I", "position", "", "smoothScroll", "Lzy11;", "setCurrentItem", "(IZ)V", "(I)V", "Lct31;", "listener", "addOnPageChangeListener", "(Lct31;)V", "removeOnPageChangeListener", "clearOnPageChangeListeners", "()V", "Ljava/util/HashMap;", "Lphl0;", "Lkotlin/collections/HashMap;", "pageChangeListeners", "Ljava/util/HashMap;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class RtlViewPager extends ViewPager {
    private final HashMap<ct31, phl0> pageChangeListeners;

    public RtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.pageChangeListeners = new HashMap<>();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(ct31 listener) {
        phl0 phl0Var = new phl0(this, listener);
        this.pageChangeListeners.put(listener, phl0Var);
        super.addOnPageChangeListener(phl0Var);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void clearOnPageChangeListeners() {
        super.clearOnPageChangeListeners();
        this.pageChangeListeners.clear();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        return (super.getAdapter() == null || !ffx.W(this)) ? currentItem : (r1.b() - currentItem) - 1;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void removeOnPageChangeListener(ct31 listener) {
        phl0 remove = this.pageChangeListeners.remove(listener);
        if (remove != null) {
            super.removeOnPageChangeListener(remove);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int position, boolean smoothScroll) {
        e890 adapter = super.getAdapter();
        if (adapter != null && ffx.W(this)) {
            position = (adapter.b() - position) - 1;
        }
        super.setCurrentItem(position, smoothScroll);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int position) {
        e890 adapter = super.getAdapter();
        if (adapter != null && ffx.W(this)) {
            position = (adapter.b() - position) - 1;
        }
        super.setCurrentItem(position);
    }
}
