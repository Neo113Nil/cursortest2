package defpackage;

import android.graphics.PointF;
import com.yandex.go.taxi.order.search.overlay.mvp.b;
import com.yandex.go.taxi.order.search.ui.search.SearchViews;
import com.yandex.go.taxi.order.search.ui.search_views.d;
import com.yandex.mapkit.ScreenRect;

/* loaded from: classes14.dex */
public final class kwu0 implements svp0, jwu0 {
    public final d a;
    public final b b;
    public boolean c;

    public kwu0(d dVar, b bVar) {
        this.a = dVar;
        this.b = bVar;
    }

    @Override // defpackage.jwu0
    public final void B3(PointF pointF) {
        SearchViews I = this.a.I();
        if (I != null) {
            I.setPulsingCirclesViewAnchor(pointF);
        }
    }

    @Override // defpackage.svp0
    public final void attach() {
        if (this.c) {
            return;
        }
        this.c = true;
        d dVar = this.a;
        dVar.B0(1.0f);
        dVar.M1(true);
        b bVar = this.b;
        bVar.Bg(this);
        bVar.resume();
    }

    @Override // defpackage.svp0
    public final void b9(ScreenRect screenRect) {
        b bVar = this.b;
        if (screenRect == null) {
            bVar.getClass();
            return;
        }
        bVar.B.getClass();
        ((jwu0) bVar.Dg()).B3(jzf0.a(screenRect));
        ((gh00) bVar.y).y(bVar.x, screenRect);
    }

    @Override // defpackage.svp0
    public final void detach() {
        this.c = false;
        b bVar = this.b;
        bVar.pause();
        bVar.Cg();
        this.a.M1(false);
    }

    @Override // defpackage.svp0
    public final void pause() {
    }

    @Override // defpackage.svp0
    public final void resume() {
    }
}
