package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.m;
import androidx.viewpager2.widget.ViewPager2;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.Peer;
import com.vk.folders.impl.common.loader.CommonFolderDialogsListConfigToken;
import com.vk.folders.impl.common.loader.FolderDialogsListConfigToken;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.features.ImFeatures;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import xsna.stl;

/* compiled from: FoldersPagerAdapter.kt */
/* loaded from: classes18.dex */
public final class j1s extends k1q0 {
    public static final b E = new b();
    public final stl A;
    public long B;
    public final androidx.recyclerview.widget.d<xyr> C;
    public final FragmentManager D;
    public final wuj s;
    public final fib t;
    public final vi00 u;
    public final u5w v;
    public final ViewPager2 w;
    public final Peer x;
    public int y;
    public int z;

    /* compiled from: FoldersPagerAdapter.kt */
    public static final class a extends ViewPager2.g {
        public a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrollStateChanged(int i) {
            j1s j1sVar = j1s.this;
            j1sVar.z = j1sVar.y;
            j1sVar.y = i;
        }
    }

    /* compiled from: FoldersPagerAdapter.kt */
    public static final class b extends m.e<xyr> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(xyr xyrVar, xyr xyrVar2) {
            xyr xyrVar3 = xyrVar;
            xyr xyrVar4 = xyrVar2;
            return epx.f(xyrVar3.getName(), xyrVar4.getName()) && epx.f(xyrVar3.a(), xyrVar4.a());
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(xyr xyrVar, xyr xyrVar2) {
            xyr xyrVar3 = xyrVar;
            xyr xyrVar4 = xyrVar2;
            return xyrVar3.getId() == xyrVar4.getId() && xyrVar3.getType() == xyrVar4.getType();
        }
    }

    /* compiled from: FoldersPagerAdapter.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FolderType.values().length];
            try {
                iArr[FolderType.CHANNELS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FolderType.MANAGED_GROUPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j1s(Fragment fragment, wuj wujVar, fib fibVar, vi00 vi00Var, u5w u5wVar, ViewPager2 viewPager2, Peer peer) {
        super(fragment, viewPager2, r0.D, r0.getChildFragmentManager());
        FragmentImpl fragmentImpl = (FragmentImpl) fragment;
        this.s = wujVar;
        this.t = fibVar;
        this.u = vi00Var;
        this.v = u5wVar;
        this.w = viewPager2;
        this.x = peer;
        stl stlVar = new stl();
        this.A = stlVar;
        e eVar = new e();
        viewPager2.b(new a());
        stlVar.b.add(eVar);
        b bVar = E;
        synchronized (c.a.a) {
            try {
                if (c.a.b == null) {
                    asu0.a.getClass();
                    ExecutorService D = asu0.D();
                    c.a.b = D == null ? Executors.newFixedThreadPool(2) : D;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.C = new androidx.recyclerview.widget.d<>(stlVar, new androidx.recyclerview.widget.c(null, c.a.b, bVar));
        this.D = fragment.getChildFragmentManager();
    }

    @Override // xsna.k1q0
    public final boolean H0() {
        return (this.z == 0 && this.y == 1) ? false : true;
    }

    public final Fragment J0(int i) {
        return this.D.H(InneractiveMediationDefs.GENDER_FEMALE + getItemId(i));
    }

    public final void K0(int i, int i2, int i3) {
        int i4 = i3 - 1;
        if (i2 > i4) {
            return;
        }
        while (true) {
            G0(F0(i4), i4 + i);
            if (i4 == i2) {
                return;
            } else {
                i4--;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.C.f.size();
    }

    @Override // xsna.scs, androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        if (i < 0) {
            return -1L;
        }
        if (i < this.C.f.size()) {
            return r0.f.get(i).getId() + 1 + this.B;
        }
        return -1L;
    }

    @Override // xsna.scs
    public final boolean y0(long j) {
        List<xyr> list = this.C.f;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((xyr) it.next()).getId() == (j - 1) - this.B) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.scs
    public final Fragment z0(int i) {
        Fragment h;
        xyr xyrVar = this.C.f.get(i);
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"Folders", "Fragment creation for folderId: " + xyrVar.getId() + " folder type: " + xyrVar.getType() + " position: " + i});
        }
        Fragment F0 = F0(i);
        if (F0 == null || F0.getView() == null) {
            int i2 = d.$EnumSwitchMapping$0[xyrVar.getType().ordinal()];
            if (i2 == 1) {
                h = this.t.h();
            } else if (i2 != 2) {
                int id = xyrVar.getId();
                wuj wujVar = this.s;
                Peer peer = this.x;
                if (id == -1) {
                    ImFeatures imFeatures = ImFeatures.CHANNELS_IN_ALL_FOLDER;
                    imFeatures.getClass();
                    if (com.vk.toggle.b.A.a(imFeatures)) {
                        peer.getClass();
                        if (!peer.Ab(Peer.Type.GROUP)) {
                            h = this.v.a();
                        }
                    }
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("custom_config_token", new CommonFolderDialogsListConfigToken());
                    bundle.putParcelable("owner_id", peer);
                    h = wujVar.g(bundle);
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("custom_config_token", new FolderDialogsListConfigToken(id));
                    bundle2.putParcelable("owner_id", peer);
                    bundle2.putParcelable("folder_type", xyrVar.getType());
                    h = wujVar.g(bundle2);
                }
            } else {
                h = this.u.a();
            }
            F0 = h;
        }
        if (F0 instanceof FragmentImpl) {
            FragmentImpl fragmentImpl = (FragmentImpl) F0;
            fragmentImpl.D.a(new c(fragmentImpl));
        }
        G0(F0, i);
        return F0;
    }

    /* compiled from: FoldersPagerAdapter.kt */
    public final class c implements obs {
        public final FragmentImpl b;

