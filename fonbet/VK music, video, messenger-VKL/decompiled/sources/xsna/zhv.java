package xsna;

import java.io.IOException;
import okhttp3.internal.http2.ErrorCode;

/* compiled from: TaskQueue.kt */
/* loaded from: classes8.dex */
public final class zhv extends c5o0 {
    public final /* synthetic */ vhv e;
    public final /* synthetic */ int f;
    public final /* synthetic */ vl8 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhv(String str, vhv vhvVar, int i, vl8 vl8Var, int i2, boolean z) {
        super(str, true);
        this.e = vhvVar;
        this.f = i;
        this.g = vl8Var;
        this.h = i2;
    }

    @Override // xsna.c5o0
    public final long a() {
        try {
            hr80 hr80Var = this.e.l;
            vl8 vl8Var = this.g;
            int i = this.h;
            hr80Var.getClass();
            vl8Var.skip(i);
            this.e.y.m(this.f, ErrorCode.CANCEL);
            synchronized (this.e) {
                this.e.A.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
