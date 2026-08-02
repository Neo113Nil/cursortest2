package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.widget.PlaceholderView;

/* loaded from: classes13.dex */
public final class ap80 implements zo31 {
    public final GoFrameLayout a;
    public final GoImageView b;
    public final View c;
    public final GoImageView d;
    public final PlaceholderView e;
    public final GoImageView f;

    public ap80(GoFrameLayout goFrameLayout, GoImageView goImageView, View view, GoImageView goImageView2, PlaceholderView placeholderView, GoImageView goImageView3) {
        this.a = goFrameLayout;
        this.b = goImageView;
        this.c = view;
        this.d = goImageView2;
        this.e = placeholderView;
        this.f = goImageView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
