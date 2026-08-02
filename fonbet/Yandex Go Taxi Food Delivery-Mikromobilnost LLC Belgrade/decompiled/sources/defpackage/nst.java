package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.bricks.Brick;

/* loaded from: classes15.dex */
public final class nst extends Brick {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ nst(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        switch (this.a) {
            case 0:
                FrameLayout frameLayout = new FrameLayout((Context) this.b);
                ai91.c(frameLayout, false);
                return frameLayout;
            default:
                return (View) this.b;
        }
    }
}
