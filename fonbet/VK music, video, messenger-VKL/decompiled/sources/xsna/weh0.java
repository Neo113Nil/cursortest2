package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: ScrollCapture.android.kt */
/* loaded from: classes11.dex */
public final class weh0 extends Lambda implements izs {
    public static final weh0 j;
    public static final weh0 k;
    public final /* synthetic */ int i;

    static {
        int i = 1;
        j = new weh0(i, 0);
        k = new weh0(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ weh0(int i, int i2) {
        super(i);
        this.i = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.i) {
            case 0:
                return Integer.valueOf(((zeh0) obj).b);
            default:
                return s3q0.a;
        }
    }
}
