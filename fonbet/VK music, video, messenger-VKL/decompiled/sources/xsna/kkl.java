package xsna;

import com.vk.music.player.playback.PlaybackLaunchMeta;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class kkl implements io.reactivex.rxjava3.functions.n {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kkl(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (xsna.epx.f(r2, com.vk.music.player.playback.PlaybackLaunchMeta.a.a()) != false) goto L14;
     */
    @Override // io.reactivex.rxjava3.functions.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                lkl lklVar = (lkl) obj;
                com.vk.music.player.playback.e eVar = lklVar.b;
                if (eVar != null) {
                    if (eVar.a == null) {
                        PlaybackLaunchMeta playbackLaunchMeta = eVar.b;
                        Object obj2 = PlaybackLaunchMeta.g;
                        break;
                    }
                    return io.reactivex.rxjava3.core.x.k(eVar);
                }
                return lklVar.c.h();
            default:
                return new ArrayList(((ArrayList) obj).size());
        }
    }
}
