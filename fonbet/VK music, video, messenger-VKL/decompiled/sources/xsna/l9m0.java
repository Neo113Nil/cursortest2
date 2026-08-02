package xsna;

import android.content.Context;
import android.view.View;
import androidx.credentials.provider.CredentialEntry;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.account.dto.AccountSetPrivacyKeyDto;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFilterDto;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.stories.model.StoryPrivacyResponse;
import com.vk.log.L;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: StoryPrivacyControllerImpl.kt */
/* loaded from: classes16.dex */
public final class l9m0 implements g9m0 {
    public final bam0 a;
    public final gpj0 b;
    public final xqj0 c;
    public kam0 d;
    public StoryPrivacyType e;
    public VkPaginationList<Group> f = new VkPaginationList<>(null, 0, false, 0, 15, null);
    public StoryPrivacyType g;
    public boolean h;
    public boolean i;
    public Boolean j;
    public List<UserId> k;
    public List<UserId> l;
    public List<UserId> m;
    public gzs<s3q0> n;
    public final bpn0 o;

    public l9m0(bam0 bam0Var, gpj0 gpj0Var, xqj0 xqj0Var) {
        this.a = bam0Var;
        this.b = gpj0Var;
        this.c = xqj0Var;
        this.e = ham0.a(gpj0Var, null);
        EmptyList emptyList = EmptyList.b;
        this.k = emptyList;
        this.l = emptyList;
        this.m = emptyList;
        this.o = new bpn0(new ltb0(6));
    }

    @Override // xsna.g9m0
    public final VkPaginationList<Group> a() {
        return this.f;
    }

    @Override // xsna.g9m0
    public final io.reactivex.rxjava3.disposables.c b(Context context) {
        View view;
        io.reactivex.rxjava3.disposables.c subscribe = hg1.n(rsg0.y0(yfb.x(bs.n((bs) this.o.getValue(), AccountSetPrivacyKeyDto.CLOSED_PROFILE, Collections.singletonList(CredentialEntry.FALSE_STRING), null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE)), null, null, 3).K(), context, false, null, 62).subscribe(new fv70(new waf0(this, 13), 17), new fs00(new gda0(this, 19), 25));
        kam0 kam0Var = this.d;
        if (kam0Var != null && (view = kam0Var.a) != null) {
            hg1.b(view, subscribe);
        }
        return subscribe;
    }

    @Override // xsna.g9m0
    public final StoryPrivacyType c() {
        return this.g;
    }

    @Override // xsna.g9m0
    public final boolean d() {
        return this.i;
    }

    @Override // xsna.g9m0
    public final void e() {
        itg0.j(io.reactivex.rxjava3.core.a.l(new a2b(this, 5)).q(asu0.a.c()), new fuh0(3), 1);
        this.d = null;
    }

    @Override // xsna.g9m0
    public final void f(kam0 kam0Var) {
        this.d = kam0Var;
    }

    @Override // xsna.g9m0
    public final void g() {
        this.j = Boolean.FALSE;
    }

    @Override // xsna.g9m0
    public final void h(StoryPrivacyType storyPrivacyType, StoryPrivacyType storyPrivacyType2, List<UserId> list, List<UserId> list2, List<UserId> list3, boolean z, boolean z2) {
        izs<StoryPrivacyType, s3q0> izsVar;
        izs<StoryPrivacyType, s3q0> izsVar2;
        this.e = storyPrivacyType;
        this.g = storyPrivacyType2;
        this.k = list;
        this.l = list2;
        this.m = list3;
        if (z) {
            kam0 kam0Var = this.d;
            if (kam0Var != null && (izsVar2 = kam0Var.e) != null) {
                izsVar2.invoke(storyPrivacyType);
            }
        } else {
            kam0 kam0Var2 = this.d;
            if (kam0Var2 != null && (izsVar = kam0Var2.e) != null) {
                izsVar.invoke(null);
            }
        }
        this.h = z2;
    }

    @Override // xsna.g9m0
    public final String i() {
        String s;
        s = Preference.s("STORY_PRIVACY", "LAST_PUBLISHED_PRIVACY", new String());
        return ((s.equals(StoryPrivacyType.ALL.j()) || s.equals(StoryPrivacyType.FRIENDS_OF_FRIENDS.j())) && this.b.d()) ? StoryPrivacyType.FRIENDS.j() : s;
    }

    @Override // xsna.g9m0
    public final q9m0 j() {
        return new q9m0(this.k, this.l, this.m);
    }

    @Override // xsna.g9m0
    public final List<UserId> k() {
        return this.m;
    }

    @Override // xsna.g9m0
    public final boolean l() {
        return this.h;
    }

    @Override // xsna.g9m0
    public final void m(String str) {
        if (str != null) {
            zrp<StoryPrivacyType> i = StoryPrivacyType.i();
            if (i == null || !i.isEmpty()) {
                Iterator<E> it = i.iterator();
                while (it.hasNext()) {
                    if (epx.f(((StoryPrivacyType) it.next()).j(), str)) {
                        Preference.H("STORY_PRIVACY", "LAST_PUBLISHED_PRIVACY", str);
                        return;
                    }
                }
            }
        }
    }

