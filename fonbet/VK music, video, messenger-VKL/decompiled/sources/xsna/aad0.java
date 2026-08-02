package xsna;

import android.view.View;
import com.huawei.hms.health.aaci;
import com.huawei.hms.hihealth.data.aabc;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.VoipSelectVideoPlaylistsFragment;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.c0t0;
import xsna.h0x0;
import xsna.lyr0;
import xsna.vzw0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class aad0 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.core.s, i0u0, io.reactivex.rxjava3.functions.d, s0x0, cc80 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aad0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (Boolean) ((cad0) this.c).invoke(obj);
            case 1:
                return (List) ((xht) this.c).invoke(obj);
            case 2:
                return (List) ((xht) this.c).invoke(obj);
            case 3:
            case 8:
            case 9:
            case 10:
            case 13:
            case 14:
            default:
                return (eag0) ((akb) this.c).invoke(obj);
            case 4:
                return (it80) ((n9w) this.c).invoke(obj);
            case 5:
                return (GetStoriesResponse) ((jz30) this.c).invoke(obj);
            case 6:
                return (ad7) ((p83) this.c).invoke(obj);
            case 7:
                return (String) ((xim0) this.c).invoke(obj);
            case 11:
                return (lyr0.a) ((xim0) this.c).invoke(obj);
            case 12:
                return (c.s0.d) ((ii80) this.c).invoke(obj);
            case 15:
                return (View) ((xim0) this.c).invoke(obj);
        }
    }

    @Override // xsna.s0x0
    public void c(vzw0 vzw0Var) {
        VoipSelectVideoPlaylistsFragment voipSelectVideoPlaylistsFragment = (VoipSelectVideoPlaylistsFragment) this.c;
        int i = VoipSelectVideoPlaylistsFragment.S;
        if (vzw0Var instanceof vzw0.c) {
            xn50.a.c(voipSelectVideoPlaylistsFragment, h0x0.c.b);
            return;
        }
        if (vzw0Var instanceof vzw0.a) {
            xn50.a.c(voipSelectVideoPlaylistsFragment, h0x0.b.b);
        } else {
            if ((vzw0Var instanceof vzw0.d) || !(vzw0Var instanceof vzw0.b)) {
                return;
            }
            xn50.a.c(voipSelectVideoPlaylistsFragment, new h0x0.a(false));
        }
    }

    @Override // xsna.i0u0
    public View get() {
        UserProfileHeaderView userProfileHeaderView = (UserProfileHeaderView) this.c;
        int i = UserProfileHeaderView.G;
        return (View) new WeakReference(userProfileHeaderView).get();
    }

    @Override // xsna.cc80
    public void onSuccess(Object obj) {
        ((aaci) this.c).aab((aabc) obj);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, io.reactivex.rxjava3.disposables.c] */
    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        switch (this.b) {
            case 8:
                final p870 p870Var = (p870) this.c;
                final nxl0 nxl0Var = new nxl0(rVar, 1);
                p870Var.b(102, nxl0Var);
                rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.xaq0
                    @Override // io.reactivex.rxjava3.functions.e
                    public final void cancel() {
                        p870.this.g(nxl0Var);
                    }
                });
                break;
            default:
                c0t0 c0t0Var = (c0t0) this.c;
                final bu70 L = c0t0Var.L();
                if (L != null) {
                    final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    ref$ObjectRef.element = c0t0Var.h().subscribe(new g600(new fvq0(rVar, 10), 29), new yng(new eni0(11), 3));
                    final c0t0.d dVar = new c0t0.d(ref$ObjectRef, c0t0Var, rVar);
                    L.b(dVar);
                    rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.yzs0
                        @Override // io.reactivex.rxjava3.functions.e
                        public final void cancel() {
                            Ref$ObjectRef ref$ObjectRef2 = Ref$ObjectRef.this;
                            bu70 bu70Var = L;
                            c0t0.d dVar2 = dVar;
                            ((io.reactivex.rxjava3.disposables.c) ref$ObjectRef2.element).dispose();
                            synchronized (bu70Var) {
                                bu70.e().f.remove(dVar2);
                            }
                        }
                    });
                    break;
                }
                break;
        }
    }

    @Override // io.reactivex.rxjava3.functions.d
    public boolean test(Object obj, Object obj2) {
        return ((Boolean) ((kli) this.c).invoke(obj, obj2)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 3:
                return ((Boolean) ((xht) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((wfl0) this.c).invoke(obj)).booleanValue();
        }
    }
}
