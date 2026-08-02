package defpackage;

import android.view.View;
import com.yandex.messaging.internal.entities.ChatFlags;
import defpackage.hbp0;

/* loaded from: classes6.dex */
public abstract class ci91 {
    public static final int a(long j, long j2) {
        boolean e = e(j);
        if (e != e(j2)) {
            return e ? -1 : 1;
        }
        return (Math.min(b(j), b(j2)) >= 0.0f && d(j) != d(j2)) ? d(j) ? -1 : 1 : (int) Math.signum(b(j) - b(j2));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final tse c(View view) {
        Object tag = view.getTag(k7h0.view_scope_scope_delegate_tag_key);
        hbp0 hbp0Var = tag instanceof hbp0 ? (hbp0) tag : null;
        if (hbp0Var != null) {
            return hbp0Var.c();
        }
        final hbp0 hbp0Var2 = new hbp0(new czo0(14), "ViewScope", null);
        if (view.isAttachedToWindow()) {
            hbp0Var2.a();
        }
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.scooters.utils.ViewExtensionsKt$special$$inlined$addLifecycleListener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                hbp0.this.a();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                hbp0Var2.b();
            }
        });
        view.setTag(k7h0.view_scope_scope_delegate_tag_key, hbp0Var2);
        return hbp0Var2.c();
    }

    public static final boolean d(long j) {
        return (j & 2) != 0;
    }

    public static final boolean e(long j) {
        return (j & 1) != 0;
    }

    public static final f530 f(f530 f530Var, tls tlsVar) {
        return f530Var.k(new qtr(tlsVar));
    }

    public static final o1b0 g(p2b p2bVar) {
        long j = p2bVar.a;
        String str = p2bVar.b;
        String str2 = p2bVar.c;
        long j2 = p2bVar.d;
        boolean a = ChatFlags.a(j2, 1L);
        boolean a2 = ChatFlags.a(j2, 8L);
        boolean a3 = ChatFlags.a(j2, 64L);
        return new o1b0(j, str, str2, a, a2, ChatFlags.a(j2, 4L), ChatFlags.a(j2, 128L), p2bVar.e, p2bVar.g, p2bVar.h, a3, p2bVar.f, ChatFlags.a(j2, 16L));
    }
}
