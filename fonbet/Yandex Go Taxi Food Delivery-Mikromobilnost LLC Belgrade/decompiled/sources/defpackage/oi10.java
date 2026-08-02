package defpackage;

import com.yandex.fintechsdk.core.analytics.impl.internal.a;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes12.dex */
public final class oi10 implements ni10 {
    public final z22 a;

    public oi10(z22 z22Var) {
        this.a = z22Var;
    }

    public final void a(int i, String str, vi10 vi10Var) {
        long j = vi10Var.a;
        long j2 = vi10Var.c;
        MapBuilder y = qv10.y("scenario", str);
        y.put("level", String.valueOf(i));
        y.put("available_memory_mb", String.valueOf(j));
        y.put("used_memory_mb", String.valueOf(j2));
        ((a) this.a).a(new fyt0("stability_memory_warning", y.j()));
    }
}
