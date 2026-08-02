package xsna;

import android.net.Uri;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.members.VoipDataProvider;
import com.vk.writebar.attach.AttachmentsEditorView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class fnw0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fnw0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Void w;
        switch (this.b) {
            case 0:
                VoipDataProvider voipDataProvider = (VoipDataProvider) this.c;
                nt8 nt8Var = voipDataProvider.c.b;
                boolean z = voipDataProvider.b.d.invoke() != null;
                nt8Var.getClass();
                OKVoipEngine.b.getClass();
                xdw0 a = OKVoipEngine.x().a();
                s1v s1vVar = new s1v();
                com.vk.voip.ui.c.b.getClass();
                yqe0 yqe0Var = new yqe0(s1vVar, com.vk.voip.ui.c.K0, z);
                if (a == null) {
                    yqe0Var = null;
                }
                return new dvm0(yqe0Var, (io.reactivex.rxjava3.core.q) nt8Var.b);
            case 1:
                Uri uri = (Uri) this.c;
                StringBuilder sb = new StringBuilder("\n            getClientAuthQueries:\n                wat: ");
                String queryParameter = uri.getQueryParameter("wat");
                sb.append(queryParameter != null ? erm0.D0(4, queryParameter) : null);
                sb.append("...\n                wto: ");
                sb.append(uri.getQueryParameter("wto"));
                sb.append("\n                device_id: ");
                sb.append(uri.getQueryParameter("device_id"));
                sb.append("\n                mobile: ");
                sb.append(uri.getQueryParameter("mobile"));
                sb.append("\n            ");
                return xqm0.g(sb.toString());
            case 2:
                a24 a24Var = ((AttachmentsEditorView) this.c).B;
                boolean z2 = a24Var.a;
                a24Var.a = false;
                return Boolean.valueOf(z2);
            default:
                w = ((ru.mail.libverify.api.s) this.c).w();
                return w;
        }
    }
}
