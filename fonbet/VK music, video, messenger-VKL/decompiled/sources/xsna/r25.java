package xsna;

import com.vk.superapp.api.dto.auth.LibverifyValidationType;
import com.vk.superapp.api.dto.auth.validateaccount.VkAuthValidateAccountResponse;
import java.util.List;

/* compiled from: AuthBySmartflowData.kt */
/* loaded from: classes15.dex */
public final class r25 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final List<VkAuthValidateAccountResponse.ValidateAccountFlow> e;
    public final a f;

    /* compiled from: AuthBySmartflowData.kt */
    public static final class a {
        public final VkAuthValidateAccountResponse.NextStep.VerificationMethod a;
        public final boolean b;
        public final String c;
        public final VkAuthValidateAccountResponse.NextStep.FactorsNumber d;
        public final List<LibverifyValidationType> e;
        public final VkAuthValidateAccountResponse.NextStep.MaxOptions f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(VkAuthValidateAccountResponse.NextStep.VerificationMethod verificationMethod, boolean z, String str, VkAuthValidateAccountResponse.NextStep.FactorsNumber factorsNumber, List<? extends LibverifyValidationType> list, VkAuthValidateAccountResponse.NextStep.MaxOptions maxOptions) {
            this.a = verificationMethod;
            this.b = z;
            this.c = str;
            this.d = factorsNumber;
            this.e = list;
            this.f = maxOptions;
        }

        public final String a() {
            return this.c;
        }

        public final VkAuthValidateAccountResponse.NextStep.FactorsNumber b() {
            return this.d;
        }

        public final boolean c() {
            return this.b;
        }

        public final List<LibverifyValidationType> d() {
            return this.e;
        }

        public final VkAuthValidateAccountResponse.NextStep.MaxOptions e() {
            return this.f;
        }

        public final VkAuthValidateAccountResponse.NextStep.VerificationMethod f() {
            return this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r25(String str, String str2, String str3, boolean z, List<? extends VkAuthValidateAccountResponse.ValidateAccountFlow> list, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = list;
        this.f = aVar;
    }

    public final List<VkAuthValidateAccountResponse.ValidateAccountFlow> a() {
        return this.e;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final a d() {
        return this.f;
    }

    public final String e() {
        return this.c;
    }

    public final boolean f() {
        return this.d;
    }
}
