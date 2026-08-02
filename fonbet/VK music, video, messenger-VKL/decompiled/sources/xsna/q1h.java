package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPlaceDto;
import com.vk.profile.community.impl.ui.trust_mark.CommunityTrustMarksArgs;
import com.vkontakte.android.R;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.r1h;
import xsna.us2;
import xsna.vho0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class q1h implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ q1h(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        qio qioVar;
        int i = this.b;
        int i2 = this.c;
        Object obj3 = this.e;
        Object obj4 = this.f;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                ((r1h.a) obj5).a((String) obj3, (yzs) obj4, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                return s3q0.a;
            case 1:
                ((Integer) obj2).intValue();
                com.vk.profile.community.impl.ui.trust_mark.e.b((List) obj5, (CommunityTrustMarksArgs.AdminButtons) obj3, (izs) obj4, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                return s3q0.a;
            case 2:
                ((Integer) obj2).intValue();
                ((zzr) obj5).a((spg0) obj3, (q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                return s3q0.a;
            case 3:
                ((Integer) obj2).intValue();
                ((com.vk.core.compose.component.cell.content.i0) obj5).a((spg0) obj3, (q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                return s3q0.a;
            case 4:
                ((Integer) obj2).intValue();
                ((u050) obj5).a((q630) obj3, (dt1.b) obj4, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                return s3q0.a;
            case 5:
                ((Integer) obj2).intValue();
                vqa0.a((PostingPlaceDto) obj5, (List) obj3, (izs) obj4, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                return s3q0.a;
            default:
                gzs gzsVar = (gzs) obj5;
                gzs gzsVar2 = (gzs) obj4;
                String str = (String) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1546777338, intValue, -1, "com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.ExpandButton.<anonymous> (SearchPlaylistCard.kt:431)");
                    }
                    float f = kqu0.v;
                    float f2 = kqu0.t;
                    q630.a aVar2 = q630.a.a;
                    q630 E = s200.E(aVar2, f, f2);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g, dt1.a.l, aVar, 54);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, E);
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
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    boolean J = aVar.J(ylu0Var);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x == c0012a) {
                        x = new voo(ylu0Var.getText().r, new wp40(gzsVar2, 20));
                        aVar.R(x);
                    }
                    voo vooVar = (voo) x;
                    boolean J2 = aVar.J(wuv0Var);
                    Object x2 = aVar.x();
                    if (J2 || x2 == c0012a) {
                        x2 = wuv0Var.l0.a.a;
                        aVar.R(x2);
                    }
                    hik0 hik0Var = (hik0) x2;
                    boolean J3 = aVar.J(wuv0Var);
                    Object x3 = aVar.x();
                    if (J3 || x3 == c0012a) {
                        hik0 hik0Var2 = wuv0Var.i0.a.a;
                        float a2 = hik0Var2.a.a();
                        long j = hik0Var2.b;
                        b6s b6sVar = hik0Var2.c;
                        u5s u5sVar = hik0Var2.d;
                        v5s v5sVar = hik0Var2.e;
                        v4s v4sVar = hik0Var2.f;
                        String str2 = hik0Var2.g;
                        long j2 = hik0Var2.h;
                        et6 et6Var = hik0Var2.i;
                        zho0 zho0Var = hik0Var2.j;
                        lwz lwzVar = hik0Var2.k;
                        long j3 = hik0Var2.l;
                        pdo0 pdo0Var = hik0Var2.m;
                        v4j0 v4j0Var = hik0Var2.n;
                        hua0 hua0Var = hik0Var2.o;
                        qio qioVar2 = hik0Var2.p;
                        vho0 vho0Var = vho0.a.a;
                        if (vooVar == null) {
                            qioVar = qioVar2;
                        } else {
                            qioVar = qioVar2;
                            vho0Var = new dl8(vooVar, a2);
                        }
                        x3 = new hik0(vho0Var, j, b6sVar, u5sVar, v5sVar, v4sVar, str2, j2, et6Var, zho0Var, lwzVar, j3, pdo0Var, v4j0Var, hua0Var, qioVar);
                        aVar.R(x3);
                    }
                    hik0 hik0Var3 = (hik0) x3;
                    Context context = (Context) aVar.r(AndroidCompositionLocals_androidKt.b);
                    us2.b bVar = new us2.b();
                    int m = bVar.m(hik0Var);
                    try {
                        bVar.g(context.getResources().getQuantityString(R.plurals.catalog_album_video_total, i2, Integer.valueOf(i2)));
                        s3q0 s3q0Var = s3q0.a;
                        bVar.k(m);
                        if (str != null) {
                            m = bVar.m(hik0Var3);
                            try {
                                bVar.g(" · ".concat(str));
                            } finally {
                            }
                        }
                        us2 n = bVar.n();
                        if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            szw.a("invalid weight; must be greater than zero");
                        }
                        yqv0.d(n, new xpy(1.0f, true), 0L, 0, null, 2, false, 1, null, null, null, aVar, 100663296, 6, 15100);
                        f9t.e(txj0.v(aVar2, kqu0.r), aVar, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-507862468, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Dropdown16> (VkSdkIcons.kt:744)");
                        }
                        lg90 a3 = pg90.a(R.drawable.vk_icon_dropdown_16, 0, aVar);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        boolean J4 = aVar.J(gzsVar);
                        Object x4 = aVar.x();
                        if (J4 || x4 == c0012a) {
                            x4 = new dix(2, gzsVar);
                            aVar.R(x4);
                        }
                        pzu0.b(a3, null, rdu.a(aVar2, (izs) x4), 0L, aVar, 56, 8);
                        aVar.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } finally {
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ q1h(gzs gzsVar, gzs gzsVar2, String str, int i) {
        this.b = 6;
        this.d = gzsVar;
        this.f = gzsVar2;
        this.e = str;
        this.c = i;
    }
}
