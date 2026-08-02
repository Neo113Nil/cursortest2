package xsna;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: ItemOverlayFocusBehavior.kt */
/* loaded from: classes17.dex */
public final class yux {
    public static final /* synthetic */ qcy<Object>[] e = {new MutablePropertyReference1Impl(yux.class, "overlayVisibleUniqueKeys", "getOverlayVisibleUniqueKeys()Ljava/util/Set;", 0), p5j.a(0, yux.class, "focusedItemUniqueKey", "getFocusedItemUniqueKey()Ljava/lang/String;", fpf0.a)};
    public boolean c;
    public final a a = new a(EmptySet.b);
    public final a b = new a("");
    public final LinkedHashSet d = new LinkedHashSet();

    /* compiled from: ItemOverlayFocusBehavior.kt */
    public final class a<T> extends wq70<T> {
        public a(T t) {
            super(t);
        }

        @Override // xsna.wq70
        public final void afterChange(qcy<?> qcyVar, T t, T t2) {
            if (epx.f(t, t2)) {
                return;
            }
            yux yuxVar = yux.this;
            boolean z = yuxVar.c;
            boolean contains = yuxVar.c().contains((String) yuxVar.b.getValue(yuxVar, yux.e[1]));
            yuxVar.c = contains;
            if (z != contains) {
                Iterator<T> it = yuxVar.d.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a(contains);
                }
            }
        }
    }

    /* compiled from: ItemOverlayFocusBehavior.kt */
    public interface b {
        void a(boolean z);
    }

    public final void a(b bVar) {
        this.d.add(bVar);
        bVar.a(this.c);
    }

    public final void b(String str) {
        if (c().contains(str)) {
            return;
        }
        Set R0 = j5g.R0(c());
        R0.add(str);
        this.a.setValue(this, e[0], R0);
    }

    public final Set<String> c() {
        return (Set) this.a.getValue(this, e[0]);
    }

    public final void d(String str) {
        if (c().contains(str)) {
            Set R0 = j5g.R0(c());
            R0.remove(str);
            this.a.setValue(this, e[0], R0);
        }
    }
}
