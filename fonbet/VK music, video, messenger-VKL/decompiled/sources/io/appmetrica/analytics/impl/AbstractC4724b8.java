package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.b8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC4724b8 {
    public final Context a;
    public final ProtobufStateStorage b;
    public final AbstractC4776d8 c;
    public final InterfaceC4998lo d;
    public final Sm e;
    public final InterfaceC4812ej f;
    public final InterfaceC4761cj g;
    public final L6 h;
    public InterfaceC4750c8 i;

    public AbstractC4724b8(Context context, ProtobufStateStorage protobufStateStorage, AbstractC4776d8 abstractC4776d8, InterfaceC4998lo interfaceC4998lo, Sm sm, InterfaceC4812ej interfaceC4812ej, InterfaceC4761cj interfaceC4761cj, L6 l6, InterfaceC4750c8 interfaceC4750c8) {
        this.a = context;
        this.b = protobufStateStorage;
        this.c = abstractC4776d8;
        this.d = interfaceC4998lo;
        this.e = sm;
        this.f = interfaceC4812ej;
        this.g = interfaceC4761cj;
        this.h = l6;
        this.i = interfaceC4750c8;
    }

    public final synchronized InterfaceC4750c8 a() {
        return this.i;
    }

    public final synchronized boolean b(InterfaceC4827f8 interfaceC4827f8) {
        try {
            boolean z = false;
            if (interfaceC4827f8.a() == EnumC4801e8.b) {
                return false;
            }
            if (interfaceC4827f8.equals(this.i.b())) {
                return false;
            }
            List list = (List) this.d.invoke(this.i.a(), interfaceC4827f8);
            boolean z2 = list != null;
            if (list == null) {
                list = this.i.a();
            }
            if (this.c.a(interfaceC4827f8, this.i.b())) {
                z = true;
            } else {
                interfaceC4827f8 = (InterfaceC4827f8) this.i.b();
            }
            if (z || z2) {
                InterfaceC4750c8 interfaceC4750c8 = this.i;
                InterfaceC4750c8 interfaceC4750c82 = (InterfaceC4750c8) this.e.invoke(interfaceC4827f8, list);
                this.i = interfaceC4750c82;
                this.b.save(interfaceC4750c82);
                AbstractC5097pj.a("Update distribution data: %s -> %s", interfaceC4750c8, this.i);
            }
            return z;
        } finally {
        }
    }

    public final synchronized InterfaceC4827f8 c() {
        try {
            if (!this.g.a()) {
                InterfaceC4827f8 interfaceC4827f8 = (InterfaceC4827f8) this.f.invoke();
                this.g.b();
                if (interfaceC4827f8 != null) {
                    b(interfaceC4827f8);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (InterfaceC4827f8) this.i.b();
    }

    public final InterfaceC4827f8 a(InterfaceC4827f8 interfaceC4827f8) {
        InterfaceC4827f8 c;
        this.h.a(this.a);
        synchronized (this) {
            b(interfaceC4827f8);
            c = c();
        }
        return c;
    }

    public final InterfaceC4827f8 b() {
        this.h.a(this.a);
        return c();
    }
}
