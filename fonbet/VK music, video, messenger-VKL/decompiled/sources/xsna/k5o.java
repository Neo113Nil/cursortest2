package xsna;

import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;

/* compiled from: DonutVideoUiDtoExtensions.kt */
/* loaded from: classes18.dex */
public final class k5o {
    public static final azn a(DonutVideoUiModel donutVideoUiModel) {
        DonutVideoUiModel.DescriptionChip descriptionChip = donutVideoUiModel.c;
        if (descriptionChip == null) {
            return null;
        }
        return new azn(descriptionChip.b, descriptionChip.c, descriptionChip.d, descriptionChip.e);
    }
}
