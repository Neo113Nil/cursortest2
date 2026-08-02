package defpackage;

import androidx.concurrent.futures.b;

/* loaded from: classes10.dex */
public final /* synthetic */ class en7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ en7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                sgb1.g(3, "Camera2CapturePipeline");
                ((b) obj).b(null);
                return;
            default:
                tdp0 tdp0Var = (tdp0) obj;
                synchronized (tdp0Var.b) {
                    try {
                        if (tdp0Var.d == null) {
                            sgb1.g(5, "ScreenFlashWrapper");
                        }
                        tdp0Var.c();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
