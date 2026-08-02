package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.h6u;
import defpackage.xwv;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements xwv {

    public static class a {
    }

    @Override // defpackage.xwv
    public final Object create(Context context) {
        Choreographer.getInstance().postFrameCallback(new h6u(this, context.getApplicationContext()));
        return new a();
    }

    @Override // defpackage.xwv
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
