package xsna;

import com.vk.dto.common.id.UserId;
import io.opentelemetry.api.trace.StatusCode;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class es80 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ es80(long j, UserId userId, String str, w8w0 w8w0Var) {
        this.d = userId;
        this.e = str;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ohk0 a;
        int i = this.b;
        long j = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                fs80 fs80Var = (fs80) obj3;
                ks80 ks80Var = (ks80) obj2;
                String str = (String) ((Map.Entry) obj).getKey();
                Long l = fs80Var.a.get(str);
                if (l != null) {
                    long longValue = j - l.longValue();
                    if (longValue > fs80Var.b && (a = ks80Var.f().a(str)) != null) {
                        a.l(StatusCode.OK);
                        a.m(TimeUnit.NANOSECONDS.toSeconds(longValue), "sessionEnd");
                        s3q0 s3q0Var = s3q0.a;
                        a.end();
                        if (ks80Var.d.getLooper().isCurrentThread()) {
                            Iterator<Map.Entry<Integer, Set<String>>> it = ks80Var.c.entrySet().iterator();
                            while (it.hasNext()) {
                                it.next().getValue().remove(str);
                            }
                        }
                    }
                }
                return s3q0.a;
            default:
                UserId userId = (UserId) obj3;
                String str2 = (String) obj2;
                qyg0 V0 = ((hyg0) obj).V0("INSERT OR REPLACE INTO user_vmoji_files (user, file, last_access) VALUES(?, ?, ?)");
                try {
                    V0.bindLong(1, userId.b);
                    V0.D3(2, str2);
                    V0.bindLong(3, j);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
        }
    }

    public /* synthetic */ es80(fs80 fs80Var, long j, ks80 ks80Var) {
        this.d = fs80Var;
        this.c = j;
        this.e = ks80Var;
    }
}
