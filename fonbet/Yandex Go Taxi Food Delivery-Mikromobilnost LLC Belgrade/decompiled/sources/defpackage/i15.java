package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.messaging.internal.entities.FileMessageData;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.VideoMessageData;
import com.yandex.messaging.internal.view.timeline.c;
import com.yandex.messaging.internal.view.timeline.i0;
import com.yandex.messaging.internal.view.timeline.m;

/* loaded from: classes15.dex */
public abstract class i15 extends c implements w0r {
    public boolean B2;
    public final TextView C2;
    public final iv31 H2;
    public final l1r N2;
    public z0r T2;
    public final i0 V2;
    public final jwf x2;
    public final a1r y2;

    public i15(boolean z, View view, jwf jwfVar, int i, int i2, int i3) {
        super(z, view, jwfVar);
        this.x2 = jwfVar;
        this.y2 = (a1r) jwfVar.m;
        this.C2 = (TextView) view.findViewById(e9h0.dialog_file_name);
        int i4 = e9h0.forwarded_message;
        this.H2 = new iv31(view, i4, i4);
        View findViewById = view.findViewById(e9h0.dialog_file_button);
        ((ImageButton) findViewById).setOnClickListener(new tf(15, this));
        this.N2 = new l1r(view.getContext(), (ImageView) view.findViewById(e9h0.dialog_file_button), (TextView) view.findViewById(e9h0.dialog_file_size), (a1r) jwfVar.m, (oyq) jwfVar.C, (xzq) jwfVar.s, xzq.b, wwg0.msg_ic_yadisk, i3, i2, i, this.J0, 2048);
        this.V2 = new i0(jwfVar, this.v0);
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final ak51 F0() {
        return this.V2;
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final void H0() {
        super.H0();
        this.N2.c();
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final void J0(String str, boolean z) {
        TextView textView = this.C2;
        CharSequence text = textView.getText();
        String str2 = null;
        String obj = text != null ? text.toString() : null;
        if (obj != null && obj.length() != 0) {
            str2 = obj;
        }
        if (str2 == null) {
            str2 = this.a.getContext().getString(oyh0.messenger_message_with_file);
        }
        textView.setContentDescription(z0(str2, z));
        y0(textView);
    }

    public final boolean K0() {
        zg10 zg10Var = (zg10) this.x2.K;
        j3b j3bVar = this.u0;
        y2r y2rVar = this.b0;
        String str = y2rVar != null ? y2rVar.c : null;
        Integer num = y2rVar != null ? y2rVar.d : null;
        if (j3bVar == null || str == null || num == null) {
            return false;
        }
        return zg10Var.a(j3bVar, str, num.intValue()) || zg10Var.b(j3bVar, str, num.intValue());
    }

    public final FileMessageData L0() {
        MessageData messageData = this.V1;
        if (messageData instanceof FileMessageData) {
            return (FileMessageData) messageData;
        }
        FileMessageData fileMessageData = null;
        if (messageData instanceof VideoMessageData) {
            VideoMessageData videoMessageData = (VideoMessageData) messageData;
            String str = videoMessageData.fileName;
            if (str == null) {
                return null;
            }
            Long l = videoMessageData.size;
            fileMessageData = new FileMessageData(str, l != null ? l.longValue() : 0L);
            fileMessageData.fileId = videoMessageData.fileId;
            fileMessageData.fileSource = videoMessageData.fileSource;
        }
        return fileMessageData;
    }

    public final boolean M0() {
        zg10 zg10Var = (zg10) this.x2.K;
        j3b j3bVar = this.u0;
        y2r y2rVar = this.b0;
        return zg10Var.c(j3bVar, y2rVar != null ? y2rVar.c : null, y2rVar != null ? y2rVar.d : null) && this.B2;
    }

    @Override // defpackage.qdz0
    public final boolean W() {
        return this.v2.b();
    }

    @Override // com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public void X(yab yabVar, vb5 vb5Var) {
        super.X(yabVar, vb5Var);
        FileMessageData L0 = L0();
        if (L0 == null) {
            return;
        }
        this.C2.setText(L0.fileName);
        int l = this.L0.l();
        l1r.a(this.N2, yabVar.W(), L0, l, L0.size, M0(), K0(), 16);
        String str = this.d0;
        if (str != null && str.length() > 0) {
            a1r a1rVar = this.y2;
            a1rVar.getClass();
            this.T2 = new z0r(a1rVar, str, this);
        }
        this.v2.a(this.t0, yabVar, e0().f);
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final boolean Z() {
        y2r y2rVar = this.b0;
        String str = y2rVar != null ? y2rVar.a : null;
        if (str == null || str.length() == 0) {
            return false;
        }
        y2r y2rVar2 = this.b0;
        String str2 = y2rVar2 != null ? y2rVar2.b : null;
        return (str2 == null || str2.length() == 0 || !this.B2) ? false : true;
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final boolean a0() {
        if (this.B2) {
            u1n u1nVar = (u1n) this.x2.L;
            j3b j3bVar = this.u0;
            y2r y2rVar = this.b0;
            zg10 zg10Var = (zg10) u1nVar.b;
            if ((j3bVar == null || okb1.b(j3bVar).j()) && y2rVar != null) {
                Integer num = y2rVar.d;
                String str = y2rVar.c;
                String str2 = y2rVar.a;
                if (str2 != null) {
                    if (((oyq) ((jln) u1nVar.c).b).a(str2)) {
                        return true;
                    }
                    if ((j3bVar == null || str == null || num == null) ? false : zg10Var.b(j3bVar, str, num.intValue())) {
                        return true;
                    }
                    if ((j3bVar == null || str == null || num == null) ? false : zg10Var.a(j3bVar, str, num.intValue())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public boolean b0() {
        return true;
    }

    @Override // defpackage.w0r
    public final void f(long j, long j2) {
    }

    @Override // com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final void f0() {
        super.f0();
        this.v2.e();
        z0r z0rVar = this.T2;
        if (z0rVar != null) {
            z0rVar.close();
        }
        this.T2 = null;
        l1r l1rVar = this.N2;
        z0r z0rVar2 = l1rVar.J;
        if (z0rVar2 != null) {
            z0rVar2.close();
        }
        l1rVar.J = null;
        l1rVar.P = false;
        l1rVar.I = false;
        l1rVar.H = null;
        l1rVar.C.a();
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final m l0() {
        return e0().a;
    }

    @Override // com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final void q0(j3b j3bVar) {
        boolean j;
        super.q0(j3bVar);
        FileMessageData L0 = L0();
        if (L0 == null) {
            return;
        }
        j3b j3bVar2 = this.u0;
        if (j3bVar2 == null) {
            j = true;
        } else {
            wbz0 wbz0Var = s8b.c;
            int i = j3bVar2.i;
            wbz0Var.getClass();
            j = new s8b(i).j();
        }
        this.B2 = j;
        boolean M0 = M0();
        boolean K0 = K0();
        l1r l1rVar = this.N2;
        l1rVar.M = M0;
        l1rVar.N = K0;
        l1rVar.e();
        boolean z = l1rVar.L;
        boolean z2 = this.B2;
        if (z == z2) {
            return;
        }
        l1rVar.L = z2;
        TextView textView = l1rVar.c;
        Drawable drawable = l1rVar.G;
        Integer num = L0.fileSource;
        if (num == null || num.intValue() != 1) {
            drawable = null;
        }
        bob1.e(textView, drawable, true);
        l1rVar.b();
        l1rVar.e();
    }
}
