package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.PersonalUserData;

/* loaded from: classes15.dex */
public final class n0m0 extends xx4 {
    public final PersonalUserData w;

    public n0m0(PersonalUserData personalUserData) {
        this.w = personalUserData;
    }

    @Override // defpackage.xx4
    public final void j(cl21 cl21Var) {
        dt20 d = ((d9g) cl21Var).d();
        PersonalUserData personalUserData = this.w;
        z83.g(null, (Looper) d.b, Looper.myLooper());
        l020 C = ((k020) d.x).C();
        try {
            C.q0(personalUserData);
            C.s();
            C.close();
            h();
        } catch (Throwable th) {
            if (C != null) {
                try {
                    C.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