    @Override // xsna.g9m0
    public final void n(gzs<s3q0> gzsVar) {
        this.n = gzsVar;
    }

    @Override // xsna.g9m0
    public final StoryPrivacyType o() {
        return this.e;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [T, io.reactivex.rxjava3.disposables.c] */
    @Override // xsna.g9m0
    public final void p(boolean z, boolean z2, Context context, izs<? super Boolean, s3q0> izsVar) {
        kam0 kam0Var = this.d;
        if (kam0Var == null) {
            return;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        kam0Var.b.invoke(Boolean.TRUE);
        final bam0 bam0Var = this.a;
        int i = 4;
        int i2 = 1;
        io.reactivex.rxjava3.internal.operators.mixed.a d = io.reactivex.rxjava3.core.a.l(new yyo(bam0Var, i)).d(io.reactivex.rxjava3.core.q.q(new io.reactivex.rxjava3.internal.operators.observable.t(new io.reactivex.rxjava3.functions.n() { // from class: xsna.z9m0
            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                bam0 bam0Var2 = bam0.this;
                String s = Preference.s("StoryPrivacyCache", "StoryPrivacyResponse", "");
                StoryPrivacyResponse storyPrivacyResponse = null;
                if (s.length() != 0) {
                    try {
                        storyPrivacyResponse = (StoryPrivacyResponse) bam0Var2.d.fromJson(s, StoryPrivacyResponse.class);
                    } catch (Throwable th) {
                        L.i(th);
                    }
                }
                return storyPrivacyResponse != null ? io.reactivex.rxjava3.core.q.T(new Pair(storyPrivacyResponse, Boolean.TRUE)) : io.reactivex.rxjava3.internal.operators.observable.g0.b;
            }
        }), new io.reactivex.rxjava3.internal.operators.single.o(rsg0.W(new msl0(), 7), new s440(new yte(1, bam0Var, bam0.class, "cacheStoryPrivacyResponse", "cacheStoryPrivacyResponse(Lcom/vk/dto/stories/model/StoryPrivacyResponse;)V", 0, 11), 15)).l(new a0m0(new zzl0(2), i2)).w()));
        asu0 asu0Var = asu0.a;
        int i3 = 3;
        io.reactivex.rxjava3.core.q N = io.reactivex.rxjava3.core.q.N(d.r0(asu0Var.c()), io.reactivex.rxjava3.core.a.l(new yyo(bam0Var, i)).d(io.reactivex.rxjava3.core.q.q(new io.reactivex.rxjava3.internal.operators.observable.t(new nh80(bam0Var, i2)), new io.reactivex.rxjava3.internal.operators.single.o(rsg0.W(yfb.x(xqu.h((xqu) bam0Var.b.getValue(), null, Collections.singletonList(GroupsFilterDto.EDITOR), e43.l(GroupsFieldsDto.IS_MARKET_ONLINE_BOOKING_SETTING_ENABLED, GroupsFieldsDto.IS_MARKET_MARKET_LINK_ATTACHMENT_ENABLED, GroupsFieldsDto.IS_MARKET_MESSAGE_TO_BC_ATTACHMENT_ENABLED, GroupsFieldsDto.IS_BINDING_TO_YCLIENTS_SERVICE_ENABLED), 0, 10, 33)), 7), new cx00(new hoh(1, bam0Var, bam0.class, "cacheGroupsResult", "cacheGroupsResult(Lcom/vk/api/generated/groups/dto/GroupsGetObjectExtendedResponseDto;)V", 0, 10), 25)).l(new tj60(new gj80(bam0Var, 20), 12)).l(new mrc0(new e420(26), 6)).l(new oq80(new l4k0(i3), 6)).w()).r0(asu0Var.c())));
        N.getClass();
        int i4 = io.reactivex.rxjava3.core.g.b;
        io.reactivex.rxjava3.core.q M = N.M(io.reactivex.rxjava3.internal.functions.a.a, true, 2, i4);
        uf20 uf20Var = new uf20(new k9m0(z2), 13);
        M.getClass();
        ?? subscribe = new io.reactivex.rxjava3.internal.operators.observable.c2(hg1.m(new io.reactivex.rxjava3.internal.operators.observable.i0(M, uf20Var).Z(i4, asu0Var.d(), true).F(new jsv(new i9m0(ref$ObjectRef, kam0Var, this, z, z2, context, izsVar, ref$ObjectRef2), 27)), context, 0L, false, 62), new or20(new d7l0(i3), 14)).r0(asu0Var.c()).subscribe(new ux00(new j9m0(this, z, ref$BooleanRef, ref$BooleanRef2, kam0Var, izsVar, ref$ObjectRef), 21));
        hg1.b(kam0Var.a, subscribe);
        ref$ObjectRef2.element = subscribe;
    }
}
