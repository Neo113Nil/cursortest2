package xsna;

import android.content.Context;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.viewer.impl.utils.performance.ClipsScreenPerformanceReporter;
import com.vk.libvideo.design.view.error.VideoErrorView;
import java.util.List;
import xsna.nlh0;

/* compiled from: MusicTemplateItemViewHolder.kt */
/* loaded from: classes17.dex */
public final class z950 extends tqs0<FeedItem.k> implements pi5, t1b0, e9d {
    public final a p;
    public final ph5 q;

    /* compiled from: MusicTemplateItemViewHolder.kt */
    public final class a implements nlh0.a {
        public final /* synthetic */ twc<FeedItem.k> b;

        public a() {
            this.b = z950.this.n;
        }

        @Override // xsna.nlh0.a
        public final void A1(SdkVideoFile sdkVideoFile, List<? extends olh0> list) {
            z950 z950Var = z950.this;
            FeedItem.k kVar = (FeedItem.k) z950Var.o;
            if (kVar != null) {
                z950Var.h6(new FeedItem.k(kVar.b, kVar.c, kVar.d, (SdkClipVideoFile) sdkVideoFile, kVar.f, kVar.g, kVar.h, kVar.i), list);
            }
        }

        @Override // xsna.nlh0.a
        public final void L2(boolean z) {
            this.b.getClass();
        }
    }

    public z950(Context context, h3d h3dVar, pih0 pih0Var, int i, kxc kxcVar, gxp0 gxp0Var, zof zofVar, ClipsScreenPerformanceReporter clipsScreenPerformanceReporter) {
        super(context, h3dVar, pih0Var, i, kxcVar, gxp0Var, zofVar, clipsScreenPerformanceReporter);
        twc<Item> twcVar = this.n;
        i3i0 i3i0Var = new i3i0(twcVar.getSeekbarControllerProvider(), new juz(6));
        z7e z7eVar = new z7e(twcVar);
        a8e a8eVar = new a8e(twcVar, i3i0Var);
        e6e e6eVar = new e6e(twcVar);
        aa50 aa50Var = new aa50(twcVar);
        awc awcVar = z7eVar.a;
        awcVar.f.setOnClickListener(e6eVar);
        awcVar.d.a(new VideoErrorView.a(null, e6eVar, false, 57));
        y950 y950Var = new y950(z7eVar, a8eVar, aa50Var);
        this.p = new a();
        twc<Item> twcVar2 = this.n;
        twcVar2.J = y950Var;
        twcVar2.K = y950Var;
        twcVar2.L = y950Var;
        String str = "clip_music_temp_vh" + hashCode();
        mnt0 mnt0Var = this.n;
        this.q = new ph5(new ab(str, mnt0Var, this), this, new jy(mnt0Var, 8));
    }

    @Override // xsna.e9d
    public final g64 D4() {
        return this.q;
    }

    @Override // xsna.pi5
    public final oi5 e4() {
        FeedItem.k kVar = (FeedItem.k) this.n.getItem();
        if (kVar != null) {
            return kVar.i;
        }
        return null;
    }

    @Override // xsna.t1b0
    public final o0f getAttachedPlayer() {
        return this.q;
    }

    @Override // xsna.tqs0
    public final nlh0.a i6() {
        return this.p;
    }

    @Override // xsna.pi5
    public final kih0 j() {
        FeedItem.k kVar = (FeedItem.k) this.n.getItem();
        if (kVar != null) {
            return kVar.h;
        }
        return null;
    }
}
