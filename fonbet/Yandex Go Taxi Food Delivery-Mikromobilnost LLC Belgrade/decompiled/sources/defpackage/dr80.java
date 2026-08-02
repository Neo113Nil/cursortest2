package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.messaging.internal.net.file.FileProgressObservable$Listener$Status;

/* loaded from: classes15.dex */
public final class dr80 extends i15 {
    public static final int v3 = olh0.msg_vh_chat_other_file;
    public final ViewGroup X2;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dr80(jwf jwfVar) {
        super(false, r4, jwfVar, fxa1.c(jng0.messagingIncomingSecondaryColor, r0.getContext()).data, wwg0.msg_anim_loading_other, wwg0.msg_ic_download_indicator_other);
        ViewGroup viewGroup = (ViewGroup) jwfVar.k;
        View g = g8a1.g(viewGroup, olh0.msg_vh_chat_other_file);
        this.X2 = this.y1;
        this.C2.setTextColor(fxa1.c(jng0.messagingIncomingPrimaryColor, g.getContext()).data);
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final int B0() {
        return 0;
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final View C0() {
        return this.X2;
    }

    @Override // defpackage.i15, com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final void X(yab yabVar, vb5 vb5Var) {
        super.X(yabVar, vb5Var);
        this.O = new tbz0(yabVar.Z(), yabVar.a());
    }

    @Override // com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final void i0(Canvas canvas, z9z0 z9z0Var, boolean z, boolean z2) {
        Drawable a = z9z0Var.a(z, z2, this.R, this.v2.x.F, G0());
        a.setLayoutDirection(this.a.getLayoutDirection());
        ip31 ip31Var = this.H1;
        a.setBounds(ip31Var.f(), ip31Var.h(), ip31Var.g(), ip31Var.d());
        a.draw(canvas);
    }

    @Override // defpackage.w0r
    public final void q(FileProgressObservable$Listener$Status fileProgressObservable$Listener$Status) {
        FileProgressObservable$Listener$Status fileProgressObservable$Listener$Status2 = FileProgressObservable$Listener$Status.ERROR;
        boolean z = fileProgressObservable$Listener$Status == fileProgressObservable$Listener$Status2;
        zf0 zf0Var = this.T;
        zf0Var.a = z;
        zf0Var.b();
        if (fileProgressObservable$Listener$Status == fileProgressObservable$Listener$Status2) {
            this.N2.c();
        }
    }
}
