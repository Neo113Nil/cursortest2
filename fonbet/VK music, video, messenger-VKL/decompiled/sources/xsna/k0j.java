package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.account.dto.AccountGetTogglesResponseDto;
import com.vk.api.generated.account.dto.AccountToggleDto;
import com.vk.api.generated.friends.dto.FriendsGetFieldsResponseDto;
import com.vk.auth.enterphone.choosecountry.Country;
import com.vk.catalog2.common.ui.mvp.holder.header.FriendsSearchQueryVh;
import com.vk.draftslist.impl.ui.entity.DraftsListState;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Good;
import com.vk.dto.fave.MarketFavable;
import com.vk.dto.messages.WritePermission;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.ecomm.reviews.api.model.createreview.ProgressInfo;
import com.vk.ecomm.reviews.api.model.createreview.UploadImageModel;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.dialogs.RecommendedFolder;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.ui.fragments.ImSelectDonutContactsFragment;
import com.vk.im.ui.views.ContentErrorView;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.photos.ui.editalbum.domain.a;
import com.vk.search.params.api.VkFeedSearchParams;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.toggle.b;
import com.vk.update.core.AvailabilityState;
import com.vk.update.core.a;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.MarketAttachment;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.hpm;
import xsna.p410;
import xsna.pr20;
import xsna.tj50;
import xsna.ufh0;
import xsna.v1r;
import xsna.z7k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class k0j implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k0j(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        MarketAttachment marketAttachment;
        Good good;
        Good good2;
        List<Attach> list;
        PopupStickerAnimation popupStickerAnimation;
        int i2 = 1;
        switch (this.b) {
            case 0:
                v1j v1jVar = (v1j) obj;
                a2j a2jVar = ((p0j) this.c).i1;
                if (a2jVar != null) {
                    a2jVar.C(v1jVar);
                }
                return s3q0.a;
            case 1:
                gzs<s3q0> gzsVar = ((ContentErrorView) this.c).e;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 2:
                rg50 rg50Var = (rg50) this.c;
                ((Integer) obj).intValue();
                return Integer.valueOf(rg50Var.getIntValue());
            case 3:
                utj utjVar = (utj) this.c;
                Object obj2 = flv0.a;
                flv0.f(utjVar.r);
                return s3q0.a;
            case 4:
                return UploadImageModel.a((UploadImageModel) obj, null, ((z7k.f.a) ((z7k.f) this.c)).c, ProgressInfo.None.b, 51);
            case 5:
                cpk cpkVar = (cpk) this.c;
                io.reactivex.rxjava3.disposables.c cVar = cpkVar.h;
                if (cVar != null) {
                    cVar.dispose();
                }
                cpkVar.h = null;
                return s3q0.a;
            case 6:
                qgi0.i((tgi0) obj, (List) this.c);
                return s3q0.a;
            case 7:
                MsgRequestStatus msgRequestStatus = (MsgRequestStatus) this.c;
                com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj;
                return com.vk.im.engine.models.dialogs.b.a(bVar, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, (msgRequestStatus != null ? hpm.a.$EnumSwitchMapping$0[msgRequestStatus.ordinal()] : -1) == 1 ? new WritePermission(WritePermission.State.ENABLED) : bVar.q, null, false, null, false, null, null, null, false, null, msgRequestStatus, null, null, 0, false, false, null, null, 0, null, 0, -32769, 2097149);
            case 8:
                DraftsListState draftsListState = (DraftsListState) obj;
                return DraftsListState.a(draftsListState, deo.b(((Post) this.c).n, draftsListState.c), null, 0, false, false, 61);
            case 9:
                ((kzo) this.c).b.invoke(a.e.b);
                return s3q0.a;
            case 10:
                ((com.vk.auth.enterphone.a) this.c).C = (Country) obj;
                return s3q0.a;
            case 11:
                nvq nvqVar = (nvq) this.c;
                AccountGetTogglesResponseDto accountGetTogglesResponseDto = (AccountGetTogglesResponseDto) obj;
                int e = accountGetTogglesResponseDto.e();
                List<AccountToggleDto> d = accountGetTogglesResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (AccountToggleDto accountToggleDto : d) {
                    nvqVar.getClass();
                    String e2 = accountToggleDto.e();
                    String f = accountToggleDto.f();
                    if (f == null) {
                        f = "";
                    }
                    arrayList.add(new b.d(e2, f, accountToggleDto.d()));
                }
                return new b.c(e, arrayList);
            case 12:
                VkFeedSearchParams vkFeedSearchParams = (VkFeedSearchParams) this.c;
                xwz xwzVar = (xwz) obj;
                VkFeedSearchParams.SortType sortType = vkFeedSearchParams.b;
                if (sortType != VkFeedSearchParams.d) {
                    int i3 = v1r.a.$EnumSwitchMapping$0[sortType.ordinal()];
                    if (i3 == 1) {
                        i = R.string.search_params_feed_sort_date_description;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R.string.search_params_feed_sort_relevance_description;
                    }
                    xwzVar.getClass();
                    xwzVar.b(xwz.e(i), true);
                }
                if (!vkFeedSearchParams.c) {
                    xwzVar.getClass();
                    xwzVar.b(xwz.e(R.string.search_params_disabled_remove_duplicates_description), true);
                }
                return s3q0.a;
            case 13:
                sxr sxrVar = (sxr) this.c;
                RecommendedFolder recommendedFolder = (RecommendedFolder) j5g.a0((List) obj);
                return recommendedFolder == null ? io.reactivex.rxjava3.core.x.i(new RuntimeException("Cannot load recommended CHANNELS folder")) : sxrVar.a.C(sxrVar, new fqm(recommendedFolder.c, recommendedFolder.d, EmptyList.b));
            case 14:
                fxt0 fxt0Var = (fxt0) this.c;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) fxt0Var.e).setValue(bool);
                return s3q0.a;
            case 15:
                iw3 iw3Var = ((pms) this.c).i;
                uul uulVar = new uul(R.layout.friends_cleanup_delete_all_item, (ViewGroup) obj);
                jjc.g(uulVar.itemView, new nvg(iw3Var, 11));
                return uulVar;
            case 16:
                zqs zqsVar = (zqs) this.c;
                zqsVar.e = ((FriendsGetFieldsResponseDto) obj).d().size() + zqsVar.e;
                return s3q0.a;
            case 17:
                ((FriendsSearchQueryVh) this.c).f.invoke((String) obj);
                return s3q0.a;
            case 18:
                ((rzq0) obj).b(new wow(((c8t) this.c).b), e8t.b);
                return s3q0.a;
            case 19:
                return new s7u((ViewGroup) obj, ((z7u) this.c).i);
            case 20:
                ywu ywuVar = (ywu) this.c;
                if (ywuVar.p.m) {
                    ywuVar.n.P7(a.a0.b);
                }
                return s3q0.a;
            case 21:
                ImSelectDonutContactsFragment imSelectDonutContactsFragment = (ImSelectDonutContactsFragment) this.c;
                View view = imSelectDonutContactsFragment.S;
                if (view == null) {
                    view = null;
                }
                view.animate().translationY((imSelectDonutContactsFragment.S != null ? r3 : null).getMeasuredHeight()).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(150L).setInterpolator(new ilq()).withEndAction(new vk9(imSelectDonutContactsFragment, 4)).start();
                return s3q0.a;
            case 22:
                com.vk.update.core.a aVar = (com.vk.update.core.a) this.c;
                a.C1935a c1935a = (a.C1935a) obj;
                aVar.g.l("on get update event:" + c1935a);
                r5 = c1935a.a.c == AvailabilityState.UPDATE_AVAILABLE;
                aVar.i.invoke(Boolean.valueOf(r5));
                return Boolean.valueOf(r5);
            case 23:
                return new com.vk.search.params.impl.presentation.modal.location.mvi.model.b(tj50.a.b((tj50.a) obj, new qcw(i2), new syz(1, (qyz) this.c, qyz.class, "getLocationAction", "getLocationAction(Lcom/vk/search/params/impl/presentation/modal/location/mvi/model/LocationSearchState$LocationState;)Lcom/vk/search/params/impl/presentation/modal/location/model/LocationSearchCustomAction;", 0)));
            case 24:
                wz00 wz00Var = (wz00) this.c;
                gmq gmqVar = (gmq) obj;
                if (!(gmqVar instanceof MarketFavable) || ((marketAttachment = (MarketAttachment) wz00Var.C) != null && (good2 = marketAttachment.f) != null && ((MarketFavable) gmqVar).b == good2.b)) {
                    return s3q0.a;
                }
                View view2 = wz00Var.M;
                if (view2 != null) {
                    if (marketAttachment != null && (good = marketAttachment.f) != null) {
                        r5 = good.J;
                    }
                    view2.setActivated(r5);
                }
                wz00Var.Y6();
                return s3q0.a;
            case 25:
                ((a410) this.c).T(new p410.f.a((Throwable) obj));
                return s3q0.a;
            case 26:
                f910 f910Var = (f910) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                la10 b = f910Var.b();
                if (b != null) {
                    b.setLoading(booleanValue);
                }
                return s3q0.a;
            case 27:
                return tb20.a((tb20) obj, new ez80(((ez80) this.c).a, true), null, null, null, false, 30);
            case 28:
                sf20 sf20Var = (sf20) this.c;
                oj0 oj0Var = (oj0) obj;
                vm30 vm30Var = sf20Var.o;
                if (vm30Var != null) {
                    ufh0 ufh0Var = oj0Var.d;
                    zfh0 g = vm30Var.g("applyAdapterEntryListState");
                    vm30 vm30Var2 = sf20Var.o;
                    boolean o = vm30Var2 != null ? vm30Var2.o(true) : false;
                    vm30Var.w(oj0Var.a, oj0Var.b, "applyAdapterEntryListState", true);
                    boolean z = ufh0Var instanceof ufh0.f;
                    if (z && g != null) {
                        vm30Var.t(g, oj0Var.c != null, "applyAdapterEntryListState.currentScrollParamsNotNull");
                    } else if (z) {
                        vm30Var.j("applyAdapterEntryListState.currentScrollParamsAreNull");
                    } else {
                        boolean z2 = ufh0Var instanceof ufh0.b;
                        if (z2) {
                            ((ufh0.b) ufh0Var).getClass();
                        }
                        if (z2) {
                            vm30Var.j("applyAdapterEntryListState.ScrollToLatest");
                        } else if ((ufh0Var instanceof ufh0.c) && o) {
                            vm30Var.j("applyAdapterEntryListState.ScrollToLatestIfVisible");
                        } else if (ufh0Var instanceof ufh0.d) {
                            ufh0.d dVar = (ufh0.d) ufh0Var;
                            vm30Var.l(dVar.a, dVar.b, "applyAdapterEntryListState.ScrollToMsg");
                        } else if (ufh0Var instanceof ufh0.e) {
                            vm30Var.m(((ufh0.e) ufh0Var).a, vm30Var.Z, "applyAdapterEntryListState.ScrollToPosition");
                        }
                    }
                    sf20Var.n.getClass();
                    if (oj0Var.f) {
                        Set<Integer> set = oj0Var.g;
                        LinkedHashSet linkedHashSet = sf20Var.x;
                        mb mbVar = sf20Var.w;
                        if (mbVar != null && !set.isEmpty()) {
                            List<Msg> k = ((r920) sf20Var.a.e.b).c().k();
                            int h = e43.h(k);
                            while (true) {
                                if (-1 < h) {
                                    Msg msg = k.get(h);
                                    if (set.contains(Integer.valueOf(msg.b)) && !linkedHashSet.contains(Integer.valueOf(msg.b))) {
                                        MsgFromChannel msgFromChannel = msg instanceof MsgFromChannel ? (MsgFromChannel) msg : null;
                                        if (msgFromChannel != null && (list = msgFromChannel.E) != null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            for (Object obj3 : list) {
                                                if (obj3 instanceof AttachSticker) {
                                                    arrayList2.add(obj3);
                                                }
                                            }
                                            AttachSticker attachSticker = (AttachSticker) j5g.a0(arrayList2);
                                            if (attachSticker != null && attachSticker.g.z9() && (popupStickerAnimation = attachSticker.g.k) != null && popupStickerAnimation.b) {
                                                linkedHashSet.add(Integer.valueOf(msg.b));
                                                mbVar.invoke(attachSticker);
                                            }
                                        }
                                    }
                                    h--;
                                }
                            }
                        }
                    }
                }
                return s3q0.a;
            default:
                pr20 pr20Var = (pr20) this.c;
                if (jyu0.a((iyu0) obj)) {
                    pr20Var.tn();
                } else {
                    cf00 cf00Var = new cf00(pr20Var, 3);
                    ayu0 ayu0Var = pr20Var.j;
                    int i4 = pr20.a.$EnumSwitchMapping$0[ayu0Var.h(pr20Var.requireContext()).ordinal()];
                    if (i4 != 1) {
                        if (i4 == 2) {
                            kxu0 kxu0Var = new kxu0();
                            kxu0Var.a = pr20Var;
                            ayu0Var.c(kxu0Var, cf00Var, new jg0(27));
                        } else if (i4 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (e370.s != null) {
                        kxu0 kxu0Var2 = new kxu0();
                        kxu0Var2.a = pr20Var;
                        ayu0Var.m(kxu0Var2, cf00Var, new wb1(20), RequestedMiniApp.VK_STEPS);
                    } else {
                        kxu0 kxu0Var3 = new kxu0();
                        kxu0Var3.a = pr20Var;
                        ayu0Var.e(kxu0Var3, cf00Var, new dv2(22), RequestedMiniApp.VK_STEPS);
                    }
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ k0j(v1r v1rVar, VkFeedSearchParams vkFeedSearchParams) {
        this.b = 12;
        this.c = vkFeedSearchParams;
    }
}
