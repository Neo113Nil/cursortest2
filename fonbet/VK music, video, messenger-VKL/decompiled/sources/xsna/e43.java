package xsna;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.apps.common.proguard.SideEffectFree;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;

/* compiled from: AppContextHolder.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public class e43 {
    public static Context a;

    @Nullable
    public static Boolean b;

    @Nullable
    public static Boolean c;

    @Nullable
    public static Boolean d;

    @Nullable
    public static Boolean e;

    public static ArrayList a(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new gk3(objArr, true));
    }

    public static int b(int i, List list, izs izsVar) {
        q(list.size(), i);
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int intValue = ((Number) izsVar.invoke(list.get(i4))).intValue();
            if (intValue < 0) {
                i3 = i4 + 1;
            } else {
                if (intValue <= 0) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static int c(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        q(arrayList.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int b2 = jw5.b((Comparable) arrayList.get(i3), comparable);
            if (b2 < 0) {
                i2 = i3 + 1;
            } else {
                if (b2 <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static ListBuilder e() {
        return new ListBuilder(10);
    }

    public static EmptyList f() {
        return EmptyList.b;
    }

    public static k9x g(Collection collection) {
        return new k9x(0, collection.size() - 1, 1);
    }

    public static int h(List list) {
        return list.size() - 1;
    }

    @SideEffectFree
    public static boolean i(@NonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (b == null) {
            b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return b.booleanValue();
    }

    @TargetApi(26)
    public static boolean j(@NonNull Context context) {
        i(context);
        if (c == null) {
            c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return c.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    public static List k(Object obj) {
        return Collections.singletonList(obj);
    }

    public static List l(Object... objArr) {
        return objArr.length > 0 ? Arrays.asList(objArr) : EmptyList.b;
    }

    public static List m(Object obj) {
        return obj != null ? Collections.singletonList(obj) : EmptyList.b;
    }

    public static List n(Object... objArr) {
        return rl3.I(objArr);
    }

    public static ArrayList o(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new gk3(objArr, true));
    }

    public static final List p(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : Collections.singletonList(list.get(0)) : EmptyList.b;
    }

    public static final void q(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(tgw.b(i2, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (i2 > i) {
            throw new IndexOutOfBoundsException(sl9.c(i2, i, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static List r(Iterable iterable) {
        List Q0 = j5g.Q0(iterable);
        Collections.shuffle(Q0);
        return Q0;
    }

    public static void s() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void t() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
