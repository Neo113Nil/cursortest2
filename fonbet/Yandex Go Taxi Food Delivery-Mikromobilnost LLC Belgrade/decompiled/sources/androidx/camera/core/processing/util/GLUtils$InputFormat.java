package androidx.camera.core.processing.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class GLUtils$InputFormat {
    private static final /* synthetic */ GLUtils$InputFormat[] $VALUES;
    public static final GLUtils$InputFormat DEFAULT;
    public static final GLUtils$InputFormat UNKNOWN;
    public static final GLUtils$InputFormat YUV;

    static {
        GLUtils$InputFormat gLUtils$InputFormat = new GLUtils$InputFormat("UNKNOWN", 0);
        UNKNOWN = gLUtils$InputFormat;
        GLUtils$InputFormat gLUtils$InputFormat2 = new GLUtils$InputFormat("DEFAULT", 1);
        DEFAULT = gLUtils$InputFormat2;
        GLUtils$InputFormat gLUtils$InputFormat3 = new GLUtils$InputFormat("YUV", 2);
        YUV = gLUtils$InputFormat3;
        $VALUES = new GLUtils$InputFormat[]{gLUtils$InputFormat, gLUtils$InputFormat2, gLUtils$InputFormat3};
    }

    public static GLUtils$InputFormat valueOf(String str) {
        return (GLUtils$InputFormat) Enum.valueOf(GLUtils$InputFormat.class, str);
    }

    public static GLUtils$InputFormat[] values() {
        return (GLUtils$InputFormat[]) $VALUES.clone();
    }
}
