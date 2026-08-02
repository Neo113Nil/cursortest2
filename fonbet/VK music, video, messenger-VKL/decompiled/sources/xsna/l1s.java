package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dialogslist.api.list.DialogsListConfigToken;
import com.vk.dialogslist.impl.di.DialogsListInternalFeatureComponent;
import com.vk.dto.common.Peer;
import com.vk.folders.impl.common.loader.CommonFolderDialogsListConfigToken;
import com.vk.folders.impl.common.loader.FolderDialogsListConfigToken;
import com.vk.im.business.notifications.api.BusinessNotificationComponent;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.mvicomponent.MultiComponentFragment;
import com.vk.im.reporters.api.di.ImReportersComponent;
import com.vk.toggle.features.ImFeatures;
import java.lang.ref.WeakReference;
import kotlin.LazyThreadSafetyMode;
import xsna.gsm;
import xsna.jtm;
import xsna.ko8;

/* compiled from: FoldersPagerComponent.kt */
/* loaded from: classes18.dex */
public final class l1s extends yj50<m1s, v1s, p1s, t1s, u1s, n1s, o1s> {
    public final gsm<esm> A;
    public final b1s B;
    public final v0s C;
    public final com.vk.folders.impl.model.a D;
    public final vyr E;
    public final bpn0 F;
    public WeakReference<t1s> G;
    public final MultiComponentFragment n;
    public final wuj o;
    public final a2s p;
    public final fib q;
    public final vi00 r;
    public final a1w s;
    public final mxv t;
    public final seb u;
    public final k0s v;
    public final d7p w;
    public final Object x;
    public final Object y;
    public final Object z;

    /* compiled from: FoldersPagerComponent.kt */
    public final class a implements gsm.a<CommonFolderDialogsListConfigToken, esm>, g4z {
        public final io.reactivex.rxjava3.disposables.b b = new io.reactivex.rxjava3.disposables.b();
        public wjg c;

        public a(boolean z) {
            this.c = z ? a() : null;
        }

        public final wjg a() {
            if (this.c == null) {
                l1s l1sVar = l1s.this;
                if (l1sVar.s.u()) {
                    io.reactivex.rxjava3.core.w c = asu0.a.c();
                    a1w a1wVar = l1sVar.s;
                    a2s a2sVar = l1sVar.p;
                    mxv mxvVar = l1sVar.t;
                    b25 a = o25.a();
                    jtm p2 = l1sVar.v.p2();
                    l1sVar.t.getClass();
                    wjg wjgVar = new wjg(a1wVar, a2sVar, mxvVar, a, ko8.a.a, p2, ((DialogsListInternalFeatureComponent) m7m.d(l1sVar.n).mo408a(fpf0.a(DialogsListInternalFeatureComponent.class))).O5());
                    drz<xrm> m = wjgVar.m();
                    wjgVar.l();
                    m.a(10);
                    this.b.b(wjgVar.m().getState().C(new xv(this, 5)).r0(c).subscribe());
                    this.c = wjgVar;
                }
            }
            return this.c;
        }

        @Override // xsna.gsm.a
        public final esm e(CommonFolderDialogsListConfigToken commonFolderDialogsListConfigToken) {
            wjg a = a();
            if (a != null) {
                return a;
            }
            l1s l1sVar = l1s.this;
            a1w a1wVar = l1sVar.s;
            MultiComponentFragment multiComponentFragment = l1sVar.n;
            return new wjg(a1wVar, l1sVar.p, l1sVar.t, o25.a(), ((BusinessNotificationComponent) m7m.d(multiComponentFragment).mo408a(fpf0.a(BusinessNotificationComponent.class))).i4(), l1sVar.v.p2(), ((DialogsListInternalFeatureComponent) m7m.d(multiComponentFragment).mo408a(fpf0.a(DialogsListInternalFeatureComponent.class))).O5());
        }