        public c(FragmentImpl fragmentImpl) {
            this.b = fragmentImpl;
        }

        @Override // xsna.obs
        public final void onDestroy() {
            j1s j1sVar = j1s.this;
            j1sVar.w.post(new nek(1, j1sVar, this));
            this.b.D.d(this);
        }

        @Override // xsna.obs
        public final void b() {
        }

        @Override // xsna.obs
        public final void c() {
        }

        @Override // xsna.obs
        public final void onDestroyView() {
        }

        @Override // xsna.obs
        public final void onPause() {
        }

        @Override // xsna.obs
        public final void onResume() {
        }

        @Override // xsna.obs
        public final void onStop() {
        }

        @Override // xsna.obs
        public final void onConfigurationChanged(Configuration configuration) {
        }

        @Override // xsna.obs
        public final void onCreate(Bundle bundle) {
        }

        @Override // xsna.obs
        public final void onActivityResult(int i, int i2, Intent intent) {
        }
    }

    /* compiled from: FoldersPagerAdapter.kt */
    public static final class e implements stl.a {
        public e() {
        }

        @Override // xsna.ggz
        public final void onInserted(int i, int i2) {
            j1s j1sVar = j1s.this;
            if (i <= j1sVar.C.f.size() && !j1sVar.D.c.f().isEmpty()) {
                j1sVar.K0(i2, i, e43.h(j1sVar.C.f));
            }
            int i3 = i + i2;
            for (int i4 = i; i4 < i3; i4++) {
                j1sVar.G0(null, i4);
            }
            j1sVar.notifyItemRangeInserted(i, i2);
        }

        @Override // xsna.ggz
        public final void onMoved(int i, int i2) {
            j1s j1sVar = j1s.this;
            Fragment F0 = j1sVar.F0(i);
            if (i > i2) {
                j1sVar.K0(1, i2, i);
                j1sVar.G0(F0, i2);
            } else {
                j1sVar.removeItem(i);
                j1sVar.K0(1, i2, j1sVar.C.f.size() - 1);
                j1sVar.G0(F0, i2);
            }
            j1sVar.notifyItemMoved(i, i2);
        }

        @Override // xsna.ggz
        public final void onRemoved(int i, int i2) {
            int i3 = 0;
            while (true) {
                j1s j1sVar = j1s.this;
                if (i3 >= i2) {
                    j1sVar.notifyItemRangeRemoved(i, i2);
                    return;
                } else {
                    j1sVar.removeItem(i);
                    i3++;
                }
            }
        }

        @Override // xsna.ggz
        public final void onChanged(int i, int i2, Object obj) {
        }
    }
}
