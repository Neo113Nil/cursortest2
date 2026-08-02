package xsna;

import android.graphics.Point;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: QrMlkitUtils.kt */
/* loaded from: classes5.dex */
public final class tne0 {
    public static final ArrayList a(Collection collection) {
        ArrayList<Point> arrayList;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        Collection<y36> collection2 = collection;
        ArrayList arrayList2 = new ArrayList(c5g.u(collection2, 10));
        for (y36 y36Var : collection2) {
            Point[] pointArr = y36Var.b;
            if (pointArr == null) {
                arrayList = new ArrayList();
            } else {
                ArrayList arrayList3 = new ArrayList();
                Point point = pointArr[3];
                arrayList3.add(new Point((int) (point.x * 1.0f), (int) (point.y * 1.0f)));
                Point point2 = pointArr[0];
                arrayList3.add(new Point((int) (point2.x * 1.0f), (int) (point2.y * 1.0f)));
                Point point3 = pointArr[1];
                arrayList3.add(new Point((int) (point3.x * 1.0f), (int) (point3.y * 1.0f)));
                Point point4 = pointArr[2];
                arrayList3.add(new Point((int) (point4.x * 1.0f), (int) (point4.y * 1.0f)));
                arrayList = arrayList3;
            }
            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList, 10));
            for (Point point5 : arrayList) {
                arrayList4.add(new ResultPoint(point5.x, point5.y));
            }
            arrayList2.add(new Result(y36Var.a.R(), null, (ResultPoint[]) arrayList4.toArray(new ResultPoint[0]), null));
        }
        return arrayList2;
    }
}
