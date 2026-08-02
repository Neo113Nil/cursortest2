package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class jq5 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ UserId c;

    public /* synthetic */ jq5(UserId userId) {
        this.c = userId;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Integer num = (Integer) obj;
        switch (this.b) {
            case 0:
                int intValue = num.intValue();
                StringBuilder sb = new StringBuilder();
                sb.append(this.c);
                sb.append('_');
                sb.append(intValue);
                return sb.toString();
            default:
                int intValue2 = num.intValue();
                int i = 1;
                if (intValue2 != 1) {
                    if (intValue2 == 2) {
                        i = 3;
                    } else if (intValue2 != 4) {
                        i = 0;
                    }
                }
                i0q0.j(new xw2(this.c, i, 1));
                return s3q0.a;
        }
    }
}
