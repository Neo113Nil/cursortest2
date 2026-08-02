package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;

/* loaded from: classes.dex */
public final class lm00 {
    public final String a;
    public final zzs b;
    public final MapObjectType c;
    public final wp31 d;
    public final List e;
    public final Set f;
    public boolean g;
    public final sm00 h;

    public lm00(String str, zzs zzsVar, MapObjectType mapObjectType, wp31 wp31Var, List list, Set set, boolean z, sm00 sm00Var) {
        this.a = str;
        this.b = zzsVar;
        this.c = mapObjectType;
        this.d = wp31Var;
        this.e = list;
        this.f = set;
        this.g = z;
        this.h = sm00Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.Set] */
    public static lm00 a(lm00 lm00Var, wp31 wp31Var, LinkedHashSet linkedHashSet, int i) {
        String str = lm00Var.a;
        zzs zzsVar = lm00Var.b;
        MapObjectType mapObjectType = lm00Var.c;
        if ((i & 8) != 0) {
            wp31Var = lm00Var.d;
        }
        wp31 wp31Var2 = wp31Var;
        List list = lm00Var.e;
        LinkedHashSet linkedHashSet2 = linkedHashSet;
        if ((i & 32) != 0) {
            linkedHashSet2 = lm00Var.f;
        }
        return new lm00(str, zzsVar, mapObjectType, wp31Var2, list, linkedHashSet2, lm00Var.g, lm00Var.h);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }
}
