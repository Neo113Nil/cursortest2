package defpackage;

import android.content.Context;
import android.os.Build;

/* loaded from: classes12.dex */
public final class kw {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public kw(Context context) {
        this.a = context.getString(oyh0.call_duration_days_format);
        this.b = context.getString(oyh0.call_duration_hours_format);
        this.c = context.getString(oyh0.call_duration_minutes_format);
        this.d = context.getString(oyh0.call_duration_seconds_format);
    }

    public static void a(long j, String str, StringBuilder sb) {
        if (j != 0) {
            if (sb.length() > 0) {
                sb.append((char) 160);
            }
            sb.append(j);
            sb.append((char) 160);
            sb.append(str);
        }
    }

    public String b(long j) {
        String str = this.d;
        if (j == 0) {
            return g8e.o("0 ", str);
        }
        StringBuilder sb = new StringBuilder();
        a(((j / 60) / 60) / 24, this.a, sb);
        a(((j % 86400) / 60) / 60, this.b, sb);
        a((j % 3600) / 60, this.c, sb);
        a(j % 60, str, sb);
        return sb.toString();
    }

    public String c() {
        return this.d;
    }

    public kw(String str, String str2, String str3, String str4, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        str4 = (i & 16) != 0 ? null : str4;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public kw(String str, String str2, String str3, String str4) {
        String str5 = Build.MANUFACTURER;
        String str6 = Build.MODEL;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public /* synthetic */ kw(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }
}
