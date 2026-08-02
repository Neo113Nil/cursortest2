package com.yandex.messaging.internal.view.chat;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.bricks.Brick;
import com.yandex.images.utils.ScaleMode;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.base.rights.ChatRightsFlag;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.view.chat.c;
import com.yandex.messaging.internal.view.timeline.i;
import defpackage.ahv;
import defpackage.b00;
import defpackage.ct21;
import defpackage.dbb;
import defpackage.e9h0;
import defpackage.gvg0;
import defpackage.h3y;
import defpackage.i3y;
import defpackage.j3b;
import defpackage.jqr;
import defpackage.l7b;
import defpackage.md6;
import defpackage.noy0;
import defpackage.olh0;
import defpackage.s8b;
import defpackage.smt0;
import defpackage.tje;
import defpackage.tmt0;
import defpackage.u0r;
import defpackage.ucz0;
import defpackage.wbz0;
import defpackage.xav;
import defpackage.xn50;
import defpackage.xzq;
import defpackage.y4a0;
import defpackage.yn50;
import defpackage.z7b;
import defpackage.zg10;

/* loaded from: classes15.dex */
public final class c extends Brick {
    public final noy0 A;
    public final dbb B;
    public final xzq C;
    public final zg10 D;
    public final i3y E;
    public final View F;
    public final View G;
    public final ImageView H;
    public final TextView I;
    public ucz0 J;
    public y4a0 K;
    public j3b L;
    public boolean M;
    public ct21 N;
    public smt0 O;
    public yn50 P;
    public final u0r Q;
    public final b00 a;
    public final Activity b;
    public final ChatRequest c;
    public final h3y w;
    public final com.yandex.messaging.internal.e x;
    public final tmt0 y;
    public final z7b z;

    public c(b00 b00Var, Activity activity, ChatRequest chatRequest, h3y h3yVar, com.yandex.messaging.internal.e eVar, tmt0 tmt0Var, z7b z7bVar, noy0 noy0Var, dbb dbbVar, xzq xzqVar, zg10 zg10Var) {
        this.a = b00Var;
        this.b = activity;
        this.c = chatRequest;
        this.w = h3yVar;
        this.x = eVar;
        this.y = tmt0Var;
        this.z = z7bVar;
        this.A = noy0Var;
        this.B = dbbVar;
        this.C = xzqVar;
        this.D = zg10Var;
        final int i = 1;
        this.E = kotlin.a.a(new l7b(i, this));
        View inflate = inflate(activity, olh0.msg_b_pinned_message);
        final int i2 = 0;
        inflate.setOnClickListener(new View.OnClickListener(this) { // from class: x7b
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ucz0 ucz0Var;
                int i3 = i2;
                c cVar = this.b;
                switch (i3) {
                    case 0:
                        y4a0 y4a0Var = cVar.K;
                        if (y4a0Var != null && (ucz0Var = cVar.J) != null) {
                            cVar.B.a("timeline pinned");
                            ((i) ucz0Var).u(((ServerMessageRef) y4a0Var.c).getTimestamp(), null);
                            break;
                        }
                        break;
                    default:
                        new AlertDialog.Builder(cVar.b, w0i0.Messaging_AlertDialog).setMessage(oyh0.unpin_message_dialog_text).setPositiveButton(oyh0.button_yes, new p97(2, cVar)).setNegativeButton(oyh0.button_cancel, new dz2(2)).show();
                        break;
                }
            }
        });
        this.F = inflate;
        View findViewById = inflate.findViewById(e9h0.unpin_button);
        findViewById.setOnClickListener(new View.OnClickListener(this) { // from class: x7b
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ucz0 ucz0Var;
                int i3 = i;
                c cVar = this.b;
                switch (i3) {
                    case 0:
                        y4a0 y4a0Var = cVar.K;
                        if (y4a0Var != null && (ucz0Var = cVar.J) != null) {
                            cVar.B.a("timeline pinned");
                            ((i) ucz0Var).u(((ServerMessageRef) y4a0Var.c).getTimestamp(), null);
                            break;
                        }
                        break;
                    default:
                        new AlertDialog.Builder(cVar.b, w0i0.Messaging_AlertDialog).setMessage(oyh0.unpin_message_dialog_text).setPositiveButton(oyh0.button_yes, new p97(2, cVar)).setNegativeButton(oyh0.button_cancel, new dz2(2)).show();
                        break;
                }
            }
        });
        this.G = findViewById;
        ImageView imageView = (ImageView) inflate.findViewById(e9h0.pinned_image);
        this.H = imageView;
        this.I = (TextView) inflate.findViewById(e9h0.pinned_message_text);
        this.M = true;
        this.Q = new u0r(activity, imageView, h3yVar);
        tje.e();
    }

    public static final void q(c cVar, ImageView imageView, String str, Integer num) {
        cVar.getClass();
        if (str == null) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        imageView.setImageDrawable(null);
        imageView.setBackground(null);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        int dimensionPixelSize = cVar.b.getResources().getDimensionPixelSize(gvg0.chat_pinned_message_image_size);
        String f = com.yandex.messaging.internal.images.b.f(str);
        ahv ahvVar = new ahv(imageView, num);
        yn50 yn50Var = (yn50) ((xav) cVar.E.getValue()).load(f);
        xn50 xn50Var = yn50Var.b;
        xn50Var.i = dimensionPixelSize;
        xn50Var.j = dimensionPixelSize;
        xn50Var.k = ScaleMode.CENTER_CROP;
        yn50Var.b(imageView, ahvVar);
        cVar.P = yn50Var;
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return this.F;
    }

    @Override // com.yandex.bricks.Brick
    public final void onBrickAttach(Bundle bundle) {
        super.onBrickAttach(bundle);
        com.yandex.messaging.internal.e eVar = this.x;
        ChatRequest chatRequest = this.c;
        kotlinx.coroutines.flow.e.H(getBrickScope(), new jqr(kotlinx.coroutines.flow.e.t(eVar.a(chatRequest)), new ChatPinnedMessageBrick$onBrickAttach$1(this, null), 3));
        this.N = this.z.a.e(chatRequest, new md6(this));
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        ct21 ct21Var = this.N;
        if (ct21Var != null) {
            ct21Var.close();
        }
        this.N = null;
        yn50 yn50Var = this.P;
        if (yn50Var != null) {
            yn50Var.a();
        }
        this.P = null;
        smt0 smt0Var = this.O;
        if (smt0Var != null) {
            smt0Var.close();
        }
        this.O = null;
        this.Q.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r() {
        boolean z;
        y4a0 y4a0Var = this.K;
        View view = this.F;
        if (y4a0Var == null || !this.M) {
            view.setVisibility(8);
            return;
        }
        j3b j3bVar = this.L;
        if (j3bVar != null) {
            wbz0 wbz0Var = s8b.c;
            int i = j3bVar.i;
            wbz0Var.getClass();
            if (new s8b(i).f(ChatRightsFlag.PinMessage) || j3bVar.C) {
                z = true;
                this.G.setVisibility(!z ? 0 : 4);
                view.setVisibility(0);
            }
        }
        z = false;
        this.G.setVisibility(!z ? 0 : 4);
        view.setVisibility(0);
    }
}
