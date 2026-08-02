package ru.mail.libverify.n;

import androidx.annotation.NonNull;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import ru.mail.libverify.n.m;
import xsna.i5s;

/* loaded from: classes9.dex */
public final class b {
    private final long a;

    @NonNull
    private final m.b b;

    @NonNull
    private final String c;

    @NonNull
    private final String d;

    public b(long j, @NonNull m.b bVar, @NonNull String str, @NonNull String str2) {
        this.a = j;
        this.b = bVar;
        this.c = str;
        this.d = str2;
    }

    public final long a() {
        return this.a;
    }

    @NonNull
    public final String b() {
        return this.c;
    }

    @NonNull
    public final String c() {
        return this.d;
    }

    @NonNull
    public final m.b d() {
        return this.b;
    }

    @NonNull
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("{");
        sb.append(this.b);
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        String str2 = this.c;
        String str3 = "null";
        if (str2 == null) {
            str = "null";
        } else {
            str = X3.j.d + str2.length() + X3.j.e;
        }
        sb.append(str);
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        String str4 = this.d;
        if (str4 != null) {
            str3 = X3.j.d + str4.length() + X3.j.e;
        }
        return i5s.a(sb, str3, "}");
    }
}
