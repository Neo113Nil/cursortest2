package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;

/* compiled from: NewsfeedPagingReducer.kt */
/* loaded from: classes4.dex */
public final class qu60 implements bm50<qz60, kv60> {
    public final lv60 a;
    public final pr60 b;

    public qu60(lv60 lv60Var, s1v s1vVar, rr60 rr60Var) {
        this.a = lv60Var;
        this.b = new pr60(s1vVar, rr60Var);
    }

    @Override // xsna.bm50
    public final qz60 a(qz60 qz60Var, kv60 kv60Var) {
        qz60 qz60Var2 = qz60Var;
        kv60 kv60Var2 = kv60Var;
        if (this.a.a(qz60Var2, kv60Var2)) {
            return qz60.a(qz60Var2, this.b.a(qz60Var2.b, kv60Var2.a), 0, null, null, null, null, null, null, 254);
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return qz60Var2;
        }
        L.u(l, L.LogType.d, new Object[]{"Skipping " + kv60Var2});
        return qz60Var2;
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(kv60 kv60Var) {
        return true;
    }
}
