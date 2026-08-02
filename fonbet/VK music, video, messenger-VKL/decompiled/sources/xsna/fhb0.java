package xsna;

import com.vk.common.links.LaunchContext;
import com.vk.core.tips.Tooltip;
import com.vk.core.view.AdsButton;
import com.vk.dto.common.data.VKList;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.ecomm.market.attached.TaggedItemsBottomSheet;
import com.vk.ecomm.reviews.ui.reviewheader.ReviewHeaderView;
import com.vk.libvideo.ui.VideoPlayerAdsPanel;
import com.vk.search.params.api.SearchParamsWithCity;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.api.ExtendedUserProfile;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.a1o0;
import xsna.gij;
import xsna.n8z0;
import xsna.s8z0;
import xsna.so00;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class fhb0 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, Tooltip.c, AdsButton.b, s8z0.a, n8z0.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fhb0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.vk.core.view.AdsButton.b
    public void O2(int i) {
        ((VideoPlayerAdsPanel) this.c).h = i;
    }

    public void a(so00 so00Var) {
        String str;
        TaggedItemsBottomSheet taggedItemsBottomSheet = (TaggedItemsBottomSheet) this.c;
        int i = TaggedItemsBottomSheet.o1;
        if (so00Var instanceof so00.a) {
            so00.a aVar = (so00.a) so00Var;
            String uri = jeq0.g(aVar.a).buildUpon().appendQueryParameter("parent_content_owner_id", String.valueOf(taggedItemsBottomSheet.bo().j)).appendQueryParameter("parent_content_id", String.valueOf(taggedItemsBottomSheet.bo().h)).appendQueryParameter("parent_content_type", "POST").build().toString();
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = taggedItemsBottomSheet.bo().k;
            if (commonMarketStat$TypeRefSource == null || (str = commonMarketStat$TypeRefSource.name()) == null) {
                str = "PHOTO";
            }
            hd60.a().V(taggedItemsBottomSheet.requireContext(), uri, aVar.b, null, new LaunchContext(false, false, false, null, null, null, null, taggedItemsBottomSheet.l1, uri, str, null, false, false, false, null, null, null, aVar.c, null, false, false, null, null, null, 66583679));
            return;
        }
        if (so00Var instanceof qo00) {
            qo00 qo00Var = (qo00) so00Var;
            xn50.a.c(taggedItemsBottomSheet, new a1o0.a.C2517a(qo00Var.b, qo00Var.a, qo00Var.c));
        } else {
            if (!(so00Var instanceof ro00)) {
                throw new NoWhenBranchMatchedException();
            }
            ro00 ro00Var = (ro00) so00Var;
            xn50.a.c(taggedItemsBottomSheet, new a1o0.a.b(ro00Var.c, ro00Var.a, ro00Var.b, taggedItemsBottomSheet.l1));
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (VKList) ((irt) obj2).invoke(obj);
            case 1:
                return (io.reactivex.rxjava3.core.t) ((uv20) obj2).invoke(obj);
            case 2:
            case 5:
            case 10:
            case 14:
            default:
                int i2 = otw0.i1;
                return (Boolean) ((qjg0) obj2).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.b0) ((m6c0) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.b0) ((d2y) obj2).invoke(obj);
            case 6:
                return (SearchParamsWithCity) ((izs) obj2).invoke(obj);
            case 7:
                return (GetStoriesResponse) ((ou1) obj2).invoke(obj);
            case 8:
                return (t4n0) ((q4n0) obj2).invoke(obj);
            case 9:
                ((irt) obj2).invoke(obj);
                throw null;
            case 11:
                return (gij.d) ((irt) obj2).invoke(obj);
            case 12:
                return (ExtendedUserProfile) ((irt) obj2).invoke(obj);
            case 13:
                return (Pair) ((qjg0) obj2).invoke(obj);
            case 15:
                return (io.reactivex.rxjava3.core.b0) ((qjg0) obj2).invoke(obj);
            case 16:
                return (u6x0) ((qjg0) obj2).invoke(obj);
        }
    }

    @Override // com.vk.core.tips.Tooltip.c
    public void c(int i) {
        ((ReviewHeaderView) this.c).i = null;
    }

    @Override // xsna.n8z0.b
    public void f(njz0 njz0Var, xla xlaVar) {
        sjz0 sjz0Var = (sjz0) this.c;
        rez0 rez0Var = (rez0) njz0Var;
        pjz0 pjz0Var = sjz0Var.a;
        udz0 udz0Var = sjz0Var.b;
        if (rez0Var != null) {
            pjz0 b = rez0Var.b(pjz0Var.c);
            if (b != null) {
                pjz0Var.e(b);
            }
            udz0Var.d(10001, sjz0Var.a());
            sjz0Var.e();
            return;
        }
        iaz0 iaz0Var = (iaz0) xlaVar.b;
        if (iaz0Var != null) {
            gu8.c(null, "InstreamAdEngine: load - loading services failed - " + iaz0Var);
            sjz0Var.d = iaz0Var;
        } else {
            sjz0Var.d = iaz0.j;
        }
        udz0Var.b(0, 10002, "section=" + sjz0Var.a() + " , error=" + iaz0Var);
        sjz0Var.d();
    }

    @Override // xsna.s8z0.a
    public void i(z9z0 z9z0Var) {
        ((n7z0) this.c).m = z9z0Var;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((uv20) this.c).invoke(obj)).booleanValue();
    }
}
