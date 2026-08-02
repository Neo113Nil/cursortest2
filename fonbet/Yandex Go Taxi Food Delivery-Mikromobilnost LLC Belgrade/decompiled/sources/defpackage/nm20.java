package defpackage;

import com.yandex.mob.domain.s;
import com.yandex.mob.m;
import java.util.Arrays;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes8.dex */
public final class nm20 implements ur20 {
    public final i3y a;

    public nm20(yuf0 yuf0Var) {
        this.a = a.b(LazyThreadSafetyMode.SYNCHRONIZED, new lm20(yuf0Var, 5));
    }

    @Override // defpackage.ur20
    public final m d() {
        return (m) ((mm20) this.a.getValue()).d.getValue();
    }

    @Override // defpackage.ur20
    public final in20 e(String str, ol20... ol20VarArr) {
        s sVar = (s) ((mm20) this.a.getValue()).b.getValue();
        ol20[] ol20VarArr2 = (ol20[]) Arrays.copyOf(ol20VarArr, ol20VarArr.length);
        sVar.b.d(str);
        return new in20(str, sVar.a.j(str, (ol20[]) Arrays.copyOf(ol20VarArr2, ol20VarArr2.length)));
    }
}
