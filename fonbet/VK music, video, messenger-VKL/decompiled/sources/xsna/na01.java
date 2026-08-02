package xsna;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
/* loaded from: classes.dex */
public final class na01 implements hd01 {
    public final /* synthetic */ ru8 a;

    public na01(ru8 ru8Var) {
        this.a = ru8Var;
    }

    @Override // xsna.hd01
    public final void a(String str, String str2, Bundle bundle, long j) {
        if (str == null || x501.a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        ((j4k) this.a.a).a(3, bundle2);
    }
}
