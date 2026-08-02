package xsna;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.dto.common.VideoFile;
import com.vk.dto.video.VideoOwner;
import com.vk.libvideo.live.impl.base.LiveStatNew;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: RecommendedPresenter.java */
/* loaded from: classes3.dex */
public final class nef0 implements vcf0 {
    public final wcf0 d;
    public final VideoFile e;
    public final qef0 f;
    public final boolean h;
    public mef0 j;
    public io.reactivex.rxjava3.disposables.c k;
    public final boolean l;
    public io.reactivex.rxjava3.disposables.c m;
    public boolean n;
    public final String o;
    public LiveStatNew p;
    public final anz b = fxc0.B().T();
    public final byp c = byp.b();
    public final pxo0 g = new pxo0(1000);
    public boolean i = true;

    /* compiled from: RecommendedPresenter.java */
    public class a extends m.b {
        public ArrayList b;
        public List<VideoOwner> c;

        @Override // androidx.recyclerview.widget.m.b
        public final boolean areContentsTheSame(int i, int i2) {
            return ((VideoOwner) this.b.get(i)).c.equals(this.c.get(i2).c);
        }

        @Override // androidx.recyclerview.widget.m.b
        public final boolean areItemsTheSame(int i, int i2) {
            return ((VideoOwner) this.b.get(i)).c.equals(this.c.get(i2).c);
        }

        @Override // androidx.recyclerview.widget.m.b
        public final int getNewListSize() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.m.b
        public final int getOldListSize() {
            return this.b.size();
        }
    }

    public nef0(VideoFile videoFile, boolean z, wcf0 wcf0Var) {
        String str;
        this.d = wcf0Var;
        this.e = videoFile;
        if (videoFile != null) {
            str = VideoOwner.d(videoFile.o0(), videoFile.I0());
        } else {
            str = "";
        }
        this.o = str;
        this.l = z;
        this.h = true;
        qef0 qef0Var = new qef0();
        qef0Var.c = new ArrayList();
        qef0Var.d = this;
        this.f = qef0Var;
        wcf0Var.setAdapter(qef0Var);
        t();
    }

    public final void Q(boolean z) {
        this.d.setProgressVisibility(z);
    }

    @Override // xsna.vcf0
    public final void b() {
        this.b.b();
    }

    public final void d() {
        qef0 qef0Var = this.f;
        Iterator it = qef0Var.c.iterator();
        int i = 0;
        while (it.hasNext() && !((VideoOwner) it.next()).c.equals(this.o)) {
            i++;
        }
        this.d.V0(i < qef0Var.c.size() + (-1) ? i + 1 : 0);
    }

    @Override // xsna.vcf0
    public final void g0(VideoOwner videoOwner, boolean z) {
        LiveStatNew liveStatNew;
        pxo0 pxo0Var = this.g;
        if (!pxo0Var.c()) {
            pxo0Var.d();
            azi0 azi0Var = new azi0();
            azi0Var.a = VideoOwner.d(videoOwner.d, videoOwner.e);
            azi0Var.b = true;
            this.c.c(azi0Var);
        }
        if (!z || (liveStatNew = this.p) == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("action_type", "open_next_auto_endscreen");
        liveStatNew.b(bundle);
        qyk0.a().e("live_action", bundle);
    }

    @Override // xsna.vcf0
    public final RecyclerView.Adapter getAdapter() {
        return this.f;
    }

    @Override // xsna.vcf0
    public final boolean isInited() {
        return this.n;
    }

    @Override // xsna.vcf0
    public final void l1() {
        this.b.z(System.currentTimeMillis());
    }

    @Override // xsna.pk6
    public final void pause() {
        io.reactivex.rxjava3.disposables.c cVar = this.k;
        if (cVar != null) {
            cVar.dispose();
            this.k = null;
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.m;
        if (cVar2 != null) {
            cVar2.dispose();
            this.m = null;
        }
    }

    @Override // xsna.pk6
    public final void release() {
        mef0 mef0Var = this.j;
        if (mef0Var != null) {
            mef0Var.dispose();
            this.j = null;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.k;
        if (cVar != null) {
            cVar.dispose();
            this.k = null;
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.m;
        if (cVar2 != null) {
            cVar2.dispose();
            this.m = null;
        }
    }

    @Override // xsna.pk6
    public final void resume() {
        t();
    }

    @Override // xsna.pk6
    public final void start() {
        String str;
        boolean z = this.h;
        wcf0 wcf0Var = this.d;
        if (z) {
            wcf0Var.setProgressVisibility(false);
            wcf0Var.setErrorVisibility(false);
            return;
        }
        wcf0Var.setProgressVisibility(true);
        wcf0Var.setErrorVisibility(false);
        VideoFile videoFile = this.e;
        if (videoFile != null) {
            str = VideoOwner.d(videoFile.o0(), videoFile.I0());
        } else {
            str = "";
        }
        io.reactivex.rxjava3.core.q N = this.b.N(str, null, null, null);
        mef0 mef0Var = new mef0(this);
        N.subscribe(mef0Var);
        this.j = mef0Var;
    }

    public final void t() {
        io.reactivex.rxjava3.disposables.c cVar = this.k;
        if (cVar != null) {
            cVar.dispose();
            this.k = null;
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.m;
        if (cVar2 != null) {
            cVar2.dispose();
            this.m = null;
        }
        wnt wntVar = new wnt(this, 27);
        byp bypVar = this.c;
        this.k = bypVar.a(k4v.class, wntVar);
        this.m = bypVar.a(azi0.class, new xj50(this, 13));
    }

    @Override // xsna.vcf0
    public final void t1(boolean z) {
        if (!this.n && this.l) {
            d();
        }
        this.n = true;
        wcf0 wcf0Var = this.d;
        if (wcf0Var != null) {
            wcf0Var.setErrorVisibility(false);
            wcf0Var.setProgressVisibility(false);
        }
    }
}
