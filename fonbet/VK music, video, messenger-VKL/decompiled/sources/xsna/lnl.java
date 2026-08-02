package xsna;

import com.vk.api.generated.auth.dto.AuthMaxOptionsDto;
import com.vk.api.generated.auth.dto.AuthValidateAccountNextStepDto;
import com.vk.api.generated.auth.dto.AuthValidateAccountResponseDto;
import com.vk.superapp.api.dto.auth.LibverifyValidationType;
import com.vk.superapp.api.dto.auth.validateaccount.VkAuthValidateAccountResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DefaultSuperappApi.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class lnl extends FunctionReferenceImpl implements izs<AuthValidateAccountResponseDto, VkAuthValidateAccountResponse> {
    public static final lnl b = new lnl(1, com.vk.superapp.api.dto.auth.validateaccount.a.class, "toDomain", "toDomain(Lcom/vk/api/generated/auth/dto/AuthValidateAccountResponseDto;)Lcom/vk/superapp/api/dto/auth/validateaccount/VkAuthValidateAccountResponse;", 1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    @Override // xsna.izs
    public final VkAuthValidateAccountResponse invoke(AuthValidateAccountResponseDto authValidateAccountResponseDto) {
        List list;
        AuthValidateAccountResponseDto authValidateAccountResponseDto2;
        String str;
        VkAuthValidateAccountResponse.NextStep nextStep;
        VkAuthValidateAccountResponse.FlowName flowName;
        VkAuthValidateAccountResponse.FlowName flowName2;
        VkAuthValidateAccountResponse.NextStep.VerificationMethod verificationMethod;
        VkAuthValidateAccountResponse.NextStep.FactorsNumber factorsNumber;
        ArrayList arrayList;
        VkAuthValidateAccountResponse.NextStep.MaxOptions maxOptions;
        VkAuthValidateAccountResponse.NextStep.FactorsNumber factorsNumber2;
        VkAuthValidateAccountResponse.ValidateAccountFlow validateAccountFlow;
        AuthValidateAccountResponseDto authValidateAccountResponseDto3 = authValidateAccountResponseDto;
        Boolean n = authValidateAccountResponseDto3.n();
        boolean booleanValue = n != null ? n.booleanValue() : false;
        Boolean l = authValidateAccountResponseDto3.l();
        boolean booleanValue2 = l != null ? l.booleanValue() : false;
        List<String> f = authValidateAccountResponseDto3.f();
        if (f != null) {
            List<String> list2 = f;
            VkAuthValidateAccountResponse.ValidateAccountFlow.a aVar = VkAuthValidateAccountResponse.ValidateAccountFlow.Companion;
            list = new ArrayList(c5g.u(list2, 10));
            for (String str2 : list2) {
                aVar.getClass();
                VkAuthValidateAccountResponse.ValidateAccountFlow[] values = VkAuthValidateAccountResponse.ValidateAccountFlow.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        validateAccountFlow = null;
                        break;
                    }
                    validateAccountFlow = values[i];
                    if (str2.equals(validateAccountFlow.l())) {
                        break;
                    }
                    i++;
                }
                if (validateAccountFlow == null) {
                    throw new IllegalArgumentException("Unknown value for flow_name field");
                }
                list.add(validateAccountFlow);
            }
        } else {
            list = EmptyList.b;
        }
        String j = authValidateAccountResponseDto3.j();
        if (j == null) {
            j = "";
        }
        String g = authValidateAccountResponseDto3.g();
        if (g == null) {
            g = "";
        }
        AuthValidateAccountNextStepDto i2 = authValidateAccountResponseDto3.i();
        if (i2 != null) {
            VkAuthValidateAccountResponse.NextStep.VerificationMethod.a aVar2 = VkAuthValidateAccountResponse.NextStep.VerificationMethod.Companion;
            String j2 = i2.j();
            aVar2.getClass();
            VkAuthValidateAccountResponse.NextStep.VerificationMethod[] values2 = VkAuthValidateAccountResponse.NextStep.VerificationMethod.values();
            int length2 = values2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    verificationMethod = null;
                    break;
                }
                VkAuthValidateAccountResponse.NextStep.VerificationMethod verificationMethod2 = values2[i3];
                if (epx.f(j2, verificationMethod2.h())) {
                    verificationMethod = verificationMethod2;
                    break;
                }
                i3++;
            }
            Boolean f2 = i2.f();
            boolean booleanValue3 = f2 != null ? f2.booleanValue() : false;
            String e = i2.e();
            String str3 = e == null ? "" : e;
            AuthValidateAccountNextStepDto.ServiceCodeDto i4 = i2.i();
            if (i4 != null) {
                VkAuthValidateAccountResponse.NextStep.FactorsNumber[] values3 = VkAuthValidateAccountResponse.NextStep.FactorsNumber.values();
                int length3 = values3.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length3) {
                        authValidateAccountResponseDto2 = authValidateAccountResponseDto3;
                        str = j;
                        factorsNumber2 = null;
                        break;
                    }
                    factorsNumber2 = values3[i5];
                    authValidateAccountResponseDto2 = authValidateAccountResponseDto3;
                    str = j;
                    if (i4.i() == factorsNumber2.h()) {
                        break;
                    }
                    i5++;
                    authValidateAccountResponseDto3 = authValidateAccountResponseDto2;
                    j = str;
                }
                factorsNumber = factorsNumber2;
            } else {
                authValidateAccountResponseDto2 = authValidateAccountResponseDto3;
                str = j;
                factorsNumber = null;
            }
            LibverifyValidationType.a aVar3 = LibverifyValidationType.Companion;
            List<String> d = i2.d();
            aVar3.getClass();
            if (d != null) {
                ArrayList arrayList2 = new ArrayList();
                for (String str4 : d) {
                    LibverifyValidationType.Companion.getClass();
                    LibverifyValidationType a = LibverifyValidationType.a.a(str4);
                    if (a != null) {
                        arrayList2.add(a);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            AuthMaxOptionsDto g2 = i2.g();
            if (g2 != null) {
                Long valueOf = g2.e() != null ? Long.valueOf(r2.intValue()) : null;
                Integer d2 = g2.d();
                Boolean f3 = g2.f();
                maxOptions = new VkAuthValidateAccountResponse.NextStep.MaxOptions(valueOf, d2, f3 != null ? f3.booleanValue() : false);
            } else {
                maxOptions = null;
            }
            nextStep = new VkAuthValidateAccountResponse.NextStep(verificationMethod, booleanValue3, str3, factorsNumber, arrayList, maxOptions);
        } else {
            authValidateAccountResponseDto2 = authValidateAccountResponseDto3;
            str = j;
            nextStep = null;
        }
        AuthValidateAccountResponseDto.FlowNameDto e2 = authValidateAccountResponseDto2.e();
        if (e2 != null) {
            VkAuthValidateAccountResponse.FlowName.a aVar4 = VkAuthValidateAccountResponse.FlowName.Companion;
            String i6 = e2.i();
            aVar4.getClass();
            VkAuthValidateAccountResponse.FlowName[] values4 = VkAuthValidateAccountResponse.FlowName.values();
            int length4 = values4.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length4) {
                    flowName2 = null;
                    break;
                }
                VkAuthValidateAccountResponse.FlowName flowName3 = values4[i7];
                if (i6.equals(flowName3.h())) {
                    flowName2 = flowName3;
                    break;
                }
                i7++;
            }
            if (flowName2 == null) {
                throw new IllegalArgumentException("Unknown value for flow_name field");
            }
            flowName = flowName2;
        } else {
            flowName = null;
        }
        return new VkAuthValidateAccountResponse(booleanValue, booleanValue2, list, str, g, nextStep, flowName, authValidateAccountResponseDto2.k(), authValidateAccountResponseDto2.d());
    }
}
