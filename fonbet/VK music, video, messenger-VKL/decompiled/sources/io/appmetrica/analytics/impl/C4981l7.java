package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.e43;

/* renamed from: io.appmetrica.analytics.impl.l7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4981l7 {
    public final U6 a;
    public final List b;
    public final boolean c;

    public C4981l7(U6 u6, ArrayList arrayList, boolean z) {
        this.a = u6;
        this.b = arrayList;
        this.c = z;
    }

    public final String a(Context context, InterfaceC4929j7 interfaceC4929j7) {
        File parentFile;
        try {
            File a = this.a.a(context, interfaceC4929j7.b());
            if (!a.exists() && (parentFile = a.getParentFile()) != null && (parentFile.exists() || parentFile.mkdirs())) {
                a(context, interfaceC4929j7.a(), a);
            }
            return a.getPath();
        } catch (Throwable unused) {
            return interfaceC4929j7.b();
        }
    }

    public final void a(Context context, String str, File file) {
        List list = this.b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File a = ((U6) it.next()).a(context, str);
            if (a.exists()) {
                try {
                    if (this.c) {
                        FileUtils.copyToNullable(a, file);
                    } else {
                        FileUtils.move(a, file);
                    }
                    String path = a.getPath();
                    String path2 = file.getPath();
                    for (String str2 : e43.l("-journal", "-shm", "-wal")) {
                        File file2 = new File(path + str2);
                        File file3 = new File(path2 + str2);
                        if (this.c) {
                            FileUtils.copyToNullable(file2, file3);
                        } else {
                            FileUtils.move(file2, file3);
                        }
                    }
                    return;
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
    }
}
