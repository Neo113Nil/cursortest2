package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.auth.DefaultAuthActivity;
import com.vk.biometrics.lock.impl.service.HidePushContentService;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.log.L;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import xsna.lab0;
import xsna.m1j;
import xsna.qr60;
import xsna.rzn;
import xsna.tj50;
import xsna.tlo0;
import xsna.ucm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class af2 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ af2(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                L.j((Throwable) obj, "Catalog");
                return s3q0.a;
            case 1:
                Integer num = (Integer) obj;
                return new nd4(num != null && num.intValue() == 1);
            case 2:
                bwt0.p0((View) obj, false);
                return s3q0.a;
            case 3:
                return s3q0.a;
            case 4:
                zk70.e((Throwable) obj);
                return s3q0.a;
            case 5:
                return com.vk.channels.impl.comments.g.a((com.vk.channels.impl.comments.g) obj, null, null, null, false, 7);
            case 6:
                return fnd.a(((ClipsCoauthorsSelectorMviState.a) obj).c.size());
            case 7:
                Context context = (Context) obj;
                VkImageSimple vkImageSimple = new VkImageSimple(context, null, 6, 0);
                vkImageSimple.setImageTintList(e3m.c(R.attr.vk_ui_icon_contrast, context));
                return vkImageSimple;
            case 8:
                int i = CommunityAddressesFragment.E0;
                return fkw.b((Bitmap) obj);
            case 9:
                qgi0.r((tgi0) obj, "backButton");
                return s3q0.a;
            case 10:
                return new m1j.d(((tj50.a) obj).a(new com.vk.movika.sdk.base.observable.e0(17), ao8.d));
            case 11:
                return ((nlq0) obj).m;
            case 12:
                aoj aojVar = (aoj) obj;
                aojVar.a(cdi.f);
                aojVar.b();
                aojVar.a(q6x.h);
                aojVar.b();
                com.vk.design.demo.presentation.screens.a.h(aojVar, 3);
                aojVar.a(new soj((7 & 1) != 0 ? "Action" : null, (7 & 2) != 0));
                aojVar.a(edi.e);
                aojVar.a(toj.b);
                aojVar.a(uoj.b);
                aojVar.a(hr80.b);
                aojVar.b();
                return s3q0.a;
            case 13:
                return ((c9k) obj).q;
            case 14:
                s25 s25Var = (s25) obj;
                DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.U;
                try {
                    q55 q55Var = q55.a;
                    Bundle bundle = q55.c().a.K;
                    if (bundle != null) {
                        r2 = bundle.getString("white_label_flow_output_sat");
                    }
                } catch (Throwable unused) {
                }
                m63.m(new Bundle(), r2);
                s25Var.getClass();
                return s3q0.a;
            case 15:
                return ucm.a.a((ucm.a) obj);
            case 16:
                yfn yfnVar = (yfn) obj;
                List<lab0.a> list = yfnVar.m;
                Map<String, String> map = yfnVar.w;
                if (map.isEmpty()) {
                    return new w050(list);
                }
                ArrayList arrayList = new ArrayList();
                for (lab0.a aVar : list) {
                    String str = map.get(aVar.a);
                    if (str != null) {
                        arrayList.add(new lab0.b(str));
                    }
                    arrayList.add(aVar);
                }
                return new w050(arrayList);
            case 17:
                rzn rznVar = new rzn((Context) obj);
                rznVar.setRightContent(rzn.a.b.a);
                tlo0.Companion.getClass();
                rznVar.setText(new tlo0.h("Много текста вообще жестб Много текста вообще жестб Много текста вообще жестб"));
                return rznVar;
            case 18:
                return ayr.a((ayr) obj, null, false, false, null, null, null, null, null, null, null, true, 15359);
            case 19:
                return new l760(R.layout.new_followers_header, (ViewGroup) obj);
            case 20:
                cvk.u(R.string.error, false);
                L.g("Can't update loading state", (Throwable) obj);
                return s3q0.a;
            case 21:
                return s3q0.a;
            case 22:
                wmt wmtVar = (wmt) obj;
                return new cmt(new qr60.a.f(wmtVar.a, wmtVar.b, wmtVar.d));
            case 23:
                return new jot((ViewGroup) obj);
            case 24:
                return fwx0.c().a((CharSequence) obj);
            case 25:
                return Boolean.valueOf(((jhu) obj).g);
            case 26:
                int i2 = HidePushContentService.j;
                return s3q0.a;
            case 27:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 28:
                L.j((Throwable) obj, "observeVisibleItems stories update in ImItemListViewController");
                return s3q0.a;
            default:
                return Boolean.valueOf(((BaseOkResponseDto) obj).i() == BaseOkResponseDto.OK.i());
        }
    }

    public /* synthetic */ af2(Object obj, int i) {
        this.b = i;
    }
}
