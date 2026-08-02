package xsna;

import com.vk.voip.ui.watchmovie.player.CommandForPlayer;

/* compiled from: VoipCallAsrOnlineDelegateImpl.kt */
/* loaded from: classes11.dex */
public final class nfw0 extends few0 implements mfw0 {
    public final com.vk.voip.b d;
    public final z58 e;
    public final com.vk.voip.ui.sessionrooms.d f;
    public final String g;
    public boolean h;
    public final io.reactivex.rxjava3.subjects.f<CommandForPlayer> i;
    public final io.reactivex.rxjava3.subjects.f<Boolean> j;
    public final io.reactivex.rxjava3.disposables.b k;

    public nfw0(hew0 hew0Var, ofw0 ofw0Var, com.vk.voip.b bVar, z58 z58Var, com.vk.voip.ui.sessionrooms.d dVar) {
        super(hew0Var, ofw0Var);
        this.d = bVar;
        this.e = z58Var;
        this.f = dVar;
        this.g = "VoipCallAsrOnlineDelegateImpl";
        this.i = new io.reactivex.rxjava3.subjects.f<>();
        this.j = new io.reactivex.rxjava3.subjects.f<>();
        this.k = new io.reactivex.rxjava3.disposables.b();
    }

    @Override // xsna.mfw0
    public final io.reactivex.rxjava3.subjects.f a() {
        return this.j;
    }

    @Override // xsna.mfw0
    public final io.reactivex.rxjava3.subjects.f b() {
        return this.i;
    }
}
