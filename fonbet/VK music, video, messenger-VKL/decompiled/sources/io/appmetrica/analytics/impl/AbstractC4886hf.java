package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.hf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC4886hf {
    public static final String c = "hf";
    public final Ta a;
    public final String b;

    public AbstractC4886hf(Ta ta, String str) {
        this.a = ta;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC4886hf> T a(String str, float f) {
        synchronized (this) {
            this.a.a(str, f);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC4886hf> T b(String str, String str2) {
        synchronized (this) {
            this.a.a(str, str2);
        }
        return this;
    }

    public final Cif c(String str) {
        return new Cif(str, this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC4886hf> T d(String str) {
        synchronized (this) {
            this.a.remove(str);
        }
        return this;
    }

    @NonNull
    public Set<String> c() {
        return this.a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC4886hf> T a(String str, String[] strArr) {
        String str2;
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str3 : strArr) {
                jSONArray.put(str3);
            }
            str2 = jSONArray.toString();
        } catch (Throwable unused) {
            str2 = null;
        }
        this.a.a(str, str2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC4886hf> T b(String str, long j) {
        synchronized (this) {
            this.a.a(str, j);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final <T extends AbstractC4886hf> T b(String str, int i) {
        synchronized (this) {
            this.a.a(i, str);
        }
        return this;
    }

    public final <T extends AbstractC4886hf> T a(String str, List<String> list) {
        return (T) a(str, (String[]) list.toArray(new String[list.size()]));
    }

    public final long a(String str, long j) {
        return this.a.getLong(str, j);
    }

    public final int a(@NonNull String str, int i) {
        return this.a.getInt(str, i);
    }

    @Nullable
    public final String a(@NonNull String str, @Nullable String str2) {
        return this.a.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC4886hf> T b(String str, boolean z) {
        synchronized (this) {
            this.a.a(str, z);
        }
        return this;
    }

    public final boolean a(String str, boolean z) {
        return this.a.getBoolean(str, z);
    }

    public final void b() {
        synchronized (this) {
            this.a.b();
        }
    }

    public final boolean b(@NonNull String str) {
        return this.a.a(str);
    }
}
