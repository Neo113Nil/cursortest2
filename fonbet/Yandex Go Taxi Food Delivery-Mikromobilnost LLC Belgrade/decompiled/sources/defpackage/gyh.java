package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes12.dex */
public final class gyh {
    public final String a;
    public final List b;
    public final List c;
    public final String d;
    public final t4s e;
    public final Map f;
    public final boolean g;
    public final boolean h;
    public final Integer i;
    public final String j;
    public final zi8 k;

    public gyh(String str, List list, List list2, String str2, t4s t4sVar, MapBuilder mapBuilder, boolean z, boolean z2, Integer num, String str3, zi8 zi8Var, int i) {
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        list = i2 != 0 ? emptyList : list;
        list2 = (i & 4) != 0 ? emptyList : list2;
        str2 = (i & 8) != 0 ? null : str2;
        t4sVar = (i & 16) != 0 ? null : t4sVar;
        mapBuilder = (i & 32) != 0 ? null : mapBuilder;
        z = (i & 64) != 0 ? true : z;
        z2 = (i & 128) != 0 ? false : z2;
        num = (i & 256) != 0 ? null : num;
        str3 = (i & 512) != 0 ? null : str3;
        zi8Var = (i & 1024) != 0 ? null : zi8Var;
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = str2;
        this.e = t4sVar;
        this.f = mapBuilder;
        this.g = z;
        this.h = z2;
        this.i = num;
        this.j = str3;
        this.k = zi8Var;
    }
}
