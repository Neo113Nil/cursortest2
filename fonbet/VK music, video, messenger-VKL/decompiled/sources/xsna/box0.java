package xsna;

import xsna.nox0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class box0 implements izs {
    public final /* synthetic */ com.vk.superapp.widget_settings.p004new.b b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ box0(com.vk.superapp.widget_settings.p004new.b bVar, String str, boolean z) {
        this.b = bVar;
        this.c = str;
        this.d = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z = !this.d;
        com.vk.superapp.widget_settings.p004new.b bVar = this.b;
        bVar.r(this.c, z);
        bVar.d.onNext(nox0.a.a);
        return s3q0.a;
    }
}
