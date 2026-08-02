package xsna;

import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MusicRecentQueryProvider.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class q250 extends FunctionReferenceImpl implements wzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q250(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                hda hdaVar = (hda) obj;
                ((dja) this.receiver).b(hdaVar, (List) obj2);
                return hdaVar;
            default:
                int intValue = ((Number) obj).intValue();
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                nts0 nts0Var = (nts0) this.receiver;
                float f = nts0.D;
                nts0Var.e(intValue, booleanValue);
                return s3q0.a;
        }
    }
}
