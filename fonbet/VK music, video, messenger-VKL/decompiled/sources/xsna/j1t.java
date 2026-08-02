package xsna;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.b4p;
import xsna.h2t;

/* compiled from: GLCollageController.kt */
/* loaded from: classes4.dex */
public final class j1t implements h2t.a {
    public final e4p a;
    public final b4p.a b;
    public final String c;
    public final /* synthetic */ e4p d;
    public final /* synthetic */ b4p.a e;
    public final /* synthetic */ l1t f;
    public final /* synthetic */ boolean g;

    public j1t(e4p e4pVar, b4p.a aVar, l1t l1tVar, boolean z) {
        this.d = e4pVar;
        this.e = aVar;
        this.f = l1tVar;
        this.g = z;
        this.a = e4pVar;
        this.b = aVar;
        this.c = pzl.b(e4pVar.getKey(), StringUtils.PROCESS_POSTFIX_DELIMITER, aVar.d);
    }

    @Override // xsna.h2t.a
    public final e4p e() {
        return this.a;
    }

    @Override // xsna.h2t.a
    public final void f(f2t f2tVar) {
        boolean z;
        l1t l1tVar = this.f;
        e4p e4pVar = this.d;
        boolean z2 = this.g;
        h1t h1tVar = l1tVar.o;
        if (h1tVar != null) {
            n4p n4pVar = (n4p) l1tVar.f.invoke();
            if (n4pVar != null) {
                n4pVar.d("VkPhotoEditorGLCollageController: export: loaded texture for imageLink=" + e4pVar + " texture=" + f2tVar);
            }
            ArrayList arrayList = new ArrayList();
            synchronized (h1tVar.c) {
                try {
                    Iterator it = h1tVar.c.iterator();
                    z = true;
                    while (it.hasNext()) {
                        m1t m1tVar = (m1t) it.next();
                        if (epx.f(m1tVar.i, e4pVar)) {
                            m1tVar = z2 ? m1t.a(m1tVar, null, f2tVar, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) : m1t.a(m1tVar, f2tVar, null, 1535);
                        }
                        if (m1tVar.j == null || (l1tVar.k && m1tVar.k == null)) {
                            z = false;
                        }
                        arrayList.add(m1tVar);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            h1tVar.c = arrayList;
            if (z) {
                n4p n4pVar2 = (n4p) l1tVar.f.invoke();
                if (n4pVar2 != null) {
                    n4pVar2.d("VkPhotoEditorGLCollageController: export: all textures loaded");
                }
                l1tVar.b.f = h1tVar;
                l1tVar.a.b();
                l1tVar.o = null;
            }
        }
    }

    @Override // xsna.h2t.a
    public final b4p.a getConfig() {
        return this.b;
    }

    @Override // xsna.h2t.a
    public final String getKey() {
        return this.c;
    }

    @Override // xsna.h2t.a
    public final void onLowMemory() {
        boolean isCurrentThread = Looper.getMainLooper().isCurrentThread();
        l1t l1tVar = this.f;
        if (isCurrentThread) {
            l1tVar.d.f();
        } else {
            new Handler(Looper.getMainLooper()).post(new gs2(l1tVar, 9));
        }
    }

    public final String toString() {
        return new JSONObject(pn00.k(new Pair("key", this.c), new Pair("link", this.a), new Pair("config", this.e))).toString();
    }
}
