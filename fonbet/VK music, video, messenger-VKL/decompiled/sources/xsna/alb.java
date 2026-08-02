package xsna;

import com.vk.log.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class alb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ alb(String str, String str2, int i) {
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                String str = this.c;
                String str2 = this.d;
                qyg0 V0 = ((hyg0) obj).V0("SELECT manifest_url FROM audio_book_chapter WHERE uid = ? AND chapter_id = ?");
                try {
                    V0.D3(1, str);
                    V0.D3(2, str2);
                    String str3 = null;
                    if (V0.step() && !V0.isNull(0)) {
                        str3 = V0.l2(0);
                    }
                    return str3;
                } finally {
                    V0.close();
                }
            default:
                StringBuilder sb = new StringBuilder("messages.callReceived error ");
                sb.append((Throwable) obj);
                sb.append("; callId=");
                sb.append(this.c);
                sb.append("; recipientUserToken is null: ");
                sb.append(this.d == null);
                L.l("IncomingPushLogger", sb.toString());
                return s3q0.a;
        }
    }
}
