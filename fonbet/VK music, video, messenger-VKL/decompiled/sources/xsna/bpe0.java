package xsna;

import com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature.QualityChooserFeatureState;
import com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature.e;
import com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.QualityChooserViewState;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: QualityChooserReducer.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class bpe0 extends FunctionReferenceImpl implements izs<QualityChooserFeatureState, QualityChooserViewState.b> {
    @Override // xsna.izs
    public final QualityChooserViewState.b invoke(QualityChooserFeatureState qualityChooserFeatureState) {
        QualityChooserViewState.QualityOption.QualityOptionType qualityOptionType;
        QualityChooserFeatureState qualityChooserFeatureState2 = qualityChooserFeatureState;
        ((com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature.e) this.receiver).getClass();
        if (!(qualityChooserFeatureState2 instanceof QualityChooserFeatureState.a)) {
            throw new NoWhenBranchMatchedException();
        }
        List<QualityChooserFeatureState.QualityOption> list = ((QualityChooserFeatureState.a) qualityChooserFeatureState2).b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (QualityChooserFeatureState.QualityOption qualityOption : list) {
            int i = e.a.$EnumSwitchMapping$0[qualityOption.a.ordinal()];
            if (i == 1) {
                qualityOptionType = QualityChooserViewState.QualityOption.QualityOptionType.HIGH;
            } else if (i == 2) {
                qualityOptionType = QualityChooserViewState.QualityOption.QualityOptionType.AVG;
            } else if (i == 3) {
                qualityOptionType = QualityChooserViewState.QualityOption.QualityOptionType.LOW;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                qualityOptionType = QualityChooserViewState.QualityOption.QualityOptionType.AUDIO_ONLY;
            }
            arrayList.add(new QualityChooserViewState.QualityOption(qualityOptionType, qualityOption.b, qualityOption.c));
        }
        return new QualityChooserViewState.b.a(arrayList);
    }
}
