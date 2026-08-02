package defpackage;

import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.internal.domain.entities.IntroductionItemEntity;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView$State$Type;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class fw3 implements ev31 {
    public static final int a = kp50.r(45);
    public static final int b = kp50.r(40);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ev31
    public final Object q(Object obj) {
        aw3 aw3Var = (aw3) obj;
        ColorModel.Attr attr = new ColorModel.Attr(ung0.ybColor_fill_default_50);
        CommunicationFullScreenView$State$Type communicationFullScreenView$State$Type = CommunicationFullScreenView$State$Type.DESCRIPTION;
        Text.Constant i = g8e.i(Text.Companion, aw3Var.b);
        ThemedImageUrlEntity themedImageUrlEntity = aw3Var.a;
        Text.Resource resource = null;
        rbv f = themedImageUrlEntity != null ? job1.f(themedImageUrlEntity, new at3(2)) : null;
        int i2 = a;
        int i3 = b;
        urc urcVar = new urc(i2, i3, i2, i3);
        List<IntroductionItemEntity> list = aw3Var.d;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (IntroductionItemEntity introductionItemEntity : list) {
            ThemedImageUrlEntity image = introductionItemEntity.getImage();
            arrayList.add(new krc(image != null ? job1.f(image, new at3(3)) : null, g8e.i(Text.Companion, introductionItemEntity.getText()), resource));
        }
        YbButtonViewGroup.Orientation orientation = YbButtonViewGroup.Orientation.HORIZONTAL;
        ActionButtonEntity actionButtonEntity = aw3Var.c;
        return new ew3(attr, new vrc(communicationFullScreenView$State$Type, i, null, null, null, null, null, null, attr, f, arrayList, new YbButtonViewGroup.b(orientation, actionButtonEntity != null ? new YbButtonView.a(actionButtonEntity.getText(), null, null, null, null, null, null, false, aw3Var.i, null, 3070) : null, null, null, 12), urcVar, 0, 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, false, null, null, null, null, null, null, -14084, 3));
    }
}
