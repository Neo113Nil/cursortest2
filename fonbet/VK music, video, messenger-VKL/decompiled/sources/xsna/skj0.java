package xsna;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.LruCache;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.external.VkExternalAuthFragment;
import com.vk.auth.personalaccount.VkPersonalAccountRouter;
import com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicBaseVkMixInteractiveVh;
import com.vk.common.links.LaunchContext;
import com.vk.common.view.BottomSheetWebView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.ProfileEditPage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickersPromoModel;
import com.vk.dto.stories.model.DiscoverStoriesContainer;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.stories.model.StubAddStoriesContainer;
import com.vk.dto.user.UserProfile;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.log.L;
import com.vk.profile.user.impl.domain.edit.models.ExternalEvent;
import com.vk.profile.user.impl.ui.edit.UserEditProfileModalBottomSheet;
import com.vk.profile.user.impl.ui.edit.cover.picker.CoverPickerActivity;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryFeedViewItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stories.design.view.editor.SideControlPanelView;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.voip.ui.scheduled.callslist.VoipScheduledCallsFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import org.json.JSONObject;
import xsna.ikv0;
import xsna.m9t0;
import xsna.nbv0;
import xsna.nts0;
import xsna.t5t0;
import xsna.tj50;
import xsna.vuw0;
import xsna.wml0;
import xsna.zhg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class skj0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ skj0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02ad A[LOOP:0: B:75:0x016e->B:80:0x02ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02b5 A[SYNTHETIC] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ProfileEditPage personalAccount;
        VkPersonalAccountRouter.Tab tab;
        Window window;
        String str;
        long j;
        StoriesContainer storiesContainer;
        StoriesContainer storiesContainer2;
        Long l;
        String str2;
        Pair pair;
        UserId Fb;
        UserId Fb2;
        String u;
        int i = 18;
        String str3 = "";
        boolean z = false;
        int i2 = 1;
        switch (this.b) {
            case 0:
                u76 u76Var = ((SideControlPanelView) this.c).u;
                if (u76Var != null) {
                    u76Var.l();
                }
                return s3q0.a;
            case 1:
                rdk0 rdk0Var = (rdk0) this.c;
                raj rajVar = (raj) obj;
                qdk0 qdk0Var = new qdk0();
                ListBuilder listBuilder = com.vk.socialgraph.b.a;
                return new io.reactivex.rxjava3.internal.operators.observable.o0(rsg0.T(new aq(qdk0Var, rajVar.b, rajVar.a, false)), new bj50(new xc50((zi50) rdk0Var.a.getValue(), i2), null == true ? 1 : 0)).a0(asu0.a.d());
            case 2:
                return new pfy((ViewGroup) obj, ((com.vk.stickers.keyboard.page.a) this.c).m);
            case 3:
                ncl0 ncl0Var = (ncl0) this.c;
                if (((JSONObject) obj) == null) {
                    return null;
                }
                p9l0 p9l0Var = ncl0Var.f;
                StickersPromoModel zb = StickersPromoModel.zb(p9l0Var.n, 35);
                p9l0Var.n = zb;
                p9l0Var.m.onNext(zb);
                ncl0Var.d.getClass();
                y8l0.a.a(law0.a);
                ncl0Var.a1(true);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", 1);
                return jSONObject;
            case 4:
                wml0.b.c cVar = (wml0.b.c) this.c;
                mol0 mol0Var = (mol0) obj;
                return mol0.a(mol0Var, null, null, null, null, new ggr(cVar.b, cVar.c, cVar.d, mol0Var.g.e, cVar.e, 64), null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
            case 5:
                ((qtl0) this.c).h((GetStoriesResponse) obj, true);
                return s3q0.a;
            case 6:
                tgi0 tgi0Var = (tgi0) this.c;
                Boolean a = ((xbr) obj).a();
                if (a != null) {
                    qgi0.t(tgi0Var, jgz.d(a.booleanValue()));
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                UserEditProfileModalBottomSheet userEditProfileModalBottomSheet = (UserEditProfileModalBottomSheet) this.c;
                ExternalEvent externalEvent = (ExternalEvent) obj;
                qcy<Object>[] qcyVarArr = UserEditProfileModalBottomSheet.s1;
                if (externalEvent instanceof ExternalEvent.a) {
                    userEditProfileModalBottomSheet.Qn(true);
                    userEditProfileModalBottomSheet.hide();
                    userEditProfileModalBottomSheet.i1 = true;
                } else if (externalEvent instanceof ExternalEvent.ShowSnackbar) {
                    ExternalEvent.ShowSnackbar showSnackbar = (ExternalEvent.ShowSnackbar) externalEvent;
                    FragmentActivity kn = userEditProfileModalBottomSheet.kn();
                    ikv0.a aVar = new ikv0.a(kn);
                    aVar.t = new ikv0.c.C3058c(showSnackbar.b, Integer.valueOf(showSnackbar.c), (Size) null, 12);
                    aVar.u = new ikv0.d(kn.getString(showSnackbar.d), (String) (null == true ? 1 : 0), (ikv0.d.a) (null == true ? 1 : 0), 6);
                    aVar.o = Integer.valueOf(showSnackbar.e);
                    int i3 = UserEditProfileModalBottomSheet.b.$EnumSwitchMapping$0[showSnackbar.a.ordinal()];
                    if (i3 == 1) {
                        Dialog dialog = userEditProfileModalBottomSheet.s;
                        if (dialog != null && (window = dialog.getWindow()) != null) {
                            aVar.p(window);
                        }
                    } else if (i3 == 2) {
                        View view = userEditProfileModalBottomSheet.getView();
                        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                        if (viewGroup != null) {
                            aVar.o(viewGroup);
                        }
                    } else {
                        if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar.n();
                    }
                } else {
                    if (!(externalEvent instanceof ExternalEvent.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zhq0 zhq0Var = userEditProfileModalBottomSheet.o1;
                    if (zhq0Var != null) {
                        ExternalEvent.b bVar = (ExternalEvent.b) externalEvent;
                        if (bVar instanceof ExternalEvent.b.a) {
                            ((ExternalEvent.b.a) bVar).getClass();
                            throw null;
                        }
                        if (bVar instanceof ExternalEvent.b.C1672b) {
                            qr5 qr5Var = zhq0Var.a;
                            UserProfile userProfile = ((ExternalEvent.b.C1672b) bVar).a;
                            Intent n = r870.a().e().n((Context) qr5Var.a);
                            n.putExtra("single_mode", true);
                            n.putExtra("force_thumb", true);
                            n.putExtra("new_thumb_flow", true);
                            n.putExtra("thumb_uid", userProfile.c);
                            n.putExtra("username", userProfile.e);
                            n.putExtra("skip_avatar_publish", false);
                            ((bc6) qr5Var.b).D(n, 0, null);
                        } else if (bVar instanceof ExternalEvent.b.e) {
                            mzd0 mzd0Var = zhq0Var.c;
                            switch (nzd0.$EnumSwitchMapping$1[((ExternalEvent.b.e) bVar).a.ordinal()]) {
                                case 1:
                                    personalAccount = new ProfileEditPage.PersonalAccount(ProfileEditPage.PersonalAccount.Tab.PERSONAL);
                                    break;
                                case 2:
                                    personalAccount = new ProfileEditPage.PersonalAccount(ProfileEditPage.PersonalAccount.Tab.SECURITY);
                                    break;
                                case 3:
                                    personalAccount = ProfileEditPage.g.b;
                                    break;
                                case 4:
                                    personalAccount = ProfileEditPage.b.b;
                                    break;
                                case 5:
                                    personalAccount = ProfileEditPage.d.b;
                                    break;
                                case 6:
                                    personalAccount = new ProfileEditPage.c("education");
                                    break;
                                case 7:
                                    personalAccount = ProfileEditPage.a.b;
                                    break;
                                case 8:
                                    personalAccount = ProfileEditPage.e.b;
                                    break;
                                case 9:
                                    personalAccount = ProfileEditPage.f.b;
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                            if (personalAccount instanceof ProfileEditPage.PersonalAccount) {
                                VkPersonalAccountRouter vkPersonalAccountRouter = mzd0Var.c;
                                ProfileEditPage.PersonalAccount.Tab tab2 = ((ProfileEditPage.PersonalAccount) personalAccount).b;
                                int i4 = nzd0.$EnumSwitchMapping$0[tab2.ordinal()];
                                if (i4 == 1) {
                                    tab = VkPersonalAccountRouter.Tab.PERSONAL;
                                } else {
                                    if (i4 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    tab = VkPersonalAccountRouter.Tab.SECURITY;
                                }
                                vkPersonalAccountRouter.a(tab, tab2.h(), null);
                            } else {
                                oz50 a2 = mzd0Var.b.a(personalAccount);
                                if (a2 != null) {
                                    a2.s(true);
                                    a2.m(mzd0Var.a);
                                }
                            }
                        } else if (bVar instanceof ExternalEvent.b.c) {
                            nie nieVar = zhq0Var.b;
                            ExternalEvent.b.c cVar2 = (ExternalEvent.b.c) bVar;
                            String str4 = cVar2.a;
                            RectF rectF = cVar2.b;
                            bc6 bc6Var = (bc6) nieVar.c;
                            int i5 = CoverPickerActivity.A;
                            Intent intent = new Intent((Activity) nieVar.b, (Class<?>) CoverPickerActivity.class);
                            intent.putExtra("__avatar_url_key__", str4);
                            intent.putExtra("__avatar_rect_key__", rectF);
                            bc6Var.D(intent, 0, null);
                        } else if (bVar instanceof ExternalEvent.b.d) {
                            c270 c270Var = zhq0Var.d;
                            oz50 b = c270Var.b.b(((ExternalEvent.b.d) bVar).a);
                            if (b != null) {
                                b.s(true);
                                b.m(c270Var.a);
                            }
                        } else if (bVar instanceof ExternalEvent.b.f) {
                            ozd0 ozd0Var = zhq0Var.e;
                            kbj0.c((kbj0) ozd0Var.b, (Context) ozd0Var.a, ((ExternalEvent.b.f) bVar).a, false, null, null, false, 120);
                        } else if (bVar instanceof ExternalEvent.b.g) {
                            knj0 knj0Var = zhq0Var.f;
                            knj0Var.b.e().l(knj0Var.a, i5s.a(new StringBuilder("https://"), a0a.d, "/reports/?open_page=silent-info"), LaunchContext.A, null, null);
                        } else if (bVar instanceof com.vk.profile.user.impl.domain.edit.models.a) {
                            a4s a4sVar = zhq0Var.g;
                            a4sVar.a.a(new h1j(a4sVar, 13));
                        } else {
                            if (!(bVar instanceof com.vk.profile.user.impl.domain.edit.models.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            a4s a4sVar2 = zhq0Var.g;
                            com.vk.profile.user.impl.domain.edit.models.b bVar2 = (com.vk.profile.user.impl.domain.edit.models.b) bVar;
                            a4sVar2.a.e(bVar2.a, bVar2.b, new wzf(a4sVar2, i));
                        }
                    }
                }
                return s3q0.a;
            case 8:
                ((nrr0) this.c).l.t();
                return s3q0.a;
            case 9:
                VideoAutoPlay videoAutoPlay = (VideoAutoPlay) this.c;
                ((Boolean) obj).getClass();
                Long v4 = videoAutoPlay.u.v4();
                Long valueOf = v4 != null ? Long.valueOf(TimeUnit.SECONDS.toMillis(v4.longValue())) : null;
                Long j5 = videoAutoPlay.u.j5();
                if (valueOf != null && j5 != null) {
                    bpn0 bpn0Var = t5t0.e;
                    t5t0 a3 = t5t0.a.a();
                    String r1 = videoAutoPlay.u.r1();
                    long longValue = valueOf.longValue();
                    long longValue2 = j5.longValue();
                    Pair<Long, Long> pair2 = a3.c.get(r1);
                    if (pair2 == null || pair2.j().longValue() < longValue2) {
                        a3.b(longValue, r1);
                    }
                }
                return s3q0.a;
            case 10:
                ((io.reactivex.rxjava3.core.y) this.c).onSuccess((rbt0) obj);
                return s3q0.a;
            case 11:
                nts0.a aVar2 = ((nts0) this.c).c;
                if (aVar2 != null) {
                    aVar2.e();
                }
                return s3q0.a;
            case 12:
                ((com.vk.video.ui.discovery.minimizable.g) this.c).C((c.d) obj);
                return s3q0.a;
            case 13:
                ((cys0) this.c).o((n7t0) obj);
                return s3q0.a;
            case 14:
                com.vk.catalog2.common.ui.mvp.holder.video.a aVar3 = (com.vk.catalog2.common.ui.mvp.holder.video.a) this.c;
                ((Long) obj).getClass();
                wb7 wb7Var = aVar3.b;
                if (wb7Var.a() && !aVar3.f) {
                    aVar3.f = true;
                    wb7Var.d();
                }
                return s3q0.a;
            case 15:
                tj50.a aVar4 = (tj50.a) obj;
                o9t0 o9t0Var = (o9t0) ((com.vk.video.profile.presentation.g) this.c).h.getValue();
                o9t0Var.getClass();
                n9t0 n9t0Var = new n9t0(o9t0Var, null == true ? 1 : 0);
                ao8 ao8Var = ao8.d;
                return new m9t0.a(aVar4.a(n9t0Var, ao8Var), aVar4.a(new rzl0(o9t0Var, 19), ao8Var), aVar4.a(new b8e0(o9t0Var, 24), ao8Var), aVar4.a(new yaq0(o9t0Var, 4), ao8Var), aVar4.a(new h7t0(o9t0Var), ao8Var), aVar4.a(new kl60(o9t0Var), ao8Var), aVar4.a(new ksg0(o9t0Var, 23), ao8Var), aVar4.a(new mdm0(o9t0Var, i), ao8Var), aVar4.a(new y160(o9t0Var, 20), ao8Var));
            case 16:
                d5u0 d5u0Var = (d5u0) this.c;
                LinkedHashMap linkedHashMap = d5u0Var.g;
                long j2 = d5u0Var.e;
                RecyclerView recyclerView = d5u0Var.b;
                Rect rect = d5u0Var.i;
                if (recyclerView.getGlobalVisibleRect(rect)) {
                    RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null) {
                        int v = linearLayoutManager.v();
                        int x = linearLayoutManager.x();
                        long currentTimeMillis = System.currentTimeMillis();
                        if (v <= x) {
                            while (true) {
                                View findViewByPosition = linearLayoutManager.findViewByPosition(v);
                                if (findViewByPosition != null) {
                                    Rect rect2 = d5u0Var.h;
                                    boolean f = epx.f(findViewByPosition.getParent(), recyclerView);
                                    float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    if (f && findViewByPosition.isShown() && findViewByPosition.getGlobalVisibleRect(rect2) && rect2.intersect(rect)) {
                                        f2 = (rect2.width() / findViewByPosition.getWidth()) * 100;
                                    }
                                    if (f2 < d5u0Var.d) {
                                        str = str3;
                                        j = j2;
                                        linkedHashMap.remove(Integer.valueOf(v));
                                    } else if (linkedHashMap.containsKey(Integer.valueOf(v))) {
                                        Long l2 = (Long) linkedHashMap.get(Integer.valueOf(v));
                                        if (l2 != null && currentTimeMillis - l2.longValue() >= j2 && (storiesContainer = (StoriesContainer) d5u0Var.f.invoke(Integer.valueOf(v))) != null) {
                                            if (storiesContainer instanceof DiscoverStoriesContainer) {
                                                pair = new Pair(-1L, ((DiscoverStoriesContainer) storiesContainer).o);
                                            } else if (storiesContainer instanceof StubAddStoriesContainer) {
                                                StoryOwner storyOwner = storiesContainer.b;
                                                pair = new Pair((storyOwner == null || (Fb2 = storyOwner.Fb()) == null) ? null : Long.valueOf(Fb2.b), "null");
                                            } else {
                                                StoryOwner storyOwner2 = storiesContainer.b;
                                                if (storyOwner2 == null || (Fb = storyOwner2.Fb()) == null) {
                                                    storiesContainer2 = storiesContainer;
                                                    l = null;
                                                } else {
                                                    storiesContainer2 = storiesContainer;
                                                    l = Long.valueOf(Fb.b);
                                                }
                                                StoryEntry Bb = storiesContainer2.Bb();
                                                if (Bb == null || (str2 = Bb.u) == null) {
                                                    str2 = str3;
                                                }
                                                pair = new Pair(l, str2);
                                            }
                                            Long l3 = (Long) pair.d();
                                            String str5 = (String) pair.g();
                                            LruCache<String, Integer> lruCache = e5u0.a;
                                            Integer num = lruCache.get(str5);
                                            str = str3;
                                            if (num == null || num.intValue() != v) {
                                                lruCache.put(str5, Integer.valueOf(v));
                                                MobileOfficialAppsStoriesStat$TypeStoryFeedViewItem mobileOfficialAppsStoriesStat$TypeStoryFeedViewItem = new MobileOfficialAppsStoriesStat$TypeStoryFeedViewItem(Long.valueOf(d5u0Var.c.c().b), str5, l3);
                                                iid0 iid0Var = new iid0();
                                                UiTracker uiTracker = UiTracker.a;
                                                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                                                j = j2;
                                                SchemeStat$TypeAction b2 = SchemeStat$TypeAction.a.b(null, null, mobileOfficialAppsStoriesStat$TypeStoryFeedViewItem, 3);
                                                iid0Var.f = c;
                                                iid0Var.g = b2;
                                                iid0Var.q();
                                                d5u0Var.j = System.currentTimeMillis();
                                            }
                                            j = j2;
                                        }
                                    } else {
                                        linkedHashMap.put(Integer.valueOf(v), Long.valueOf(currentTimeMillis));
                                    }
                                    if (v != x) {
                                        if (System.currentTimeMillis() - d5u0Var.j < j * 2) {
                                            d5u0Var.l();
                                        }
                                        return s3q0.a;
                                    }
                                    v++;
                                    str3 = str;
                                    j2 = j;
                                }
                                str = str3;
                                j = j2;
                                if (v != x) {
                                }
                            }
                        }
                    }
                } else {
                    linkedHashMap.clear();
                }
                j = j2;
                if (System.currentTimeMillis() - d5u0Var.j < j * 2) {
                }
                return s3q0.a;
            case 17:
                String str6 = ((w73) this.c).c;
                return str6 == null ? "" : str6;
            case 18:
                com.vk.auth.external.b bVar3 = ((VkExternalAuthFragment) this.c).l;
                (bVar3 == null ? null : bVar3).c();
                return s3q0.a;
            case 19:
                w6v0 w6v0Var = (w6v0) this.c;
                u6v0 u6v0Var = w6v0Var.z;
                Throwable th = ((vgg) obj).a;
                par0.a.getClass();
                par0.d(th);
                if (th instanceof VKApiExecutionException) {
                    VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                    if (vKApiExecutionException.s() == 8 && (u = vKApiExecutionException.u()) != null && drm0.D(u, "user already linked with service", false)) {
                        u6v0Var.a();
                        return s3q0.a;
                    }
                }
                wbu0.a(w6v0Var.b, th, false);
                u6v0Var.onError();
                return s3q0.a;
            case 20:
                return new l660((ViewGroup) obj, (nbv0.a) this.c);
            case 21:
                ((MusicBaseVkMixInteractiveVh.a) this.c).invoke();
                return s3q0.a;
            case 22:
                Throwable th2 = (Throwable) obj;
                r6y r6yVar = ((pwv0) this.c).b;
                if (r6yVar != null) {
                    r6yVar.z(JsApiMethodType.LEAVE_GROUP, th2);
                }
                return s3q0.a;
            case 23:
                return new agw0((ViewGroup) obj, ((vfw0) this.c).i);
            case 24:
                ((jkw0) this.c).a(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 25:
                puw0 puw0Var = (puw0) this.c;
                Throwable th3 = (Throwable) obj;
                L.i(th3);
                puw0Var.T(new vuw0.a(th3));
                return s3q0.a;
            case 26:
                return new jww0((ViewGroup) obj, (qxw0) this.c);
            case 27:
                VoipScheduledCallsFragment voipScheduledCallsFragment = (VoipScheduledCallsFragment) this.c;
                zhg zhgVar = (zhg) obj;
                int i6 = VoipScheduledCallsFragment.c0;
                if (!(zhgVar instanceof zhg.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                cvk.w(j03.g(voipScheduledCallsFragment.requireContext(), ((zhg.a) zhgVar).a, R.string.error), false);
                return s3q0.a;
            case 28:
                whg whgVar = (whg) obj;
                yhg yhgVar = ((l1x0) this.c).i1;
                if (yhgVar != null) {
                    yhgVar.a(whgVar);
                }
                return s3q0.a;
            default:
                BottomSheetWebView bottomSheetWebView = ((hix0) this.c).g1;
                if (bottomSheetWebView != null) {
                    bottomSheetWebView.reload();
                }
                return s3q0.a;
        }
    }
}
