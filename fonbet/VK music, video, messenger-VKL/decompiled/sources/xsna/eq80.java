package xsna;

import android.view.View;
import com.vk.im.reporters.api.dialog.OpenChatListReporter;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: OpenChatListReporterImpl.kt */
/* loaded from: classes5.dex */
public final class eq80 extends wn6<OpenChatListReporter.Span, OpenChatListReporter.MeasuringPoint> implements OpenChatListReporter {
    public final AtomicReference<mzp0> i;
    public final AtomicReference<yw90> j;

    /* compiled from: OpenChatListReporterImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OpenChatListReporter.Span.values().length];
            try {
                iArr[OpenChatListReporter.Span.LOAD_DIALOGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OpenChatListReporter.Span.ROOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public eq80(String str) {
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
    public final void t(mdz<OpenChatListReporter.Span> mdzVar, Object obj) {
        StringBuilder sb = new StringBuilder("OpenChatListReporter ");
        OpenChatListReporter.Span span = mdzVar.b;
        sb.append(span);
        ndp0.c((int) mdzVar.a, sb.toString());
        int i = a.$EnumSwitchMapping$0[span.ordinal()];
        AtomicReference<mzp0> atomicReference = this.i;
        if (i == 1) {
            mzp0 mzp0Var = atomicReference.get();
            if (mzp0Var != null) {
                mzp0Var.c(false);
                return;
            }
            return;
        }
        if (i == 2 && h() && this.d.compareAndSet(false, true)) {
            View view = obj instanceof View ? (View) obj : null;
            if (view != null) {
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

    @Override // xsna.wn6
    public final void u(mdz mdzVar) {
        mzp0 mzp0Var;
        StringBuilder sb = new StringBuilder("OpenChatListReporter ");
        Object obj = mdzVar.b;
        sb.append(obj);
        ndp0.a((int) mdzVar.a, sb.toString());
        if (a.$EnumSwitchMapping$0[((OpenChatListReporter.Span) obj).ordinal()] != 1 || (mzp0Var = this.i.get()) == null) {
            return;
        }
        mzp0Var.a();
    }
}
