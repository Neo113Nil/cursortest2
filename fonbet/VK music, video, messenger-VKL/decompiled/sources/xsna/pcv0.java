package xsna;

import android.text.Editable;
import android.text.TextWatcher;
import com.vk.log.L;

/* compiled from: VkPhoneNumberFormattingTextWatcher.kt */
/* loaded from: classes2.dex */
public class pcv0 implements TextWatcher {
    public final io.michaelrocks.libphonenumber.android.a b;
    public final boolean c;
    public final boolean d;
    public boolean e;
    public int f;
    public boolean g = true;

    public pcv0(io.michaelrocks.libphonenumber.android.a aVar, boolean z, boolean z2) {
        this.b = aVar;
        this.c = z;
        this.d = z2;
    }

    public static String a(String str, io.michaelrocks.libphonenumber.android.a aVar) {
        String str2 = null;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt) || charAt == '+') {
                try {
                    str2 = aVar.i(charAt);
                } catch (Exception unused) {
                }
            }
        }
        aVar.f();
        return str2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable != null) {
            ocv0 ocv0Var = new ocv0(0, editable, this);
            if (this.e) {
                return;
            }
            this.e = true;
            try {
                ocv0Var.invoke();
            } catch (Exception e) {
                L.i(e);
            } finally {
                this.e = false;
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.e) {
            return;
        }
        this.f = Math.max(i3 - i2, 0) + i;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
