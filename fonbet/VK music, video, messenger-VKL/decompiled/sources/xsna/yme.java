package xsna;

import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.clips.ClipsAdsFeaturesParams;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import xsna.xme;

/* compiled from: ClipsNewsfeedAdBannersInfoHolderImpl.kt */
/* loaded from: classes17.dex */
public final class yme implements xme {
    public final ro10 a;
    public final boolean b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap.KeySetView d = ConcurrentHashMap.newKeySet();
    public final ConcurrentHashMap.KeySetView e = ConcurrentHashMap.newKeySet();

    public yme(ro10 ro10Var, boolean z) {
        this.a = ro10Var;
        this.b = z;
    }

    @Override // xsna.xme
    public final void a(String str, gmc gmcVar) {
        this.d.remove(str);
        this.c.put(str, gmcVar);
    }

    @Override // xsna.xme
    public final void b(String str) {
        ConcurrentHashMap.KeySetView keySetView = this.e;
        if (keySetView.size() % (this.a.get() + 1) != 0) {
            keySetView.add(str);
        }
    }

    @Override // xsna.xme
    public final void c(String str, gmc gmcVar) {
        boolean z = this.b;
        ConcurrentHashMap concurrentHashMap = this.c;
        if (z) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, gmcVar);
        }
        this.e.add(str);
    }

    @Override // xsna.xme
    public final void d(String str) {
        this.d.add(str);
    }

    @Override // xsna.xme
    public final void e(String str) {
        if (this.b) {
            this.d.remove(str);
            this.e.remove(str);
            this.c.remove(str);
        }
    }

    @Override // xsna.xme
    public final void f(String str) {
        this.c.remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    @Override // xsna.xme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xme.a g(ClipVideoFile clipVideoFile, String str) {
        boolean z;
        ClipsAdsFeaturesParams clipsAdsFeaturesParams;
        ConcurrentHashMap.KeySetView keySetView;
        ClipsAdsFeaturesParams clipsAdsFeaturesParams2;
        List<String> list;
        boolean z2 = false;
        if (clipVideoFile == null || (clipsAdsFeaturesParams2 = clipVideoFile.S1) == null || (list = clipsAdsFeaturesParams2.b) == null || !(!list.isEmpty())) {
            if (((clipVideoFile == null || (clipsAdsFeaturesParams = clipVideoFile.S1) == null) ? null : clipsAdsFeaturesParams.d) == null) {
                z = false;
                keySetView = this.e;
                if (!keySetView.contains(str) && keySetView.size() % (this.a.get() + 1) == 0) {
                    z2 = true;
                }
                Object obj = this.c.get(str);
                return obj == null ? new xme.a.c(obj) : (!this.d.contains(str) && (z || z2)) ? new xme.a.b() : xme.a.C4019a.a;
            }
        }
        z = true;
        keySetView = this.e;
        if (!keySetView.contains(str)) {
            z2 = true;
        }
        Object obj2 = this.c.get(str);
        if (obj2 == null) {
        }
    }
}
