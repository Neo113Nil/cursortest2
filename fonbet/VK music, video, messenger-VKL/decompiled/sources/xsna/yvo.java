package xsna;

import com.vk.ads.easypromote.impl.domain.model.DurationOption;
import com.vk.ads.easypromote.impl.presentation.a;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import kotlin.NoWhenBranchMatchedException;
import xsna.uvo;
import xsna.zvo;

/* compiled from: EasyPromoteFeature.kt */
/* loaded from: classes14.dex */
public final class yvo extends wk50<uwo, rwo, uvo, zvo> {
    public final f4z f;

    public yvo(uvo.d dVar, ewo ewoVar) {
        super(dVar, ewoVar);
        this.f = new f4z();
    }

    @Override // xsna.wk50
    public final void N(rwo rwoVar, uvo uvoVar) {
        int between;
        uvo uvoVar2 = uvoVar;
        if (uvoVar2 instanceof uvo.d) {
            uvo.d dVar = (uvo.d) uvoVar2;
            T(new zvo.c(dVar.b, dVar.c, dVar.d, dVar.e, dVar.f, dVar.g));
            return;
        }
        if (uvoVar2 instanceof uvo.b) {
            T(new zvo.a(((uvo.b) uvoVar2).b));
            return;
        }
        if (uvoVar2 instanceof uvo.c) {
            T(new zvo.b(((uvo.c) uvoVar2).b));
            return;
        }
        boolean z = uvoVar2 instanceof uvo.f;
        f4z f4zVar = this.f;
        if (z) {
            f4zVar.b(new a.c(((uvo.f) uvoVar2).b));
            return;
        }
        if (uvoVar2 instanceof uvo.e) {
            f4zVar.b(a.b.a);
            return;
        }
        if (!(uvoVar2 instanceof uvo.a)) {
            throw new NoWhenBranchMatchedException();
        }
        uvo.a aVar = (uvo.a) uvoVar2;
        Long l = aVar.d;
        DurationOption durationOption = aVar.b;
        if (durationOption != DurationOption.CUSTOM) {
            between = durationOption.i();
        } else if (l == null) {
            between = -1;
        } else {
            long longValue = l.longValue();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(longValue);
            between = (int) ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.ofYearDay(calendar.get(1), calendar.get(6)));
        }
        if (between != -1) {
            f4zVar.b(new a.C0373a(between, aVar.c, l));
        }
    }
}
