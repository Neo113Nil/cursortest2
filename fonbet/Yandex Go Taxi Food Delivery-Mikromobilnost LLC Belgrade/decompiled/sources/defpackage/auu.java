package defpackage;

import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;

/* loaded from: classes15.dex */
public final /* synthetic */ class auu implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ euu b;
    public final /* synthetic */ int c;

    public /* synthetic */ auu(euu euuVar, int i, List list, boolean z) {
        this.a = 2;
        this.b = euuVar;
        this.c = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                euu euuVar = this.b;
                int i = this.c;
                euuVar.D.getClass();
                try {
                    euuVar.P.o(i, ErrorCode.CANCEL);
                    synchronized (euuVar) {
                        euuVar.R.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return zy11.a;
            case 1:
                euu euuVar2 = this.b;
                int i2 = this.c;
                euuVar2.D.getClass();
                synchronized (euuVar2) {
                    euuVar2.R.remove(Integer.valueOf(i2));
                }
                return zy11.a;
            default:
                euu euuVar3 = this.b;
                int i3 = this.c;
                euuVar3.D.getClass();
                try {
                    euuVar3.P.o(i3, ErrorCode.CANCEL);
                    synchronized (euuVar3) {
                        euuVar3.R.remove(Integer.valueOf(i3));
                    }
                } catch (IOException unused2) {
                }
                return zy11.a;
        }
    }

    public /* synthetic */ auu(euu euuVar, int i, Object obj, int i2) {
        this.a = i2;
        this.b = euuVar;
        this.c = i;
    }
}
