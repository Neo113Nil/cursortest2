package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.music.attach.dto.PlaylistSearchResult;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.ceb0;

/* compiled from: PlaylistsSearchController.java */
/* loaded from: classes3.dex */
public final class tfb0 extends yoh0 implements ceb0.a {
    public utt0 o;
    public utt0 p;
    public utt0 q;
    public d920 r;
    public z6b0 s;
    public utt0 t;
    public z6b0 u;
    public utt0 v;
    public ceb0 w;

    @Override // xsna.t24
    public final void An() {
        this.w.tn();
    }

    @Override // xsna.t24
    public final void Cn() {
        if (this.r == null) {
            LayoutInflater from = LayoutInflater.from(mo2getContext());
            d920 d920Var = new d920();
            this.r = d920Var;
            d920Var.setHasStableIds(true);
            z6b0 z6b0Var = new z6b0(new sfb0(this), true, this.j.M().longValue());
            this.s = z6b0Var;
            this.r.x0(z6b0Var);
            utt0 utt0Var = new utt0(new l140(1), (cnh) null, 1);
            this.t = utt0Var;
            this.r.x0(utt0Var);
            z6b0 z6b0Var2 = new z6b0(new sfb0(this), true, this.j.M().longValue());
            this.u = z6b0Var2;
            this.r.x0(z6b0Var2);
            utt0 utt0Var2 = new utt0(from, R.layout.music_footer_loading, 2);
            this.v = utt0Var2;
            this.r.x0(utt0Var2);
            this.p = new utt0(new ij8(25, this, from), (cnh) null, 0);
            this.q = h940.a(R.string.music_search_empty_result, from);
            this.o = new utt0(from, R.layout.music_loader, 0);
        }
        this.j.C();
        this.j.b0(R.string.music_hint_playlist_search);
        ceb0 ceb0Var = this.w;
        ceb0Var.h = this.j.h1().trim();
        io.reactivex.rxjava3.disposables.c cVar = ceb0Var.i;
        if (cVar != null) {
            cVar.dispose();
            ceb0Var.i = null;
        }
        ceb0 ceb0Var2 = this.w;
        if (ceb0Var2.n == null) {
            ceb0Var2.n = new ArrayList();
        }
        ceb0Var2.n.add(this);
        Hn();
        this.j.P0();
    }

    @Override // xsna.yoh0, xsna.t24
    public final void Dn() {
        super.Dn();
        ArrayList arrayList = this.w.n;
        if (arrayList != null) {
            arrayList.remove(this);
        }
    }

    @Override // xsna.yoh0
    public final void Fn() {
        tn();
    }

    @Override // xsna.yoh0
    public final void Gn() {
        this.j.setAdapter(this.o);
        zn();
        ceb0 ceb0Var = this.w;
        ceb0Var.h = this.j.h1().trim();
        io.reactivex.rxjava3.disposables.c cVar = ceb0Var.i;
        if (cVar != null) {
            cVar.dispose();
            ceb0Var.i = null;
        }
        this.w.tn();
    }

    public final void Hn() {
        ceb0 ceb0Var = this.w;
        PlaylistSearchResult playlistSearchResult = ceb0Var.l;
        if (playlistSearchResult == null) {
            if (ceb0Var.m == null) {
                RecyclerView.Adapter adapter = this.j.getAdapter();
                utt0 utt0Var = this.o;
                if (adapter != utt0Var) {
                    this.j.setAdapter(utt0Var);
                    return;
                }
                return;
            }
            RecyclerView.Adapter adapter2 = this.j.getAdapter();
            utt0 utt0Var2 = this.p;
            if (adapter2 != utt0Var2) {
                this.j.setAdapter(utt0Var2);
                return;
            }
            return;
        }
        this.j.setRefreshing(false);
        if (ad0.u(playlistSearchResult.b) && ad0.u(playlistSearchResult.c)) {
            RecyclerView.Adapter adapter3 = this.j.getAdapter();
            utt0 utt0Var3 = this.q;
            if (adapter3 != utt0Var3) {
                this.j.setAdapter(utt0Var3);
                return;
            }
            return;
        }
        this.v.x0(this.w.k);
        this.s.setItems(playlistSearchResult.b);
        this.t.x0(!ad0.u(playlistSearchResult.c));
        this.u.setItems(playlistSearchResult.c);
        RecyclerView.Adapter adapter4 = this.j.getAdapter();
        d920 d920Var = this.r;
        if (adapter4 != d920Var) {
            this.j.setAdapter(d920Var);
        }
    }

    @Override // xsna.ceb0.a
    public final void T6() {
        this.h.f();
        Hn();
    }

    @Override // xsna.ceb0.a
    public final void Xb() {
        this.h.c(false);
        Hn();
        wn();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.w = (ceb0) this.j.U0(ceb0.class, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.w = null;
        this.j.L0(ceb0.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        zn();
        this.w.tn();
    }

    @Override // xsna.ceb0.a
    public final void s4(@NonNull ceb0 ceb0Var, @NonNull PlaylistSearchResult playlistSearchResult) {
        if (!ad0.u(playlistSearchResult.b)) {
            this.s.n0(playlistSearchResult.b);
        }
        if (!ad0.u(playlistSearchResult.c)) {
            this.u.n0(playlistSearchResult.c);
        }
        this.v.x0(ceb0Var.k);
    }

    @Override // xsna.t24
    public final boolean vn() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("Search.expanded", false);
        this.j.o1(bundle);
        tn();
        return true;
    }

    @Override // xsna.t24
    public final void xn() {
        ceb0 ceb0Var = this.w;
        if (ceb0Var.k) {
            ceb0Var.un(ceb0Var.j, 100);
        }
    }

    @Override // xsna.t24
    public final void yn() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("Search.expanded", false);
        this.j.o1(bundle);
        tn();
    }
}
