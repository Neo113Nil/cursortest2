package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkImage;
import com.vk.im.engine.models.LongPollType;
import com.vk.stat.model.builders.aggregate.AggregateEventBuilder;
import com.vk.stat.model.builders.aggregate.AggregateEventKey;
import java.util.Arrays;
import kotlin.Pair;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.gl.tf.Tensorflow;
import xsna.mip0;
import xsna.mwm;
import xsna.q630;
import xsna.uwa;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class twa implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ twa(byte b, int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = 0;
        switch (this.b) {
            case 0:
                VkImage vkImage = (VkImage) obj;
                VkCell.f fVar = (VkCell.f) obj2;
                uwa.a aVar = fVar instanceof uwa.a ? (uwa.a) fVar : null;
                if (aVar != null) {
                    Integer num = aVar.a;
                    if (num != null) {
                        vkImage.setImageResource(num.intValue());
                    } else {
                        f4m.j(vkImage);
                    }
                }
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(570417342, intValue, -1, "com.vk.core.compose.component.ComposableSingletons$VkAccentTabRowKt.lambda$570417342.<anonymous> (VkAccentTabRow.kt:660)");
                    }
                    Object x = aVar2.x();
                    if (x == a.C0011a.a) {
                        x = qq.h(1, aVar2);
                    }
                    wh50 wh50Var = (wh50) x;
                    u6u0.c(((Number) wh50Var.getValue()).intValue(), kai.c(1028025966, new ini(wh50Var, i), aVar2), txj0.v(q630.a.a, 160), 0L, false, null, null, null, false, aVar2, Tensorflow.FRAME_WIDTH, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                ixv ixvVar = (ixv) obj;
                LongPollType longPollType = mwm.b.$EnumSwitchMapping$0[((ob80) obj2).b.ordinal()] == 1 ? LongPollType.CHANNELS : LongPollType.MESSAGES;
                return new Pair(ixvVar.a(longPollType), longPollType);
            case 3:
                int[] iArr = (int[]) obj;
                int intValue2 = ((Integer) obj2).intValue();
                jw5.o(0, 0, 6, iArr);
                return iArr.length != intValue2 ? Arrays.copyOf(iArr, intValue2) : iArr;
            case 4:
                ((Integer) obj2).getClass();
                cc70.b(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 5:
                hfz hfzVar = (hfz) obj;
                hfz hfzVar2 = (hfz) obj2;
                return Boolean.valueOf(((hfzVar instanceof a7i) && (hfzVar2 instanceof a7i)) ? ((a7i) hfzVar).za((a7i) hfzVar2) : hfzVar.equals(hfzVar2));
            case 6:
                return Integer.valueOf(((v5s) obj2).a);
            case 7:
                AggregateEventKey aggregateEventKey = AggregateEventKey.NETWORK_TRAFFIC;
                pip0.c(new AggregateEventBuilder(aggregateEventKey), (mip0.b) obj, true);
                pip0.c(new AggregateEventBuilder(aggregateEventKey), (mip0.b) obj2, false);
                return s3q0.a;
            default:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar3.K(1733426172);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1733426172, intValue3, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:249)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.i1;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var;
        }
    }

    public /* synthetic */ twa(int i) {
        this.b = 4;
    }
}
