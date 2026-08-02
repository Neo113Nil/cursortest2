package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;

/* loaded from: classes.dex */
public final class j50 extends x40 {
    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        return (Intent) obj;
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
