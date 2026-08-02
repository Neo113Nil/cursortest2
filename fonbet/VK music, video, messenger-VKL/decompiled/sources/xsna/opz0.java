package xsna;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.Task;
import xsna.f5o0;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class opz0 extends com.google.android.gms.common.api.b {
    public static final com.google.android.gms.common.api.a a = new com.google.android.gms.common.api.a("ClientNotification.API", new hpz0(), new a.g());

    public opz0(Context context) {
        super(context, (com.google.android.gms.common.api.a<a.d.c>) a, a.d.U6, b.a.c);
    }

    public final Task a(com.google.android.gms.common.internal.zab zabVar) {
        f5o0.a a2 = f5o0.a();
        a2.d = new Feature[]{com.google.android.gms.internal.base.zad.zab};
        a2.c = true;
        a2.b = false;
        a2.a = new com.vk.comments.impl.a(zabVar);
        return doBestEffortWrite(a2.a());
    }
}
