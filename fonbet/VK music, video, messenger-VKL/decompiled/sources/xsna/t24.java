package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.LruCache;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import xsna.cmy;

/* compiled from: AttachMusicController.java */
/* loaded from: classes3.dex */
public abstract class t24 extends Fragment {
    public final mzp0 h;
    public SparseArray<Parcelable> i;
    public c j;

    /* compiled from: AttachMusicController.java */
    public class a implements SwipeRefreshLayout.f {
        public a() {
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
        public final void h() {
            t24.this.An();
        }
    }

    /* compiled from: AttachMusicController.java */
    public class b implements cmy.a {
        public b() {
        }

        @Override // xsna.cmy.a
        public final void I2() {
            t24.this.xn();
        }
    }

    /* compiled from: AttachMusicController.java */
    public interface c {
        @Nullable
        Bundle B();

        void C();

        @NonNull
        ym40 C0();

        o24 D(RecyclerView.Adapter... adapterArr);

        void E();

        void I0(@NonNull SparseArray<Parcelable> sparseArray);

        boolean J0(@NonNull MusicTrack musicTrack);

        void L0(@NonNull Class cls);

        Long M();

        void N0(@Nullable lh3 lh3Var);

        void N2();

        void O(int i);

        void P0();

        @NonNull
        qfb0 Q0();

        void R0(@Nullable SwipeRefreshLayout.f fVar);

        @NonNull
        ArrayList S();

        @NonNull
        <T extends Fragment> T U0(@NonNull Class cls, @Nullable Bundle bundle);

        void V0(@Nullable String str);

        @NonNull
        qbb0 W0();

        void X(@NonNull t24 t24Var, @NonNull Class<? extends t24> cls, @Nullable Bundle bundle);

        void Y0(@Nullable b bVar);

        void a1(@NonNull SparseArray<Parcelable> sparseArray);

        void b0(int i);

        void close();

        @Nullable
        RecyclerView.Adapter getAdapter();

        @NonNull
        String h1();

        void j0();

        void j1(@NonNull d dVar);

        void k0(@Nullable i3u i3uVar);

        void l();

        void l0(@NonNull d dVar);

        void l1();

        void m(@Nullable kb kbVar);

        p24 n0(List list);

        void o1(@NonNull Bundle bundle);

        void p(@Nullable String str);

        void p0();

        UserId q();

        u2b0 r();

        void setAdapter(@Nullable RecyclerView.Adapter adapter);

        void setRefreshing(boolean z);

        void x0();

        boolean z();
    }

    /* compiled from: AttachMusicController.java */
    public interface d {
        void a(@NonNull String str);
    }

    /* compiled from: AttachMusicController.java */
    public interface e {
        void onClick();
    }

    public t24() {
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        this.h = (mzp0) rzp0.b(UiMeasuringScreen.MUSIC_PLAYLIST_ADD_TRACK, null, true, false, null, null, qsk0.a).j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.j = (c) context;
        mzp0 mzp0Var = this.h;
        mzp0Var.init();
        mzp0Var.start();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Cn();
        if (this.i == null && bundle != null) {
            this.i = bundle.getSparseParcelableArray("Controller.key.recyclerState");
        }
        SparseArray<Parcelable> sparseArray = this.i;
        if (sparseArray != null) {
            this.j.I0(sparseArray);
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (this.i == null) {
            this.i = new SparseArray<>();
        }
        this.j.a1(this.i);
        Dn();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.j = null;
        this.h.g();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.j.N0(null);
        this.j.m(null);
        this.j.R0(null);
        this.j.Y0(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.j.N0(new lh3(this, 1));
        this.j.m(new kb(this, 4));
        this.j.R0(new a());
        this.j.Y0(new b());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        SparseArray<Parcelable> sparseArray = this.i;
        if (sparseArray != null) {
            bundle.putSparseParcelableArray("Controller.key.recyclerState", sparseArray);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.h.e(view);
    }

    public final void tn() {
        this.j.x0();
    }

    public final void un(@NonNull Class<? extends t24> cls, @Nullable Bundle bundle) {
        this.j.X(this, cls, bundle);
    }

    public boolean vn() {
        return false;
    }

    public final void wn() {
        View view = getView();
        if (view != null) {
            mzp0 mzp0Var = this.h;
            mzp0Var.d(view);
            mzp0Var.h();
        }
    }

    public final void zn() {
        this.h.a();
    }

    public void An() {
    }

    public void Bn() {
    }

    public void Cn() {
    }

    public void Dn() {
    }

    public void xn() {
    }

    public void yn() {
    }

    public void En(@NonNull String str) {
    }
}
