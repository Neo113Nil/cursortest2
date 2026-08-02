package xsna;

import android.view.View;
import com.vk.dto.user.UserProfile;
import com.vk.profile.core.content.profilelist.UserMessagesLauncher;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class agq0 implements izs {
    public final /* synthetic */ cgq0 b;
    public final /* synthetic */ UserProfile c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ View e;

    public /* synthetic */ agq0(cgq0 cgq0Var, UserProfile userProfile, boolean z, View view) {
        this.b = cgq0Var;
        this.c = userProfile;
        this.d = z;
        this.e = view;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        UserProfile userProfile = this.c;
        int i = userProfile.v;
        int i2 = 2;
        if (i != 3) {
            if (i == 2) {
                i2 = 3;
            } else if (i == 1) {
                i2 = 0;
            } else {
                i2 = -1;
                if (i == -1 || i == 0) {
                    i2 = 1;
                }
            }
        }
        userProfile.v = i2;
        this.e.setEnabled(true);
        cgq0 cgq0Var = this.b;
        cgq0Var.t6(userProfile);
        if (!userProfile.z && !this.d) {
            UserMessagesLauncher userMessagesLauncher = cgq0Var.y;
            userMessagesLauncher.getClass();
            zls.o(ams.a(), userMessagesLauncher.a, false, 6);
        }
        return s3q0.a;
    }
}
