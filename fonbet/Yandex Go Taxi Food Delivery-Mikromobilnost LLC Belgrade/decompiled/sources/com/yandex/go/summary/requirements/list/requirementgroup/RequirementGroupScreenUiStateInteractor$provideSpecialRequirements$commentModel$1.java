package com.yandex.go.summary.requirements.list.requirementgroup;

import defpackage.f580;
import defpackage.lot0;
import defpackage.tls;
import defpackage.yot0;
import defpackage.zot0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class RequirementGroupScreenUiStateInteractor$provideSpecialRequirements$commentModel$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zot0 zot0Var = (zot0) obj;
        b bVar = (b) this.receiver;
        lot0 lot0Var = bVar.b;
        f580 f580Var = bVar.d;
        String str = zot0Var.g;
        yot0 yot0Var = zot0Var.e;
        f580Var.f(str, yot0Var != null ? yot0Var.f : false);
        if (yot0Var == null || !yot0Var.f) {
            lot0Var.a().w(str);
        } else {
            String str2 = yot0Var.e;
            if (str2 == null) {
                str2 = "";
            }
            lot0Var.a().r(str, str2);
        }
        return zy11.a;
    }
}
