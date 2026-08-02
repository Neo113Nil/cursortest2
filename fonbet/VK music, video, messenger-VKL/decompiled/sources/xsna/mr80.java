package xsna;

import android.view.View;
import com.vk.im.reporters.api.msg.OpenMessagesHistoryReporter;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: OpenMessagesHistoryReporterImpl.kt */
/* loaded from: classes5.dex */
public final class mr80 extends wn6<OpenMessagesHistoryReporter.Span, OpenMessagesHistoryReporter.MeasuringPoint> implements OpenMessagesHistoryReporter {
    public final AtomicReference<mzp0> i;
    public final AtomicReference<yw90> j;

    /* compiled from: OpenMessagesHistoryReporterImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OpenMessagesHistoryReporter.Span.values().length];
            try {
                iArr[OpenMessagesHistoryReporter.Span.LOAD_MESSAGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OpenMessagesHistoryReporter.Span.BUILD_ADAPTER_ENTRY_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OpenMessagesHistoryReporter.Span.ROOT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public mr80(String str) {
        super(str);
        this.i = new AtomicReference<>();
        this.j = new AtomicReference<>();
    }

    @Override // xsna.wn6, xsna.eik0
    public final void b() {
        mzp0 mzp0Var = this.i.get();
        if (mzp0Var != null) {
            mzp0Var.f();
        }
        super.b();
    }

    @Override // xsna.wn6, xsna.eik0
    public final void d(Object obj) {
        AtomicReference<yw90> atomicReference;
        AtomicReference<mzp0> atomicReference2;
        if (!(obj instanceof mzp0)) {
            if (obj instanceof yw90) {
                do {
                    atomicReference = this.j;
                    if (atomicReference.compareAndSet(null, obj)) {
                        return;
                    }
                } while (atomicReference.get() == null);
                return;
            }
            return;
        }
        if (!(obj instanceof qzp0)) {
            b();
            return;
        }
        do {
            atomicReference2 = this.i;
            if (atomicReference2.compareAndSet(null, obj)) {
                return;
            }
        } while (atomicReference2.get() == null);
    }

    @Override // xsna.wn6
    public final void t(mdz<OpenMessagesHistoryReporter.Span> mdzVar, Object obj) {
        int i = a.$EnumSwitchMapping$0[mdzVar.b.ordinal()];
        AtomicReference<mzp0> atomicReference = this.i;
        if (i == 2) {
            mzp0 mzp0Var = atomicReference.get();
            if (mzp0Var != null) {
                mzp0Var.c(false);
                return;
            }
            return;
        }
        if (i == 3 && h() && this.d.compareAndSet(false, true)) {
            pr80 pr80Var = obj instanceof pr80 ? (pr80) obj : null;
            if (pr80Var != null) {
                View view = pr80Var.a;
                mzp0 mzp0Var2 = atomicReference.get();
                if (mzp0Var2 != null) {
                    mzp0Var2.d(view);
                }
                yw90 yw90Var = this.j.get();
                if (yw90Var != null) {
                    yw90Var.a();
                }
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wn6
    public final void u(mdz mdzVar) {
        mzp0 mzp0Var;
        if (a.$EnumSwitchMapping$0[((OpenMessagesHistoryReporter.Span) mdzVar.b).ordinal()] != 1 || (mzp0Var = this.i.get()) == null) {
            return;
        }
        mzp0Var.a();
    }
}
