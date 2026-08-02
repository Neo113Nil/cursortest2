package xsna;

import androidx.recyclerview.widget.m;
import java.util.List;

/* compiled from: ActionMenuDiffUtil.kt */
/* loaded from: classes6.dex */
public final class y30 extends m.b {
    public final List<com.vk.superapp.browser.internal.ui.menu.action.b> b;
    public final List<com.vk.superapp.browser.internal.ui.menu.action.b> c;

    /* JADX WARN: Multi-variable type inference failed */
    public y30(List<? extends com.vk.superapp.browser.internal.ui.menu.action.b> list, List<? extends com.vk.superapp.browser.internal.ui.menu.action.b> list2) {
        this.b = list;
        this.c = list2;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areContentsTheSame(int i, int i2) {
        List<com.vk.superapp.browser.internal.ui.menu.action.b> list = this.b;
        int size = list.size();
        List<com.vk.superapp.browser.internal.ui.menu.action.b> list2 = this.c;
        if (i == size && i2 == list2.size()) {
            return true;
        }
        return epx.f(list.get(i), list2.get(i2));
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areItemsTheSame(int i, int i2) {
        List<com.vk.superapp.browser.internal.ui.menu.action.b> list = this.b;
        int size = list.size();
        List<com.vk.superapp.browser.internal.ui.menu.action.b> list2 = this.c;
        return (i == size && i2 == list2.size()) || list.get(i).a() == list2.get(i2).a();
    }

    @Override // androidx.recyclerview.widget.m.b
    public final int getNewListSize() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.m.b
    public final int getOldListSize() {
        return this.b.size();
    }
}
