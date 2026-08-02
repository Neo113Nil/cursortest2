package xsna;

import com.vk.api.generated.vkMaps.dto.VkMapsGeoAddressDetailsDto;
import com.vk.api.generated.vkMaps.dto.VkMapsGeoSuggestItemDto;
import com.vk.api.generated.vkMaps.dto.VkMapsGeoSuggestResponseDto;
import com.vk.log.L;
import com.vk.voip.ui.change_name.VoipChangeNameConfig;
import com.vk.voip.ui.hint.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.abw0;
import xsna.gm50;
import xsna.n6n0;
import xsna.nv3;
import xsna.utj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class l9v0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l9v0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r14v18, types: [T, xsna.utj] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        rdg0 rdg0Var;
        Object obj2;
        int i = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                return new t9v0((etv0) obj3);
            case 1:
                wlb0 wlb0Var = ((rov0) obj3).b;
                List<VkMapsGeoSuggestItemDto> d = ((VkMapsGeoSuggestResponseDto) obj).d();
                ArrayList arrayList = new ArrayList();
                for (VkMapsGeoSuggestItemDto vkMapsGeoSuggestItemDto : d) {
                    String d2 = vkMapsGeoSuggestItemDto.d();
                    if (d2 != null) {
                        VkMapsGeoAddressDetailsDto e = vkMapsGeoSuggestItemDto.e();
                        String k = e != null ? e.k() : null;
                        VkMapsGeoAddressDetailsDto e2 = vkMapsGeoSuggestItemDto.e();
                        String g = e2 != null ? e2.g() : null;
                        VkMapsGeoAddressDetailsDto e3 = vkMapsGeoSuggestItemDto.e();
                        String j = e3 != null ? e3.j() : null;
                        VkMapsGeoAddressDetailsDto e4 = vkMapsGeoSuggestItemDto.e();
                        String d3 = e4 != null ? e4.d() : null;
                        VkMapsGeoAddressDetailsDto e5 = vkMapsGeoSuggestItemDto.e();
                        String i2 = e5 != null ? e5.i() : null;
                        String f = vkMapsGeoSuggestItemDto.f();
                        VkMapsGeoAddressDetailsDto e6 = vkMapsGeoSuggestItemDto.e();
                        rdg0Var = new rdg0(f, d2, k, g, j, d3, i2, e6 != null ? e6.l() : null);
                    } else {
                        rdg0Var = null;
                    }
                    if (rdg0Var != null) {
                        arrayList.add(rdg0Var);
                    }
                }
                return new n6n0.b(arrayList);
            case 2:
                yaw0 yaw0Var = (yaw0) obj3;
                gm50.a.a(yaw0Var, ((abw0.a) obj).a, new lzl0(yaw0Var, 18));
                return s3q0.a;
            case 3:
                lcw0 lcw0Var = (lcw0) obj3;
                gzs<s3q0> gzsVar = lcw0Var.c;
                dhw0 L = com.vk.voip.ui.c.b.L();
                if (L != null) {
                    if (L.r()) {
                        xdw0 xdw0Var = L.A;
                        obj2 = new VoipChangeNameConfig.PreselectedUser.Anonym(xdw0Var != null ? xdw0Var.c : null);
                    } else {
                        obj2 = !L.O ? VoipChangeNameConfig.PreselectedUser.User.b : VoipChangeNameConfig.PreselectedUser.User.b;
                    }
                    lcw0Var.h.b(io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.i(com.vk.voip.ui.c.X().m(asu0.a.d()), new jg4(gzsVar, 5)), new pw4(L.a, 10), new a5(26, lcw0Var, obj2)));
                }
                return s3q0.a;
            case 4:
                l7s v = ((mjw0) obj3).v();
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                zot zotVar = new zot(v, ((cij0) obj).a, new iri0(ref$ObjectRef, 25));
                utj.a aVar = new utj.a(v);
                aVar.r = zotVar;
                aVar.h = new j89(9);
                ref$ObjectRef.element = aVar.m();
                return s3q0.a;
            case 5:
                com.vk.voip.ui.hint.a aVar2 = ((vjw0) obj3).c;
                mew0 mew0Var = ((nv3.a) obj).a;
                aVar2.getClass();
                whr0 whr0Var = mew0Var.c;
                a.EnumC2056a enumC2056a = a.EnumC2056a.AsrRecordStarted;
                if (enumC2056a.h() >= aVar2.a() && !mew0Var.b) {
                    int i3 = whr0Var.c ? R.string.voip_asr_record_hint_started_f : R.string.voip_asr_record_hint_started;
                    String r = rte0.r(whr0Var.q);
                    if (r == null) {
                        r = whr0Var.h;
                    }
                    aVar2.l(aVar2.a.getContext().getString(i3, r), Integer.valueOf(R.drawable.vk_icon_articles_outline_20), enumC2056a, 4000L);
                }
                return s3q0.a;
            case 6:
                int i4 = o1x0.g1;
                ((o1x0) obj3).dismiss();
                return s3q0.a;
            case 7:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) ((r6x0) obj3).c.invoke()).booleanValue());
            default:
                ((xnx0) obj3).g.b((nox0) obj);
                return s3q0.a;
        }
    }
}
