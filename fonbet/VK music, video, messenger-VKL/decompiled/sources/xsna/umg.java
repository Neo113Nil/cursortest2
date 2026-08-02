package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class umg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ umg(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                if (((BaseBoolIntDto) obj) == BaseBoolIntDto.YES) {
                    y9l0.a(new v1l0(String.valueOf(this.c)));
                }
                break;
            default:
                lt40.i((tgi0) obj, this.c);
                break;
        }
        return s3q0.a;
    }
}
