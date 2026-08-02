package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.feed.tool.view.newsfeed.attach.PrimaryAttachmentLayout;
import com.vk.feed.tool.view.newsfeed.attach.PrimaryVideoWrapperView;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cvj0;
import xsna.rtj0;
import xsna.tps0;
import xsna.uad0;

/* compiled from: FeedPrimaryAttachmentHoldersFactory.kt */
/* loaded from: classes4.dex */
public final class t2r {
    public final h170 a;

    public t2r(boolean z, h170 h170Var) {
        this.a = h170Var;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    public final qi6<?> a(ViewGroup viewGroup, int i, cr4 cr4Var, d5r d5rVar, kdg0 kdg0Var) {
        if (i == 215) {
            return new v9d0(viewGroup);
        }
        if (i == 293) {
            return new b7d0(viewGroup, (tvb0) d5rVar.c.getValue());
        }
        if (i == 352) {
            return new x9d0(tf3.b(viewGroup, R.layout.holder_primary_mini_app_photo, viewGroup, false));
        }
        if (i == 219) {
            viewGroup.getContext();
            return new d7d0(viewGroup, cr4Var);
        }
        if (i == 220) {
            int i2 = s9d0.F;
            View b = tf3.b(viewGroup, R.layout.holder_primary_video, viewGroup, false);
            PrimaryVideoWrapperView primaryVideoWrapperView = (PrimaryVideoWrapperView) b.findViewById(R.id.primary_video_wrap);
            primaryVideoWrapperView.setBackground(m33.a(dhr0.M() ? R.drawable.video_simple_holder_dark_bg_2dp : R.drawable.video_simple_holder_bg_2dp, viewGroup.getContext()));
            gcx gcxVar = new gcx(viewGroup);
            primaryVideoWrapperView.setUpdateRatioCallback(new com.vk.movika.tools.controls.seekbar.p(gcxVar, 10));
            primaryVideoWrapperView.addView(gcxVar.itemView, new ViewGroup.LayoutParams(-1, -1));
            return new s9d0(b, gcxVar);
        }
        if (i == 257) {
            int i3 = uad0.M;
            PrimaryAttachmentLayout primaryAttachmentLayout = (PrimaryAttachmentLayout) tf3.b(viewGroup, R.layout.holder_primary_video, viewGroup, false);
            PrimaryVideoWrapperView primaryVideoWrapperView2 = (PrimaryVideoWrapperView) primaryAttachmentLayout.findViewById(R.id.primary_video_wrap);
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            hny a = uad0.a.a(R.drawable.vk_icon_mute_cross_16, 44, context);
            Context context2 = e43.a;
            if (context2 == null) {
                context2 = null;
            }
            hny a2 = uad0.a.a(R.drawable.vk_icon_volume_16, 44, context2);
            Context context3 = e43.a;
            if (context3 == null) {
                context3 = null;
            }
            hny a3 = uad0.a.a(R.drawable.vk_icon_subtitles_12, 120, context3);
            Context context4 = e43.a;
            if (context4 == null) {
                context4 = null;
            }
            hny a4 = uad0.a.a(R.drawable.vk_icon_subtitles_12, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, context4);
            Context context5 = e43.a;
            if (context5 == null) {
                context5 = null;
            }
            hny a5 = uad0.a.a(R.drawable.vk_icon_check_alt_12, 92, context5);
            Context context6 = e43.a;
            if (context6 == null) {
                context6 = null;
            }
            u3s0 u3s0Var = new u3s0(viewGroup, new tps0.a(-1, -2, null, 0, 0, null, 288), new sps0(new wqj(null, a, a2, a3, a4, a5, uad0.a.a(R.drawable.vk_icon_clock_12, 84, context6), 32281), null, false, PsExtractor.VIDEO_STREAM_MASK), 8);
            primaryVideoWrapperView2.setUpdateRatioCallback(new th3(u3s0Var, 8));
            primaryVideoWrapperView2.addView(u3s0Var.itemView, new ViewGroup.LayoutParams(-1, -1));
            return new uad0(primaryAttachmentLayout, viewGroup, u3s0Var);
        }
        if (i == 258) {
            int i4 = wad0.F;
            PrimaryAttachmentLayout primaryAttachmentLayout2 = (PrimaryAttachmentLayout) tf3.b(viewGroup, R.layout.holder_primary_video, viewGroup, false);
            PrimaryVideoWrapperView primaryVideoWrapperView3 = (PrimaryVideoWrapperView) primaryAttachmentLayout2.findViewById(R.id.primary_video_wrap);
            com.vk.newsfeed.common.recycler.holders.i iVar = new com.vk.newsfeed.common.recycler.holders.i(primaryAttachmentLayout2, true, new tps0.a(-1, -1, null, 0, 0, null, 288));
            primaryVideoWrapperView3.setUpdateRatioCallback(new aza(iVar, 9));
            primaryVideoWrapperView3.addView(iVar.itemView, new ViewGroup.LayoutParams(-1, -1));
            return new wad0(primaryAttachmentLayout2, iVar);
        }
        if (i == 344) {
            return new v6d0(viewGroup);
        }
        if (i == 345) {
            return new x6d0(viewGroup);
        }
        h170 h170Var = this.a;
        switch (i) {
            case 203:
                int i5 = cvj0.n0;
                return new iad0(new cvj0(cvj0.a.a(viewGroup), true, h170Var, null));
            case 204:
                return new pad0(new hcg0(viewGroup, kdg0Var, h170Var));
            case 205:
                return new qad0(new ncg0(viewGroup));
            case 206:
                int i6 = rtj0.J;
                return new m9d0(rtj0.a.a(viewGroup));
            case 207:
                int i7 = l9d0.F;
                View b2 = tf3.b(viewGroup, R.layout.holder_primary_gif, viewGroup, false);
                ViewGroup viewGroup2 = (ViewGroup) b2.findViewById(R.id.wrapper);
                pp2 pp2Var = new pp2(viewGroup2);
                viewGroup2.addView(pp2Var.itemView, -1, -2);
                return new l9d0(b2, pp2Var);
            case INVALID_BID_PAYLOAD_VALUE:
                int i8 = vad0.G;
                PrimaryAttachmentLayout primaryAttachmentLayout3 = (PrimaryAttachmentLayout) tf3.b(viewGroup, R.layout.holder_primary_video, viewGroup, false);
                PrimaryVideoWrapperView primaryVideoWrapperView4 = (PrimaryVideoWrapperView) primaryAttachmentLayout3.findViewById(R.id.primary_video_wrap);
                com.vk.newsfeed.common.recycler.holders.i iVar2 = new com.vk.newsfeed.common.recycler.holders.i(primaryAttachmentLayout3, true, new tps0.a(-1, -1, null, 0, 0, null, 288));
                primaryVideoWrapperView4.setUpdateRatioCallback(new oac(iVar2, 12));
                primaryVideoWrapperView4.addView(iVar2.itemView, new ViewGroup.LayoutParams(-1, -1));
                return new vad0(primaryAttachmentLayout3, iVar2);
            default:
                switch (i) {
                    case AD_NOT_LOADED_VALUE:
                        viewGroup.getContext();
                        return new had0(viewGroup);
                    case 211:
                        return new g7d0(viewGroup, cr4Var);
                    case PLACEMENT_SLEEP_VALUE:
                        return new w9d0(new tuj0(viewGroup));
                    case INVALID_ADUNIT_BID_PAYLOAD_VALUE:
                        return new n9d0(new ncu(viewGroup));
                    default:
                        return null;
                }
        }
    }
}
