package xsna;

import android.content.Context;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.libvideo.api.ad.AdBannerData;
import com.vk.libvideo.api.ad.a;
import com.vk.libvideo.author.VideoPinType;
import com.vk.libvideo.autoplay.AutoPlayMinifiedState;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q5b0;
import xsna.rmw;

/* compiled from: VideoLargeListViewStateMapper.kt */
/* loaded from: classes.dex */
public final class yrs0 implements s2a<VideoLargeListState, xrs0> {
    public final Context b;

    public yrs0(Context context) {
        this.b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0274  */
    @Override // xsna.s2a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xrs0 a(VideoLargeListState videoLargeListState) {
        float floatValue;
        VideoCardViewState videoCardViewState;
        q5b0 q5b0Var;
        sh0 sh0Var;
        AdBannerData a;
        AdBannerData.AdRedirectData b;
        PreviewViewState u;
        boolean r;
        PreviewViewState.DurationBadge t;
        PreviewViewState.k q;
        VideoLargeListState videoLargeListState2 = videoLargeListState;
        VideoFile videoFile = videoLargeListState2.d;
        gi5 gi5Var = videoLargeListState2.t;
        com.vk.libvideo.api.ad.a c = gi5Var.c();
        a.AbstractC1195a abstractC1195a = c instanceof a.AbstractC1195a ? (a.AbstractC1195a) c : null;
        if (abstractC1195a != null) {
            AdBannerData a2 = abstractC1195a.a();
            floatValue = a2.getWidth() / a2.getHeight();
        } else {
            float E0 = videoFile.E0();
            Float valueOf = Float.valueOf(E0);
            if (E0 == -1.0f) {
                valueOf = null;
            }
            floatValue = valueOf != null ? valueOf.floatValue() : 1.7777778f;
        }
        BlockId.CompositeId compositeId = videoLargeListState2.b;
        com.vk.libvideo.autoplay.a aVar = videoLargeListState2.s;
        if (aVar != null) {
            VideoFile l = gi5Var.l();
            DonutVideoUiModel donutVideoUiModel = videoLargeListState2.g;
            VideoPinType videoPinType = videoLargeListState2.h;
            VideoRestriction O = gi5Var.l().O();
            if (O != null && gi5Var.w()) {
                u = zrs0.l(gi5Var, O);
            } else if (O != null && e5o.b(O)) {
                u = zrs0.h(gi5Var, aVar, donutVideoUiModel, videoPinType);
            } else if (gi5Var.f() == AutoPlayMinifiedState.PIP) {
                u = zrs0.k();
            } else if (!videoLargeListState2.o || gi5Var.x() || gi5Var.l().z0()) {
                u = zrs0.u(gi5Var, aVar, donutVideoUiModel, videoPinType);
            } else if (gi5Var.m() || (gi5Var.n() && !gi5Var.f().h())) {
                u = zrs0.e(gi5Var, aVar, videoLargeListState2.q);
            } else if (gi5Var.q()) {
                u = zrs0.j(gi5Var);
            } else if (gi5Var.p()) {
                u = zrs0.f(gi5Var, videoLargeListState2.i);
            } else {
                boolean z = videoLargeListState2.j;
                boolean z2 = videoLargeListState2.k;
                boolean b2 = aVar.b();
                boolean f = aVar.f();
                boolean g = aVar.g();
                boolean z3 = (((gi5Var.u() || gi5Var.t()) && gi5Var.r()) || !gi5Var.o() || gi5Var.u()) ? false : true;
                boolean z4 = !z3 && gi5Var.v();
                boolean z5 = z4 || z3;
                r = zrs0.r(gi5Var, b2);
                boolean z6 = z4 || z;
                rmw.f f2 = !z6 ? smw.f(videoFile.getImage()) : null;
                PreviewViewState.a o = zrs0.o(gi5Var, z4, f, g, z2);
                PreviewViewState.n d = z5 ? zrs0.d(gi5Var) : null;
                t = zrs0.t(videoFile, z3, z4, zrs0.c(gi5Var.h()));
                PreviewViewState.n nVar = r ? new PreviewViewState.n(smw.a(R.drawable.vk_icon_play_button_48), null, null, null, 14) : null;
                q = zrs0.q(videoPinType);
                u = PreviewViewState.a0.b(f2, false, t, d, q, o, nVar, null, gi5Var.v() ? zrs0.m(gi5Var.j()) : null, zrs0.n(gi5Var, z6, videoLargeListState2.l, videoLargeListState2.m), null, 1152);
            }
            String M0 = l.M0();
            VideoMetaViewState.i iVar = new VideoMetaViewState.i(nno0.e(l.getTitle()));
            String P = l.P();
            videoCardViewState = new VideoCardViewState(u, VideoCardViewState.a.a(M0, new VideoMetaViewState(iVar, new VideoMetaViewState.a(null, null, P != null ? nno0.e(P) : null, l.Y().b, kpt0.g(l), nno0.d(pls0.b(this.b, l)), donutVideoUiModel != null ? zrs0.g(donutVideoUiModel) : null, 0, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE), 4), true));
        } else {
            videoCardViewState = null;
        }
        yg5 yg5Var = videoLargeListState2.r;
        if (yg5Var != null) {
            q5b0.b bVar = new q5b0.b(yg5Var, floatValue);
            com.vk.libvideo.api.ad.a c2 = gi5Var.c();
            je0 b3 = gi5Var.b();
            kzr0 kzr0Var = videoLargeListState2.y;
            q5b0Var = new q5b0(bVar, (c2 == null || b3 == null || kzr0Var == null) ? null : new q5b0.a(b3, c2, kzr0Var, gi5Var.i()));
        } else {
            q5b0Var = null;
        }
        com.vk.libvideo.api.ad.a c3 = gi5Var.c();
        if (c3 != null) {
            a.AbstractC1195a abstractC1195a2 = c3 instanceof a.AbstractC1195a ? (a.AbstractC1195a) c3 : null;
            if (abstractC1195a2 != null) {
                if (abstractC1195a2.c() || abstractC1195a2.a().a()) {
                    abstractC1195a2 = null;
                }
                if (abstractC1195a2 != null && (a = abstractC1195a2.a()) != null && (b = a.b()) != null) {
                    sh0Var = hg0.a(b);
                    return new xrs0(compositeId, videoCardViewState, q5b0Var, new dg0(sh0Var), !gi5Var.s() ? new kjz(null) : null);
                }
            }
        }
        sh0Var = null;
        return new xrs0(compositeId, videoCardViewState, q5b0Var, new dg0(sh0Var), !gi5Var.s() ? new kjz(null) : null);
    }
}
