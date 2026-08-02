package defpackage;

import android.view.View;
import android.view.ViewStub;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.places.common.ui.ControlButtonView;
import com.yandex.go.places.common.ui.FilterButtonView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.explorer.ExplorerButtonView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.explorer.ExplorerDistrictCoverageProgressView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.explorer.ExplorerOutlineRobotoTextView;

/* loaded from: classes14.dex */
public final class pyv0 implements zo31 {
    public final GoConstraintLayout a;
    public final GoImageView b;
    public final ControlButtonView c;
    public final FilterButtonView d;
    public final View e;
    public final ExplorerButtonView f;
    public final ExplorerDistrictCoverageProgressView g;
    public final ExplorerOutlineRobotoTextView h;
    public final GoFrameLayout i;
    public final ViewStub j;
    public final ControlButtonView k;
    public final GoLinearLayout l;
    public final GoFrameLayout m;
    public final GoFrameLayout n;

    public pyv0(GoConstraintLayout goConstraintLayout, GoImageView goImageView, ControlButtonView controlButtonView, FilterButtonView filterButtonView, View view, ExplorerButtonView explorerButtonView, ExplorerDistrictCoverageProgressView explorerDistrictCoverageProgressView, ExplorerOutlineRobotoTextView explorerOutlineRobotoTextView, GoFrameLayout goFrameLayout, ViewStub viewStub, ControlButtonView controlButtonView2, GoLinearLayout goLinearLayout, GoFrameLayout goFrameLayout2, GoFrameLayout goFrameLayout3) {
        this.a = goConstraintLayout;
        this.b = goImageView;
        this.c = controlButtonView;
        this.d = filterButtonView;
        this.e = view;
        this.f = explorerButtonView;
        this.g = explorerDistrictCoverageProgressView;
        this.h = explorerOutlineRobotoTextView;
        this.i = goFrameLayout;
        this.j = viewStub;
        this.k = controlButtonView2;
        this.l = goLinearLayout;
        this.m = goFrameLayout2;
        this.n = goFrameLayout3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
