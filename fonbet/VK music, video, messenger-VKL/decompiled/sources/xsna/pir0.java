package xsna;

import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.silentauthbylogin.di.SilentAuthByLoginComponent;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.api.dto.auth.LibverifyValidationType;
import com.vk.superapp.api.dto.auth.validateaccount.VkAuthValidateAccountResponse;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.r25;

/* compiled from: ValidateAccountSuccessDelegate.kt */
/* loaded from: classes.dex */
public final class pir0 {
    public final b a;
    public final a b;
    public final ymj0 c;
    public final umj0 d;
    public final x5k0 e;
    public final yl90 f;

    /* compiled from: ValidateAccountSuccessDelegate.kt */
    public interface a {
        void a();
    }

    /* compiled from: ValidateAccountSuccessDelegate.kt */
    public interface b {
        void a(String str, VkAuthValidateAccountResponse vkAuthValidateAccountResponse, boolean z);

        void b(r25 r25Var);

        void c(String str, String str2);

        void d(String str, VkAuthValidateAccountResponse vkAuthValidateAccountResponse, List<i2q> list);

        void e(String str, VkAuthValidateAccountResponse vkAuthValidateAccountResponse);

        void f(String str, VkAuthValidateAccountResponse vkAuthValidateAccountResponse, boolean z, boolean z2);

        void g(String str, String str2);
    }

