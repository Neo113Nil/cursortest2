package xsna;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.e;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.t24;
import xsna.ym40;

/* compiled from: MyMusicController.java */
/* loaded from: classes3.dex */
public final class qo50 extends t24 implements ym40.b {
    public VkGroupHeader k;
    public utt0 l;
    public utt0 m;
    public utt0 n;
    public d920 o;
    public utt0 p;
    public m550 q;
    public utt0 r;
    public boolean t;
    public final po50 s = new t24.d() { // from class: xsna.po50
        @Override // xsna.t24.d
        public final void a(String str) {
            if (TextUtils.isGraphic(str)) {
                qo50.this.un(ro50.class, null);
            }
        }
    };
    public e.a u = null;

    @Override // xsna.ym40.b
    public final void A6(@NonNull ym40 ym40Var) {
        this.h.c(false);
        Fn(ym40Var);
        wn();
    }

    @Override // xsna.t24
    public final void An() {
        ym40 C0 = this.j.C0();
        int i = C0.j;
        if (i == 0) {
            i = 100;
        }
        C0.tn(0, i, true);
    }

    @Override // xsna.t24
    public final void Bn() {
        if (this.t) {
            this.j.l1();
            return;
        }
        this.t = true;
        Gn();
        this.j.P0();
    }

    @Override // xsna.t24
    public final void Cn() {
        Bundle B = this.j.B();
        if (B != null) {
            boolean z = B.getBoolean("Search.expanded");
            this.t = z;
            if (!z) {
                mhy.b(mo2getContext());
            }
            this.j.p0();
        }
        if (this.o == null) {
            LayoutInflater from = LayoutInflater.from(mo2getContext());
            this.p = new utt0(new mi10(this, 8), (cnh) null, 1);
            t24.c cVar = this.j;
            this.q = new m550(cVar, cVar.r());
            this.r = new utt0(from, R.layout.music_footer_loading, 3);
            this.m = new utt0(new mm1(17, from, new hp30(this, 3)), (cnh) null, 0);
            this.n = h940.a(R.string.music_my_music_empty_text, from);
            this.l = new utt0(from, R.layout.music_loader, 0);
            d920 y0 = d920.y0(this.p, this.q, this.r);
            this.o = y0;
            y0.setHasStableIds(true);
        }
        this.j.V0(null);
        this.j.l0(this.s);
        ym40 C0 = this.j.C0();
        if (C0.p == null) {
            C0.p = new ArrayList();
        }
        C0.p.add(this);
        this.u = this.j.D(this.q);
        this.j.r().P0(this.u, true);
        Fn(this.j.C0());
        Gn();
    }

    @Override // xsna.t24
    public final void Dn() {
        this.k = null;
        this.j.j1(this.s);
        ArrayList arrayList = this.j.C0().p;
        if (arrayList != null) {
            arrayList.remove(this);
        }
        this.j.r().n0(this.u);
    }

    @Override // xsna.t24
    public final void En(@NonNull String str) {
        this.j.V0(str);
        this.j.P0();
    }

    public final void Fn(@NonNull ym40 ym40Var) {
        ArrayList<MusicTrack> arrayList = ym40Var.n;
        this.q.g = this.j.n0(arrayList);
        if (arrayList == null) {
            if (ym40Var.o == null) {
                RecyclerView.Adapter adapter = this.j.getAdapter();
                utt0 utt0Var = this.l;
                if (adapter != utt0Var) {
                    this.j.setAdapter(utt0Var);
                    return;
                }
                return;
            }
            RecyclerView.Adapter adapter2 = this.j.getAdapter();
            utt0 utt0Var2 = this.m;
            if (adapter2 != utt0Var2) {
                this.j.setAdapter(utt0Var2);
                return;
            }
            return;
        }
        this.j.setRefreshing(false);
        if (arrayList.isEmpty()) {
            RecyclerView.Adapter adapter3 = this.j.getAdapter();
            utt0 utt0Var3 = this.n;
            if (adapter3 != utt0Var3) {
                this.j.setAdapter(utt0Var3);
                return;
            }
            return;
        }
        Hn();
        this.r.x0(ym40Var.l);
        this.q.setItems(arrayList);
        RecyclerView.Adapter adapter4 = this.j.getAdapter();
        d920 d920Var = this.o;
        if (adapter4 != d920Var) {
            this.j.setAdapter(d920Var);
        }
    }

    public final void Gn() {
        this.p.x0(!this.t);
        if (!this.t) {
            this.j.j0();
            this.j.E();
            this.j.O(R.string.music_title_attach_music);
        } else {
            if (this.j.z()) {
                this.j.l();
            } else {
                this.j.C();
            }
            this.j.b0(R.string.music_hint_search);
        }
    }

    public final void Hn() {
        if (this.k == null) {
            return;
        }
        Integer num = this.j.C0().m;
        this.k.setTitle(new VkGroupHeader.d(tq.h(tlo0.Companion, R.string.music_title_playlists), null, null, num != null ? new com.vk.core.view.components.group.header.e(String.valueOf(num)) : null, null, null, Integer.MAX_VALUE, null, null));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.t = bundle.getBoolean("MyMusicController.key.searchExpanded");
        }
    }

    @Override // xsna.t24, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("MyMusicController.key.searchExpanded", this.t);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        zn();
        ym40 C0 = this.j.C0();
        int i = C0.j;
        if (i == 0) {
            i = 100;
        }
        C0.tn(0, i, true);
    }

    @Override // xsna.ym40.b
    public final void si(@NonNull ym40 ym40Var, @NonNull ArrayList arrayList) {
        this.q.n0(arrayList);
        this.r.x0(ym40Var.l);
    }

    @Override // xsna.t24
    public final boolean vn() {
        if (!this.t) {
            return false;
        }
        this.t = false;
        Gn();
        mhy.b(mo2getContext());
        return true;
    }

    @Override // xsna.t24
    public final void xn() {
        if (this.j.C0().l) {
            ym40 C0 = this.j.C0();
            C0.tn(C0.j, 100, false);
        }
    }

    @Override // xsna.ym40.b
    public final void yb(@NonNull ym40 ym40Var) {
        this.h.f();
        Fn(ym40Var);
    }

    @Override // xsna.t24
    public final void yn() {
        if (!this.t) {
            this.j.close();
            return;
        }
        this.t = false;
        Gn();
        mhy.b(mo2getContext());
    }
}
