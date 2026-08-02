package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.attachpicker.impl.graffiti.presentation.GraffitiDrawingFragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.Hint;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.impl.postmodal.reactions.ModalPostReactionsFragment;
import com.vk.posting.presentation.root.PickerRootFragment;
import com.vk.profile.user.impl.ui.b;
import com.vk.search.params.api.SearchParams;
import com.vk.superapp.api.dto.auth.VkAuthAppScope;
import com.vk.superapp.base.js.bridge.VkUiPermissionsHandler;
import com.vk.voip.ui.broadcast.list.ui.PastBroadcastsFragment;
import com.vk.voip.ui.call_by_link.ui.VoipCallByLinkFragment;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.d110;
import xsna.dr00;
import xsna.e0o0;
import xsna.gm50;
import xsna.hls;
import xsna.jns;
import xsna.k840;
import xsna.nlz;
import xsna.rf60;
import xsna.tlo0;
import xsna.via0;
import xsna.vzi0;
import xsna.xn50;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class rop implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rop(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z = false;
        z = false;
        switch (this.b) {
            case 0:
                vop vopVar = (vop) this.c;
                vgg vggVar = (vgg) obj;
                if (vggVar.b() == ApiErrorViewType.CUSTOM) {
                    vopVar.z0(vggVar);
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    vggVar.c();
                }
                return s3q0.a;
            case 1:
                return Boolean.valueOf(((Class) this.c).isInstance((NewsEntry) obj));
            case 2:
                bcq bcqVar = (bcq) this.c;
                Pair pair = (Pair) obj;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) pair.d();
                JSONObject jSONObject = (JSONObject) pair.g();
                if (epx.f(o25.a().c(), extendedUserProfile.a.c)) {
                    bcqVar.b = extendedUserProfile;
                } else {
                    bcqVar.c.put(extendedUserProfile.a.c, extendedUserProfile);
                }
                if (jSONObject != null) {
                    bcqVar.d.put(extendedUserProfile.a.c, jSONObject);
                }
                return s3q0.a;
            case 3:
                ((cxq) this.c).i((u5r) obj);
                return s3q0.a;
            case 4:
                ((gls) this.c).T(new hls.b.C3007b((jks) obj));
                return s3q0.a;
            case 5:
                ((xms) this.c).T(new jns.b.a((Throwable) obj));
                return s3q0.a;
            case 6:
                wht whtVar = (wht) this.c;
                ((etv0) obj).b(false);
                whtVar.b.getSideControlPanel().getMusicButtonView().performClick();
                return s3q0.a;
            case 7:
                ((bzt) this.c).a.a = (List) obj;
                return s3q0.a;
            case 8:
                throw null;
            case 9:
                GraffitiDrawingFragment graffitiDrawingFragment = (GraffitiDrawingFragment) this.c;
                int i = GraffitiDrawingFragment.Q;
                graffitiDrawingFragment.finish();
                return s3q0.a;
            case 10:
                drx drxVar = (drx) this.c;
                tlo0.a aVar = tlo0.Companion;
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "";
                }
                aVar.getClass();
                drxVar.Y(new tlo0.h(message));
                return s3q0.a;
            case 11:
                ((cmz) this.c).b.invoke(new nlz.b((UserId) obj));
                return s3q0.a;
            case 12:
                ((ptz) this.c).c.finish();
                return s3q0.a;
            case 13:
                com.vk.clips.sdk.shared.item.market_ads.b bVar = (com.vk.clips.sdk.shared.item.market_ads.b) this.c;
                gm50.a.a(bVar, ((dr00.c) obj).a, new fgh(bVar, 27));
                return s3q0.a;
            case 14:
                n010 n010Var = (n010) this.c;
                Throwable th = (Throwable) obj;
                mzp0 mzp0Var = n010Var.g;
                if (mzp0Var != null) {
                    mzp0Var.f();
                }
                n010Var.T(new d110.a.C2695a(th));
                return s3q0.a;
            case 15:
                String str = (String) obj;
                TextView textView = ((MarketItemReviewsFragment) this.c).l0;
                (textView != null ? textView : null).setText(str);
                return s3q0.a;
            case 16:
                f910 f910Var = (f910) this.c;
                i810 i810Var = (i810) f910Var.w.getValue();
                o810 o810Var = (o810) f910Var.C.getValue();
                la10 la10Var = new la10(((ViewGroup) obj).getContext());
                la10Var.setAdapter(i810Var);
                la10Var.setOnScrollListener(new ef90(o810Var));
                f910Var.r.add(la10Var);
                la10Var.setType(1);
                return la10Var;
            case 17:
                via0.a aVar2 = (via0.a) this.c;
                e0o0 e0o0Var = (e0o0) obj;
                if ((e0o0Var instanceof e0o0.a) && ((e0o0.a) e0o0Var).a.a.a == aVar2.a.a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 18:
                ModalPostReactionsFragment modalPostReactionsFragment = (ModalPostReactionsFragment) this.c;
                hyn0 hyn0Var = (hyn0) obj;
                int i2 = ModalPostReactionsFragment.f0;
                ArrayList arrayList = hyn0Var.a;
                modalPostReactionsFragment.e0 = hyn0Var.b;
                z130 z130Var = modalPostReactionsFragment.X;
                if (z130Var != null) {
                    z130Var.k = arrayList;
                    z130Var.notifyDataSetChanged();
                }
                ModalPostReactionsFragment.go(modalPostReactionsFragment, arrayList.size() > 1, 14);
                return s3q0.a;
            case 19:
                MusicTrack musicTrack = (MusicTrack) this.c;
                Playlist playlist = (Playlist) obj;
                bn40.g("removeMusicFromPlaylist", playlist);
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(new qeb0(musicTrack, playlist));
                return s3q0.a;
            case 20:
                return ((ab40) this.c).d((List) obj, true);
            case 21:
                return new io.reactivex.rxjava3.internal.operators.observable.q(new o400((f500) obj, ((pn40) this.c).b));
            case 22:
                List list = (List) obj;
                izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = ((b960) this.c).d;
                (izsVar != null ? izsVar : null).invoke(new b.l(list));
                return s3q0.a;
            case 23:
                sg60 sg60Var = (sg60) this.c;
                List<ol60> list2 = ((xf60) sg60Var.b.getCurrentState()).d.b.a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (obj2 instanceof z1c0) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((z1c0) it.next()).h.h);
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof vt80) {
                        arrayList4.add(next);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    x9v0 x9v0Var = ((vt80) it3.next()).m.m;
                    if (x9v0Var != null) {
                        arrayList5.add(x9v0Var);
                    }
                }
                sg60Var.c(new rf60.a(new yo60.i.a(arrayList5)));
                return s3q0.a;
            case 24:
                Hint hint = (Hint) this.c;
                LinkedHashMap linkedHashMap = hl60.f;
                String str2 = hint.b;
                linkedHashMap.remove(str2);
                hl60.e.remove(str2);
                return s3q0.a;
            case 25:
                ((qe70) this.c).o.b(vzi0.a.a);
                return s3q0.a;
            case 26:
                xz70 xz70Var = (xz70) this.c;
                bru0 bru0Var = (bru0) obj;
                SearchParams searchParams = xz70Var.g;
                if (searchParams != null) {
                    searchParams.h5(bru0Var.a);
                }
                xz70Var.a(xz70Var.f.b());
                xz70Var.c();
                return s3q0.a;
            case 27:
                PastBroadcastsFragment pastBroadcastsFragment = (PastBroadcastsFragment) this.c;
                int i3 = PastBroadcastsFragment.U;
                new VoipCallByLinkFragment().Fn(pastBroadcastsFragment.In(), "VoipCallByLinkFragment");
                return s3q0.a;
            case 28:
                ux90 ux90Var = (ux90) this.c;
                List<VkAuthAppScope> list3 = ((w73) obj).a;
                if (list3 == null) {
                    return s3q0.a;
                }
                List<VkAuthAppScope> list4 = list3;
                ArrayList arrayList6 = new ArrayList(c5g.u(list4, 10));
                Iterator<T> it4 = list4.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(((VkAuthAppScope) it4.next()).b);
                }
                VkUiPermissionsHandler.Permissions[] values = VkUiPermissionsHandler.Permissions.values();
                ArrayList arrayList7 = new ArrayList(values.length);
                for (VkUiPermissionsHandler.Permissions permissions : values) {
                    arrayList7.add(permissions.h());
                }
                ArrayList arrayList8 = new ArrayList();
                Iterator it5 = arrayList6.iterator();
                while (it5.hasNext()) {
                    Object next2 = it5.next();
                    if (arrayList7.contains((String) next2)) {
                        arrayList8.add(next2);
                    }
                }
                ux90Var.c.addAll(arrayList8);
                return s3q0.a;
            default:
                PickerRootFragment pickerRootFragment = (PickerRootFragment) this.c;
                int i4 = PickerRootFragment.W;
                pickerRootFragment.getClass();
                xn50.a.c(pickerRootFragment, (fia0) obj);
                return s3q0.a;
        }
    }
}
