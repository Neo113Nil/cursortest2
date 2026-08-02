package defpackage;

import android.view.inputmethod.HandwritingGesture;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public abstract class hza1 {
    public static final void a(boolean z, spm spmVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1792258280);
        if ((i & 6) == 0) {
            i2 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(spmVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            gza1.a(z, spmVar.a(), btsVar, i2 & 14);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wm1(z, spmVar, i);
        }
    }

    public static final Object b(pdy pdyVar, Executor executor, Continuation continuation) {
        kol0 kol0Var = new kol0(dvw.b(continuation));
        pdyVar.K.c(new ii30(25, kol0Var), executor);
        Object a = kol0Var.a();
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }

    public static int c(HandwritingGesture handwritingGesture, odf0 odf0Var) {
        String fallbackText;
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        odf0Var.invoke(new fnc(fallbackText, 1));
        return 5;
    }

    public static void d(long j, kk2 kk2Var, boolean z, odf0 odf0Var) {
        if (z) {
            int i = asy0.c;
            int i2 = (int) (j >> 32);
            int i3 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            int codePointBefore = i2 > 0 ? Character.codePointBefore(kk2Var, i2) : 10;
            int codePointAt = i3 < kk2Var.b.length() ? Character.codePointAt(kk2Var, i3) : 10;
            if (lza1.j(codePointBefore) && (lza1.i(codePointAt) || lza1.h(codePointAt))) {
                do {
                    i2 -= Character.charCount(codePointBefore);
                    if (i2 == 0) {
                        break;
                    } else {
                        codePointBefore = Character.codePointBefore(kk2Var, i2);
                    }
                } while (lza1.j(codePointBefore));
                j = eja1.c(i2, i3);
            } else if (lza1.j(codePointAt) && (lza1.i(codePointBefore) || lza1.h(codePointBefore))) {
                do {
                    i3 += Character.charCount(codePointAt);
                    if (i3 == kk2Var.b.length()) {
                        break;
                    } else {
                        codePointAt = Character.codePointAt(kk2Var, i3);
                    }
                } while (lza1.j(codePointAt));
                j = eja1.c(i2, i3);
            }
        }
        int i4 = (int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j);
        odf0Var.invoke(new q6u(new zkn[]{new d4r0(i4, i4), new csh(asy0.d(j), 0)}));
    }

    public static String e(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String p;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                p = "null";
            } else {
                try {
                    p = obj.toString();
                } catch (Exception e) {
                    String p2 = g8e.p(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(p2), (Throwable) e);
                    p = unr0.p("<", p2, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = p;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(objArr[i]);
            i++;
            i3 = indexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(Extension.FIX_SPACE);
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static boolean f(String str) {
        return str == null || str.isEmpty();
    }
}
