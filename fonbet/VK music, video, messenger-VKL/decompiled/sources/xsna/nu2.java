package xsna;

import android.content.Context;
import com.vk.core.preference.Preference;
import com.vk.log.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class nu2 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nu2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Preference.h((Context) this.c, 0, (String) obj);
            case 1:
                izs izsVar = (izs) this.c;
                String str = (String) obj;
                return myc0.f(str) ? (io.reactivex.rxjava3.core.q) izsVar.invoke(str) : (io.reactivex.rxjava3.core.q) izsVar.invoke(null);
            case 2:
                L.j((Throwable) obj, (String) this.c);
                return s3q0.a;
            default:
                return new tbq0((b2a) obj, (dot0) this.c);
        }
    }
}
