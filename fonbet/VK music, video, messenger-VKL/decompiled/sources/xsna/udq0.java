package xsna;

import java.nio.channels.Pipe;
import java.nio.channels.Selector;
import kotlin.NoWhenBranchMatchedException;
import one.video.upload.impl.UploadMode;

/* compiled from: UploaderImpl.kt */
/* loaded from: classes8.dex */
public final class udq0 extends rd7 {
    public final /* synthetic */ tdq0 c;

    /* compiled from: UploaderImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UploadMode.values().length];
            try {
                iArr[UploadMode.FIXED_FILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UploadMode.STREAMING_FILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public udq0(tdq0 tdq0Var, cdi cdiVar) {
        super(cdiVar);
        this.c = tdq0Var;
    }

    @Override // xsna.rd7
    public final void d(dai0 dai0Var) {
        dai0Var.N1();
        tdq0 tdq0Var = this.c;
        long b = tdq0Var.i.b();
        long j = tdq0Var.g.a;
        if (j > 0) {
            tdq0Var.d.a(b, j);
        }
    }

    public final void f() {
        tdq0 tdq0Var = this.c;
        tdq0Var.a(true);
        int i = a.$EnumSwitchMapping$0[tdq0Var.b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            cdi cdiVar = (cdi) this.a;
            d9r d9rVar = new d9r(cdiVar);
            Pipe.SourceChannel source = d9rVar.a.source();
            c9r c9rVar = new c9r(this, cdiVar, source, new il7(20, this, tdq0Var));
            source.configureBlocking(false);
            source.register((Selector) this.b, 1, c9rVar);
            tdq0Var.m.complete(d9rVar);
        }
    }
}
