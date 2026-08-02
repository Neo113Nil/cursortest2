package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.video.impl.upload.video.bottomsheet.UploadingVideoBottomSheetState;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.dmt;
import xsna.ici0;
import xsna.k6;
import xsna.k8s;
import xsna.obi0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class d6 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0237  */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        obi0.a aVar;
        cai0 c;
        obi0.a aVar2;
        cai0 c2;
        switch (this.b) {
            case 0:
                k6.a aVar3 = (k6.a) this.c;
                k6 k6Var = (k6) this.d;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar4.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-391338179, intValue, -1, "com.vk.video.ui.discovery.minimizable.description.AboutVideoDescriptionDelegate.ViewHolder.<anonymous> (AboutVideoDescriptionDelegate.kt:66)");
                    }
                    rrv0.e(true, null, null, null, null, null, kai.c(-1757006982, new f6(0, aVar3, k6Var), aVar4), aVar4, 1572870, 62);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 1:
                ((by8) this.c).c((cy8) this.d, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                ((t5c) this.c).a((k8s.a) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 3:
                List list = (List) this.c;
                izs izsVar = (izs) this.d;
                ((Integer) obj2).getClass();
                com.vk.profile.community.impl.ui.trust_mark.e.a(ne7.I(1), (androidx.compose.runtime.a) obj, list, izsVar);
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                ((hr80) this.c).g((znj) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 5:
                izs izsVar2 = (izs) this.c;
                mtk0 mtk0Var = (mtk0) this.d;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-856028922, intValue2, -1, "com.vk.games.presentation.catalog.screen.RenderGameCatalogContentLego.<anonymous> (GamesCatalogMainTabScreen.kt:211)");
                    }
                    if (((Boolean) mtk0Var.getValue()).booleanValue()) {
                        aVar5.K(1558236677);
                        boolean J = aVar5.J(izsVar2);
                        Object x = aVar5.x();
                        if (J || x == a.C0011a.a) {
                            x = new iz7(izsVar2, 3);
                            aVar5.R(x);
                        }
                        khq.a(0, aVar5, (gzs) x, null);
                    } else {
                        aVar5.K(1549977564);
                    }
                    aVar5.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 6:
                e64 e64Var = (e64) this.c;
                e64 e64Var2 = (e64) this.d;
                em50 em50Var = (em50) obj;
                dmt dmtVar = (dmt) obj2;
                if (dmtVar instanceof cmt) {
                    return em50Var.a(e64Var, dmtVar);
                }
                if (dmtVar instanceof dmt.a) {
                    return em50Var.a(e64Var2, dmtVar);
                }
                throw new NoWhenBranchMatchedException();
            case 7:
                ((Integer) obj2).getClass();
                ((xu70) this.c).d((ev70) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                ((w8d0) this.c).b0((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 9:
                jai jaiVar = (jai) this.c;
                bei0 bei0Var = (bei0) this.d;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(610483127, intValue3, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous>.<anonymous> (SelectionContainer.kt:138)");
                    }
                    jaiVar.invoke(aVar6, 0);
                    if (bei0Var.g() && ((Boolean) ((zak0) bei0Var.j).getValue()).booleanValue()) {
                        obi0 f = bei0Var.f();
                        if (!(f != null ? epx.f(f.a, f.b) : true)) {
                            aVar6.K(-1736224054);
                            obi0 f2 = bei0Var.f();
                            if (f2 == null) {
                                aVar6.K(2011629175);
                                aVar6.j();
                            } else {
                                aVar6.K(2011629176);
                                aVar6.K(-1736222526);
                                List l = e43.l(Boolean.TRUE, Boolean.FALSE);
                                int size = l.size();
                                for (int i = 0; i < size; i++) {
                                    boolean booleanValue = ((Boolean) l.get(i)).booleanValue();
                                    boolean l2 = aVar6.l(booleanValue);
                                    Object x2 = aVar6.x();
                                    a.C0011a.C0012a c0012a = a.C0011a.a;
                                    if (l2 || x2 == c0012a) {
                                        x2 = new xdi0(booleanValue, bei0Var);
                                        aVar6.R(x2);
                                    }
                                    zdo0 zdo0Var = (zdo0) x2;
                                    boolean l3 = aVar6.l(booleanValue);
                                    Object x3 = aVar6.x();
                                    if (l3 || x3 == c0012a) {
                                        x3 = booleanValue ? new fm20(bei0Var, 25) : new nid0(bei0Var, 4);
                                        aVar6.R(x3);
                                    }
                                    gzs gzsVar = (gzs) x3;
                                    ResolvedTextDirection resolvedTextDirection = booleanValue ? f2.a.a : f2.b.a;
                                    float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    if (booleanValue) {
                                        obi0 f4 = bei0Var.f();
                                        if (f4 != null && (c2 = bei0Var.c((aVar2 = f4.a))) != null) {
                                            f3 = c2.i(aVar2.b);
                                        }
                                    } else {
                                        obi0 f5 = bei0Var.f();
                                        if (f5 != null && (c = bei0Var.c((aVar = f5.b))) != null) {
                                            f3 = c.i(aVar.b);
                                        }
                                    }
                                    float f6 = f3;
                                    ResolvedTextDirection resolvedTextDirection2 = resolvedTextDirection;
                                    ici0.a aVar7 = new ici0.a(gzsVar);
                                    boolean z = f2.c;
                                    boolean y = aVar6.y(zdo0Var);
                                    Object x4 = aVar6.x();
                                    if (y || x4 == c0012a) {
                                        x4 = new hci0(zdo0Var);
                                        aVar6.R(x4);
                                    }
                                    nc2.b(aVar7, booleanValue, resolvedTextDirection2, z, 0L, f6, skn0.b(q630.a.a, zdo0Var, (PointerInputEventHandler) x4), aVar6, 0);
                                }
                                aVar6.j();
                                aVar6.j();
                            }
                            aVar6.j();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        }
                    }
                    aVar6.K(2013602667);
                    aVar6.j();
                    if (androidx.compose.runtime.b.d()) {
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 10:
                ((Integer) obj2).getClass();
                ((w1o0) this.c).b((dk3) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 11:
                lg90 lg90Var = (lg90) this.c;
                v9p0 v9p0Var = (v9p0) this.d;
                androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar8.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(555767694, intValue4, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.background.TopshelfBackgroundLayer.<anonymous>.<anonymous>.<anonymous> (TopshelfCardBackground.kt:135)");
                    }
                    eap0.b(lg90Var, v9p0Var.b, v9p0Var.a, null, aVar8, 8, 8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar8.h();
                }
                return s3q0.a;
            case 12:
                ((Integer) obj2).getClass();
                feq0.a((UploadingVideoBottomSheetState) this.c, (gzs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                jai jaiVar2 = (jai) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar9.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1996122584, intValue5, -1, "com.vk.core.compose.component.VkSegmentedControl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VkSegmentedControl.kt:155)");
                    }
                    jaiVar2.invoke(new qow(arrayList), aVar9, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar9.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ d6(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
