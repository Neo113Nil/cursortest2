package xsna;

import android.content.Context;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.a;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.reactions.BadgeMeta;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.reactions.ReactionSet;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import xsna.c8d;
import xsna.gnd;
import xsna.k8s;
import xsna.q630;
import xsna.rfr;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class x7d implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x7d(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                b8d.d((c8d.b) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                gnd.a aVar = (gnd.a) this.c;
                izs izsVar = (izs) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1715607227, intValue, -1, "com.vk.clips.coauthors.selector.ui.ClipsCoauthorsSelectorContentView.ThemedContent.<anonymous>.<anonymous> (ClipsCoauthorsSelectorContentView.kt:51)");
                    }
                    q630 t = n34.t(q630.a.a, dz5.I(6, 0, aVar2, true), null);
                    Object x = aVar2.x();
                    if (x == a.C0011a.a) {
                        x = new sm0(6);
                        aVar2.R(x);
                    }
                    r7p0.b(aVar, izsVar, ahh0.b(t, m4s.C((izs) x, aVar2, 6), Orientation.Vertical), aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 2:
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((kuh) this.c).e((mtk0) this.d, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((rfr.a) this.c).a((k8s.a) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 5:
                ytf0 ytf0Var = (ytf0) this.c;
                y2k0 y2k0Var = (y2k0) this.d;
                int intValue2 = ((Integer) obj).intValue();
                if (obj2 instanceof ypi) {
                    ytf0Var.f.b((ypi) obj2);
                } else if (!(obj2 instanceof rfg0)) {
                    if (obj2 instanceof iuf0) {
                        xo9.w(y2k0Var, intValue2, obj2);
                        ytf0Var.e((iuf0) obj2);
                    } else if (obj2 instanceof androidx.compose.runtime.f) {
                        xo9.w(y2k0Var, intValue2, obj2);
                        ((androidx.compose.runtime.f) obj2).d();
                    }
                }
                break;
            case 6:
                d8d0 d8d0Var = (d8d0) this.c;
                qa10 qa10Var = (qa10) this.d;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1339709233, intValue3, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsContentImpl.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrimaryBlockGoodsContentImpl.kt:88)");
                    }
                    d8d0Var.q(qa10Var, 0, aVar3, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 7:
                ReactionSet reactionSet = (ReactionSet) this.c;
                x6f0 x6f0Var = (x6f0) this.d;
                Context context = (Context) obj;
                f2f0 f2f0Var = (f2f0) obj2;
                Iterator<T> it = reactionSet.c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj3 = it.next();
                        if (((ReactionMeta) obj3).getId() == f2f0Var.a()) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                ReactionMeta reactionMeta = (ReactionMeta) obj3;
                if (reactionMeta != null) {
                    b2f0 b2f0Var = x6f0Var.c;
                    if (reactionMeta instanceof BadgeMeta) {
                        u5f0 u5f0Var = b2f0Var.c;
                        Object obj4 = u5f0Var != null ? u5f0Var.a : null;
                        Badgeable badgeable = obj4 instanceof Badgeable ? (Badgeable) obj4 : null;
                        if (badgeable != null) {
                            b2f0Var.b.d(context, badgeable);
                        }
                    }
                    u5f0 u5f0Var2 = b2f0Var.c;
                    if (u5f0Var2 != null) {
                        WeakReference<p2f0> weakReference = b2f0Var.a.j;
                        p2f0 p2f0Var = weakReference != null ? weakReference.get() : null;
                        if (p2f0Var != null) {
                            b2f0Var.a(context, p2f0Var, reactionMeta, u5f0Var2, true);
                        }
                    }
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((v0j0) this.c).g((znj) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ x7d(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
