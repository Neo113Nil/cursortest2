package xsna;

import android.os.SystemClock;
import android.util.Base64;
import com.ironsource.X3;
import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.ml.MLFeatures;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.text.Regex;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.dug0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class t330 implements izs {
    public final /* synthetic */ com.vk.ml.b b;
    public final /* synthetic */ MLFeatures.MLFeature c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    public /* synthetic */ t330(com.vk.ml.b bVar, MLFeatures.MLFeature mLFeature, int i, String str, String str2) {
        this.b = bVar;
        this.c = mLFeature;
        this.d = i;
        this.e = str;
        this.f = str2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ArrayList M;
        String absolutePath;
        String str = this.f;
        dug0.c cVar = (dug0.c) obj;
        com.vk.ml.b bVar = this.b;
        MLFeatures.MLFeature mLFeature = this.c;
        bVar.i(mLFeature);
        File file = bVar.b;
        try {
            File file2 = cVar.c;
            if (bVar.f.get() != this.d) {
                throw new CancellationException();
            }
            File file3 = cVar.c;
            String str2 = this.e;
            if (str2 != null) {
                Regex regex = com.vk.core.files.a.a;
                if (vhk0.g(file2)) {
                    xa4.n(file2, file2, Base64.decode(str2, 0));
                }
            }
            String str3 = "unzip file : " + str;
            if (BuildInfo.h()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                M = com.vk.core.files.a.M(file, file3, false);
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                StringBuilder sb = new StringBuilder(X3.j.d);
                if (str3 == null) {
                    str3 = "action";
                }
                sb.append(str3);
                sb.append("]: completed in ");
                sb.append(elapsedRealtime2 - elapsedRealtime);
                sb.append(UcumUtils.UCUM_MILLISECODS);
                L.e(sb.toString());
            } else {
                M = com.vk.core.files.a.M(file, file3, false);
            }
            vhk0.b(file3);
            ArrayList arrayList = new ArrayList(c5g.u(M, 10));
            Iterator it = M.iterator();
            while (it.hasNext()) {
                arrayList.add(new File(file, (String) it.next()));
            }
            String str4 = "";
            if (str2 != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    File file4 = (File) it2.next();
                    String name = file4.getName();
                    pjp.c(com.vk.ml.b.c(name), brm0.y(UUID.randomUUID().toString(), "-", "").substring(0, 32));
                    String c = com.vk.ml.b.c(name);
                    String a = pjp.a(c);
                    if (a == null) {
                        a = brm0.y(UUID.randomUUID().toString(), "-", "").substring(0, 32);
                        pjp.c(c, a);
                    }
                    xa4.o(file4, file4, a.getBytes(emb.b));
                }
            }
            File file5 = (File) j5g.b0(0, arrayList);
            if (file5 != null && (absolutePath = file5.getAbsolutePath()) != null) {
                str4 = absolutePath;
            }
            bVar.k(mLFeature);
            return str4;
        } catch (Throwable th) {
            bVar.k(mLFeature);
            throw th;
        }
    }
}
