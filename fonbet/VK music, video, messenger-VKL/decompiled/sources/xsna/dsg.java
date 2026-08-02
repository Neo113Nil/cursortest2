package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.music.MusicOwner;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicOwner;
import com.vk.catalog2.feature.music.holders.ComposeMusicOwnerVh;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.ecomm.verifiedseller.impl.screens.obtainverification.model.ObtainVerificationScreenContent;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.e9l0;
import xsna.q630;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class dsg implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dsg(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        a.C0011a.C0012a c0012a;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        com.vk.core.compose.component.cell.content.h1 h1Var2;
        com.vk.core.compose.component.cell.content.h1 b;
        CharSequence a;
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                esg.a((String) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                UIBlockMusicOwner uIBlockMusicOwner = (UIBlockMusicOwner) this.c;
                ComposeMusicOwnerVh composeMusicOwnerVh = (ComposeMusicOwnerVh) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(9458963, intValue, -1, "com.vk.catalog2.feature.music.holders.ComposeMusicOwnerVh.bindData.<anonymous>.<anonymous> (ComposeMusicOwnerVh.kt:81)");
                    }
                    q630 j = txj0.j(84, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630.a.a, 1.0f));
                    float d = r490.d(R.dimen.music_owner_image, aVar);
                    k7a k7aVar = composeMusicOwnerVh.c;
                    boolean y = aVar.y(composeMusicOwnerVh);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a2 = a.C0011a.a;
                    if (y || x == c0012a2) {
                        c0012a = c0012a2;
                        ComposeMusicOwnerVh.a aVar2 = new ComposeMusicOwnerVh.a(0, composeMusicOwnerVh, ComposeMusicOwnerVh.class, "handleOwnerClick", "handleOwnerClick()V", 0);
                        aVar.R(aVar2);
                        x = aVar2;
                    } else {
                        c0012a = c0012a2;
                    }
                    com.vk.core.compose.component.cell.content.i0 a2 = Cell$Left.a.a(new hr40(uIBlockMusicOwner, d, k7aVar, (gzs) ((fcy) x)), null, aVar, 2);
                    MusicOwner musicOwner = uIBlockMusicOwner.y;
                    androidx.compose.runtime.a aVar3 = aVar;
                    com.vk.core.compose.component.cell.content.h1 a3 = Cell$Middle.d.b.a(musicOwner.c, null, null, 1, null, null, aVar3, 12610560, 102);
                    String str = musicOwner.d;
                    if (str.length() <= 0) {
                        str = null;
                    }
                    if (str == null) {
                        aVar3.K(-1674897527);
                        aVar3.j();
                        h1Var = null;
                    } else {
                        aVar3.K(-1674897526);
                        com.vk.core.compose.component.cell.content.h1 b2 = Cell$Middle.c.b.b(str, 1, null, null, null, aVar3, 12583344, 120);
                        aVar3 = aVar3;
                        aVar3.j();
                        h1Var = b2;
                    }
                    String N = musicOwner.g > 0 ? d370.N(R.string.music_label_curator, 0, aVar3) : null;
                    if (N == null) {
                        aVar3.K(-1674417926);
                        aVar3.j();
                        b = null;
                        h1Var2 = h1Var;
                    } else {
                        aVar3.K(-1674417925);
                        lg90 a4 = pg90.a(R.drawable.vk_icon_chevron_16, 0, aVar3);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        com.vk.core.compose.component.cell.content.x a5 = com.vk.core.compose.component.cell.content.h.a(a4, ylu0Var.getIcon().n, aVar3, 24584, 12);
                        h1Var2 = h1Var;
                        androidx.compose.runtime.a aVar4 = aVar3;
                        b = Cell$Middle.c.b.b(N, 1, null, a5, null, aVar4, 12583344, 104);
                        aVar3 = aVar4;
                        aVar3.j();
                    }
                    boolean y2 = aVar3.y(composeMusicOwnerVh);
                    Object x2 = aVar3.x();
                    a.C0011a.C0012a c0012a3 = c0012a;
                    if (y2 || x2 == c0012a3) {
                        ComposeMusicOwnerVh.b bVar = new ComposeMusicOwnerVh.b(0, composeMusicOwnerVh, ComposeMusicOwnerVh.class, "handleCuratorClick", "handleCuratorClick()V", 0);
                        aVar3.R(bVar);
                        x2 = bVar;
                    }
                    h590 h590Var = new h590(a3, h1Var2, b, (gzs) ((fcy) x2));
                    boolean y3 = aVar3.y(composeMusicOwnerVh);
                    Object x3 = aVar3.x();
                    if (y3 || x3 == c0012a3) {
                        ComposeMusicOwnerVh.c cVar = new ComposeMusicOwnerVh.c(0, composeMusicOwnerVh, ComposeMusicOwnerVh.class, "handleOwnerClick", "handleOwnerClick()V", 0);
                        aVar3.R(cVar);
                        x3 = cVar;
                    }
                    wiu0.b(j, false, a2, h590Var, null, (gzs) ((fcy) x3), null, aVar3, 6, 82);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                ojj.a((mm50) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                ((akk) this.c).a((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 4:
                an50 an50Var = (an50) this.c;
                ql50 ql50Var = (ql50) this.d;
                sti stiVar = (sti) obj;
                sl50 sl50Var = (sl50) obj2;
                rl50 invoke = an50Var.e.invoke(sl50Var);
                if (invoke != null) {
                    stiVar.a(invoke);
                }
                stiVar.a(new x100(ql50Var.a, ql50Var.b, sl50Var));
                return s3q0.a;
            case 5:
                ObtainVerificationScreenContent obtainVerificationScreenContent = (ObtainVerificationScreenContent) this.c;
                izs izsVar = (izs) this.d;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1285053909, intValue2, -1, "com.vk.ecomm.verifiedseller.impl.screens.obtainverification.ui.ObtainVerificationScreen.<anonymous> (ObtainVerificationScreen.kt:53)");
                    }
                    tlo0.h hVar = obtainVerificationScreenContent != null ? obtainVerificationScreenContent.c : null;
                    if (hVar == null) {
                        aVar5.K(-1997434312);
                        aVar5.j();
                        a = null;
                    } else {
                        aVar5.K(2013776617);
                        a = tlo0.b.a(hVar, (Context) aVar5.r(AndroidCompositionLocals_androidKt.b));
                        aVar5.j();
                    }
                    String obj3 = a != null ? a.toString() : null;
                    if (obj3 == null) {
                        obj3 = zq.a(aVar5, 2013778618, R.string.verified_business, aVar5, 0);
                    } else {
                        aVar5.K(2013775673);
                        aVar5.j();
                    }
                    boolean J = aVar5.J(izsVar);
                    Object x4 = aVar5.x();
                    a.C0011a.C0012a c0012a4 = a.C0011a.a;
                    if (J || x4 == c0012a4) {
                        x4 = new wn1(izsVar, 6);
                        aVar5.R(x4);
                    }
                    gzs gzsVar = (gzs) x4;
                    boolean J2 = aVar5.J(izsVar);
                    Object x5 = aVar5.x();
                    if (J2 || x5 == c0012a4) {
                        x5 = new lq0(izsVar, 6);
                        aVar5.R(x5);
                    }
                    ps70.a(obj3, gzsVar, (gzs) x5, aVar5, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 6:
                StringBuilder sb = (StringBuilder) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                sb.append(ref$ObjectRef.element + " \"" + ((String) obj) + "\": \"" + obj2 + "\"");
                ref$ObjectRef.element = StringUtils.COMMA;
                return s3q0.a;
            default:
                e9l0 e9l0Var = (e9l0) this.c;
                RecyclerView recyclerView = (RecyclerView) this.d;
                ((Integer) obj2).getClass();
                return new e9l0.a(e9l0Var, false, (RecyclerView) obj, recyclerView, null, 16);
        }
    }

    public /* synthetic */ dsg(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
