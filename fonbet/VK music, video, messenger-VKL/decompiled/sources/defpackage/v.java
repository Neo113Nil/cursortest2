package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.services.UnityAdsConstants;
import com.vk.antispam.SpamAction;
import com.vk.api.generated.market.dto.MarketGetFavesForAttachResponseDto;
import com.vk.api.generated.market.dto.MarketGroupForAttachDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.auth.entername.EnterProfilePresenter;
import com.vk.catalog2.common.dto.ui.UIBlockSearchQuickFilter;
import com.vk.catalog2.common.ui.holders.group.GroupInviteVh;
import com.vk.catalog2.common.ui.holders.search.FiltersWithSearchResultVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemHideVh;
import com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicBaseVkMixInteractiveVh;
import com.vk.clips.viewer.impl.feed.wrapper.domain.model.ClipsWrapperHeaderMode;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.core.view.components.spinner.c;
import com.vk.core.view.components.subnavigation.SubnavigationButton;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.photo.Photo;
import com.vk.dto.search.SearchQuickFilterItem;
import com.vk.dto.search.SearchQuickInnerFilterItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.external.miniapp.net.ad.AdvertisementConfig;
import com.vk.im.ui.components.msg_search.analytics.ImSearchAnalytics;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.libvideo.ui.VideoHidePollView;
import com.vk.stat.scheme.CommonUxpollsStat$TypeUxpollsEvent;
import com.vk.stickers.details.fragment.StickerDetailsFragment;
import com.vk.stickers.details.holders.PackStylesListHolder;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.b;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.common.js.bridge.api.events.StorageGetKeys$Response;
import com.vk.superapp.multiaccount.api.SimpleDate;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import io.reactivex.rxjava3.core.a;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.base.version_info.VersionConstants;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.awt0;
import xsna.b0m0;
import xsna.bp90;
import xsna.bpn0;
import xsna.bwj;
import xsna.c5g;
import xsna.c5u;
import xsna.ctl0;
import xsna.d790;
import xsna.dps0;
import xsna.drm0;
import xsna.dv1;
import xsna.dwj;
import xsna.e43;
import xsna.egi;
import xsna.enj;
import xsna.epx;
import xsna.f370;
import xsna.f3l0;
import xsna.f4m;
import xsna.f810;
import xsna.fno;
import xsna.ggj;
import xsna.gno;
import xsna.gza;
import xsna.h03;
import xsna.h3r;
import xsna.h5e;
import xsna.ha10;
import xsna.ife;
import xsna.izi0;
import xsna.izs;
import xsna.j3l0;
import xsna.j5g;
import xsna.jfe;
import xsna.jpp;
import xsna.k8a;
import xsna.kfe;
import xsna.kkm;
import xsna.kuo0;
import xsna.kyq0;
import xsna.l5g;
import xsna.lap;
import xsna.m84;
import xsna.mkr0;
import xsna.mp90;
import xsna.o4m;
import xsna.oio;
import xsna.ov70;
import xsna.p810;
import xsna.pid0;
import xsna.pmc;
import xsna.pzv;
import xsna.qai0;
import xsna.qw1;
import xsna.r6y;
import xsna.rco;
import xsna.rh4;
import xsna.rhq0;
import xsna.s3l0;
import xsna.s3q0;
import xsna.sla;
import xsna.sum0;
import xsna.sv2;
import xsna.t5e;
import xsna.t9f0;
import xsna.tra0;
import xsna.uuf;
import xsna.vm30;
import xsna.vrt;
import xsna.vuo0;
import xsna.vv6;
import xsna.vy4;
import xsna.wrf;
import xsna.wuf;
import xsna.xo90;
import xsna.xuf;
import xsna.y4m;
import xsna.y810;
import xsna.y8x;
import xsna.yqb;
import xsna.yto0;
import xsna.yur0;
import xsna.zof;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class v implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v(int i, Object obj, Object obj2) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        bwj bwjVar;
        bpn0 bpn0Var;
        boolean z;
        VkSkeleton vkSkeleton;
        Object obj2;
        Object obj3;
        int i;
        int i2 = 0;
        int i3 = 1;
        int i4 = 2;
        Object obj4 = null;
        switch (this.b) {
            case 0:
                l0 l0Var = (l0) this.d;
                String str = (String) this.c;
                b.p(l0Var.L0().a, new JsMethod("VKWebAppStorageGetKeys"), new StorageGetKeys$Response(null, new StorageGetKeys$Response.Data(f370.O((JSONArray) obj), str), str, 1, null), null, null, false, null, 60);
                return s3q0.a;
            case 1:
                ((com.vk.superapp.advertisement.b) this.d).u().e((AdvertisementConfig) obj, (String) this.c);
                return s3q0.a;
            case 2:
                ((dv1) this.d).d.b((String) this.c, (Throwable) obj);
                return s3q0.a;
            case 3:
                k8a.b bVar = (k8a.b) this.d;
                izs izsVar = (izs) this.c;
                dwj dwjVar = (dwj) obj;
                if (bVar.b || (bwjVar = (bwj) izsVar.invoke(dwjVar)) == null) {
                    return null;
                }
                ReentrantLock reentrantLock = bVar.d;
                reentrantLock.lock();
                try {
                    bVar.c.add(bwjVar);
                    s3q0 s3q0Var = s3q0.a;
                    return bwjVar;
                } finally {
                    reentrantLock.unlock();
                }
            case 4:
                List list = (List) this.d;
                gza gzaVar = (gza) this.c;
                int xb = ((AttachWithImage) list.get(((Integer) obj).intValue())).xb();
                vm30 vm30Var = gzaVar.b().o;
                if (vm30Var != null) {
                    return vm30Var.e(xb);
                }
                return null;
            case 5:
                ((h5e) this.d).b.d(new t5e.g(((List) this.c).size()), null);
                return s3q0.a;
            case 6:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.d;
                uuf.j jVar = (uuf.j) this.c;
                wuf wufVar = (wuf) obj;
                int i5 = ClipsWrapperFragment.Q0;
                bpn0 bpn0Var2 = clipsWrapperFragment.V;
                if (((zof) bpn0Var2.getValue()).I().a) {
                    ClipsWrapperHeaderMode h = jVar.h();
                    if (h == ClipsWrapperHeaderMode.TABS || h == ClipsWrapperHeaderMode.SINGLE_TITLE) {
                        final ife e = wufVar.e();
                        if (e != null) {
                            uuf.j jVar2 = clipsWrapperFragment.O0;
                            Object[] objArr = (jVar2 != null ? jVar2.h() : null) != jVar.h();
                            boolean f = epx.f(jVar2 != null ? jVar2.getItems() : null, jVar.getItems());
                            boolean f2 = epx.f(jVar2 != null ? jVar2.getTitle() : null, jVar.getTitle());
                            Object[] objArr2 = jVar2 != null && jVar2.isVisible() == jVar.isVisible();
                            boolean z2 = jVar2 != null && jVar2.b() == jVar.b();
                            if (jVar2 != null && objArr != true && f && f2 && objArr2 == true && z2) {
                                bpn0Var = bpn0Var2;
                            } else {
                                e.setVisibility(0);
                                List<wrf> items = jVar.getItems().getItems();
                                ArrayList arrayList = new ArrayList(c5g.u(items, 10));
                                Iterator<T> it = items.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((wrf) it.next()).b().a(clipsWrapperFragment.requireContext()).toString());
                                }
                                final int b = jVar.getItems().b();
                                boolean b2 = jVar.b();
                                CharSequence a = jVar.getTitle().a(clipsWrapperFragment.requireContext());
                                ViewGroup viewGroup = e.d;
                                VkText vkText = e.e;
                                HorizontalScrollView horizontalScrollView = e.c;
                                e.i = h;
                                e.b.setVisibility(8);
                                e.f.setVisibility(8);
                                int i6 = ife.a.$EnumSwitchMapping$0[h.ordinal()];
                                if (i6 != 1) {
                                    if (i6 == 2) {
                                        horizontalScrollView.setVisibility(8);
                                        vkText.setVisibility(0);
                                        if (a == null) {
                                            a = "";
                                        }
                                        vkText.setText(a);
                                    } else {
                                        if (i6 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        horizontalScrollView.setVisibility(8);
                                        vkText.setVisibility(8);
                                    }
                                    bpn0Var = bpn0Var2;
                                    z = true;
                                } else {
                                    horizontalScrollView.setVisibility(0);
                                    vkText.setVisibility(8);
                                    jfe jfeVar = e.n;
                                    if (jfeVar != null) {
                                        horizontalScrollView.getViewTreeObserver().removeOnPreDrawListener(jfeVar);
                                        e.n = null;
                                    }
                                    if (b2) {
                                        int size = arrayList.size();
                                        viewGroup.removeAllViews();
                                        ThemableShimmer themableShimmer = e.o;
                                        if (themableShimmer != null) {
                                            int dimensionPixelSize = e.getResources().getDimensionPixelSize(R.dimen.clips_header_tab_spacing);
                                            int dimensionPixelSize2 = e.getResources().getDimensionPixelSize(R.dimen.clips_header_skeleton_tab_width);
                                            int dimensionPixelSize3 = e.getResources().getDimensionPixelSize(R.dimen.clips_header_skeleton_tab_height);
                                            int i7 = 0;
                                            while (i7 < size) {
                                                vkSkeleton = new VkSkeleton(e.getContext(), null, 0, 14, 0);
                                                int i8 = size;
                                                vkSkeleton.setType(new VkSkeleton.a.C0862a(0));
                                                vkSkeleton.setShimmer(themableShimmer);
                                                vkSkeleton.setShimmerManagedExternally(true);
                                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize3);
                                                layoutParams.gravity = 16;
                                                if (i7 < i8 - 1) {
                                                    layoutParams.setMarginEnd(dimensionPixelSize);
                                                }
                                                s3q0 s3q0Var2 = s3q0.a;
                                                viewGroup.addView(vkSkeleton, layoutParams);
                                                i7++;
                                                size = i8;
                                            }
                                            viewGroup.getViewTreeObserver().addOnPreDrawListener(new kfe(e, themableShimmer));
                                        }
                                    } else {
                                        ThemableShimmer themableShimmer2 = e.o;
                                        if (themableShimmer2 != null) {
                                            themableShimmer2.c();
                                        }
                                        if (epx.f(e.k, arrayList) && e.l == b) {
                                            e.n = new jfe(e, e.m);
                                            horizontalScrollView.getViewTreeObserver().addOnPreDrawListener(e.n);
                                        } else {
                                            viewGroup.removeAllViews();
                                            int dimensionPixelSize4 = e.getResources().getDimensionPixelSize(R.dimen.clips_header_tab_spacing);
                                            Iterator it2 = arrayList.iterator();
                                            final int i9 = 0;
                                            while (it2.hasNext()) {
                                                Object next = it2.next();
                                                int i10 = i9 + 1;
                                                if (i9 < 0) {
                                                    e43.t();
                                                    throw null;
                                                }
                                                Iterator it3 = it2;
                                                bpn0 bpn0Var3 = bpn0Var2;
                                                TextView textView = (TextView) LayoutInflater.from(e.getContext()).inflate(R.layout.clips_header_tab_item, viewGroup, false);
                                                textView.setText((String) next);
                                                textView.setSelected(i9 == b);
                                                textView.setTextColor(i9 == b ? e.g : e.h);
                                                textView.setOnClickListener(new View.OnClickListener() { // from class: xsna.gfe
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        izs<? super Integer, s3q0> izsVar2 = ife.this.j;
                                                        if (izsVar2 != null) {
                                                            izsVar2.invoke(Integer.valueOf(i9));
                                                        }
                                                    }
                                                });
                                                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
                                                if (i9 < arrayList.size() - 1) {
                                                    layoutParams2.setMarginEnd(dimensionPixelSize4);
                                                }
                                                s3q0 s3q0Var3 = s3q0.a;
                                                viewGroup.addView(textView, layoutParams2);
                                                it2 = it3;
                                                i9 = i10;
                                                bpn0Var2 = bpn0Var3;
                                            }
                                            bpn0Var = bpn0Var2;
                                            z = true;
                                            horizontalScrollView.post(new Runnable() { // from class: xsna.hfe
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    ife ifeVar = ife.this;
                                                    View childAt = ifeVar.d.getChildAt(b);
                                                    if (childAt == null) {
                                                        return;
                                                    }
                                                    int left = childAt.getLeft() - ifeVar.d.getPaddingStart();
                                                    if (left < 0) {
                                                        left = 0;
                                                    }
                                                    ifeVar.c.smoothScrollTo(left, 0);
                                                }
                                            });
                                            e.k = arrayList;
                                            e.l = b;
                                            e.m = horizontalScrollView.getScrollX();
                                        }
                                    }
                                    bpn0Var = bpn0Var2;
                                    z = true;
                                    e.m = horizontalScrollView.getScrollX();
                                }
                                e.setOnTabClicked(new rh4(7, clipsWrapperFragment, jVar));
                                wufVar.getTopBar().setMiddle(new VkTopBar.Middle.b(e));
                                if (jVar.isVisible() != (wufVar.getTopBar().getVisibility() == 0 ? z : false)) {
                                    awt0.u(wufVar.getTopBar(), jVar.isVisible());
                                }
                            }
                            clipsWrapperFragment.O0 = jVar;
                            float c = jVar.c();
                            if (clipsWrapperFragment.N0 != c && ((zof) bpn0Var.getValue()).s().a) {
                                clipsWrapperFragment.N0 = c;
                                xuf xufVar = clipsWrapperFragment.G0;
                                if (xufVar != null) {
                                    xufVar.getTopBar().setSlotAlpha(c);
                                }
                            }
                        } else {
                            clipsWrapperFragment.O0 = null;
                            clipsWrapperFragment.to(wufVar, jVar);
                        }
                    } else {
                        clipsWrapperFragment.O0 = null;
                        clipsWrapperFragment.to(wufVar, jVar);
                    }
                } else {
                    clipsWrapperFragment.to(wufVar, jVar);
                }
                return s3q0.a;
            case 7:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.d;
                pzv pzvVar = (pzv) this.c;
                String str2 = (String) obj;
                String[] strArr = DebugDevSettingsFragment.t0;
                if (!str2.isEmpty()) {
                    try {
                        debugDevSettingsFragment.o0.e(pzv.a(pzvVar, null, null, Long.parseLong(str2), null, null, -1, -129, -1), null);
                        enj.r(debugDevSettingsFragment.mo2getContext(), "Изменения применены, до перезапуска", 0);
                    } catch (NumberFormatException unused) {
                        enj.r(debugDevSettingsFragment.mo2getContext(), "Введённое значение не соответствует Long", 0);
                    }
                }
                return null;
            case 8:
                ((ImageView) obj).setImageTintList(ColorStateList.valueOf(((Number) ((kyq0) this.d).invoke((kkm) this.c)).intValue()));
                return s3q0.a;
            case 9:
                EnterProfilePresenter enterProfilePresenter = (EnterProfilePresenter) this.d;
                SimpleDate simpleDate = (SimpleDate) this.c;
                ((Boolean) obj).getClass();
                enterProfilePresenter.D = true;
                jpp jppVar = (jpp) enterProfilePresenter.a;
                if (jppVar != null) {
                    jppVar.hn(simpleDate);
                }
                jpp jppVar2 = (jpp) enterProfilePresenter.a;
                if (jppVar2 != null) {
                    jppVar2.W0(!enterProfilePresenter.y0());
                }
                return s3q0.a;
            case 10:
                FiltersWithSearchResultVh filtersWithSearchResultVh = (FiltersWithSearchResultVh) this.d;
                UIBlockSearchQuickFilter uIBlockSearchQuickFilter = (UIBlockSearchQuickFilter) this.c;
                SearchQuickInnerFilterItem searchQuickInnerFilterItem = (SearchQuickInnerFilterItem) obj;
                filtersWithSearchResultVh.getClass();
                SearchQuickFilterItem searchQuickFilterItem = uIBlockSearchQuickFilter.A;
                List<SearchQuickInnerFilterItem> list2 = searchQuickFilterItem.n;
                Iterator<T> it4 = list2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj2 = it4.next();
                        if (((SearchQuickInnerFilterItem) obj2).g) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                SearchQuickInnerFilterItem searchQuickInnerFilterItem2 = (SearchQuickInnerFilterItem) obj2;
                List<SearchQuickInnerFilterItem> list3 = list2;
                Iterator<T> it5 = list3.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        obj3 = it5.next();
                        if (((SearchQuickInnerFilterItem) obj3).h) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                SearchQuickInnerFilterItem searchQuickInnerFilterItem3 = (SearchQuickInnerFilterItem) obj3;
                if (searchQuickInnerFilterItem2 == null ? !epx.f(searchQuickInnerFilterItem3, searchQuickInnerFilterItem) : !searchQuickInnerFilterItem2.equals(searchQuickInnerFilterItem)) {
                    Iterator<T> it6 = list3.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            Object next2 = it6.next();
                            if (epx.f((SearchQuickInnerFilterItem) next2, searchQuickInnerFilterItem)) {
                                obj4 = next2;
                            }
                        }
                    }
                    SearchQuickInnerFilterItem searchQuickInnerFilterItem4 = (SearchQuickInnerFilterItem) obj4;
                    if (searchQuickInnerFilterItem4 != null) {
                        filtersWithSearchResultVh.a();
                        filtersWithSearchResultVh.b.q7(searchQuickInnerFilterItem4.c, new UIBlockSearchQuickFilter(uIBlockSearchQuickFilter.Ab(), uIBlockSearchQuickFilter.z, new SearchQuickFilterItem(searchQuickFilterItem.b, searchQuickFilterItem.c, searchQuickFilterItem.d, searchQuickFilterItem.e, searchQuickFilterItem.f, searchQuickFilterItem.g, searchQuickFilterItem.h, searchQuickFilterItem.i, searchQuickFilterItem.j, searchQuickFilterItem.k, searchQuickFilterItem.l, searchQuickFilterItem.m, Collections.singletonList(searchQuickInnerFilterItem4)), uIBlockSearchQuickFilter.y), filtersWithSearchResultVh.e);
                    }
                }
                return s3q0.a;
            case 11:
                f fVar = (f) this.d;
                h hVar = (h) this.c;
                tra0 tra0Var = (tra0) obj;
                if (tra0Var != null) {
                    i2 = hVar.h(tra0Var);
                    i = hVar.d(tra0Var);
                } else {
                    i = 0;
                }
                fVar.f = new y8x(y8x.a(i2, i));
                fVar.c = tra0Var;
                return s3q0.a;
            case 12:
                vrt vrtVar = (vrt) this.d;
                Context context = (Context) this.c;
                Throwable th = (Throwable) obj;
                r6y r6yVar = vrtVar.b;
                if (r6yVar != null) {
                    r6yVar.A(JsApiMethodType.GET_WORKOUTS, vrtVar.d(context, new JSONObject().put("extra_native_description", th.getMessage())));
                }
                return s3q0.a;
            case 13:
                Group group = (Group) this.d;
                GroupInviteVh groupInviteVh = (GroupInviteVh) this.c;
                h03.b((Throwable) obj);
                UserId userId = group.c;
                Group group2 = groupInviteVh.j;
                if (epx.f(userId, group2 != null ? group2.c : null)) {
                    groupInviteVh.b();
                }
                return s3q0.a;
            case 14:
                y810 y810Var = (y810) this.d;
                f810 f810Var = (f810) this.c;
                MarketGetFavesForAttachResponseDto marketGetFavesForAttachResponseDto = (MarketGetFavesForAttachResponseDto) obj;
                List<MarketMarketItemDto> e2 = marketGetFavesForAttachResponseDto.e();
                ArrayList arrayList2 = new ArrayList(c5g.u(e2, 10));
                for (MarketMarketItemDto marketMarketItemDto : e2) {
                    boolean z3 = f810Var.k;
                    List<MarketGroupForAttachDto> d = marketGetFavesForAttachResponseDto.d();
                    arrayList2.add(new ha10(fno.a(marketMarketItemDto, z3, d != null ? gno.a(marketMarketItemDto.q(), d) : null)));
                }
                return new p810.o(j5g.u0(arrayList2, y810Var.q), marketGetFavesForAttachResponseDto.f());
            case 15:
                ((MusicBaseVkMixInteractiveVh) this.d).r((Rect) this.c);
                return s3q0.a;
            case 16:
                return Boolean.valueOf(izi0.j((Set) this.d, (Set) this.c).contains(Integer.valueOf(((Photo) obj).c)));
            case 17:
                ((bp90) this.d).t.a(new mp90.b.a.i(((xo90.a.i) ((xo90.a) this.c)).a));
                return s3q0.a;
            case 18:
                return ((a) this.d).d((m1) this.c);
            case 19:
                pid0 pid0Var = (pid0) this.d;
                c5u c5uVar = (c5u) ((pmc) this.c);
                pid0Var.e(c5uVar, c5uVar.j);
                return s3q0.a;
            case 20:
                ((izs) this.d).invoke(new sv2.a((SpamAction) this.c, ((Boolean) obj).booleanValue()));
                return s3q0.a;
            case 21:
                s3l0 s3l0Var = (s3l0) this.d;
                StickerStockItem stickerStockItem = (StickerStockItem) this.c;
                StickerStockItem stickerStockItem2 = (StickerStockItem) obj;
                s3l0Var.d = new d790(stickerStockItem2, stickerStockItem.b != stickerStockItem2.b ? e43.o(stickerStockItem) : new ArrayList());
                ArrayList arrayList3 = new ArrayList();
                d790 d790Var = s3l0Var.d;
                if (d790Var == null) {
                    d790Var = null;
                }
                StickerStockItem stickerStockItem3 = (StickerStockItem) j5g.a0(d790Var.b);
                if (stickerStockItem3 != null) {
                    arrayList3.add(new qai0(stickerStockItem3, true, true));
                }
                f3l0.a.b bVar2 = f3l0.a.b.a;
                s3l0Var.i = bVar2;
                StickerDetailsFragment stickerDetailsFragment = s3l0Var.b;
                d790 d790Var2 = s3l0Var.d;
                j3l0.pb(stickerDetailsFragment, d790Var2 != null ? d790Var2 : null, s3l0Var.e, arrayList3, PackStylesListHolder.State.LOADING, bVar2);
                return s3q0.a;
            case 22:
                List list4 = (List) this.d;
                ctl0 ctl0Var = (ctl0) this.c;
                Iterator it7 = list4.iterator();
                while (it7.hasNext()) {
                    ctl0Var.b.e(108, (StoryEntry) it7.next());
                }
                return s3q0.a;
            case 23:
                return ((b0m0) this.d).b((String) this.c, r3.length, new ByteArrayInputStream((byte[]) obj));
            case 24:
                ((izs) this.d).invoke(sum0.d.a((sum0.d) this.c, null, null, (SubnavigationButton.Appearance) obj, false, null, false, null, false, 0, null, false, false, 4091));
                return s3q0.a;
            case 25:
                c cVar = (c) this.d;
                m84 m84Var = (m84) this.c;
                cVar.hide();
                m84Var.invoke();
                return s3q0.a;
            case 26:
                qw1 qw1Var = (qw1) this.d;
                yto0 yto0Var = (yto0) this.c;
                ggj ggjVar = (ggj) obj;
                long floatToRawIntBits = (Float.floatToRawIntBits(ggjVar.I0(rco.a(kuo0.q(qw1Var)))) << 32) | (Float.floatToRawIntBits(ggjVar.I0(rco.b(kuo0.q(qw1Var)))) & 4294967295L);
                float I0 = ((ggjVar.I0(vuo0.g) / 2.0f) * ggjVar.r0(qw1Var.i())) / ggjVar.r0(vuo0.b);
                long j = yto0Var.b;
                oio.V1(ggjVar, l5g.b, I0, floatToRawIntBits, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 56);
                ggjVar.s1();
                oio.V1(ggjVar, j, I0, floatToRawIntBits, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 11, 56);
                ggjVar.b1(ggjVar.I0(vuo0.h), (r20 & 16) != 0 ? 0 : 0, 3, j, egi.j(ggjVar.d()), ov70.e(floatToRawIntBits, (Float.floatToRawIntBits(((float) Math.cos(qw1Var.f.d().floatValue())) * I0) << 32) | (Float.floatToRawIntBits(((float) Math.sin(qw1Var.f.d().floatValue())) * I0) & 4294967295L)));
                oio.V1(ggjVar, j, ggjVar.I0(vuo0.e) / 2, egi.j(ggjVar.d()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                oio.V1(ggjVar, yto0Var.e, I0, floatToRawIntBits, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 4, 56);
                return s3q0.a;
            case 27:
                final rhq0 rhq0Var = (rhq0) this.d;
                final FragmentActivity fragmentActivity = (FragmentActivity) this.c;
                final ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj;
                ArrayList arrayList4 = new ArrayList();
                String str3 = extendedUserProfile.u0;
                if (str3 != null) {
                    arrayList4.add(new y4m(R.drawable.vk_icon_phone_outline_28, str3, null, null, new lap(extendedUserProfile, rhq0Var, fragmentActivity, i4), Integer.valueOf(R.string.profile_contacts_accessibility_mobile_phone), 172));
                }
                String str4 = extendedUserProfile.v0;
                if (str4 != null) {
                    arrayList4.add(new y4m(R.drawable.vk_icon_phone_outline_28, str4, null, null, new sla(extendedUserProfile, rhq0Var, fragmentActivity, i4), Integer.valueOf(R.string.profile_contacts_accessibility_home_phone), 172));
                }
                String str5 = extendedUserProfile.V;
                if (str5 != null && !drm0.N(str5)) {
                    arrayList4.add(new y4m(R.drawable.vk_icon_link_outline_28, extendedUserProfile.V, null, null, new yqb(fragmentActivity, extendedUserProfile, rhq0Var), Integer.valueOf(R.string.profile_contacts_accessibility_website), 172));
                }
                String str6 = extendedUserProfile.x0;
                if (str6 != null) {
                    arrayList4.add(new y4m(R.drawable.vk_icon_logo_twitter_28, str6, null, null, new h3r(extendedUserProfile, rhq0Var, fragmentActivity, i4), Integer.valueOf(R.string.profile_contacts_accessibility_twitter), VersionConstants.PRODUCT_MAJOR_VERSION));
                }
                String str7 = extendedUserProfile.C0;
                if (str7 != null) {
                    arrayList4.add(new y4m(R.drawable.vk_icon_logo_instagram_28, str7, null, null, new Runnable() { // from class: xsna.nhq0
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb = new StringBuilder("https://instagram.com/_u/");
                            ExtendedUserProfile extendedUserProfile2 = extendedUserProfile;
                            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, rf3.c(extendedUserProfile2.C0, sb));
                            intent.setPackage("com.instagram.android");
                            rhq0 rhq0Var2 = rhq0Var;
                            FragmentActivity fragmentActivity2 = fragmentActivity;
                            enj.o(fragmentActivity2, intent, new qhq0(rhq0Var2, rhq0Var2, fragmentActivity2, extendedUserProfile2));
                        }
                    }, Integer.valueOf(R.string.profile_contacts_accessibility_instagram), VersionConstants.PRODUCT_MAJOR_VERSION));
                }
                String str8 = extendedUserProfile.y0;
                if (str8 != null) {
                    arrayList4.add(new y4m(R.drawable.vk_icon_logo_facebook_28, str8, null, null, new vy4(extendedUserProfile, rhq0Var, fragmentActivity, 5), Integer.valueOf(R.string.profile_contacts_accessibility_facebook), VersionConstants.PRODUCT_MAJOR_VERSION));
                }
                String str9 = extendedUserProfile.w0;
                if (str9 != null) {
                    arrayList4.add(new y4m(R.drawable.vk_icon_logo_skype_28, str9, null, null, new vv6(extendedUserProfile, rhq0Var, fragmentActivity, i3), Integer.valueOf(R.string.profile_contacts_accessibility_skype), VersionConstants.PRODUCT_MAJOR_VERSION));
                }
                if (!arrayList4.isEmpty()) {
                    arrayList4.add(0, new o4m(R.string.profile_group_contacts, 14, null));
                }
                return arrayList4;
            case 28:
                t9f0 t9f0Var = (t9f0) this.d;
                mkr0 mkr0Var = ((yur0) this.c).l;
                ImSearchItemLoggingInfo imSearchItemLoggingInfo = t9f0Var.b;
                if (imSearchItemLoggingInfo != null) {
                    mkr0Var.t0(ImSearchAnalytics.ClickAction.REMOVE_RECENT, imSearchItemLoggingInfo);
                }
                mkr0Var.z0();
                return s3q0.a;
            default:
                VideoHidePollView videoHidePollView = (VideoHidePollView) this.d;
                VideoItemHideVh videoItemHideVh = (VideoItemHideVh) this.c;
                dps0 dps0Var = videoItemHideVh.n;
                VideoHidePollView.a aVar = (VideoHidePollView.a) obj;
                f4m.j(videoHidePollView);
                if (aVar instanceof VideoHidePollView.a.C1250a) {
                    CommonUxpollsStat$TypeUxpollsEvent.EventType eventType = CommonUxpollsStat$TypeUxpollsEvent.EventType.ANSWER;
                    VideoFile videoFile = videoItemHideVh.q;
                    VideoHidePollView.a.C1250a c1250a = (VideoHidePollView.a.C1250a) aVar;
                    dps0Var.a(eventType, Integer.valueOf(c1250a.a), videoFile != null ? videoFile.r() : null, c1250a.b);
                } else {
                    if (!aVar.equals(VideoHidePollView.a.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CommonUxpollsStat$TypeUxpollsEvent.EventType eventType2 = CommonUxpollsStat$TypeUxpollsEvent.EventType.HIDE;
                    VideoFile videoFile2 = videoItemHideVh.q;
                    dps0Var.a(eventType2, null, videoFile2 != null ? videoFile2.r() : null, null);
                }
                return s3q0.a;
        }
    }
}
