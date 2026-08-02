package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.Guideline;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageButton;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.widget.qr.QrTargetView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.progress.CircularProgressBar;

/* loaded from: classes6.dex */
public final class oan0 implements zo31 {
    public final GoConstraintLayout a;
    public final GoFrameLayout b;
    public final Guideline c;
    public final ListItemComponent d;
    public final GoLinearLayout e;
    public final GoImageView f;
    public final View g;
    public final RobotoTextView h;
    public final GoImageButton i;
    public final GoImageView j;
    public final CircularProgressBar k;
    public final GoImageButton l;
    public final QrTargetView m;

    public oan0(GoConstraintLayout goConstraintLayout, GoFrameLayout goFrameLayout, Guideline guideline, ListItemComponent listItemComponent, GoLinearLayout goLinearLayout, GoImageView goImageView, View view, RobotoTextView robotoTextView, GoImageButton goImageButton, GoImageView goImageView2, CircularProgressBar circularProgressBar, GoImageButton goImageButton2, QrTargetView qrTargetView) {
        this.a = goConstraintLayout;
        this.b = goFrameLayout;
        this.c = guideline;
        this.d = listItemComponent;
        this.e = goLinearLayout;
        this.f = goImageView;
        this.g = view;
        this.h = robotoTextView;
        this.i = goImageButton;
        this.j = goImageView2;
        this.k = circularProgressBar;
        this.l = goImageButton2;
        this.m = qrTargetView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
