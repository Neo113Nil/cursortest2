package defpackage;

import android.content.Context;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.LinkedHashSet;

/* loaded from: classes10.dex */
public final /* synthetic */ class nn7 {
    public static qn7 a(Context context, Object obj, LinkedHashSet linkedHashSet) {
        try {
            return new qn7(context, obj, linkedHashSet);
        } catch (CameraUnavailableException e) {
            throw new InitializationException(e);
        }
    }
}
