package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.live.LiveEventModel;
import com.vk.dto.live.LiveLongPollModel;
import com.vk.httpexecutor.api.NetworkClient;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.p;
import org.json.JSONObject;

/* compiled from: LiveLongPollController.java */
/* loaded from: classes3.dex */
public final class vjz implements io.reactivex.rxjava3.core.s<LiveEventModel> {
    public okhttp3.u b;
    public f8f0 c;
    public String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ int f;
    public final /* synthetic */ UserId g;
    public final /* synthetic */ wjz h;

    /* compiled from: LiveLongPollController.java */
    public class a implements io.reactivex.rxjava3.functions.e {
        public a() {
        }

        @Override // io.reactivex.rxjava3.functions.e
        public final void cancel() throws Exception {
            try {
                vjz.this.a();
            } catch (Exception unused) {
            }
        }
    }

    public vjz(wjz wjzVar, String str, int i, UserId userId) {
        this.h = wjzVar;
        this.e = str;
        this.f = i;
        this.g = userId;
        this.d = str;
    }

    public final void a() {
        okhttp3.u uVar = this.b;
        if (uVar != null) {
            uVar.close();
            this.b = null;
        }
        f8f0 f8f0Var = this.c;
        if (f8f0Var != null) {
            f8f0Var.cancel();
            this.c = null;
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public final void subscribe(io.reactivex.rxjava3.core.r<LiveEventModel> rVar) {
        rVar.a(new a());
        a();
        p.a aVar = new p.a();
        aVar.i(this.d);
        okhttp3.p b = aVar.b();
        try {
            AtomicInteger atomicInteger = this.h.b;
            int andIncrement = atomicInteger != null ? atomicInteger.getAndIncrement() : 0;
            this.h.a.a(" ----> [" + andIncrement + "] " + this.d);
            o260 o260Var = d260.a;
            if (o260Var == null) {
                o260Var = null;
            }
            o260Var.getClass();
            okhttp3.d a2 = o260Var.b(NetworkClient.ClientType.CLIENT_DEFAULT).a(b);
            this.c = (f8f0) a2;
            okhttp3.u execute = ((f8f0) a2).execute();
            this.b = execute;
            try {
                String string = execute.h.string();
                this.h.a.a(" <---- [" + andIncrement + "] " + string);
                a();
                LiveLongPollModel liveLongPollModel = new LiveLongPollModel(new JSONObject(string), this.f, this.g);
                if (rVar.h()) {
                    return;
                }
                if (liveLongPollModel.d) {
                    rVar.b(new Exception());
                    return;
                }
                this.d = this.e.replaceFirst("ts=\\d*", "ts=" + liveLongPollModel.c);
                Iterator it = liveLongPollModel.g.iterator();
                while (it.hasNext()) {
                    rVar.onNext((LiveEventModel) it.next());
                }
                rVar.onComplete();
            } catch (Throwable th) {
                this.h.a.a(" <---- [" + andIncrement + "] [error]");
                throw th;
            }
        } catch (Exception e) {
            if (rVar.h()) {
                return;
            }
            rVar.b(e);
        }
    }
}
