package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class odj implements io.reactivex.rxjava3.functions.l, plp0 {
    public final /* synthetic */ int b = 1;

    public /* synthetic */ odj() {
    }

    public static StringBuilder a(int i, int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return ((jon0) obj).a();
            default:
                wvk.b.getClass();
                return o5k.a.a((j5k) obj).getBytes(Charset.forName(C.UTF8_NAME));
        }
    }

    public /* synthetic */ odj(da4 da4Var) {
    }
}
