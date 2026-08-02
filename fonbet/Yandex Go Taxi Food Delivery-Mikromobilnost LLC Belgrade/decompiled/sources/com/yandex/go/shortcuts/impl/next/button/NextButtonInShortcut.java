package com.yandex.go.shortcuts.impl.next.button;

import com.yandex.go.dto.response.m1;
import com.yandex.go.dto.response.q1;
import defpackage.c6z;
import defpackage.d6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.j660;
import defpackage.n96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/shortcuts/impl/next/button/NextButtonInShortcut;", "Ln96;", "Lc6z;", "Companion", "com/yandex/go/shortcuts/impl/next/button/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NextButtonInShortcut extends n96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] g = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new j660(12)), null, null, null};
    public static final NextButtonInShortcut h = new NextButtonInShortcut(0);
    public final boolean b;
    public final Map c;
    public final q1 d;
    public final String e;
    public final String f;

    public /* synthetic */ NextButtonInShortcut(int i, boolean z, Map map, q1 q1Var, String str, String str2) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = m1.INSTANCE;
        } else {
            this.d = q1Var;
        }
        if ((i & 8) == 0) {
            this.e = "";
        } else {
            this.e = str;
        }
        if ((i & 16) == 0) {
            this.f = "";
        } else {
            this.f = str2;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.n96
    public final boolean b() {
        return getB() && this.e.length() > 0 && d6z.Y(this, this.f).length() > 0;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public NextButtonInShortcut() {
        this(0);
    }

    public NextButtonInShortcut(int i) {
        Map f = b.f();
        m1 m1Var = m1.INSTANCE;
        this.b = false;
        this.c = f;
        this.d = m1Var;
        this.e = "";
        this.f = "";
    }
}
