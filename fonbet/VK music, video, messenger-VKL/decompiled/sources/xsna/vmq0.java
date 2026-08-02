package xsna;

import com.vk.api.generated.users.dto.UsersContentTypeDto;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.profile.ProfilePrivacy$Category;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.user.impl.ui.b;
import com.vk.profile.user.impl.ui.f;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;
import xsna.cvd0;

/* compiled from: UserProfileContentAudioFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class vmq0 extends wmq0<j15, s3q0> {
    public final rnq0 m;
    public final oc40 n;
    public final String o;

    public vmq0(dvq0 dvq0Var, r0e0 r0e0Var, boolean z, rnq0 rnq0Var, oc40 oc40Var) {
        super(dvq0Var, r0e0Var, z);
        this.m = rnq0Var;
        this.n = oc40Var;
        this.o = "audios";
    }

    @Override // xsna.wmq0
    public final void A(j15 j15Var, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2) {
        j15 j15Var2 = j15Var;
        if (state == null) {
            state = j15Var2.s;
        }
        CommunityProfileContentItem.State state3 = state;
        if (state2 == null) {
            state2 = j15Var2.u;
        }
        z(j15.i(j15Var2, null, null, null, false, false, false, null, state3, state2, null, 30207));
    }

    public final void C(j15 j15Var, boolean z) {
        io.reactivex.rxjava3.core.b0 k;
        UserId a = this.c.a();
        CommunityProfileContentItem.ContentType contentType = j15Var.k;
        boolean z2 = (contentType.l() && z) || contentType.h();
        boolean h = contentType.h();
        rnq0 rnq0Var = this.m;
        if (z2) {
            k = rnq0Var.g(contentType.h() ? 30 : 6, a, j15Var.l).l(new umq0(new kl60(23), 0));
        } else {
            k = io.reactivex.rxjava3.core.x.k(Optional.empty());
        }
        io.reactivex.rxjava3.disposables.c subscribe = io.reactivex.rxjava3.core.x.B(!h ? rnq0Var.q(a, j15Var.p).l(new cr(new yaq0(1), 29)) : io.reactivex.rxjava3.core.x.k(Optional.empty()), k, new n5j0(new wni(10), 5)).subscribe(new eeh0(new d7b(j15Var, this, z), 11), new whm0(new o82(j15Var, this, z), 4));
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        if (bVar == null) {
            bVar = null;
        }
        bVar.b(subscribe);
    }

    public final void D(j15 j15Var, VKList<MusicTrack> vKList, VKList<Playlist> vKList2, boolean z) {
        List list;
        ProfilePrivacy$Category profilePrivacy$Category;
        List<Playlist> list2;
        List list3;
        ProfilePrivacy$Category profilePrivacy$Category2;
        List<MusicTrack> list4;
        if (z && vKList.isEmpty() && vKList2.isEmpty()) {
            wmq0.B(this, j15Var, CommunityProfileContentItem.State.EMPTY, null, 4);
            return;
        }
        j15 i = j15.i(j15Var, null, null, null, false, false, false, null, null, null, null, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND);
        cvd0.a aVar = i.j;
        if (!vKList.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            if (aVar != null && (list4 = aVar.b) != null) {
                arrayList.addAll(list4);
            }
            arrayList.addAll(vKList);
            if (aVar == null || (list3 = aVar.a) == null) {
                list3 = EmptyList.b;
            }
            if (aVar == null || (profilePrivacy$Category2 = aVar.c) == null) {
                profilePrivacy$Category2 = ProfilePrivacy$Category.ALL;
            }
            i = j15.i(i, new cvd0.a(list3, arrayList, profilePrivacy$Category2), null, null, myc0.f(vKList.j()) && !vKList.isEmpty(), false, false, vKList.j(), z ? CommunityProfileContentItem.State.LOADED : i.s, z ? i.u : CommunityProfileContentItem.State.LOADED, null, 30134);
        }
        cvd0.a aVar2 = i.j;
        if (!vKList2.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            if (aVar2 != null && (list2 = aVar2.a) != null) {
                arrayList2.addAll(list2);
            }
            arrayList2.addAll(vKList2);
            if (aVar2 == null || (list = aVar2.b) == null) {
                list = EmptyList.b;
            }
            if (aVar2 == null || (profilePrivacy$Category = aVar2.c) == null) {
                profilePrivacy$Category = ProfilePrivacy$Category.ALL;
            }
            i = j15.i(i, new cvd0.a(arrayList2, list, profilePrivacy$Category), null, vKList2.j(), false, false, !vKList2.isEmpty() && myc0.f(vKList2.j()), null, z ? CommunityProfileContentItem.State.LOADED : i.s, z ? i.u : CommunityProfileContentItem.State.LOADED, null, 30170);
        }
        if (z) {
            CommunityProfileContentItem.ContentType contentType = i.k;
            cvd0.a aVar3 = i.j;
            if (contentType.l()) {
                List<MusicTrack> list5 = aVar3 != null ? aVar3.b : null;
                if (list5 == null || list5.isEmpty()) {
                    i = j15.i(i, null, CommunityProfileContentItem.ContentType.ALBUMS, null, false, false, false, null, null, null, null, 32765);
                }
            }
            if (contentType.l()) {
                List<Playlist> list6 = aVar3 != null ? aVar3.a : null;
                if (list6 == null || list6.isEmpty()) {
                    i = j15.i(i, null, CommunityProfileContentItem.ContentType.ITEMS, null, false, false, false, null, null, null, null, 32765);
                }
            }
            if (contentType.h()) {
                List<MusicTrack> list7 = aVar3 != null ? aVar3.b : null;
                if (list7 != null && !list7.isEmpty()) {
                    i = j15.i(i, null, CommunityProfileContentItem.ContentType.MIXED, null, false, false, false, null, null, null, null, 32765);
                }
            }
            if (contentType.j()) {
                List<Playlist> list8 = aVar3 != null ? aVar3.a : null;
                if (list8 != null && !list8.isEmpty()) {
                    i = j15.i(i, null, CommunityProfileContentItem.ContentType.MIXED, null, false, false, false, null, null, null, null, 32765);
                }
            }
        }
        izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = this.h;
        (izsVar != null ? izsVar : null).invoke(new b.c(i));
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void b(CommunityProfileContentItem communityProfileContentItem) {
        j15 j15Var = (j15) communityProfileContentItem;
        if (j15Var.m) {
            wmq0.B(this, j15Var, null, CommunityProfileContentItem.State.LOADING, 2);
            C(j15Var, false);
        } else if (j15Var.o) {
            wmq0.B(this, j15Var, null, CommunityProfileContentItem.State.LOADING, 2);
            C(j15Var, false);
        }
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void e(CommunityProfileContentItem communityProfileContentItem) {
        z(j15.i((j15) communityProfileContentItem, null, null, null, false, false, false, null, null, null, null, 16383));
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void f(CommunityProfileContentItem communityProfileContentItem, ExtendedUserProfile extendedUserProfile) {
        if (extendedUserProfile != null) {
            fpq0 fpq0Var = this.g;
            if (fpq0Var == null) {
                fpq0Var = null;
            }
            fpq0Var.B(new f.e.s0(extendedUserProfile));
        }
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void l(CommunityProfileContentItem communityProfileContentItem, ExtendedUserProfile extendedUserProfile) {
        if (extendedUserProfile != null) {
            fpq0 fpq0Var = this.g;
            if (fpq0Var == null) {
                fpq0Var = null;
            }
            fpq0Var.B(new f.e.r0(extendedUserProfile));
        }
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void n(CommunityProfileContentItem communityProfileContentItem, ExtendedUserProfile extendedUserProfile) {
        if (extendedUserProfile != null) {
            fpq0 fpq0Var = this.g;
            if (fpq0Var == null) {
                fpq0Var = null;
            }
            fpq0Var.B(new f.e.q0(extendedUserProfile));
        }
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void o(CommunityProfileContentItem communityProfileContentItem) {
        j15 j15Var = (j15) communityProfileContentItem;
        if (j15Var.o) {
            z(j15.i(j15Var, null, null, null, false, false, false, null, null, null, CommunityProfileContentItem.State.LOADING, 28671));
            io.reactivex.rxjava3.disposables.c subscribe = this.m.g(30, this.c.a(), j15Var.l).subscribe(new d120(new c1o0(4, this, j15Var), 23), new ksb0(new g6m0(2, this, j15Var), 9));
            io.reactivex.rxjava3.disposables.b bVar = this.e;
            if (bVar == null) {
                bVar = null;
            }
            bVar.b(subscribe);
        }
    }

    @Override // xsna.wmq0
    public final CommunityProfileContentItem q(CommunityProfileContentItem communityProfileContentItem) {
        CommunityProfileContentItem.State state = CommunityProfileContentItem.State.RELOAD;
        CommunityProfileContentItem.State state2 = CommunityProfileContentItem.State.INITIAL;
        return j15.i((j15) communityProfileContentItem, null, null, null, false, false, false, null, state, state2, state2, 25986);
    }

    @Override // xsna.wmq0
    public final j15 s(ExtendedUserProfile.m mVar, boolean z, boolean z2) {
        String str = mVar.a;
        String str2 = this.o;
        if (!str.equals(str2)) {
            throw new IllegalArgumentException(("Provide " + mVar + " expected name was " + str2).toString());
        }
        List<UsersContentTypeDto> list = mVar.e;
        List<UsersContentTypeDto> list2 = list;
        CommunityProfileContentItem.ContentType contentType = (list2 == null || list2.isEmpty()) ? CommunityProfileContentItem.ContentType.ITEMS : (list.size() == 1 && list.contains(UsersContentTypeDto.AUDIOS_PLAYLISTS)) ? CommunityProfileContentItem.ContentType.ALBUMS : (list.size() == 1 && list.contains(UsersContentTypeDto.AUDIOS)) ? CommunityProfileContentItem.ContentType.ITEMS : CommunityProfileContentItem.ContentType.MIXED;
        CommunityProfileContentItem.b bVar = new CommunityProfileContentItem.b(R.string.profile_content_music_empty, Integer.valueOf(R.string.profile_content_look_through_music), null, null, null, 28);
        CommunityProfileContentItem.c cVar = new CommunityProfileContentItem.c(R.string.community_content_music_error);
        CommunityProfileContentItem.State state = z ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.INITIAL;
        CommunityProfileContentItem.d u = wmq0.u(this, mVar, 0, 0, false, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
        CommunityProfileContentItem.State state2 = CommunityProfileContentItem.State.INITIAL;
        return new j15(contentType, bVar, cVar, state, u, state2, state2, mVar.b);
    }

    @Override // xsna.wmq0
    public final io.reactivex.rxjava3.core.q<s3q0> t() {
        return new io.reactivex.rxjava3.internal.operators.observable.i0(this.n.a().a0(io.reactivex.rxjava3.android.schedulers.a.b()), new did0(new mga0(this, 25), 11)).U(new io.reactivex.rxjava3.internal.operators.mixed.j(new bws(23)));
    }

    @Override // xsna.wmq0
    public final String v() {
        return this.o;
    }

    @Override // xsna.wmq0
    public final void w(CommunityProfileContentItem communityProfileContentItem) {
        C((j15) communityProfileContentItem, true);
    }
}
