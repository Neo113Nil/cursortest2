package xsna;

import xsna.js4;

/* compiled from: ChannelAudioPlayer.kt */
/* loaded from: classes16.dex */
public final class lua {
    public final js4 a;
    public final io.reactivex.rxjava3.subjects.d<fhp0> b;
    public final io.reactivex.rxjava3.subjects.d c;
    public final a d;

    /* compiled from: ChannelAudioPlayer.kt */
    public static final class a implements js4.a {
        public a() {
        }

        @Override // xsna.js4.a
        public final void a(xwv xwvVar) {
            lua luaVar = lua.this;
            luaVar.b.onNext(new fhp0(luaVar.a.b()));
        }
    }

    public lua(js4 js4Var) {
        this.a = js4Var;
        io.reactivex.rxjava3.subjects.d<fhp0> O0 = io.reactivex.rxjava3.subjects.d.O0(new fhp0(null));
        this.b = O0;
        this.c = O0;
        a aVar = new a();
        this.d = aVar;
        js4Var.e(aVar);
        js4Var.c();
    }
}
