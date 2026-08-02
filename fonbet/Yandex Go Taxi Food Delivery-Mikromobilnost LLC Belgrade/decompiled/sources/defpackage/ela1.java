package defpackage;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public abstract class ela1 {
    public static void a(int i, String str) {
        if (i >= 0) {
            return;
        }
        ny61.g(qv10.h(i, str, " cannot be negative but was: "));
    }

    public static void b(Object obj, Object obj2) {
        if (obj == null) {
            ny61.t(qv10.o("null key in entry: null=", obj2));
        } else {
            if (obj2 != null) {
                return;
            }
            ny61.t(qv10.p("null value in entry: ", "=null", obj));
        }
    }

    public static boolean c(int i, int i2) {
        return (i & i2) == i2;
    }

    public static final lum d() {
        return new lum(new txk(21), moq.a, new mtw(26), noq.a);
    }

    public static List e(Intent intent) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Uri data = intent.getData();
        if (data != null) {
            linkedHashSet.add(data);
        }
        ClipData clipData = intent.getClipData();
        if (clipData == null && linkedHashSet.isEmpty()) {
            return EmptyList.a;
        }
        if (clipData != null) {
            int itemCount = clipData.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                Uri uri = clipData.getItemAt(i).getUri();
                if (uri != null) {
                    linkedHashSet.add(uri);
                }
            }
        }
        return new ArrayList(linkedHashSet);
    }

    public static String f(int i) {
        ArrayList arrayList = new ArrayList();
        if (c(i, 1)) {
            arrayList.add(1);
        }
        if (c(i, 4)) {
            arrayList.add(2);
        }
        if (c(i, 2)) {
            arrayList.add(3);
        }
        return oyr.p("( ", a.X(arrayList, " OR ", null, null, new nqi0(5), 30), " )");
    }
}
