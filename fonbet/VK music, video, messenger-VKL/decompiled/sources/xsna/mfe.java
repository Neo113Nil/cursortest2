package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class mfe implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wzs c;

    public /* synthetic */ mfe(int i, wzs wzsVar) {
        this.b = i;
        this.c = wzsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1938391209, intValue, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.ClipsHintWrapperImpl.HintWrapper.<anonymous> (ClipsHintWrapperImpl.kt:41)");
                    }
                    this.c.invoke(aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                Integer num = (Integer) obj;
                num.intValue();
                Short sh = (Short) obj2;
                sh.shortValue();
                this.c.invoke(num, sh);
                break;
        }
        return s3q0.a;
    }
}
