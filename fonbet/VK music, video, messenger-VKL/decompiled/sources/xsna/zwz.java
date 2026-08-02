package xsna;

import com.vk.search.params.api.SearchParams;
import com.vk.search.params.api.VkFeedSearchParams;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.search.params.api.VkMarketSearchParams;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.search.params.api.VkPollSearchParams;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: LocalizedParamsDescriptionMapperImpl.kt */
/* loaded from: classes5.dex */
public final class zwz implements ywz {
    public final gv90 a;
    public final iqu b;
    public final w710 c;
    public final v1r d;

    public zwz() {
        gv90 gv90Var = new gv90();
        iqu iquVar = new iqu();
        w710 w710Var = new w710();
        v1r v1rVar = new v1r();
        this.a = gv90Var;
        this.b = iquVar;
        this.c = w710Var;
        this.d = v1rVar;
    }

    @Override // xsna.ywz
    public final bxz a(SearchParams searchParams) {
        if (searchParams.I()) {
            return null;
        }
        if (searchParams instanceof VkPeopleSearchParams) {
            return kn4.k(new bzw(this.a, (VkPeopleSearchParams) searchParams));
        }
        if (searchParams instanceof VkGroupsSearchParams) {
            VkGroupsSearchParams vkGroupsSearchParams = (VkGroupsSearchParams) searchParams;
            return kn4.k(new rh4(vkGroupsSearchParams, this.b, vkGroupsSearchParams));
        }
        if (searchParams instanceof VkMarketSearchParams) {
            VkMarketSearchParams vkMarketSearchParams = (VkMarketSearchParams) searchParams;
            return kn4.k(new hl1(this.c, vkMarketSearchParams, vkMarketSearchParams, 19));
        }
        if (searchParams instanceof VkPollSearchParams) {
            return kn4.k(new ap30((VkPollSearchParams) searchParams, 8));
        }
        if (!(searchParams instanceof VkFeedSearchParams)) {
            throw new NoWhenBranchMatchedException();
        }
        return kn4.k(new k0j(this.d, (VkFeedSearchParams) searchParams));
    }
}
