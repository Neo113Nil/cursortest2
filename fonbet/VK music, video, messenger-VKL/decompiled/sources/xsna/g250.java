package xsna;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistOwner;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.fragment.impl.PlaylistsFragment;
import com.vk.music.fragment.impl.model.MusicPlaylistsModelDataContainer;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import xsna.gp4;
import xsna.k840;
import xsna.rfb0;

/* compiled from: MusicPlaylistsModelImpl.kt */
/* loaded from: classes3.dex */
public final class g250 extends tq70<rfb0.a> implements rfb0 {
    public MusicPlaylistsModelDataContainer d;
    public final PlaylistsFragment e;
    public final io.reactivex.rxjava3.disposables.c f;
    public String g;
    public io.reactivex.rxjava3.disposables.c h;

    /* compiled from: MusicPlaylistsModelImpl.kt */
    public static final class a {
        public final PlaylistsFragment a;
        public boolean b;
        public boolean c;
        public boolean d;
        public String e;
        public String f;
        public boolean g;
        public long h = -1;
        public ArrayList i;

        public a(PlaylistsFragment playlistsFragment, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
            this.a = playlistsFragment;
        }
    }

    public g250(a aVar) {
        MusicPlaylistsModelDataContainer musicPlaylistsModelDataContainer = new MusicPlaylistsModelDataContainer(false, false, false, false, null, null, null, null, 0, 0L, null, 2047, null);
        this.d = musicPlaylistsModelDataContainer;
        this.e = aVar.a;
        musicPlaylistsModelDataContainer.b = aVar.b;
        musicPlaylistsModelDataContainer.g = aVar.e;
        boolean z = aVar.c;
        musicPlaylistsModelDataContainer.c = z;
        musicPlaylistsModelDataContainer.d = aVar.d;
        musicPlaylistsModelDataContainer.e = aVar.g;
        musicPlaylistsModelDataContainer.f = aVar.f;
        musicPlaylistsModelDataContainer.k = aVar.h;
        musicPlaylistsModelDataContainer.j = z ? 3 : 0;
        musicPlaylistsModelDataContainer.l = aVar.i;
        r5v0 r5v0Var = k840.a.h;
        io.reactivex.rxjava3.internal.operators.observable.j1 b0 = (r5v0Var == null ? null : r5v0Var).a.a.b0(a9b0.class);
        lkz lkzVar = new lkz(new xmz(12), 6);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.f = b0.E(lkzVar, lVar, kVar, kVar).subscribe(new ljs(new f0z(this, 11), 11));
    }

    @Override // xsna.rfb0
    public final void A1() {
        E("");
    }

    @Override // xsna.rfb0
    public final PlaylistOwner C() {
        return this.d.h;
    }

    public final void E(String str) {
        rsg0 gp4Var;
        if (this.h != null) {
            return;
        }
        int i = this.d.j;
        Bundle arguments = this.e.getArguments();
        if (arguments.containsKey("catalogBlockId")) {
            bp4 bp4Var = new bp4(arguments.getString("catalogBlockId"), str, 20);
            gp4Var = new ap4("audio.getCatalogBlockById");
            bp4Var.c(gp4Var);
        } else {
            gp4.a aVar = new gp4.a(new UserId(arguments.getLong("ownerId", o25.a().c().b)));
            aVar.e = str;
            aVar.d = 20;
            aVar.b = i != 1 ? i != 2 ? i != 3 ? "all" : "owned" : "followed" : "albums";
            gp4Var = new gp4(aVar);
        }
        this.h = rsg0.y0(gp4Var, null, null, 3).subscribe(new s440(new kb40(this, 3), 4), new g600(new t440(this, 2), 6));
    }

    @Override // xsna.rfb0
    public final void H1(int i) {
        if (O()) {
            this.d.j = i;
            refresh();
        }
    }

    @Override // xsna.rfb0
    public final boolean O() {
        MusicPlaylistsModelDataContainer musicPlaylistsModelDataContainer = this.d;
        return (musicPlaylistsModelDataContainer.c || musicPlaylistsModelDataContainer.d) ? false : true;
    }

    @Override // xsna.rfb0
    public final boolean R0() {
        return this.d.b;
    }

    @Override // xsna.rfb0
    public final String S0() {
        return this.d.g;
    }

    @Override // xsna.rfb0
    public final int W0() {
        return this.d.j;
    }

    @Override // xsna.rfb0
    public final boolean a() {
        String str = this.d.f;
        return (str == null || str.length() == 0) ? false : true;
    }

    @Override // xsna.rfb0
    public final boolean a1() {
        return this.d.c;
    }

    @Override // xsna.rfb0
    public final void b0(rfb0.a aVar) {
        LinkedList linkedList = this.c;
        if (linkedList != null) {
            linkedList.remove(aVar);
        }
    }

    @Override // xsna.rfb0
    public final void c() {
        String str = this.d.f;
        if (str == null) {
            return;
        }
        E(str);
    }

    @Override // xsna.rfb0
    public final Long c0() {
        return Long.valueOf(this.d.k);
    }

    @Override // xsna.rfb0
    public final ArrayList d0() {
        return this.d.i;
    }

    @Override // xsna.i80
    public final Bundle e() {
        wmi0.a.a("MusicPlaylistsModelImpl.cache", this.d);
        return Bundle.EMPTY;
    }

    @Override // xsna.rfb0
    public final String getError() {
        return this.g;
    }

    @Override // xsna.rfb0
    public final List<MusicTrack> k1() {
        return this.d.l;
    }

    @Override // xsna.rfb0
    public final boolean n() {
        ArrayList<Playlist> arrayList;
        MusicPlaylistsModelDataContainer musicPlaylistsModelDataContainer = this.d;
        return musicPlaylistsModelDataContainer.e && (arrayList = musicPlaylistsModelDataContainer.i) != null && (arrayList.isEmpty() ^ true);
    }

    @Override // xsna.rfb0
    public final void refresh() {
        MusicPlaylistsModelDataContainer musicPlaylistsModelDataContainer = this.d;
        musicPlaylistsModelDataContainer.i = null;
        musicPlaylistsModelDataContainer.f = null;
        this.g = null;
        A1();
    }

    @Override // xsna.i80
    public final void release() {
        this.f.dispose();
        io.reactivex.rxjava3.disposables.c cVar = this.h;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.rfb0
    public final boolean t() {
        return this.d.d;
    }

    @Override // xsna.i80
    @SuppressLint({"CheckResult"})
    public final void u(Bundle bundle) {
        wmi0.a.i("MusicPlaylistsModelImpl.cache", true).subscribe(new tl30(new bq00(this, 13), 4));
    }
}
