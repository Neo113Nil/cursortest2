package com.ybsdk.feature.resolver.internal.screens.empty;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.ExternalNavigationTargetEvents$ExternalNavigationTargetDeeplinkFetchingResultResult;
import com.ybsdk.core.navigation.cicerone.Screen;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.resolver.internal.screens.empty.EmptyLinkResolverParams;
import defpackage.c9v;
import defpackage.cwn;
import defpackage.djg;
import defpackage.ds31;
import defpackage.em3;
import defpackage.fgn;
import defpackage.g8e;
import defpackage.j3h;
import defpackage.kg51;
import defpackage.l3h;
import defpackage.pz40;
import defpackage.rcc;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.tv3;
import defpackage.uc5;
import defpackage.w511;
import defpackage.w691;
import defpackage.wvn;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final tv3 B;
    public final EmptyLinkResolverParams C;
    public final tfl0 D;
    public final c9v E;
    public final AppAnalyticsReporter F;
    public final com.ybsdk.feature.resolver.internal.interactors.a G;
    public final djg H;

    public a(tv3 tv3Var, EmptyLinkResolverParams emptyLinkResolverParams, tfl0 tfl0Var, c9v c9vVar, AppAnalyticsReporter appAnalyticsReporter, com.ybsdk.feature.resolver.internal.interactors.a aVar, djg djgVar, cwn cwnVar) {
        super(new fgn(20), cwnVar);
        this.B = tv3Var;
        this.C = emptyLinkResolverParams;
        this.D = tfl0Var;
        this.E = c9vVar;
        this.F = appAnalyticsReporter;
        this.G = aVar;
        this.H = djgVar;
        em3 em3Var = appAnalyticsReporter.z;
        em3Var.a.a("external_navigation_target.initiated", g8e.w(1, Constants.DEEPLINK, emptyLinkResolverParams.getInitialLink()));
        b0();
    }

    public final void b0() {
        r0 r0Var;
        Object value;
        AppAnalyticsReporter appAnalyticsReporter = this.F;
        appAnalyticsReporter.z.a.a("external_navigation_target.deeplink_fetching.initiated", null);
        EmptyLinkResolverParams emptyLinkResolverParams = this.C;
        if (!(emptyLinkResolverParams instanceof EmptyLinkResolverParams.Adjust)) {
            if (emptyLinkResolverParams instanceof EmptyLinkResolverParams.Common) {
                tje.N(ds31.a(this), null, null, new EmptyLinkResolverViewModel$loadData$3(this, null), 3);
                return;
            } else {
                w511.b();
                return;
            }
        }
        Uri.parse(((EmptyLinkResolverParams.Adjust) emptyLinkResolverParams).getShortLink());
        kg51 kg51Var = this.H.a;
        Throwable th = new Throwable("Can't find Adjust");
        em3.e(appAnalyticsReporter.z, th.getMessage(), null, null, ExternalNavigationTargetEvents$ExternalNavigationTargetDeeplinkFetchingResultResult.ERROR, 6);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new wvn(th)));
    }

    public final void c0(List list) {
        Collection<Screen> collection;
        r0 r0Var;
        Object value;
        l3h l3hVar = (l3h) ((j3h) this.E.b);
        ListBuilder a = rcc.a();
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            collection = EmptyList.a;
            if (!hasNext) {
                break;
            }
            Deeplink e = w691.e(l3hVar.d, Uri.parse((String) it.next()), true, null, false, 12);
            if (e != null) {
                List b = l3hVar.b(e);
                if (b != null) {
                    collection = b;
                }
                a.addAll(collection);
            }
        }
        ListBuilder j = a.j();
        if (j != null) {
            collection = j;
        }
        ArrayList arrayList = new ArrayList();
        for (Screen screen : collection) {
            FragmentScreen fragmentScreen = screen instanceof FragmentScreen ? (FragmentScreen) screen : null;
            FragmentScreen copy$default = fragmentScreen != null ? FragmentScreen.copy$default(fragmentScreen, null, false, null, TransitionPolicyType.NONE, null, null, 55, null) : null;
            if (copy$default != null) {
                arrayList.add(copy$default);
            }
        }
        if (!arrayList.isEmpty()) {
            this.D.m(arrayList);
            return;
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new wvn(new Throwable("Can't resolve deeplinks"))));
    }
}
