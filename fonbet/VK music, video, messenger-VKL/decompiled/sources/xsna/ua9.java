package xsna;

import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.va9;

/* compiled from: CallVmojiDelegate.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class ua9 extends FunctionReferenceImpl implements izs<va9.a, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(va9.a aVar) {
        va9.a aVar2 = aVar;
        va9 va9Var = (va9) this.receiver;
        va9Var.getClass();
        try {
            if (aVar2 instanceof va9.d) {
                va9.d dVar = (va9.d) aVar2;
                va9Var.h.onNext(new va9.g(dVar.a, dVar.b));
                qaj0.c(Preference.e(((UserId) ((a6x0) va9Var.g.getValue()).a.invoke()).b, "voip_vmoji"), "VoipVmojiDelegate_vmoji_enabled", Boolean.valueOf(!r1.equals(va9.r)));
            } else if (aVar2 instanceof va9.c.a) {
                if (va9Var.p) {
                    va9Var.p = false;
                    va9Var.k.dispose();
                    va9Var.l.dispose();
                    va9.k(new xm1(va9Var, 9));
                }
            } else if ((aVar2 instanceof va9.c.b) && !va9Var.p && va9Var.a.a() != null) {
                va9Var.p = true;
                va9.k(new com.vk.movika.sdk.android.defaultplayer.interactive.a(va9Var, 9));
            }
        } catch (Throwable th) {
            L.g("Error on handle vmoji command", th);
        }
        return s3q0.a;
    }
}
