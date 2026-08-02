package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class cr91 implements cv2 {
    public final /* synthetic */ o370 a;

    public cr91(o370 o370Var) {
        this.a = o370Var;
    }

    @Override // defpackage.fka1
    public final void a(String str, String str2, Bundle bundle, long j) {
        if (str == null || nc91.a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        ((lb7) this.a.a).v(bundle2);
    }
}
