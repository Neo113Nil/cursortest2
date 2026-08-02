package xsna;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.catalog.mvi.block.impl.filters.HorizontalFiltersWithScrollView;
import com.vk.catalog.mvi.block.impl.filters.HorizontalFiltersWithScrollView.e.a;
import com.vk.clips.design.view.filter.FiltersRecyclerView;
import com.vk.clips.sdk.shared.item.common.description.c;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Source;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.ecomm.catalog.impl.catalog.simple.b;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.editor.filters.correction.model.FilterType;
import com.vk.friends.impl.cleanup.presentation.fragment.FriendsCleanupFragment;
import com.vk.newsfeed.posting.impl.domain.request.ParsedAttachment;
import com.vk.permission.PermissionHelper;
import com.vk.profile.community.details.impl.contacts.CommunityAddContactsState;
import com.vk.profile.community.details.impl.contacts.c;
import com.vk.profile.community.details.impl.contacts.d;
import com.vk.profile.community.details.impl.contacts.f;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.registration.funnels.RegistrationElementsTracker;
import com.vk.registration.funnels.TrackingElement;
import com.vk.voip.ui.sessionrooms.dialog.model.SessionRoomParticipantModel;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.b6l0;
import xsna.bfz;
import xsna.g120;
import xsna.hzg;
import xsna.j0j;
import xsna.m6w;
import xsna.nls;
import xsna.tj50;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class wpg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wpg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v77, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r11v80, types: [android.view.View] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        io.reactivex.rxjava3.disposables.c cVar;
        Object obj2;
        r2 = null;
        Integer num = null;
        switch (this.b) {
            case 0:
                Throwable th = (Throwable) obj;
                com.vk.profile.community.details.impl.contacts.g gVar = ((com.vk.profile.community.details.impl.contacts.c) this.c).h;
                c.b bVar = gVar.b;
                c.a aVar = gVar.a;
                if (th instanceof VKApiExecutionException) {
                    VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                    if (vKApiExecutionException.s() == 100) {
                        String u = vKApiExecutionException.u();
                        if (u != null && drm0.D(u, "phone", false)) {
                            aVar.invoke(new d.b(CommunityAddContactsState.ContactField.ContactViewType.PHONE, new CommunityAddContactsState.ContactField.b.C1552b(R.string.community_add_contacts_bs_phone_error)));
                        }
                        String u2 = vKApiExecutionException.u();
                        if (u2 != null && drm0.D(u2, "city", false)) {
                            aVar.invoke(new d.b(CommunityAddContactsState.ContactField.ContactViewType.CITY, new CommunityAddContactsState.ContactField.b.C1552b(R.string.community_add_contacts_bs_city_error)));
                        }
                    } else {
                        bVar.invoke(new f.c(th));
                    }
                } else {
                    bVar.invoke(new f.c(th));
                }
                return s3q0.a;
            case 1:
                tj50.a aVar2 = (tj50.a) obj;
                int i = 13;
                g54 g54Var = new g54((ezg) this.c, i);
                ao8 ao8Var = ao8.d;
                return new hzg.a(aVar2.a(g54Var, ao8Var), aVar2.a(new com.vk.movika.sdk.base.observable.s(20), ao8Var), aVar2.a(new p60(17), ao8Var), aVar2.a(new com.vk.movika.sdk.base.observable.u(16), ao8Var), aVar2.a(new rd1(9), ao8Var), aVar2.a(dzg.b, ao8Var), aVar2.a(new y8(i), ao8Var));
            case 2:
                d4h d4hVar = (d4h) this.c;
                pug pugVar = (pug) obj;
                ((d3h) d4hVar.c.invoke()).k(d4hVar.m, pugVar.b, pugVar.c, pugVar.a);
                return s3q0.a;
            case 3:
                ((flh) this.c).n.invoke();
                return s3q0.a;
            case 4:
                ((com.vk.profile.community.impl.ui.profile.a) this.c).C(new CommunityProfileAction.s(new t8q0(false)));
                return s3q0.a;
            case 5:
                c1j c1jVar = (c1j) this.c;
                x0j x0jVar = c1jVar.t;
                if (x0jVar != null) {
                    SessionRoomParticipantModel sessionRoomParticipantModel = x0jVar.d;
                    if (!sessionRoomParticipantModel.d && sessionRoomParticipantModel.h && x0jVar.c) {
                        c1jVar.l.invoke(new j0j.k(sessionRoomParticipantModel.a, false));
                    }
                }
                return s3q0.a;
            case 6:
                ((gho0) this.c).t();
                return s3q0.a;
            case 7:
                ((com.vk.clips.sdk.shared.item.common.description.b) this.c).c.g(new c.e((String) obj));
                return s3q0.a;
            case 8:
                iui iuiVar = (iui) obj;
                iuiVar.a = new og5(iuiVar.a(new c4n(new j4n(), ((a5n) this.c).m, new rr60())), iuiVar.a(new l2n()), iuiVar.a(new q2n()), 2);
                return s3q0.a;
            case 9:
                wio wioVar = (wio) this.c;
                y8g y8gVar = ((jzp0) obj).a;
                RecyclerView recyclerView = wioVar.l;
                if (recyclerView != null) {
                    Iterator<jzp0> it = wioVar.A.getCurrentList().iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                        } else if (!epx.f(y8gVar, it.next().a)) {
                            i2++;
                        }
                    }
                    lkf0.d(recyclerView, i2 + 1);
                }
                iio iioVar = wioVar.e.c;
                (iioVar != null ? iioVar : null).a(new uho(y8gVar.a(), false));
                return s3q0.a;
            case 10:
                cop copVar = (cop) ((vop) this.c).a;
                if (copVar != null) {
                    copVar.ud();
                }
                return s3q0.a;
            case 11:
                opp oppVar = (opp) this.c;
                kpp kppVar = opp.T;
                RegistrationElementsTracker registrationElementsTracker = RegistrationElementsTracker.a;
                RegistrationElementsTracker.a.a(TrackingElement.Registration.PHOTO, null);
                Object obj3 = oppVar.o;
                ((hpp) (obj3 != null ? obj3 : null)).m(oppVar);
                return s3q0.a;
            case 12:
                FiltersRecyclerView filtersRecyclerView = (FiltersRecyclerView) this.c;
                Pair pair = (Pair) obj;
                int i3 = FiltersRecyclerView.j;
                filtersRecyclerView.i.H0(new xcd((FilterType) pair.d(), 21), new uoh((Bitmap) pair.g(), 14));
                return s3q0.a;
            case 13:
                Set set = (Set) this.c;
                Iterable iterable = (List) ((xpp) obj).a();
                if (iterable == null) {
                    iterable = EmptyList.b;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : iterable) {
                    if (set.contains(Integer.valueOf(((rpm) obj4).a))) {
                        arrayList.add(obj4);
                    }
                }
                return arrayList;
            case 14:
                ((gls) this.c).j.b(new nls.a((Throwable) obj));
                return s3q0.a;
            case 15:
                FriendsCleanupFragment friendsCleanupFragment = (FriendsCleanupFragment) this.c;
                int intValue = ((Integer) obj).intValue();
                pms pmsVar = friendsCleanupFragment.R;
                return Boolean.valueOf((pmsVar != null ? pmsVar : null).h.get(intValue) instanceof bns);
            case 16:
                fws fwsVar = (fws) this.c;
                g4l0 g4l0Var = (g4l0) obj;
                if (g4l0Var instanceof s1l0) {
                    t6g0 t6g0Var = t6g0.b;
                    StickerStockItem I = t6g0.d().I(((s1l0) g4l0Var).a);
                    if (I == null) {
                        return s3q0.a;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    gws gwsVar = fwsVar.a;
                    for (StickerItem stickerItem : gwsVar.c) {
                        List<StickerItem> list = I.g;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (((StickerItem) it2.next()).b == stickerItem.b) {
                                    b6l0.a aVar3 = gwsVar.d;
                                    if (aVar3 != null) {
                                        aVar3.b.add(0, stickerItem);
                                    }
                                }
                            }
                        }
                        arrayList2.add(stickerItem);
                    }
                    gwsVar.c = arrayList2;
                    fwsVar.n.onNext(s3q0.a);
                }
                return s3q0.a;
            case 17:
                GalleryFragmentImpl galleryFragmentImpl = (GalleryFragmentImpl) this.c;
                int i4 = GalleryFragmentImpl.R0;
                ArrayList arrayList3 = ((gy90) obj).a;
                PermissionHelper.a.getClass();
                if (arrayList3.containsAll(rl3.u0(PermissionHelper.c))) {
                    galleryFragmentImpl.io();
                }
                return s3q0.a;
            case 18:
                fgu fguVar = (fgu) this.c;
                if (((Boolean) obj).booleanValue()) {
                    ?? r11 = fguVar.itemView;
                    ViewGroup.LayoutParams layoutParams = r11.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = cn70.b(0);
                    r11.setLayoutParams(marginLayoutParams);
                } else {
                    ?? r112 = fguVar.itemView;
                    ViewGroup.LayoutParams layoutParams2 = r112.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.bottomMargin = (!fguVar.s.getState().b || ((zzz) fguVar.l.a).isHorizontal()) ? cn70.b(0) : fgu.v;
                    r112.setLayoutParams(marginLayoutParams2);
                }
                return s3q0.a;
            case 19:
                dwj dwjVar = (dwj) obj;
                return dwjVar.m(myc0.h(dwjVar.getScope(), null, null, ((HorizontalFiltersWithScrollView.e) this.c).new a(null), 3));
            case 20:
                ((d7w) this.c).e(new m6w.d((i8w) obj));
                return s3q0.a;
            case 21:
                drx drxVar = (drx) this.c;
                drxVar.i.f();
                tlo0.a aVar4 = tlo0.Companion;
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "";
                }
                aVar4.getClass();
                drxVar.Y(new tlo0.h(message));
                return s3q0.a;
            case 22:
                dfz dfzVar = (dfz) this.c;
                bfz.a aVar5 = (bfz.a) obj;
                if ((dfzVar.c instanceof bfz.a.C2608a) && !(aVar5 instanceof bfz.a.C2608a) && (cVar = dfzVar.f) != null) {
                    cVar.dispose();
                }
                return s3q0.a;
            case 23:
                cmz cmzVar = (cmz) this.c;
                bwt0.p0(cmzVar.d, false);
                bwt0.p0(cmzVar.e, false);
                cmzVar.i.setItems(EmptyList.b);
                bwt0.p0(cmzVar.f, false);
                bwt0.p0(cmzVar.g, true);
                return s3q0.a;
            case 24:
                ((com.vk.ecomm.reviews.impl.allreviews.presentation.b) this.c).T(new c.g((Throwable) obj));
                return s3q0.a;
            case 25:
                tlo0 tlo0Var = (tlo0) obj;
                TextView textView = ((MarketItemReviewsFragment) this.c).o0;
                ey2.h(textView != null ? textView : null, tlo0Var);
                return s3q0.a;
            case 26:
                f910 f910Var = (f910) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                la10 a = f910Var.a();
                if (a != null) {
                    a.L0(1, booleanValue);
                }
                return s3q0.a;
            case 27:
                b.C0929b c0929b = (b.C0929b) this.c;
                yfc yfcVar = c0929b.a;
                String string = yfcVar != null ? yfcVar.a.getString("KEY_CATALOG_CONTEXT") : null;
                List<Pair<String, Integer>> list2 = c0929b.b;
                if (list2 != null) {
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj2 = it3.next();
                            if (epx.f(((Pair) obj2).i(), string)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    Pair pair2 = (Pair) obj2;
                    if (pair2 != null) {
                        num = (Integer) pair2.j();
                    }
                }
                wzs<String, Integer, s3q0> wzsVar = c0929b.d;
                if (wzsVar != null) {
                    wzsVar.invoke(string, num);
                }
                return s3q0.a;
            case 28:
                return Boolean.valueOf(epx.f(((ParsedAttachment) obj).b, (Attachment) this.c));
            default:
                g120 g120Var = (g120) this.c;
                g120.a aVar6 = (g120.a) obj;
                io.reactivex.rxjava3.internal.operators.single.c C = g120Var.g.C(g120Var, new zdm(aVar6.a, aVar6.b, aVar6.c ? Source.CACHE : Source.NETWORK));
                asu0 asu0Var = asu0.a;
                int i5 = 27;
                g120Var.m.b(C.q(asu0Var.c()).m(asu0Var.d()).subscribe(new v8(new cww(g120Var, 8), i5), new amt(new rd1(i5), 6)));
                return s3q0.a;
        }
    }
}
