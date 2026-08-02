package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.groups.dto.GroupsBanInfoDto;
import com.vk.api.generated.groups.dto.GroupsGetBannedResponseDto;
import com.vk.api.generated.groups.dto.GroupsOwnerXtrBanInfoDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.auth.entername.EnterProfilePresenter;
import com.vk.catalog2.common.ui.holders.ErrorStateVh;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.group.GroupVh;
import com.vk.clips.playlists.ui.picker.c;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.photo.editor.markup.view.tools.BrushesPanel;
import com.vk.profile.community.impl.ui.events.CommunityEventsState;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.user.impl.ui.b;
import com.vk.search.discover.query.SearchQueryValueHelper;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.search.ui.api.SearchQuery;
import com.vk.superapp.core.api.models.VkGender;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import xsna.acx;
import xsna.ddz;
import xsna.gm50;
import xsna.kve;
import xsna.l3s;
import xsna.niu;
import xsna.nsz;
import xsna.ocx;
import xsna.qn60;
import xsna.qr60;
import xsna.s1r0;
import xsna.tj50;
import xsna.w1m0;
import xsna.wpa0;
import xsna.xyj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class qqe implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qqe(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        io.reactivex.rxjava3.core.x K;
        int i2 = this.b;
        int i3 = 16;
        String string = null;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                Pair pair = (Pair) obj;
                ((com.vk.clips.playlists.ui.picker.b) obj2).T(new c.b.e((e8b0) pair.d(), (xpe) pair.g()));
                return s3q0.a;
            case 1:
                tj50.a aVar = (tj50.a) obj;
                ((hve) ((dve) obj2).d.getValue()).getClass();
                gve gveVar = new gve();
                ao8 ao8Var = ao8.d;
                return new kve.a.b(aVar.a(gveVar, ao8Var), aVar.a(new sd4(12), ao8Var), aVar.a(new xr0(i3), ao8Var), aVar.a(new z13(7), ao8Var), aVar.a(new od3(13), ao8Var));
            case 2:
                com.vk.profile.community.impl.ui.events.e eVar = (com.vk.profile.community.impl.ui.events.e) obj2;
                return ((awg0) obj).g(com.vk.profile.community.impl.ui.events.f.a((com.vk.profile.community.impl.ui.events.f) eVar.c.getValue(), ((CommunityEventsState) eVar.b.getCurrentState()).b, 0, 6), new defpackage.i0(eVar, i3), new pm1(eVar, 11));
            case 3:
                ((s5h) obj2).A6(false);
                return s3q0.a;
            case 4:
                ush ushVar = (ush) obj2;
                it80 it80Var = (it80) obj;
                CharSequence charSequence = (CharSequence) it80Var.a;
                if (charSequence != null && charSequence.length() != 0) {
                    ushVar.f.invoke(new d.n.c.b.e((String) it80Var.a));
                }
                return s3q0.a;
            case 5:
                ((com.vk.profile.community.impl.ui.profile.f) obj2).D.c = ((Boolean) obj).booleanValue();
                return s3q0.a;
            case 6:
                ((lzj) obj2).a.invoke(new xyj.b.C4054b((String) obj));
                return s3q0.a;
            case 7:
                ((lak) obj2).z.setEnabled(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 8:
                ViewStub viewStub = (ViewStub) obj;
                ((rw30) obj2).D0(viewStub.getContext(), null, viewStub, null);
                return s3q0.a;
            case 9:
                int i4 = DiscoverSearchFragment.s0;
                SearchQueryValueHelper.e(((DiscoverSearchFragment) obj2).n0, new SearchQuery(((oru0) obj).a, SearchInputMethod.Suggest, null, null, 12, null));
                return s3q0.a;
            case 10:
                ((han) obj2).c((VideoMinimizableState) obj);
                return s3q0.a;
            case 11:
                dxn dxnVar = (dxn) obj2;
                pwn pwnVar = (pwn) ((it80) obj).a;
                if (pwnVar != null) {
                    izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = dxnVar.e;
                    (izsVar != null ? izsVar : null).invoke(new b.f.c(pwnVar));
                    dxnVar.g.a.set(false);
                } else {
                    izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar2 = dxnVar.e;
                    (izsVar2 != null ? izsVar2 : null).invoke(b.f.C1709b.b);
                }
                return s3q0.a;
            case 12:
                djo djoVar = (djo) obj2;
                y8g y8gVar = ((jzp0) obj).a;
                RecyclerView recyclerView = djoVar.m;
                if (recyclerView != null) {
                    Iterator<jzp0> it = djoVar.o.getCurrentList().iterator();
                    int i5 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i5 = -1;
                        } else if (!epx.f(y8gVar, it.next().a)) {
                            i5++;
                        }
                    }
                    lkf0.d(recyclerView, i5 + 1);
                }
                int a = y8gVar.a();
                w1m0.a aVar2 = djoVar.G;
                aVar2.g = false;
                aVar2.f = a;
                djoVar.C.setColor(a);
                djoVar.t(new wpa0.b(false));
                djoVar.s(a);
                djoVar.r(a);
                BrushesPanel.BrushType brushType = djoVar.G.e;
                BrushesPanel brushesPanel = djoVar.y;
                if (brushesPanel != null) {
                    brushesPanel.setCurrentBrush(brushType);
                }
                BrushesPanel brushesPanel2 = djoVar.y;
                if (brushesPanel2 != null) {
                    brushesPanel2.setCurrentColor(a);
                }
                djoVar.q();
                return s3q0.a;
            case 13:
                lvo lvoVar = (lvo) obj2;
                if (lvoVar.a.getLifecycle().getCurrentState().a(Lifecycle.State.STARTED)) {
                    lvoVar.a();
                } else {
                    lvoVar.e = true;
                }
                return s3q0.a;
            case 14:
                gzs<s3q0> gzsVar = ((s3p) obj2).g;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 15:
                EnterProfilePresenter enterProfilePresenter = (EnterProfilePresenter) obj2;
                VkGender vkGender = (VkGender) obj;
                if (!enterProfilePresenter.C) {
                    enterProfilePresenter.B = true;
                    enterProfilePresenter.A0(com.vk.auth.entername.a.b(enterProfilePresenter.A, null, null, null, vkGender, null, 23));
                }
                return s3q0.a;
            case 16:
                ErrorStateVh errorStateVh = (ErrorStateVh) obj2;
                CatalogStatesViewHolder catalogStatesViewHolder = errorStateVh.b;
                if (catalogStatesViewHolder.getState().a()) {
                    errorStateVh.c.invoke();
                    catalogStatesViewHolder.i8(ltz.a);
                }
                return s3q0.a;
            case 17:
                return v0r.p((v0r) obj2, (Context) obj, "Иван", "Очень длинный текст😀😄😁 комментария, который не помещается в одну строку и должен перенестись на следующую строку для проверки многострочного режима", false, 16);
            case 18:
                ((q7r) obj2).r0.a();
                return s3q0.a;
            case 19:
                return new azr((ViewGroup) obj, ((a0s) obj2).h);
            case 20:
                ((h3s) obj2).T(new l3s.e.a((Throwable) obj));
                return s3q0.a;
            case 21:
                evs evsVar = (evs) obj2;
                c4u0 c4u0Var = evsVar.E;
                ocx.e eVar2 = evsVar.l.m;
                ocx.e.a aVar3 = ocx.e.a.a;
                if (epx.f(eVar2, aVar3)) {
                    evsVar.a(acx.p.a);
                } else {
                    r6p0 r6p0Var = bwt0.K(c4u0Var.o) ? evsVar.K : null;
                    if (r6p0Var != null) {
                        ocx.e eVar3 = evsVar.l.m;
                        VkImageSimple vkImageSimple = c4u0Var.e;
                        fp5 fp5Var = (fp5) r6p0Var.f.getValue();
                        fp5Var.getClass();
                        if (!eVar3.equals(aVar3)) {
                            if (eVar3.equals(ocx.e.b.a)) {
                                i = R.string.interactive_already_playing;
                            } else if (eVar3.equals(ocx.e.d.a)) {
                                i = R.string.chapter_has_not_interactive;
                            } else {
                                if (!eVar3.equals(ocx.e.c.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i = R.string.events_completed;
                            }
                            string = fp5Var.a.getString(i);
                        }
                        String str = string;
                        if (str == null) {
                            L l = L.a;
                            l.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l, L.LogType.w, new Object[]{"Can not resolve text for " + eVar3 + ". Skip!"});
                            }
                        } else {
                            r6p0.d(r6p0Var, str, bwt0.C(vkImageSimple), vkImageSimple, 8388613, cn70.b(4), 200);
                        }
                    }
                }
                return s3q0.a;
            case 22:
                bmt bmtVar = bmt.this;
                vmt vmtVar = bmtVar.f;
                Object b = io.reactivex.rxjava3.internal.operators.mixed.n.b(vmtVar.b.f(new txf0(), new kjj0(vmtVar.c)));
                if (!(b instanceof Result.Failure)) {
                    qn60.c cVar = (qn60.c) b;
                    bmtVar.b.e(new cmt(new qr60.a.c(cVar.a, cVar.b, false, null, 24)));
                }
                Throwable a2 = Result.a(b);
                if (a2 != null) {
                    com.vk.metrics.eventtracking.b.a.a(a2);
                }
                return s3q0.a;
            case 23:
                ((piu) obj2).b.b.b.onNext(niu.b.a);
                return s3q0.a;
            case 24:
                ((GroupVh) obj2).onClick((View) obj);
                return s3q0.a;
            case 25:
                qpu qpuVar = (qpu) obj2;
                List<GroupsOwnerXtrBanInfoDto> d = ((GroupsGetBannedResponseDto) obj).d();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it2 = d.iterator();
                while (it2.hasNext()) {
                    GroupsBanInfoDto d2 = ((GroupsOwnerXtrBanInfoDto) it2.next()).d();
                    Integer d3 = d2 != null ? d2.d() : null;
                    if (d3 != null) {
                        arrayList.add(d3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new UserId(((Number) it3.next()).intValue()));
                }
                if (arrayList2.isEmpty()) {
                    K = io.reactivex.rxjava3.core.x.k(EmptyList.b);
                } else {
                    List<UsersFieldsDto> list = qpuVar.b;
                    if ((1 & 58) != 0) {
                        arrayList2 = null;
                    }
                    if ((4 & 58) != 0) {
                        list = null;
                    }
                    K = rsg0.y0(yfb.x(s1r0.a.b(arrayList2, null, list, null, null)), null, null, 3).K();
                }
                return K.l(new com.vk.movika.sdk.base.ui.j(new iie(qpuVar, d), 20));
            case 26:
                sxu sxuVar = ((zxu) obj2).j;
                if (sxuVar != null) {
                    sxuVar.o();
                }
                return s3q0.a;
            case 27:
                l4w l4wVar = (l4w) obj2;
                j4w j4wVar = l4wVar.K;
                if (j4wVar == null) {
                    j4wVar = null;
                }
                if (!j4wVar.s()) {
                    fh5 fh5Var = l4wVar.A;
                    (fh5Var != null ? fh5Var : null).u0();
                }
                return s3q0.a;
            case 28:
                ((i330) obj2).b((ddz.a) obj);
                return s3q0.a;
            default:
                krz krzVar = (krz) obj2;
                gm50.a.a(krzVar, ((nsz.a) obj).a, new lrk(krzVar, 26));
                return s3q0.a;
        }
    }
}
