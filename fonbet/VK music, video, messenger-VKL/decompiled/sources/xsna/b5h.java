package xsna;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.auth.ui.VkAuthErrorStatedEditText;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.clips.sdk.shared.item.market_ads.MarketAdsItemPatch;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.polls.Poll;
import com.vk.dto.profile.Address;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.yclients.f;
import com.vk.geo.impl.presentation.e;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.ui.views.DialogListInfoBarView;
import com.vk.im.ui.views.InfoBarView;
import com.vk.log.L;
import com.vk.polls.entities.exceptions.UserAlreadyVotedException;
import com.vk.update.core.a;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.data.b;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.adt0;
import xsna.d1j;
import xsna.d5h;
import xsna.drz;
import xsna.kex;
import xsna.m6w;
import xsna.mem;
import xsna.p410;
import xsna.r0w;
import xsna.rtb0;
import xsna.ukl;
import xsna.xce0;
import xsna.xrh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class b5h implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b5h(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        WeakReference<RecyclerView> weakReference;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        mem.a aVar;
        izs<? super InfoBar, s3q0> izsVar;
        ImageList imageList;
        xqm xqmVar;
        wzs<? super InfoBar, ? super InfoBar.Button, s3q0> wzsVar;
        switch (this.b) {
            case 0:
                d5h d5hVar = (d5h) this.c;
                ((Integer) obj).getClass();
                WeakReference<RecyclerView> weakReference2 = d5hVar.o;
                RecyclerView.Adapter adapter = (weakReference2 == null || (recyclerView2 = weakReference2.get()) == null) ? null : recyclerView2.getAdapter();
                d5h.b bVar = adapter instanceof d5h.b ? (d5h.b) adapter : null;
                xrh.c.b bVar2 = bVar != null ? bVar.f : null;
                if (bVar2 != null && (weakReference = d5hVar.o) != null && (recyclerView = weakReference.get()) != null) {
                    bwt0.n(recyclerView, new o43(13, d5hVar, bVar2));
                }
                return s3q0.a;
            case 1:
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) this.c;
                Address address = (Address) ((it80) obj).a;
                if (address != null) {
                    extendedCommunityProfile.V1 = address;
                }
                return s3q0.a;
            case 2:
                CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                LinearLayout linearLayout = communityReviewsFragment.b0;
                if (linearLayout != null) {
                    bwt0.p0(linearLayout, booleanValue);
                }
                return s3q0.a;
            case 3:
                s0j s0jVar = (s0j) this.c;
                L.g("Can't update room participants", (Throwable) obj);
                s0jVar.T(d1j.b.b);
                return s3q0.a;
            case 4:
                com.vk.ecomm.reviews.impl.communities.yclients.e eVar = (com.vk.ecomm.reviews.impl.communities.yclients.e) this.c;
                if (((Boolean) obj).booleanValue()) {
                    eVar.T(f.d.b);
                } else {
                    eVar.T(f.a.b);
                }
                return s3q0.a;
            case 5:
                ((y6k) this.c).Y0().getClass();
                zk70.e((Throwable) obj);
                return s3q0.a;
            case 6:
                ((uil) this.c).h6();
                return Boolean.TRUE;
            case 7:
                ukl uklVar = (ukl) this.c;
                rtb0.a aVar2 = (rtb0.a) obj;
                boolean z = aVar2.b;
                Poll poll = aVar2.a;
                if (z) {
                    ukl.a aVar3 = uklVar.a;
                    if (aVar3 != null) {
                        aVar3.a();
                    }
                    ukl.a aVar4 = uklVar.a;
                    if (aVar4 != null) {
                        aVar4.c(poll);
                    }
                } else {
                    ukl.a aVar5 = uklVar.a;
                    if (aVar5 != null) {
                        aVar5.d(new UserAlreadyVotedException("User already voted"), poll);
                    }
                }
                return s3q0.a;
            case 8:
                sem semVar = ((mem) this.c).s;
                if (semVar != null && (aVar = semVar.l) != null) {
                    aVar.b(null);
                }
                return s3q0.a;
            case 9:
                DialogListInfoBarView dialogListInfoBarView = (DialogListInfoBarView) this.c;
                InfoBar infoBar = dialogListInfoBarView.z;
                if (infoBar != null && (izsVar = dialogListInfoBarView.E) != null) {
                    izsVar.invoke(infoBar);
                }
                return s3q0.a;
            case 10:
                hkp hkpVar = ((tim) this.c).p;
                if (hkpVar != null) {
                    hkpVar.h(false);
                }
                return s3q0.a;
            case 11:
                Group group = (Group) ((ka80) obj).c.e.c.get(Long.valueOf(((a1w) ((q1t) this.c).b).q().d));
                String str = null;
                String str2 = group != null ? group.c : null;
                if (group != null && (imageList = group.e) != null) {
                    str = imageList.Db();
                }
                return new sr5(str2, str, group != null ? group.o : false);
            case 12:
                e4n e4nVar = e4n.this;
                e4n.N(e4nVar, new wqf(e4nVar, 14));
                return s3q0.a;
            case 13:
                opp oppVar = (opp) this.c;
                VkAuthErrorStatedEditText vkAuthErrorStatedEditText = oppVar.y;
                if (vkAuthErrorStatedEditText == null) {
                    vkAuthErrorStatedEditText = null;
                }
                vkAuthErrorStatedEditText.setErrorState(false);
                TextView textView = oppVar.A;
                if (textView == null) {
                    textView = null;
                }
                f4m.j(textView);
                oppVar.L = null;
                return s3q0.a;
            case 14:
                return ((mqp) this.c).d().b().d((List) obj);
            case 15:
                wvq wvqVar = (wvq) this.c;
                nvy nvyVar = (nvy) obj;
                nvy.g(nvyVar, null, null, new jai(-1191862237, new fme(wvqVar, 1), true), 3);
                nvy.g(nvyVar, null, null, new jai(613786956, new tvq(wvqVar, 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(128841707, new uvq(wvqVar, 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(-356103542, new cjd(wvqVar, 1), true), 3);
                nvy.g(nvyVar, null, null, new jai(-841048791, new pd0(wvqVar, 2), true), 3);
                nvy.g(nvyVar, null, null, new jai(-1325994040, new hrg(wvqVar, 2), true), 3);
                nvy.g(nvyVar, null, null, new jai(-1810939289, new vvq(wvqVar, 0), true), 3);
                return s3q0.a;
            case 16:
                return new du90((ViewGroup) obj, ((txr) this.c).j);
            case 17:
                com.vk.geo.impl.presentation.b bVar3 = (com.vk.geo.impl.presentation.b) this.c;
                xce0.a aVar6 = (xce0.a) obj;
                jo00 jo00Var = aVar6.e;
                List<lif0> list = aVar6.a.e;
                if (list == null || !((y5u0) bVar3.s.b().h.getValue()).e) {
                    list = null;
                }
                bVar3.T(new e.a.c(jo00Var, list));
                return s3q0.a;
            case 18:
                c8v c8vVar = (c8v) this.c;
                c8vVar.d1().g(false);
                c8vVar.f1().a((Throwable) obj);
                return s3q0.a;
            case 19:
                return ((UIBlockList) this.c).y.get(((Integer) obj).intValue()).Fb();
            case 20:
                b.d dVar = (b.d) obj;
                for (Map.Entry entry : ((LinkedHashMap) this.c).entrySet()) {
                    dVar.b(entry.getValue(), (String) entry.getKey());
                }
                return s3q0.a;
            case 21:
                r0w.a aVar7 = ((s0w) this.c).b;
                if (aVar7 != null && (xqmVar = r0w.this.l) != null) {
                    xqmVar.d();
                }
                return s3q0.a;
            case 22:
                ((d7w) this.c).e(new m6w.b((n5w) ((drz.a) obj).a));
                return s3q0.a;
            case 23:
                return (a.C1935a) this.c;
            case 24:
                InfoBarView infoBarView = (InfoBarView) this.c;
                InfoBar.Button button = (InfoBar.Button) obj;
                InfoBar infoBar2 = infoBarView.z;
                if (infoBar2 != null && (wzsVar = infoBarView.D) != null) {
                    wzsVar.invoke(infoBar2, button);
                }
                return s3q0.a;
            case 25:
                kex kexVar = (kex) this.c;
                String str3 = (String) obj;
                kex.a aVar8 = kexVar.d;
                if (aVar8 != null) {
                    aVar8.b(str3, kexVar);
                }
                return s3q0.a;
            case 26:
                ((com.vk.clips.sdk.shared.item.market_ads.a) this.c).T(MarketAdsItemPatch.a.C0678a.b);
                return s3q0.a;
            case 27:
                j210 j210Var = (j210) this.c;
                int intValue = ((Integer) obj).intValue();
                h210 h210Var = j210Var.n;
                if (h210Var != null) {
                    j210Var.l.g(intValue, h210Var.b);
                }
                return s3q0.a;
            case 28:
                a410 a410Var = (a410) this.c;
                Throwable th = (Throwable) obj;
                mzp0 mzp0Var = a410Var.i;
                if (mzp0Var != null) {
                    mzp0Var.f();
                }
                a410Var.T(new p410.b(th));
                return s3q0.a;
            default:
                adt0.a aVar9 = (adt0.a) obj;
                aVar9.a = ((k520) this.c).d;
                aVar9.c = "live_video";
                return aVar9.a();
        }
    }
}
