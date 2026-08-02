package com.vungle.ads.internal.persistence;

import com.vungle.ads.internal.executor.j;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.n;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import xsna.xy4;

/* loaded from: classes7.dex */
public final class FilePreferences {
    public static final a d = new a();
    public static final ConcurrentHashMap e = new ConcurrentHashMap();
    public final Executor a;
    public final File b;
    public final ConcurrentHashMap c;

    public /* synthetic */ FilePreferences(j jVar, PathProvider pathProvider, String str, int i) {
        this(jVar, pathProvider, str);
    }

    public final void b() {
        this.a.execute(new xy4(3, this, new HashMap(this.c)));
    }

    public final String c() {
        Object obj = this.c.get("previous_tcf_token");
        return obj instanceof String ? (String) obj : "";
    }

    public final String getString(String str) {
        Object obj = this.c.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public FilePreferences(j jVar, PathProvider pathProvider, String str) {
        this.a = jVar;
        File file = new File(pathProvider.a(), str);
        this.b = file;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.c = concurrentHashMap;
        Object c = n.c(file);
        if (c instanceof HashMap) {
            concurrentHashMap.putAll((HashMap) c);
        }
    }

    public static final void a(FilePreferences filePreferences, Serializable serializable) {
        n.a(filePreferences.b, serializable);
    }

    public final FilePreferences a(boolean z, String str) {
        this.c.put(str, Boolean.valueOf(z));
        return this;
    }

    public final FilePreferences b(String str, int i) {
        this.c.put(str, Integer.valueOf(i));
        return this;
    }

    public final Boolean a(String str) {
        Object obj = this.c.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    public final FilePreferences b(String str, long j) {
        this.c.put(str, Long.valueOf(j));
        return this;
    }

    public final FilePreferences a(String str, String str2) {
        this.c.put(str, str2);
        return this;
    }

    public final int a(String str, int i) {
        Object obj = this.c.get(str);
        return obj instanceof Integer ? ((Number) obj).intValue() : i;
    }

    public final long a(String str, long j) {
        Object obj = this.c.get(str);
        return obj instanceof Long ? ((Number) obj).longValue() : j;
    }
}
