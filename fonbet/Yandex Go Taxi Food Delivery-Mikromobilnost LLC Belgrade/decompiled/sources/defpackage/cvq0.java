package defpackage;

import java.util.Set;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.eatskit.dto.ServiceHeaderMode;
import ru.yandex.taxi.eatskit.dto.ServicePromo;

/* loaded from: classes5.dex */
public final class cvq0 {
    public final String a;
    public final String b;
    public final CharSequence c;
    public final qgn0 d;
    public final ServicePromo e;
    public final String f;
    public final String g;
    public final ServiceHeaderMode h;
    public final String i;
    public final boolean j;
    public final String k;
    public final String l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final Set p;

    public cvq0(String str, String str2, CharSequence charSequence, qgn0 qgn0Var, ServicePromo servicePromo, String str3, ServiceHeaderMode serviceHeaderMode, String str4, boolean z, String str5, String str6, boolean z2, boolean z3, boolean z4, Set set, int i) {
        String str7 = (i & 64) != 0 ? null : str3;
        String str8 = (i & 256) != 0 ? "" : str4;
        boolean z5 = (i & 512) != 0 ? false : z;
        String str9 = (i & 1024) != 0 ? "" : str5;
        String str10 = (i & 2048) == 0 ? str6 : "";
        boolean z6 = (i & 4096) != 0 ? true : z2;
        boolean z7 = (32768 & i) != 0 ? false : z3;
        boolean z8 = (65536 & i) == 0 ? z4 : false;
        Set set2 = (i & 131072) != 0 ? EmptySet.a : set;
        this.a = str;
        this.b = str2;
        this.c = charSequence;
        this.d = qgn0Var;
        this.e = servicePromo;
        this.f = null;
        this.g = str7;
        this.h = serviceHeaderMode;
        this.i = str8;
        this.j = z5;
        this.k = str9;
        this.l = str10;
        this.m = z6;
        this.n = z7;
        this.o = z8;
        this.p = set2;
    }
}
