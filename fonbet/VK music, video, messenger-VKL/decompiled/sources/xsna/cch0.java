package xsna;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.util.Iterator;
import java.util.LinkedHashSet;
import one.video.view.OneVideoPlayerView;

/* compiled from: ScreenKeepAwakeManagerImpl.kt */
/* loaded from: classes8.dex */
public final class cch0 extends ach0 {
    public final Window a;
    public bch0 b;
    public final LinkedHashSet c = new LinkedHashSet();
    public int d;

    public cch0(Window window) {
        this.a = window;
    }

    @Override // xsna.ach0
    public final boolean a(OneVideoPlayerView oneVideoPlayerView) {
        return this.c.contains(oneVideoPlayerView);
    }

    @Override // xsna.ach0
    public final void b(View view) {
        LinkedHashSet linkedHashSet = this.c;
        if (linkedHashSet.contains(view)) {
            linkedHashSet.remove(view);
            System.identityHashCode(view);
            d();
            e();
        }
    }

    @Override // xsna.ach0
    public final void c(View view) {
        LinkedHashSet linkedHashSet = this.c;
        if (linkedHashSet.contains(view)) {
            return;
        }
        System.identityHashCode(view);
        linkedHashSet.add(view);
        d();
        e();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [xsna.bch0] */
    public final void d() {
        bch0 bch0Var = this.b;
        Window window = this.a;
        LinkedHashSet linkedHashSet = this.c;
        if (bch0Var == null && linkedHashSet.size() > 0) {
            this.b = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.bch0
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    cch0.this.e();
                }
            };
            window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this.b);
        }
        if (this.b == null || linkedHashSet.size() != 0) {
            return;
        }
        window.getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.b);
        this.b = null;
    }

    public final void e() {
        Iterator it = this.c.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((View) it.next()).isShown()) {
                i++;
            }
        }
        int i2 = this.d;
        if (i != i2) {
            Window window = this.a;
            if (i == 1 && i2 == 0) {
                window.addFlags(128);
            } else if (i == 0 && i2 == 1) {
                window.clearFlags(128);
            }
            this.d = i;
        }
    }
}
