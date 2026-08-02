package com.google.android.play.core.splitinstall.internal;

import com.google.android.play.core.splitinstall.SplitInstallException;
import defpackage.g8e;
import defpackage.qv10;
import defpackage.unr0;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final class zzbx extends RuntimeException {
    public static Object c(Callable callable) {
        try {
            return callable.call();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new zzbx("TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly.", e2);
        }
    }

    @Override // java.lang.Throwable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized Exception getCause() {
        Throwable cause;
        cause = super.getCause();
        cause.getClass();
        return (Exception) cause;
    }

    public final Exception b() {
        int indexOf;
        String p;
        Class[] clsArr = {SplitInstallException.class};
        int i = 0;
        for (int i2 = 0; i2 <= 0; i2++) {
            Class cls = clsArr[i2];
            if (RuntimeException.class.isAssignableFrom(cls)) {
                Object[] objArr = new Object[2];
                objArr[0] = "getCause";
                objArr[1] = cls;
                for (int i3 = 0; i3 < 2; i3++) {
                    Object obj = objArr[i3];
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
                    objArr[i3] = p;
                }
                StringBuilder sb = new StringBuilder(HProv.PP_INFO);
                int i4 = 0;
                while (i < 2 && (indexOf = "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s".indexOf("%s", i4)) != -1) {
                    sb.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i4, indexOf);
                    sb.append(objArr[i]);
                    i4 = indexOf + 2;
                    i++;
                }
                sb.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i4, 86);
                if (i < 2) {
                    sb.append(" [");
                    sb.append(objArr[i]);
                    for (int i5 = i + 1; i5 < 2; i5++) {
                        sb.append(Extension.FIX_SPACE);
                        sb.append(objArr[i5]);
                    }
                    sb.append(']');
                }
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (SplitInstallException.class.isInstance(getCause())) {
            return (Exception) SplitInstallException.class.cast(getCause());
        }
        Exception cause = getCause();
        ClassCastException classCastException = new ClassCastException(qv10.m(SplitInstallException.class, "getCause(", ") doesn't match underlying exception"));
        classCastException.initCause(cause);
        throw classCastException;
    }
}
