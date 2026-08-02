package xsna;

import com.vk.feed.settings.impl.presentation.filtered.tab.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class wi60 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wi60(com.vk.lists.c cVar, xi60 xi60Var, boolean z) {
        this.d = cVar;
        this.e = xi60Var;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.lists.c cVar = (com.vk.lists.c) this.d;
                xi60 xi60Var = (xi60) this.e;
                cfr cfrVar = (cfr) obj;
                cVar.s(cfrVar.b);
                String str = cfrVar.b;
                cVar.r(!(str == null || str.length() == 0));
                xi60Var.c.a(new b.C1061b(cfrVar, this.c));
                return s3q0.a;
            default:
                boolean z = this.c;
                String str2 = (String) this.d;
                String str3 = (String) this.e;
                qyg0 V0 = ((hyg0) obj).V0("UPDATE podcast SET is_subscribed = ? WHERE uid = ? AND owner_id = ?");
                try {
                    V0.bindLong(1, z ? 1L : 0L);
                    V0.D3(2, str2);
                    V0.D3(3, str3);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
        }
    }

    public /* synthetic */ wi60(boolean z, String str, String str2) {
        this.c = z;
        this.d = str;
        this.e = str2;
    }
}
