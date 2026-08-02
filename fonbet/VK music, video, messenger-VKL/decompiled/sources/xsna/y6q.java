package xsna;

import android.os.Handler;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.geo.impl.model.id.StringId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.Collections;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class y6q implements gzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ y6q(b7q b7qVar, int i, sht0 sht0Var, com.vk.movika.sdk.base.ui.i iVar) {
        this.d = b7qVar;
        this.c = i;
        this.e = sht0Var;
        this.f = iVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                final b7q b7qVar = (b7q) this.d;
                final int i = this.c;
                final sht0 sht0Var = (sht0) this.e;
                final com.vk.movika.sdk.base.ui.i iVar = (com.vk.movika.sdk.base.ui.i) this.f;
                androidx.media3.exoplayer.source.d dVar = b7qVar.c;
                if (dVar != null) {
                    androidx.media3.exoplayer.source.i iVar2 = (androidx.media3.exoplayer.source.i) b7qVar.b.invoke(sht0Var);
                    Handler handler = b7qVar.d;
                    Runnable runnable = new Runnable() { // from class: xsna.a7q
                        @Override // java.lang.Runnable
                        public final void run() {
                            b7q.this.a.add(i, sht0Var);
                            iVar.invoke();
                        }
                    };
                    synchronized (dVar) {
                        dVar.A(i, Collections.singletonList(iVar2), handler, runnable);
                    }
                } else {
                    b7qVar.a.add(i, sht0Var);
                    iVar.invoke();
                }
                return s3q0.a;
            default:
                mm00 mm00Var = (mm00) this.d;
                byf0 byf0Var = (byf0) this.e;
                do00 do00Var = (do00) this.f;
                int i2 = this.c;
                mm00Var.p(byf0Var);
                Map<StringId, Runnable> map = mm00Var.r;
                L l = L.a;
                l.getClass();
                LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
                if (!L.m(loggerOutputTarget)) {
                    L.u(l, L.LogType.d, new Object[]{"updateVisibleStyle remove in lambda!! #" + ((Object) StringId.a(do00Var.b)) + ' ' + VisibleStyle.i(i2)});
                }
                Runnable runnable2 = map.get(new StringId(do00Var.b));
                if (runnable2 != null) {
                    if (!L.m(loggerOutputTarget)) {
                        L.u(l, L.LogType.d, new Object[]{"updateVisibleStyle transaction found, call it"});
                    }
                    runnable2.run();
                }
                map.remove(new StringId(do00Var.b));
                return s3q0.a;
        }
    }

    public /* synthetic */ y6q(mm00 mm00Var, byf0 byf0Var, do00 do00Var, int i) {
        this.d = mm00Var;
        this.e = byf0Var;
        this.f = do00Var;
        this.c = i;
    }
}
