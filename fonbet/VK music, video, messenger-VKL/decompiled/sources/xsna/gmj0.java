package xsna;

import com.ironsource.O6;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.signupagreement.SignUpAgreementInfo;
import com.vk.core.serialize.Serializer;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.api.states.VkAuthState;
import com.vk.superapp.core.api.models.SignUpField;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class gmj0 implements izs {
    public final /* synthetic */ String b;
    public final /* synthetic */ SignUpDataHolder c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ com.vk.auth.main.e j;
    public final /* synthetic */ VkAuthMetaInfo k;

    public /* synthetic */ gmj0(String str, SignUpDataHolder signUpDataHolder, boolean z, String str2, boolean z2, boolean z3, String str3, String str4, com.vk.auth.main.e eVar, VkAuthMetaInfo vkAuthMetaInfo) {
        this.b = str;
        this.c = signUpDataHolder;
        this.d = z;
        this.e = str2;
        this.f = z2;
        this.g = z3;
        this.h = str3;
        this.i = str4;
        this.j = eVar;
        this.k = vkAuthMetaInfo;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VkAuthState b;
        SignUpAgreementInfo signUpAgreementInfo;
        String str = ((ucu0) obj).c;
        String str2 = this.b;
        SignUpDataHolder signUpDataHolder = this.c;
        if (str2 == null) {
            str2 = signUpDataHolder.e;
        }
        boolean z = this.d;
        String str3 = this.e;
        if (!z || str == null) {
            boolean z2 = this.g;
            String str4 = this.h;
            if (z2 && str4 == null) {
                Serializer.c<VkAuthState> cVar = VkAuthState.CREATOR;
                b = VkAuthState.a.c(str3, str2, true, false);
            } else {
                Serializer.c<VkAuthState> cVar2 = VkAuthState.CREATOR;
                if (str4 == null) {
                    str4 = "";
                }
                b = VkAuthState.a.b(str2, str4, str3, true);
            }
        } else {
            b = new VkAuthState(null);
            b.d.put("grant_type", "extend_sid");
            b.d.put(O6.e1, str3);
            b.d.put("hash", str);
            if (this.f) {
                b.d.put("additional_sign_up_agreement_showed", "1");
            }
        }
        Iterator it = signUpDataHolder.s.iterator();
        while (it.hasNext()) {
            b.zb("skip_optional_fields", ((SignUpField) it.next()).i());
        }
        String str5 = this.i;
        if (str5 != null) {
            b.d.put("validate_session", str5);
        }
        if (signUpDataHolder.v && (signUpAgreementInfo = signUpDataHolder.E) != null && !signUpAgreementInfo.c) {
            com.vk.registration.funnels.b.a.getClass();
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.REGISTRATION_ADD, null, null, null, null, null, null, 254);
        }
        return l55.c(l55.a, this.j.a, b, this.k, 4);
    }
}
