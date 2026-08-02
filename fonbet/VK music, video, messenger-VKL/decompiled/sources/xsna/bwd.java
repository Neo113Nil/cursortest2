package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.clips.VideoTransform;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.bzd;
import xsna.fzd;
import xsna.kuc;
import xsna.luc;
import xsna.wzd;
import xsna.xvd;

/* compiled from: ClipsEditorActionsHandlerImpl.kt */
/* loaded from: classes16.dex */
public final class bwd implements xvd {
    public final Context a;
    public final c9d b;
    public final bzd.a c;
    public final hwd d;
    public final szd e;
    public final e2e f;
    public final lxd g;
    public int h;
    public io.reactivex.rxjava3.disposables.c i;

    /* compiled from: ClipsEditorActionsHandlerImpl.kt */
    public static final class a {
        public final String a;
        public final Bitmap b;
        public final Bitmap c;
        public final fzd.a d;

        public a(String str, Bitmap bitmap, Bitmap bitmap2, fzd.a aVar) {
            this.a = str;
            this.b = bitmap;
            this.c = bitmap2;
            this.d = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Bitmap bitmap = this.b;
            int hashCode2 = (hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
            Bitmap bitmap2 = this.c;
            return this.d.hashCode() + ((hashCode2 + (bitmap2 != null ? bitmap2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "PreviewUpdateData(id=" + this.a + ", frame=" + this.b + ", frameFiltered=" + this.c + ", previewInfo=" + this.d + ')';
        }
    }

    public bwd(Context context, c9d c9dVar, bzd.a aVar, hwd hwdVar, szd szdVar, e2e e2eVar, lxd lxdVar) {
        this.a = context;
        this.b = c9dVar;
        this.c = aVar;
        this.d = hwdVar;
        this.e = szdVar;
        this.f = e2eVar;
        this.g = lxdVar;
    }

    @Override // xsna.x8d.b
    public final void a(int i) {
        this.h = i;
        q0e q0eVar = bzd.this.h;
        q0eVar.W(q0eVar.T().g(), (int) q0eVar.T().getStickerRotation(), q0eVar.T().j());
    }

    @Override // xsna.xvd
    public final void b(VideoTransform videoTransform) {
        int i = this.h;
        szd szdVar = this.e;
        com.vk.clips.editor.state.model.c cVar = (com.vk.clips.editor.state.model.c) j5g.b0(i, szdVar.o.a.c);
        if (cVar != null) {
            com.vk.clips.editor.state.model.c a2 = com.vk.clips.editor.state.model.c.a(cVar, null, 0L, 0L, null, null, null, videoTransform, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 523263);
            List singletonList = Collections.singletonList(new wzd.a(luc.k.a, 1));
            ArrayList arrayList = new ArrayList(i7o0.a(szdVar.o.a.c));
            if (arrayList.size() > i) {
                arrayList.set(i, a2);
                szdVar.c(com.vk.clips.editor.state.model.a.c(szdVar.o.a, null, arrayList, null, null, null, null, 123), j5g.V(singletonList));
            }
        }
    }

    public final void c(List list) {
        int i = this.h;
        szd szdVar = this.e;
        com.vk.clips.editor.state.model.c cVar = (com.vk.clips.editor.state.model.c) j5g.b0(i, szdVar.o.a.c);
        if (cVar == null) {
            i = szdVar.o.a.c.size();
        } else {
            long n = this.b.n();
            Iterator it = j5g.H0(szdVar.o.a.c, i).iterator();
            long j = 0;
            while (it.hasNext()) {
                j += ((com.vk.clips.editor.state.model.c) it.next()).getDurationMs();
            }
            if (n - j > cVar.getDurationMs() / 2) {
                i++;
            }
        }
        wzd.c cVar2 = new wzd.c(new yx0(list, 28));
        wzd.a aVar = new wzd.a(list.size() > 1 ? ouc.a : puc.a, 1);
        ArrayList arrayList = new ArrayList(i7o0.a(szdVar.o.a.c));
        arrayList.addAll(i, list);
        szdVar.c(com.vk.clips.editor.state.model.a.c(szdVar.o.a, null, arrayList, null, null, null, null, 123), j5g.V(rl3.I(new wzd[]{cVar2, aVar})));
        bzd.this.h.V(true);
    }

    public final boolean d(boolean z) {
        szd szdVar = this.e;
        long e = szdVar.o.a.e();
        cxd cxdVar = this.f.k;
        boolean z2 = e <= ((long) ynd.a()) && 1000 <= e;
        vzd.c(szdVar, yzd.a(szdVar.o.a.b, z2, false, false, false, false, 30));
        if (!z2 && z) {
            boolean z3 = e < 1000;
            long a2 = ynd.a();
            hwd hwdVar = this.d;
            bzd.a aVar = this.c;
            if (e > a2) {
                ynd.a();
                new dwd(0, aVar, xvd.a.class, "closeCreation", "closeCreation()V", 0);
                hwdVar.c(new kuc.d(ynd.a(), new cwd(0, aVar, xvd.a.class, "closeCreation", "closeCreation()V", 0), new lk(8)));
                return z2;
            }
            if (z3) {
                new fwd(0, aVar, xvd.a.class, "closeCreation", "closeCreation()V", 0);
                hwdVar.c(new kuc.e(1000L, new ewd(0, aVar, xvd.a.class, "closeCreation", "closeCreation()V", 0), new iy2(9)));
            }
        }
        return z2;
    }

    @Override // xsna.xvd
    public final String e() {
        com.vk.clips.editor.state.model.c cVar = (com.vk.clips.editor.state.model.c) j5g.b0(this.h, this.e.o.a.c);
        if (cVar != null) {
            return cVar.j;
        }
        return null;
    }

    @Override // xsna.xvd
    public final void h(int i, int i2) {
        wzd.c cVar = new wzd.c(new yvd(i2, 0));
        szd szdVar = this.e;
        if (szdVar.o.a.c.size() > i && szdVar.o.a.c.size() > i2) {
            ArrayList arrayList = new ArrayList(i7o0.a(szdVar.o.a.c));
            Collections.swap(arrayList, i, i2);
            szdVar.c(com.vk.clips.editor.state.model.a.c(szdVar.o.a, null, arrayList, null, null, null, null, 123), j5g.V(e43.l(cVar, null)));
        }
        this.h = this.h;
        q0e q0eVar = bzd.this.h;
        q0eVar.W(q0eVar.T().g(), (int) q0eVar.T().getStickerRotation(), q0eVar.T().j());
    }
}
