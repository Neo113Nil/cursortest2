package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public final class e2j0 extends jd5 implements zl41, di41 {
    public List b = EmptyList.a;

    @Override // defpackage.di41
    public final void k(String str) {
        mn41 t = t();
        if (t != null) {
            t.b("\n            document.documentElement.style.overflow = 'auto';\n            document.body.style.overflow = 'auto';\n            document.body.style.touchAction = 'pan-y';\n        ");
        }
        mn41 t2 = t();
        if (t2 != null) {
            t2.b("\n            document.addEventListener('DOMContentLoaded', function() {\n                const style = document.createElement('style');\n                style.textContent = `\n                    html, body {\n                        background: transparent !important;\n                    }\n                    \n                    .g-root,\n                    .local_wrapper {\n                        background-color: transparent !important;\n                    }\n                    \n                    #root {\n                        background: transparent !important;\n                    }\n                `;\n                document.head.appendChild(style);\n            });\n        ");
        }
    }

    @Override // defpackage.zl41
    public final int m(Context context) {
        return 0;
    }

    @Override // defpackage.di41
    public final void s(String str) {
        mn41 t = t();
        if (t != null) {
            t.b(vuu0.c("\n            window.addEventListener('message', function(event) {\n                if (event.data === 'ping') {\n                    " + a.X(this.b, "\n", null, null, new nqi0(4), 30) + "\n                }\n            });\n        "));
        }
    }
}
