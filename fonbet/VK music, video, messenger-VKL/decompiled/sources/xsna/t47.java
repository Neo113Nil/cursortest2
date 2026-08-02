package xsna;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import com.vkontakte.android.R;

/* compiled from: BiometricFragment.java */
/* loaded from: classes11.dex */
public final class t47 implements fr70<p47> {
    public final /* synthetic */ q47 b;

    public t47(q47 q47Var) {
        this.b = q47Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a9, code lost:
    
        if (r10 == false) goto L53;
     */
    @Override // xsna.fr70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(p47 p47Var) {
        boolean z;
        p47 p47Var2 = p47Var;
        if (p47Var2 != null) {
            int i = p47Var2.a;
            CharSequence charSequence = p47Var2.b;
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                case 6:
                default:
                    i = 8;
                    break;
            }
            q47 q47Var = this.b;
            Context mo2getContext = q47Var.mo2getContext();
            int i2 = Build.VERSION.SDK_INT;
            int i3 = 0;
            if (i2 < 29 && ((i == 7 || i == 9) && mo2getContext != null)) {
                KeyguardManager a = why.a(mo2getContext);
                if ((a == null ? false : why.b(a)) && e75.a(q47Var.i.i())) {
                    q47Var.xn();
                    q47Var.i.j(null);
                }
            }
            if (q47Var.wn()) {
                if (charSequence == null) {
                    charSequence = p490.m(i, q47Var.mo2getContext());
                }
                if (i == 5) {
                    int i4 = q47Var.i.j;
                    if (i4 == 0 || i4 == 3) {
                        q47Var.zn(i, charSequence);
                    }
                    q47Var.dismiss();
                } else {
                    if (q47Var.i.u) {
                        q47Var.yn(i, charSequence);
                    } else {
                        q47Var.An(charSequence);
                        Handler handler = q47Var.h;
                        y47 y47Var = new y47(q47Var, i, charSequence);
                        Context mo2getContext2 = q47Var.mo2getContext();
                        if (mo2getContext2 != null) {
                            String str = Build.MODEL;
                            if (i2 == 28 && str != null) {
                                for (String str2 : mo2getContext2.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                                    if (str.startsWith(str2)) {
                                        z = true;
                                    }
                                }
                            }
                            z = false;
                        }
                        i3 = 2000;
                        handler.postDelayed(y47Var, i3);
                    }
                    q47Var.i.u = true;
                }
            } else {
                if (charSequence == null) {
                    charSequence = q47Var.getString(R.string.default_error_msg) + " " + i;
                }
                q47Var.yn(i, charSequence);
            }
            q47Var.i.j(null);
        }
    }
}
