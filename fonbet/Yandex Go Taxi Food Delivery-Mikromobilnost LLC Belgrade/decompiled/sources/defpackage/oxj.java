package defpackage;

import coil3.disk.a;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class oxj {
    public final String a;
    public final long[] b = new long[2];
    public final ArrayList c = new ArrayList(2);
    public final ArrayList d = new ArrayList(2);
    public boolean e;
    public boolean f;
    public lxj g;
    public int h;
    public final /* synthetic */ a i;

    public oxj(a aVar, String str) {
        this.i = aVar;
        this.a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.i.a.e(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.i.a.e(sb.toString()));
            sb.setLength(length);
        }
    }

    public final txj a() {
        if (!this.e || this.g != null || this.f) {
            return null;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            a aVar = this.i;
            if (i >= size) {
                this.h++;
                return new txj(aVar, this);
            }
            if (!aVar.J.n((oq90) arrayList.get(i))) {
                try {
                    aVar.w(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }
}
