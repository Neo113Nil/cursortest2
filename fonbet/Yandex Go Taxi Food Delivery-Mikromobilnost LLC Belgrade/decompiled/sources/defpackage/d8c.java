package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ld8c;", "", "Companion", "b8c", "c8c", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d8c {
    public static final c8c Companion = new c8c();
    public static final i3y[] j = {a.b(LazyThreadSafetyMode.PUBLICATION, new z2c(4)), null, null, null, null, null, null, null, null};
    public final List a;
    public final String b;
    public final zzs c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final qf5 i;

    public d8c(int i, List list, String str, zzs zzsVar, String str2, String str3, String str4, String str5, String str6, qf5 qf5Var) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = zzs.f;
        } else {
            this.c = zzsVar;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str6;
        }
        if ((i & 256) != 0) {
            this.i = qf5Var;
        } else {
            qf5.Companion.getClass();
            this.i = qf5.d;
        }
    }

    public d8c() {
        zzs zzsVar = zzs.f;
        qf5.Companion.getClass();
        this.a = EmptyList.a;
        this.b = "";
        this.c = zzsVar;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = qf5.d;
    }
}
