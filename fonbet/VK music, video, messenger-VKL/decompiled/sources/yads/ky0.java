package yads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.common.AdActivity;

/* loaded from: classes10.dex */
public final class ky0 {
    public final nv3 a;

    public ky0(nv3 nv3Var) {
        this.a = nv3Var;
    }

    public final Intent a(Context context, long j) {
        this.a.getClass();
        Intent intent = new Intent(context, (Class<?>) AdActivity.class);
        intent.putExtra("window_type", "window_type_fullscreen");
        intent.putExtra("data_identifier", j);
        if (!(context instanceof Activity)) {
            intent.addFlags(402653184);
        }
        return intent;
    }
}
