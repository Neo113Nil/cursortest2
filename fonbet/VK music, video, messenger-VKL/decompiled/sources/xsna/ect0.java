package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.bridges.di.BridgeComponent;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSource;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.dw20;
import xsna.gm50;
import xsna.mk50;

/* compiled from: VideoRelatedVideosMoreActionsBottomSheet.kt */
/* loaded from: classes7.dex */
public final class ect0 extends tl50<gct0, lct0, dct0> {
    public final izs<Boolean, s3q0> i1;
    public final Object j1;
    public final Object k1;
    public final Object l1;
    public final bpn0 m1;

    /* compiled from: VideoRelatedVideosMoreActionsBottomSheet.kt */
    public static final class a extends dw20.b {
        public final VideoDiscoveryRelatedVideosSource e;
        public final r9c0 f;

        public a(lpj lpjVar, VideoDiscoveryRelatedVideosSource videoDiscoveryRelatedVideosSource, r9c0 r9c0Var) {
            super(lpjVar, null);
            this.e = videoDiscoveryRelatedVideosSource;
            this.f = r9c0Var;
            P0();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            ect0 ect0Var = new ect0(this.f);
            ect0Var.setArguments(yfb.b(new Pair("related_video_actions_args_tag", this.e)));
            return ect0Var;
        }
    }

    public ect0(r9c0 r9c0Var) {
        this.i1 = r9c0Var;
        tsk0 tsk0Var = new tsk0(this, 25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j1 = msy.a(lazyThreadSafetyMode, tsk0Var);
        this.k1 = msy.a(lazyThreadSafetyMode, new pis0(this, 7));
        this.l1 = msy.a(lazyThreadSafetyMode, new d8t0(this, 2));
        this.m1 = new bpn0(new iml0(this, 19));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        Context mo2getContext = mo2getContext();
        dhr0.a.getClass();
        return new mk50.c(LayoutInflater.from(new lpj(mo2getContext, dhr0.u().c)).inflate(R.layout.video_related_videos_more_actions_dialog, (ViewGroup) null, false));
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.moreActionsRecyclerView);
        viewGroup.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter((av20) this.m1.getValue());
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(true);
        gm50.a.b(this, ((lct0) ao50Var).a, new n9m0(this, 17));
        getFeature().h.a(new cbt0(this, 1), this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final BridgeComponent bo() {
        return (BridgeComponent) this.j1.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        VideoDiscoveryRelatedVideosSource videoDiscoveryRelatedVideosSource = (VideoDiscoveryRelatedVideosSource) zn8.a(VideoDiscoveryRelatedVideosSource.class, bundle, "related_video_actions_args_tag");
        ((com.vk.video.kidsprofile.restricteduseractions.a) this.k1.getValue()).getClass();
        return new gct0(videoDiscoveryRelatedVideosSource, null, bo().s(), bo().O());
    }
}
