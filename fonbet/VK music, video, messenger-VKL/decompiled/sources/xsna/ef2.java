package xsna;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.i;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupsCollectionCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh;
import com.vk.core.ui.swipes.ButtonsSwipeView;
import com.vk.core.view.search.AnimStartSearchView;
import com.vk.dto.profile.Address;
import com.vk.feed.design.view.newsfeed.ads_carousel.VkFeedOverlayProductCarousel;
import com.vk.imageloader.view.VKImageView;
import com.vk.masks.MasksView;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.b;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.e;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.f;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesListBehavior;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.android.webrtc.topology.direct.DirectCallTopology;
import ru.ok.media.PublisherImpl;
import xsna.o1t;
import xsna.r2f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ef2 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ef2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v11, types: [androidx.recyclerview.widget.RecyclerView] */
    @Override // java.lang.Runnable
    public final void run() {
        o0f attachedPlayer;
        CommunityAddressesFragment.g eVar;
        RecyclerView.Adapter<?> adapter;
        ?? initCause;
        int i = 1;
        switch (this.b) {
            case 0:
                AnimStartSearchView animStartSearchView = (AnimStartSearchView) this.c;
                bwt0.p0(animStartSearchView.g, false);
                bwt0.p0(animStartSearchView.e, false);
                animStartSearchView.c();
                return;
            case 1:
                AppStartTrace appStartTrace = (AppStartTrace) this.c;
                AppStartTrace appStartTrace2 = AppStartTrace.q;
                i.b z = com.google.firebase.perf.v1.i.z();
                z.p(Constants$TraceNames.APP_START_TRACE_NAME.toString());
                z.n(appStartTrace.h.b);
                z.o(appStartTrace.h.e(appStartTrace.k));
                ArrayList arrayList = new ArrayList(3);
                i.b z2 = com.google.firebase.perf.v1.i.z();
                z2.p(Constants$TraceNames.ON_CREATE_TRACE_NAME.toString());
                z2.n(appStartTrace.h.b);
                z2.o(appStartTrace.h.e(appStartTrace.i));
                arrayList.add(z2.build());
                i.b z3 = com.google.firebase.perf.v1.i.z();
                z3.p(Constants$TraceNames.ON_START_TRACE_NAME.toString());
                z3.n(appStartTrace.i.b);
                z3.o(appStartTrace.i.e(appStartTrace.j));
                arrayList.add(z3.build());
                i.b z4 = com.google.firebase.perf.v1.i.z();
                z4.p(Constants$TraceNames.ON_RESUME_TRACE_NAME.toString());
                z4.n(appStartTrace.j.b);
                z4.o(appStartTrace.j.e(appStartTrace.k));
                arrayList.add(z4.build());
                z.c(arrayList);
                z.d(appStartTrace.n.d());
                appStartTrace.c.e(z.build(), ApplicationProcessState.FOREGROUND_BACKGROUND);
                return;
            case 2:
                RecyclerView recyclerView = ((h38) this.c).g;
                RecyclerView.Adapter adapter2 = (recyclerView != null ? recyclerView : null).getAdapter();
                if (adapter2 != null) {
                    adapter2.notifyDataSetChanged();
                    return;
                }
                return;
            case 3:
                ButtonsSwipeView buttonsSwipeView = (ButtonsSwipeView) this.c;
                int i2 = ButtonsSwipeView.r;
                buttonsSwipeView.smoothScrollTo(buttonsSwipeView.getInitialScrollOffset(), 0);
                return;
            case 4:
                ((irb) this.c).j = true;
                return;
            case 5:
                r2f.b bVar = (r2f.b) this.c;
                Iterator it = bVar.b.iterator();
                while (it.hasNext()) {
                    ((t1b0) it.next()).getAttachedPlayer().release();
                }
                t1b0 t1b0Var = bVar.a;
                if (t1b0Var == null || (attachedPlayer = t1b0Var.getAttachedPlayer()) == null) {
                    return;
                }
                attachedPlayer.prepare();
                return;
            case 6:
                k3g k3gVar = (k3g) this.c;
                l1t l1tVar = k3gVar.x;
                if (l1tVar == null) {
                    l1tVar = null;
                }
                o1t.a aVar = new o1t.a(new j4p(k3gVar.getContext(), R.raw.lut_warm_negative), new j4p(k3gVar.getContext(), R.raw.lut_warm_positive));
                if (l1tVar.l != null) {
                    return;
                }
                yvj yvjVar = (yvj) l1tVar.c.invoke();
                bdn bdnVar = bdn.a;
                l1tVar.l = myc0.h(yvjVar, wgl.c, null, new i1t(l1tVar, aVar, null), 2);
                return;
            case 7:
                CommunityAddressesFragment communityAddressesFragment = CommunityAddressesFragment.this;
                Address address = communityAddressesFragment.o0;
                if (communityAddressesFragment.requireArguments().getBoolean("old_address", false) && address != null) {
                    CommunityAddressesFragment.f fVar = communityAddressesFragment.new f(communityAddressesFragment.i0, address);
                    communityAddressesFragment.S = fVar;
                    fVar.initialize();
                    return;
                }
                Bundle arguments = communityAddressesFragment.getArguments();
                int i3 = arguments != null ? arguments.getInt("start_form_aid", 0) : 0;
                if (i3 > 0) {
                    communityAddressesFragment.so(true);
                    vqg vqgVar = communityAddressesFragment.A0;
                    if (vqgVar == null) {
                        vqgVar = null;
                    }
                    trg trgVar = vqgVar.g;
                    (trgVar != null ? trgVar : null).b(i3).subscribe(new defpackage.x(new ifg(communityAddressesFragment, i), 14));
                    return;
                }
                if (!communityAddressesFragment.requireArguments().containsKey("show_main_address") || address == null) {
                    eVar = communityAddressesFragment.new e();
                } else {
                    CommunityAddressesFragment.e eVar2 = communityAddressesFragment.new e();
                    CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior = communityAddressesFragment.u0;
                    (communityAddressesListBehavior != null ? communityAddressesListBehavior : null).F();
                    eVar = communityAddressesFragment.new b(true, eVar2, address);
                }
                communityAddressesFragment.S = eVar;
                eVar.initialize();
                return;
            case 8:
                ((DirectCallTopology) this.c).d();
                return;
            case 9:
                ((PopupWindow) this.c).dismiss();
                return;
            case 10:
                GroupsCollectionCatalogRootVh groupsCollectionCatalogRootVh = (GroupsCollectionCatalogRootVh) this.c;
                g3a.a(groupsCollectionCatalogRootVh.p, groupsCollectionCatalogRootVh);
                return;
            case 11:
                com.vk.upload.impl.tasks.k kVar = (com.vk.upload.impl.tasks.k) this.c;
                f8f0 f8f0Var = kVar.k;
                if (f8f0Var != null) {
                    f8f0Var.cancel();
                    kVar.k = null;
                    return;
                }
                return;
            case 12:
                lfw lfwVar = (lfw) this.c;
                synchronized (lfwVar.h) {
                    try {
                        lfwVar.j = null;
                        alw alwVar = lfwVar.i;
                        if (alwVar != null) {
                            lfwVar.i = null;
                            lfwVar.e(alwVar);
                        }
                    } finally {
                    }
                }
                return;
            case 13:
                ((MasksView) this.c).e.requestLayout();
                return;
            case 14:
                VKImageView vKImageView = ((MusicHidingToolbarVh) this.c).I;
                if (vKImageView != null) {
                    vKImageView.setBackground(new ColorDrawable(-16777216));
                    return;
                }
                return;
            case 15:
                ((jo40) this.c).invoke();
                return;
            case 16:
                s350 s350Var = (s350) this.c;
                RecyclerView.Adapter<?> adapter3 = s350Var.b;
                ?? r5 = s350Var.a;
                m.d dVar = s350Var.g;
                int i4 = s350Var.c;
                if (dVar == null) {
                    return;
                }
                if (r5.isComputingLayout() || r5.getScrollState() != 0) {
                    bn40.f(bd3.b(" of ", s350Var.e, i4, new StringBuilder("isComputingLayout retries ")));
                    int i5 = s350Var.e;
                    if (i5 >= i4) {
                        s350Var.e = 0;
                        return;
                    } else {
                        s350Var.e = i5 + 1;
                        s350Var.a(dVar);
                        return;
                    }
                }
                s350Var.e = 0;
                s350Var.g = null;
                if (adapter3 == null) {
                    try {
                        adapter = r5.getAdapter();
                    } catch (RuntimeException e) {
                        e = e;
                        com.vk.metrics.eventtracking.b bVar2 = com.vk.metrics.eventtracking.b.a;
                        Exception exc = s350Var.h;
                        if (exc != null && (initCause = exc.initCause(e)) != 0) {
                            e = initCause;
                        }
                        bVar2.a(e);
                        if (adapter3 == null) {
                            adapter3 = r5.getAdapter();
                        }
                        if (adapter3 != null) {
                            adapter3.notifyDataSetChanged();
                            return;
                        }
                        return;
                    }
                } else {
                    adapter = adapter3;
                }
                if (adapter != null) {
                    dVar.b(adapter);
                    return;
                }
                return;
            case 17:
                ((PublisherImpl) this.c).lambda$resumeConnection$11();
                return;
            default:
                VkFeedOverlayProductCarousel.P4((VkFeedOverlayProductCarousel) this.c);
                return;
        }
    }
}
