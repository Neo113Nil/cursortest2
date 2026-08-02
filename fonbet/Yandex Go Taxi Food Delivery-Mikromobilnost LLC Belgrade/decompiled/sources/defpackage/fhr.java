package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.payment.sdk.flex.impl.b;
import kotlin.a;

/* loaded from: classes2.dex */
public final /* synthetic */ class fhr implements ctl, m40 {
    public final /* synthetic */ b a;

    public /* synthetic */ fhr(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.ctl
    public ysl g(Context context) {
        tjk tjkVar = new tjk(new uht(a.a(new n5(context, 20))));
        b bVar = this.a;
        bhr bhrVar = bVar.f;
        lir lirVar = (bhrVar == null ? null : bhrVar).e;
        com.yandex.div.core.expression.variables.a aVar = bVar.c;
        wb8 wb8Var = (bhrVar == null ? null : bhrVar).r;
        boolean z = (bhrVar == null ? null : bhrVar).f;
        if (bhrVar == null) {
            bhrVar = null;
        }
        tjkVar.e = new qlk(lirVar, aVar, wb8Var, z, bhrVar.q);
        tjkVar.j = bVar.c;
        tjkVar.b = bVar.d;
        tjkVar.h = new mwl(context);
        bhr bhrVar2 = bVar.f;
        tjkVar.b(new vtr0((bhrVar2 == null ? null : bhrVar2).f, (bhrVar2 != null ? bhrVar2 : null).e));
        tjkVar.b(new n0w());
        tjkVar.q = false;
        return new ysl(tjkVar);
    }

    @Override // defpackage.m40
    public Activity provide() {
        bhr bhrVar = this.a.f;
        if (bhrVar == null) {
            bhrVar = null;
        }
        return bhrVar.b;
    }
}
