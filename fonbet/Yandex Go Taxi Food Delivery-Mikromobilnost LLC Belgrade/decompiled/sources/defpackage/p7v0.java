package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.persuggest.api.suggest.Action;

@gsq0
/* loaded from: classes9.dex */
public final class p7v0 {
    public static final i7v0 Companion = new i7v0();
    public static final i3y[] l = {a.b(LazyThreadSafetyMode.PUBLICATION, new w0v0(13)), null, null, null, null, null, null, null, null, null, null};
    public final Action a;
    public final v03 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final o7v0 h;
    public final l7v0 i;
    public final Integer j;
    public final String k;

    public /* synthetic */ p7v0(int i, Action action, v03 v03Var, String str, String str2, String str3, String str4, String str5, o7v0 o7v0Var, l7v0 l7v0Var, Integer num, String str6) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, h7v0.a.getDescriptor());
            throw null;
        }
        this.a = action;
        this.b = v03Var;
        this.c = str;
        this.d = str2;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = o7v0Var;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = l7v0Var;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str6;
        }
    }

    public p7v0(Action action, v03 v03Var, String str, String str2, String str3, String str4, String str5, o7v0 o7v0Var, l7v0 l7v0Var, Integer num, String str6) {
        this.a = action;
        this.b = v03Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = o7v0Var;
        this.i = l7v0Var;
        this.j = num;
        this.k = str6;
    }
}
