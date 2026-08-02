package xsna;

import android.media.MediaExtractor;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class j020 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ j020(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((MediaExtractor) obj).setDataSource(this.c);
                return s3q0.a;
            case 1:
                return io.reactivex.rxjava3.core.x.k(new Pair(this.c, ""));
            default:
                qgi0.k((tgi0) obj, this.c);
                return s3q0.a;
        }
    }
}
