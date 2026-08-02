package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.messaging.audio.a;
import com.yandex.messaging.audio.d;
import com.yandex.messaging.audio.e;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.VoiceMessageData;
import com.yandex.messaging.internal.view.timeline.c;
import com.yandex.messaging.views.WaveformView;
import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;

/* loaded from: classes15.dex */
public abstract class dd5 extends c {
    public final View B2;
    public final TextView C2;
    public final vhi0 H2;
    public final WaveformView N2;
    public final d T2;
    public boolean V2;
    public final va3 x2;
    public final ViewGroup y2;

    public dd5(boolean z, View view, jwf jwfVar) {
        super(z, view, jwfVar);
        this.x2 = (va3) jwfVar.e;
        this.y2 = (ViewGroup) view.findViewById(e9h0.recognizing_group);
        this.B2 = view.findViewById(e9h0.recognizing);
        TextView textView = (TextView) view.findViewById(e9h0.recognized_text);
        this.C2 = textView;
        this.H2 = new vhi0(textView);
        this.N2 = (WaveformView) view.findViewById(e9h0.waveform);
        this.T2 = new d((tyc0) jwfVar.d, (ImageView) view.findViewById(e9h0.play_button), (ImageView) view.findViewById(e9h0.pause_button), (ImageView) view.findViewById(e9h0.loading_button), (WaveformView) view.findViewById(e9h0.waveform), (TextView) view.findViewById(e9h0.duration));
        textView.setOnClickListener(new tf(23, this));
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final Drawable A0(z9z0 z9z0Var, boolean z, boolean z2) {
        return z9z0Var.a(z, z2, this.R, this.v2.x.F, G0());
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final void J0(String str, boolean z) {
        CharSequence text;
        TextView textView = this.C2;
        String z0 = z0((textView.getVisibility() != 0 || (text = textView.getText()) == null || text.length() == 0) ? this.a.getContext().getString(oyh0.voice_message_placeholder_text) : textView.getText().toString(), z);
        if (textView.getVisibility() == 0) {
            textView.setContentDescription(z0);
            y0(textView);
        } else {
            View view = this.N2;
            view.setContentDescription(z0);
            y0(view);
        }
    }

    @Override // defpackage.qdz0
    public final boolean W() {
        return this.v2.b();
    }

    @Override // com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public void X(yab yabVar, vb5 vb5Var) {
        String str;
        super.X(yabVar, vb5Var);
        VoiceMessageData voiceMessageData = (VoiceMessageData) yabVar.R();
        b4b b4bVar = (b4b) this.a;
        vhi0 vhi0Var = this.H2;
        b4bVar.addLimitedView(vhi0Var);
        this.V2 = false;
        boolean z = vb5Var instanceof cd5;
        d dVar = this.T2;
        if (z) {
            cd5 cd5Var = (cd5) vb5Var;
            vhi0Var.b = cd5Var.b;
            izc0 izc0Var = cd5Var.a;
            if (izc0Var != null) {
                dVar.a(izc0Var);
            }
            this.V2 = true;
        } else {
            vhi0Var.b = true;
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
        this.N2.batchUpdate(new w04(9, bArr2, this));
        boolean z2 = voiceMessageData.wasRecognized;
        ViewGroup viewGroup = this.y2;
        if (!z2 || (str = voiceMessageData.recognizedText) == null || evu0.J(str)) {
            viewGroup.setVisibility(8);
        } else {
            String str2 = voiceMessageData.recognizedText;
            viewGroup.setVisibility(0);
            this.C2.setVisibility(0);
            this.B2.setVisibility(8);
            vhi0Var.x = str2;
            vhi0Var.a();
            vhi0Var.c();
        }
        if (voiceMessageData.fileId != null && x0 != null) {
            if (!this.V2) {
                va3 va3Var = this.x2;
                va3Var.getClass();
                String requiredChatId = x0.getRequiredChatId();
                LinkedHashMap linkedHashMap = va3Var.d;
                e eVar = (e) linkedHashMap.get(requiredChatId);
                if (eVar == null) {
                    eVar = new e(va3Var.a, p8b.a(requiredChatId), new v5(18, va3Var, requiredChatId));
                    linkedHashMap.put(requiredChatId, eVar);
                }
                dVar.a(new a(x0, eVar));
                v0(new cd5(dVar.i, vhi0Var.b));
            }
            dVar.f = new j24(13, this);
        }
        this.v2.a(this.t0, yabVar, e0().f);
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
        d dVar = this.T2;
        kotlinx.coroutines.a.g(dVar.d.a, null);
        b1s b1sVar = dVar.g;
        if (b1sVar != null) {
            b1sVar.cancel();
        }
        dVar.g = null;
        dVar.e.i();
        dVar.i = null;
        this.v2.e();
    }
}
