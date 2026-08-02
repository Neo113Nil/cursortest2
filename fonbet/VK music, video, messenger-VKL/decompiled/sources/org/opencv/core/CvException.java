package org.opencv.core;

import com.ironsource.X3;
import xsna.i5s;

/* loaded from: classes8.dex */
public class CvException extends RuntimeException {
    private static final long serialVersionUID = 1;

    @Override // java.lang.Throwable
    public final String toString() {
        return i5s.a(new StringBuilder("CvException ["), super.toString(), X3.j.e);
    }
}
