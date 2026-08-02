package xsna;

import com.vk.inappreview.InAppReviewConditionKey;
import java.util.Map;

/* compiled from: SendMessagesConditionChecker.kt */
/* loaded from: classes2.dex */
public final class zhi0 implements zqp0 {
    public int a;

    @Override // xsna.zqp0
    public final boolean a(Map<String, ? extends Object> map) {
        if (!map.containsKey(InAppReviewConditionKey.KEY_CHECK_COUNTER)) {
            int i = this.a;
            if (i < 15) {
                this.a = i + 1;
            }
        } else if (this.a >= 15) {
            return true;
        }
        return false;
    }
}
