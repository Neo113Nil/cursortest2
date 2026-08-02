package defpackage;

import android.os.SystemClock;
import ru.yandex.taxi.persuggest.repository.AutoFsSessionPhase;

/* loaded from: classes9.dex */
public final /* synthetic */ class hy2 implements fy2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hy2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.fy2
    public final void a(boolean z, boolean z2) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((tls) obj).invoke(Boolean.valueOf(z));
                return;
            default:
                ir3 ir3Var = (ir3) obj;
                synchronized (ir3Var) {
                    try {
                        if (z) {
                            long j = ir3Var.h;
                            ir3Var.h = -1L;
                            if (j >= 0 && SystemClock.elapsedRealtime() - j > 600000) {
                                v8e v8eVar = ir3Var.i;
                                if (v8eVar != null) {
                                    v8eVar.j();
                                }
                                ir3Var.i = null;
                                v8e v8eVar2 = ir3Var.j;
                                if (v8eVar2 != null) {
                                    v8eVar2.j();
                                }
                                ir3Var.j = null;
                                ir3Var.c = AutoFsSessionPhase.AwaitingCycleStart;
                                ir3Var.d = 0L;
                                ir3Var.e = 0L;
                            }
                        } else {
                            ir3Var.h = SystemClock.elapsedRealtime();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
