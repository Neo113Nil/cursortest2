package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import com.vk.dto.common.id.UserId;
import com.vk.dto.profile.Address;
import com.vk.dto.profile.PlainAddress;
import com.vk.lists.c;
import com.vk.permission.PermissionHelper;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: CommunityAddressPresenter.kt */
/* loaded from: classes5.dex */
public class vqg implements c.l<List<? extends Address>>, c.i {
    public final UserId b;
    public final CommunityAddressesFragment c;
    public Location e;
    public trg g;
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();
    public boolean f = true;
    public final Object h = msy.a(LazyThreadSafetyMode.NONE, new d2(10));

    public vqg(UserId userId, CommunityAddressesFragment communityAddressesFragment) {
        this.b = userId;
        this.c = communityAddressesFragment;
    }

    public static boolean a() {
        PermissionHelper permissionHelper = PermissionHelper.a;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        permissionHelper.getClass();
        return PermissionHelper.b(context, PermissionHelper.h);
    }

    @Override // com.vk.lists.c.i
    public final boolean I() {
        return false;
    }

    public void b() {
        this.c.so(true);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        io.reactivex.rxjava3.core.q<it80<Location>> e = nt0.e(context, false);
        zl0 zl0Var = new zl0(new ka(this, 27), 14);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.d.b(e.E(zl0Var, lVar, kVar, kVar).L(new c7(new i50(this, 18), 20), false).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new sh6(new dkg(this, 1), 16), new sf(new com.vk.movika.sdk.base.logic.interactor.p(this, 24), 18)));
    }

    public void c(boolean z) {
        this.g = new trg(this.b, this);
        if (!a() || z) {
            b();
        }
    }

    public final void d(List<? extends PlainAddress> list) {
        CommunityAddressesFragment communityAddressesFragment = this.c;
        wwf<tqg> wwfVar = communityAddressesFragment.s0;
        if (wwfVar != null) {
            wwfVar.b();
        }
        if (list != null) {
            for (PlainAddress plainAddress : list) {
                wwf<tqg> wwfVar2 = communityAddressesFragment.s0;
                if (wwfVar2 != null) {
                    wwfVar2.d(new tqg(plainAddress));
                }
            }
        }
        wwf<tqg> wwfVar3 = communityAddressesFragment.s0;
        if (wwfVar3 != null) {
            wwfVar3.j();
        }
        CommunityAddressesFragment.g gVar = communityAddressesFragment.S;
        if (gVar == null) {
            gVar = null;
        }
        gVar.c();
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<List<Address>> hj(com.vk.lists.c cVar, boolean z) {
        trg trgVar = this.g;
        if (trgVar == null) {
            trgVar = null;
        }
        return trgVar.d(0, true);
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<List<? extends Address>> ui(int i, com.vk.lists.c cVar) {
        trg trgVar = this.g;
        if (trgVar == null) {
            trgVar = null;
        }
        return trgVar.d(i, false);
    }

    @Override // com.vk.lists.c.k
    @SuppressLint({"CheckResult"})
    public final void wd(io.reactivex.rxjava3.core.q<List<Address>> qVar, boolean z, com.vk.lists.c cVar) {
        qVar.subscribe(new vl0(new ii3(cVar, this, z, 1), 13), new mp0(new wl0(this, 23), 12));
    }

    @Override // com.vk.lists.c.i
    public final void clear() {
    }
}
