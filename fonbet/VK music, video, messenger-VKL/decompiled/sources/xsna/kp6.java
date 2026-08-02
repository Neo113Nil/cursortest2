package xsna;

import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class kp6 implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ kp6(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return ((androidx.media3.common.a) obj2).j - ((androidx.media3.common.a) obj).j;
            default:
                return Float.compare(((luu) obj).n().d().g(), ((luu) obj2).n().d().g());
        }
    }
}
