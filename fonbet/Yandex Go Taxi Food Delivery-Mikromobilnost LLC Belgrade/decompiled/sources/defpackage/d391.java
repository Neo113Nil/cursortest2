package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes7.dex */
public final class d391 implements j271 {
    public final Handler a = new Handler(Looper.getMainLooper());
    public nr41 b;

    @Override // defpackage.j271
    public final void b() {
        this.a.post(new c391(this, 2));
    }
}
