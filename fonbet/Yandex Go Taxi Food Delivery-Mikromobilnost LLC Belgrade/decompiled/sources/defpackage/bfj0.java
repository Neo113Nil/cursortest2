package defpackage;

import java.util.HashMap;
import ru.yandex.taxi.summary.requirements.list.router.a;

/* loaded from: classes6.dex */
public final class bfj0 implements kr4 {
    public final /* synthetic */ a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;

    public bfj0(a aVar, String str, String str2, boolean z) {
        this.b = aVar;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    @Override // defpackage.kr4
    public final void a() {
        xcv0 xcv0Var = (xcv0) this.b.b.c;
        String str = this.c;
        String str2 = this.d;
        if (this.e) {
            xcv0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("requirement_id", str);
            hashMap.put("banner_id", str2);
            xcv0Var.a.a("Summary.Requirements.OnboardingFallbackShown", hashMap, 2, new HashMap());
            return;
        }
        xcv0Var.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("requirement_id", str);
        hashMap2.put("banner_id", str2);
        xcv0Var.a.a("Summary.Requirements.OnboardingShown", hashMap2, 2, new HashMap());
    }

    @Override // defpackage.kr4
    public final void c() {
        xcv0 xcv0Var = (xcv0) this.b.b.c;
        String str = this.c;
        String str2 = this.d;
        if (this.e) {
            xcv0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("requirement_id", str);
            hashMap.put("banner_id", str2);
            xcv0Var.a.a("Summary.Requirements.OnboardingFallbackTapped", hashMap, 2, new HashMap());
            return;
        }
        xcv0Var.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("requirement_id", str);
        hashMap2.put("banner_id", str2);
        xcv0Var.a.a("Summary.Requirements.OnboardingTapped", hashMap2, 2, new HashMap());
    }

    @Override // defpackage.kr4
    public final void onDetach() {
        xcv0 xcv0Var = (xcv0) this.b.b.c;
        String str = this.c;
        String str2 = this.d;
        if (this.e) {
            xcv0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("requirement_id", str);
            hashMap.put("banner_id", str2);
            xcv0Var.a.a("Summary.Requirements.OnboardingFallbackClosed", hashMap, 2, new HashMap());
            return;
        }
        xcv0Var.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("requirement_id", str);
        hashMap2.put("banner_id", str2);
        xcv0Var.a.a("Summary.Requirements.OnboardingClosed", hashMap2, 2, new HashMap());
    }
}
