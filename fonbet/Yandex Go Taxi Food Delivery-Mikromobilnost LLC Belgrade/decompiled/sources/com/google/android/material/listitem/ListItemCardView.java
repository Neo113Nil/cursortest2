package com.google.android.material.listitem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import defpackage.dfz0;
import defpackage.eng0;
import defpackage.g2i0;
import defpackage.g810;
import defpackage.gyw0;
import defpackage.org0;
import defpackage.p2k0;
import defpackage.yvy0;
import defpackage.z2i0;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes11.dex */
public class ListItemCardView extends MaterialCardView implements gyw0 {
    private static final int[] SWIPED_STATE_SET = {eng0.state_swiped};
    private boolean isSwiped;
    private final LinkedHashSet<a> swipeCallbacks;
    private boolean swipeEnabled;
    private final int swipeMaxOvershoot;

    public static abstract class a {
        public abstract void a();

        public abstract void b();
    }

    public ListItemCardView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(g810.b(context, attributeSet, i, i2), attributeSet, i);
        this.isSwiped = false;
        this.swipeCallbacks = new LinkedHashSet<>();
        Context context2 = getContext();
        this.swipeMaxOvershoot = getResources().getDimensionPixelSize(org0.m3_list_max_swipe_overshoot);
        dfz0 e = yvy0.e(context2, attributeSet, z2i0.ListItemCardView, i, i2, new int[0]);
        this.swipeEnabled = e.b.getBoolean(z2i0.ListItemCardView_swipeEnabled, true);
        e.g();
    }

    public void addSwipeCallback(a aVar) {
        this.swipeCallbacks.add(aVar);
    }

    @Override // defpackage.gyw0
    public int getSwipeMaxOvershoot() {
        return this.swipeMaxOvershoot;
    }

    @Override // defpackage.gyw0
    public boolean isSwipeEnabled() {
        return this.swipeEnabled;
    }

    @Override // com.google.android.material.card.MaterialCardView, android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.isSwiped) {
            View.mergeDrawableStates(onCreateDrawableState, SWIPED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // defpackage.gyw0
    public void onSwipe(int i) {
        Iterator<a> it = this.swipeCallbacks.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // defpackage.gyw0
    public <T extends View & p2k0> void onSwipeStateChanged(int i, T t, int i2) {
        this.isSwiped = i != 3;
        refreshDrawableState();
        Iterator<a> it = this.swipeCallbacks.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void removeSwipeCallback(a aVar) {
        this.swipeCallbacks.remove(aVar);
    }

    public void setSwipeEnabled(boolean z) {
        this.swipeEnabled = z;
    }

    public ListItemCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.listItemCardViewStyle);
    }

    public ListItemCardView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, g2i0.Widget_Material3_ListItemCardView);
    }

    public ListItemCardView(Context context) {
        this(context, null);
    }
}
