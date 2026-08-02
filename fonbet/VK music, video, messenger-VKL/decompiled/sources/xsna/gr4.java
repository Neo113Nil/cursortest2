package xsna;

import android.net.Uri;
import com.ironsource.X3;
import com.vk.api.generated.base.dto.BaseUploadServerDto;
import com.vk.api.generated.messages.dto.MessagesAudioMessageDto;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import xsna.akv;
import xsna.k7r0;

/* compiled from: AudioMsgGOUploader.kt */
/* loaded from: classes2.dex */
public final class gr4 extends yjt<AttachAudioMsg, ocq0, w8r, MessagesAudioMessageDto> {
    public static final /* synthetic */ int m = 0;
    public final vg20 k;
    public final ckq<w8r> l;

    /* compiled from: AudioMsgGOUploader.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<String, akv> {
        @Override // xsna.izs
        public final akv invoke(String str) {
            gr4 gr4Var = (gr4) this.receiver;
            int i = gr4.m;
            gr4Var.getClass();
            akv.a aVar = new akv.a();
            aVar.a = str;
            aVar.b(gr4Var.f());
            aVar.d("waveform", brm0.y(Arrays.toString(((AttachAudioMsg) gr4Var.c).g), " ", ""));
            aVar.f = true;
            aVar.e = gr4Var.b.getConfig().v;
            return new akv(aVar);
        }
    }

    /* compiled from: AudioMsgGOUploader.kt */
    public static final class b<Result> implements k7r0 {
        public static final b<Result> b = new b<>();

        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            return new w8r(jSONObject.toString());
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    public gr4(w2w w2wVar, AttachAudioMsg attachAudioMsg) {
        super(w2wVar, attachAudioMsg);
        this.k = new vg20();
        this.l = new ckq<>(new a(1, this, gr4.class, "buildFileUploadCall", "buildFileUploadCall(Ljava/lang/String;)Lcom/vk/api/internal/HttpPostCall;", 0), b.b);
    }

    @Override // xsna.odq0
    public final boolean c(Attach attach) {
        return attach instanceof AttachAudioMsg;
    }

    @Override // xsna.yjt
    public final Uri d() {
        throw new NotImplementedError();
    }

    @Override // xsna.yjt
    public final Uri f() {
        return Uri.parse(((AttachAudioMsg) this.c).j);
    }

    @Override // xsna.yjt
    public final ocq0 h() {
        this.k.getClass();
        BaseUploadServerDto baseUploadServerDto = (BaseUploadServerDto) bz2.l(new tfx("messages.getAudioMessageUploadServer", new sf3(18), new s11(15)), true);
        return new ocq0(baseUploadServerDto.e(), baseUploadServerDto.d());
    }

    @Override // xsna.yjt
    public final MessagesAudioMessageDto j(w8r w8rVar) {
        String str = w8rVar.a;
        byte[] bArr = ((AttachAudioMsg) this.c).g;
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        for (int i = 0; i < length; i = tv4.a(arrayList, bArr[i], i, 1)) {
        }
        this.k.getClass();
        tfx tfxVar = new tfx("messages.saveAudioMessage", new u11(24), new v11(18));
        tfx.o(tfxVar, X3.i.b, str, 0, 0, 12);
        tfxVar.i("waveform", arrayList);
        return (MessagesAudioMessageDto) bz2.l(tfxVar, true);
    }

    @Override // xsna.yjt
    public final boolean l() {
        return false;
    }

    @Override // xsna.yjt
    public final Attach n(MessagesAudioMessageDto messagesAudioMessageDto) {
        MessagesAudioMessageDto messagesAudioMessageDto2 = messagesAudioMessageDto;
        AttachAudioMsg attachAudioMsg = (AttachAudioMsg) this.c;
        attachAudioMsg.getClass();
        AttachAudioMsg attachAudioMsg2 = new AttachAudioMsg(attachAudioMsg);
        attachAudioMsg2.e = messagesAudioMessageDto2.getId();
        attachAudioMsg2.C0(messagesAudioMessageDto2.getDuration());
        attachAudioMsg2.h = messagesAudioMessageDto2.f();
        attachAudioMsg2.i = messagesAudioMessageDto2.e();
        String d = messagesAudioMessageDto2.d();
        if (d == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        attachAudioMsg2.k = d;
        return attachAudioMsg2;
    }

    @Override // xsna.yjt
    public final Object o(Uri uri, Object obj) {
        return this.l.a((ocq0) obj, this);
    }
}
