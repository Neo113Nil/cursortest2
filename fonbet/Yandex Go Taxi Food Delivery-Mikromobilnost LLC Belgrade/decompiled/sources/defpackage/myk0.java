package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import defpackage.myk0;

/* loaded from: classes6.dex */
public final class myk0 extends kyk0 {
    public final View a;
    public float b;

    public myk0(View view) {
        this.a = view;
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.yandex.taxi.widget.RoundedCornersViewHelperNougat$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), myk0.this.b);
                outline.setAlpha(0.0f);
                view2.setClipToOutline(true);
            }
        });
    }

    @Override // defpackage.kyk0
    public final void a(Canvas canvas, sls slsVar) {
        slsVar.invoke();
    }

    @Override // defpackage.kyk0
    public final void b(float f, float f2) {
        this.b = f;
        View view = this.a;
        view.invalidate();
        view.invalidateOutline();
    }

    @Override // defpackage.kyk0
    public final void c(float f, float f2, float f3, float f4) {
        b(f, f);
    }

    @Override // defpackage.kyk0
    public final void d(int i, int i2) {
        View view = this.a;
        view.invalidate();
        view.invalidateOutline();
    }
}
