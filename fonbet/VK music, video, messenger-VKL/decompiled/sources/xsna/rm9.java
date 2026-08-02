package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.ui.holders.header.TopBarVh;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.models.messages.Msg;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.webapp.fragments.GiftsCatalogFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xsna.cf70;
import xsna.if70;
import xsna.nzt;
import xsna.p810;
import xsna.spt;
import xsna.u8m;
import xsna.ug30;
import xsna.vm30;
import xsna.vzi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class rm9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rm9(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        UserId userId;
        int i = this.b;
        char c = 1;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((com.vk.cameraui.impl.a) obj5).M.f(((o7m0) obj4).getInfo(), ((spt.a) obj3).a, new File((String) obj));
                break;
            case 1:
                eda edaVar = (eda) obj5;
                String str = (String) obj4;
                TopBarVh topBarVh = (TopBarVh) obj3;
                hda hdaVar = (hda) obj;
                Object obj6 = hdaVar.a;
                CatalogExtendedData catalogExtendedData = hdaVar.b;
                if (obj6 != null && catalogExtendedData != null) {
                    edaVar.b.b(new buz(12, new ak2(str, c == true ? 1 : 0), new j85(hdaVar.c, edaVar, obj6, catalogExtendedData, topBarVh)), false);
                }
                break;
            case 2:
                Context context = (Context) obj5;
                String str2 = (String) obj4;
                Map map = (Map) obj3;
                nzt.a.C3428a c3428a = (nzt.a.C3428a) obj;
                int i2 = GiftsCatalogFragment.c0;
                Uri.Builder builder = new Uri.Builder();
                if (str2 != null) {
                    builder.appendEncodedPath(str2);
                }
                Uri.Builder appendEncodedPath = builder.appendEncodedPath("");
                for (Map.Entry entry : map.entrySet()) {
                    appendEncodedPath.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri.Builder appendQueryParameter = appendEncodedPath.appendQueryParameter("from_entrypoint", "1");
                boolean M = dhr0.M();
                appendQueryParameter.appendQueryParameter("lang", ply.a());
                appendQueryParameter.appendQueryParameter("scheme", !M ? "bright_light" : "space_gray");
                appendQueryParameter.appendQueryParameter("appearance", !M ? "light" : "dark");
                GiftsCatalogFragment.b.a(context, c3428a.a + "#" + appendQueryParameter.build().toString(), false);
                break;
            case 3:
                p810.k kVar = (p810.k) obj5;
                f810 f810Var = (f810) obj4;
                y810 y810Var = (y810) obj3;
                Iterator<T> it = kVar.b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((glu) obj2).e) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                glu gluVar = (glu) obj2;
                a810 a810Var = f810Var.l;
                boolean z = y810Var.y == 0;
                Long valueOf = (gluVar == null || (userId = gluVar.b) == null) ? null : Long.valueOf(userId.b);
                UserId userId2 = f810Var.i;
                a810Var.a(valueOf, userId2 != null ? Long.valueOf(userId2.b) : null, z);
                if (gluVar != null && !f810.W(gluVar.g)) {
                    break;
                } else {
                    break;
                }
                break;
            case 4:
                vm30.m mVar = (vm30.m) obj5;
                vm30 vm30Var = (vm30) obj4;
                Msg msg = (Msg) obj3;
                boolean contains = ((List) obj).contains(u8m.u.b);
                mVar.invoke(contains ? ug30.h.a : ug30.g.a);
                ym30 ym30Var = vm30Var.t0;
                if (ym30Var != null) {
                    ym30Var.e0(Collections.singletonList(msg), contains);
                }
                break;
            default:
                qe70 qe70Var = (qe70) obj5;
                UserId userId3 = (UserId) obj4;
                jf70 jf70Var = (jf70) obj3;
                qe70Var.o.b(vzi0.c.a);
                qe70Var.f.e(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, new ywm0(userId3, false));
                qe70Var.g.A(false, false, MobileOfficialAppsCoreNavStat$EventScreen.SETTINGS_NOTIFICATIONS_SUBSCRIPTION_TO_STORIES, null);
                qe70Var.T(new cf70.e(userId3));
                String str3 = jf70Var.d;
                if (str3 == null) {
                    break;
                } else {
                    List<UserProfile> list = jf70Var.i;
                    if (list != null) {
                        qe70Var.n.b(new if70.b(str3, list.size() - 1));
                        break;
                    } else {
                        break;
                    }
                }
        }
        return s3q0.a;
    }
}
