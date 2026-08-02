package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class hif implements z4i0 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public final Object d;

    public hif(LinkedHashMap linkedHashMap, int i, int i2) {
        this.a = 2;
        this.b = i2;
        this.d = new StringBuilder();
        this.c = i;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            this.c -= ((String) entry.getValue()).length() + (((String) entry.getKey()).length() + 1);
        }
    }

    @Override // defpackage.z4i0
    public void a(String str, String str2) {
        int i = this.c;
        StringBuilder sb = (StringBuilder) this.d;
        if (sb.length() > 0) {
            i--;
        }
        int length = i - (str.length() + 1);
        if (length <= 0) {
            return;
        }
        String n = gwk0.n(str2);
        int i2 = this.b;
        if (length <= i2) {
            i2 = length;
        }
        if (i2 >= 0 && n.length() > i2) {
            int i3 = i2 - 2;
            if ((i3 >= 0 && n.charAt(i3) == '%') || (i2 - 1 >= 0 && n.charAt(i3) == '%')) {
                i2 = i3;
            }
            n = n.substring(0, i2);
        }
        this.c = length - n.length();
        if (sb.length() > 0) {
            sb.append(",");
        }
        x4e.C(sb, str, "=", n);
    }

    public void b() {
        this.c--;
    }

    public boolean c() {
        return this.c < this.b;
    }

    public char d() {
        return ((char[]) this.d)[this.c];
    }

    public void e() {
        this.c++;
    }

    public char f() {
        char[] cArr = (char[]) this.d;
        int i = this.c;
        this.c = i + 1;
        return cArr[i];
    }

    public void g(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int i3 = this.b;
        this.b = i;
        this.c = i2;
        if (i3 == i || i3 == -1) {
            return;
        }
        if (i == -1) {
            if (i3 != arrayList.size() - 1) {
                arrayList.remove(i3);
                int i4 = this.b;
                if (i3 < i4) {
                    this.b = i4 - 1;
                    return;
                }
                return;
            }
            return;
        }
        int size = arrayList.size();
        if (i3 < 0 || i3 >= size) {
            jst.e.x(new IndexOutOfBoundsException(oyr.h(i3, size, "Index: ", ", Size: ")), "wrong old group index");
            return;
        }
        if (i < 0 || i >= size) {
            jst.e.x(new IndexOutOfBoundsException(oyr.h(i3, size, "Index: ", ", Size: ")), "wrong new group index");
            return;
        }
        if (jl40.l(arrayList.get(i3), arrayList.get(i))) {
            arrayList.remove(i3);
            int i5 = this.b;
            if (i3 < i5) {
                this.b = i5 - 1;
            }
        }
    }

    public boolean h(char c) {
        int i = this.c;
        if (i >= this.b || ((char[]) this.d)[i] != c) {
            return false;
        }
        this.c = i + 1;
        return true;
    }

    public boolean i(String str) {
        int length = str.length();
        if (this.c + length < this.b) {
            for (int i = 0; i < length; i++) {
                if (((char[]) this.d)[this.c + i] == str.charAt(i)) {
                }
            }
            this.c += length;
            return true;
        }
        return false;
    }

    public synchronized int j() {
        PackageInfo packageInfo;
        if (this.b == 0) {
            try {
                packageInfo = nb51.a((Context) this.d).c(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e) {
                e.toString();
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.b = packageInfo.versionCode;
            }
        }
        return this.b;
    }

    public synchronized int k() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.d;
        PackageManager packageManager = context.getPackageManager();
        if (nb51.a(context).a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.isEmpty()) {
            this.c = 2;
            return 2;
        }
        this.c = 2;
        return 2;
    }

    @Override // defpackage.z4i0
    public String toString() {
        switch (this.a) {
            case 2:
                return ((StringBuilder) this.d).toString();
            default:
                return super.toString();
        }
    }

    public hif(char[] cArr) {
        this.a = 0;
        this.d = cArr;
        this.b = cArr.length;
    }

    public hif(ArrayList arrayList) {
        this.a = 1;
        this.d = arrayList;
        this.b = -1;
        this.c = -1;
    }

    public hif(Context context) {
        this.a = 3;
        this.c = 0;
        this.d = context;
    }
}
