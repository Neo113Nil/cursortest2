package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.m4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5004m4 {
    public final Object a;
    public final C5083p5 b;
    public final HashMap c;
    public final Ba d;
    public final Context e;
    public final C5211u4 f;

    public C5004m4(Context context, C5083p5 c5083p5) {
        this(context, c5083p5, new C5211u4());
    }

    public final InterfaceC5133r4 a(C4720b4 c4720b4, B4 b4) {
        InterfaceC5133r4 interfaceC5133r4;
        synchronized (this.a) {
            try {
                interfaceC5133r4 = (InterfaceC5133r4) this.c.get(c4720b4);
                if (interfaceC5133r4 == null) {
                    this.f.getClass();
                    interfaceC5133r4 = C5211u4.a(c4720b4).a(this.e, this.b, c4720b4, b4);
                    this.c.put(c4720b4, interfaceC5133r4);
                    this.d.a(new C4978l4(c4720b4.b, c4720b4.c, c4720b4.d), c4720b4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC5133r4;
    }

    public C5004m4(Context context, C5083p5 c5083p5, C5211u4 c5211u4) {
        this.a = new Object();
        this.c = new HashMap();
        this.d = new Ba();
        this.e = context.getApplicationContext();
        this.b = c5083p5;
        this.f = c5211u4;
    }

    public final void a(String str, Integer num, String str2) {
        synchronized (this.a) {
            try {
                Ba ba = this.d;
                Collection collection = (Collection) ba.a.remove(new C4978l4(str, num, str2));
                if (!vo.a(collection)) {
                    collection.size();
                    ArrayList arrayList = new ArrayList(collection.size());
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add((InterfaceC5133r4) this.c.remove((C4720b4) it.next()));
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC5133r4) it2.next()).a();
                    }
                }
            } finally {
            }
        }
    }
}
