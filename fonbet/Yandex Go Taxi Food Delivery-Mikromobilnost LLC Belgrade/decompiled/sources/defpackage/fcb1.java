package defpackage;

import android.os.Bundle;
import com.yandex.go.sharing_personal_goals.SharingPersonalGoalsPrimaryButtonStyle;
import com.yandex.messaging.ExistingChatRequest;

/* loaded from: classes13.dex */
public abstract class fcb1 {
    public static Bundle a(g720 g720Var, ExistingChatRequest existingChatRequest) {
        Bundle bundle = new Bundle(2);
        bundle.putParcelable("Chat.REQUEST_ID", existingChatRequest);
        bundle.putString("Chat.OPEN_SOURCE", g720Var.c());
        return bundle;
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public static final lrr0 c(crr0 crr0Var) {
        SharingPersonalGoalsPrimaryButtonStyle sharingPersonalGoalsPrimaryButtonStyle;
        String obj = crr0Var.a.toString();
        brr0 brr0Var = crr0Var.b;
        if ((brr0Var instanceof yqr0) || (brr0Var instanceof arr0)) {
            sharingPersonalGoalsPrimaryButtonStyle = SharingPersonalGoalsPrimaryButtonStyle.MAIN;
        } else {
            if (!brr0Var.equals(zqr0.a)) {
                w511.b();
                return null;
            }
            sharingPersonalGoalsPrimaryButtonStyle = SharingPersonalGoalsPrimaryButtonStyle.MINOR;
        }
        return new lrr0(obj, sharingPersonalGoalsPrimaryButtonStyle, brr0Var);
    }
}
