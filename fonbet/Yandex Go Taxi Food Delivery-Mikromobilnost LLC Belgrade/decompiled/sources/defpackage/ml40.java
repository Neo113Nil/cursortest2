package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.oned.Code128Writer;
import java.util.Map;

/* loaded from: classes11.dex */
public final class ml40 implements fc51 {
    @Override // defpackage.fc51
    public final vz5 a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        fc51 kanVar;
        switch (ll40.a[barcodeFormat.ordinal()]) {
            case 1:
                kanVar = new kan();
                break;
            case 2:
                kanVar = new ir11();
                break;
            case 3:
                kanVar = new jan();
                break;
            case 4:
                kanVar = new er11();
                break;
            case 5:
                kanVar = new s5g0();
                break;
            case 6:
                kanVar = new y8c();
                break;
            case 7:
                kanVar = new a9c();
                break;
            case 8:
                kanVar = new Code128Writer();
                break;
            case 9:
                kanVar = new y3v();
                break;
            case 10:
                kanVar = new t390();
                break;
            case 11:
                kanVar = new v8c();
                break;
            case 12:
                kanVar = new nog();
                break;
            case 13:
                kanVar = new hc4();
                break;
            default:
                kbs.f(barcodeFormat, "No encoder available for format ");
                return null;
        }
        return kanVar.a(str, barcodeFormat, i, i2, map);
    }
}
