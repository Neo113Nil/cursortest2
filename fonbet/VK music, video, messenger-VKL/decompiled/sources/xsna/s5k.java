package xsna;

import java.io.File;
import java.util.Comparator;
import xsna.k8p;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class s5k implements Comparator {
    public final /* synthetic */ int b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                String name = ((File) obj).getName();
                int i = t5k.f;
                return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
            case 1:
                k8p.b bVar = (k8p.b) obj2;
                Integer num = ((k8p.b) obj).a;
                int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
                Integer num2 = bVar.a;
                return epx.g(intValue, num2 != null ? num2.intValue() : Integer.MIN_VALUE);
            default:
                return yads.ef1.a((yads.zr) obj, (yads.zr) obj2);
        }
    }
}
