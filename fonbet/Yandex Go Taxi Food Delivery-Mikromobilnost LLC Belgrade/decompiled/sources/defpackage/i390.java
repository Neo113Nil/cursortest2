package defpackage;

import android.graphics.Canvas;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.messaging.internal.view.timeline.DialogItemStaticDrawable;

/* loaded from: classes15.dex */
public final class i390 extends dd5 {
    public static final int v3 = olh0.msg_vh_chat_own_voice_message;
    public final View X2;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i390(jwf jwfVar) {
        super(true, r0, jwfVar);
        View g = g8a1.g((ViewGroup) jwfVar.k, olh0.msg_vh_chat_own_voice_message);
        this.X2 = g.findViewById(e9h0.message_content);
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final int B0() {
        return 0;
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final View C0() {
        return this.X2;
    }

    @Override // defpackage.dd5, com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final void X(yab yabVar, vb5 vb5Var) {
        super.X(yabVar, vb5Var);
        this.O = new ubz0(yabVar.Z());
    }

    @Override // com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final void i0(Canvas canvas, z9z0 z9z0Var, boolean z, boolean z2) {
        super.i0(canvas, z9z0Var, z, z2);
        ViewGroup viewGroup = this.y2;
        if (viewGroup.getVisibility() == 0) {
            View view = this.a;
            int applyDimension = (int) TypedValue.applyDimension(1, 2.0f, view.getContext().getResources().getDisplayMetrics());
            ip31 ip31Var = this.H1;
            int f = ip31Var.f();
            int g = ip31Var.g();
            DialogItemStaticDrawable dialogItemStaticDrawable = z9z0Var.d;
            dialogItemStaticDrawable.setLayoutDirection(view.getLayoutDirection());
            dialogItemStaticDrawable.setBounds(f + applyDimension, viewGroup.getTop() + applyDimension, g - applyDimension, viewGroup.getBottom() - applyDimension);
            dialogItemStaticDrawable.draw(canvas);
        }
    }
}
