package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.log.L;
import com.vk.music.player.e;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.qbb0;
import xsna.t24;

/* compiled from: PlaylistMusicController.java */
/* loaded from: classes3.dex */
public final class mbb0 extends t24 implements qbb0.a {
    public utt0 k;
    public utt0 l;
    public utt0 m;
    public d920 n;
    public m550 o;
    public utt0 p;
    public Playlist q;
    public e.a r;

    @Override // xsna.qbb0.a
    public final void A5(@NonNull qbb0 qbb0Var, @NonNull ArrayList arrayList) {
        this.o.n0(arrayList);
        this.p.x0(qbb0Var.l);
    }

    @Override // xsna.t24
    public final void An() {
        qbb0 W0 = this.j.W0();
        int i = W0.k;
        if (i == 0) {
            i = 100;
        }
        W0.tn(0, i);
    }

    @Override // xsna.t24
    public final void Cn() {
        if (this.n == null) {
            LayoutInflater from = LayoutInflater.from(mo2getContext());
            t24.c cVar = this.j;
            this.o = new m550(cVar, cVar.r());
            this.p = new utt0(from, R.layout.music_footer_loading, 2);
            this.l = new utt0(new mm1(17, from, new tzv(this, 24)), (cnh) null, 0);
            this.m = h940.a(R.string.music_playlist_empty_text, from);
            this.k = new utt0(from, R.layout.music_loader, 0);
            d920 y0 = d920.y0(this.o, this.p);
            this.n = y0;
            y0.setHasStableIds(true);
        }
        this.j.N2();
        this.j.C();
        t24.c cVar2 = this.j;
        Playlist playlist = this.q;
        cVar2.p(playlist != null ? playlist.h : null);
        qbb0 W0 = this.j.W0();
        if (W0.o == null) {
            W0.o = new ArrayList();
        }
        W0.o.add(this);
        this.r = this.j.D(this.o);
        this.j.r().P0(this.r, true);
        Fn(this.j.W0());
        mhy.b(mo2getContext());
    }

    @Override // xsna.t24
    public final void Dn() {
        ArrayList arrayList = this.j.W0().o;
        if (arrayList != null) {
            arrayList.remove(this);
        }
        this.j.r().n0(this.r);
    }

    public final void Fn(@NonNull qbb0 qbb0Var) {
        ArrayList<MusicTrack> arrayList = qbb0Var.m;
        this.o.setItems(arrayList);
        if (arrayList == null) {
            if (qbb0Var.n == null) {
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
        this.p.x0(qbb0Var.l);
        this.o.g = this.j.n0(arrayList);
        RecyclerView.Adapter adapter4 = this.j.getAdapter();
        d920 d920Var = this.n;
        if (adapter4 != d920Var) {
            this.j.setAdapter(d920Var);
        }
    }

    @Override // xsna.qbb0.a
    public final void Q8(@NonNull qbb0 qbb0Var) {
        this.h.f();
        Fn(qbb0Var);
    }

    @Override // xsna.qbb0.a
    public final void dd(@NonNull qbb0 qbb0Var) {
        this.h.c(false);
        Fn(qbb0Var);
        wn();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Playlist playlist = (Playlist) getArguments().getParcelable("PlaylistMusicController.arg.playlist");
        this.q = playlist;
        if (playlist == null) {
            L.G("vk", "PlaylistMusicController: Playlist must be passed as an argument");
            return;
        }
        qbb0 W0 = this.j.W0();
        Playlist playlist2 = this.q;
        if (playlist2.equals(W0.h)) {
            return;
        }
        W0.h = playlist2;
        io.reactivex.rxjava3.disposables.c cVar = W0.i;
        if (cVar != null) {
            cVar.dispose();
            W0.i = null;
        }
        W0.k = 0;
        W0.l = true;
        W0.m = null;
        W0.n = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        zn();
        qbb0 W0 = this.j.W0();
        int i = W0.k;
        if (i == 0) {
            i = 100;
        }
        W0.tn(0, i);
    }

    @Override // xsna.t24
    public final void xn() {
        if (this.j.W0().l) {
            qbb0 W0 = this.j.W0();
            W0.tn(W0.k, 100);
        }
    }

    @Override // xsna.t24
    public final void yn() {
        tn();
    }
}
