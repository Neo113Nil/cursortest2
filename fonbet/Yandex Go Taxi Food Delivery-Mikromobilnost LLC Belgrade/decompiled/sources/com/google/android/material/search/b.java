package com.google.android.material.search;

import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import defpackage.vf2;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes11.dex */
public final class b {
    public AnimatorSet d;
    public AnimatorSet e;
    public boolean f;
    public boolean g;
    public final LinkedHashSet a = new LinkedHashSet();
    public final LinkedHashSet b = new LinkedHashSet();
    public final LinkedHashSet c = new LinkedHashSet();
    public boolean h = true;
    public AnimatorSet i = null;

    public static com.google.android.material.internal.a a(SearchBar searchBar, View view, AppBarLayout appBarLayout) {
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(searchBar, view);
        MaterialShapeDrawable createWithElevationOverlay = MaterialShapeDrawable.createWithElevationOverlay(view.getContext());
        createWithElevationOverlay.setCornerSize(searchBar.getCornerSize());
        createWithElevationOverlay.setElevation(searchBar.getElevation());
        aVar.e = new vf2(15, createWithElevationOverlay, view);
        aVar.g = appBarLayout != null ? appBarLayout.getTop() : 0;
        boolean z = view.getLayoutDirection() == 1;
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((!z && (childAt instanceof ActionMenuView)) || (z && !(childAt instanceof ActionMenuView))) {
                    arrayList.add(childAt);
                }
            }
        }
        aVar.d.addAll(arrayList);
        return aVar;
    }
}
