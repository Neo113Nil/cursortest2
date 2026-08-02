package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class m2f implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ jai c;

    public /* synthetic */ m2f(int i, jai jaiVar) {
        this.b = i;
        this.c = jaiVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1364227849, intValue, -1, "com.vk.clips.viewer.impl.compose.dialog.content.ClipsScreenSpinnerView.Theme.<anonymous> (ClipsScreenSpinnerView.kt:30)");
                    }
                    if (cq.i(0, aVar, this.c)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1834436868, intValue, -1, "com.vk.libvideo.tool.compose.textwithsuffix.measureSuffixContent.<anonymous> (TextWithSuffixLayout.kt:106)");
                    }
                    if (cq.i(0, aVar, this.c)) {
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
