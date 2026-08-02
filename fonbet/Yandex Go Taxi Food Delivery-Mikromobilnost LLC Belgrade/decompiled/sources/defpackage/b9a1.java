package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.m;
import defpackage.p651;
import defpackage.tls;
import defpackage.v2w;
import defpackage.zy11;
import yads.eq0;

/* loaded from: classes11.dex */
public abstract class b9a1 {
    public static au2 a;

    public static final boolean a(Context context, eq0 eq0Var) {
        return s881.a(context, "YadPreferenceFile").a(eq0Var.b, false);
    }

    public static final f530 b(f530 f530Var, final p651 p651Var) {
        return f530Var.k(new ty11(p651Var, m.b ? new tls() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$consumeWindowInsets$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                v2w v2wVar = (v2w) obj;
                v2wVar.getClass();
                v2wVar.a.b("insets", p651.this);
                return zy11.a;
            }
        } : m.a()));
    }

    public static final f530 c(f530 f530Var, final tls tlsVar) {
        return f530Var.k(new a9e(tlsVar, m.b ? new tls() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                v2w v2wVar = (v2w) obj;
                v2wVar.getClass();
                v2wVar.a.b("block", tls.this);
                return zy11.a;
            }
        } : m.a()));
    }

    public static f530 d(f530 f530Var, float f) {
        return fnq0.b(f530Var, true, new qjf0(f, new r5c(0.0f, 1.0f), 0));
    }

    public static final f530 e(f530 f530Var, final p651 p651Var) {
        return f530Var.k(new g2w(p651Var, m.b ? new tls() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$windowInsetsPadding$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                v2w v2wVar = (v2w) obj;
                v2wVar.getClass();
                v2wVar.a.b("insets", p651.this);
                return zy11.a;
            }
        } : m.a()));
    }
}
