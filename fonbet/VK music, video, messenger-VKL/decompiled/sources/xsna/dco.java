package xsna;

import com.vk.catalog.mvi.block.video.impl.downloaded.DownloadedSliderView$DownloadedSliderState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.donut.video.model.presentation.cardsize.DonutVideoCardSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.libvideo.autoplay.b;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cco;
import xsna.pdt0;
import xsna.tlo0;

/* compiled from: DownloadedVideoViewState.kt */
/* loaded from: classes16.dex */
public final class dco {

    /* compiled from: DownloadedVideoViewState.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogBlockVariant.values().length];
            try {
                iArr[CatalogBlockVariant.DownloadedVideoLargeSlider.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final cco a(czs0 czs0Var, DownloadedSliderView$DownloadedSliderState downloadedSliderView$DownloadedSliderState, l5o l5oVar, boolean z, boolean z2) {
        l8s0 l8s0Var;
        tlo0 hVar;
        VideoRestriction videoRestriction;
        pdt0 bVar;
        pdt0 pdt0Var;
        DonutVideoUiModel.DescriptionChip descriptionChip;
        DonutVideoUiModel.PreviewBadge previewBadge;
        VideoFileOld videoFileOld = czs0Var.a;
        float f = Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE;
        l8s0 l8s0Var2 = new l8s0(f, 257, f, 172);
        float f2 = 232;
        l8s0 l8s0Var3 = new l8s0(f2, (float) 174.5d, f2, (float) 130.5d);
        float f3 = 154;
        l8s0 l8s0Var4 = new l8s0(f3, 146, f3, 84);
        if (a.$EnumSwitchMapping$0[downloadedSliderView$DownloadedSliderState.c.ordinal()] == 1) {
            if (!z) {
                l8s0Var = l8s0Var3;
            }
            l8s0Var = l8s0Var2;
        } else {
            if (!z) {
                l8s0Var = l8s0Var4;
            }
            l8s0Var = l8s0Var2;
        }
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        yg5 e = b.C1208b.a().e(videoFileOld, null);
        float position = ((e.isPlaying() || e.getPosition() > 0) ? e.getPosition() : com.vk.libvideo.autoplay.j.b(e.A())) / e.getDuration();
        DonutVideoUiModel a2 = l5oVar.a(nkt0.a(videoFileOld), z ? DonutVideoCardSource.LARGE_CARD : DonutVideoCardSource.SMALL_CARD);
        String a1 = videoFileOld.a1();
        String str = videoFileOld.l;
        String str2 = videoFileOld.p0;
        String str3 = str2 == null ? "" : str2;
        String str4 = videoFileOld.q0;
        Image image = videoFileOld.I0;
        mno0 g = kpt0.g(videoFileOld);
        String str5 = videoFileOld.o;
        String str6 = (str5 == null || str5.length() == 0) ? "" : videoFileOld.o;
        if (videoFileOld.z0()) {
            hVar = tq.h(tlo0.Companion, R.string.video_live_upcoming);
        } else if (videoFileOld.q0()) {
            hVar = tq.h(tlo0.Companion, R.string.video_live);
        } else if (videoFileOld.e > 0 || (str6.length() == 0 && videoFileOld.e == 0)) {
            String a3 = kpt0.a(videoFileOld.e);
            if (str6.length() == 0) {
                hVar = oq.d(tlo0.Companion, a3);
            } else {
                tlo0.Companion.getClass();
                hVar = new tlo0.h(str6 + " · " + a3);
            }
        } else {
            hVar = oq.d(tlo0.Companion, str6);
        }
        tlo0 tlo0Var = hVar;
        cco.a aVar = (a2 == null || (previewBadge = a2.b) == null) ? null : new cco.a(previewBadge);
        cco.b bVar2 = (a2 == null || (descriptionChip = a2.c) == null) ? null : new cco.b(descriptionChip);
        VideoRestriction videoRestriction2 = videoFileOld.O0;
        if ((videoRestriction2 == null || !e5o.b(videoRestriction2) || !z2) && (videoRestriction = videoFileOld.O0) != null) {
            String str7 = videoRestriction.b;
            RestrictionButton restrictionButton = videoRestriction.e;
            boolean z3 = videoRestriction.f;
            ImageSize Cb = videoRestriction.g.Cb(60, false, false);
            String str8 = Cb != null ? Cb.d.d : null;
            boolean z4 = videoRestriction.d;
            if (z4 && z3) {
                String str9 = videoRestriction.b;
                RestrictionButton restrictionButton2 = videoRestriction.e;
                gdt0 a4 = qdt0.a(videoRestriction);
                String str10 = restrictionButton != null ? restrictionButton.b : null;
                pdt0Var = new pdt0.a(str9, str8, restrictionButton2, a4, str10 == null ? "" : str10);
            } else {
                String str11 = str8;
                if (!z4 && !z3) {
                    bVar = new pdt0.b(str7, str11, restrictionButton, qdt0.a(videoRestriction));
                } else if (!z4 && z3) {
                    bVar = new pdt0.b(str7, str11, restrictionButton, qdt0.a(videoRestriction));
                }
                pdt0Var = bVar;
            }
            return new cco(a1, l8s0Var, str, str3, str4, image, position, g, tlo0Var, bVar2, aVar, pdt0Var, videoFileOld instanceof MusicVideoFile, videoFileOld.o0.b, czs0Var.b.c);
        }
        pdt0Var = null;
        return new cco(a1, l8s0Var, str, str3, str4, image, position, g, tlo0Var, bVar2, aVar, pdt0Var, videoFileOld instanceof MusicVideoFile, videoFileOld.o0.b, czs0Var.b.c);
    }
}
