package xsna;

import android.content.Intent;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class fhk0 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fhk0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                jhk0 jhk0Var = (jhk0) obj4;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(q630Var) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1435070331, intValue, -1, "com.vk.design.demo.presentation.screens.SpacingAndSeparatorScreenContent.pages.<anonymous> (SpacingAndSeparatorScreenContent.kt:42)");
                    }
                    jhk0Var.f(q630Var, aVar, intValue & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                int i2 = StoryMediaPickerFragment.d0;
                ((StoryMediaPickerFragment) obj4).onActivityResult(((Integer) obj).intValue(), ((Integer) obj2).intValue(), (Intent) obj3);
                break;
        }
        return s3q0.a;
    }
}
