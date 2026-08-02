package defpackage;

import android.graphics.drawable.ColorDrawable;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes3.dex */
public final /* synthetic */ class gac implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ gac(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(i2);
            case 1:
                return b.i(new Pair("type", "onRequestPointTap"), new Pair("requestPointIndex", Integer.valueOf(i2)));
            case 2:
                return Integer.valueOf(i2);
            case 3:
                return new androidx.compose.foundation.lazy.b(i2, 0);
            case 4:
                return new ColorDrawable(i2);
            default:
                return b.i(new Pair("type", "onRequestPointTap"), new Pair("requestPointIndex", Integer.valueOf(i2)));
        }
    }
}
