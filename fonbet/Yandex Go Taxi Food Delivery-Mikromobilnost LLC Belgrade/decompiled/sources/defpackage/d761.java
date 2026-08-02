package defpackage;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.ybsdk.feature.kyc.internal.screens.photo.views.PunchHoleView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonViewGroup;

/* loaded from: classes3.dex */
public final class d761 implements zo31 {
    public final ConstraintLayout a;
    public final AppCompatImageView b;
    public final AppCompatImageView c;
    public final AppCompatTextView d;
    public final Group e;
    public final View f;
    public final Space g;
    public final AppCompatImageView h;
    public final View i;
    public final YbButtonViewGroup j;
    public final PunchHoleView k;
    public final Group l;
    public final AppCompatTextView m;
    public final ToolbarView n;

    public d761(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, Group group, View view, Space space, AppCompatImageView appCompatImageView3, View view2, YbButtonViewGroup ybButtonViewGroup, PunchHoleView punchHoleView, Group group2, AppCompatTextView appCompatTextView2, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.c = appCompatImageView2;
        this.d = appCompatTextView;
        this.e = group;
        this.f = view;
        this.g = space;
        this.h = appCompatImageView3;
        this.i = view2;
        this.j = ybButtonViewGroup;
        this.k = punchHoleView;
        this.l = group2;
        this.m = appCompatTextView2;
        this.n = toolbarView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }

    public final ConstraintLayout o() {
        return this.a;
    }
}
