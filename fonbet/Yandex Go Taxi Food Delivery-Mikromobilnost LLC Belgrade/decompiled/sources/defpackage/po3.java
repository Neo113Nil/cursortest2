package defpackage;

import com.yandex.messaging.core.net.entities.SetPushTokenData;
import com.yandex.messaging.core.net.entities.SetPushTokenParams;

/* loaded from: classes15.dex */
public final class po3 extends w920 {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ kzo D;
    public final /* synthetic */ to3 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String w;
    public final /* synthetic */ c5g0 x;
    public final /* synthetic */ String y;
    public final /* synthetic */ boolean z;

    public po3(to3 to3Var, String str, String str2, String str3, c5g0 c5g0Var, String str4, boolean z, String str5, String str6, String str7, kzo kzoVar) {
        this.a = to3Var;
        this.b = str;
        this.c = str2;
        this.w = str3;
        this.x = c5g0Var;
        this.y = str4;
        this.z = z;
        this.A = str5;
        this.B = str6;
        this.C = str7;
        this.D = kzoVar;
    }

    @Override // defpackage.w920
    public final gg70 d(kvj0 kvj0Var) {
        return ouu.b(this.a.b, "set_push_token", SetPushTokenData.class, kvj0Var);
    }

    @Override // defpackage.w920
    public final boolean e(ngz ngzVar) {
        this.D.mo103c(ngzVar.b);
        return false;
    }

    @Override // defpackage.w920
    public final void g(Object obj) {
        this.D.D((SetPushTokenData) obj);
    }

    @Override // defpackage.w920
    public final t4j0 i() {
        return this.a.b.a(new SetPushTokenParams(this.b, this.c, this.w, this.x.b.getValue(), this.y, this.z, this.A, this.B, this.C), "set_push_token");
    }
}
