package xsna;

import android.graphics.Bitmap;
import androidx.preference.Preference;
import com.ironsource.X3;
import com.vk.api.base.VkPaginationList;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.catalog2.common.dto.api.a;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.superapp.api.internal.requests.app.ConfirmResult;
import com.vk.voip.ui.broadcast.fragments.config.BroadcastConfigFragment;
import java.util.List;
import xsna.f0g0;
import xsna.fit;
import xsna.fkh;
import xsna.ogb;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ft0 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, SimpleVideoView.m, io.reactivex.rxjava3.functions.j, io.reactivex.rxjava3.functions.c, Preference.c, f0g0.b, zag0, ub9.c {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ft0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.zag0
    public void a(Object obj) {
        ((jhs) this.c).a.a((Bitmap) obj);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (hda) ((a.C0479a) this.c).invoke(obj, obj2);
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        ugz ugzVar = (ugz) this.c;
        r0t.f(false, ugzVar, aVar, xo9.g());
        return "nonCancellationPropagating[" + ugzVar + X3.j.e;
    }

    @Override // xsna.f0g0.b
    public void b(long j, xi90 xi90Var) {
        yla.a(j, xi90Var, ((mes) this.c).K);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        enj.r(debugDevSettingsFragment.mo2getContext(), "Please restart the app!", 0);
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.j
    public Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return (hda) ((faa) this.c).invoke(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // com.vk.media.player.video.view.SimpleVideoView.m
    public void onPrepared() {
        mat0 d;
        u440 u440Var = (u440) this.c;
        tam0 tam0Var = u440Var.B0;
        if (tam0Var == null || (d = tam0Var.d()) == null) {
            return;
        }
        u440Var.D7().s(d.a() / 1000);
        u440Var.x7();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 2:
                return ((Boolean) ((y40) this.c).invoke(obj)).booleanValue();
            case 5:
                return ((Boolean) ((lw3) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((op1) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return ((et0) obj2).c;
            case 1:
                return (AlbumsRepository.a) ((op1) obj2).invoke(obj);
            case 2:
            case 3:
            case 5:
            case 6:
            case 9:
            case 10:
            case 16:
            case 21:
            case 24:
            case 25:
            case 27:
            default:
                return (al60) ((srg) obj2).invoke(obj);
            case 4:
                int i2 = BroadcastConfigFragment.U;
                return (it80) ((op1) obj2).invoke(obj);
            case 7:
                return (Bitmap) ((xj9) obj2).invoke(obj);
            case 8:
                return (List) ((op1) obj2).invoke(obj);
            case 11:
                return (io.reactivex.rxjava3.core.b0) ((d50) obj2).invoke(obj);
            case 12:
                return (List) ((ci7) obj2).invoke(obj);
            case 13:
                return (ogb.a) ((ci7) obj2).invoke(obj);
            case 14:
                return (VerificationMethodTypes) ((ci7) obj2).invoke(obj);
            case 15:
                return (xec) ((izs) obj2).invoke(obj);
            case 17:
                return (j3e) ((gl6) obj2).invoke(obj);
            case 18:
                return (List) ((op1) obj2).invoke(obj);
            case 19:
                return (List) ((srg) obj2).invoke(obj);
            case 20:
                return ((fkh.g) obj2).invoke(obj);
            case 22:
                return (io.reactivex.rxjava3.core.b0) ((ci7) obj2).invoke(obj);
            case 23:
                return (Boolean) ((srg) obj2).invoke(obj);
            case 26:
                return (VkPaginationList) ((cqs) obj2).invoke(obj);
            case 28:
                return (ConfirmResult) ((fit.e) obj2).invoke(obj);
        }
    }
}
