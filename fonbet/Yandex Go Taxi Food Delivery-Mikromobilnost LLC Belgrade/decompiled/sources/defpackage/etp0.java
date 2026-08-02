package defpackage;

import android.content.res.ColorStateList;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import com.google.android.material.shape.MaterialShapeDrawable;

/* loaded from: classes11.dex */
public final class etp0 extends AppBarLayout.c {
    public final /* synthetic */ SearchBar a;

    public etp0(SearchBar searchBar) {
        this.a = searchBar;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.c
    public final void a(float f) {
        ColorStateList colorStateList;
        int i;
        ColorStateList colorStateList2;
        MaterialShapeDrawable materialShapeDrawable;
        SearchBar searchBar = this.a;
        colorStateList = searchBar.liftOnScrollColor;
        if (colorStateList != null) {
            i = searchBar.backgroundColor;
            colorStateList2 = searchBar.liftOnScrollColor;
            int Q = vez0.Q(f, i, colorStateList2.getDefaultColor());
            materialShapeDrawable = searchBar.backgroundShape;
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(Q));
        }
    }
}
