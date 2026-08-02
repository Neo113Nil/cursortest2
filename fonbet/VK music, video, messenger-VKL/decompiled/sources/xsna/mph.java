package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import java.io.Serializable;
import kotlin.LazyThreadSafetyMode;

/* compiled from: CommunityProfileItemsViewDelegate.kt */
/* loaded from: classes5.dex */
public final class mph {
    public final com.vk.lists.a<we6> a;
    public final ynh b;
    public final com.vk.profile.community.impl.ui.profile.b c;
    public final zah d;
    public final b3i e;
    public final a f;
    public final io.reactivex.rxjava3.disposables.b g;
    public final Lifecycle h;
    public final f5z i;
    public final io.reactivex.rxjava3.core.q<ajh> j;
    public final CommunityProfileFragment.b k;
    public final yte l;
    public final hsh m;
    public final io.reactivex.rxjava3.subjects.d<jvh> n = io.reactivex.rxjava3.subjects.d.N0();
    public final Object o;
    public final Object p;
    public ExtendedCommunityProfile q;

    /* compiled from: CommunityProfileItemsViewDelegate.kt */
    public static final class a {
        public final euh a;
        public final auh b;

        public a(euh euhVar, auh auhVar) {
            this.a = euhVar;
            this.b = auhVar;
        }
    }

    public mph(com.vk.lists.a aVar, ynh ynhVar, com.vk.profile.community.impl.ui.profile.b bVar, zah zahVar, b3i b3iVar, a aVar2, io.reactivex.rxjava3.disposables.b bVar2, androidx.lifecycle.m mVar, f5z f5zVar, io.reactivex.rxjava3.subjects.f fVar, CommunityProfileFragment.b bVar3, yte yteVar, ja5 ja5Var, p0z p0zVar) {
        this.a = aVar;
        this.b = ynhVar;
        this.c = bVar;
        this.d = zahVar;
        this.e = b3iVar;
        this.f = aVar2;
        this.g = bVar2;
        this.h = mVar;
        this.i = f5zVar;
        this.j = fVar;
        this.k = bVar3;
        this.l = yteVar;
        this.m = new hsh(bVar.a.requireContext(), aVar);
        h9 h9Var = new h9(this, 29);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.o = msy.a(lazyThreadSafetyMode, h9Var);
        this.p = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.presenter.b(this, 24));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007f, code lost:
    
        if (r4 == null) goto L19;
     */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d3h a(ExtendedCommunityProfile extendedCommunityProfile, CommunityProfileViewState.Data.c cVar) {
        UserId userId;
        Parcelable parcelable;
        Object parcelable2;
        com.vk.profile.community.impl.ui.profile.b bVar = this.c;
        FragmentImpl fragmentImpl = bVar.a;
        FragmentImpl fragmentImpl2 = bVar.a;
        pph pphVar = new pph(this, cVar);
        Bundle arguments = fragmentImpl.getArguments();
        String string = arguments != null ? arguments.getString("track_code", null) : null;
        ynh ynhVar = this.b;
        com.vk.ecomm.avito.api.a aVar = (com.vk.ecomm.avito.api.a) ynhVar.u.getValue();
        rmh rmhVar = (rmh) ynhVar.D0.getValue();
        cfh cfhVar = (cfh) ynhVar.G0.getValue();
        xv00 xv00Var = (xv00) ynhVar.s.getValue();
        ajg0 ajg0Var = (ajg0) ynhVar.g.getValue();
        gyh gyhVar = (gyh) ynhVar.i.getValue();
        Bundle arguments2 = fragmentImpl2.getArguments();
        if (arguments2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments2.getParcelable("id", UserId.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments2.getParcelable("id");
                if (!(parcelable3 instanceof UserId)) {
                    parcelable3 = null;
                }
                parcelable = (UserId) parcelable3;
            }
            userId = (UserId) parcelable;
        }
        userId = UserId.d;
        cwh cwhVar = new cwh(fragmentImpl2, ajg0Var, new i5f(this, 7), gyhVar, userId, ynhVar.f());
        anm0 anm0Var = (anm0) ynhVar.d.getValue();
        to80 to80Var = (to80) ynhVar.m0.getValue();
        rml0 rml0Var = (rml0) ynhVar.U.getValue();
        maz f = ynhVar.f();
        Bundle arguments3 = fragmentImpl2.getArguments();
        String string2 = arguments3 != null ? arguments3.getString("prev_source_join_analytic_params") : null;
        Bundle arguments4 = fragmentImpl2.getArguments();
        Serializable serializable = arguments4 != null ? arguments4.getSerializable("entry_service_join_analytic_params") : null;
        FullSourceJoinApi.EntryServiceType entryServiceType = serializable instanceof FullSourceJoinApi.EntryServiceType ? (FullSourceJoinApi.EntryServiceType) serializable : null;
        Bundle arguments5 = fragmentImpl2.getArguments();
        return new d3h(fragmentImpl, extendedCommunityProfile, pphVar, string, aVar, rmhVar, cfhVar, xv00Var, cwhVar, this.d, this.e, anm0Var, to80Var, rml0Var, f, new qoh(entryServiceType, string2, arguments5 != null ? arguments5.getString("prev_screen_name_join_analytic_params") : null));
    }
}
