package defpackage;

import androidx.media3.common.a;

/* loaded from: classes10.dex */
public final class m06 implements h9v {
    public final quz b = new quz(25);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r6 >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        if (r6 >= 34) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(a aVar) {
        String str = aVar.n;
        if (str == null || !eh20.n(str)) {
            return iyi0.a(0, 0, 0, 0);
        }
        String str2 = aVar.n;
        int i = tw21.a;
        str2.getClass();
        switch (str2) {
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return iyi0.a(4, 0, 0, 0);
        }
        return iyi0.a(1, 0, 0, 0);
    }
}
