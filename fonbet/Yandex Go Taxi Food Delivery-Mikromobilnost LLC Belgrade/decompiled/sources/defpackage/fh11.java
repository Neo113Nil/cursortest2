package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.widget.progress.CircularProgressBar;

/* loaded from: classes14.dex */
public final class fh11 implements zo31 {
    public final FrameLayout a;
    public final ToolbarComponent b;
    public final ButtonComponent c;
    public final AppCompatImageView d;
    public final FrameLayout e;
    public final CircularProgressBar f;
    public final RecyclerView g;

    public fh11(FrameLayout frameLayout, ToolbarComponent toolbarComponent, ButtonComponent buttonComponent, AppCompatImageView appCompatImageView, FrameLayout frameLayout2, CircularProgressBar circularProgressBar, RecyclerView recyclerView) {
        this.a = frameLayout;
        this.b = toolbarComponent;
        this.c = buttonComponent;
        this.d = appCompatImageView;
        this.e = frameLayout2;
        this.f = circularProgressBar;
        this.g = recyclerView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
