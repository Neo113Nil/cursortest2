package defpackage;

import android.app.Activity;
import android.view.View;
import com.yandex.bricks.Brick;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.a;

/* loaded from: classes15.dex */
public final class ig3 extends Brick {
    public final tyc0 a;
    public final View b;

    public ig3(Activity activity, tyc0 tyc0Var) {
        this.a = tyc0Var;
        this.b = new View(activity);
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return this.b;
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickAttach() {
        super.onBrickAttach();
        tyc0 tyc0Var = this.a;
        tyc0Var.c.getClass();
        tyc0Var.i = true;
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        tyc0 tyc0Var = this.a;
        LinkedHashMap linkedHashMap = tyc0Var.f;
        if (ydz.a.a()) {
            ydz.d();
        }
        tyc0Var.c.getClass();
        tyc0Var.g.clear();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((e1k) ((Map.Entry) it.next()).getValue()).close();
        }
        linkedHashMap.clear();
        rp3 rp3Var = tyc0Var.d;
        kgx kgxVar = tyc0.j[0];
        rp3Var.a(null);
        tyc0Var.e.reset();
        a.g(tyc0Var.h.a, null);
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickStart() {
        super.onBrickStart();
        tyc0 tyc0Var = this.a;
        tyc0Var.c.getClass();
        tyc0Var.i = true;
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickStop() {
        super.onBrickStop();
        tyc0 tyc0Var = this.a;
        tyc0Var.c.getClass();
        tyc0Var.i = false;
    }
}
