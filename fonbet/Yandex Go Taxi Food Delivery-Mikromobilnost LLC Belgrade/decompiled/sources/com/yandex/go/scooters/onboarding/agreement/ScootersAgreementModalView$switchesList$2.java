package com.yandex.go.scooters.onboarding.agreement;

import com.yandex.go.scooters.data.model.AcceptItem;
import com.yandex.go.scooters.data.model.ScootersOnboardingAgreement;
import com.yandex.go.scooters.data.model.ScootersOnboardingExperiment;
import defpackage.d6z;
import defpackage.jl40;
import defpackage.jxm0;
import defpackage.sls;
import defpackage.zwm0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* synthetic */ class ScootersAgreementModalView$switchesList$2 extends FunctionReferenceImpl implements sls {
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x001d A[SYNTHETIC] */
    @Override // defpackage.sls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        jxm0 jxm0Var;
        ScootersOnboardingExperiment scootersOnboardingExperiment = ((zwm0) this.receiver).a;
        ScootersOnboardingAgreement scootersOnboardingAgreement = scootersOnboardingExperiment.d;
        ArrayList arrayList = null;
        List<AcceptItem> list = scootersOnboardingAgreement != null ? scootersOnboardingAgreement.g : null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (AcceptItem acceptItem : list) {
                String str = acceptItem.b;
                if (str == null) {
                    str = "";
                }
                String Y = d6z.Y(scootersOnboardingExperiment, str);
                if (Y.length() != 0) {
                    String str2 = acceptItem.c;
                    String Y2 = d6z.Y(scootersOnboardingExperiment, str2 != null ? str2 : "");
                    Boolean bool = acceptItem.a;
                    if (bool != null) {
                        jxm0Var = new jxm0(Y, Y2, bool.booleanValue(), false, jl40.l(kotlin.collections.a.Z(list), acceptItem) && scootersOnboardingExperiment.d.h == null);
                        if (jxm0Var == null) {
                            arrayList2.add(jxm0Var);
                        }
                    }
                }
                jxm0Var = null;
                if (jxm0Var == null) {
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? EmptyList.a : arrayList;
    }
}
