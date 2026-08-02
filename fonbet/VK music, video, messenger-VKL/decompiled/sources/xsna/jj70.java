package xsna;

/* compiled from: NotificationsGetSettingsApi.kt */
/* loaded from: classes15.dex */
public final class jj70 {
    public final String a;
    public final pj70 b = new pj70();
    public final ek70 c = new ek70();

    public jj70(String str) {
        this.a = str;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.m1 a(String str, String str2) {
        tfx tfxVar = new tfx("notifications.getSettings", new sf3(20), new s11(20));
        String str3 = this.a;
        if (str3 != null) {
            tfx.o(tfxVar, "device_id", str3, 0, 0, 12);
        }
        com.vk.api.request.rx.batch.f fVar = new com.vk.api.request.rx.batch.f(yfb.z(tfxVar, new hv7(this.c, 5)), yfb.y(new tfx("wall.getSubscriptions", new zyk0(5), new azk0(6)), new f1s(14)), yfb.y(new tfx("notifications.getIgnoredSources", new u11(27), new v11(20)), new ou1(this.b, 6)), new sci(7));
        if (str != null) {
            fVar.B(str, str2);
        }
        ahn.D(fVar);
        return rsg0.T(fVar);
    }
}
