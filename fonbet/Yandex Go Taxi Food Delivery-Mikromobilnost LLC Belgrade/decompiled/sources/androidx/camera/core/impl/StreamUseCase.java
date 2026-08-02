package androidx.camera.core.impl;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\t\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Landroidx/camera/core/impl/StreamUseCase;", "", "", "value", "J", "a", "()J", "DEFAULT", "PREVIEW", "VIDEO_RECORD", "STILL_CAPTURE", "VIDEO_CALL", "PREVIEW_VIDEO_STILL", "CROPPED_RAW", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StreamUseCase {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StreamUseCase[] $VALUES;
    public static final StreamUseCase CROPPED_RAW;
    public static final StreamUseCase DEFAULT;
    public static final StreamUseCase PREVIEW;
    public static final StreamUseCase PREVIEW_VIDEO_STILL;
    public static final StreamUseCase STILL_CAPTURE;
    public static final StreamUseCase VIDEO_CALL;
    public static final StreamUseCase VIDEO_RECORD;
    private final long value;

    static {
        StreamUseCase streamUseCase = new StreamUseCase("DEFAULT", 0, 0);
        DEFAULT = streamUseCase;
        StreamUseCase streamUseCase2 = new StreamUseCase("PREVIEW", 1, 1);
        PREVIEW = streamUseCase2;
        StreamUseCase streamUseCase3 = new StreamUseCase("VIDEO_RECORD", 2, 3);
        VIDEO_RECORD = streamUseCase3;
        StreamUseCase streamUseCase4 = new StreamUseCase("STILL_CAPTURE", 3, 2);
        STILL_CAPTURE = streamUseCase4;
        StreamUseCase streamUseCase5 = new StreamUseCase("VIDEO_CALL", 4, 5);
        VIDEO_CALL = streamUseCase5;
        StreamUseCase streamUseCase6 = new StreamUseCase("PREVIEW_VIDEO_STILL", 5, 4);
        PREVIEW_VIDEO_STILL = streamUseCase6;
        StreamUseCase streamUseCase7 = new StreamUseCase("CROPPED_RAW", 6, 6);
        CROPPED_RAW = streamUseCase7;
        StreamUseCase[] streamUseCaseArr = {streamUseCase, streamUseCase2, streamUseCase3, streamUseCase4, streamUseCase5, streamUseCase6, streamUseCase7};
        $VALUES = streamUseCaseArr;
        $ENTRIES = kotlin.enums.a.a(streamUseCaseArr);
    }

    public StreamUseCase(String str, int i, int i2) {
        this.value = i2;
    }

    public static StreamUseCase valueOf(String str) {
        return (StreamUseCase) Enum.valueOf(StreamUseCase.class, str);
    }

    public static StreamUseCase[] values() {
        return (StreamUseCase[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final long getValue() {
        return this.value;
    }
}
