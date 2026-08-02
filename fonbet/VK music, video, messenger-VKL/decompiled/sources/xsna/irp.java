package xsna;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: EntriesProfiler.kt */
/* loaded from: classes4.dex */
public final class irp {

    /* compiled from: EntriesProfiler.kt */
    public static final class a {
        public final int a;
        public final ArrayList b;
        public final int c;
        public final long d;
        public final long e;

        public a(int i, ArrayList arrayList, int i2, long j, long j2) {
            this.a = i;
            this.b = arrayList;
            this.c = i2;
            this.d = j;
            this.e = j2;
        }
    }

    public static void a(RecyclerView recyclerView) {
        String str;
        if (recyclerView != null && BuildInfo.h() && hd60.a().q()) {
            try {
                ArrayList arrayList = new ArrayList();
                Field declaredField = recyclerView.getRecycledViewPool().getClass().getSuperclass().getDeclaredField("mScrap");
                declaredField.setAccessible(true);
                SparseArray sparseArray = (SparseArray) declaredField.get(recyclerView.getRecycledViewPool());
                bjk0 bjk0Var = new bjk0(sparseArray);
                while (bjk0Var.hasNext()) {
                    int nextInt = bjk0Var.nextInt();
                    Object obj = sparseArray.get(nextInt);
                    Field declaredField2 = obj.getClass().getDeclaredField("mScrapHeap");
                    declaredField2.setAccessible(true);
                    ArrayList arrayList2 = (ArrayList) declaredField2.get(obj);
                    declaredField2.setAccessible(false);
                    Field declaredField3 = obj.getClass().getDeclaredField("mMaxScrap");
                    declaredField3.setAccessible(true);
                    int intValue = ((Integer) declaredField3.get(obj)).intValue();
                    declaredField3.setAccessible(false);
                    Field declaredField4 = obj.getClass().getDeclaredField("mCreateRunningAverageNs");
                    declaredField4.setAccessible(true);
                    long longValue = ((Long) declaredField4.get(obj)).longValue();
                    declaredField4.setAccessible(false);
                    Field declaredField5 = obj.getClass().getDeclaredField("mBindRunningAverageNs");
                    declaredField5.setAccessible(true);
                    long longValue2 = ((Long) declaredField5.get(obj)).longValue();
                    declaredField5.setAccessible(false);
                    arrayList.add(new a(nextInt, i7o0.a(arrayList2), intValue, longValue, longValue2));
                }
                declaredField.setAccessible(false);
                for (a aVar : j5g.D0(jw5.a(new com.vk.movika.sdk.base.observable.u(26), new rd1(17)), arrayList)) {
                    Integer valueOf = Integer.valueOf(aVar.a);
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    int i = aVar.a;
                    Field[] fields = i4c0.class.getFields();
                    int length = fields.length;
                    int i2 = 0;
                    while (true) {
                        str = null;
                        if (i2 < length) {
                            Field field = fields[i2];
                            if (i == ((Integer) field.get(null)).intValue()) {
                                str = field.getName();
                                break;
                            }
                            i2++;
                        }
                    }
                    sb.append(str);
                    L.e(String.format("%5d %30s create = %10f ms bind = %10f ms scrap = %2d \t maxScrap = %2d", Arrays.copyOf(new Object[]{valueOf, sb.toString(), Float.valueOf(aVar.d / 1000000.0f), Float.valueOf(aVar.e / 1000000.0f), Integer.valueOf(aVar.b.size()), Integer.valueOf(aVar.c)}, 6)));
                }
            } catch (Exception e) {
                L.e(e);
            }
        }
    }
}
