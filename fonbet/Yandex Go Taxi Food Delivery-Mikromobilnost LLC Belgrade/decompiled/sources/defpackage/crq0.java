package defpackage;

import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes12.dex */
public abstract class crq0 {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public static final boolean a(String str) {
        return a.contains(str);
    }

    public static final void b(String str) {
        a.add(str);
    }
}
