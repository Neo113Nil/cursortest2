package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.messenger.websdk.api.Cancelable;
import com.yandex.messenger.websdk.api.ChatRequest;
import com.yandex.messenger.websdk.api.MessengerParams;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import okhttp3.OkHttpClient;
import org.json.JSONObject;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes15.dex */
public final class hwu implements Cancelable {
    public static final /* synthetic */ kgx[] l;
    public final ChatRequest a;
    public final boolean b;
    public o221 c;
    public o221 d;
    public final MessengerParams e;
    public final ew2 f;
    public final t6f0 g;
    public final r5j0 h;
    public final OkHttpClient i;
    public final Handler j;
    public final h0w k;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("unreadMessagesCall", 0, "getUnreadMessagesCall()Lokhttp3/Call;", hwu.class);
        qoi0.a.getClass();
        l = new kgx[]{mutablePropertyReference1Impl};
    }

    public hwu(qh41 qh41Var, ChatRequest chatRequest, boolean z, o221 o221Var, o221 o221Var2) {
        this.a = chatRequest;
        this.b = z;
        this.c = o221Var;
        this.d = o221Var2;
        Looper looper = (Looper) qh41Var.n.getValue();
        this.e = qh41Var.g;
        this.f = qh41Var.r;
        this.g = qh41Var.l;
        this.h = (r5j0) qh41Var.E.getValue();
        this.i = (OkHttpClient) qh41Var.j.getValue();
        Handler handler = new Handler(looper);
        this.j = handler;
        this.k = new h0w(new w9u(10));
        handler.post(new gwu(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        yf7 yf7Var;
        if (jl40.f && jl40.l(Looper.getMainLooper(), Looper.myLooper())) {
            ny61.f("code must working only in background thread");
            return;
        }
        String g = this.g.g();
        ew2 ew2Var = this.f;
        if (g == null) {
            ew2Var.c("wm_unread_count_error", gw00.e(new Pair(CRLReasonCodeExtension.REASON, "empty auth token")));
            b(new IllegalArgumentException("Trying get unread count without auth token"));
            return;
        }
        MessengerParams messengerParams = this.e;
        String e = messengerParams.e.e();
        jwu jwuVar = new jwu();
        jwuVar.i(null, e);
        jwu g2 = jwuVar.e().g();
        g2.a("count_chats", "1");
        ChatRequest chatRequest = this.a;
        if (chatRequest instanceof f8b) {
            g2.a("chat_id", ((f8b) chatRequest).a);
        } else if (chatRequest instanceof j8b) {
            z = true;
            if (!this.b) {
                g2.a("other_guid", ((j8b) chatRequest).a);
                String str = g2.e().i;
                t4j0 a = this.h.a();
                a.c.a("Authorization", g);
                a.h(str);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("Client", messengerParams.a());
                a.e("POST", new zdx(jSONObject));
                nci0 nci0Var = (nci0) this.i.newCall(new d5j0(a));
                kgx[] kgxVarArr = l;
                kgx kgxVar = kgxVarArr[0];
                h0w h0wVar = this.k;
                h0wVar.setValue(this, kgxVar, nci0Var);
                kgx kgxVar2 = kgxVarArr[0];
                yf7Var = (yf7) ((AtomicReference) h0wVar.c).get();
                if (yf7Var == null) {
                    yf7Var.I(new wvb1(this, z));
                    return;
                }
                return;
            }
            if (evu0.J(messengerParams.c)) {
                ew2Var.c("wm_unread_count_error", gw00.e(new Pair(CRLReasonCodeExtension.REASON, "empty auth token")));
                b(new IllegalArgumentException("Cannot fetch both counters without workspace"));
                z = false;
            } else {
                if (g2.g != null) {
                    g2.l(jx81.h("detailed_workspace", true, " \"'<>#&=", 0, 0, 83));
                }
                g2.a("detailed_workspace", "1");
            }
            if (!z) {
                return;
            }
        } else if (!(chatRequest instanceof i8b) && chatRequest != null) {
            w511.b();
            return;
        }
        z = false;
        String str2 = g2.e().i;
        t4j0 a2 = this.h.a();
        a2.c.a("Authorization", g);
        a2.h(str2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("Client", messengerParams.a());
        a2.e("POST", new zdx(jSONObject2));
        nci0 nci0Var2 = (nci0) this.i.newCall(new d5j0(a2));
        kgx[] kgxVarArr2 = l;
        kgx kgxVar3 = kgxVarArr2[0];
        h0w h0wVar2 = this.k;
        h0wVar2.setValue(this, kgxVar3, nci0Var2);
        kgx kgxVar22 = kgxVarArr2[0];
        yf7Var = (yf7) ((AtomicReference) h0wVar2.c).get();
        if (yf7Var == null) {
        }
    }

    public final void b(Exception exc) {
        o221 o221Var = this.c;
        if (o221Var != null) {
            o221Var.invoke(exc);
        }
    }

    @Override // com.yandex.messenger.websdk.api.Cancelable
    public final void cancel() {
        this.c = null;
        this.d = null;
        Handler handler = this.j;
        handler.removeCallbacksAndMessages(null);
        handler.post(new gwu(this, 0));
    }
}
