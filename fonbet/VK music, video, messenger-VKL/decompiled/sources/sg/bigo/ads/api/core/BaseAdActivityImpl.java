package sg.bigo.ads.api.core;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.utils.v;

/* loaded from: classes9.dex */
public abstract class BaseAdActivityImpl {

    @NonNull
    public final Activity N;
    public int O = 0;

    @Nullable
    public final sg.bigo.ads.ax.b P;

    public BaseAdActivityImpl(@NonNull Activity activity) {
        this.N = activity;
        this.P = new sg.bigo.ads.ax.b(activity);
        sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.api.core.BaseAdActivityImpl.1
            @Override // java.lang.Runnable
            public final void run() {
                final BaseAdActivityImpl baseAdActivityImpl = BaseAdActivityImpl.this;
                final View decorView = baseAdActivityImpl.N.getWindow().getDecorView();
                if (decorView != null) {
                    decorView.post(new Runnable() { // from class: sg.bigo.ads.api.core.BaseAdActivityImpl.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            sg.bigo.ads.ax.b bVar;
                            WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
                            if (rootWindowInsets == null || (bVar = BaseAdActivityImpl.this.P) == null) {
                                return;
                            }
                            bVar.a(rootWindowInsets);
                        }
                    });
                }
            }
        });
    }

    public abstract void J();

    public abstract void X();

    public boolean Z() {
        return false;
    }

    public abstract void a(int i, int i2, Intent intent);

    public final void aL() {
        Window window;
        if (Z() || (window = this.N.getWindow()) == null) {
            return;
        }
        sg.bigo.ads.common.utils.t.a(window);
    }

    public void aM() {
        this.N.finish();
    }

    public final boolean aN() {
        return this.O == 1;
    }

    public abstract void ag();

    public abstract void ai();

    public abstract void ak();

    public abstract void al();

    public void b(@NonNull View view) {
        v.a(view, new v.a() { // from class: sg.bigo.ads.api.core.BaseAdActivityImpl.3
            @Override // sg.bigo.ads.common.utils.v.a
            public final void a(View view2, @NonNull Rect rect) {
                sg.bigo.ads.ax.b bVar = BaseAdActivityImpl.this.P;
                if (bVar != null) {
                    bVar.a(view2, 0);
                }
            }
        });
    }

    public abstract void g(boolean z);

    public final void p(int i) {
        this.N.setContentView(sg.bigo.ads.common.utils.a.a(this.N, i, null, false));
    }

    @Nullable
    public final <T extends View> T q(int i) {
        return (T) this.N.findViewById(i);
    }

    public boolean b(MotionEvent motionEvent) {
        return false;
    }
}
