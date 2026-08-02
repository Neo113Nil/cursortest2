package defpackage;

import android.graphics.Canvas;
import android.util.TypedValue;
import android.view.ViewGroup;
import com.yandex.messaging.internal.view.timeline.DialogItemStaticDrawable;
import com.yandex.messaging.internal.view.timeline.voice.a;

/* loaded from: classes15.dex */
public final class h390 extends a {
    public static final int T2 = olh0.msg_vh_chat_own_stub_voice_message;
    public final or80 N2;

    public h390(or80 or80Var, jwf jwfVar) {
        super(true, or80Var, jwfVar);
        this.N2 = or80Var;
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final int B0() {
        return 0;
    }

    @Override // com.yandex.messaging.internal.view.timeline.voice.a, com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final void X(yab yabVar, vb5 vb5Var) {
        super.X(yabVar, vb5Var);
        this.O = new ubz0(yabVar.Z());
    }

    @Override // com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final void i0(Canvas canvas, z9z0 z9z0Var, boolean z, boolean z2) {
        super.i0(canvas, z9z0Var, z, z2);
        or80 or80Var = this.N2;
        ViewGroup viewGroup = or80Var.y;
        ViewGroup viewGroup2 = or80Var.y;
        if (viewGroup.getVisibility() == 0) {
            int applyDimension = (int) TypedValue.applyDimension(1, 2.0f, this.a.getContext().getResources().getDisplayMetrics());
            ip31 ip31Var = this.H1;
            int f = ip31Var.f();
            int g = ip31Var.g();
            DialogItemStaticDrawable dialogItemStaticDrawable = z9z0Var.d;
            dialogItemStaticDrawable.setBounds(f + applyDimension, viewGroup2.getTop() + applyDimension, g - applyDimension, viewGroup2.getBottom() - applyDimension);
            dialogItemStaticDrawable.draw(canvas);
        }
    }
}
