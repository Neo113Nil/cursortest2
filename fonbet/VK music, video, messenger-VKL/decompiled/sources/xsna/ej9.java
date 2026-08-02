package xsna;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.bj9;

/* compiled from: CameraManagerCompatBaseImpl.java */
/* loaded from: classes11.dex */
public class ej9 implements bj9.a {
    public final CameraManager a;
    public final Object b;

    /* compiled from: CameraManagerCompatBaseImpl.java */
    public static final class a {
    }

    public ej9(@NonNull Context context, @Nullable a aVar) {
        this.a = (CameraManager) context.getSystemService(SignalingProtocol.KEY_CAMERA);
        this.b = aVar;
    }

    @Override // xsna.bj9.a
    @NonNull
    public CameraCharacteristics a(@NonNull String str) throws CameraAccessExceptionCompat {
        try {
            return this.a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }
}
