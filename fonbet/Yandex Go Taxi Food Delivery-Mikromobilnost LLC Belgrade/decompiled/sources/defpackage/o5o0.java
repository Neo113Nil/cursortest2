package defpackage;

import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes13.dex */
public final class o5o0 {
    public final wnt a;
    public final cyx b;

    public o5o0(wnt wntVar, cyx cyxVar) {
        this.a = wntVar;
        this.b = cyxVar;
    }

    public static void a(kdx kdxVar, r7p0 r7p0Var) {
        kdx kdxVar2 = new kdx();
        abb1.d(kdxVar2, "number", r7p0Var.a);
        abb1.d(kdxVar2, DRMInfoProvider.MediaDRMKeys.VENDOR, r7p0Var.b.k());
        kdxVar.b("selected_vehicle", kdxVar2.a());
    }
}
