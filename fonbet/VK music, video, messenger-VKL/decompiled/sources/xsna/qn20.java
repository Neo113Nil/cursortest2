package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.CellButton$Appearance;
import java.util.List;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class qn20 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qn20(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        switch (this.b) {
            case 0:
                List list = (List) this.c;
                izs izsVar = (izs) this.d;
                wh50 wh50Var = (wh50) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                int i = 0;
                int i2 = 16;
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    int i3 = -1;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1365789517, intValue, -1, "com.vk.notifications.design.compose.list.common.NotificationDropdownContent.<anonymous>.<anonymous> (MilkshakeNotification.kt:396)");
                    }
                    int i4 = 0;
                    for (Object obj4 : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            e43.t();
                            throw null;
                        }
                        de70 de70Var = (de70) obj4;
                        q630 E = ahn.E(s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), "NotificationDotMenuItem_" + i4);
                        String obj5 = de70Var.a.a((Context) aVar.r(AndroidCompositionLocals_androidKt.b)).toString();
                        CellButton$Appearance cellButton$Appearance = CellButton$Appearance.Neutral;
                        lg90 a = pg90.a(de70Var.b, i, aVar);
                        if (de70Var.c) {
                            aVar.K(-1238831315);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, i, i3, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j = ylu0Var.getIcon().h;
                            aVar.j();
                        } else {
                            aVar.K(-1238745972);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, i, i3, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j = ylu0Var2.getIcon().l;
                            aVar.j();
                        }
                        boolean J = aVar.J(izsVar) | aVar.y(de70Var);
                        Object x = aVar.x();
                        if (J || x == a.C0011a.a) {
                            x = new a5f(izsVar, de70Var, wh50Var, 1);
                            aVar.R(x);
                        }
                        androidx.compose.runtime.a aVar2 = aVar;
                        qiu0.a(obj5, (gzs) x, E, a, new l5g(j), null, 0, cellButton$Appearance, null, null, null, false, aVar2, 12587008, 8032);
                        i3 = i3;
                        aVar = aVar2;
                        i4 = i5;
                        i = 0;
                        i2 = i2;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                lg90 lg90Var = (lg90) this.c;
                String str = (String) this.d;
                String str2 = (String) this.e;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1540881263, intValue2, -1, "com.vk.music.playlist.display.presentation.SimpleButton.<anonymous> (MusicPlaylistHeaderButtons.kt:228)");
                    }
                    float v = hr80.z().v(ButtonSize.Medium, aVar3, 6);
                    q630.a aVar4 = q630.a.a;
                    pzu0.b(lg90Var, str, txj0.q(aVar4, v), k050.h(aVar3), aVar3, 8, 0);
                    if (str2 != null) {
                        aVar3.K(-216488997);
                        hr80.z().getClass();
                        op8.h();
                        f9t.e(txj0.v(aVar4, kqu0.s), aVar3, 0);
                        yqv0.c(str2, null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar3, 0, 0, 16382);
                        aVar3 = aVar3;
                    } else {
                        aVar3.K(-225774861);
                    }
                    aVar3.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
        }
    }
}
