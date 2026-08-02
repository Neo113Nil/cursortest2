package xsna;

import android.content.Context;
import android.view.View;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.reefton.literx.observable.ObservableCreate;
import com.vk.reefton.literx.observable.ObservableTake;
import com.vk.voip.ui.history.past.presentation.base.fragment.VoipPastCallsFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.wih0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class f21 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ f21(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        String str;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1524289712, intValue, -1, "com.vk.profile.community.impl.ui.profile.content.holders.market.ComposableSingletons$CommunityProfileContentServicesViewHolderKt.lambda$1524289712.<anonymous> (CommunityProfileContentServicesViewHolder.kt:289)");
                    }
                    rrv0.d(null, null, null, null, c4g0.d, aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1603749813, intValue2, -1, "com.vk.core.compose.component.ComposableSingletons$VkAccentTabRowKt.lambda$-1603749813.<anonymous> (VkAccentTabRow.kt:143)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                qih0 qih0Var = (qih0) obj;
                qih0 qih0Var2 = (qih0) obj2;
                ArrayList u0 = j5g.u0(qih0Var2.a, qih0Var.a);
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                Iterator it = u0.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    wih0 wih0Var = (wih0) next;
                    if (wih0Var instanceof wih0.a) {
                        str = ((wih0.a) wih0Var).a.a1();
                    } else if (wih0Var instanceof wih0.d) {
                        str = ((wih0.d) wih0Var).a;
                    } else if (wih0Var instanceof wih0.b) {
                        str = ((wih0.b) wih0Var).a;
                    } else {
                        if (!(wih0Var instanceof wih0.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = ((wih0.c) wih0Var).a;
                    }
                    if (hashSet.add(str)) {
                        arrayList.add(next);
                    }
                }
                return new qih0(arrayList, qih0Var.d, qih0Var2.e, null, null);
            case 4:
                ynf0 ynf0Var = (ynf0) obj2;
                ObservableCreate observableCreate = new ObservableCreate(new vnf0((Context) obj, ynf0Var));
                long j = ynf0Var.b;
                return (j <= 0 || j >= Long.MAX_VALUE) ? new nq70(new Exception("Unexpected numUpdates")) : new ObservableTake(observableCreate, j);
            case 5:
                f2h0 f2h0Var = (f2h0) obj;
                v4j0 v4j0Var = (v4j0) obj2;
                return e43.a(i2h0.a(new l5g(v4j0Var.a), i2h0.r, f2h0Var), i2h0.a(new ov70(v4j0Var.b), i2h0.z, f2h0Var), Float.valueOf(v4j0Var.c));
            case 6:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar3.K(501860930);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(501860930, intValue3, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:230)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.P0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var;
            case 7:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken2 = VkTypographyToken.DisplayTitle1;
                aVar4.K(482319808);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(482319808, intValue4, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:210)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) aVar4.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var2 = wuv0Var2.v0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                return frv0Var2;
            default:
                int i = VoipPastCallsFragment.a0;
                return Boolean.valueOf(((View) obj2) instanceof VkPlaceholder);
        }
    }
}
