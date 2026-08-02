package org.chromium.net.impl;

import org.chromium.net.CronetException;
import org.chromium.net.InlineExecutionProhibitedException;
import xsna.e91;
import xsna.f91;
import xsna.g91;
import xsna.h91;
import xsna.i91;
import xsna.j91;
import xsna.l91;
import xsna.m91;
import xsna.tu5;

/* loaded from: classes8.dex */
class CronetExceptionTranslationUtils {

    public interface CronetWork<T, E extends Exception> {
        T run() throws Exception;
    }

    private CronetExceptionTranslationUtils() {
    }

    public static <T, E extends Exception> T executeTranslatingCronetExceptions(CronetWork<T, E> cronetWork, Class<E> cls) throws CronetException, Exception {
        try {
            return cronetWork.run();
        } catch (Exception e) {
            if (isUncheckedAndroidCronetException(e)) {
                throw translateUncheckedAndroidCronetException(e);
            }
            if (isCheckedAndroidCronetException(e)) {
                throw translateCheckedAndroidCronetException(e);
            }
            if (cls.isInstance(e)) {
                throw e;
            }
            throw e;
        }
    }

    public static boolean isCheckedAndroidCronetException(Exception exc) {
        return l91.m(exc);
    }

    public static boolean isUncheckedAndroidCronetException(Exception exc) {
        return e91.m(exc);
    }

    public static CronetException translateCheckedAndroidCronetException(Exception exc) {
        if (!isCheckedAndroidCronetException(exc)) {
            throw new IllegalArgumentException("Not an Android Cronet exception", exc);
        }
        if (f91.k(exc)) {
            return new AndroidQuicExceptionWrapper(g91.f(exc));
        }
        if (h91.k(exc)) {
            return new AndroidNetworkExceptionWrapper(i91.d(exc));
        }
        if (j91.m(exc)) {
            return new AndroidCallbackExceptionWrapper(tu5.f(exc));
        }
        if (l91.m(exc)) {
            return new AndroidHttpExceptionWrapper(m91.i(exc));
        }
        throw new UnsupportedOperationException("Checked exception translation discrepancy", exc);
    }

    public static RuntimeException translateUncheckedAndroidCronetException(Exception exc) {
        if (!isUncheckedAndroidCronetException(exc)) {
            throw new IllegalArgumentException("Not an Android Cronet exception", exc);
        }
        if (!e91.m(exc)) {
            throw new UnsupportedOperationException("Unchecked exception translation discrepancy", exc);
        }
        InlineExecutionProhibitedException inlineExecutionProhibitedException = new InlineExecutionProhibitedException();
        inlineExecutionProhibitedException.initCause(exc);
        return inlineExecutionProhibitedException;
    }
}
