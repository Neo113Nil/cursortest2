package xsna;

import java.util.Comparator;
import xsna.zjx0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class yjx0 implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ yjx0(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a;
        switch (this.b) {
            case 0:
                return Integer.compare(((zjx0.a) obj).a.b, ((zjx0.a) obj2).a.b);
            default:
                a = ru.mail.libverify.z.b.a((ru.mail.libverify.z.b) obj, (ru.mail.libverify.z.b) obj2);
                return a;
        }
    }
}
