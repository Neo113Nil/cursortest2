package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.auf0;
import defpackage.buf0;
import defpackage.cuf0;
import defpackage.lnv0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.u1w;
import defpackage.vih0;
import defpackage.y4a0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public class ProtectionLayout extends FrameLayout {
    private static final Object PROTECTION_VIEW = new Object();
    private cuf0 mGroup;
    private final List<buf0> mProtections;

    public ProtectionLayout(Context context, List<buf0> list) {
        super(context);
        this.mProtections = new ArrayList();
        setProtections(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void addProtectionView(Context context, int i, buf0 buf0Var) {
        int i2;
        int i3;
        int i4;
        auf0 auf0Var = buf0Var.b;
        int i5 = buf0Var.a;
        int i6 = -1;
        if (i5 != 1) {
            if (i5 == 2) {
                i4 = auf0Var.b;
                i3 = 48;
            } else if (i5 == 4) {
                i2 = auf0Var.a;
                i3 = 5;
            } else if (i5 != 8) {
                ny61.g(oyr.i(i5, "Unexpected side: "));
                return;
            } else {
                i4 = auf0Var.b;
                i3 = 80;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i4, i3);
            u1w u1wVar = auf0Var.c;
            layoutParams.leftMargin = u1wVar.a;
            layoutParams.topMargin = u1wVar.b;
            layoutParams.rightMargin = u1wVar.c;
            layoutParams.bottomMargin = u1wVar.d;
            View view = new View(context);
            view.setTag(PROTECTION_VIEW);
            view.setTranslationX(auf0Var.f);
            view.setTranslationY(auf0Var.g);
            view.setAlpha(auf0Var.h);
            boolean z = false;
            view.setVisibility(auf0Var.d ? 0 : 4);
            view.setBackground(auf0Var.e);
            y4a0 y4a0Var = new y4a0(layoutParams, view, z, 25);
            if (auf0Var.i == null) {
                ny61.r("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
                return;
            } else {
                auf0Var.i = y4a0Var;
                addView(view, i, layoutParams);
                return;
            }
        }
        i2 = auf0Var.a;
        i3 = 3;
        i6 = i2;
        i4 = -1;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i6, i4, i3);
        u1w u1wVar2 = auf0Var.c;
        layoutParams2.leftMargin = u1wVar2.a;
        layoutParams2.topMargin = u1wVar2.b;
        layoutParams2.rightMargin = u1wVar2.c;
        layoutParams2.bottomMargin = u1wVar2.d;
        View view2 = new View(context);
        view2.setTag(PROTECTION_VIEW);
        view2.setTranslationX(auf0Var.f);
        view2.setTranslationY(auf0Var.g);
        view2.setAlpha(auf0Var.h);
        boolean z2 = false;
        view2.setVisibility(auf0Var.d ? 0 : 4);
        view2.setBackground(auf0Var.e);
        y4a0 y4a0Var2 = new y4a0(layoutParams2, view2, z2, 25);
        if (auf0Var.i == null) {
        }
    }

    private void addProtectionViews() {
        if (this.mProtections.isEmpty()) {
            return;
        }
        this.mGroup = new cuf0(getOrInstallSystemBarStateMonitor(), this.mProtections);
        int childCount = getChildCount();
        int size = this.mGroup.a.size();
        for (int i = 0; i < size; i++) {
            addProtectionView(getContext(), i + childCount, (buf0) this.mGroup.a.get(i));
        }
    }

    private a getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(vih0.tag_system_bar_state_monitor);
        if (tag instanceof a) {
            return (a) tag;
        }
        a aVar = new a(viewGroup);
        viewGroup.setTag(vih0.tag_system_bar_state_monitor, aVar);
        return aVar;
    }

    private void maybeUninstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(vih0.tag_system_bar_state_monitor);
        if (tag instanceof a) {
            a aVar = (a) tag;
            if (aVar.b.isEmpty()) {
                aVar.a.post(new lnv0(22, aVar));
                viewGroup.setTag(vih0.tag_system_bar_state_monitor, null);
            }
        }
    }

    private void removeProtectionViews() {
        cuf0 cuf0Var;
        if (this.mGroup != null) {
            removeViews(getChildCount() - this.mGroup.a.size(), this.mGroup.a.size());
            int size = this.mGroup.a.size();
            int i = 0;
            while (true) {
                cuf0Var = this.mGroup;
                if (i >= size) {
                    break;
                }
                ((buf0) cuf0Var.a.get(i)).b.i = null;
                i++;
            }
            ArrayList arrayList = cuf0Var.a;
            if (!cuf0Var.f) {
                cuf0Var.f = true;
                cuf0Var.b.b.remove(cuf0Var);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((buf0) arrayList.get(size2)).e = null;
                }
                arrayList.clear();
            }
            this.mGroup = null;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != PROTECTION_VIEW) {
            cuf0 cuf0Var = this.mGroup;
            int childCount = getChildCount() - (cuf0Var != null ? cuf0Var.a.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mGroup != null) {
            removeProtectionViews();
        }
        addProtectionViews();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeProtectionViews();
        maybeUninstallSystemBarStateMonitor();
    }

    public void setProtections(List<buf0> list) {
        this.mProtections.clear();
        this.mProtections.addAll(list);
        if (isAttachedToWindow()) {
            removeProtectionViews();
            addProtectionViews();
            requestApplyInsets();
        }
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mProtections = new ArrayList();
    }

    public ProtectionLayout(Context context) {
        super(context);
        this.mProtections = new ArrayList();
    }
}
