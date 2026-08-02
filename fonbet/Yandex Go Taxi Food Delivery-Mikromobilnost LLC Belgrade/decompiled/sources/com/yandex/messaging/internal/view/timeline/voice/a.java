package com.yandex.messaging.internal.view.timeline.voice;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.VoiceMessageData;
import com.yandex.messaging.internal.view.timeline.c;
import defpackage.a1r;
import defpackage.b4b;
import defpackage.e9h0;
import defpackage.evu0;
import defpackage.hi91;
import defpackage.i3y;
import defpackage.j24;
import defpackage.jwf;
import defpackage.l1r;
import defpackage.l95;
import defpackage.or80;
import defpackage.oyh0;
import defpackage.oyq;
import defpackage.sa5;
import defpackage.vb5;
import defpackage.vhi0;
import defpackage.wwg0;
import defpackage.xzq;
import defpackage.yab;
import defpackage.z0r;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;

/* loaded from: classes15.dex */
public abstract class a extends c {
    public static final /* synthetic */ int H2 = 0;
    public boolean B2;
    public final l1r C2;
    public final or80 x2;
    public final i3y y2;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(boolean z, or80 or80Var, jwf jwfVar) {
        super(z, r3, jwfVar);
        int i;
        int i2;
        View view = or80Var.b;
        this.x2 = or80Var;
        this.y2 = kotlin.a.a(new l95(4, this));
        Context context = ((ViewGroup) view).getContext();
        ImageView imageView = (ImageView) ((ViewGroup) view).findViewById(e9h0.dialog_file_button);
        TextView textView = (TextView) ((ViewGroup) view).findViewById(e9h0.dialog_file_size);
        a1r a1rVar = (a1r) jwfVar.m;
        oyq oyqVar = (oyq) jwfVar.C;
        xzq xzqVar = (xzq) jwfVar.s;
        int i3 = xzq.c;
        switch (or80Var.w) {
            case 0:
                i = wwg0.msg_media_button_waiting_other;
                break;
            default:
                i = wwg0.msg_media_button_waiting_own;
                break;
        }
        int i4 = i;
        switch (or80Var.w) {
            case 0:
                i2 = wwg0.msg_ic_download_indicator_other;
                break;
            default:
                i2 = wwg0.msg_ic_download_indicator_own;
                break;
        }
        this.C2 = new l1r(context, imageView, textView, a1rVar, oyqVar, xzqVar, i3, 0, i2, i4, 0, null, 6272);
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final View C0() {
        or80 or80Var = this.x2;
        switch (or80Var.w) {
        }
        return or80Var.x;
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final void J0(String str, boolean z) {
        CharSequence text;
        or80 or80Var = this.x2;
        String z0 = z0((or80Var.a().getVisibility() != 0 || (text = or80Var.a().getText()) == null || text.length() == 0) ? this.a.getContext().getString(oyh0.voice_message_placeholder_text) : or80Var.a().getText().toString(), z);
        if (or80Var.a().getVisibility() == 0) {
            or80Var.a().setContentDescription(z0);
            y0(or80Var.a());
        } else {
            or80Var.c().setContentDescription(z0);
            y0(or80Var.c());
        }
    }

    public final vhi0 K0() {
        return (vhi0) this.y2.getValue();
    }

    @Override // defpackage.qdz0
    public final boolean W() {
        return this.v2.b();
    }

    @Override // com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public void X(yab yabVar, vb5 vb5Var) {
        ImageButton imageButton;
        String str;
        View view;
        super.X(yabVar, vb5Var);
        or80 or80Var = this.x2;
        hi91.g(new BaseStubVoiceMessageViewHolder$bind$1$1(this, null), or80Var.a());
        switch (or80Var.w) {
            case 0:
                imageButton = or80Var.C;
                break;
            default:
                imageButton = or80Var.C;
                break;
        }
        hi91.g(new BaseStubVoiceMessageViewHolder$bind$1$2(this, null), imageButton);
        VoiceMessageData voiceMessageData = (VoiceMessageData) yabVar.R();
        ((b4b) this.a).addLimitedView(K0());
        this.B2 = false;
        if (vb5Var instanceof sa5) {
            K0().b = ((sa5) vb5Var).a;
            this.B2 = true;
        }
        ServerMessageRef x0 = yabVar.x0();
        byte[] bArr = voiceMessageData.waveform;
        if (bArr == null || bArr.length == 0) {
            bArr = new byte[]{0};
        }
        byte[] bArr2 = new byte[bArr.length * 2];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i3 = i2 + 1;
            int i4 = i2 * 2;
            bArr2[i4 + 1] = (byte) ((b & PKIBody._CCP) << 4);
            bArr2[i4] = (byte) (b & 240);
            i++;
            i2 = i3;
        }
        or80Var.c().batchUpdate(new j24(12, bArr2));
        if (!voiceMessageData.wasRecognized || (str = voiceMessageData.recognizedText) == null || evu0.J(str)) {
            or80Var.b().setVisibility(8);
        } else {
            String str2 = voiceMessageData.recognizedText;
            if (str2 != null) {
                String str3 = evu0.J(str2) ? null : str2;
                if (str3 != null) {
                    or80Var.b().setVisibility(0);
                    or80Var.a().setVisibility(0);
                    switch (or80Var.w) {
                        case 0:
                            view = or80Var.z;
                            break;
                        default:
                            view = or80Var.z;
                            break;
                    }
                    view.setVisibility(8);
                    vhi0 K0 = K0();
                    K0.x = str3;
                    K0.a();
                    K0.c();
                }
            }
        }
        if (voiceMessageData.fileId != null && x0 != null && !this.B2) {
            v0(new sa5(K0().b));
        }
        this.v2.a(this.t0, yabVar, e0().f);
        l1r.a(this.C2, yabVar.W(), voiceMessageData, this.L0.l(), null, false, false, 112);
    }

    @Override // com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final boolean Y() {
        return false;
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final boolean b0() {
        return true;
    }

    @Override // com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final void f0() {
        super.f0();
        this.x2.a().setOnClickListener(null);
        l1r l1rVar = this.C2;
        z0r z0rVar = l1rVar.J;
        if (z0rVar != null) {
            z0rVar.close();
        }
        l1rVar.J = null;
        l1rVar.P = false;
        l1rVar.I = false;
        l1rVar.H = null;
        l1rVar.C.a();
        this.v2.e();
    }
}
