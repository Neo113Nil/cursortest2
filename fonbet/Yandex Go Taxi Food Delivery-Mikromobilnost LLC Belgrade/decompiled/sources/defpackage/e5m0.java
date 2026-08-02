package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.c;
import com.ybsdk.widgets.common.d;

/* loaded from: classes3.dex */
public final class e5m0 implements ev31 {
    public final Context a;
    public final mdm0 b;

    public e5m0(Context context, mdm0 mdm0Var) {
        this.a = context;
        this.b = mdm0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e6, code lost:
    
        if (((defpackage.q4m0) r1).c != null) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0102  */
    @Override // defpackage.ev31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        Text.Resource h;
        FailDataException failDataException;
        String str;
        kao a;
        Object obj2;
        rbv a2;
        t4m0 t4m0Var = (t4m0) obj;
        q7m0 q7m0Var = t4m0Var.b;
        s4m0 s4m0Var = t4m0Var.a;
        r3 = null;
        r3 = null;
        bks bksVar = null;
        r3 = null;
        Text.Resource resource = null;
        if (s4m0Var == null) {
            return new b5m0(new d(com.ybsdk.core.utils.text.d.g(q7m0Var != null ? q7m0Var.a : null), com.ybsdk.core.utils.text.d.g(q7m0Var != null ? q7m0Var.b : null), 4));
        }
        if (s4m0Var instanceof r4m0) {
            gya1 gya1Var = (gya1) s4m0Var;
            String f = dya1.f(gya1Var);
            Text i = f != null ? g8e.i(Text.Companion, f) : unr0.h(Text.Companion, dzh0.ybsdk_savings_savings_almost_ready_title);
            String e = dya1.e(gya1Var);
            Text i2 = e != null ? g8e.i(Text.Companion, e) : unr0.h(Text.Companion, dzh0.ybsdk_savings_savings_almost_ready_subtitle);
            fxy0 fxy0Var = ((r4m0) s4m0Var).c;
            if (fxy0Var != null) {
                Object c = fob1.c((String) fxy0Var.b, (String) fxy0Var.a, new i1m0(7));
                obj2 = c;
            }
            ndm0 ndm0Var = (ndm0) this.b;
            ndm0Var.getClass();
            obj2 = fob1.b(ndm0Var.a.l().getOpeningTimeout());
            Text.Resource h2 = unr0.h(Text.Companion, dzh0.ybsdk_savings_savings_almost_ready_button);
            jbv jbvVar = obj2 instanceof jbv ? (jbv) obj2 : null;
            if (jbvVar != null && (a2 = jbvVar.a.a(this.a)) != null) {
                pbv pbvVar = a2 instanceof pbv ? (pbv) a2 : null;
                if (pbvVar != null) {
                    pbv a3 = pbv.a(pbvVar, rev.p);
                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                    bksVar = new bks(a3, null, 2);
                }
            }
            return new b5m0(new c(i, i2, bksVar, h2));
        }
        Throwable b = s4m0Var.b();
        String a4 = s4m0Var.a();
        Text i3 = a4 != null ? g8e.i(Text.Companion, a4) : Text.Empty.INSTANCE;
        String c2 = s4m0Var.c();
        Text i4 = c2 != null ? g8e.i(Text.Companion, c2) : Text.Empty.INSTANCE;
        if (!(s4m0Var instanceof q4m0)) {
            if (s4m0Var instanceof o4m0) {
                h = unr0.h(Text.Companion, dzh0.ybsdk_common_error_retry);
                Throwable b2 = s4m0Var.b();
                failDataException = !(b2 instanceof FailDataException) ? (FailDataException) b2 : null;
                if (failDataException != null || (str = failDataException.getSupportUrl()) == null || !(s4m0Var instanceof o4m0)) {
                    str = null;
                }
                if (str != null && !evu0.J(str)) {
                    resource = unr0.h(Text.Companion, dzh0.ybsdk_common_send_message_to_support);
                }
                Text.Resource resource2 = resource;
                if (jl40.l(i3, Text.Empty.INSTANCE)) {
                    if (h == null) {
                        h = unr0.h(Text.Companion, dzh0.ybsdk_deposit_button_understand);
                    }
                    a = r501.a(b, i3, i4, h, resource2, null, null, null, null, null, null, null, null, 65474);
                } else {
                    if (h == null) {
                        h = unr0.h(Text.Companion, dzh0.ybsdk_deposit_button_understand);
                    }
                    a = r501.a(b, null, i4, h, resource2, null, null, null, null, null, null, null, null, 65478);
                }
                return new c5m0(a);
            }
            h = null;
            Throwable b22 = s4m0Var.b();
            if (!(b22 instanceof FailDataException)) {
            }
            if (failDataException != null) {
            }
            str = null;
            if (str != null) {
                resource = unr0.h(Text.Companion, dzh0.ybsdk_common_send_message_to_support);
            }
            Text.Resource resource22 = resource;
            if (jl40.l(i3, Text.Empty.INSTANCE)) {
            }
            return new c5m0(a);
        }
        h = unr0.h(Text.Companion, dzh0.ybsdk_common_send_message_to_support);
    }
}
