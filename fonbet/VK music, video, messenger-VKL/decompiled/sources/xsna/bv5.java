package xsna;

import com.vk.dto.common.Source;
import com.vk.dto.music.MusicTrack;
import java.util.Iterator;
import java.util.List;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class bv5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bv5(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        switch (this.b) {
            case 0:
                cpi cpiVar = (cpi) this.d;
                yu5 yu5Var = cpiVar.a;
                boolean z = this.c;
                yu5Var.setEnabled(z);
                cpiVar.b.f(z);
                return new dv5((n5z) obj, cpiVar);
            case 1:
                MusicTrack musicTrack = (MusicTrack) this.d;
                List list = (List) obj;
                bn40.g("audio.delete", list);
                MusicTrack Ab = musicTrack.Ab();
                musicTrack.U = false;
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (epx.f((String) obj2, musicTrack.Fb())) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                if (obj2 != null) {
                    musicTrack.l = true;
                }
                musicTrack.m = false;
                musicTrack.W = null;
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(new yd50(list, Ab, musicTrack, this.c));
                return s3q0.a;
            default:
                com.vk.im.notification.settings.impl.a aVar = (com.vk.im.notification.settings.impl.a) this.d;
                aVar.c.l(this.c);
                return ((a1w) aVar.a.invoke()).C(aVar, new gnm(Source.NETWORK, true)).q(asu0.a.c());
        }
    }
}
