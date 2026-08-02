package defpackage;

import com.google.gson.stream.JsonToken;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class n63 extends nl11 {
    public static final m63 c = new m63();
    public final Class a;
    public final h7x b;

    public n63(u3u u3uVar, nl11 nl11Var, Class cls) {
        this.b = new h7x(u3uVar, nl11Var, cls);
        this.a = cls;
    }

    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        if (wdxVar.R() == JsonToken.NULL) {
            wdxVar.B0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        wdxVar.a();
        while (wdxVar.hasNext()) {
            arrayList.add(this.b.b.read(wdxVar));
        }
        wdxVar.k();
        int size = arrayList.size();
        Class cls = this.a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object newInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        if (obj == null) {
            afxVar.w();
            return;
        }
        afxVar.c();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.write(afxVar, Array.get(obj, i));
        }
        afxVar.k();
    }
}
