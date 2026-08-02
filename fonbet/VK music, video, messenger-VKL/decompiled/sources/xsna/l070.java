package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import kotlin.NoWhenBranchMatchedException;
import xsna.jv60;

/* compiled from: NewsfeedStoriesReducer.kt */
/* loaded from: classes4.dex */
public final class l070 implements bm50<qz60, jv60.e> {
    public final lv60 a;

    public l070(lv60 lv60Var) {
        this.a = lv60Var;
    }

    @Override // xsna.bm50
    public final qz60 a(qz60 qz60Var, jv60.e eVar) {
        qz60 qz60Var2 = qz60Var;
        jv60.e eVar2 = eVar;
        if (this.a.a(qz60Var2, eVar2)) {
            if (eVar2 instanceof jv60.e.a) {
                return qz60.a(qz60Var2, null, 0, null, null, ((jv60.e.a) eVar2).a, null, null, null, 239);
            }
            throw new NoWhenBranchMatchedException();
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return qz60Var2;
        }
        L.u(l, L.LogType.d, new Object[]{"Skipping " + eVar2});
        return qz60Var2;
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(jv60.e eVar) {
        return true;
    }
}
