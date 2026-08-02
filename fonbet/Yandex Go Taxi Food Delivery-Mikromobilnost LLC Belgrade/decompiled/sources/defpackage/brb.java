package defpackage;

import com.yandex.go.payments.shared.family.web.nativeapi.request.ChooseContactsParams;
import com.yandex.go.payments.shared.family.web.nativeapi.response.ChooseContactsInfoResponse;
import com.yandex.go.payments.shared.family.web.nativeapi.response.Contact;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes13.dex */
public final class brb {
    public final d800 a;
    public final zuj0 b;
    public final rv70 c;
    public final z9p d;

    public brb(d800 d800Var, zuj0 zuj0Var, rv70 rv70Var, z9p z9pVar) {
        this.a = d800Var;
        this.b = zuj0Var;
        this.c = rv70Var;
        this.d = z9pVar;
    }

    public static final void a(kbp kbpVar, String str, List list) {
        List<bgq0> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (bgq0 bgq0Var : list2) {
            String str2 = bgq0Var.b;
            String str3 = bgq0Var.a;
            if (evu0.J(str3)) {
                str3 = null;
            }
            arrayList.add(new Contact(str2, str3));
        }
        ChooseContactsInfoResponse chooseContactsInfoResponse = new ChooseContactsInfoResponse(arrayList);
        hst hstVar = jst.e;
        chooseContactsInfoResponse.toString();
        hstVar.getClass();
        kbpVar.invoke(str, chooseContactsInfoResponse);
    }

    public final void b(String str, ChooseContactsParams chooseContactsParams, kbp kbpVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        String str2 = chooseContactsParams.c;
        if (str2 == null) {
            str2 = ((avj0) this.b).h(kyh0.order_for_other_choose_from_contacts);
        }
        this.a.a(new tfb0(str2, null, null, null, false, null, null, 262142), new vbb(this, ref$ObjectRef), new qu8(1, str, ref$ObjectRef, kbpVar), this.c);
        y9p y9pVar = this.d.c;
        y9pVar.a.a("FamilyAccount.Contacts.Shown", tse0.n(y9pVar), 1, new HashMap());
    }
}
