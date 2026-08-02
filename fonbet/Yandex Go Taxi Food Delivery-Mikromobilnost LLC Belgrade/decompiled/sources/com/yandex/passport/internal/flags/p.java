package com.yandex.passport.internal.flags;

import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public abstract class p {
    public static final m a;
    public static final m b;
    public static final m c;
    public static final m d;
    public static final m e;

    static {
        EmptyList emptyList = EmptyList.a;
        a = new m("backend_url_backup", emptyList);
        b = new m("web_am_url_backup", emptyList);
        c = new m("frontend_url_backup", emptyList);
        d = new m("social_url_backup", emptyList);
        e = new m("applink_url_backup", emptyList);
    }
}
