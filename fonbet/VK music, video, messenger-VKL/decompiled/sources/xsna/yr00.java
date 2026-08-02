package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.generated.market.dto.MarketCountersFilterDto;
import com.vk.catalog2.feature.music.holders.MusicActionSaveAsPlaylistButtonVh;
import com.vk.channels.api.Channel;
import com.vk.channels.api.ChannelActionInProgress;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.picture.c;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.masks.Mask;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.MusicTracksPage;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.reviews.api.model.CommunityRepliesArgs;
import com.vk.im.engine.models.SearchMode;
import com.vk.im.ui.components.msg_search.vc.HideReason;
import com.vk.inappreview.InAppReviewConditionKey;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.newsfeed.impl.items.posting.item.modals.d;
import com.vk.newsfeed.impl.posting.attachments.PostingAttachLocationFragment;
import com.vk.newsfeed.impl.postmodal.reactions.donut.ModalPostDonutFragment;
import com.vk.newsfeed.posting.geo_picker.presentation.g;
import com.vk.onboardingpromo.impl.ui.OnboardingPromoFragment;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.poll.views.PollFilterBottomView;
import com.vk.rlottie.RLottieDrawable;
import com.vkontakte.android.R;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.bi10;
import xsna.cs00;
import xsna.la10;
import xsna.ltd0;
import xsna.o0r0;
import xsna.ox30;
import xsna.p060;
import xsna.sss;
import xsna.utl0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class yr00 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yr00(MusicActionSaveAsPlaylistButtonVh musicActionSaveAsPlaylistButtonVh, Context context) {
        this.b = 6;
        this.c = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x0533, code lost:
    
        if ((r11 != null ? r11.t : r5) == com.vk.channels.api.ChannelActionInProgress.JOINING) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x054d, code lost:
    
        if ((r11 != null ? r11.t : null) == com.vk.channels.api.ChannelActionInProgress.LEAVING) goto L197;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v144, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object obj2;
        Owner f;
        int i = this.b;
        int i2 = 23;
        ChannelActionInProgress channelActionInProgress = null;
        UserProfile userProfile = null;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                zr00 zr00Var = (zr00) obj3;
                int intValue = ((Integer) obj).intValue();
                xr00 xr00Var = zr00Var.v;
                if (xr00Var != null) {
                    zr00Var.l.a(new cs00.c(intValue, xr00Var.b));
                }
                return s3q0.a;
            case 1:
                return ((lw00) obj3).b.a(MarketCountersFilterDto.SINGLE_CART_ITEMS_COUNT).U(new bl(new jr3(i2), 25));
            case 2:
                f910 f910Var = (f910) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                la10 b = f910Var.b();
                if (b != null) {
                    b.setSearchState(booleanValue ? new la10.a.b(new e910(f910Var)) : la10.a.C3242a.a);
                }
                return s3q0.a;
            case 3:
                return Boolean.valueOf(epx.f((Mask) obj3, ((bi10.b) ((bi10) obj)).a));
            case 4:
                ModalPostDonutFragment modalPostDonutFragment = (ModalPostDonutFragment) obj3;
                modalPostDonutFragment.U.n0((List) obj);
                w030 w030Var = modalPostDonutFragment.U;
                boolean z = w030Var.E0() == 1 && ((ListDataSet) w030Var.c).w(new v030(0)) != -1;
                TextView textView = modalPostDonutFragment.S;
                if (textView != null) {
                    awt0.u(textView, z);
                }
                TextView textView2 = modalPostDonutFragment.S;
                if (textView2 != null) {
                    UserId userId = (UserId) modalPostDonutFragment.V.getValue();
                    textView2.setText(modalPostDonutFragment.getString((userId == null || userId.b != o25.a().c().b) ? R.string.modal_post_donut_no_tips_information_for_user : R.string.modal_post_donut_no_tips_information_for_author));
                }
                return s3q0.a;
            case 5:
                rw30 rw30Var = (rw30) obj3;
                ox30 ox30Var = rw30Var.l;
                sxp sxpVar = (sxp) obj;
                if (sxpVar instanceof l980) {
                    rw30Var.X0(HideReason.MSG_SEND, false);
                } else if (sxpVar instanceof p680) {
                    rw30Var.X0(HideReason.INVALIDATE, false);
                } else if (sxpVar instanceof o680) {
                    if (rw30Var.p.d.length() == 0 && ox30Var.a == SearchMode.PEERS) {
                        io.reactivex.rxjava3.disposables.c cVar = rw30Var.s;
                        if (cVar != null) {
                            cVar.dispose();
                        }
                        rw30Var.s = null;
                        hy30 hy30Var = rw30Var.p;
                        rw30Var.d1(rw30Var, hy30Var.h, hy30Var.a.size(), null);
                    }
                } else if (sxpVar instanceof g480) {
                    rw30Var.p.b.remove(Long.valueOf(((g480) sxpVar).b));
                    hy30 hy30Var2 = rw30Var.p;
                    SearchMode searchMode = hy30Var2.h;
                    SearchMode searchMode2 = SearchMode.PEERS;
                    if (searchMode == searchMode2) {
                        rw30Var.U(hy30Var2.d, searchMode2);
                    }
                } else if (sxpVar instanceof r280) {
                    r280 r280Var = (r280) sxpVar;
                    if (epx.f(ox30Var, ox30.a.b)) {
                        hy30 hy30Var3 = rw30Var.p;
                        Map<Long, Channel> map = hy30Var3.k.a;
                        Iterable iterable = hy30Var3.l;
                        if (iterable == null) {
                            iterable = EmptyList.b;
                        }
                        HashMap hashMap = r280Var.b.c;
                        if (!hashMap.isEmpty()) {
                            Iterator it = hashMap.entrySet().iterator();
                            while (it.hasNext()) {
                                long longValue = ((Number) ((Map.Entry) it.next()).getKey()).longValue();
                                if (!map.containsKey(Long.valueOf(longValue))) {
                                    Iterator it2 = iterable.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            obj2 = it2.next();
                                            if (((dcf0) obj2).b == longValue) {
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    if (obj2 != null) {
                                    }
                                }
                                Set<Long> R0 = j5g.R0(rw30Var.p.m);
                                Iterator it3 = iterable.iterator();
                                while (it3.hasNext()) {
                                    long j = ((dcf0) it3.next()).b;
                                    Channel channel = (Channel) hashMap.get(Long.valueOf(j));
                                    if (channel != null) {
                                        if (channel.o || channel.t == ChannelActionInProgress.JOINING) {
                                            R0.add(Long.valueOf(j));
                                        } else {
                                            R0.remove(Long.valueOf(j));
                                        }
                                    }
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                for (Map.Entry<Long, Channel> entry : map.entrySet()) {
                                    long longValue2 = entry.getKey().longValue();
                                    Channel value = entry.getValue();
                                    Channel channel2 = (Channel) hashMap.get(Long.valueOf(longValue2));
                                    boolean z2 = value.o;
                                    long j2 = value.b;
                                    if (!z2) {
                                        if (channel2 == null || !channel2.o) {
                                            break;
                                        }
                                        R0.add(Long.valueOf(j2));
                                    }
                                    if (!z2) {
                                        if (channel2 == null || channel2.o) {
                                            break;
                                        }
                                        R0.remove(Long.valueOf(j2));
                                    }
                                    if (z2 && channel2 != null && channel2.o) {
                                        value = channel2;
                                    }
                                    linkedHashMap.put(Long.valueOf(longValue2), value);
                                    channelActionInProgress = null;
                                }
                                hy30 hy30Var4 = rw30Var.p;
                                mib mibVar = hy30Var4.k;
                                hy30Var4.k = new mib(linkedHashMap, mibVar.b, mibVar.c, mibVar.d);
                                hy30Var4.m = R0;
                                if (rw30Var.o.c()) {
                                    rw30Var.b1().e(rw30Var.p);
                                }
                            }
                        }
                    }
                }
                return s3q0.a;
            case 6:
                Context context = (Context) obj3;
                List<MusicTrack> list = ((MusicTracksPage) obj).b;
                List<MusicTrack> list2 = list;
                int size = list.size();
                if (size > 500) {
                    size = 500;
                }
                List H0 = j5g.H0(list2, size);
                ArrayList arrayList = new ArrayList(c5g.u(H0, 10));
                Iterator it4 = H0.iterator();
                while (it4.hasNext()) {
                    arrayList.add(((MusicTrack) it4.next()).Ib());
                }
                return rsg0.y0(new mm4(o25.a().c(), c9b0.e(context), MusicPlaybackLaunchContext.n.t(), j5g.y0(arrayList)), null, null, 3);
            case 7:
                ViewGroup viewGroup = (ViewGroup) obj;
                int i3 = xbk0.o;
                return new xbk0(s3j0.b(viewGroup, R.layout.music_snippet_error_item, viewGroup, false), (bgy) obj3);
            case 8:
                ((wg1) obj3).invoke((kj50) obj);
                return s3q0.a;
            case 9:
                return Boolean.valueOf(epx.f(((utl0.a) obj).b, ((ep50) obj3).N));
            case 10:
                p060 p060Var = (p060) obj3;
                int a = iah0.a(36);
                RLottieDrawable rLottieDrawable = new RLottieDrawable((String) obj, "negative_replies_icon", a, a, null, false, false, null, 496);
                rLottieDrawable.k.q = -1;
                rLottieDrawable.j();
                ((p060.b) p060Var.m.getValue()).a.setContent(new c.b(new eko(new LayerDrawable(new Drawable[]{(PaintDrawable) p060Var.n.getValue(), rLottieDrawable}))));
                return s3q0.a;
            case 11:
                ((km70) obj3).q(new bzw((List) obj, 15));
                return s3q0.a;
            case 12:
                ((jd80) obj3).b.performClick();
                ((etv0) obj).b(false);
                return s3q0.a;
            case 13:
                final OnboardingPromoFragment.c cVar2 = (OnboardingPromoFragment.c) ((OnboardingPromoFragment) obj3).N.getValue();
                return new cn50(up2.d(new ig1(i2, (gzs) obj, cVar2), new wb0() { // from class: xsna.eh80
                    @Override // xsna.izs
                    /* renamed from: j */
                    public final qj50 invoke(sj50 sj50Var) {
                        return new ig80(cVar2, sj50Var);
                    }
                }, new tti(new bb9(4))));
            case 14:
                ((c990) obj3).s6();
                return s3q0.a;
            case 15:
                return new rn90((ViewGroup) obj, ((tn90) obj3).i);
            case 16:
                PhotoFlowToolbarView.c cVar3 = ((PhotoFlowToolbarView) obj3).w;
                if (cVar3 != null) {
                    cVar3.a0();
                }
                return s3q0.a;
            case 17:
                dra0.this.a.a(g.k.b);
                return s3q0.a;
            case 18:
                ne7.w((View) obj, (VideoFile) obj3);
                return s3q0.a;
            case 19:
                final hpb0 hpb0Var = (hpb0) obj3;
                final boolean booleanValue2 = ((Boolean) obj).booleanValue();
                final int a2 = iah0.a(68);
                ValueAnimator ofInt = ValueAnimator.ofInt(booleanValue2 ? 0 : a2, booleanValue2 ? a2 : 0);
                ofInt.setDuration(225L);
                ofInt.setInterpolator(qq2.b);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.gpb0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        hpb0 hpb0Var2 = hpb0.this;
                        hpb0Var2.p().getLayoutParams().height = intValue2;
                        hpb0Var2.p().setAlpha(intValue2 / a2);
                        ((ViewGroup) hpb0Var2.t.getValue()).requestLayout();
                        if (booleanValue2) {
                            ((NestedScrollView) hpb0Var2.u.getValue()).scrollBy(0, intValue2);
                        }
                    }
                });
                ofInt.start();
                return s3q0.a;
            case 20:
                int i4 = PollResultsFragment.b0;
                h03.b((Throwable) obj);
                ((PollResultsFragment) obj3).no(PollFilterBottomView.Status.FAIL);
                return s3q0.a;
            case 21:
                pbm0 pbm0Var = (pbm0) obj3;
                Bitmap invoke = pbm0Var != null ? pbm0Var.b.invoke() : null;
                if (invoke != null) {
                    return p8c0.c(invoke);
                }
                throw new InvalidParameterException("Local content preview source undefined");
            case 22:
                int i5 = PostingAttachLocationFragment.I0;
                ((PostingAttachLocationFragment) obj3).startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                return s3q0.a;
            case 23:
                ((ktd0) obj3).T(new ltd0.a((Throwable) obj));
                return s3q0.a;
            case 24:
                am6 am6Var = (am6) obj3;
                l27 l27Var = (l27) obj;
                BillingResult billingResult = l27Var.a;
                List<Purchase> list3 = l27Var.b;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"Billing : PurchasesManager", "Retrieved INAPPs for restore: code " + billingResult.getResponseCode() + ", products " + list3.size()});
                }
                if (billingResult.getResponseCode() != 0 || list3.isEmpty()) {
                    am6Var.invoke(null);
                }
                final rv4 rv4Var = new rv4((byte) 0, 5);
                j5g.D0(new Comparator() { // from class: xsna.uge0
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return ((Number) rv4.this.invoke(obj4, obj5)).intValue();
                    }
                }, list3);
                am6Var.invoke(j5g.k0(list3));
                return s3q0.a;
            case 25:
                mhg0 mhg0Var = (mhg0) obj3;
                sss sssVar = (sss) obj;
                int i6 = mhg0.l1;
                if (sssVar instanceof sss.a) {
                    mhg0Var.dismiss();
                } else if (sssVar instanceof sss.c) {
                    FragmentActivity kn = mhg0Var.kn();
                    if (kn instanceof ey50) {
                        ((ey50) kn).Y().S(new nhg0());
                    }
                    ((o0r0) mhg0Var.k1.getValue()).m(mhg0Var.requireContext(), null, new o0r0.a(true, null, null, null, null, null, null, false, false, false, false, null, null, null, 65534));
                } else {
                    if (!(sssVar instanceof sss.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    FragmentActivity kn2 = mhg0Var.kn();
                    if (kn2 instanceof ey50) {
                        ((ey50) kn2).Y().S(new nhg0());
                    }
                    sss.b bVar = (sss.b) sssVar;
                    ((ajg0) mhg0Var.j1.getValue()).g(mhg0Var.requireContext(), new CommunityRepliesArgs(bVar.a, bVar.b));
                }
                return s3q0.a;
            case 26:
                arg0 arg0Var = (arg0) obj3;
                r100.a(arg0Var.f, "Fake condition action is triggered");
                com.vk.inappreview.impl.fake.a aVar = new com.vk.inappreview.impl.fake.a();
                Bundle bundle = new Bundle();
                bundle.putString("condition_key", ((InAppReviewConditionKey) obj).h());
                aVar.setArguments(bundle);
                aVar.Td(arg0Var.a.getSupportFragmentManager(), "FakeIar");
                return s3q0.a;
            case 27:
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) obj3;
                JSONObject jSONObject = (JSONObject) obj;
                String optString = jSONObject.optString("type");
                if (epx.f(optString, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)) {
                    userProfile = new UserProfile(jSONObject.optJSONObject(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE));
                } else if (epx.f(optString, "group")) {
                    userProfile = new UserProfile(new Group(jSONObject.optJSONObject("group")));
                }
                if (userProfile != null) {
                    if (userProfile.C()) {
                        Serializer.c<Owner> cVar4 = Owner.CREATOR;
                        f = Owner.a.d(jSONObject.optJSONObject("group"));
                    } else {
                        Serializer.c<Owner> cVar5 = Owner.CREATOR;
                        f = Owner.a.f(jSONObject.optJSONObject(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE));
                    }
                    linkedHashMap2.put(f.b, f);
                }
                return userProfile;
            case 28:
                d2t0 d2t0Var = ((com.vk.posting.presentation.video.search.g) obj3).i;
                wia0 wia0Var = (wia0) obj;
                if (wia0Var.c) {
                    d2t0Var.clear();
                }
                d2t0Var.n0(wia0Var.a);
                return s3q0.a;
            default:
                ((Boolean) obj).booleanValue();
                ((d.b) obj3).c.invoke();
                return s3q0.a;
        }
    }

    public /* synthetic */ yr00(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public /* synthetic */ yr00(pbm0 pbm0Var, p8c0 p8c0Var) {
        this.b = 21;
        this.c = pbm0Var;
    }
}
