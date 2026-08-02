package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.attachpicker.fragment.gallery.PostingAttachGalleryFragment;
import com.vk.attachpicker.fragment.gallery.a;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.permission.PermissionHelper;
import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import xsna.fhc0;
import xsna.tvo;

/* compiled from: PostingAttachGalleryPresenter.kt */
/* loaded from: classes15.dex */
public final class dcc0 implements a.InterfaceC0383a, tvo.a, nht, t680, w8i {
    public static final String[] s = {"android.permission.CAMERA"};
    public final PostingAttachGalleryFragment b;
    public ik90 d;
    public s8g0 e;
    public int f;
    public volatile int j;
    public final String m;
    public final yz10 n;
    public com.vk.lists.c o;
    public final Object p;
    public final bpn0 q;
    public hb0<nha0> r;
    public final com.vk.attachpicker.c c = new com.vk.attachpicker.c();
    public int g = 10;
    public final int h = 100;
    public final LinkedHashMap i = new LinkedHashMap();
    public volatile List<AlbumEntry> k = EmptyList.b;
    public final int l = 111;

    public dcc0(PostingAttachGalleryFragment postingAttachGalleryFragment) {
        this.b = postingAttachGalleryFragment;
        Context context = e43.a;
        this.m = (context == null ? null : context).getString(R.string.picker_all_photos_videos);
        bpn0 bpn0Var = iz10.a;
        Context context2 = e43.a;
        this.n = iz10.a(context2 != null ? context2 : null);
        this.p = msy.a(LazyThreadSafetyMode.NONE, new ko00(this, 21));
        this.q = new bpn0(new wt30(this, 9));
    }

