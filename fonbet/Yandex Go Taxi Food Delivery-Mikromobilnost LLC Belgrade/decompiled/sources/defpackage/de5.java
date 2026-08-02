package defpackage;

import android.util.Log;
import io.flutter.plugin.common.FlutterException;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class de5 implements rt5 {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ de5(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // defpackage.rt5
    public final void a(ByteBuffer byteBuffer) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                m2v m2vVar = (m2v) obj2;
                try {
                    ((fe5) obj).a(((rs10) m2vVar.c).a(byteBuffer));
                    break;
                } catch (RuntimeException e) {
                    Log.e("BasicMessageChannel#" + ((String) m2vVar.b), "Failed to handle message reply", e);
                    return;
                }
            default:
                ea20 ea20Var = (ea20) obj2;
                da20 da20Var = (da20) obj;
                try {
                    if (byteBuffer == null) {
                        da20Var.notImplemented();
                    } else {
                        try {
                            da20Var.success(ea20Var.c.g(byteBuffer));
                        } catch (FlutterException e2) {
                            da20Var.error(e2.code, e2.getMessage(), e2.details);
                        }
                    }
                    break;
                } catch (RuntimeException e3) {
                    Log.e("MethodChannel#" + ea20Var.b, "Failed to handle method call result", e3);
                    return;
                }
        }
    }
}
