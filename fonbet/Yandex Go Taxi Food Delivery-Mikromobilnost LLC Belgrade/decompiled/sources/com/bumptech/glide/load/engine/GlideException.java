package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.DataSource;
import defpackage.khx;
import defpackage.ny61;
import defpackage.vht;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class GlideException extends Exception {
    public static final StackTraceElement[] a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private DataSource dataSource;
    private String detailMessage;
    private Exception exception;
    private khx key;

    public GlideException(String str, List list) {
        this.detailMessage = str;
        setStackTrace(a);
        this.causes = list;
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (!(th instanceof GlideException)) {
            arrayList.add(th);
            return;
        }
        Iterator<Throwable> it = ((GlideException) th).causes.iterator();
        while (it.hasNext()) {
            a(it.next(), arrayList);
        }
    }

    public static void b(List list, vht vhtVar) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            vhtVar.append("Cause (");
            int i2 = i + 1;
            vhtVar.append(String.valueOf(i2));
            vhtVar.append(" of ");
            vhtVar.append(String.valueOf(size));
            vhtVar.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).g(vhtVar);
            } else {
                c(th, vhtVar);
            }
            i = i2;
        }
    }

    public static void c(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(Extension.COLON_SPACE).append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            ny61.j(th);
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(Extension.C_BRAKE);
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i));
            i = i2;
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    public final void g(Appendable appendable) {
        c(this, appendable);
        try {
            b(this.causes, new vht(appendable));
        } catch (IOException e) {
            ny61.j(e);
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.detailMessage);
        String str3 = "";
        if (this.dataClass != null) {
            str = Extension.FIX_SPACE + this.dataClass;
        } else {
            str = "";
        }
        sb.append(str);
        if (this.dataSource != null) {
            str2 = Extension.FIX_SPACE + this.dataSource;
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (this.key != null) {
            str3 = Extension.FIX_SPACE + this.key;
        }
        sb.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public final void h(khx khxVar, DataSource dataSource, Class cls) {
        this.key = khxVar;
        this.dataSource = dataSource;
        this.dataClass = cls;
    }

    public final void i(RuntimeException runtimeException) {
        this.exception = runtimeException;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        g(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        g(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        g(printWriter);
    }

    public GlideException(String str) {
        this(str, Collections.EMPTY_LIST);
    }
}
