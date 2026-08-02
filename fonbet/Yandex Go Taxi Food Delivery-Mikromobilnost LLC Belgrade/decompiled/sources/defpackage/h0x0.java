package defpackage;

import android.os.SystemClock;
import com.yandex.messaging.contacts.sync.b;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes15.dex */
public final /* synthetic */ class h0x0 implements sls {
    public final /* synthetic */ b a;
    public final /* synthetic */ Long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long w;
    public final /* synthetic */ boolean x;

    public /* synthetic */ h0x0(b bVar, Long l, long j, long j2, boolean z) {
        this.a = bVar;
        this.b = l;
        this.c = j;
        this.w = j2;
        this.x = z;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Long l = this.b;
        long j = this.c;
        long longValue = elapsedRealtime - (l != null ? l.longValue() : j);
        long j2 = elapsedRealtime - j;
        b bVar = this.a;
        long f = bVar.b.f();
        Long valueOf = l != null ? Long.valueOf(j - l.longValue()) : null;
        x22 x22Var = bVar.E;
        MapBuilder y = qv10.y("uuid", bVar.w);
        y.put("old_version", Long.valueOf(this.w));
        y.put("new_version", Long.valueOf(f));
        y.put("duration", Long.valueOf(j2));
        y.put("after_upload", Boolean.valueOf(this.x));
        y.put("full_time", Long.valueOf(longValue));
        y.put("download_time", Long.valueOf(j2));
        if (valueOf != null) {
            y.put("upload_time", Long.valueOf(valueOf.longValue()));
        }
        aqb1.d(x22Var, "sync_download_success", y.j());
        return zy11.a;
    }
}
