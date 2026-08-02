package xsna;

import android.os.Trace;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.collections.EmptyList;
import xsna.us2;
import xsna.v4s;

/* compiled from: BasicText.android.kt */
/* loaded from: classes11.dex */
public final class eu6 {
    public static final iyk0 a = new iyk0(new bu0(1));
    public static Boolean b;

    public static final void a(final us2 us2Var, final nmo0 nmo0Var, final v4s.a aVar, final List<us2.d<esa0>> list, androidx.compose.runtime.a aVar2, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-650368117, i, -1, "androidx.compose.foundation.text.BackgroundTextMeasurement (BasicText.android.kt:112)");
        }
        Executor executor = (Executor) aVar2.r(a);
        if (executor == null || !b(us2Var.c.length())) {
            aVar2.K(-517090505);
            aVar2.j();
        } else {
            aVar2.K(-518737659);
            final LayoutDirection layoutDirection = (LayoutDirection) aVar2.r(uvi.n);
            final azl azlVar = (azl) aVar2.r(uvi.h);
            try {
                executor.execute(new Runnable() { // from class: xsna.du6
                    @Override // java.lang.Runnable
                    public final void run() {
                        uh50 C;
                        nmo0 nmo0Var2 = nmo0.this;
                        LayoutDirection layoutDirection2 = layoutDirection;
                        us2 us2Var2 = us2Var;
                        azl azlVar2 = azlVar;
                        v4s.a aVar3 = aVar;
                        Trace.beginSection("BackgroundTextMeasurement");
                        try {
                            dak0 j = qak0.j();
                            uh50 uh50Var = j instanceof uh50 ? (uh50) j : null;
                            if (uh50Var == null || (C = uh50Var.C(null, null)) == null) {
                                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                            }
                            try {
                                dak0 j2 = C.j();
                                try {
                                    nmo0 a2 = tmo0.a(nmo0Var2, layoutDirection2);
                                    List list2 = list;
                                    if (list2 == null) {
                                        list2 = EmptyList.b;
                                    }
                                    n540 n540Var = new n540(us2Var2, a2, list2, azlVar2, aVar3);
                                    n540Var.a();
                                    n540Var.c();
                                    s3q0 s3q0Var = s3q0.a;
                                    dak0.q(j2);
                                    C.w().a();
                                } catch (Throwable th) {
                                    dak0.q(j2);
                                    throw th;
                                }
                            } finally {
                            }
                        } finally {
                            Trace.endSection();
                        }
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
            aVar2.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }

    public static final boolean b(int i) {
        if (i >= 8 && i < 1000) {
            if (b == null) {
                b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
            }
            if (b.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
