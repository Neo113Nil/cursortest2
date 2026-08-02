package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import xsna.a520;
import xsna.exy0;
import xsna.wty0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class fvy0 implements a520.a {
    public final wty0 a;
    public final i620 b;
    public a520 c;
    public exy0.a d;
    public WeakReference e;

    public fvy0(wty0 wty0Var, i620 i620Var) {
        this.a = wty0Var;
        this.b = i620Var;
    }

    @Override // xsna.a520.a
    public final void a(b520 b520Var) {
        wty0.a aVar;
        exy0.a aVar2;
        if (b520Var.d == 1) {
            a520 a520Var = this.c;
            if (a520Var == null) {
                return;
            }
            a520Var.dismiss();
            this.c = null;
            return;
        }
        WeakReference weakReference = this.e;
        if (weakReference == null) {
            gu8.c(null, "AdChoicesOptionsController: there is no context, can't process action click");
            return;
        }
        Context context = (Context) weakReference.get();
        if (context == null) {
            gu8.c(null, "AdChoicesOptionsController: there is no context, can't process action click");
            return;
        }
        wty0 wty0Var = this.a;
        List list = wty0Var.d;
        if (list == null) {
            list = wty0.a(wty0Var.c);
            wty0Var.d = list;
        }
        if (list.isEmpty()) {
            gu8.c(null, "AdChoicesOptionsController: there are no menuActions, can't process action click");
            return;
        }
        Iterator it = wty0Var.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            } else {
                aVar = (wty0.a) it.next();
                if (aVar.e == b520Var) {
                    break;
                }
            }
        }
        if (aVar == null) {
            gu8.c(null, "AdChoicesOptionsController: can't obtain option by menu action.");
            return;
        }
        String str = aVar.a;
        if (!TextUtils.isEmpty(str)) {
            h8z0.b(str);
        }
        if (aVar.e.b.equals("copy")) {
            String str2 = aVar.c;
            if (str2 != null) {
                ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copied id", str2));
            }
            a520 a520Var2 = this.c;
            if (a520Var2 == null) {
                return;
            }
            a520Var2.dismiss();
            this.c = null;
            return;
        }
        String str3 = aVar.b;
        if (!TextUtils.isEmpty(str3)) {
            de.L(str3, null, null, null, context);
        }
        if (aVar.d && (aVar2 = this.d) != null) {
            aVar2.b();
        }
        a520 a520Var3 = this.c;
        if (a520Var3 == null) {
            return;
        }
        a520Var3.dismiss();
        this.c = null;
    }

    public final void b(Context context) {
        wty0 wty0Var = this.a;
        List list = wty0Var.d;
        if (list == null) {
            list = wty0.a(wty0Var.c);
            wty0Var.d = list;
        }
        if (list.isEmpty()) {
            return;
        }
        a520 b = this.b.b();
        this.c = b;
        this.e = new WeakReference(context);
        String str = wty0Var.e;
        if (str != null) {
            try {
                b.d(str);
            } catch (Throwable th) {
                if (!(th instanceof AbstractMethodError) || th.getStackTrace().length != new Exception().getStackTrace().length) {
                    gu8.e(null, "Unexpected exception: " + th.getMessage());
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b.b((b520) it.next());
        }
        b.a(this);
        b.c(context);
    }

    public final boolean c() {
        return this.c != null;
    }
}
