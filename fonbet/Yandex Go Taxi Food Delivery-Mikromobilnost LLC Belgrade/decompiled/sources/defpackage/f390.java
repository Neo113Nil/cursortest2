package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.messaging.internal.net.file.FileProgressObservable$Listener$Status;
import com.yandex.messaging.views.AppCompatEmojiTextView;

/* loaded from: classes15.dex */
public final class f390 extends i15 {
    public static final int v3 = olh0.msg_vh_chat_own_file;
    public final ViewGroup X2;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f390(jwf jwfVar) {
        super(true, r4, jwfVar, fxa1.c(jng0.messagingOutgoingSecondaryColor, r0.getContext()).data, wwg0.msg_anim_loading_own, wwg0.msg_ic_download_indicator_own);
        ViewGroup viewGroup = (ViewGroup) jwfVar.k;
        View g = g8a1.g(viewGroup, olh0.msg_vh_chat_own_file);
        this.C2.setTextColor(fxa1.c(jng0.messagingOutgoingPrimaryColor, g.getContext()).data);
        this.X2 = this.y1;
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
        this.O = new ubz0(yabVar.Z());
        iv31 iv31Var = this.H2;
        if (iv31Var.b()) {
            ((AppCompatEmojiTextView) iv31Var.a()).setTextColor(fxa1.c(jng0.messagingOutgoingSecondaryColor, iv31Var.d()).data);
        }
    }

    @Override // defpackage.i15, com.yandex.messaging.internal.view.timeline.e
    public final boolean b0() {
        return this.k0;
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
        if (this.k0 || fileProgressObservable$Listener$Status != FileProgressObservable$Listener$Status.UNKNOWN) {
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
}
