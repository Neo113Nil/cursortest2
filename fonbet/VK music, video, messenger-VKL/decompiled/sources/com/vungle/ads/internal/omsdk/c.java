package com.vungle.ads.internal.omsdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.iab.omid.library.vungle.Omid;
import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.R;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import xsna.a0a;
import xsna.emb;
import xsna.s3q0;
import xsna.to2;

/* loaded from: classes7.dex */
public final class c {
    public final Context a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public AtomicReference c = new AtomicReference(null);
    public AtomicReference d = new AtomicReference(null);

    public c(Context context) {
        this.a = context;
    }

    public static final void a(c cVar) {
        Object failure;
        try {
            if (!Omid.isActive()) {
                Omid.activate(cVar.a);
            }
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            boolean z = u.a;
            StringBuilder a2 = l.a("error: ");
            a2.append(a.getLocalizedMessage());
            t.b("OMInjector", a2.toString());
        }
    }

    public final void b() {
        this.b.post(new to2(this, 18));
    }

    public final void a(File file) {
        FileWriter fileWriter;
        ArrayList arrayList = new ArrayList();
        File file2 = new File(file, "omsdk.js");
        if (!file2.exists()) {
            boolean z = u.a;
            StringBuilder a = l.a("injecting omsdk.js to ");
            a.append(file2.getAbsolutePath());
            t.a("OMInjector", a.toString());
            String a2 = a();
            if (a2 != null) {
                fileWriter = new FileWriter(file2);
                try {
                    fileWriter.write(a2);
                    fileWriter.flush();
                    fileWriter.close();
                } finally {
                }
            }
            arrayList.add(file2);
        }
        File file3 = new File(file, "omsdk-session.js");
        if (file3.exists()) {
            return;
        }
        boolean z2 = u.a;
        StringBuilder a3 = l.a("injecting omsdk-session.js to ");
        a3.append(file3.getAbsolutePath());
        t.a("OMInjector", a3.toString());
        String str = (String) this.d.get();
        if (str == null) {
            str = a(R.raw.omid_session_client_v1_6_2);
            this.d.set(str);
        }
        if (str != null) {
            fileWriter = new FileWriter(file3);
            try {
                fileWriter.write(str);
                fileWriter.flush();
                fileWriter.close();
            } finally {
            }
        }
        arrayList.add(file3);
    }

    public final String a() {
        String str = (String) this.c.get();
        if (str != null) {
            return str;
        }
        String a = a(R.raw.omsdk_v1_6_2);
        this.c.set(a);
        return a;
    }

    public final String a(int i) {
        Object failure;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.a.getResources().openRawResource(i), emb.b), 8192);
            try {
                failure = a0a.b(bufferedReader);
                bufferedReader.close();
            } finally {
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (String) failure;
    }
}
