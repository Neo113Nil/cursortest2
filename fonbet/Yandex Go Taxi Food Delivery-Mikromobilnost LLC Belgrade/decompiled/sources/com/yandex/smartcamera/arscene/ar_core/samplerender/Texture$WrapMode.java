package com.yandex.smartcamera.arscene.ar_core.samplerender;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/smartcamera/arscene/ar_core/samplerender/Texture$WrapMode", "", "Lcom/yandex/smartcamera/arscene/ar_core/samplerender/Texture$WrapMode;", "", "glesEnum", CA20Status.STATUS_USER_I, "a", "()I", "CLAMP_TO_EDGE", "REPEAT", "smartcam-arscene_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Texture$WrapMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Texture$WrapMode[] $VALUES;
    public static final Texture$WrapMode CLAMP_TO_EDGE;
    public static final Texture$WrapMode REPEAT;
    private final int glesEnum;

    static {
        Texture$WrapMode texture$WrapMode = new Texture$WrapMode("CLAMP_TO_EDGE", 0, 33071);
        CLAMP_TO_EDGE = texture$WrapMode;
        Texture$WrapMode texture$WrapMode2 = new Texture$WrapMode("REPEAT", 1, 10497);
        REPEAT = texture$WrapMode2;
        Texture$WrapMode[] texture$WrapModeArr = {texture$WrapMode, texture$WrapMode2};
        $VALUES = texture$WrapModeArr;
        $ENTRIES = a.a(texture$WrapModeArr);
    }

    public Texture$WrapMode(String str, int i, int i2) {
        this.glesEnum = i2;
    }

    public static Texture$WrapMode valueOf(String str) {
        return (Texture$WrapMode) Enum.valueOf(Texture$WrapMode.class, str);
    }

    public static Texture$WrapMode[] values() {
        return (Texture$WrapMode[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getGlesEnum() {
        return this.glesEnum;
    }
}
