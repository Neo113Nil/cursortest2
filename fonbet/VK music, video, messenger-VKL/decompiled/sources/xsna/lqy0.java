package xsna;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import xsna.oqy0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class lqy0 implements Consumer {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        final oqy0.a[] aVarArr = oqy0.a;
        String str = (String) entry.getKey();
        int intValue = ((Integer) entry.getValue()).intValue();
        while (str.length() > 8) {
            int parseInt = Integer.parseInt(str.substring(0, 8), 2);
            str = str.substring(8);
            if (aVarArr[parseInt] == null) {
                aVarArr[parseInt] = new oqy0.a();
            }
            aVarArr = aVarArr[parseInt].c;
        }
        int parseInt2 = Integer.parseInt(str.substring(0, str.length()), 2);
        final oqy0.a aVar = new oqy0.a(intValue, str.length());
        int length = 8 - str.length();
        final int i = parseInt2 << length;
        IntStream.range(0, (int) Math.pow(2.0d, length)).map(new IntUnaryOperator() { // from class: xsna.mqy0
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i2) {
                return i2 | i;
            }
        }).forEach(new IntConsumer() { // from class: xsna.nqy0
            @Override // java.util.function.IntConsumer
            public final void accept(int i2) {
                aVarArr[i2] = aVar;
            }
        });
    }
}
