package xsna;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.auth.enterpassword.EnterPasswordPresenter;
import com.vk.clips.design.view.hsl.HslRecyclerView;
import com.vk.common.links.LaunchContext;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.internal.data.LaunchForResultInfo;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.debug.ui.dev.DebugDevImageFragment;
import com.vk.donut.design.compose.banner.c;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.g;
import com.vk.editor.filters.correction.entity.HslColorType;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.messages.DraftMsg;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.video.e;
import com.vk.instantjobs.InstantJob;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.photos.ui.editalbum.domain.e;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.superapp.api.dto.account.AccountCheckPasswordResponse;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.ab0;
import xsna.eqh;
import xsna.ewh;
import xsna.f0p;
import xsna.h4n;
import xsna.j0j;
import xsna.t5r;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class t3h implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t3h(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v69, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = 4;
        int i2 = 2;
        nha0 nha0Var = null;
        Object obj2 = null;
        Object[] objArr = 0;
        switch (this.b) {
            case 0:
                d4h d4hVar = (d4h) this.c;
                ewh.a aVar = (ewh.a) obj;
                d3h d3hVar = (d3h) d4hVar.c.invoke();
                UserId userId = d4hVar.m;
                ArrayList arrayList = aVar.c;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((ewh.a.C2838a) it.next()).a));
                }
                String uri = er.a(HttpRequest.DEFAULT_SCHEME).authority(a0a.d).appendPath("service-booking-" + Math.abs(userId.b)).appendPath("repeat-booking").appendQueryParameter("record_id", String.valueOf(aVar.a)).appendQueryParameter("specialist_id", String.valueOf(aVar.b.a)).appendQueryParameter("service_ids", j5g.g0(arrayList2, StringUtils.COMMA, null, null, 0, null, 62)).build().toString();
                Context mo2getContext = d3hVar.a.mo2getContext();
                if (mo2getContext != null) {
                    maz.c(d3hVar.o, mo2getContext, uri, LaunchContext.A, null, null, 24);
                }
                return s3q0.a;
            case 1:
                ((imh) this.c).c.invoke(new CommunityProfileAction.o(false));
                return s3q0.a;
            case 2:
                ((eqh.a) this.c).c = true;
                return s3q0.a;
            case 3:
                com.vk.profile.community.impl.ui.profile.e eVar = (com.vk.profile.community.impl.ui.profile.e) this.c;
                CommunityProfileState communityProfileState = (CommunityProfileState) obj;
                frh frhVar = eVar.l;
                UserId userId2 = eVar.d;
                boolean z = communityProfileState.f;
                boolean z2 = communityProfileState.B;
                frhVar.getClass();
                if (!z) {
                    return z2 ? CommunityProfileViewState.Data.LoadingState.ACTION_LOADING : CommunityProfileViewState.Data.LoadingState.NONE;
                }
                t6g0 t6g0Var = t6g0.b;
                Group C0 = t6g0.b().C0(fkq0.a(userId2));
                boolean z3 = C0 != null ? C0.m0 : false;
                ExtendedUserProfile L0 = t6g0.c().L0(userId2);
                boolean z4 = L0 != null ? L0.J1 : false;
                Context context = e43.a;
                Context context2 = context != null ? context : null;
                HashSet hashSet = iah0.a;
                return (fnj.b(context2) || !(z3 || z4)) ? CommunityProfileViewState.Data.LoadingState.STATIC_COVER : CommunityProfileViewState.Data.LoadingState.LIVE_COVER;
            case 4:
                tj50.a aVar2 = (tj50.a) obj;
                ozh ozhVar = new ozh((com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.f) this.c, objArr == true ? 1 : 0);
                ao8 ao8Var = ao8.d;
                return new g.b(aVar2.a(ozhVar, ao8Var), aVar2.a(new pl2(19), ao8Var));
            case 5:
                ((i1j) this.c).e.invoke(j0j.h.b);
                return s3q0.a;
            case 6:
                int i3 = DebugDevImageFragment.U;
                ((defpackage.h0) this.c).invoke((List) obj);
                return s3q0.a;
            case 7:
                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, DraftMsg.a((DraftMsg) this.c, 63), false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -1048577, 2097151);
            case 8:
                e4n e4nVar = (e4n) this.c;
                if (((x960) obj) instanceof tvf0) {
                    e4nVar.e(h4n.a.C2971a.a);
                }
                return s3q0.a;
            case 9:
                DiscoverMediaTabFragment2 discoverMediaTabFragment2 = (DiscoverMediaTabFragment2) this.c;
                gom0 gom0Var = (gom0) obj;
                qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
                gom0.a(gom0Var, new x90(15), (ewx) discoverMediaTabFragment2.e0.getValue());
                gom0.a(gom0Var, new y90(25), discoverMediaTabFragment2.f0);
                gom0.a(gom0Var, new com.vk.movika.sdk.base.logic.interactor.f(21), new zu3(discoverMediaTabFragment2, 7));
                gom0.a(gom0Var, new l8k(i), discoverMediaTabFragment2.h0);
                gom0.a(gom0Var, new com(i2), discoverMediaTabFragment2.i0);
                return s3q0.a;
            case 10:
                DiscoverSearchFragment discoverSearchFragment = (DiscoverSearchFragment) this.c;
                List<? extends vcr<?>> list = (List) obj;
                int i4 = DiscoverSearchFragment.s0;
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (((vcr) next).c() == 5) {
                            obj2 = next;
                        }
                    }
                }
                vcr vcrVar = (vcr) obj2;
                if (vcrVar == null) {
                    return s3q0.a;
                }
                discoverSearchFragment.io().a(vcrVar);
                mcr<vcr<?>> mcrVar = discoverSearchFragment.d0;
                if (mcrVar != null) {
                    mcrVar.b(list);
                }
                return s3q0.a;
            case 11:
                tgi0 tgi0Var = (tgi0) obj;
                c.b bVar = (c.b) ((swm0) this.c).b;
                String str = bVar.b;
                if (str == null) {
                    str = bVar.a;
                }
                qgi0.h(tgi0Var, str);
                return s3q0.a;
            case 12:
                String str2 = (String) obj;
                return Boolean.valueOf(str2 != null && str2.equals(((MusicTrack) this.c).Fb()));
            case 13:
                f4m.E((VkSimpleButton) ((com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.f) this.c).n.getValue(), ((Boolean) obj).booleanValue());
                return s3q0.a;
            case 14:
                ((com.vk.photos.ui.editalbum.domain.c) this.c).T(new e.j.b((String) obj));
                return s3q0.a;
            case 15:
                MusicTrack musicTrack = (MusicTrack) obj;
                f0p.a aVar3 = ((r0p) this.c).f;
                if (aVar3 != null) {
                    aVar3.Ig(R.id.audio_action, musicTrack);
                }
                return s3q0.a;
            case 16:
                EnterPasswordPresenter enterPasswordPresenter = (EnterPasswordPresenter) this.c;
                AccountCheckPasswordResponse accountCheckPasswordResponse = (AccountCheckPasswordResponse) obj;
                enterPasswordPresenter.B = false;
                AccountCheckPasswordResponse.SecurityLevel securityLevel = accountCheckPasswordResponse.a;
                String str3 = accountCheckPasswordResponse.b;
                int i5 = EnterPasswordPresenter.a.$EnumSwitchMapping$0[securityLevel.ordinal()];
                if (i5 == 1) {
                    yop yopVar = (yop) enterPasswordPresenter.a;
                    if (yopVar != null) {
                        if (str3 == null) {
                            str3 = "";
                        }
                        yopVar.zi(str3);
                    }
                } else if (i5 != 2) {
                    if (i5 == 3) {
                        yop yopVar2 = (yop) enterPasswordPresenter.a;
                        if (yopVar2 != null) {
                            if (str3 == null) {
                                str3 = "";
                            }
                            yopVar2.Zl(str3);
                        }
                    } else {
                        if (i5 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        yop yopVar3 = (yop) enterPasswordPresenter.a;
                        if (yopVar3 != null) {
                            yopVar3.ag();
                        }
                    }
                    yop yopVar4 = (yop) enterPasswordPresenter.a;
                    if (yopVar4 != null) {
                        yopVar4.R6(true);
                    }
                } else {
                    yop yopVar5 = (yop) enterPasswordPresenter.a;
                    if (yopVar5 != null) {
                        if (str3 == null) {
                            str3 = "";
                        }
                        yopVar5.t4(str3);
                    }
                }
                return s3q0.a;
            case 17:
                NewsEntry newsEntry = (NewsEntry) this.c;
                NewsEntry newsEntry2 = ((u1c0) obj).b;
                return Boolean.valueOf((newsEntry2 instanceof DiscoverMediaBlock) && bqp.a((DiscoverMediaBlock) newsEntry2, newsEntry) >= 0);
            case 18:
                ((com.vk.superapp.miniapps.picker.k) this.c).e();
                return s3q0.a;
            case 19:
                s5r s5rVar = ((v5r) this.c).f;
                if (s5rVar != null) {
                    s5rVar.b.onNext(t5r.c.a);
                }
                return s3q0.a;
            case 20:
                return Boolean.valueOf(epx.f(((LaunchForResultInfo) obj).c, ((FragmentEntry) this.c).d));
            case 21:
                ((fhs) this.c).Y();
                return s3q0.a;
            case 22:
                GalleryFragmentImpl galleryFragmentImpl = (GalleryFragmentImpl) this.c;
                hb0<nha0> hb0Var = galleryFragmentImpl.n0;
                if (hb0Var != null) {
                    b470 b470Var = galleryFragmentImpl.o0;
                    if (b470Var != null) {
                        int i6 = b470Var.b.k;
                        nha0Var = oha0.a(i6 != 222 ? i6 != 333 ? ab0.c.a : ab0.f.a : ab0.d.a);
                    }
                    hb0Var.a(nha0Var);
                }
                return s3q0.a;
            case 23:
                iui iuiVar = (iui) obj;
                iuiVar.a = new d6(6, iuiVar.a(new smf0(((vmt) this.c).e, new rr60())), iuiVar.a(new fmt()));
                return s3q0.a;
            case 24:
                fyu fyuVar = (fyu) this.c;
                fyuVar.c.set(false);
                io.reactivex.rxjava3.subjects.d<List<String>> dVar = fyuVar.e;
                List<String> list2 = ((haf) fyuVar.a.b).b;
                if (list2 == null) {
                    list2 = EmptyList.b;
                }
                dVar.onNext(list2);
                return s3q0.a;
            case 25:
                HslColorType hslColorType = (HslColorType) this.c;
                int i7 = HslRecyclerView.e;
                return Boolean.valueOf(((wgv) obj).a == hslColorType);
            case 26:
                ((quv) this.c).i.setAlpha(((Float) obj).floatValue() != 1.0f ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
                return s3q0.a;
            case 27:
                com.vk.im.video.e eVar2 = (com.vk.im.video.e) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                fh5 fh5Var = eVar2.j;
                if (fh5Var == null) {
                    fh5Var = null;
                }
                yg5 yg5Var = fh5Var.j;
                if ((yg5Var != null ? yg5Var : null).p0() && booleanValue && eVar2.H != e.c.ACTIVE) {
                    eVar2.k(true);
                } else if (!booleanValue) {
                    eVar2.k(false);
                }
                return s3q0.a;
            case 28:
                ((qdw) this.c).e((UserId) obj, ImStoryState.SEEN);
                return s3q0.a;
            default:
                return Boolean.valueOf(((InstantJob) obj).equals(((w6x) this.c).d()));
        }
    }

    public /* synthetic */ t3h(bqp bqpVar, NewsEntry newsEntry) {
        this.b = 17;
        this.c = newsEntry;
    }
}
