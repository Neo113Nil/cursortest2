package xsna;

import com.vk.im.engine.models.EngineInvalidateSource;
import com.vk.im.engine.reporters.performance.events.LogType;
import kotlin.random.Random;

/* compiled from: ImEngineReporterImpl.kt */
/* loaded from: classes11.dex */
public final class p2w implements n2w {
    @Override // xsna.n2w
    public final void a(long j, long j2, String str) {
        new r3w0(LogType.ENV_START_OVERTIME_STAT, str, null, null, null, null, null, Integer.valueOf((int) j), null, null, Integer.valueOf((int) j2), 12156).q();
    }

    @Override // xsna.n2w
    public final void b(long j, long j2) {
        Random.b.getClass();
        if (Random.c.i() >= 0.01f) {
            return;
        }
        new r3w0(LogType.ENV_INIT_STAT, null, null, null, null, null, null, Integer.valueOf((int) j), null, null, Integer.valueOf((int) j2), 12158).q();
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.n2w
    public final void c(long j, String str, String str2) {
        Random.b.getClass();
        if (Random.c.i() >= 0.001f) {
            return;
        }
        new r3w0(LogType.CMD_SUBMIT_STAT, str2, str, null, null, null, null, Integer.valueOf((int) j), null, null, null, 16248).q();
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.n2w
    public final void d(final long j, final String str) {
        gzs gzsVar = new gzs() { // from class: xsna.o2w
            @Override // xsna.gzs
            public final Object invoke() {
                String str2 = str;
                new r3w0(LogType.DB_OPEN_STAT, str2 == null ? "memory" : str2.equals("vkim_settings.sqlite") ? "settings" : "common", null, null, null, null, null, Integer.valueOf((int) j), null, null, null, 16252).q();
                return s3q0.a;
            }
        };
        Random.b.getClass();
        if (Random.c.i() >= 0.01f) {
            return;
        }
        gzsVar.invoke();
    }

    @Override // xsna.n2w
    public final void e(EngineInvalidateSource engineInvalidateSource, boolean z) {
        String str;
        Random.b.getClass();
        if (Random.c.i() >= 0.01f) {
            return;
        }
        LogType logType = LogType.IM_ENGINE_RESTART;
        if (engineInvalidateSource == null || (str = engineInvalidateSource.h()) == null) {
            str = "null";
        }
        new r3w0(logType, str, null, null, null, null, Boolean.valueOf(z), null, null, null, null, 16316).q();
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.n2w
    public final void f(long j, String str, String str2) {
        new r3w0(LogType.CMD_DURATION_STAT, str, str2, null, null, null, null, Integer.valueOf((int) j), null, null, null, 16248).q();
    }

    @Override // xsna.n2w
    public final void g(long j, String str, String str2) {
        new r3w0(LogType.ENV_TERMINATION_OVERTIME_CMD_STAT, str, str2, null, null, null, null, Integer.valueOf((int) j), null, null, null, 16248).q();
    }

    @Override // xsna.n2w
    public final void h(long j, long j2, String str) {
        new r3w0(LogType.ENV_TERMINATION_OVERTIME_STAT, str, null, null, null, null, null, Integer.valueOf((int) j), null, null, Integer.valueOf((int) j2), 12156).q();
    }

    @Override // xsna.n2w
    public final void i(int i, int i2, int i3, String str) {
        new r3w0(LogType.DB_CLOSE_STAT, str, null, null, null, null, null, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), null, 15484).q();
    }

    @Override // xsna.n2w
    public final void j(long j, String str, String str2) {
        Random.b.getClass();
        if (Random.c.i() >= 0.001f) {
            return;
        }
        new r3w0(LogType.TASK_EXECUTOR_IDLE_STAT, str, str2, null, null, null, null, Integer.valueOf((int) j), null, null, null, 16248).q();
        s3q0 s3q0Var = s3q0.a;
    }
}