    public pir0(b bVar, a aVar, ymj0 ymj0Var, umj0 umj0Var, int i) {
        ymj0Var = (i & 4) != 0 ? SilentAuthByLoginComponent.Companion.getSTUB().a() : ymj0Var;
        umj0Var = (i & 8) != 0 ? SilentAuthByLoginComponent.Companion.getSTUB().d() : umj0Var;
        x5k0 x5k0Var = new x5k0();
        yl90 yl90Var = new yl90();
        this.a = bVar;
        this.b = aVar;
        this.c = ymj0Var;
        this.d = umj0Var;
        this.e = x5k0Var;
        this.f = yl90Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(pir0 pir0Var, String str, VkAuthValidateAccountResponse vkAuthValidateAccountResponse, List list, int i) {
        String f;
        List list2 = (i & 8) != 0 ? EmptyList.b : list;
        ymj0 ymj0Var = pir0Var.c;
        if (ymj0Var.a(vkAuthValidateAccountResponse)) {
            pir0Var.d.a();
        }
        com.vk.registration.funnels.b.a.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.INPUT_LOGIN, null, null, null, null, null, null, 254);
        if (vkAuthValidateAccountResponse.g()) {
            pir0Var.b(str, null, vkAuthValidateAccountResponse, list2);
            return;
        }
        yl90 yl90Var = pir0Var.f;
        b bVar = pir0Var.a;
        pir0Var.e.getClass();
        if (vkAuthValidateAccountResponse.d() == null || !((f = vkAuthValidateAccountResponse.f()) == null || drm0.N(f))) {
            if (ymj0Var.a(vkAuthValidateAccountResponse)) {
                bVar.d(str, vkAuthValidateAccountResponse, list2);
                return;
            }
            List<VkAuthValidateAccountResponse.ValidateAccountFlow> c = vkAuthValidateAccountResponse.c();
            yl90Var.getClass();
            if (j5g.a0(c) == VkAuthValidateAccountResponse.ValidateAccountFlow.PASSKEY) {
                bVar.a(str, vkAuthValidateAccountResponse, false);
                return;
            }
            n3z.a(vkAuthValidateAccountResponse.c());
            List<VkAuthValidateAccountResponse.ValidateAccountFlow> c2 = vkAuthValidateAccountResponse.c();
            VkAuthValidateAccountResponse.ValidateAccountFlow.Companion.getClass();
            if (epx.f(c2, VkAuthValidateAccountResponse.ValidateAccountFlow.a.a()) || epx.f(c2, VkAuthValidateAccountResponse.ValidateAccountFlow.a.d()) || epx.f(c2, VkAuthValidateAccountResponse.ValidateAccountFlow.a.b())) {
                bVar.f(str, vkAuthValidateAccountResponse, false, false);
                return;
            } else if (c2.contains(VkAuthValidateAccountResponse.ValidateAccountFlow.TRUSTED_HASH)) {
                bVar.e(str, vkAuthValidateAccountResponse);
                return;
            } else {
                pir0Var.b.a();
                return;
            }
        }
        if (x5k0.a(vkAuthValidateAccountResponse)) {
            String e = vkAuthValidateAccountResponse.e();
            if (e == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            List<VkAuthValidateAccountResponse.ValidateAccountFlow> c3 = vkAuthValidateAccountResponse.c();
            yl90Var.getClass();
            if (j5g.a0(c3) == VkAuthValidateAccountResponse.ValidateAccountFlow.PASSKEY) {
                c3 = j5g.S(c3, 1);
            }
            List<VkAuthValidateAccountResponse.ValidateAccountFlow> list3 = c3;
            VkAuthValidateAccountResponse.NextStep d = vkAuthValidateAccountResponse.d();
            VkAuthValidateAccountResponse.NextStep.VerificationMethod j = d != null ? d.j() : null;
            if (j == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            VkAuthValidateAccountResponse.NextStep d2 = vkAuthValidateAccountResponse.d();
            Boolean valueOf = d2 != null ? Boolean.valueOf(d2.g()) : null;
            if (valueOf == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            boolean booleanValue = valueOf.booleanValue();
            VkAuthValidateAccountResponse.NextStep d3 = vkAuthValidateAccountResponse.d();
            String e2 = d3 != null ? d3.e() : null;
            VkAuthValidateAccountResponse.NextStep d4 = vkAuthValidateAccountResponse.d();
            VkAuthValidateAccountResponse.NextStep.FactorsNumber f2 = d4 != null ? d4.f() : null;
            VkAuthValidateAccountResponse.NextStep d5 = vkAuthValidateAccountResponse.d();
            List<LibverifyValidationType> d6 = d5 != null ? d5.d() : null;
            VkAuthValidateAccountResponse.NextStep d7 = vkAuthValidateAccountResponse.d();
            bVar.b(new r25(str, null, e, false, list3, new r25.a(j, booleanValue, e2, f2, d6, d7 != null ? d7.i() : null)));
        }
    }

    public static void c(pir0 pir0Var, String str, VkAuthValidateAccountResponse vkAuthValidateAccountResponse) {
        pir0Var.b(str, null, vkAuthValidateAccountResponse, EmptyList.b);
    }

    public final void b(String str, String str2, VkAuthValidateAccountResponse vkAuthValidateAccountResponse, List<i2q> list) {
        String f;
        boolean a2 = this.c.a(vkAuthValidateAccountResponse);
        b bVar = this.a;
        if (a2) {
            bVar.d(str, vkAuthValidateAccountResponse, list);
            return;
        }
        this.e.getClass();
        VkAuthValidateAccountResponse.NextStep d = vkAuthValidateAccountResponse.d();
        yl90 yl90Var = this.f;
        if (d == null || !((f = vkAuthValidateAccountResponse.f()) == null || drm0.N(f))) {
            List<VkAuthValidateAccountResponse.ValidateAccountFlow> c = vkAuthValidateAccountResponse.c();
            yl90Var.getClass();
            if (j5g.a0(c) == VkAuthValidateAccountResponse.ValidateAccountFlow.PASSKEY) {
                bVar.a(str, vkAuthValidateAccountResponse, true);
                return;
            }
            n3z.a(vkAuthValidateAccountResponse.c());
            List<VkAuthValidateAccountResponse.ValidateAccountFlow> c2 = vkAuthValidateAccountResponse.c();
            VkAuthValidateAccountResponse.ValidateAccountFlow.Companion.getClass();
            if (epx.f(c2, VkAuthValidateAccountResponse.ValidateAccountFlow.a.c())) {
                bVar.c(str, vkAuthValidateAccountResponse.e());
                return;
            }
            if (epx.f(c2, VkAuthValidateAccountResponse.ValidateAccountFlow.a.a())) {
                bVar.f(str, vkAuthValidateAccountResponse, true, true);
                return;
            }
            if (epx.f(c2, VkAuthValidateAccountResponse.ValidateAccountFlow.a.d())) {
                bVar.g(str, vkAuthValidateAccountResponse.e());
                return;
            } else if (epx.f(c2, VkAuthValidateAccountResponse.ValidateAccountFlow.a.b())) {
                bVar.f(str, vkAuthValidateAccountResponse, false, true);
                return;
            } else {
                if (c2.contains(VkAuthValidateAccountResponse.ValidateAccountFlow.TRUSTED_HASH)) {
                    bVar.e(str, vkAuthValidateAccountResponse);
                    return;
                }
                return;
            }
        }
        if (x5k0.a(vkAuthValidateAccountResponse)) {
            String e = vkAuthValidateAccountResponse.e();
            if (e == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            List<VkAuthValidateAccountResponse.ValidateAccountFlow> c3 = vkAuthValidateAccountResponse.c();
            yl90Var.getClass();
            if (j5g.a0(c3) == VkAuthValidateAccountResponse.ValidateAccountFlow.PASSKEY) {
                c3 = j5g.S(c3, 1);
            }
            VkAuthValidateAccountResponse.NextStep d2 = vkAuthValidateAccountResponse.d();
            VkAuthValidateAccountResponse.NextStep.VerificationMethod j = d2 != null ? d2.j() : null;
            if (j == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            VkAuthValidateAccountResponse.NextStep d3 = vkAuthValidateAccountResponse.d();
            Boolean valueOf = d3 != null ? Boolean.valueOf(d3.g()) : null;
            if (valueOf == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            boolean booleanValue = valueOf.booleanValue();
            VkAuthValidateAccountResponse.NextStep d4 = vkAuthValidateAccountResponse.d();
            String e2 = d4 != null ? d4.e() : null;
            VkAuthValidateAccountResponse.NextStep d5 = vkAuthValidateAccountResponse.d();
            VkAuthValidateAccountResponse.NextStep.FactorsNumber f2 = d5 != null ? d5.f() : null;
            VkAuthValidateAccountResponse.NextStep d6 = vkAuthValidateAccountResponse.d();
            List<LibverifyValidationType> d7 = d6 != null ? d6.d() : null;
            VkAuthValidateAccountResponse.NextStep d8 = vkAuthValidateAccountResponse.d();
            bVar.b(new r25(str, str2, e, true, c3, new r25.a(j, booleanValue, e2, f2, d7, d8 != null ? d8.i() : null)));
        }
    }
}
