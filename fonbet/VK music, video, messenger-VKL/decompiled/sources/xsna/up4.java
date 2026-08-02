package xsna;

import androidx.media3.common.StreamKey;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class up4 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;

    public /* synthetic */ up4(int i) {
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Pair pair;
        switch (this.b) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                cj0 cj0Var = (cj0) obj2;
                int i = 1;
                if (cj0Var.b != 1) {
                    return null;
                }
                vki0 b = g5z.b(new yp4(cj0Var, null));
                if (b.hasNext()) {
                    pair = new Pair(0, (e7g0) b.next());
                    if (b.hasNext()) {
                        int i2 = ((e7g0) pair.g()).b.j;
                        while (true) {
                            int i3 = i + 1;
                            if (i < 0) {
                                e43.t();
                                throw null;
                            }
                            Pair pair2 = new Pair(Integer.valueOf(i), (e7g0) b.next());
                            int i4 = ((e7g0) pair2.g()).b.j;
                            if (i2 < i4) {
                                i2 = i4;
                                pair = pair2;
                            }
                            if (b.hasNext()) {
                                i = i3;
                            }
                        }
                    }
                } else {
                    pair = null;
                }
                if (pair == null) {
                    return null;
                }
                return new StreamKey(this.c, intValue, ((Number) pair.d()).intValue());
            default:
                ((Integer) obj2).getClass();
                com.vk.profile.design.view.profileheader.b.f(this.c, ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
        }
    }
}
