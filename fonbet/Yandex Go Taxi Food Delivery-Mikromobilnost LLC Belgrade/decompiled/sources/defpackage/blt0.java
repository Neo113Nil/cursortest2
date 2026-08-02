package defpackage;

import android.view.View;
import com.yandex.bricks.Brick;
import com.yandex.messaging.ChatRequest;

/* loaded from: classes15.dex */
public final class blt0 extends Brick {
    public final elt0 a;
    public final odt b;
    public final ChatRequest c;
    public final b00 w;
    public n2v0 x;
    public uds0 y;
    public String z;

    public blt0(elt0 elt0Var, odt odtVar, ChatRequest chatRequest, b00 b00Var) {
        this.b = odtVar;
        this.a = elt0Var;
        this.c = chatRequest;
        this.w = b00Var;
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return this.a.b;
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickAttach() {
        super.onBrickAttach();
        this.y = this.b.c(this.c, new k9b(15, this));
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        uds0 uds0Var = this.y;
        if (uds0Var != null) {
            uds0Var.close();
            this.y = null;
        }
    }
}