    @Override // xsna.nht
    public final void K0(int i, String[] strArr) {
        s8g0 s8g0Var = this.e;
        if (s8g0Var != null) {
            s8g0Var.K0(i, strArr);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.attachpicker.fragment.gallery.a.InterfaceC0383a
    public final void a() {
        d();
        e().g();
        jbc0 jbc0Var = (jbc0) this.p.getValue();
        if (jbc0Var != null) {
            SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
            jbc0Var.g();
        }
    }

    @Override // xsna.hk90
    public final void b() {
        ik90 ik90Var = this.d;
        if (ik90Var != null) {
            ik90Var.b();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.attachpicker.fragment.gallery.a.InterfaceC0383a
    public final void c() {
        PermissionHelper.f(PermissionHelper.a, this.b.getActivity(), s, R.string.newsfeed_newpost_permissions_camera_video, R.string.newsfeed_newpost_permissions_camera_video_settings, new hvz(this, 26), null, 32);
        e().g();
        jbc0 jbc0Var = (jbc0) this.p.getValue();
        if (jbc0Var != null) {
            SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
            jbc0Var.g();
        }
    }

    public final void d() {
        Triple triple;
        PostingAttachGalleryFragment postingAttachGalleryFragment = this.b;
        FragmentActivity activity = postingAttachGalleryFragment.getActivity();
        if (activity == null) {
            return;
        }
        PermissionHelper permissionHelper = PermissionHelper.a;
        String[] strArr = PermissionHelper.l;
        permissionHelper.getClass();
        if (PermissionHelper.b(activity, strArr)) {
            triple = new Triple(new String[0], 0, 0);
        } else {
            String[] strArr2 = PermissionHelper.i;
            triple = PermissionHelper.b(activity, strArr2) ? new Triple(strArr, Integer.valueOf(R.string.newsfeed_newpost_permissions_camera), Integer.valueOf(R.string.newsfeed_newpost_permissions_camera_settings)) : new Triple(jw5.z(strArr, strArr2), Integer.valueOf(R.string.vk_permissions_intent_photo_with_location), Integer.valueOf(R.string.vk_permissions_intent_photo_with_location_settings));
        }
        PermissionHelper.f(permissionHelper, postingAttachGalleryFragment.getActivity(), (String[]) triple.d(), ((Number) triple.g()).intValue(), ((Number) triple.h()).intValue(), new vt30(this, 19), null, 32);
    }

    public final fhc0.b e() {
        return (fhc0.b) this.q.getValue();
    }

    @Override // xsna.t680
    public final void f(int i) {
        FragmentActivity activity;
        PostingAttachGalleryFragment postingAttachGalleryFragment = this.b;
        com.vk.attachpicker.fragment.gallery.a aVar = postingAttachGalleryFragment.U;
        if (aVar == null || (activity = postingAttachGalleryFragment.getActivity()) == null) {
            return;
        }
        com.vk.core.simplescreen.a aVar2 = postingAttachGalleryFragment.e0;
        if (aVar2 == null) {
            aVar2 = new com.vk.core.simplescreen.a(activity, false, false);
            postingAttachGalleryFragment.e0 = aVar2;
        }
        com.vk.core.simplescreen.a aVar3 = aVar2;
        if (aVar3.isShowing()) {
            return;
        }
        aVar3.show();
        List<Object> y0 = aVar.y0();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) y0).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof MediaStoreEntry) {
                arrayList.add(next);
            }
        }
        Iterator it2 = ((ArrayList) aVar.y0()).iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i2 = -1;
                break;
            } else if (it2.next() instanceof MediaStoreEntry) {
                break;
            } else {
                i2++;
            }
        }
        int i3 = i - i2;
        int i4 = i3 < 0 ? 0 : i3;
        dcc0 dcc0Var = postingAttachGalleryFragment.k0;
        com.vk.attachpicker.screen.p pVar = new com.vk.attachpicker.screen.p(arrayList, i4, dcc0Var != null ? dcc0Var.c : null, postingAttachGalleryFragment, false, aVar3, rwi.d().p().a(postingAttachGalleryFragment));
        pVar.j.b = false;
        pVar.T = (j34) postingAttachGalleryFragment.getActivity();
        aVar3.b(pVar);
        pVar.K();
        postingAttachGalleryFragment.f0 = pVar;
    }

    public final void g() {
        final yz10 yz10Var = this.n;
        yz10Var.getClass();
        final int i = this.l;
        final String str = this.m;
        io.reactivex.rxjava3.internal.operators.observable.q qVar = new io.reactivex.rxjava3.internal.operators.observable.q(new io.reactivex.rxjava3.core.s() { // from class: xsna.kz10
            @Override // io.reactivex.rxjava3.core.s
            public final void subscribe(io.reactivex.rxjava3.core.r rVar) {
                yz10.this.a.g(i, str, false, new kl4(0, rVar, io.reactivex.rxjava3.core.r.class, "isDisposed", "isDisposed()Z", 0, 2), new wg1(1, rVar, io.reactivex.rxjava3.core.r.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 14), new vxv(0, rVar, io.reactivex.rxjava3.core.r.class, "onComplete", "onComplete()V", 0, 1));
            }
        });
        asu0 asu0Var = asu0.a;
        this.b.eo(qVar.r0(asu0Var.c()).a0(asu0Var.d()).U(new n8c0(new acc0(0), 1)).U(new i3u(new ba40(this, 13), 9)).subscribe());
    }

    public final void h(AlbumEntry albumEntry, int i, boolean z) {
        if (z) {
            e().f();
        }
        if (albumEntry.b != -102) {
            this.b.mo(i);
            this.j = i;
            com.vk.lists.c cVar = this.o;
            if (cVar != null) {
                cVar.p(false);
                return;
            }
            return;
        }
        this.b.mo(this.j);
        PostingAttachGalleryFragment postingAttachGalleryFragment = this.b;
        f540 f540Var = new f540(this, 14);
        RecyclerPaginatedView recyclerPaginatedView = postingAttachGalleryFragment.g0;
        if (recyclerPaginatedView != null) {
            recyclerPaginatedView.postDelayed(new vq3(f540Var, 11), 200L);
        }
    }

    @Override // xsna.h90.a
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        s8g0 s8g0Var = this.e;
        if (s8g0Var != null) {
            s8g0Var.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // xsna.tvo.a
    public final void pc(int i, List<String> list) {
        s8g0 s8g0Var = this.e;
        if (s8g0Var != null) {
            s8g0Var.pc(i, list);
        }
    }

    @Override // xsna.tvo.a
    public final void wi(int i, List<String> list) {
        s8g0 s8g0Var = this.e;
        if (s8g0Var != null) {
            s8g0Var.wi(i, list);
        }
    }
}
