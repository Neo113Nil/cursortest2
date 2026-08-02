package defpackage;

import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.internal.play_billing.n;
import com.yandex.passport.common.network.r;
import com.yandex.passport.common.network.u;
import com.yandex.passport.data.models.g;
import com.yandex.passport.data.network.core.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public abstract /* synthetic */ class oo31 {
    public static int a(int i, int i2, int i3) {
        return n.q(i) + i2 + i3;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return y0.t(i) + i2 + i3 + i4;
    }

    public static int c(int i, int i2, int i3, int i4, int i5) {
        return Math.max(((i * i2) / i3) + i4, i5);
    }

    public static int d(Parcelable.Creator creator, Parcel parcel, ArrayList arrayList, int i, int i2) {
        arrayList.add(creator.createFromParcel(parcel));
        return i + i2;
    }

    public static Parcelable e(Bundle bundle, Class cls, String str) {
        bundle.setClassLoader(cls.getClassLoader());
        return bundle.getParcelable(str);
    }

    public static View f(ViewGroup viewGroup, int i, ViewGroup viewGroup2, boolean z) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup2, z);
    }

    public static r g(String str, String str2) {
        r rVar = new r(str);
        rVar.c(str2);
        return rVar;
    }

    public static u h(long j, p pVar, g gVar) {
        return pVar.a(gVar, new Long(j));
    }

    public static String i(StringBuilder sb, Boolean bool, char c) {
        sb.append(bool);
        sb.append(c);
        return sb.toString();
    }

    public static String j(StringBuilder sb, Integer num, String str) {
        sb.append(num);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder k(String str, float f, String str2, float f2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(f);
        sb.append(str2);
        sb.append(f2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder l(String str, String str2, String str3, String str4, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(z);
        sb.append(str4);
        return sb;
    }

    public static Iterator m(Parcel parcel, int i, List list) {
        parcel.writeInt(i);
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static void n(SharedPreferences sharedPreferences, String str, boolean z) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public static /* synthetic */ void o(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else {
                w511.q();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void p(Class cls, LinkedHashMap linkedHashMap, EmptyList emptyList, Class cls2, EmptyList emptyList2) {
        linkedHashMap.put(qoi0.a(cls), emptyList);
        linkedHashMap.put(qoi0.a(cls2), emptyList2);
    }

    public static void q(boolean z, HashMap hashMap, String str, boolean z2, String str2) {
        hashMap.put(str, Boolean.valueOf(z));
        hashMap.put(str2, Boolean.valueOf(z2));
    }

    public static int r(int i, int i2, int i3) {
        return y0.t(i) + i2 + i3;
    }
}
