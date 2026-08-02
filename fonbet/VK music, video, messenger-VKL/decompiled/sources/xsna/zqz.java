package xsna;

import android.content.SharedPreferences;
import androidx.compose.runtime.a;
import com.vk.dto.common.id.UserId;
import com.vk.toggle.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.jpl0;
import xsna.kdh0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class zqz implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zqz(int i, Object obj, Object obj2) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        switch (this.b) {
            case 0:
                kdh0.a aVar = (kdh0.a) this.d;
                izs izsVar = (izs) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1034360619, intValue, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.screen.advancedSettingsItems.<anonymous> (Loaded.kt:226)");
                    }
                    rzi0.b(aVar.n, izsVar, ahn.E(q630.a.a, "LoadedTags.ADVANCED"), aVar2, 384);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 1:
                jpl0.a.d dVar = (jpl0.a.d) this.d;
                izs izsVar2 = (izs) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(426108918, intValue2, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.productmanagement.productsManagementBanner.<anonymous> (ProductsManagementBanner.kt:49)");
                    }
                    rsd0.a(dVar.a.m, izsVar2, null, aVar3, 0);
                    if (a690.d(q630.a.a, 8, aVar3, 6)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 2:
                d0r0 d0r0Var = (d0r0) this.d;
                UserId userId = (UserId) this.c;
                List<b.d> list = (List) obj2;
                b.c cVar = (b.c) obj3;
                d0r0Var.a().edit().clear().apply();
                qaj0.c(d0r0Var.a(), "another_user_id", Long.valueOf(userId.b));
                List<b.d> list2 = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((b.d) it.next()).b.toString());
                }
                qaj0.c(d0r0Var.a(), "cached_local_toggles_keys", j5g.S0(arrayList));
                for (b.d dVar2 : list2) {
                    SharedPreferences a = d0r0Var.a();
                    String str = "cached_local_toggle_value_" + dVar2.b.toString();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("enabled", dVar2.a);
                    jSONObject.put("value", dVar2.c.toString());
                    qaj0.c(a, str, jSONObject.toString());
                }
                for (b.d dVar3 : list) {
                    Iterator<T> it2 = cVar.b.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj4 = it2.next();
                            if (epx.f(((b.d) obj4).b.toString(), dVar3.b.toString())) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    b.d dVar4 = (b.d) obj4;
                    b0r0 b0r0Var = dVar4 != null ? new b0r0(dVar4) : new b0r0(new b.d(dVar3.b.toString()));
                    if (d0r0.b(dVar3, b0r0Var)) {
                        d0r0Var.a.h.e().a(b0r0Var, true);
                        d0r0Var.a.i.a.put(b0r0Var.b.toString(), b0r0Var);
                    }
                }
                break;
            default:
                q1t0 q1t0Var = (q1t0) this.d;
                com.vk.repository.internal.repos.stickers.suggests.a aVar4 = (com.vk.repository.internal.repos.stickers.suggests.a) this.c;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(21649787, intValue3, -1, "com.vk.profile.design.compose.header.header.picture.paging.page.VideoPageContent.<anonymous>.<anonymous> (VideoPage.kt:211)");
                }
                q630 d = txj0.d(q630.a.a, 1.0f);
                boolean J = aVar5.J(q1t0Var) | aVar5.J(aVar4);
                Object x = aVar5.x();
                if (J || x == a.C0011a.a) {
                    x = new i5(22, q1t0Var, aVar4);
                    aVar5.R(x);
                }
                qka0.c(48, aVar5, (gzs) x, d);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
        }
        return s3q0.a;
    }
}
