package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class vcj0 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ jai c;

    public /* synthetic */ vcj0(int i, jai jaiVar) {
        this.c = jaiVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
        Integer num = (Integer) obj2;
        switch (this.b) {
            case 0:
                num.getClass();
                bdj0.a(ne7.I(55), aVar, this.c);
                break;
            default:
                int intValue = num.intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-93142972, intValue, -1, "com.vk.video.ui.share.impl.compose.VideoComposeThemeProvider.Theme.<anonymous> (VideoComposeThemeProvider.kt:18)");
                    }
                    rvi.a(c490.a.b(null), kai.c(-1616723068, new esk(this.c, 1, (byte) 0), aVar), aVar, 56);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }
}
