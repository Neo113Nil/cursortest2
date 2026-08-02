package xsna;

import android.graphics.drawable.Drawable;
import android.location.Location;
import androidx.appcompat.widget.Toolbar;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Good;
import com.vk.ecomm.design.compose.productattaches.ProductVideoAttach;
import com.vk.search.ui.api.SearchQuery;
import com.vk.voip.ui.prodstat.analytics.contact.action.VoipContactsActionAnalytics;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.giw0;
import xsna.rhw0;
import xsna.shw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class lq5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lq5(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v19, types: [com.vk.catalog2.common.ui.holders.header.TopBarVh$a, java.lang.Object] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 7;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ls5 ls5Var = ((mq5) obj4).a;
                break;
            case 1:
                break;
            case 2:
                izs izsVar = (izs) obj3;
                sio0 sio0Var = (sio0) ((Ref$ObjectRef) obj2).element;
                tho0 c = ((cwm) obj4).c((List) obj);
                if (sio0Var != null) {
                    sio0Var.a(null, c);
                }
                izsVar.invoke(c);
                break;
            case 3:
                ToolbarVh toolbarVh = (ToolbarVh) obj4;
                Toolbar toolbar = (Toolbar) obj3;
                srh0 srh0Var = (srh0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    toolbar.setNavigationIcon((Drawable) null);
                    toolbar.setCollapseIcon(dhr0.x(R.drawable.vk_icon_arrow_left_outline_28, BuildInfo.q() ? R.attr.vk_ui_icon_accent : R.attr.vk_ui_icon_accent_themed, toolbarVh.h));
                    io.reactivex.rxjava3.disposables.c cVar = toolbarVh.G;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    io.reactivex.rxjava3.disposables.c subscribe = toolbarVh.L.y(500L, TimeUnit.MILLISECONDS).U(new fe60(new bws(21), 13)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new s520(new rzl0(toolbarVh, i2), 25), new k5j0(new x620(28), 8));
                    hg1.b(toolbar, subscribe);
                    toolbarVh.G = subscribe;
                } else {
                    toolbarVh.j(toolbar);
                    srh0Var.g(new SearchQuery("", null, null, null, 14, null));
                    ?? r14 = toolbarVh.q;
                    if (r14 != 0) {
                        r14.setSearchQuery("");
                    }
                }
                break;
            case 4:
                u8r0 u8r0Var = (u8r0) obj4;
                Integer num = (Integer) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                it80 it80Var = (it80) obj;
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                zen0 d = vdx0Var.d();
                Location location = (Location) it80Var.a;
                s7n0 b = bbq.b();
                break;
            case 5:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                yzs yzsVar = (yzs) obj2;
                Integer num2 = (Integer) obj;
                ProductVideoAttach productVideoAttach = (ProductVideoAttach) j5g.b0(num2.intValue(), new wow((ArrayList) obj4));
                if (productVideoAttach != null) {
                    Good good = (Good) linkedHashMap.get(productVideoAttach);
                    if (good != null) {
                        yzsVar.invoke(productVideoAttach, good, num2);
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            default:
                zhw0 zhw0Var = (zhw0) obj4;
                String str = (String) obj2;
                zhw0Var.T(new giw0.f());
                if (((shw0) obj3) instanceof shw0.a) {
                    if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)) {
                        zhw0Var.C(rhw0.a0.b);
                    }
                    zhw0Var.h.b(new VoipContactsActionAnalytics.Event.ImportContacts(VoipContactsActionAnalytics.Event.ImportContacts.Type.SUCCESS));
                }
                break;
        }
        return s3q0.a;
    }
}
