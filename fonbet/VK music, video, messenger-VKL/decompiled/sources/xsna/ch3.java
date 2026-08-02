package xsna;

import com.vk.update.core.c;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.eh3;
import xsna.u8m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ch3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ch3(long j, Object obj, Object obj2, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                dh3 dh3Var = (dh3) this.e;
                u8m a = u8m.q.a(((Integer) obj).intValue());
                if (a != null) {
                    dh3Var.c.invoke(new eh3.d(this.c, a));
                }
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 1:
                long j = this.c;
                String str = (String) this.d;
                String str2 = (String) this.e;
                qyg0 V0 = ((hyg0) obj).V0("UPDATE auto_download_track SET auto_download_type = 1, initial_auto_download_date = ? WHERE uid = ? AND mid = ?");
                try {
                    V0.bindLong(1, j);
                    V0.D3(2, str);
                    V0.D3(3, str2);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            default:
                com.vk.update.core.a aVar = (com.vk.update.core.a) this.d;
                Throwable th2 = (Throwable) obj;
                aVar.h.a((String) this.e, new c.e(this.c, th2));
                aVar.c.a(th2);
                return s3q0.a;
        }
    }

    public /* synthetic */ ch3(long j, String str, String str2) {
        this.b = 1;
        this.c = j;
        this.d = str;
        this.e = str2;
    }
}
