package defpackage;

import android.media.Image;
import com.yandex.go.masstransit.sdk.camera.ml.b;

/* loaded from: classes4.dex */
public final class m52 implements t7v {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ m52(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.t7v
    public final void d(x4r0 x4r0Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((n52) obj).a.O(new l52(0, this, x4r0Var));
                break;
            default:
                Image f = x4r0Var.b.f();
                if (f != null) {
                    m0x0 m0x0Var = ((b) obj).d;
                    if (m0x0Var == null) {
                        w511.b();
                        break;
                    } else {
                        m0x0Var.a(f, x4r0Var.x.e());
                    }
                }
                x4r0Var.close();
                break;
        }
    }
}
