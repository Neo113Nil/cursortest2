package xsna;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.tasks.Task;
import xsna.f5o0;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class cm01 extends com.google.android.gms.common.api.b {
    public static final com.google.android.gms.common.api.a a = new com.google.android.gms.common.api.a("CastApi.API", new c901(), new a.g());

    public final Task a(String[] strArr) {
        f5o0.a a2 = f5o0.a();
        a2.a = new yo9(5, this, strArr);
        a2.d = new Feature[]{wyz0.b};
        a2.c = true;
        a2.b = false;
        a2.e = 8425;
        return doRead(a2.a());
    }
}
