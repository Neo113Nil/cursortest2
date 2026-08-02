package xsna;

import android.content.Context;
import android.content.DialogInterface;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.user.ObsceneTextFilter;
import com.vk.im.engine.models.messages.Msg;
import java.util.LinkedHashMap;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.hm3;
import xsna.q630;
import xsna.wmb;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class l6 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l6(int i, Object obj, Object obj2) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object[] objArr = 0;
        int i2 = 1;
        Object obj3 = this.c;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                m6.a((us2) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                bt0.j((String) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            case 2:
                hm3 hm3Var = (hm3) obj4;
                wh50 wh50Var = (wh50) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1947739612, intValue, -1, "com.vk.design.demo.presentation.screens.ArrowScreenContent.Content.<anonymous>.<anonymous> (ArrowScreenContent.kt:90)");
                    }
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar, 0);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630.a aVar2 = q630.a.a;
                    q630 c = qri.c(aVar, aVar2);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, a, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    hm3.a aVar4 = (hm3.a) wh50Var.getValue();
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    hm3Var.c(aVar4, new xpy(1.0f, true), aVar, 0);
                    LinkedHashMap linkedHashMap = hm3Var.b;
                    hm3.a aVar5 = (hm3.a) wh50Var.getValue();
                    boolean J = aVar.J(wh50Var);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new dm3(objArr == true ? 1 : 0, wh50Var);
                        aVar.R(x);
                    }
                    y9i0.a("Implementation", linkedHashMap, aVar5, (izs) x, txj0.f(aVar2, 1.0f), aVar, 24582, 0);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 3:
                ynb ynbVar = (ynb) obj4;
                wmb.k kVar = new wmb.k(((Msg) obj3).d, (Integer) obj, (Integer) obj2);
                ynbVar.getClass();
                xn50.a.c(ynbVar, kVar);
                return s3q0.a;
            case 4:
                gzs gzsVar = (gzs) obj4;
                kkd kkdVar = (kkd) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-68279896, intValue2, -1, "com.vk.clips.viewer.impl.feed.view.bottomsheet.redesign.ClipsBottomSheetRedesign.Content.<anonymous> (ClipsBottomSheetRedesign.kt:51)");
                    }
                    b5v0.a(gzsVar, null, null, null, kai.c(-1343207963, new at0(kkdVar, gzsVar), aVar6), null, false, false, null, aVar6, 14180352, 302);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 5:
                ((xp40) obj4).A0().c((String) obj);
                ((kea) obj3).o();
                return s3q0.a;
            case 6:
                Post post = (Post) obj3;
                iuc0 iuc0Var = iuc0.b;
                String obj5 = drm0.p0((CharSequence) obj2).toString();
                d4c0 g0 = iuc0.g0();
                ObsceneTextFilter t = hd60.a().a().t();
                UiTracker uiTracker = UiTracker.a;
                iuc0.c.b(g0.a(post, obj5, t, UiTracker.d()).m(asu0.a.d()).subscribe(new bqs(new af50(post, 15), 19), new o7y(new jt8((Context) obj4, post, obj5, i2), 11)));
                ((DialogInterface) obj).dismiss();
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                n3j0.d(ne7.I(1), (androidx.compose.runtime.a) obj, (izs) obj4, (q630) obj3);
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                ((bds0) obj4).a(ne7.I(7), (androidx.compose.runtime.a) obj, (jai) obj3);
                return s3q0.a;
        }
    }

    public /* synthetic */ l6(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = obj2;
    }
}
