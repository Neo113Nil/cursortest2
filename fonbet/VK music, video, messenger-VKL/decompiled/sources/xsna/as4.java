package xsna;

import com.vk.medianative.AudioNative;
import xsna.t6j0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class as4 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ as4(int i, q4a0 q4a0Var) {
        this.b = 1;
        this.c = i;
        this.d = q4a0Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        switch (this.b) {
            case 0:
                return AudioNative.f((short[]) this.d, this.c);
            case 1:
                Integer num = ((q4a0) this.d).p;
                if (num != null) {
                    if (this.c == num.intValue()) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                ((izs) this.d).invoke(new t6j0.b(this.c));
                return s3q0.a;
        }
    }

    public /* synthetic */ as4(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }
}
