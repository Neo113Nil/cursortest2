package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl.g;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.xu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class m2 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m2(ClipsUploadFragmentImpl clipsUploadFragmentImpl, ahf ahfVar, fgf fgfVar) {
        this.b = 3;
        this.d = clipsUploadFragmentImpl;
        this.e = ahfVar;
        this.c = fgfVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = a.C0011a.a;
        Object obj4 = this.c;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                n2.a(ne7.I(1), (androidx.compose.runtime.a) obj, (List) obj6, (izs) obj5, (q630) obj4);
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((kx) obj6).l((xu.b) obj5, (q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 2:
                q630 q630Var = (q630) obj4;
                wh50 wh50Var = (wh50) obj6;
                jai jaiVar = (jai) obj5;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-291176396, intValue, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvidePlatformTextContextMenuToolbar.<anonymous> (AndroidTextContextMenuToolbarProvider.android.kt:98)");
                    }
                    Object x = aVar.x();
                    if (x == obj3) {
                        x = new bd2(0, wh50Var);
                        aVar.R(x);
                    }
                    q630 o = egi.o(q630Var, (izs) x);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, true);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, o);
                    cri.h7.getClass();
                    LayoutNode.a aVar2 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar2);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, d, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    if (er.f(0, aVar, jaiVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 3:
                ClipsUploadFragmentImpl clipsUploadFragmentImpl = (ClipsUploadFragmentImpl) obj6;
                ahf ahfVar = (ahf) obj5;
                fgf fgfVar = (fgf) obj4;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                String str = ClipsUploadFragmentImpl.a0;
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1412181729, intValue2, -1, "com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl.onCreateView.<anonymous>.<anonymous> (ClipsUploadFragmentImpl.kt:226)");
                    }
                    boolean J = aVar3.J(clipsUploadFragmentImpl);
                    Object x2 = aVar3.x();
                    if (J || x2 == obj3) {
                        x2 = new on(clipsUploadFragmentImpl, 23);
                        aVar3.R(x2);
                    }
                    int m = n34.m(aVar3);
                    ro.d(16);
                    hjf hjfVar = (hjf) gcd0.v(Integer.toString(m, 16), (izs) x2, aVar3);
                    ((zak0) clipsUploadFragmentImpl.Z).setValue(new o9(10, clipsUploadFragmentImpl, hjfVar));
                    Object x3 = aVar3.x();
                    if (x3 == obj3) {
                        x3 = new ClipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1(hjfVar, clipsUploadFragmentImpl);
                        aVar3.R(x3);
                    }
                    rrv0.d(null, null, null, null, kai.c(-1433203430, new mga(clipsUploadFragmentImpl, hjfVar, (ClipsUploadFragmentImpl$onCreateView$1$1$stateHolder$1$1) x3, ahfVar, fgfVar, 1), aVar3), aVar3, 24576, 15);
                    s3q0 s3q0Var = s3q0.a;
                    boolean J2 = aVar3.J(clipsUploadFragmentImpl) | aVar3.y(hjfVar);
                    Object x4 = aVar3.x();
                    if (J2 || x4 == obj3) {
                        x4 = clipsUploadFragmentImpl.new g(hjfVar, null);
                        aVar3.R(x4);
                    }
                    bap.g(s3q0Var, (wzs) x4, aVar3, 6);
                    mbs mbsVar = clipsUploadFragmentImpl.D;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1292940130, 0, -1, "com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl.createLifecycleListener (ClipsUploadFragmentImpl.kt:339)");
                    }
                    Object xffVar = new xff(hjfVar);
                    Object x5 = aVar3.x();
                    if (x5 == obj3) {
                        aVar3.R(xffVar);
                    } else {
                        xffVar = x5;
                    }
                    xff xffVar2 = (xff) xffVar;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    mbsVar.a(xffVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                pqh.a((wqh) obj6, (izs) obj5, (q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                m9o0.b((com.vk.messagetemplates.impl.keyboard.h) obj6, (izs) obj5, (q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ m2(Object obj, Object obj2, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = q630Var;
    }

    public /* synthetic */ m2(q630 q630Var, wh50 wh50Var, jai jaiVar) {
        this.b = 2;
        this.c = q630Var;
        this.d = wh50Var;
        this.e = jaiVar;
    }
}
