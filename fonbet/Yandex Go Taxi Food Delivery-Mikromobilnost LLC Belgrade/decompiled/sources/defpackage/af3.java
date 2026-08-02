package defpackage;

import android.util.Size;
import java.util.Comparator;

/* loaded from: classes10.dex */
public final /* synthetic */ class af3 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ af3(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                int abs = Math.abs(((Integer) obj).intValue() - i2) - Math.abs(((Integer) obj2).intValue() - i2);
                return (int) (abs == 0 ? Math.signum(r3.intValue() - r4.intValue()) : Math.signum(abs));
            default:
                return Math.abs(vjs0.a((Size) obj) - i2) - Math.abs(vjs0.a((Size) obj2) - i2);
        }
    }
}
