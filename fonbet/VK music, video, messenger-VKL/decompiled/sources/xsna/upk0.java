package xsna;

import com.vk.stat.AppStartReporter;
import com.vk.stat.scheme.SchemeStat$TypeAppStarts;

/* compiled from: StartConcentrator.kt */
/* loaded from: classes11.dex */
public final class upk0 implements dyp<SchemeStat$TypeAppStarts> {
    public final kqk0 a;

    public upk0(kqk0 kqk0Var) {
        this.a = kqk0Var;
    }

    @Override // xsna.dyp
    public final SchemeStat$TypeAppStarts a(SchemeStat$TypeAppStarts schemeStat$TypeAppStarts) {
        kqk0 kqk0Var = this.a;
        AppStartReporter.StartMethod startMethod = kqk0Var.a;
        SchemeStat$TypeAppStarts.StartMethod i = startMethod.i();
        SchemeStat$TypeAppStarts.StartType startType = kqk0Var.b;
        String valueOf = String.valueOf(kqk0Var.c);
        String valueOf2 = String.valueOf(kqk0Var.d);
        return SchemeStat$TypeAppStarts.a(schemeStat$TypeAppStarts, valueOf, startType, i, SchemeStat$TypeAppStarts.StartMethod.PUSH == startMethod.i() ? startMethod.h() : null, SchemeStat$TypeAppStarts.StartMethod.COMPANION == startMethod.i() ? startMethod.h() : null, valueOf2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -64, -1, 1048575);
    }
}
