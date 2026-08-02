package xsna;

import android.graphics.RectF;
import android.view.View;
import androidx.compose.foundation.text.HandleState;
import com.unity3d.ads.core.domain.events.LifecycleEventObserver;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.market.dto.MarketItemLabelActionDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemTypeDto;
import com.vk.api.generated.polls.dto.PollsAnswerDto;
import com.vk.api.generated.polls.dto.PollsPollDto;
import com.vk.api.photos.PhotosGetAlbums;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.content.design.view.photo.flow.PhotoFlowHeaderView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.catalog.impl.catalog.common.ui.holder.infoblock.MarketInfoComposeVh;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.music.informer.mvi.d;
import com.vk.newsfeed.impl.feedback.NewsEntryFeedbackCommentsFragment;
import com.vk.newsfeed.impl.posting.settings.mvi.PostingSettingsFragmentMvi;
import com.vk.newsfeed.impl.posting.settings.mvi.a;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.PostingStep;
import com.vk.newsfeed.posting.impl.presentation.model.PollAnswerDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.search.models.VkRelation;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.search.params.api.domain.model.education.EducationParam;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.cnd;
import xsna.gcw;
import xsna.gv90;
import xsna.h5v;
import xsna.isc0;
import xsna.kx30;
import xsna.lka0;
import xsna.pnb0;
import xsna.puy.a;
import xsna.qr60;
import xsna.wqs0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class bzw implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bzw(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        s3q0 invoke$lambda$1;
        long a;
        Object[] objArr = 0;
        switch (this.b) {
            case 0:
                ((dzw) this.c).b.invoke(new qr60.a.d(true));
                return s3q0.a;
            case 1:
                puy puyVar = (puy) this.c;
                int intValue = ((Integer) obj).intValue();
                androidx.compose.foundation.lazy.layout.b invoke = puyVar.p.invoke();
                if (intValue < 0 || intValue >= invoke.getItemCount()) {
                    StringBuilder b = ji.b(intValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    b.append(invoke.getItemCount());
                    b.append(')');
                    xzw.a(b.toString());
                }
                myc0.h(puyVar.W1(), null, null, puyVar.new a(intValue, null), 3);
                return Boolean.TRUE;
            case 2:
                j1z j1zVar = (j1z) this.c;
                wh50 wh50Var = j1zVar.t;
                tho0 tho0Var = (tho0) obj;
                String str = tho0Var.a.c;
                us2 us2Var = j1zVar.j;
                if (!epx.f(str, us2Var != null ? us2Var.c : null)) {
                    ((zak0) j1zVar.k).setValue(HandleState.None);
                    if (((Boolean) ((zak0) wh50Var).getValue()).booleanValue()) {
                        ((zak0) wh50Var).setValue(Boolean.FALSE);
                    } else {
                        ((zak0) j1zVar.s).setValue(Boolean.FALSE);
                    }
                }
                long j = qko0.b;
                j1zVar.f(j);
                j1zVar.e(j);
                j1zVar.u.invoke(tho0Var);
                j1zVar.b.invalidate();
                return s3q0.a;
            case 3:
                invoke$lambda$1 = LifecycleEventObserver.invoke$lambda$1((LifecycleEventObserver) this.c, (Throwable) obj);
                return invoke$lambda$1;
            case 4:
                ((tdu) obj).b(((gmd) this.c).e instanceof cnd.a ? 1.0f : 0.64f);
                return s3q0.a;
            case 5:
                ((MarketInfoComposeVh) this.c).b.j(new su00((MarketItemLabelActionDto) obj));
                return s3q0.a;
            case 6:
                tlo0 tlo0Var = (tlo0) obj;
                VkTopBar vkTopBar = ((f910) this.c).g;
                if (vkTopBar != null) {
                    vkTopBar.setMiddle(f910.c(tlo0Var));
                }
                return s3q0.a;
            case 7:
                sf20 sf20Var = (sf20) this.c;
                h5v h5vVar = (h5v) obj;
                if (!(h5vVar instanceof h5v.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                h5v.a aVar = (h5v.a) h5vVar;
                sf20Var.a(aVar.a, aVar.b, aVar.c);
                return s3q0.a;
            case 8:
                tw30 tw30Var = (tw30) this.c;
                kx30.a aVar2 = (kx30.a) obj;
                List<zpp<Dialog>> list = aVar2.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((Boolean) tw30Var.b.invoke(((zpp) obj2).a)).booleanValue()) {
                        arrayList.add(obj2);
                    }
                }
                List<zpp<Dialog>> list2 = aVar2.a;
                HashMap hashMap = new HashMap(list2.size());
                for (zpp<Dialog> zppVar : list2) {
                    hashMap.put(zppVar.a.Sb(), (Boolean) tw30Var.c.invoke(zppVar.a));
                }
                return new gcw.c(arrayList, hashMap, aVar2.d, null);
            case 9:
                com.vk.music.informer.mvi.d dVar = (com.vk.music.informer.mvi.d) this.c;
                lt3 lt3Var = (lt3) obj;
                dVar.o = false;
                d.c cVar = dVar.k;
                d.b a2 = d.b.a(cVar.b, null, false, false, false, false, false, 60);
                cVar.b = a2;
                lt3 lt3Var2 = a2.a;
                if (lt3Var2 != null && a2.b && a2.c && !a2.d && a2.e && !a2.f) {
                    cVar.a.invoke(lt3Var2);
                }
                dVar.m.b(ny40.a(dVar.h, lt3Var, 6).subscribe(new b8v(new kn20(dVar, 7), 9), new k130(new eiz(dVar, 15), 6)));
                return s3q0.a;
            case 10:
                j650 j650Var = (j650) this.c;
                View view = j650Var.f;
                e650 e650Var = j650Var.g;
                List<? extends hfz> list3 = e650Var.h;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list3) {
                    if (obj3 instanceof pck0) {
                        arrayList2.add(obj3);
                    }
                }
                if (arrayList2.isEmpty()) {
                    view.setVisibility(0);
                    f4m.j(j650Var.e);
                } else {
                    f4m.j(view);
                    e650Var.setItems(j5g.v0(qck0.b, j5g.T(1, e650Var.h)));
                }
                return s3q0.a;
            case 11:
                return Boolean.valueOf(epx.f(((x060) obj).b, (ic30) this.c));
            case 12:
                int i = NewsEntryFeedbackCommentsFragment.f1;
                return (RectF) ((pj1) this.c).invoke((View) obj);
            case 13:
                BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) obj;
                ((NewsEntry) this.c).d = true;
                return new tl60(baseBoolIntDto == BaseBoolIntDto.YES, NewsfeedNewsfeedItemTypeDto.CLIP, 62);
            case 14:
                ((rtg0) this.c).invoke(Boolean.FALSE);
                return s3q0.a;
            case 15:
                qm70 qm70Var = (qm70) obj;
                List list4 = (List) this.c;
                if (list4.isEmpty()) {
                    list4 = Collections.singletonList(xz80.b);
                }
                return new qm70(qm70Var.a, qm70Var.b, qm70Var.c, list4);
            case 16:
                return (pw80) this.c;
            case 17:
                VkPeopleSearchParams vkPeopleSearchParams = (VkPeopleSearchParams) this.c;
                xwz xwzVar = (xwz) obj;
                b920.l(xwzVar, vkPeopleSearchParams);
                int i2 = vkPeopleSearchParams.c;
                if (i2 != 0) {
                    int i3 = i2 == 2 ? R.string.vk_discover_search_gender_male : R.string.vk_discover_search_gender_female;
                    xwzVar.getClass();
                    xwzVar.b(xwz.e(i3), true);
                }
                if (vkPeopleSearchParams.d != 0 || vkPeopleSearchParams.e != 0) {
                    xwzVar.b(kn4.k(new fv90(vkPeopleSearchParams, objArr == true ? 1 : 0)), true);
                }
                EducationParam educationParam = vkPeopleSearchParams.g;
                if (educationParam != null) {
                    xwzVar.b(new exz(educationParam.b.getTitle()), false);
                }
                String str2 = vkPeopleSearchParams.h;
                if (str2 != null) {
                    xwzVar.b(new exz(str2), false);
                }
                VkRelation vkRelation = vkPeopleSearchParams.f;
                if (vkRelation != VkPeopleSearchParams.i) {
                    xwzVar.b(new dxz(vkRelation, new gv90.a(vkPeopleSearchParams.c == 2)), true);
                }
                return s3q0.a;
            case 18:
                PhotoFlowHeaderView.a aVar3 = ((PhotoFlowHeaderView) this.c).y;
                if (aVar3 != null) {
                    aVar3.b();
                }
                return s3q0.a;
            case 19:
                eka0 eka0Var = (eka0) this.c;
                lka0.a aVar4 = lka0.a.a;
                if (eka0Var.q) {
                    eka0Var.o.onNext(aVar4);
                }
                return s3q0.a;
            case 20:
                return VideoLargeListState.a((VideoLargeListState) obj, null, false, false, null, null, ((wqs0.l.c) ((wqs0.l) this.c)).c, false, null, null, null, null, null, null, null, null, null, null, null, 0, 67104767);
            case 21:
                m4b0 m4b0Var = (m4b0) this.c;
                Long l = (Long) obj;
                l.longValue();
                m4b0Var.r.onNext(l);
                return s3q0.a;
            case 22:
                job0 job0Var = (job0) this.c;
                PollsPollDto pollsPollDto = (PollsPollDto) obj;
                int id = pollsPollDto.getId();
                UserId q = pollsPollDto.q();
                String F = pollsPollDto.F();
                List<PollsAnswerDto> f = pollsPollDto.f();
                ArrayList arrayList3 = new ArrayList(c5g.u(f, 10));
                for (PollsAnswerDto pollsAnswerDto : f) {
                    arrayList3.add(new PollAnswerDto(pollsAnswerDto.d(), pollsAnswerDto.f()));
                }
                boolean f2 = epx.f(pollsPollDto.d(), Boolean.TRUE);
                boolean C = pollsPollDto.C();
                boolean p = pollsPollDto.p();
                boolean z = ((long) pollsPollDto.u()) > 0;
                if (pollsPollDto.u() > 0) {
                    a = TimeUnit.SECONDS.toMillis(pollsPollDto.u());
                } else {
                    xuo0.a.getClass();
                    a = xuo0.a() + TimeUnit.HOURS.toMillis(24L);
                }
                job0Var.a.b(new pnb0.a.C3521a(new PostingPollDto(id, q, F, arrayList3, f2, C, p, z, a, false, false, 1536, null)));
                return s3q0.a;
            case 23:
                vpc0 vpc0Var = ((qkc0) this.c).d;
                List<PostingStep> list5 = edi.t(((PostingState.Editing) obj).g).e;
                vpc0Var.getClass();
                return vpc0.a(list5);
            case 24:
                PostingSettingsFragmentMvi postingSettingsFragmentMvi = (PostingSettingsFragmentMvi) this.c;
                int i4 = PostingSettingsFragmentMvi.Y;
                xn50.a.c(postingSettingsFragmentMvi, a.c.b);
                return s3q0.a;
            case 25:
                ((isc0.a) this.c).a();
                return s3q0.a;
            case 26:
                ((gyd0) ((kyd0) this.c).c).P((PhotosGetAlbums.a) obj);
                return s3q0.a;
            case 27:
                ((joe0) this.c).tn();
                return s3q0.a;
            case 28:
                cse0 cse0Var = (cse0) this.c;
                zwm0 zwm0Var = (zwm0) obj;
                synchronized (cse0Var.g) {
                    cse0Var.n.remove(zwm0Var);
                }
                return s3q0.a;
            default:
                i5f0 i5f0Var = (i5f0) obj;
                return new l4f0(new qr60.a.g(i5f0Var.a, i5f0Var.b, i5f0Var.d, true, false, null, (a9q0) this.c, 32));
        }
    }

    public /* synthetic */ bzw(gv90 gv90Var, VkPeopleSearchParams vkPeopleSearchParams) {
        this.b = 17;
        this.c = vkPeopleSearchParams;
    }
}
