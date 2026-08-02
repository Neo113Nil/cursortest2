package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.lang.ref.WeakReference;

/* renamed from: io.appmetrica.analytics.impl.lj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4993lj implements InterfaceC4973l {
    public C4834ff a;
    public ScreenInfo b;
    public boolean c;
    public boolean d;
    public final C4967kj e = new C4967kj();
    public WeakReference f = new WeakReference(null);

    public final synchronized void a(Activity activity) {
        this.f = new WeakReference(activity);
        if (!this.d) {
            this.b = a((Context) activity).p();
            this.c = a((Context) activity).t();
            this.d = true;
        }
        if (this.b == null) {
            c(activity);
        }
    }

    public final synchronized ScreenInfo b(Context context) {
        try {
            if (!this.d) {
                this.b = a(context).p();
                this.c = a(context).t();
                this.d = true;
            }
            c((Context) this.f.get());
            if (this.b == null) {
                if (!AndroidUtils.isApiAchieved(30)) {
                    c(context);
                } else if (!this.c) {
                    c(context);
                    this.c = true;
                    a(context).v();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    public final void c(Context context) {
        if (context != null) {
            this.e.getClass();
            ScreenInfo a = C4967kj.a(context);
            if (a == null || a.equals(this.b)) {
                return;
            }
            this.b = a;
            a(context).a(this.b);
        }
    }

    public final C4834ff a(Context context) {
        if (this.a == null) {
            this.a = new C4834ff(C5030n4.l().c(context).a(context));
        }
        return this.a;
    }

    public final void a(C4834ff c4834ff) {
        this.a = c4834ff;
    }
}
