package androidx.camera.core.featuregroup.impl;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.view.SurfaceHolder;
import defpackage.dj21;
import defpackage.ej21;
import defpackage.k4o;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rR\u001d\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Landroidx/camera/core/featuregroup/impl/UseCaseType;", "", "Ljava/lang/Class;", "surfaceClass", "Ljava/lang/Class;", "a", "()Ljava/lang/Class;", "", "defaultImageFormat", CA20Status.STATUS_USER_I, "getDefaultImageFormat", "()I", "Companion", "dj21", "PREVIEW", "IMAGE_CAPTURE", "VIDEO_CAPTURE", "STREAM_SHARING", "UNDEFINED", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UseCaseType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UseCaseType[] $VALUES;
    public static final dj21 Companion;
    public static final UseCaseType IMAGE_CAPTURE;
    public static final UseCaseType PREVIEW;
    public static final UseCaseType STREAM_SHARING;
    public static final UseCaseType UNDEFINED;
    public static final UseCaseType VIDEO_CAPTURE;
    private final int defaultImageFormat;
    private final Class<?> surfaceClass;

    static {
        UseCaseType useCaseType = new UseCaseType(0, 34, SurfaceHolder.class, "PREVIEW");
        PREVIEW = useCaseType;
        UseCaseType useCaseType2 = new UseCaseType(1, 256, null, "IMAGE_CAPTURE");
        IMAGE_CAPTURE = useCaseType2;
        UseCaseType useCaseType3 = new UseCaseType(2, 34, MediaCodec.class, "VIDEO_CAPTURE");
        VIDEO_CAPTURE = useCaseType3;
        UseCaseType useCaseType4 = new UseCaseType(3, 34, SurfaceTexture.class, "STREAM_SHARING");
        STREAM_SHARING = useCaseType4;
        UseCaseType useCaseType5 = new UseCaseType(4, 34, null, "UNDEFINED");
        UNDEFINED = useCaseType5;
        UseCaseType[] useCaseTypeArr = {useCaseType, useCaseType2, useCaseType3, useCaseType4, useCaseType5};
        $VALUES = useCaseTypeArr;
        $ENTRIES = a.a(useCaseTypeArr);
        Companion = new dj21();
    }

    public UseCaseType(int i, int i2, Class cls, String str) {
        this.surfaceClass = cls;
        this.defaultImageFormat = i2;
    }

    public static UseCaseType valueOf(String str) {
        return (UseCaseType) Enum.valueOf(UseCaseType.class, str);
    }

    public static UseCaseType[] values() {
        return (UseCaseType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final Class getSurfaceClass() {
        return this.surfaceClass;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i = ej21.a[ordinal()];
        if (i == 1) {
            return "Preview";
        }
        if (i == 2) {
            return "ImageCapture";
        }
        if (i == 3) {
            return "VideoCapture";
        }
        if (i == 4) {
            return "StreamSharing";
        }
        if (i == 5) {
            return "Undefined";
        }
        w511.b();
        return null;
    }
}
