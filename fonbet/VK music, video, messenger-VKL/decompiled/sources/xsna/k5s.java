package xsna;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;
import xsna.o5s;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes11.dex */
public final class k5s implements Callable<o5s.a> {
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ j5s d;
    public final /* synthetic */ int e;

    public k5s(String str, Context context, j5s j5sVar, int i) {
        this.b = str;
        this.c = context;
        this.d = j5sVar;
        this.e = i;
    }

    @Override // java.util.concurrent.Callable
    public final o5s.a call() throws Exception {
        Object[] objArr = {this.d};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return o5s.b(this.c, Collections.unmodifiableList(arrayList), this.b, this.e);
    }
}
