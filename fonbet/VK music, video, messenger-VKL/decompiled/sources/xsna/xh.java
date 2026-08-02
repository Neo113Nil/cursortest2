package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.features.CoreFeatures;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: AbstractSingleSharedPrefsRepository.kt */
/* loaded from: classes11.dex */
public abstract class xh implements zvj0 {
    public final gzs<UserId> a;
    public final String b;
    public final bpn0 c = new bpn0(new wh(this, 0));

    public xh(Context context, gzs<UserId> gzsVar) {
        this.a = gzsVar;
        this.b = context.getDataDir().getAbsoluteFile().getPath() + "/single_pref/";
    }

    @Override // xsna.zvj0
    public final boolean a() {
        try {
            return ((File) this.c.getValue()).exists();
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // xsna.zvj0
    public final void b() {
        com.vk.core.files.a.c((File) this.c.getValue());
    }

    @Override // xsna.zvj0
    public final void c() {
        boolean z;
        for (n0d0 n0d0Var : h()) {
            String valueOf = String.valueOf(this.a.invoke().b);
            nvj0 nvj0Var = n0d0Var.b;
            File file = nvj0Var.a;
            boolean z2 = false;
            if (!n0d0Var.c.invoke().booleanValue()) {
                ArrayList arrayList = new ArrayList(nvj0Var.a());
                if (arrayList.remove(valueOf)) {
                    try {
                        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), emb.b), 8192));
                        try {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                printWriter.println((String) it.next());
                            }
                            s3q0 s3q0Var = s3q0.a;
                            printWriter.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                ro.e(printWriter, th);
                                throw th2;
                            }
                        }
                    } catch (IOException e) {
                        L.l("SinglePrefStorage", "Error writing to file: " + e.getMessage());
                    }
                }
            } else if (nvj0Var.a().contains(valueOf)) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"SinglePrefStorage", go9.b("Added value = ", valueOf)});
                }
            } else {
                try {
                    try {
                        z = file.exists();
                    } catch (IOException e2) {
                        L l2 = L.a;
                        l2.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l2, L.LogType.e, new Object[]{"SinglePrefStorage", "Can't add value to file " + e2.getMessage()});
                        }
                    }
                } catch (SecurityException unused) {
                    z = false;
                }
                if (!z) {
                    com.vk.core.files.a.c(file);
                }
                nbr.j(file, valueOf.concat("\n"));
            }
            boolean isEmpty = nvj0Var.a().isEmpty();
            if (isEmpty) {
                try {
                    file.delete();
                } catch (IOException e3) {
                    L.l("SinglePrefStorage", "Error clearing file: " + e3.getMessage());
                }
            }
            boolean z3 = (isEmpty || n0d0Var.d.invoke().booleanValue()) ? false : true;
            File file2 = n0d0Var.a;
            if (z3) {
                try {
                    z2 = file2.exists();
                } catch (SecurityException unused2) {
                }
                if (!z2) {
                    file2.createNewFile();
                }
            }
            if (!z3) {
                file2.delete();
            }
        }
    }

    @Override // xsna.zvj0
    public final void d() {
        ((File) this.c.getValue()).delete();
    }

    @Override // xsna.zvj0
    public final boolean e() {
        eqy<bek0> eqyVar = com.vk.toggle.d.a;
        CoreFeatures coreFeatures = CoreFeatures.WM_MIGRATION_DISABLED;
        coreFeatures.getClass();
        return com.vk.toggle.b.A.a(coreFeatures);
    }

    @Override // xsna.zvj0
    public final boolean f() {
        try {
            return h().get(1).a.exists();
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // xsna.zvj0
    public final boolean g() {
        try {
            return h().get(0).a.exists();
        } catch (SecurityException unused) {
            return false;
        }
    }

    public abstract List<n0d0> h();
}
