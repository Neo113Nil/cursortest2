package xsna;

import android.content.Context;
import com.vk.dto.common.VideoFileOld;
import com.vk.log.L;
import com.vk.profile.core.onboarding.model.ContentHintOnboardingResource;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a080;
import xsna.b280;
import xsna.c280;
import xsna.d080;
import xsna.d280;
import xsna.e080;
import xsna.z180;

/* compiled from: OldUserOnBoardingFeature.kt */
/* loaded from: classes5.dex */
public final class c080 extends wk50<o080, i080, a080, e080> {
    public final v180 f;
    public final ujg g;
    public final String h;
    public d080 i;
    public boolean j;
    public io.reactivex.rxjava3.disposables.c k;
    public final f4z<z180> l;
    public volatile long m;

    public c080(a080.d dVar, v180 v180Var, ujg ujgVar, String str) {
        super(dVar, new h080());
        this.f = v180Var;
        this.g = ujgVar;
        this.h = str;
        this.k = EmptyDisposable.INSTANCE;
        this.l = new f4z<>();
    }

    @Override // xsna.wk50
    public final void N(i080 i080Var, a080 a080Var) {
        rd50 rd50Var;
        d280 aVar;
        String string;
        i080 i080Var2 = i080Var;
        a080 a080Var2 = a080Var;
        if (!(a080Var2 instanceof a080.d)) {
            if (a080Var2.equals(a080.e.b)) {
                v180 v180Var = this.f;
                boolean z = !(i080Var2.b instanceof c280.b);
                int i = i080Var2.d;
                v180Var.d(i, z);
                if (!(i080Var2.b instanceof c280.b)) {
                    U(i + 1);
                    return;
                }
                d080 d080Var = this.i;
                d080.a aVar2 = (d080.a) j5g.a0((d080Var != null ? d080Var : null).a);
                if (aVar2 != null) {
                    T(new e080.b(aVar2, 0));
                    return;
                } else {
                    this.l.b(new z180.b(true));
                    V(false);
                    return;
                }
            }
            if (a080Var2 instanceof a080.a) {
                if (((a080.a) a080Var2).b) {
                    this.f.a(i080Var2.d);
                }
                this.l.b(new z180.b(false));
                V(true);
                return;
            }
            if (!a080Var2.equals(a080.b.b)) {
                if (!a080Var2.equals(a080.c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.k.dispose();
                return;
            }
            d080 d080Var2 = this.i;
            d080.a aVar3 = (d080.a) j5g.b0(i080Var2.d, (d080Var2 != null ? d080Var2 : null).a);
            if (aVar3 != null) {
                c280.c cVar = (c280.c) aVar3.a;
                T(new e080.b(new d080.a(new c280.c(new d280.b(new VideoFileOld()), cVar.b, cVar.c, cVar.d), aVar3.b), i080Var2.d));
            }
            this.k.dispose();
            com.vk.core.utils.newtork.b.a.getClass();
            io.reactivex.rxjava3.subjects.d<com.vk.core.utils.newtork.d> dVar = com.vk.core.utils.newtork.b.d;
            pu50 pu50Var = new pu50(new q520(8), 3);
            dVar.getClass();
            io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(dVar, pu50Var);
            long millis = TimeUnit.SECONDS.toMillis(2L) - (System.currentTimeMillis() - this.m);
            if (millis < 0) {
                millis = 0;
            }
            io.reactivex.rxjava3.internal.operators.observable.u A = i0Var.A(millis, TimeUnit.MILLISECONDS);
            oz ozVar = new oz(new bgy(this, 19), 27);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            io.reactivex.rxjava3.disposables.c subscribe = A.E(ozVar, lVar, kVar, kVar).subscribe(new t520(new td0(29, this, i080Var2), 12), new lav(new tw4(L.a, 12), 15));
            this.e.b(subscribe);
            this.k = subscribe;
            return;
        }
        ContentHintOnboardingResource contentHintOnboardingResource = ((a080.d) a080Var2).b;
        this.f.c();
        ContentHintOnboardingResource.Contents contents = dhr0.M() ? contentHintOnboardingResource.b : contentHintOnboardingResource.c;
        ujg ujgVar = this.g;
        if (contents instanceof ContentHintOnboardingResource.Contents.MainVideos) {
            ContentHintOnboardingResource.Contents.MainVideos mainVideos = (ContentHintOnboardingResource.Contents.MainVideos) contents;
            Context context = ((ff00) ujgVar.b.getValue()).a;
            String str = mainVideos.g;
            boolean z2 = str != null;
            int i2 = z2 ? 5 : 4;
            d080.a aVar4 = new d080.a(new c280.b(new d280.b(fls0.a(mainVideos.b)), context.getString(R.string.user_profile_on_boarding_meet_new_profile), context.getString(R.string.user_profile_on_boarding_meet_new_profile_explain)), new b280.b(context.getString(R.string.user_profile_on_boarding_whats_changes), context.getString(R.string.user_profile_on_boarding_skip)));
            d080.a aVar5 = new d080.a(new c280.c(new d280.b(fls0.a(mainVideos.c)), context.getString(R.string.user_profile_on_boarding_profile_cover), context.getString(R.string.user_profile_on_boarding_profile_cover_explain), context.getString(R.string.user_profile_on_boarding_page_indicator, 1, Integer.valueOf(i2))), new b280.c(context.getString(R.string.user_profile_on_boarding_continue)));
            d080.a aVar6 = new d080.a(new c280.c(new d280.b(fls0.a(mainVideos.d)), context.getString(R.string.user_profile_on_boarding_details_information), context.getString(R.string.user_profile_on_boarding_details_information_explain), context.getString(R.string.user_profile_on_boarding_page_indicator, 2, Integer.valueOf(i2))), new b280.c(context.getString(R.string.user_profile_on_boarding_continue)));
            d080.a aVar7 = new d080.a(new c280.c(new d280.b(fls0.a(mainVideos.e)), context.getString(R.string.user_profile_on_boarding_publications), context.getString(R.string.user_profile_on_boarding_publications_explain), context.getString(R.string.user_profile_on_boarding_page_indicator, 3, Integer.valueOf(i2))), new b280.c(context.getString(R.string.user_profile_on_boarding_continue)));
            c280.c cVar2 = new c280.c(new d280.b(fls0.a(mainVideos.f)), context.getString(R.string.user_profile_on_boarding_profile_actions), context.getString(R.string.user_profile_on_boarding_profile_actions_explain), context.getString(R.string.user_profile_on_boarding_page_indicator, 4, Integer.valueOf(i2)));
            if (z2) {
                string = context.getString(R.string.user_profile_on_boarding_continue);
            } else {
                if (z2) {
                    throw new NoWhenBranchMatchedException();
                }
                string = context.getString(R.string.user_profile_on_boarding_go_to_profile);
            }
            List l = e43.l(aVar5, aVar6, aVar7, new d080.a(cVar2, new b280.c(string)));
            List singletonList = str != null ? Collections.singletonList(new d080.a(new c280.c(new d280.b(fls0.a(str)), context.getString(R.string.user_profile_on_boarding_profile_services), context.getString(R.string.user_profile_on_boarding_profile_services_explain), context.getString(R.string.user_profile_on_boarding_page_indicator, 5, Integer.valueOf(i2))), new b280.c(context.getString(R.string.user_profile_on_boarding_go_to_profile)))) : null;
            if (singletonList == null) {
                singletonList = EmptyList.b;
            }
            rd50Var = new rd50(new d080(j5g.u0(singletonList, l)), new e080.b(aVar4, 0));
        } else {
            if (!(contents instanceof ContentHintOnboardingResource.Contents.ServicesContents)) {
                ujgVar.getClass();
                throw new NoWhenBranchMatchedException();
            }
            xkj xkjVar = (xkj) ujgVar.c.getValue();
            xkjVar.getClass();
            List<ContentHintOnboardingResource.RemoteContentResource> list = ((ContentHintOnboardingResource.Contents.ServicesContents) contents).b;
            if (list.isEmpty()) {
                rd50Var = new rd50(new d080(EmptyList.b), e080.a.b);
            } else {
                int size = list.size();
                List<ContentHintOnboardingResource.RemoteContentResource> list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                int i3 = 0;
                for (Object obj : list2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        e43.t();
                        throw null;
                    }
                    ContentHintOnboardingResource.RemoteContentResource remoteContentResource = (ContentHintOnboardingResource.RemoteContentResource) obj;
                    ContentHintOnboardingResource.ContentUrl contentUrl = remoteContentResource.d;
                    if (contentUrl instanceof ContentHintOnboardingResource.ContentUrl.Video) {
                        aVar = new d280.b(fls0.a(contentUrl.getUrl()));
                    } else {
                        if (!(contentUrl instanceof ContentHintOnboardingResource.ContentUrl.Image)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar = new d280.a(contentUrl.getUrl());
                    }
                    arrayList.add(new d080.a(new c280.c(aVar, remoteContentResource.b, remoteContentResource.c, xkjVar.a.getString(R.string.user_profile_on_boarding_page_indicator, Integer.valueOf(i4), Integer.valueOf(size))), new b280.c(remoteContentResource.e)));
                    i3 = i4;
                }
                rd50Var = new rd50(new d080(arrayList), new e080.b((d080.a) j5g.Y(arrayList), 0));
            }
        }
        this.i = (d080) rd50Var.b;
        T((e080) rd50Var.c);
    }

    public final void U(int i) {
        d080 d080Var = this.i;
        if (d080Var == null) {
            d080Var = null;
        }
        d080.a aVar = (d080.a) j5g.b0(i, d080Var.a);
        f4z<z180> f4zVar = this.l;
        if (aVar == null) {
            f4zVar.b(new z180.b(true));
            return;
        }
        d080 d080Var2 = this.i;
        if (i == e43.h((d080Var2 != null ? d080Var2 : null).a)) {
            V(false);
        }
        f4zVar.b(new z180.c(i));
        T(new e080.b(aVar, i));
    }

    public final void V(boolean z) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.l.b(new z180.a(z, this.h));
    }
}
