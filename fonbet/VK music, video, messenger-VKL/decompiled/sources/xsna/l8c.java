package xsna;

import androidx.compose.runtime.a;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.hzg;
import xsna.qbk;
import xsna.ypt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class l8c implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l8c(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                p8c.a((n4c) this.d, (gzs) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(385));
                return s3q0.a;
            case 1:
                dhf dhfVar = (dhf) this.d;
                q630 q630Var = (q630) this.c;
                whf whfVar = (whf) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1103163443, intValue, -1, "com.vk.clips.upload.ui.impl.compose.ClipsUploadScreenComposeWrapperImpl.Content.<anonymous>.<anonymous> (ClipsUploadScreenComposeWrapperImpl.kt:46)");
                    }
                    aVar.K(-716849040);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    boolean J = aVar.J(whfVar) | aVar.J(dhfVar);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new ma(5, whfVar, dhfVar);
                        aVar.R(x);
                    }
                    izs izsVar = (izs) x;
                    rfc a = fpf0.a(xhf.class);
                    if (linkedHashMap.containsKey(a)) {
                        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + a.h() + JwtParser.SEPARATOR_CHAR).toString());
                    }
                    linkedHashMap.put(a, new tyt0(a, izsVar));
                    tyt0[] tyt0VarArr = (tyt0[]) linkedHashMap.values().toArray(new tyt0[0]);
                    ozw ozwVar = new ozw((tyt0[]) Arrays.copyOf(tyt0VarArr, tyt0VarArr.length));
                    aVar.j();
                    xyt0 a2 = jwz.a(aVar);
                    if (a2 == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    xhf xhfVar = (xhf) uyt0.a(fpf0.a(xhf.class), a2, ozwVar, a2 instanceof androidx.lifecycle.f ? ((androidx.lifecycle.f) a2).getDefaultViewModelCreationExtras() : qbk.a.b, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    vhf.b(xhfVar, ylu0Var.s() ? R.style.Vk_Theme_VkApp_bright_light_generated : R.style.Vk_Theme_VkApp_space_gray_generated, txj0.d(q630Var, 1.0f), aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                hzg.a aVar2 = (hzg.a) this.d;
                q630 q630Var2 = (q630) this.c;
                izs izsVar2 = (izs) this.e;
                ((Integer) obj2).getClass();
                pyg.a(ne7.I(1), (androidx.compose.runtime.a) obj, aVar2, izsVar2, q630Var2);
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                cyk.a((Long) this.d, (izs) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                ((nat) this.d).h((ibt) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 5:
                ypt.a aVar3 = (ypt.a) this.d;
                qpj qpjVar = (qpj) this.e;
                ypt yptVar = (ypt) this.c;
                WebApiApplication webApiApplication = (WebApiApplication) obj;
                VkUiView vkUiView = (VkUiView) obj2;
                List c0 = drm0.c0(aVar3.a.b, new String[]{StringUtils.COMMA}, 0, 6);
                ArrayList arrayList = new ArrayList(c5g.u(c0, 10));
                Iterator it = c0.iterator();
                while (it.hasNext()) {
                    arrayList.add(drm0.p0((String) it.next()).toString());
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (!drm0.N((String) next)) {
                        arrayList2.add(next);
                    }
                }
                vkUiView.y4(arrayList2, null, webApiApplication, new zpt(qpjVar, aVar3, yptVar));
                return s3q0.a;
            case 6:
                be70 be70Var = (be70) this.d;
                ce70 ce70Var = (ce70) this.e;
                izs<? super fd70, s3q0> izsVar3 = (izs) this.c;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1301092132, intValue2, -1, "com.vk.notifications.list.impl.presentation.base.view.menu.NotificationMenuModalView.ThemedContent.<anonymous> (NotificationMenuModalView.kt:93)");
                    }
                    be70Var.k(ce70Var, izsVar3, aVar4, 512);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                ((cic0) this.d).m((upc0) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                ((fdd0) this.d).h((ldd0) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                com.vk.profile.design.compose.user.a.a((us2) this.d, (us2) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(385));
                return s3q0.a;
        }
    }

    public /* synthetic */ l8c(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    public /* synthetic */ l8c(dhf dhfVar, q630 q630Var, whf whfVar) {
        this.b = 1;
        this.d = dhfVar;
        this.c = q630Var;
        this.e = whfVar;
    }

    public /* synthetic */ l8c(hzg.a aVar, q630 q630Var, izs izsVar, int i) {
        this.b = 2;
        this.d = aVar;
        this.c = q630Var;
        this.e = izsVar;
    }
}
