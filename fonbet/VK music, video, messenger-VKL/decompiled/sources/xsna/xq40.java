package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.im.engine.models.c;
import com.vk.toggle.internal.a;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MusicOfflineSyncInteractorImpl.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class xq40 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b = 1;

    public /* synthetic */ xq40(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return ((up40) this.receiver).C((MusicTrack) obj);
            default:
                com.vk.toggle.internal.a aVar = (com.vk.toggle.internal.a) obj;
                Set<c.b> set = ((cau0) this.receiver).c;
                if (epx.f(aVar, a.c.a)) {
                    Iterator<T> it = set.iterator();
                    while (it.hasNext()) {
                        ((c.b) it.next()).a();
                    }
                } else if (epx.f(aVar, a.C1930a.a)) {
                    Iterator<T> it2 = set.iterator();
                    while (it2.hasNext()) {
                        ((c.b) it2.next()).j();
                    }
                } else if (epx.f(aVar, a.b.a)) {
                    Iterator<T> it3 = set.iterator();
                    while (it3.hasNext()) {
                        ((c.b) it3.next()).a();
                    }
                }
                return s3q0.a;
        }
    }

    public xq40(Object obj) {
        super(1, obj, up40.class, "isTrackFullyCached", "isTrackFullyCached(Lcom/vk/dto/music/MusicTrack;)Lkotlin/Pair;", 0);
    }
}
