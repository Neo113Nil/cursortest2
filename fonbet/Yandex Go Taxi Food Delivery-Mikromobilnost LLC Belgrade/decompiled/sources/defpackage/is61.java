package defpackage;

import com.yandex.messaging.internal.calls.feedback.CallFeedbackTelemostEntity;
import java.security.AlgorithmConstraints;
import java.security.AlgorithmParameters;
import java.security.Key;
import java.util.Set;

/* loaded from: classes4.dex */
public final class is61 implements AlgorithmConstraints {
    public final String[] a;

    public is61(String[] strArr) {
        if (strArr != null) {
            this.a = (String[]) strArr.clone();
        } else {
            this.a = null;
        }
    }

    @Override // java.security.AlgorithmConstraints
    public final boolean permits(Set set, String str, AlgorithmParameters algorithmParameters) {
        String str2;
        if (str == null || str.length() == 0) {
            str2 = "No algorithm name specified";
        } else {
            if (set != null && !set.isEmpty()) {
                String[] strArr = this.a;
                if (strArr != null && strArr.length != 0) {
                    int indexOf = str.indexOf(CallFeedbackTelemostEntity.PLATFORM);
                    if (indexOf > 0) {
                        str = str.substring(0, indexOf);
                    }
                    for (String str3 : strArr) {
                        if (str.equalsIgnoreCase(str3)) {
                            return true;
                        }
                    }
                }
                return false;
            }
            str2 = "No cryptographic primitive specified";
        }
        ny61.g(str2);
        return false;
    }

    @Override // java.security.AlgorithmConstraints
    public final boolean permits(Set set, String str, Key key, AlgorithmParameters algorithmParameters) {
        if (str != null && str.length() != 0) {
            return permits(set, str, algorithmParameters);
        }
        ny61.g("No algorithm name specified");
        return false;
    }

    @Override // java.security.AlgorithmConstraints
    public final boolean permits(Set set, Key key) {
        return true;
    }
}
