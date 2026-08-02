package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public final class lvt {
    public static final lvt f;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    static {
        String str = null;
        f = new lvt(str, str, str, str);
    }

    public lvt(String str, String str2, String str3, String str4, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
    }

    public final String a() {
        return this.d;
    }

    public final List b() {
        return this.e;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.a;
    }

    public /* synthetic */ lvt(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, EmptyList.a);
    }
}