        @Override // xsna.gsm.a, xsna.g4z
        public final void onDestroy() {
            drz<xrm> m;
            wjg wjgVar = this.c;
            if (wjgVar != null && (m = wjgVar.m()) != null) {
                m.onDestroy();
            }
            this.c = null;
            this.b.e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x00e3, code lost:
    
        if (com.vk.toggle.b.A.a(r4) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l1s(MultiComponentFragment multiComponentFragment, wuj wujVar, a2s a2sVar, fib fibVar, vi00 vi00Var, a1w a1wVar, mxv mxvVar, seb sebVar, l0s l0sVar, d7p d7pVar) {
        super(multiComponentFragment, multiComponentFragment, p1s.class, false);
        boolean z = false;
        this.n = multiComponentFragment;
        this.o = wujVar;
        this.p = a2sVar;
        this.q = fibVar;
        this.r = vi00Var;
        this.s = a1wVar;
        this.t = mxvVar;
        this.u = sebVar;
        this.v = l0sVar;
        this.w = d7pVar;
        k5h k5hVar = new k5h(this, 16);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.x = msy.a(lazyThreadSafetyMode, k5hVar);
        this.y = msy.a(lazyThreadSafetyMode, new c5f(this, 18));
        this.z = msy.a(lazyThreadSafetyMode, new jrh(this, 11));
        bpn0 bpn0Var = new bpn0(new myh(this, 14));
        gsm<esm> gsmVar = (gsm) e(hsm.class, (String) bpn0Var.getValue(), new w9(12));
        this.A = gsmVar;
        this.B = zq70.t(this, (String) bpn0Var.getValue(), a1wVar);
        String str = (String) bpn0Var.getValue();
        this.C = (v0s) e(v0s.class, str, new j5q(a1wVar, this, str, 1));
        String str2 = (String) bpn0Var.getValue();
        com.vk.folders.impl.model.a aVar = (com.vk.folders.impl.model.a) e(com.vk.folders.impl.model.a.class, str2, new kk(a1wVar, this, str2, 3));
        this.D = aVar;
        this.E = new vyr(aVar);
        this.F = new bpn0(new dne(this, 24));
        this.G = new WeakReference<>(null);
        gsmVar.t(FolderDialogsListConfigToken.class, new gsm.a() { // from class: xsna.k1s
            @Override // xsna.gsm.a
            public final Object e(DialogsListConfigToken dialogsListConfigToken) {
                FolderDialogsListConfigToken folderDialogsListConfigToken = (FolderDialogsListConfigToken) dialogsListConfigToken;
                int i = folderDialogsListConfigToken.b;
                l1s l1sVar = l1s.this;
                a1w a1wVar2 = l1sVar.s;
                mxv mxvVar2 = l1sVar.t;
                b1s b1sVar = l1sVar.B;
                v0s v0sVar = l1sVar.C;
                com.vk.folders.impl.model.a aVar2 = l1sVar.D;
                b25 a2 = o25.a();
                jtm.a.getClass();
                jtm.a.C3145a c3145a = jtm.a.b;
                final d0s d0sVar = new d0s(l1sVar.s, l1sVar.B.c);
                final int i2 = folderDialogsListConfigToken.b;
                return new t0s(i, a1wVar2, mxvVar2, b1sVar, v0sVar, aVar2, a2, c3145a, (lyr) l1sVar.e(lyr.class, String.valueOf(i2), new gzs() { // from class: xsna.c2s
                    @Override // xsna.gzs
                    public final Object invoke() {
                        return new lyr(i2, d0sVar);
                    }
                }), ((DialogsListInternalFeatureComponent) m7m.d(l1sVar.n).mo408a(fpf0.a(DialogsListInternalFeatureComponent.class))).O5());
            }
        });
        Peer peer = a1wVar.r().a.c;
        peer.getClass();
        if (!peer.Ab(Peer.Type.GROUP)) {
            ImFeatures imFeatures = ImFeatures.CHANNELS_IN_ALL_FOLDER;
            imFeatures.getClass();
        }
        z = true;
        gsmVar.t(CommonFolderDialogsListConfigToken.class, new a(z));
    }

    @Override // xsna.yj50
    public final m1s a(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("open_target_folder", FolderType.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("open_target_folder");
            if (!(parcelable3 instanceof FolderType)) {
                parcelable3 = null;
            }
            parcelable = (FolderType) parcelable3;
        }
        FolderType folderType = (FolderType) parcelable;
        return new m1s(this.n.requireContext(), this.C, this.D, (p0s) this.F.getValue(), this.s.r().h, this.B, this.v, folderType);
    }

    @Override // xsna.yj50
    public final o1s b() {
        return new o1s(this.n.requireContext());
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.yj50
    public final t1s d() {
        fib fibVar = this.q;
        if (fibVar == null) {
            fibVar = new gib();
        }
        fib fibVar2 = fibVar;
        vi00 vi00Var = this.r;
        if (vi00Var == null) {
            vi00Var = new ri00();
        }
        vi00 vi00Var2 = vi00Var;
        u5w u5wVar = (u5w) this.y.getValue();
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        m9u0 m9u0Var = zdwVar.k;
        MultiComponentFragment multiComponentFragment = this.n;
        t1s t1sVar = new t1s(this.o, fibVar2, vi00Var2, u5wVar, multiComponentFragment, m9u0Var, this.w, ((ImReportersComponent) m7m.d(multiComponentFragment).a(fpf0.a(ImReportersComponent.class))).K().w(), (g9g0) this.z.getValue(), this.s.r().a.c);
        this.G = new WeakReference<>(t1sVar);
        return t1sVar;
    }

    public final b1s m() {
        return this.B;
    }

    public final void n(UiTrackingScreen uiTrackingScreen) {
        t1s t1sVar = this.G.get();
        if (t1sVar != null) {
            j1s j1sVar = t1sVar.z;
            if (j1sVar == null) {
                j1sVar = null;
            }
            ViewPager2 viewPager2 = t1sVar.q;
            if (viewPager2 == null) {
                viewPager2 = null;
            }
            Fragment J0 = j1sVar.J0(viewPager2.getCurrentItem());
            FragmentImpl fragmentImpl = J0 instanceof FragmentImpl ? (FragmentImpl) J0 : null;
            if (fragmentImpl != null) {
                fragmentImpl.y(uiTrackingScreen);
            }
        }
    }
}
