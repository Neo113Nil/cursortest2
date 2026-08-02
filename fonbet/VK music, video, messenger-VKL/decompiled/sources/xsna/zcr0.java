package xsna;

import java.util.LinkedHashMap;

/* compiled from: VKInAppUpdateRepository.kt */
/* loaded from: classes6.dex */
public final class zcr0 {
    public final String a;
    public final ro b;
    public final bpn0 c;

    /* compiled from: VKInAppUpdateRepository.kt */
    public static final class a extends IllegalArgumentException {
    }

    public zcr0(String str, ro roVar, r63 r63Var) {
        this.a = str;
        this.b = roVar;
        this.c = new bpn0(r63Var);
    }

    public static String a(String str, LinkedHashMap linkedHashMap) {
        String str2 = (String) linkedHashMap.get(str);
        if (str2 != null) {
            return str2;
        }
        throw new a(str.concat(" is null"));
    }
}
