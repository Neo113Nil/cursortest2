package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.ybsdk.core.design.design.DesignTextStyle;
import com.ybsdk.core.stories.entities.HorizontalAlignmentEntity;
import com.ybsdk.core.stories.entities.StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode;
import com.ybsdk.core.stories.ui.CommunicationFullscreenTitlePaddingMode;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.videoplayer.api.VideoPlayer$RepeatMode;
import com.ybsdk.widgets.common.ImageScaleTypeEntity;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView$State$Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class dsc {
    public static final int a(HorizontalAlignmentEntity horizontalAlignmentEntity) {
        int i = horizontalAlignmentEntity == null ? -1 : csc.b[horizontalAlignmentEntity.ordinal()];
        if (i == -1 || i == 1) {
            return 3;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 5;
        }
        w511.b();
        return 0;
    }

    public static vrc b(vou0 vou0Var, Context context, CommunicationFullscreenTitlePaddingMode communicationFullscreenTitlePaddingMode, trc trcVar, int i) {
        rbv rbvVar;
        DesignTextStyle designTextStyle;
        ArrayList arrayList;
        VideoPlayer$RepeatMode videoPlayer$RepeatMode;
        StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode storyItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode;
        VideoPlayer$RepeatMode videoPlayer$RepeatMode2;
        fxy0 fxy0Var;
        tay tayVar;
        vz6 vz6Var;
        ok31 ok31Var = ok31.c;
        boolean z = (i & 4) == 0;
        trc trcVar2 = (i & 8) != 0 ? null : trcVar;
        if ((i & 16) != 0) {
            ok31Var = null;
        }
        mrc mrcVar = vou0Var.e;
        mrc mrcVar2 = vou0Var.d;
        zz6 zz6Var = vou0Var.j;
        uou0 uou0Var = vou0Var.l;
        CommunicationFullScreenView$State$Type communicationFullScreenView$State$Type = uou0Var == null ? CommunicationFullScreenView$State$Type.GRAPHIC : CommunicationFullScreenView$State$Type.VIDEO;
        Text.Constant constant = mrcVar2 != null ? mrcVar2.a : null;
        ColorModel colorModel = mrcVar2 != null ? mrcVar2.c : null;
        DesignTextStyle designTextStyle2 = mrcVar2 != null ? mrcVar2.d : null;
        Text.Constant constant2 = mrcVar != null ? mrcVar.a : null;
        ColorModel colorModel2 = mrcVar != null ? mrcVar.c : null;
        DesignTextStyle designTextStyle3 = mrcVar != null ? mrcVar.d : null;
        rbv rbvVar2 = vou0Var.h;
        List list = vou0Var.i;
        if (list != null) {
            List list2 = list;
            rbvVar = rbvVar2;
            designTextStyle = designTextStyle3;
            arrayList = new ArrayList(tcc.n(list2, 10));
            for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
                it6 it6Var = (it6) it.next();
                arrayList.add(new krc(it6Var.e, it6Var.a, it6Var.b, it6Var.c, it6Var.d, true));
            }
        } else {
            rbvVar = rbvVar2;
            designTextStyle = designTextStyle3;
            arrayList = null;
        }
        int a = a(mrcVar2 != null ? mrcVar2.b : null);
        int a2 = a(mrcVar != null ? mrcVar.b : null);
        ColorModel colorModel3 = vou0Var.f;
        List list3 = vou0Var.g;
        YbButtonViewGroup.b bVar = new YbButtonViewGroup.b(null, zz6Var != null ? c(zz6Var.a, true, ok31Var) : null, (zz6Var == null || (vz6Var = zz6Var.b) == null) ? null : c(vz6Var, false, ok31Var), (zz6Var == null || (tayVar = zz6Var.c) == null) ? null : new YbButtonViewGroup.a(tayVar.a, tayVar.b, tayVar.c), 1);
        int a3 = rje.a(context, ung0.ybsdk_transparentBackground);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        int paddingDp = communicationFullscreenTitlePaddingMode.getPaddingDp();
        ImageScaleTypeEntity imageScaleTypeEntity = vou0Var.m;
        String str = (uou0Var == null || (fxy0Var = uou0Var.a) == null) ? null : (String) fxy0Var.a(context);
        if (uou0Var == null || (storyItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode = uou0Var.b) == null) {
            videoPlayer$RepeatMode = null;
        } else {
            int i2 = csc.a[storyItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode.ordinal()];
            if (i2 == 1) {
                videoPlayer$RepeatMode2 = VideoPlayer$RepeatMode.OFF;
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                videoPlayer$RepeatMode2 = VideoPlayer$RepeatMode.ONE;
            }
            videoPlayer$RepeatMode = videoPlayer$RepeatMode2;
        }
        oe1 oe1Var = vou0Var.n;
        return new vrc(communicationFullScreenView$State$Type, constant, colorModel, designTextStyle2, constant2, colorModel2, designTextStyle, Integer.valueOf(a3), null, rbvVar, arrayList, bVar, null, a, a2, colorModel3, list3, scaleType, paddingDp, z, imageScaleTypeEntity, str, videoPlayer$RepeatMode, null, trcVar2, oe1Var != null ? new p60(oe1Var.a, oe1Var.b, oe1Var.c, oe1Var.d, oe1Var.e) : null, -239064832, 0);
    }

    public static final YbButtonView.a c(vz6 vz6Var, boolean z, qk31 qk31Var) {
        Text.Constant constant = vz6Var.a;
        ColorModel colorModel = vz6Var.b;
        if (colorModel == null) {
            colorModel = new ColorModel.Attr(z ? ung0.ybColor_textIcon_primaryInverted : ung0.ybColor_textIcon_primary);
        }
        ColorModel colorModel2 = colorModel;
        ColorModel colorModel3 = vz6Var.d;
        if (colorModel3 == null) {
            colorModel3 = new ColorModel.Attr(z ? ung0.ybColor_button_primaryNormal : ung0.ybColor_button_secondaryNormal);
        }
        return new YbButtonView.a(constant, null, null, colorModel3, colorModel2, null, null, false, false, qk31Var, 2022);
    }
}
