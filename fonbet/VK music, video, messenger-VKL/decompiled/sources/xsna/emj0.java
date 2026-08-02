package xsna;

import android.net.Uri;
import com.vk.auth.main.AuthModel;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.superapp.core.api.models.VkGender;
import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class emj0 implements izs {
    public final /* synthetic */ SignUpDataHolder b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ AuthModel i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ String k;
    public final /* synthetic */ AuthStatSender l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ com.vk.auth.main.e n;
    public final /* synthetic */ VkAuthMetaInfo o;
    public final /* synthetic */ Uri p;

    public /* synthetic */ emj0(SignUpDataHolder signUpDataHolder, String str, String str2, String str3, String str4, boolean z, boolean z2, AuthModel authModel, boolean z3, String str5, AuthStatSender authStatSender, boolean z4, com.vk.auth.main.e eVar, VkAuthMetaInfo vkAuthMetaInfo, Uri uri) {
        this.b = signUpDataHolder;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = z2;
        this.i = authModel;
        this.j = z3;
        this.k = str5;
        this.l = authStatSender;
        this.m = z4;
        this.n = eVar;
        this.o = vkAuthMetaInfo;
        this.p = uri;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String a = cqm0.a((String) obj);
        vdx0 vdx0Var = e370.e;
        String str = null;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        wfn0 e = vdx0Var.e();
        SignUpDataHolder signUpDataHolder = this.b;
        String str2 = signUpDataHolder.i;
        String str3 = signUpDataHolder.j;
        String str4 = signUpDataHolder.k;
        VkGender vkGender = signUpDataHolder.l;
        String str5 = this.d;
        boolean z = this.g;
        if (str5 != null && !z) {
            str = str5;
        }
        boolean z2 = z && !this.h;
        AuthModel authModel = this.i;
        authModel.getClass();
        String str6 = signUpDataHolder.d;
        String str7 = this.c;
        String str8 = this.e;
        String str9 = this.f;
        boolean z3 = this.j;
        io.reactivex.rxjava3.internal.operators.observable.m1 d = e.d(str2, str3, str4, vkGender, str7, str, str8, str9, z2, null, str6, z3, this.k, a);
        AuthStatSender authStatSender = this.l;
        wmz wmzVar = new wmz(new ubj0(authStatSender, 1), 21);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return d.E(wmzVar, lVar, kVar, kVar).F(new kjs(new hwi0(authStatSender, 3), 20)).L(new p5w(new gmj0(str5, signUpDataHolder, z, str8, this.m, z3, str9, a, this.n, this.o), 18), false).a0(io.reactivex.rxjava3.schedulers.a.b()).E(new pdw(new hmj0(0, this.p, authModel), 24), lVar, kVar, kVar).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }
}
