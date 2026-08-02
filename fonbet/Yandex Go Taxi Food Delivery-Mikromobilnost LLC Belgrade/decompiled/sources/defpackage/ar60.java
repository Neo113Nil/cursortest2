package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public class ar60 implements Iterable {
    public final ArrayList a = new ArrayList();
    public int b;
    public boolean c;

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new bvb(this);
    }
}
