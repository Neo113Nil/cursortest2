package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class fp0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fp0(Object obj, int i, Object obj2, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
        this.e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                hp0 hp0Var = (hp0) this.d;
                String str = (String) this.e;
                UserId userId = hp0Var.b;
                int i = this.c;
                new jx2(new gns0(userId, i, str), new gp0(hp0Var, i, str)).a();
                break;
            default:
                b7q.f((b7q) this.d, this.c, (com.vk.movika.sdk.base.ui.k) this.e);
                break;
        }
    }
}
