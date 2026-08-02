package xsna;

import android.content.Context;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import java.text.DecimalFormat;
import xsna.mno0;
import xsna.rmw;
import xsna.x8s;

/* compiled from: SimilarVideoUiState.kt */
/* loaded from: classes7.dex */
public final class poj0 {
    public static final ooj0 a(AboutVideoItem.SimilarVideoRedesign similarVideoRedesign, Context context, int i, boolean z) {
        String str;
        String c;
        DonutVideoUiModel.DescriptionChip descriptionChip;
        noj0 noj0Var = similarVideoRedesign.b;
        VideoFile videoFile = noj0Var.a;
        ImageSize Cb = videoFile.getImage().Cb(i, true, false);
        VideoMetaViewState.c cVar = null;
        if (Cb == null || (str = Cb.d.d) == null) {
            ImageSize imageSize = (ImageSize) j5g.a0(videoFile.getImage().b);
            str = imageSize != null ? imageSize.d.d : null;
        }
        AboutVideoItem.SimilarVideoRedesign.Style style = AboutVideoItem.SimilarVideoRedesign.Style.NORMAL;
        mno0.i iVar = new mno0.i(videoFile.getTitle());
        rmw.h hVar = str != null ? new rmw.h(str) : null;
        mno0.i iVar2 = new mno0.i(z8s.a(videoFile.getDuration()));
        DecimalFormat decimalFormat = z8s.a;
        mno0.i iVar3 = new mno0.i(z8s.e(videoFile.L8(), context).toString());
        c = z8s.c(context, videoFile.b0() * 1000, x8s.a.g, true);
        mno0.i iVar4 = new mno0.i(c.toString());
        String P = videoFile.P();
        doj0 doj0Var = new doj0(P != null ? new mno0.i(P) : null, videoFile.M0(), videoFile.Y().b);
        DonutVideoUiModel donutVideoUiModel = noj0Var.d;
        if (donutVideoUiModel != null && (descriptionChip = donutVideoUiModel.c) != null) {
            if (!z) {
                descriptionChip = null;
            }
            if (descriptionChip != null) {
                cVar = new VideoMetaViewState.c(new mno0.i(descriptionChip.b), descriptionChip.d);
            }
        }
        return new ooj0(new foj0(iVar, hVar, iVar2, iVar3, iVar4, doj0Var, cVar), videoFile);
    }
}
