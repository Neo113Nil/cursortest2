package xsna;

import com.vk.clips.config.viewers.api.experiments.models.ClipsAutoScrollConfig;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.base.TimeUtils;
import xsna.wid;

/* compiled from: ClipsAutoScrollSettingsRepositoryImpl.kt */
/* loaded from: classes17.dex */
public final class ajd implements zid {
    public final hh1 a;
    public final vid b;
    public final wid c;
    public final io.reactivex.rxjava3.disposables.c d;

    /* compiled from: ClipsAutoScrollSettingsRepositoryImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsAutoScrollConfig.ResetPeriod.values().length];
            try {
                iArr[ClipsAutoScrollConfig.ResetPeriod.SESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ajd(hh1 hh1Var, vid vidVar, wid widVar, io.reactivex.rxjava3.core.q qVar) {
        this.a = hh1Var;
        this.b = vidVar;
        this.c = widVar;
        io.reactivex.rxjava3.subjects.d O0 = io.reactivex.rxjava3.subjects.d.O0(Boolean.valueOf(isEnabled()));
        qVar.getClass();
        a.q qVar2 = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
        io.reactivex.rxjava3.core.q<R> s0 = new io.reactivex.rxjava3.internal.operators.observable.y(qVar, qVar2, aVar).s0(new pb(new iz(this, 23), 9));
        s0.getClass();
        this.d = new io.reactivex.rxjava3.internal.operators.observable.y(s0, qVar2, aVar).subscribe(new hv(new r8(1, O0, io.reactivex.rxjava3.subjects.d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 4), 12));
    }

    @Override // xsna.zid
    public final boolean isEnabled() {
        if (a.$EnumSwitchMapping$0[((ClipsAutoScrollConfig) this.a.invoke()).b.ordinal()] == 1) {
            vid vidVar = this.b;
            Boolean bool = (Boolean) ((ConcurrentHashMap) vidVar.b).get(((ry0) vidVar.a).invoke());
            if (bool != null) {
                return bool.booleanValue();
            }
        } else {
            wid widVar = this.c;
            hh1 hh1Var = widVar.a;
            xid xidVar = widVar.b;
            bv0 bv0Var = widVar.c;
            int i = wid.a.$EnumSwitchMapping$0[((ClipsAutoScrollConfig) hh1Var.invoke()).b.ordinal()];
            if (i == 1) {
                long timestamp = xidVar.getTimestamp();
                if (timestamp != 0) {
                    if (((Number) bv0Var.invoke()).longValue() < wid.a(timestamp)) {
                        return xidVar.getEnabled();
                    }
                    xidVar.clear();
                    return false;
                }
            } else {
                if (i == 2) {
                    long timestamp2 = xidVar.getTimestamp();
                    if (timestamp2 == 0) {
                        return false;
                    }
                    if (((Number) bv0Var.invoke()).longValue() < (((ClipsAutoScrollConfig) hh1Var.invoke()).e * TimeUtils.MILLISECONDS_PER_DAY) + timestamp2) {
                        return xidVar.getEnabled();
                    }
                    xidVar.clear();
                    return false;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("SESSION mode is not supported by LocalDataSource");
                }
                long timestamp3 = xidVar.getTimestamp();
                if (timestamp3 != 0) {
                    if (((Number) bv0Var.invoke()).longValue() < wid.b(timestamp3)) {
                        return xidVar.getEnabled();
                    }
                    xidVar.clear();
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d4  */
    @Override // xsna.zid
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setEnabled(boolean z) {
        long a2;
        long longValue;
        if (a.$EnumSwitchMapping$0[((ClipsAutoScrollConfig) this.a.invoke()).b.ordinal()] == 1) {
            vid vidVar = this.b;
            ((ConcurrentHashMap) vidVar.b).put((UserId) ((ry0) vidVar.a).invoke(), Boolean.valueOf(z));
            ((io.reactivex.rxjava3.subjects.h) vidVar.c).onNext(Boolean.valueOf(z));
            return;
        }
        wid widVar = this.c;
        xid xidVar = widVar.b;
        xidVar.setEnabled(z);
        bv0 bv0Var = widVar.c;
        xidVar.setTimestamp(((Number) bv0Var.invoke()).longValue());
        widVar.e.onNext(Boolean.valueOf(z));
        io.reactivex.rxjava3.disposables.c cVar = widVar.f;
        if (cVar != null) {
            cVar.dispose();
        }
        widVar.f = null;
        if (z) {
            hh1 hh1Var = widVar.a;
            long timestamp = xidVar.getTimestamp();
            long j = Long.MAX_VALUE;
            if (timestamp != 0) {
                int i = wid.a.$EnumSwitchMapping$0[((ClipsAutoScrollConfig) hh1Var.invoke()).b.ordinal()];
                if (i == 1) {
                    a2 = wid.a(timestamp);
                    longValue = ((Number) bv0Var.invoke()).longValue();
                } else if (i == 2) {
                    a2 = (((ClipsAutoScrollConfig) hh1Var.invoke()).e * TimeUtils.MILLISECONDS_PER_DAY) + timestamp;
                    longValue = ((Number) bv0Var.invoke()).longValue();
                } else if (i != 3) {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (j < 0) {
                        j = 0;
                    }
                } else {
                    a2 = wid.b(timestamp);
                    longValue = ((Number) bv0Var.invoke()).longValue();
                }
                j = a2 - longValue;
                if (j < 0) {
                }
            }
            if (j <= 0) {
                return;
            }
            widVar.f = io.reactivex.rxjava3.core.q.C0(j, TimeUnit.MILLISECONDS, (io.reactivex.rxjava3.core.w) widVar.d.invoke()).subscribe(new hz(new mb(widVar, 26), 16));
        }
    }
}
