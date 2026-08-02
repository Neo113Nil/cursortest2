package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.toggle.Features;
import com.vk.utils.log.LogUploader;
import com.vk.utils.log.a;
import com.vkontakte.android.VKApplication;
import java.io.File;
import java.util.Collections;
import java.util.List;
import xsna.z100;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class s7m implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ VKApplication c;

    public /* synthetic */ s7m(VKApplication vKApplication, int i) {
        this.b = i;
        this.c = vKApplication;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bc, code lost:
    
        if (com.vk.utils.log.LogUploader.d() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0097, code lost:
    
        if (com.vk.utils.log.LogUploader.d() != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f3  */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        PrivateFiles.a b;
        boolean z;
        z100 z100Var;
        switch (this.b) {
            case 0:
                return new File(this.c.getFilesDir(), "di_experiments");
            default:
                VKApplication vKApplication = this.c;
                VKApplication.a aVar = VKApplication.c;
                List singletonList = Collections.singletonList(vKApplication.getPackageName());
                boolean f = epx.f(j5g.a0(singletonList), vKApplication.getPackageName());
                com.vk.utils.log.a.a = new u94(10);
                o2l.a.getClass();
                o2l.h("__dbg_log_to_file", false);
                L.a.getClass();
                if (!L.c) {
                    LogUploader logUploader = LogUploader.a;
                    s63 s63Var = new s63(0);
                    sw1 sw1Var = new sw1(2);
                    Features.Type type = Features.Type.FEATURE_AUTO_LOG_UPLOAD;
                    g620 g620Var = new g620();
                    LogUploader.c = s63Var;
                    LogUploader.d = sw1Var;
                    LogUploader.e = type;
                    LogUploader.f = g620Var;
                    asu0.a.getClass();
                    asu0.h().execute(new q63());
                    String str = (String) singletonList.get(0);
                    b = e8r.a.b(r5, PrivateSubdir.LOGS.h(), true);
                    jar jarVar = new jar(str, b.a.getAbsolutePath(), com.vk.utils.log.a.a(), "VK.log");
                    if (!BuildInfo.m()) {
                        LogUploader logUploader2 = LogUploader.a;
                        break;
                    }
                    if (!BuildInfo.m() || !o25.a().i().c) {
                        if (!o25.a().b()) {
                            LogUploader logUploader3 = LogUploader.a;
                            break;
                        }
                        z = false;
                        z100.a aVar2 = new z100.a();
                        aVar2.d = z;
                        aVar2.e = f;
                        aVar2.a = jarVar;
                        aVar2.f = o2l.b("__dbg_log_thread_dump", false);
                        ky6 j = Preference.j();
                        r63 r63Var = new r63(0);
                        hu2 hu2Var = new hu2(1);
                        boolean z2 = aVar2.d;
                        boolean z3 = aVar2.f;
                        boolean z4 = aVar2.e;
                        jar jarVar2 = aVar2.a;
                        jar jarVar3 = jarVar2 != null ? null : jarVar2;
                        z100 z100Var2 = new z100(z2, z3, z4, jarVar3, aVar2.c, aVar2.b, r63Var, j != null ? null : j, hu2Var);
                        q55 q55Var = q55.a;
                        a.C1941a c1941a = com.vk.utils.log.a.c;
                        q55.e(c1941a);
                        q55.a(c1941a);
                        VKApplication vKApplication2 = com.vk.core.apps.a.a;
                        a.b bVar = com.vk.utils.log.a.b;
                        L.g = z100Var2;
                        L.i.add(bVar);
                        L.e = new y4g(z100Var2);
                        m9r m9rVar = new m9r(r63Var);
                        L.f = m9rVar;
                        L.h = new v7r(jarVar3, m9rVar, new com.vk.log.c());
                        z100Var = L.g;
                        if (z100Var == null) {
                            z100Var = null;
                        }
                        if (!z100Var.a) {
                            L.a();
                            z100 z100Var3 = L.g;
                            if (z100Var3 == null) {
                                z100Var3 = null;
                            }
                            tdj.b(z100Var3.h, "isStartLogging", false);
                        }
                        L.c = true;
                        com.vk.utils.log.a.b();
                    }
                    z = true;
                    z100.a aVar22 = new z100.a();
                    aVar22.d = z;
                    aVar22.e = f;
                    aVar22.a = jarVar;
                    aVar22.f = o2l.b("__dbg_log_thread_dump", false);
                    ky6 j2 = Preference.j();
                    r63 r63Var2 = new r63(0);
                    hu2 hu2Var2 = new hu2(1);
                    boolean z22 = aVar22.d;
                    boolean z32 = aVar22.f;
                    boolean z42 = aVar22.e;
                    jar jarVar22 = aVar22.a;
                    if (jarVar22 != null) {
                    }
                    z100 z100Var22 = new z100(z22, z32, z42, jarVar3, aVar22.c, aVar22.b, r63Var2, j2 != null ? null : j2, hu2Var2);
                    q55 q55Var2 = q55.a;
                    a.C1941a c1941a2 = com.vk.utils.log.a.c;
                    q55.e(c1941a2);
                    q55.a(c1941a2);
                    VKApplication vKApplication22 = com.vk.core.apps.a.a;
                    a.b bVar2 = com.vk.utils.log.a.b;
                    L.g = z100Var22;
                    L.i.add(bVar2);
                    L.e = new y4g(z100Var22);
                    m9r m9rVar2 = new m9r(r63Var2);
                    L.f = m9rVar2;
                    L.h = new v7r(jarVar3, m9rVar2, new com.vk.log.c());
                    z100Var = L.g;
                    if (z100Var == null) {
                    }
                    if (!z100Var.a) {
                    }
                    L.c = true;
                    com.vk.utils.log.a.b();
                }
                return s3q0.a;
        }
    }
}
