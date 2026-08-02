package xsna;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.CameraUnavailableException;
import java.util.HashMap;
import java.util.Set;

/* compiled from: Camera2DeviceSurfaceManager.java */
/* loaded from: classes11.dex */
public final class hf9 implements th9 {
    public final HashMap a;
    public final rq b;

    public hf9(@NonNull Context context, @Nullable Object obj, @NonNull Set<String> set) throws CameraUnavailableException {
        bj9 bj9Var;
        rq rqVar = new rq(4);
        this.a = new HashMap();
        this.b = rqVar;
        if (obj instanceof bj9) {
            bj9Var = (bj9) obj;
        } else {
            dg00.a();
            bj9Var = new bj9(Build.VERSION.SDK_INT >= 29 ? new dj9(context, null) : new cj9(context, null));
        }
        context.getClass();
        for (String str : set) {
            this.a.put(str, new gjn0(context, str, bj9Var, this.b));
        }
    }
}
