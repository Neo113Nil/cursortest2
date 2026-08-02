package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.id.UserId;
import com.vk.music.attach.dto.MusicSearchResult;
import com.vk.music.player.e;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.g550;
import xsna.t24;

/* compiled from: MyMusicSearchController.java */
/* loaded from: classes3.dex */
public final class ro50 extends yoh0 implements g550.b {
    public utt0 o;
    public utt0 p;
    public utt0 q;
    public d920 r;
    public m550 s;
    public utt0 t;
    public m550 u;
    public utt0 v;
    public g550 w;
    public e.a x;

    @Override // xsna.t24
    public final void An() {
        this.w.un();
    }

    @Override // xsna.t24
    public final void Cn() {
        if (this.r == null) {
            LayoutInflater from = LayoutInflater.from(mo2getContext());
            this.w.getClass();
            t24.c cVar = this.j;
            this.s = new m550(cVar, cVar.r());
            this.t = new utt0(new l140(1), (cnh) null, 1);
            t24.c cVar2 = this.j;
            this.u = new m550(cVar2, cVar2.r());
            this.v = new utt0(from, R.layout.music_footer_loading, 4);
            this.p = new utt0(new mm1(17, from, new k7z(this, 8)), (cnh) null, 0);
            this.q = h940.a(R.string.music_search_empty_result, from);
            this.o = new utt0(from, R.layout.music_loader, 0);
            d920 y0 = d920.y0(this.s, this.t, this.u, this.v);
            this.r = y0;
            y0.setHasStableIds(true);
        }
        this.j.C();
        this.j.b0(R.string.music_hint_search);
        this.x = this.j.D(this.s, this.u);
        this.j.r().P0(this.x, true);
        g550 g550Var = this.w;
        g550Var.i = this.j.h1().trim();
        io.reactivex.rxjava3.disposables.c cVar3 = g550Var.j;
        if (cVar3 != null) {
            cVar3.dispose();
            g550Var.j = null;
        }
        g550 g550Var2 = this.w;
        if (g550Var2.p == null) {
            g550Var2.p = new ArrayList();
        }
        g550Var2.p.add(this);
        Hn();
    }

    @Override // xsna.yoh0, xsna.t24
    public final void Dn() {
        super.Dn();
        ArrayList arrayList = this.w.p;
        if (arrayList != null) {
            arrayList.remove(this);
        }
        this.j.r().n0(this.x);
    }

    @Override // xsna.yoh0
    public final void Fn() {
        tn();
    }

    @Override // xsna.yoh0
    public final void Gn() {
        this.j.setAdapter(this.o);
        zn();
        g550 g550Var = this.w;
        g550Var.i = this.j.h1().trim();
        io.reactivex.rxjava3.disposables.c cVar = g550Var.j;
        if (cVar != null) {
            cVar.dispose();
            g550Var.j = null;
        }
        this.w.un();
    }

    public final void Hn() {
        g550 g550Var = this.w;
        MusicSearchResult musicSearchResult = g550Var.m;
        if (musicSearchResult == null) {
            if (g550Var.n == null) {
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
        this.u.g = this.j.n0(musicSearchResult.c);
        this.s.g = this.j.n0(musicSearchResult.b);
        if (ad0.u(musicSearchResult.b) && ad0.u(musicSearchResult.c)) {
            RecyclerView.Adapter adapter3 = this.j.getAdapter();
            utt0 utt0Var3 = this.q;
            if (adapter3 != utt0Var3) {
                this.j.setAdapter(utt0Var3);
                return;
            }
            return;
        }
        this.v.x0(this.w.l);
        this.s.setItems(musicSearchResult.b);
        this.t.x0(!ad0.u(musicSearchResult.c));
        this.u.setItems(musicSearchResult.c);
        RecyclerView.Adapter adapter4 = this.j.getAdapter();
        d920 d920Var = this.r;
        if (adapter4 != d920Var) {
            this.j.setAdapter(d920Var);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        t24.c cVar = this.j;
        UserId q = cVar.q();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("MusicSearchResultsLoader.key.ownerId", q);
        this.w = (g550) cVar.U0(g550.class, bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.w = null;
        this.j.L0(g550.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (this.w.m == null) {
            zn();
            this.w.un();
        }
    }

    @Override // xsna.g550.b
    public final void pg() {
        this.h.c(false);
        Hn();
        wn();
    }

    @Override // xsna.g550.b
    public final void qa(@NonNull g550 g550Var, @NonNull MusicSearchResult musicSearchResult) {
        if (!ad0.u(musicSearchResult.b)) {
            this.s.n0(musicSearchResult.b);
        }
        if (!ad0.u(musicSearchResult.c)) {
            this.u.n0(musicSearchResult.c);
        }
        this.v.x0(g550Var.l);
    }

    @Override // xsna.g550.b
    public final void u8() {
        this.h.f();
        Hn();
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
        g550 g550Var = this.w;
        if (g550Var.l) {
            g550Var.tn(g550Var.k, 100);
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
