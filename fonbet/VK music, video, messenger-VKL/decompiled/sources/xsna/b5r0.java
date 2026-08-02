package xsna;

import com.vk.dto.uxpolls.UxPoll;
import com.vk.video.polls.analytics.UxPollsAnalytics;
import com.vk.video.polls.entrypoint.model.UxPollEntryPoint;
import com.vk.video.polls.entrypoint.model.UxPollEntryPointLocation;
import com.vk.video.polls.entrypoint.model.UxPollProject;
import com.vk.video.polls.models.UxPollEventType;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: UxPollsEntryPointVisibilityRepositoryImpl.kt */
/* loaded from: classes6.dex */
public final class b5r0 implements a5r0 {
    public final m5r0 a;
    public final a b;
    public final kyq0 c;
    public io.reactivex.rxjava3.disposables.c d = new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
    public final io.reactivex.rxjava3.subjects.d<Map<UxPollEntryPointLocation, Boolean>> e;

    /* compiled from: UxPollsEntryPointVisibilityRepositoryImpl.kt */
    public interface a {

        /* compiled from: UxPollsEntryPointVisibilityRepositoryImpl.kt */
        /* renamed from: xsna.b5r0$a$a, reason: collision with other inner class name */
        public static final class C2588a implements a {
            public static final C2588a a = new C2588a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2588a);
            }

            public final int hashCode() {
                return 1854900745;
            }

            public final String toString() {
                return "OneTime";
            }
        }
    }

    public b5r0(m5r0 m5r0Var, a aVar, kyq0 kyq0Var) {
        this.a = m5r0Var;
        this.b = aVar;
        this.c = kyq0Var;
        zrp<UxPollEntryPointLocation> i = UxPollEntryPointLocation.i();
        int e = on00.e(c5g.u(i, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (Object obj : i) {
            linkedHashMap.put(obj, Boolean.TRUE);
        }
        this.e = io.reactivex.rxjava3.subjects.d.O0(new EnumMap(linkedHashMap));
    }

    @Override // xsna.a5r0
    public final void a(UxPollEntryPoint uxPollEntryPoint, boolean z, boolean z2) {
        UxPollEntryPointLocation uxPollEntryPointLocation = uxPollEntryPoint.c;
        if (z || z2) {
            this.d.dispose();
            UxPollEventType uxPollEventType = z ? UxPollEventType.EntryPointView : UxPollEventType.EntryPointHide;
            UxPoll uxPoll = uxPollEntryPoint.b;
            this.d = this.a.a(uxPoll.b, uxPoll.c, uxPollEventType, UxPollProject.VkVideo).subscribe();
            UxPollsAnalytics uxPollsAnalytics = (UxPollsAnalytics) this.c.invoke(uxPollEntryPoint);
            if (z) {
                uxPollsAnalytics.a();
            } else {
                uxPollsAnalytics.b();
            }
        }
        boolean z3 = this.b instanceof a.C2588a;
        io.reactivex.rxjava3.subjects.d<Map<UxPollEntryPointLocation, Boolean>> dVar = this.e;
        if (z3 && epx.f(dVar.P0().get(uxPollEntryPointLocation), Boolean.FALSE)) {
            return;
        }
        EnumMap enumMap = new EnumMap(dVar.P0());
        enumMap.put((EnumMap) uxPollEntryPointLocation, (UxPollEntryPointLocation) Boolean.valueOf(z));
        dVar.onNext(enumMap);
    }

    @Override // xsna.a5r0
    public final void b(UxPollEntryPoint uxPollEntryPoint, boolean z) {
        a(uxPollEntryPoint, false, z);
    }
}
