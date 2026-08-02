package xsna;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
import xsna.nxn0;

/* compiled from: Comparisons.kt */
/* loaded from: classes3.dex */
public final class tbb0 implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ tbb0(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(Integer.valueOf(((ic50) obj).e), Integer.valueOf(((ic50) obj2).e));
            case 1:
                return jw5.b(Integer.valueOf(((fxj0) obj2).e6()), Integer.valueOf(((fxj0) obj).e6()));
            case 2:
                return jw5.b(Integer.valueOf(((nov) obj).getStickerLayerType()), Integer.valueOf(((nov) obj2).getStickerLayerType()));
            case 3:
                return jw5.b(((nxn0.a) obj).a, ((nxn0.a) obj2).a);
            default:
                return ((Scope) obj).c.compareTo(((Scope) obj2).c);
        }
    }
}
