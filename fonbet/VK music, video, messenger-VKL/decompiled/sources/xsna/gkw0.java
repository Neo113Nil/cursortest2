package xsna;

import com.vk.voip.ui.sessionrooms.SessionRoomsObserver;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherError;

/* compiled from: VoipCallViewFeature.kt */
/* loaded from: classes7.dex */
public final class gkw0 {
    public final i9d0 a;
    public final SessionRoomsObserver b;
    public final icx0 c;
    public final s5r d;
    public final pa9 e;
    public final io.reactivex.rxjava3.subjects.f<fkw0> f;
    public final io.reactivex.rxjava3.subjects.d<lkw0> g;
    public final io.reactivex.rxjava3.disposables.b h;

    /* compiled from: VoipCallViewFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WatchTogetherError.values().length];
            try {
                iArr[WatchTogetherError.LIMIT_EXCEEDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WatchTogetherError.MOVIE_NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WatchTogetherError.PLAY_NOT_ALLOWED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public gkw0(i9d0 i9d0Var, SessionRoomsObserver sessionRoomsObserver, icx0 icx0Var) {
        com.vk.voip.ui.c.b.getClass();
        s5r s5rVar = new s5r(com.vk.voip.ui.c.X);
        this.a = i9d0Var;
        this.b = sessionRoomsObserver;
        this.c = icx0Var;
        this.d = s5rVar;
        this.e = new pa9();
        io.reactivex.rxjava3.subjects.f<fkw0> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.f = fVar;
        this.g = io.reactivex.rxjava3.subjects.d.O0(new lkw0(false));
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.h = bVar;
        bVar.b(fVar.a0(asu0.a.d()).subscribe(new qeu0(new yte(1, this, gkw0.class, "applyEvent", "applyEvent(Lcom/vk/voip/ui/call_view/VoipCallViewEvent;)V", 0, 13), 4)));
    }

    public final void a(io.reactivex.rxjava3.disposables.c cVar) {
        this.h.b(cVar);
    }
}
