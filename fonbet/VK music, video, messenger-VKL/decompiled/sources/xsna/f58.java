package xsna;

import com.vk.core.preference.Preference;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.attaches.AttachVideo;
import kotlin.Pair;
import kotlin.Triple;
import xsna.odn;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f58 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f58(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        boolean z = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ((h58) obj2).getClass();
                Preference.I("NavigationUtils", "synced_is_enabled", z);
                if (epx.f(Preference.v("NavigationUtils", "cached_is_enabled") ? Boolean.valueOf(Preference.d("NavigationUtils", "cached_is_enabled", false)) : null, Boolean.valueOf(z))) {
                    Preference.C("NavigationUtils", "cached_is_enabled");
                    Preference.C("NavigationUtils", "cached_source");
                }
                k720 k720Var = k720.a;
                k720.U();
                return s3q0.a;
            case 1:
                ((qsb) obj2).Y0((msx) obj, z);
                return s3q0.a;
            case 2:
                s4f s4fVar = (s4f) obj2;
                vqt vqtVar = (vqt) obj;
                if (z) {
                    s4fVar.l.e(vqtVar.a.size());
                } else {
                    s4fVar.l.e(vqtVar.a.size() + vqtVar.c);
                }
                return s3q0.a;
            case 3:
                ndn ndnVar = (ndn) obj2;
                if (z) {
                    ndnVar.T(odn.f.b);
                } else {
                    ndnVar.T(odn.c.b);
                }
                return s3q0.a;
            case 4:
                Triple triple = (Triple) obj;
                int intValue = ((Number) triple.d()).intValue();
                boolean booleanValue = ((Boolean) triple.g()).booleanValue();
                Attach b = ((rj01) obj2).b(intValue);
                if ((b instanceof AttachVideo) && ((AttachVideo) b).b.C2()) {
                    return new Pair(Boolean.valueOf(z ? booleanValue : true), b);
                }
                return null;
            default:
                nxb0 nxb0Var = (nxb0) obj2;
                nyb0 nyb0Var = nxb0Var.b;
                nyb0Var.a.getClass();
                nxb0Var.b(nyb0.a(nyb0Var, new zp2(!z, true), null, true, 2));
                return s3q0.a;
        }
    }

    public /* synthetic */ f58(boolean z, Object obj, int i) {
        this.b = i;
        this.c = z;
        this.d = obj;
    }
}
