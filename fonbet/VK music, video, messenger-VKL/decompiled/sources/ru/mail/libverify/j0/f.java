package ru.mail.libverify.j0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.TreeMap;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
public final class f extends TreeMap<String, String> {
    private int a = 0;

    public f() {
    }

    public final int a() {
        return this.a;
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public final String put(@Nullable String str, @Nullable String str2) {
        if (str == null || str2 == null) {
            FileLog.e("ApiRequestParams", "Wrong request params key = %s, value = %s", str, str2);
            throw new IllegalArgumentException("Wrong request params");
        }
        this.a = str2.length() + str.length() + 2 + this.a;
        return (String) super.put((f) str, str2);
    }

    public f(@NonNull String str) {
        for (String str2 : str.split("&")) {
            String[] split = str2.split("=");
            put(split[0], split[1]);
        }
    }
}
