package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class occ extends nl11 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public occ(h7x h7xVar, fp60 fp60Var) {
        this.b = h7xVar;
        this.c = fp60Var;
    }

    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                if (wdxVar.R() == JsonToken.NULL) {
                    wdxVar.B0();
                    return null;
                }
                Collection collection = (Collection) ((fp60) obj).i();
                wdxVar.a();
                while (wdxVar.hasNext()) {
                    collection.add(((h7x) obj2).b.read(wdxVar));
                }
                wdxVar.k();
                return collection;
            default:
                Class cls = (Class) obj2;
                Object read = ((jm11) obj).c.read(wdxVar);
                if (read == null || cls.isInstance(read)) {
                    return read;
                }
                throw new JsonSyntaxException("Expected a " + cls.getName() + " but was " + read.getClass().getName() + "; at path " + wdxVar.w());
        }
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        switch (this.a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    afxVar.c();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((h7x) this.b).write(afxVar, it.next());
                    }
                    afxVar.k();
                    break;
                } else {
                    afxVar.w();
                    break;
                }
            default:
                ((jm11) this.c).c.write(afxVar, obj);
                break;
        }
    }

    public occ(jm11 jm11Var, Class cls) {
        this.c = jm11Var;
        this.b = cls;
    }
}
