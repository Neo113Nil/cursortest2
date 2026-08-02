package xsna;

import com.vk.clips.external.nps.api.condition.ExternalNpsCondition;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.LinkedHashMap;

/* compiled from: ExternalNpsConditionManagerImpl.kt */
/* loaded from: classes16.dex */
public final class efq implements bfq {
    public final LinkedHashMap a;
    public final io.reactivex.rxjava3.subjects.f<ExternalNpsCondition> b = new io.reactivex.rxjava3.subjects.f<>();
    public final io.reactivex.rxjava3.subjects.f<ExternalNpsCondition> c = new io.reactivex.rxjava3.subjects.f<>();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();

    public efq(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    @Override // xsna.bfq
    public final io.reactivex.rxjava3.subjects.f a() {
        return this.b;
    }

    @Override // xsna.bfq
    public final io.reactivex.rxjava3.subjects.f b() {
        return this.c;
    }

    @Override // xsna.bfq
    public final void c(final ExternalNpsCondition externalNpsCondition) {
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap2 = this.d;
        Integer num = (Integer) linkedHashMap2.get(externalNpsCondition);
        final int intValue = num != null ? num.intValue() : 0;
        final int i = intValue + 1;
        linkedHashMap2.put(externalNpsCondition, Integer.valueOf(i));
        Integer num2 = (Integer) linkedHashMap.get(externalNpsCondition);
        if (num2 != null) {
            final int intValue2 = num2.intValue();
            L.c("CLIPS_NPS", new gzs() { // from class: xsna.dfq
                @Override // xsna.gzs
                public final Object invoke() {
                    StringBuilder a = odj.a(intValue, i, "trigger condition: oldCount = ", ", newCount = ", ", requiredCount = ");
                    a.append(intValue2);
                    a.append("; ");
                    a.append(externalNpsCondition);
                    return a.toString();
                }
            });
            if (i >= intValue2) {
                LinkedHashMap linkedHashMap3 = this.e;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) linkedHashMap3.get(externalNpsCondition);
                if (cVar != null) {
                    cVar.dispose();
                }
                linkedHashMap3.put(externalNpsCondition, new io.reactivex.rxjava3.internal.operators.single.v(new bcj(externalNpsCondition, 1)).q(asu0.a.c()).subscribe(new defpackage.d(new defpackage.c(17, this, externalNpsCondition), 25), new hv(new kdn(externalNpsCondition, 4), 20)));
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"CLIPS_NPS", "reset count; " + externalNpsCondition});
                }
                linkedHashMap2.put(externalNpsCondition, 0);
            }
        }
    }

    @Override // xsna.bfq
    public final void d(ExternalNpsCondition externalNpsCondition) {
        itg0.l(io.reactivex.rxjava3.core.a.l(new w1j(externalNpsCondition, 1)).q(asu0.a.c()));
    }

    @Override // xsna.bfq
    public final void e(ExternalNpsCondition externalNpsCondition) {
        this.c.onNext(externalNpsCondition);
    }
}
