package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.education.EduScheduleOnDayModel;
import java.util.Calendar;
import java.util.List;

/* compiled from: EduScheduleProvider.kt */
/* loaded from: classes2.dex */
public interface e7p {
    public static final a a = a.a;

    /* compiled from: EduScheduleProvider.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final e7p STUB = new C2784a();

        /* compiled from: EduScheduleProvider.kt */
        /* renamed from: xsna.e7p$a$a, reason: collision with other inner class name */
        public static final class C2784a implements e7p {
            @Override // xsna.e7p
            public final io.reactivex.rxjava3.internal.operators.single.x a() {
                return io.reactivex.rxjava3.core.x.k(jgp.b);
            }
        }

        public final e7p getSTUB() {
            return STUB;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000e. Please report as an issue. */
    static io.reactivex.rxjava3.core.x b(e7p e7pVar, List list, Source source) {
        EduScheduleOnDayModel.ScheduleDayType.Companion.getClass();
        switch (Calendar.getInstance().get(7)) {
        }
        return e7pVar.a();
    }

    io.reactivex.rxjava3.internal.operators.single.x a();
}
