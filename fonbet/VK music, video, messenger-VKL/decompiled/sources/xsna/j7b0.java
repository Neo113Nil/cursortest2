package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistPermissions;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vk.music.playlist.ModernPlaylistModel;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.h7u0;
import xsna.k840;

/* compiled from: PlaylistBottomSheetModelImpl.kt */
/* loaded from: classes3.dex */
public final class j7b0 implements i7b0 {
    public final MusicPlaybackLaunchContext b;
    public final Playlist c;
    public final ModernPlaylistModel d;
    public final u2b0 e;
    public final g9o f;
    public final lq40 g;
    public final MusicRestrictionPopupDisplayer h;

    public j7b0(MusicPlaybackLaunchContext musicPlaybackLaunchContext, Playlist playlist, ModernPlaylistModel modernPlaylistModel, u2b0 u2b0Var, lq40 lq40Var) {
        lq40 d = k840.a.d();
        com.vk.music.notifications.restriction.a aVar = k840.a.d;
        aVar = aVar == null ? null : aVar;
        this.b = musicPlaybackLaunchContext;
        this.c = playlist;
        this.d = modernPlaylistModel;
        this.e = u2b0Var;
        this.f = lq40Var;
        this.g = d;
        this.h = aVar;
    }

    @Override // xsna.i7b0
    public final void B(Playlist playlist) {
        this.f.G(playlist, true);
    }

    public final boolean D() {
        Playlist playlist = this.c;
        PlaylistPermissions playlistPermissions = playlist.B;
        return (playlistPermissions != null ? playlistPermissions.g : false) && (xx1.w(xx1.m(playlist)) || xx1.e(xx1.m(playlist)));
    }

    @Override // xsna.i7b0
    public final io.reactivex.rxjava3.internal.operators.observable.b0 R() {
        return this.d.J(xx1.m(this.c), this.b).a0(io.reactivex.rxjava3.android.schedulers.a.b()).F(new rt10(new bl30(this, 8), 10));
    }

    @Override // xsna.i7b0
    public final boolean Y() {
        return xx1.d(this.c);
    }

    @Override // xsna.i80
    public final Bundle e() {
        Bundle bundle = new Bundle();
        i80[] i80VarArr = {this.d};
        int length = i80VarArr.length;
        for (int i = 0; i < length; i++) {
            bundle.putBundle(lhg.a(i, UcumUtils.UCUM_SECONDS), i80VarArr[i].e());
        }
        return bundle;
    }

    @Override // xsna.i7b0
    public final boolean n() {
        return xx1.b(this.c);
    }

    @Override // xsna.i7b0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 n1() {
        ModernPlaylistModel modernPlaylistModel = this.d;
        String str = modernPlaylistModel.e;
        io.reactivex.rxjava3.internal.operators.observable.b0 F = modernPlaylistModel.F(this.b).a0(io.reactivex.rxjava3.android.schedulers.a.b()).F(new cl30(new hxl(this, 28), 7));
        skz skzVar = new skz(new r8a0(this, 3), 15);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return F.E(skzVar, lVar, kVar, kVar).U(new as(new d220(9), 27));
    }

    @Override // xsna.i80
    public final void release() {
        new i80[]{this.d}[0].release();
    }

    @Override // xsna.i80
    public final void u(Bundle bundle) {
        i80[] i80VarArr = {this.d};
        Bundle bundle2 = bundle.getBundle("s0");
        if (bundle2 != null) {
            i80VarArr[0].u(bundle2);
        }
    }

    public final void y(Context context, Playlist playlist) {
        if (o25.a().i().C) {
            if (!k840.a.i.c()) {
                MusicRestrictionPopupDisplayer.e(this.h, context, "download", MusicPlaybackLaunchContext.d, null, null, null, 56);
                return;
            }
            if (!k840.a.d().I()) {
                com.vk.music.notifications.restriction.a aVar = k840.a.d;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.h(context, new fpb(this, context, playlist, 3));
            }
            boolean w = xx1.w(playlist);
            g9o g9oVar = this.f;
            if (w) {
                g9oVar.E(context, playlist);
                return;
            }
            Playlist m = xx1.m(playlist);
            this.d.getClass();
            if (ModernPlaylistModel.E(m)) {
                g9oVar.E(context, xx1.k(xx1.m(playlist)));
                return;
            }
            rp1 rp1Var = new rp1(15, this, context);
            if (k840.a.d().Z()) {
                rp1Var.invoke();
                return;
            }
            String string = playlist.Eb() ? context.getString(R.string.music_title_album) : context.getString(R.string.music_title_playlist);
            String string2 = jnj.h(playlist.O) ? context.getString(R.string.music_entity_will_be_added_to_my_collection, string) : context.getString(R.string.music_entity_will_be_added_to_my_music, string);
            String string3 = jnj.h(playlist.O) ? context.getString(R.string.music_entity_will_be_added_to_my_collection_description, cqm0.m(string)) : context.getString(R.string.music_entity_will_be_added_to_my_music_description, cqm0.m(string));
            int i = h7u0.p;
            h7u0.a c = h7u0.b.c(context);
            c.h0(string2);
            c.a.f = string3;
            c.W(R.string.cancel, new si10(1));
            c.c0(R.string.download, new hu3(rp1Var, 4));
            c.m();
        }
    }

    @Override // xsna.i7b0
    public final io.reactivex.rxjava3.internal.operators.observable.b0 z() {
        boolean D = D();
        Playlist playlist = this.c;
        ModernPlaylistModel modernPlaylistModel = this.d;
        if (!D) {
            return modernPlaylistModel.J(playlist, this.b).a0(io.reactivex.rxjava3.android.schedulers.a.b()).F(new m1r(new rxz(this, 14), 16));
        }
        modernPlaylistModel.getClass();
        return ModernPlaylistModel.y(playlist).a0(io.reactivex.rxjava3.android.schedulers.a.b()).F(new n1r(new m360(this, 8), 15));
    }

    @Override // xsna.i80
    public final void G1() {
    }
}
