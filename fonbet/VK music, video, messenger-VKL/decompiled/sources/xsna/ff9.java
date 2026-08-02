package xsna;

import android.content.Context;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.Set;
import xsna.th9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ff9 implements th9.a {
    @Override // xsna.th9.a
    public final hf9 a(Context context, Object obj, Set set) {
        try {
            return new hf9(context, obj, set);
        } catch (CameraUnavailableException e) {
            throw new InitializationException(e);
        }
    }
}
