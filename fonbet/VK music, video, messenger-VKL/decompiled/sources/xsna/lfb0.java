package xsna;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.Playlist;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.qfb0;
import xsna.t24;

/* compiled from: PlaylistsController.java */
/* loaded from: classes3.dex */
public final class lfb0 extends t24 implements qfb0.a {
    public utt0 k;
    public utt0 l;
    public utt0 m;
    public d920 n;
    public z6b0 o;
    public utt0 p;
    public final jfb0 q = new t24.d() { // from class: xsna.jfb0
        @Override // xsna.t24.d
        public final void a(String str) {
            if (TextUtils.isGraphic(str)) {
                lfb0.this.un(tfb0.class, null);
            }
        }
    };
    public boolean r;

    @Override // xsna.t24
    public final void An() {
        qfb0 Q0 = this.j.Q0();
        int i = Q0.j;
        if (i == 0) {
            i = 100;
        }
        Q0.tn(0, i);
    }

    @Override // xsna.t24
    public final void Bn() {
        if (this.r) {
            this.j.l1();
            return;
        }
        this.r = true;
        Gn();
        this.j.P0();
    }

    @Override // xsna.t24
    public final void Cn() {
        Bundle B = this.j.B();
        if (B != null) {
            this.r = B.getBoolean("Search.expanded");
            this.j.p0();
        }
        if (this.n == null) {
            LayoutInflater from = LayoutInflater.from(mo2getContext());
            d920 d920Var = new d920();
            this.n = d920Var;
            d920Var.setHasStableIds(true);
            z6b0 z6b0Var = new z6b0(new kfb0(this), true, this.j.M().longValue());
            this.o = z6b0Var;
            this.n.x0(z6b0Var);
            utt0 utt0Var = new utt0(from, R.layout.music_footer_loading, 2);
            this.p = utt0Var;
            this.n.x0(utt0Var);
            this.l = new utt0(new com.vk.movika.sdk.base.ui.s0(22, this, from), (cnh) null, 0);
            this.m = new utt0(new dn20(from, 16), (cnh) null, 0);
            this.k = new utt0(from, R.layout.music_loader, 0);
        }
        this.j.N2();
        this.j.V0(null);
        this.j.l0(this.q);
        qfb0 Q0 = this.j.Q0();
        if (Q0.o == null) {
            Q0.o = new ArrayList();
        }
        Q0.o.add(this);
        Fn(this.j.Q0());
        Gn();
        if (this.r) {
            this.j.P0();
        } else {
            mhy.b(mo2getContext());
        }
    }

    @Override // xsna.t24
    public final void Dn() {
        this.j.j1(this.q);
        ArrayList arrayList = this.j.Q0().o;
        if (arrayList != null) {
            arrayList.remove(this);
        }
    }

    @Override // xsna.t24
    public final void En(@NonNull String str) {
        this.j.V0(str);
        this.j.P0();
    }

    @Override // xsna.qfb0.a
    public final void F7(@NonNull qfb0 qfb0Var) {
        this.h.c(false);
        Fn(qfb0Var);
        wn();
    }

    @Override // xsna.qfb0.a
    public final void Fc(@NonNull qfb0 qfb0Var) {
        this.h.f();
        Fn(qfb0Var);
    }

    public final void Fn(@NonNull qfb0 qfb0Var) {
        ArrayList<Playlist> arrayList = qfb0Var.m;
        if (arrayList == null) {
            if (qfb0Var.n == null) {
                RecyclerView.Adapter adapter = this.j.getAdapter();
                utt0 utt0Var = this.k;
                if (adapter != utt0Var) {
                    this.j.setAdapter(utt0Var);
                    return;
                }
                return;
            }
            RecyclerView.Adapter adapter2 = this.j.getAdapter();
            utt0 utt0Var2 = this.l;
            if (adapter2 != utt0Var2) {
                this.j.setAdapter(utt0Var2);
                return;
            }
            return;
        }
        this.j.setRefreshing(false);
        if (arrayList.isEmpty()) {
            RecyclerView.Adapter adapter3 = this.j.getAdapter();
            utt0 utt0Var3 = this.m;
            if (adapter3 != utt0Var3) {
                this.j.setAdapter(utt0Var3);
                return;
            }
            return;
        }
        this.p.x0(qfb0Var.l);
        this.o.setItems(arrayList);
        RecyclerView.Adapter adapter4 = this.j.getAdapter();
        d920 d920Var = this.n;
        if (adapter4 != d920Var) {
            this.j.setAdapter(d920Var);
        }
    }

    public final void Gn() {
        if (!this.r) {
            this.j.E();
            this.j.O(R.string.music_title_playlists);
        } else {
            if (this.j.z()) {
                this.j.l();
            } else {
                this.j.C();
            }
            this.j.b0(R.string.music_hint_playlist_search);
        }
    }

    @Override // xsna.qfb0.a
    public final void mm(@NonNull qfb0 qfb0Var, @NonNull VKList vKList) {
        this.o.n0(vKList);
        this.p.x0(qfb0Var.l);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.r = bundle.getBoolean("PlaylistsController.key.searchExpanded");
        }
    }

    @Override // xsna.t24, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("PlaylistsController.key.searchExpanded", this.r);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        zn();
        qfb0 Q0 = this.j.Q0();
        int i = Q0.j;
        if (i == 0) {
            i = 100;
        }
        Q0.tn(0, i);
    }

    @Override // xsna.t24
    public final boolean vn() {
        if (!this.r) {
            return false;
        }
        this.r = false;
        Gn();
        mhy.b(mo2getContext());
        return true;
    }

    @Override // xsna.t24
    public final void xn() {
        if (this.j.Q0().l) {
            qfb0 Q0 = this.j.Q0();
            Q0.tn(Q0.j, 100);
        }
    }

    @Override // xsna.t24
    public final void yn() {
        if (!this.r) {
            tn();
            return;
        }
        this.r = false;
        Gn();
        mhy.b(mo2getContext());
    }
}
