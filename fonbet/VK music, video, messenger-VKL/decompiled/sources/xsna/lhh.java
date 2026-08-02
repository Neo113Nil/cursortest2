package xsna;

import com.vk.api.generated.groups.dto.GroupsContentTabsDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsContentDto;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.dto.group.GroupContentTabType;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.hg1;

/* compiled from: CommunityProfileContentDocumentFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class lhh extends nfh<sun, s3q0> {
    public boolean j;

    /* compiled from: RxExt.kt */
    public static final class a implements izs {
        public static final a b = new a();

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof paq0);
        }
    }

    /* compiled from: RxExt.kt */
    public static final class b implements izs {
        public static final b b = new b();

        @Override // xsna.izs
        public final paq0 invoke(Object obj) {
            if (obj != null) {
                return (paq0) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vkontakte.android.upload.events.UploadDoneEvent");
        }
    }

    /* compiled from: RxExt.kt */
    public static final class c implements izs {
        public static final c b = new c();

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof bun);
        }
    }

    /* compiled from: RxExt.kt */
    public static final class d implements izs {
        public static final d b = new d();

        @Override // xsna.izs
        public final bun invoke(Object obj) {
            if (obj != null) {
                return (bun) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vkontakte.android.upload.events.DocumentDeleteEvent");
        }
    }

    public lhh() {
        throw null;
    }

    public static void v(lhh lhhVar, sun sunVar, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2, int i) {
        if ((i & 2) != 0) {
            state = null;
        }
        if ((i & 4) != 0) {
            state2 = null;
        }
        izs<com.vk.profile.community.impl.ui.profile.d, s3q0> izsVar = lhhVar.c;
        if (state == null) {
            state = sunVar.o;
        }
        CommunityProfileContentItem.State state3 = state;
        if (state2 == null) {
            state2 = sunVar.q;
        }
        izsVar.invoke(new d.f(sun.i(sunVar, null, false, null, state3, state2, 95)));
    }

    @Override // xsna.nfh, xsna.jxg
    public final void b(ContentTab contentTab, ExtendedCommunityProfile extendedCommunityProfile) {
        GroupContentTabSetting s;
        this.i = true;
        if (this.j && (contentTab instanceof ContentTab.Document) && (s = s(extendedCommunityProfile)) != null) {
            sun r = r(s, true);
            this.c.invoke(new d.f(r));
            k(r, extendedCommunityProfile);
        }
    }

    @Override // xsna.nfh, xsna.jxg
    public final void c(CommunityProfileState communityProfileState) {
        ExtendedCommunityProfile extendedCommunityProfile = communityProfileState.b;
        GroupContentTabSetting s = s(extendedCommunityProfile);
        if (s != null) {
            sun r = r(s, true);
            this.c.invoke(new d.f(r));
            if (this.i && (communityProfileState.e instanceof ContentTab.Document)) {
                k(r, extendedCommunityProfile);
            } else {
                this.j = true;
            }
        }
    }

    @Override // xsna.jxg
    public final void d(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        k((sun) communityProfileContentItem, extendedCommunityProfile);
    }

    @Override // xsna.nfh, xsna.jxg
    public final void e(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        if (extendedCommunityProfile != null) {
            this.d.invoke(new d.j.n.g(extendedCommunityProfile));
        }
    }

    @Override // xsna.jxg
    public final void f(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        sun sunVar = (sun) communityProfileContentItem;
        if (sunVar.k) {
            v(this, sunVar, null, CommunityProfileContentItem.State.LOADING, 2);
            t(sunVar, false);
        }
    }

    @Override // xsna.jxg
    public final void g(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        if (extendedCommunityProfile != null) {
            this.d.invoke(new d.j.AbstractC1595d.C1596d(extendedCommunityProfile));
        }
    }

    @Override // xsna.jxg
    public final void i(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        sun sunVar = (sun) communityProfileContentItem;
        if (sunVar.k) {
            v(this, sunVar, null, CommunityProfileContentItem.State.LOADING, 2);
            t(sunVar, false);
        }
    }

    @Override // xsna.nfh
    public final io.reactivex.rxjava3.core.q<s3q0> m() {
        ysg0<Object> ysg0Var = ysg0.b;
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0Var.a;
        hg1.r0 r0Var = new hg1.r0(a.b);
        fVar.getClass();
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, r0Var).U(new hg1.q0(b.b)), new o40(new n40(this, 28), 12));
        io.reactivex.rxjava3.subjects.f<Object> fVar2 = ysg0Var.a;
        hg1.r0 r0Var2 = new hg1.r0(c.b);
        fVar2.getClass();
        return io.reactivex.rxjava3.core.q.X(i0Var, new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar2, r0Var2).U(new hg1.q0(d.b)), new com.vk.movika.sdk.base.hooks.f(new iie(this, 3), 14))).U(new qr(new pe1(17)));
    }

    public final sun r(GroupContentTabSetting groupContentTabSetting, boolean z) {
        return new sun(null, false, null, nfh.p(this, groupContentTabSetting, R.string.community_content_documents_empty, Integer.valueOf(R.string.community_content_add_document), null, 12), new CommunityProfileContentItem.c(R.string.community_content_documents_error), z ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.INITIAL, nfh.n(this, groupContentTabSetting, R.string.community_content_add_document, 0, false, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), CommunityProfileContentItem.State.INITIAL);
    }

    public final GroupContentTabSetting s(ExtendedCommunityProfile extendedCommunityProfile) {
        List<GroupContentTabSetting> list;
        Object obj = null;
        if (extendedCommunityProfile == null || (list = extendedCommunityProfile.U2) == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((GroupContentTabSetting) next).b == GroupContentTabType.FILES) {
                obj = next;
                break;
            }
        }
        return (GroupContentTabSetting) obj;
    }

    public final void t(sun sunVar, boolean z) {
        l(rsg0.W(yfb.x(xqu.i(new zqu(), fkq0.e(this.a), Collections.singletonList(GroupsContentTabsDto.FILES), null, sunVar.l, GroupsGetContentForTabsContentDto.FILES, 30, 60)), 7), new khh(this, sunVar, z), new o9(14, this, sunVar));
    }

    @Override // xsna.nfh, xsna.jxg
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void k(sun sunVar, ExtendedCommunityProfile extendedCommunityProfile) {
        this.j = false;
        v(this, sunVar, CommunityProfileContentItem.State.LOADING, null, 4);
        super.k(sunVar, extendedCommunityProfile);
        t(sunVar, true);
    }
}
