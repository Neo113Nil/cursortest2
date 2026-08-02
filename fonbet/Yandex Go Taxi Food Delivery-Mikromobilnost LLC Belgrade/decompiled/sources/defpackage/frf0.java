package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.FloatingTitleToolbarComponent;

/* loaded from: classes13.dex */
public final class frf0 implements zo31 {
    public final LinearLayout a;
    public final FrameLayout b;
    public final ButtonComponent c;
    public final ImageView d;
    public final RecyclerView e;
    public final AppCompatImageView f;
    public final FloatingTitleToolbarComponent g;

    public frf0(LinearLayout linearLayout, FrameLayout frameLayout, ButtonComponent buttonComponent, ImageView imageView, RecyclerView recyclerView, AppCompatImageView appCompatImageView, FloatingTitleToolbarComponent floatingTitleToolbarComponent) {
        this.a = linearLayout;
        this.b = frameLayout;
        this.c = buttonComponent;
        this.d = imageView;
        this.e = recyclerView;
        this.f = appCompatImageView;
        this.g = floatingTitleToolbarComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
