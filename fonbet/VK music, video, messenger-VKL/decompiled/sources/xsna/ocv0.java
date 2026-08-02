package xsna;

import android.text.Editable;
import android.util.Patterns;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ocv0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ocv0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006a  */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean z;
        switch (this.b) {
            case 0:
                Editable editable = (Editable) this.c;
                pcv0 pcv0Var = (pcv0) this.d;
                String obj = editable.toString();
                int i = pcv0Var.f;
                boolean z2 = pcv0Var.c;
                boolean z3 = i < obj.length();
                if (!z2 && z3) {
                    pcv0Var.g = false;
                }
                if (!z3 && pcv0Var.g) {
                    String obj2 = drm0.p0(obj).toString();
                    Character y0 = erm0.y0(obj2);
                    if (y0 != null) {
                        char charValue = y0.charValue();
                        if (Character.isDigit(charValue) || charValue == '+') {
                            z = true;
                            k9x k9xVar = !z2 ? new k9x(5, 20, 1) : new k9x(9, 20, 1);
                            if (z) {
                                int i2 = 0;
                                for (int i3 = 0; i3 < obj2.length(); i3++) {
                                    if (Character.isDigit(obj2.charAt(i3))) {
                                        i2++;
                                    }
                                }
                                if (k9xVar.b <= i2 && i2 <= k9xVar.c && Patterns.PHONE.matcher(obj2).matches()) {
                                    io.michaelrocks.libphonenumber.android.a aVar = pcv0Var.b;
                                    String obj3 = editable.toString();
                                    String a = pcv0.a((!pcv0Var.d || erm0.x0(obj3) == '+') ? obj3 : "+".concat(obj3), aVar);
                                    if (a == null) {
                                        a = pcv0.a(obj3, aVar);
                                    }
                                    if (a != null && !a.equals(obj3)) {
                                        editable.clear();
                                        editable.insert(0, a);
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                    if (!z2) {
                    }
                    if (z) {
                    }
                }
                break;
            default:
                izs izsVar = (izs) this.c;
                String str = ((rmx0) this.d).b;
                if (str == null) {
                    str = "";
                }
                izsVar.invoke(str);
                break;
        }
        return s3q0.a;
    }
}
