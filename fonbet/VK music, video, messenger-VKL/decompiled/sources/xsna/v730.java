package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.money.MoneyTransfer;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: moneyTransferFragmentHelper.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class v730 extends FunctionReferenceImpl implements wzs<Boolean, VKList<MoneyTransfer>, a830> {
    public static final v730 b = new v730(2, a830.class, "<init>", "<init>(ZLcom/vk/dto/common/data/VKList;)V", 0);

    @Override // xsna.wzs
    public final a830 invoke(Boolean bool, VKList<MoneyTransfer> vKList) {
        return new a830(vKList, bool.booleanValue());
    }
}
