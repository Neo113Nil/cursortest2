package xsna;

import android.content.DialogInterface;
import android.view.Window;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;

/* compiled from: StoryBaseDialogDelegate.kt */
/* loaded from: classes16.dex */
public abstract class wyl0 implements DialogInterface.OnDismissListener {
    public final StickersDrawingViewGroup b;
    public final b96 c;
    public tyl0<?> d;
    public nov e;

    public wyl0(StickersDrawingViewGroup stickersDrawingViewGroup, b96 b96Var) {
        this.b = stickersDrawingViewGroup;
        this.c = b96Var;
    }

    public abstract tyl0<?> f();

    public final boolean g() {
        return this.d != null;
    }

    public final void h(nov novVar) {
        Window window;
        this.e = novVar;
        if (this.d != null) {
            return;
        }
        b96 b96Var = this.c;
        b96Var.d();
        b96.c(b96Var);
        if (novVar != null) {
            novVar.setInEditMode(true);
        }
        this.b.invalidate();
        tyl0<?> f = f();
        if (!iah0.o(f.getContext()) && (window = f.getWindow()) != null) {
            window.addFlags(1024);
        }
        f.setOnDismissListener(this);
        f.show();
        uyl0 uyl0Var = (uyl0) f.getPresenter();
        if (uyl0Var != null) {
            uyl0Var.X1(novVar);
        }
        this.d = f;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        nov novVar = this.e;
        if (novVar != null) {
            novVar.setInEditMode(false);
            this.b.invalidate();
        }
        this.d = null;
        this.c.f();
    }
}
