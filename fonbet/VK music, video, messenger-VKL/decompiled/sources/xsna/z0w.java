package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class z0w implements io.reactivex.rxjava3.functions.n {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z0w(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.n
    public final Object get() {
        switch (this.b) {
            case 0:
                return ((a1w) this.c).j((e1w) this.d);
            default:
                com.vk.music.player.playback.e eVar = (com.vk.music.player.playback.e) this.c;
                return eVar == null ? ((t370) this.d).h() : io.reactivex.rxjava3.core.x.k(eVar);
        }
    }
}
