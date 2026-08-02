package defpackage;

import com.yandex.go.multimodal_route.interactors.d;
import com.yandex.go.multimodal_route.ui.detailed_card.g;
import com.yandex.go.multimodal_route.ui.error.a;
import com.yandex.go.payments.data.p;
import com.yandex.go.route.interactor.b;
import com.yandex.mapkit.Time;
import java.text.DateFormat;
import java.util.TimeZone;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.masstransit.detailedroute.ui.f;

/* loaded from: classes12.dex */
public final class ft40 {
    public final tt2 a;
    public final f b;
    public final uu40 c;
    public final b d;
    public final p e;
    public final a2a0 f;
    public final zuj0 g;
    public final atd0 h;
    public final ole0 i;
    public final a j;
    public final d k;
    public final g l;
    public final a3l0 m;
    public final yxf0 n;
    public final es40 o;
    public final n0 p = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public ft40(tt2 tt2Var, f fVar, uu40 uu40Var, b bVar, p pVar, a2a0 a2a0Var, zuj0 zuj0Var, atd0 atd0Var, ole0 ole0Var, a aVar, d dVar, g gVar, a3l0 a3l0Var, yxf0 yxf0Var, es40 es40Var) {
        this.a = tt2Var;
        this.b = fVar;
        this.c = uu40Var;
        this.d = bVar;
        this.e = pVar;
        this.f = a2a0Var;
        this.g = zuj0Var;
        this.h = atd0Var;
        this.i = ole0Var;
        this.j = aVar;
        this.k = dVar;
        this.l = gVar;
        this.m = a3l0Var;
        this.n = yxf0Var;
        this.o = es40Var;
    }

    public static final String a(ft40 ft40Var, Time time, long j) {
        DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(ft40Var.i.a);
        timeFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        o430 o430Var = e3n.b;
        long value = time.getValue();
        DurationUnit durationUnit = DurationUnit.SECONDS;
        return timeFormat.format(Long.valueOf(e3n.e(kp50.U(time.getTzOffset(), durationUnit)) + e3n.e(kp50.V(value, durationUnit)) + j));
    }
}
