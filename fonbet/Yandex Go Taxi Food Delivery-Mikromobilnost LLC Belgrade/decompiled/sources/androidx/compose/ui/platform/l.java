package androidx.compose.ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper;
import defpackage.aa41;
import defpackage.fwc0;
import defpackage.jl40;
import defpackage.pay;
import defpackage.sls;
import defpackage.tls;
import defpackage.wz40;
import defpackage.zy11;

/* loaded from: classes10.dex */
public final class l {
    public final fwc0 a;
    public final sls b;
    public final Object c = new Object();
    public final wz40 d = new wz40(new aa41[16]);
    public boolean e;

    public l(fwc0 fwc0Var, sls slsVar) {
        this.a = fwc0Var;
        this.b = slsVar;
    }

    public final InputConnection a(EditorInfo editorInfo) {
        synchronized (this.c) {
            if (this.e) {
                return null;
            }
            NullableInputConnectionWrapper a = androidx.compose.ui.text.input.c.a(((pay) this.a).a(editorInfo), new tls() { // from class: androidx.compose.ui.platform.InputMethodSession$createInputConnection$1$1
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    NullableInputConnectionWrapper nullableInputConnectionWrapper = (NullableInputConnectionWrapper) obj;
                    nullableInputConnectionWrapper.disposeDelegate();
                    wz40 wz40Var = l.this.d;
                    Object[] objArr = wz40Var.a;
                    int i = wz40Var.c;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= i) {
                            i2 = -1;
                            break;
                        }
                        if (jl40.l((aa41) objArr[i2], nullableInputConnectionWrapper)) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 >= 0) {
                        l.this.d.k(i2);
                    }
                    l lVar = l.this;
                    if (lVar.d.c == 0) {
                        ((AndroidPlatformTextInputSession$startInputMethod$2.AnonymousClass1) lVar.b).invoke();
                    }
                    return zy11.a;
                }
            });
            this.d.b(new aa41(a));
            return a;
        }
    }

    public final boolean b() {
        return !this.e;
    }
}
