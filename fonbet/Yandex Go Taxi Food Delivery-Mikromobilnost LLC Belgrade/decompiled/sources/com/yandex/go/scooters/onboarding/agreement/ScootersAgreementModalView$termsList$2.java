package com.yandex.go.scooters.onboarding.agreement;

import com.yandex.go.scooters.data.model.AgreementRules;
import com.yandex.go.scooters.data.model.ScootersOnboardingAgreement;
import com.yandex.go.scooters.data.model.ScootersOnboardingExperiment;
import defpackage.axm0;
import defpackage.d6z;
import defpackage.sls;
import defpackage.zwm0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* synthetic */ class ScootersAgreementModalView$termsList$2 extends FunctionReferenceImpl implements sls {
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x001a A[SYNTHETIC] */
    @Override // defpackage.sls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        List<AgreementRules> list;
        axm0 axm0Var;
        ScootersOnboardingExperiment scootersOnboardingExperiment = ((zwm0) this.receiver).a;
        ScootersOnboardingAgreement scootersOnboardingAgreement = scootersOnboardingExperiment.d;
        ArrayList arrayList = null;
        if (scootersOnboardingAgreement != null && (list = scootersOnboardingAgreement.f) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (AgreementRules agreementRules : list) {
                String str = agreementRules.b;
                if (str == null) {
                    str = "";
                }
                String Y = d6z.Y(scootersOnboardingExperiment, str);
                if (Y.length() != 0) {
                    String str2 = agreementRules.c;
                    String Y2 = d6z.Y(scootersOnboardingExperiment, str2 != null ? str2 : "");
                    String str3 = agreementRules.a;
                    if (str3 != null) {
                        axm0Var = new axm0(Y, Y2, str3);
                        if (axm0Var == null) {
                            arrayList2.add(axm0Var);
                        }
                    }
                }
                axm0Var = null;
                if (axm0Var == null) {
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? EmptyList.a : arrayList;
    }
}
