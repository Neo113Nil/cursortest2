package xsna;

import androidx.compose.runtime.a;
import com.vk.dto.user.UserProfile;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vk.profile.user.impl.ui.edit.cover.crop.CoverCropActivity;
import com.vk.sharing.api.dto.ActionsInfo;
import com.vk.sharing.api.dto.AttachmentInfo;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class y1k implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ y1k(UserProfile userProfile, com.vk.sharing.core.a aVar, com.vk.sharing.core.view.f fVar, AttachmentInfo attachmentInfo) {
        this.b = 3;
        this.c = userProfile;
        this.d = aVar;
        this.e = fVar;
        this.f = attachmentInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                njw njwVar = (njw) obj6;
                wh50 wh50Var = (wh50) obj5;
                lyd0 lyd0Var = (lyd0) obj3;
                wh50 wh50Var2 = (wh50) obj4;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = CoverCropActivity.w;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1547893686, intValue, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.CoverCropActivity.Content.<anonymous>.<anonymous> (CoverCropActivity.kt:159)");
                    }
                    if (((agw) njwVar.b) == null || ((mxj0) njwVar.a) == null) {
                        aVar.K(-1769659284);
                    } else {
                        aVar.K(-1762982132);
                        q630 D = s200.D(f9t.G(txj0.f(q630.a.a, 1.0f)), 16);
                        boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (booleanValue) {
                            aVar.K(-1762775734);
                            Object x = aVar.x();
                            if (x == c0012a) {
                                x = new a2k(0, wh50Var2);
                                aVar.R(x);
                            }
                            gzs gzsVar = (gzs) x;
                            boolean J = aVar.J(wh50Var);
                            Object x2 = aVar.x();
                            if (J || x2 == c0012a) {
                                x2 = new b2k(0, wh50Var);
                                aVar.R(x2);
                            }
                            j2k.e(6, aVar, gzsVar, (gzs) x2, D);
                            aVar.j();
                        } else {
                            aVar.K(-1762509072);
                            Object x3 = aVar.x();
                            if (x3 == c0012a) {
                                x3 = new s1k(0, wh50Var2);
                                aVar.R(x3);
                            }
                            gzs gzsVar2 = (gzs) x3;
                            boolean J2 = aVar.J(wh50Var) | aVar.y(lyd0Var);
                            Object x4 = aVar.x();
                            if (J2 || x4 == c0012a) {
                                x4 = new gd0(8, lyd0Var, wh50Var);
                                aVar.R(x4);
                            }
                            j2k.d(6, aVar, gzsVar2, (gzs) x4, D);
                            aVar.j();
                        }
                    }
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((njl) obj6).c((String) obj5, (String) obj4, (AuthorHeaderConfig.Header.Main.Name.Default.Verification) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                fe00.d(ne7.I(1), (androidx.compose.runtime.a) obj, (String) obj6, (gzs) obj4, (izs) obj5, (q630) obj3);
                break;
            default:
                com.vk.sharing.core.view.l lVar = (com.vk.sharing.core.view.l) obj4;
                AttachmentInfo attachmentInfo = (AttachmentInfo) obj3;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                ((UserProfile) obj6).k = booleanValue2;
                ActionsInfo d3 = ((com.vk.sharing.core.a) obj5).f.d3();
                d3.h = booleanValue2;
                lVar.ae(d3, attachmentInfo != null ? attachmentInfo.b : 0);
                lVar.setToggleFaveActionIsEnabled(true);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ y1k(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ y1k(njw njwVar, wh50 wh50Var, lyd0 lyd0Var, wh50 wh50Var2) {
        this.b = 0;
        this.c = njwVar;
        this.d = wh50Var;
        this.f = lyd0Var;
        this.e = wh50Var2;
    }
}
