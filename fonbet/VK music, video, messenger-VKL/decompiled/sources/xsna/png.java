package xsna;

import com.vk.api.generated.users.dto.UsersCanNotCallReasonDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.OnlineInfo;
import com.vk.log.L;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;
import xsna.bp9;
import xsna.khw0;
import xsna.oap;

/* compiled from: CommonVoipCallManager.kt */
/* loaded from: classes11.dex */
public final class png implements khw0, w8i {
    public final gtw0 b;
    public final bp9 c;
    public final com.vk.voip.ui.push.a d;
    public final rd9 e;
    public final bpn0 f = new bpn0(new o66(this, 2));
    public final bpn0 g = new bpn0(new dr4(this, 3));
    public final bpn0 h = new bpn0(new f53(this, 6));
    public final bpn0 i = new bpn0(new er4(this, 3));
    public final bpn0 j = new bpn0(new fr4(this, 4));

    /* compiled from: CommonVoipCallManager.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public a(Object obj) {
            super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public png(gtw0 gtw0Var, bp9 bp9Var, com.vk.voip.ui.push.a aVar, rd9 rd9Var) {
        this.b = gtw0Var;
        this.c = bp9Var;
        this.d = aVar;
        this.e = rd9Var;
    }

    @Override // xsna.khw0
    public final void a(UserId userId, OnlineInfo onlineInfo) {
        this.c.d.put(String.valueOf(userId.b), new bp9.a(UsersCanNotCallReasonDto.PRIVACY_SETTINGS, new oap.a(onlineInfo)));
    }

    @Override // xsna.khw0
    public final void b() {
        e(false, new vv0(13));
    }

    @Override // xsna.khw0
    public final void c(String str, JSONObject jSONObject) {
        e(true, new xt9(this, jSONObject, str, 2));
    }

    @Override // xsna.khw0
    public final void d(khw0.a aVar) {
        com.vk.core.utils.newtork.b.a.getClass();
        if (com.vk.core.utils.newtork.b.d()) {
            e(false, new com.vk.voip.a(0, this, aVar));
        } else {
            ((phw0) this.j.getValue()).c();
        }
    }

    public final io.reactivex.rxjava3.disposables.c e(boolean z, gzs<s3q0> gzsVar) {
        return io.reactivex.rxjava3.kotlin.c.d(this.b.b(z).o(asu0.a.d()), new ong(0, gzsVar), new a(L.a));
    }
}
