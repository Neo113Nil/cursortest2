package xsna;

import com.vk.voip.feedback_gestures.GestureFeedback;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FeatureOnboardingCollector.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class vuq extends FunctionReferenceImpl implements izs<String, Boolean> {
    @Override // xsna.izs
    public final Boolean invoke(String str) {
        String str2 = str;
        ((GestureFeedback.a) this.receiver).getClass();
        GestureFeedback[] values = GestureFeedback.values();
        int length = values.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (epx.f(values[i].h(), str2)) {
                z = true;
                break;
            }
            i++;
        }
        return Boolean.valueOf(z);
    }
}
