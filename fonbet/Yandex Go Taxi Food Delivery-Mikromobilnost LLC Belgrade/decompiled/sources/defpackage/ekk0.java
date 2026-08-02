package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.widget.floatbuttonholder.FloatButtonHolderLayout;

/* loaded from: classes14.dex */
public final class ekk0 implements zo31 {
    public final GoLinearLayout a;
    public final ViewStub b;
    public final GoFrameLayout c;
    public final FrameLayout d;
    public final GoConstraintLayout e;
    public final FloatButtonHolderLayout f;
    public final GoView g;
    public final BackButtonIconComponent h;
    public final RecyclerView i;
    public final ViewStub j;
    public final ViewStub k;

    public ekk0(GoLinearLayout goLinearLayout, ViewStub viewStub, ViewStub viewStub2, GoFrameLayout goFrameLayout, FrameLayout frameLayout, GoConstraintLayout goConstraintLayout, FloatButtonHolderLayout floatButtonHolderLayout, GoView goView, BackButtonIconComponent backButtonIconComponent, RecyclerView recyclerView, ViewStub viewStub3, ViewStub viewStub4) {
        this.a = goLinearLayout;
        this.b = viewStub2;
        this.c = goFrameLayout;
        this.d = frameLayout;
        this.e = goConstraintLayout;
        this.f = floatButtonHolderLayout;
        this.g = goView;
        this.h = backButtonIconComponent;
        this.i = recyclerView;
        this.j = viewStub3;
        this.k = viewStub4;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
