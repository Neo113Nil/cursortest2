package com.google.android.gms.gcm;

import defpackage.w53;
import java.util.Map;

/* loaded from: classes11.dex */
public final class a {
    public static a b;
    public final w53 a = new w53();

    public final synchronized void a(String str, String str2) {
        Map map = (Map) this.a.get(str2);
        if (map != null && map.remove(str) != null && map.isEmpty()) {
            this.a.remove(str2);
        }
    }

    public final synchronized boolean b(String str) {
        return this.a.containsKey(str);
    }

    public final synchronized boolean c(String str, String str2) {
        Map map = (Map) this.a.get(str2);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
