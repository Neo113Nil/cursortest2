package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.live.LiveEventModel;
import com.vk.dto.live.LiveLongPollModel;
import com.vk.httpexecutor.api.NetworkClient;
import java.util.Iterator;
import kotlin.text.Regex;
import okhttp3.p;
import org.json.JSONObject;

/* compiled from: LongPoolSource.kt */
/* loaded from: classes7.dex */
public final class i500 implements io.reactivex.rxjava3.core.s<LiveEventModel> {
    public okhttp3.u b;
    public f8f0 c;
    public String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ int f;
    public final /* synthetic */ UserId g;

    public i500(int i, UserId userId, String str) {
        this.e = str;
        this.f = i;
        this.g = userId;
        this.d = str;
    }

    public final JSONObject a() {
        String str;
        p.a aVar = new p.a();
        aVar.i(this.d);
        okhttp3.p b = aVar.b();
        o260 o260Var = d260.a;
        if (o260Var == null) {
            o260Var = null;
        }
        o260Var.getClass();
        f8f0 f8f0Var = (f8f0) o260Var.b(NetworkClient.ClientType.CLIENT_DEFAULT).a(b);
        this.c = f8f0Var;
        okhttp3.u execute = f8f0Var.execute();
        this.b = execute;
        try {
            okhttp3.v vVar = execute.h;
            str = vVar != null ? vVar.string() : null;
            if (str == null) {
                str = "";
            }
        } catch (Exception unused) {
            str = "Invalid response";
        }
        return new JSONObject(str);
    }

    @Override // io.reactivex.rxjava3.core.s
    public final void subscribe(io.reactivex.rxjava3.core.r<LiveEventModel> rVar) {
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.h500
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                i500 i500Var = i500.this;
                try {
                    okhttp3.u uVar = i500Var.b;
                    if (uVar != null) {
                        uVar.close();
                        i500Var.b = null;
                    }
                    f8f0 f8f0Var = i500Var.c;
                    if (f8f0Var != null) {
                        f8f0Var.cancel();
                        i500Var.c = null;
                    }
                } catch (Exception unused) {
                }
            }
        });
        try {
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
            LiveLongPollModel liveLongPollModel = new LiveLongPollModel(a(), this.f, this.g);
            if (rVar.h()) {
                return;
            }
            if (liveLongPollModel.d) {
                rVar.b(new Exception());
                return;
            }
            String str = this.e;
            int i = liveLongPollModel.c;
            this.d = new Regex("ts=\\d*").i(str, "ts=" + i);
            Iterator it = liveLongPollModel.g.iterator();
            while (it.hasNext()) {
                rVar.onNext((LiveEventModel) it.next());
            }
            rVar.onComplete();
        } catch (Exception e) {
            if (rVar.h()) {
                return;
            }
            rVar.b(e);
        }
    }
}
