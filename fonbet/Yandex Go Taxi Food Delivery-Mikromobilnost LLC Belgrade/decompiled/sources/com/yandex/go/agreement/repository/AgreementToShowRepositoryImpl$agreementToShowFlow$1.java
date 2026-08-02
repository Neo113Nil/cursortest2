package com.yandex.go.agreement.repository;

import defpackage.bd;
import defpackage.bms;
import defpackage.cd;
import defpackage.dd;
import defpackage.sk1;
import defpackage.w511;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class AgreementToShowRepositoryImpl$agreementToShowFlow$1 extends FunctionReferenceImpl implements bms {
    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        Continuation continuation = (Continuation) obj4;
        g gVar = (g) this.receiver;
        gVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : (List) obj2) {
            dd ddVar = (dd) obj5;
            if (!gVar.f.a.n("ru.yandex.taxi.gdpr.NEED_SEND_TYPES").contains(ddVar.a()) && ddVar.b() == gVar.d.Lg()) {
                arrayList.add(obj5);
            }
        }
        if (booleanValue) {
            return gVar.c(arrayList, continuation);
        }
        dd ddVar2 = (dd) kotlin.collections.a.R(arrayList);
        if (ddVar2 != null) {
            if (ddVar2 instanceof bd) {
                return gVar.b((bd) ddVar2, booleanValue2, continuation);
            }
            if (!(ddVar2 instanceof cd)) {
                w511.b();
                return null;
            }
            cd cdVar = (cd) ddVar2;
            if (cdVar.e()) {
                return new sk1(cdVar);
            }
        }
        return null;
    }
}
