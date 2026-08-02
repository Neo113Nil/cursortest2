package defpackage;

import com.yandex.go.navigator.events.g;
import com.yandex.mapkit.road_events.RoadEventSession;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes12.dex */
public final class dpv {
    public final g a;
    public final x1l0 b;
    public final gpv c;
    public final n0 d;
    public final n0 e;
    public RoadEventSession f;
    public final cpv g;

    public dpv(g gVar, x1l0 x1l0Var, gpv gpvVar) {
        this.a = gVar;
        this.b = x1l0Var;
        this.c = gpvVar;
        n0 b = ffx.b(1, 1, BufferOverflow.DROP_OLDEST);
        this.d = b;
        this.e = b;
        this.g = new cpv(this);
    }
}
