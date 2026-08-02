package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import com.airbnb.lottie.parser.moshi.a;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class mhr0 implements m131 {
    public static final mhr0 a = new mhr0();
    public static final hzk b = hzk.n("c", "v", CoreConstants.PushMessage.SERVICE_TYPE, "o");

    @Override // defpackage.m131
    public final Object x(a aVar, float f) {
        if (aVar.k() == JsonReader$Token.BEGIN_ARRAY) {
            aVar.a();
        }
        aVar.c();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z = false;
        while (aVar.hasNext()) {
            int o = aVar.o(b);
            if (o == 0) {
                z = aVar.nextBoolean();
            } else if (o == 1) {
                arrayList = yex.c(aVar, f);
            } else if (o == 2) {
                arrayList2 = yex.c(aVar, f);
            } else if (o != 3) {
                aVar.v();
                aVar.skipValue();
            } else {
                arrayList3 = yex.c(aVar, f);
            }
        }
        aVar.e();
        if (aVar.k() == JsonReader$Token.END_ARRAY) {
            aVar.d();
        }
        if (arrayList == null || arrayList2 == null || arrayList3 == null) {
            ny61.g("Shape data was missing information.");
            return null;
        }
        if (arrayList.isEmpty()) {
            return new lhr0(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayList.size();
        PointF pointF = (PointF) arrayList.get(0);
        ArrayList arrayList4 = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayList.get(i);
            int i2 = i - 1;
            arrayList4.add(new mdf(ti20.a((PointF) arrayList.get(i2), (PointF) arrayList3.get(i2)), ti20.a(pointF2, (PointF) arrayList2.get(i)), pointF2));
        }
        if (z) {
            PointF pointF3 = (PointF) arrayList.get(0);
            int i3 = size - 1;
            arrayList4.add(new mdf(ti20.a((PointF) arrayList.get(i3), (PointF) arrayList3.get(i3)), ti20.a(pointF3, (PointF) arrayList2.get(0)), pointF3));
        }
        return new lhr0(pointF, z, arrayList4);
    }
}
