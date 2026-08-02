package xsna;

import com.vk.api.generated.articles.dto.ArticlesArticleDto;
import com.vk.api.generated.groups.dto.GroupsContentTabsDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsContentDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.api.generated.groups.dto.GroupsTabContentArticlesDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.dto.group.GroupContentTabType;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: CommunityProfileContentArticleFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class jfh extends nfh<fq3, s3q0> {
    public final ynh j;
    public boolean k;

    public jfh(UserId userId, io.reactivex.rxjava3.disposables.b bVar, bw6 bw6Var, p99 p99Var, po5 po5Var, ynh ynhVar) {
        super(userId, bVar, bw6Var, p99Var, po5Var, false);
        this.j = ynhVar;
    }

    @Override // xsna.nfh, xsna.jxg
    public final void b(ContentTab contentTab, ExtendedCommunityProfile extendedCommunityProfile) {
        this.i = true;
        if (this.k) {
            this.k = false;
            GroupContentTabSetting s = s(extendedCommunityProfile);
            if (s != null) {
                this.e.invoke(new CommunityProfileAction.f.m(r(s, true)));
            }
        }
    }

    @Override // xsna.nfh, xsna.jxg
    public final void c(CommunityProfileState communityProfileState) {
        ExtendedCommunityProfile extendedCommunityProfile = communityProfileState.b;
        GroupContentTabSetting s = s(extendedCommunityProfile);
        if (s != null) {
            fq3 r = r(s, true);
            this.c.invoke(new d.f(r));
            if (this.i && (communityProfileState.e instanceof ContentTab.Article)) {
                k(r, extendedCommunityProfile);
            } else {
                this.k = true;
            }
        }
    }

    @Override // xsna.jxg
    public final void d(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        k((fq3) communityProfileContentItem, extendedCommunityProfile);
    }

    @Override // xsna.nfh, xsna.jxg
    public final void e(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        if (extendedCommunityProfile != null) {
            this.d.invoke(new d.j.n.a(extendedCommunityProfile));
        }
    }

    @Override // xsna.jxg
    public final void f(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        fq3 fq3Var = (fq3) communityProfileContentItem;
        q(fq3.i(fq3Var, null, false, null, null, CommunityProfileContentItem.State.LOADING, 1919));
        t(fq3Var, false);
    }

    @Override // xsna.jxg
    public final /* bridge */ /* synthetic */ void g(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
    }

    @Override // xsna.jxg
    public final void i(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        fq3 fq3Var = (fq3) communityProfileContentItem;
        q(fq3.i(fq3Var, null, false, null, null, CommunityProfileContentItem.State.LOADING, 1919));
        t(fq3Var, false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.nfh
    public final io.reactivex.rxjava3.core.q<s3q0> m() {
        return ((sp3) this.j.k0.getValue()).a().U(new mr(new od3(18), 11));
    }

    public final fq3 r(GroupContentTabSetting groupContentTabSetting, boolean z) {
        return new fq3(nfh.p(this, groupContentTabSetting, R.string.community_content_articles_empty, null, null, 14), new CommunityProfileContentItem.c(R.string.community_content_articles_error), z ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.INITIAL, CommunityProfileContentItem.State.INITIAL, nfh.n(this, groupContentTabSetting, 0, 0, false, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), false);
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
            if (((GroupContentTabSetting) next).b == GroupContentTabType.ARTICLES) {
                obj = next;
                break;
            }
        }
        return (GroupContentTabSetting) obj;
    }

    public final void t(final fq3 fq3Var, final boolean z) {
        l(rsg0.W(yfb.x(xqu.i(new zqu(), fkq0.e(this.a), Collections.singletonList(GroupsContentTabsDto.ARTICLES), null, fq3Var.l, GroupsGetContentForTabsContentDto.ARTICLES, 30, 60)), 7), new izs() { // from class: xsna.ifh
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto = (GroupsGetContentForTabsResponseDto) obj;
                GroupsTabContentArticlesDto d = groupsGetContentForTabsResponseDto.d();
                List<ArticlesArticleDto> d2 = d != null ? d.d() : null;
                if (d2 == null) {
                    d2 = EmptyList.b;
                }
                jfh jfhVar = jfh.this;
                fq3 fq3Var2 = fq3Var;
                boolean z2 = z;
                if (z2 && d2.isEmpty()) {
                    jfhVar.q(fq3.i(fq3Var2, null, false, null, CommunityProfileContentItem.State.EMPTY, null, 1983));
                } else {
                    Collection collection = fq3Var2.j;
                    if (collection == null) {
                        collection = EmptyList.b;
                    }
                    Collection collection2 = collection;
                    List<ArticlesArticleDto> list = d2;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(ne7.B((ArticlesArticleDto) it.next(), null));
                    }
                    ArrayList u0 = j5g.u0(arrayList, collection2);
                    GroupsTabContentArticlesDto d3 = groupsGetContentForTabsResponseDto.d();
                    boolean f = myc0.f(d3 != null ? d3.e() : null);
                    CommunityProfileContentItem.State state = z2 ? CommunityProfileContentItem.State.LOADED : fq3Var2.o;
                    CommunityProfileContentItem.State state2 = z2 ? fq3Var2.p : CommunityProfileContentItem.State.LOADED;
                    GroupsTabContentArticlesDto d4 = groupsGetContentForTabsResponseDto.d();
                    jfhVar.q(fq3.i(fq3Var2, u0, f, d4 != null ? d4.e() : null, state, state2, 1844));
                }
                return s3q0.a;
            }
        }, new woc(this, fq3Var, z, 1));
    }

    @Override // xsna.nfh, xsna.jxg
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void k(fq3 fq3Var, ExtendedCommunityProfile extendedCommunityProfile) {
        this.h.e();
        this.k = false;
        q(fq3.i(fq3Var, null, false, null, CommunityProfileContentItem.State.LOADING, null, 1983));
        super.k(fq3Var, extendedCommunityProfile);
        t(fq3Var, true);
    }
}
