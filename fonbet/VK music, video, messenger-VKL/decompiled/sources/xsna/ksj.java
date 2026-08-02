package xsna;

import android.net.Uri;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.io.File;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ksj implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Comparable e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ksj(Object obj, Object obj2, Comparable comparable, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = comparable;
        this.f = obj3;
        this.g = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                f8r f8rVar = (f8r) this.c;
                w2w w2wVar = (w2w) this.d;
                Uri uri = (Uri) this.e;
                File file = (File) this.f;
                qr6 qr6Var = (qr6) this.g;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"ConvertUtils", "executing convertation with params filePathUri: " + uri + ", outputFile: " + file + ", queueName: im-file-convert"});
                }
                return f8rVar.a(w2wVar.getContext(), uri, file, qr6Var);
            default:
                n8w0 n8w0Var = (n8w0) this.c;
                UserId userId = (UserId) this.d;
                String str = (String) this.e;
                String str2 = (String) this.f;
                String str3 = (String) this.g;
                try {
                    return (byte[]) n8w0Var.a(userId, str, str2).c();
                } finally {
                    n8w0Var.b(str3);
                }
        }
    }
}
