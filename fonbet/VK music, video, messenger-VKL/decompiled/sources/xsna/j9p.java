package xsna;

import com.my.tracker.miniapps.MiniAppEvent;
import ru.ok.gleffects.EffectHolder;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class j9p implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j9p(long j, Object obj, Object obj2, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((EffectHolder) this.d).lambda$setMusicInfo$6((long[]) this.e, this.c);
                break;
            default:
                ((com.my.tracker.obfuscated.e0) this.d).a((MiniAppEvent) this.e, this.c);
                break;
        }
    }
}
