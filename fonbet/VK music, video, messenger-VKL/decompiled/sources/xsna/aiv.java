package xsna;

import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;

/* compiled from: TaskQueue.kt */
/* loaded from: classes8.dex */
public final class aiv extends c5o0 {
    public final /* synthetic */ vhv e;
    public final /* synthetic */ int f;
    public final /* synthetic */ List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiv(String str, vhv vhvVar, int i, List list, boolean z) {
        super(str, true);
        this.e = vhvVar;
        this.f = i;
        this.g = list;
    }

    @Override // xsna.c5o0
    public final long a() {
        this.e.l.getClass();
        try {
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
