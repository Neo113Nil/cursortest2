package com.yandex.smartcamera.arscene.ar_core.samplerender;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/smartcamera/arscene/ar_core/samplerender/Texture$Target", "", "Lcom/yandex/smartcamera/arscene/ar_core/samplerender/Texture$Target;", "", "glesEnum", CA20Status.STATUS_USER_I, "a", "()I", "TEXTURE_2D", "TEXTURE_EXTERNAL_OES", "TEXTURE_CUBE_MAP", "smartcam-arscene_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Texture$Target {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Texture$Target[] $VALUES;
    public static final Texture$Target TEXTURE_2D;
    public static final Texture$Target TEXTURE_CUBE_MAP;
    public static final Texture$Target TEXTURE_EXTERNAL_OES;
    private final int glesEnum;

    static {
        Texture$Target texture$Target = new Texture$Target("TEXTURE_2D", 0, 3553);
        TEXTURE_2D = texture$Target;
        Texture$Target texture$Target2 = new Texture$Target("TEXTURE_EXTERNAL_OES", 1, 36197);
        TEXTURE_EXTERNAL_OES = texture$Target2;
        Texture$Target texture$Target3 = new Texture$Target("TEXTURE_CUBE_MAP", 2, 34067);
        TEXTURE_CUBE_MAP = texture$Target3;
        Texture$Target[] texture$TargetArr = {texture$Target, texture$Target2, texture$Target3};
        $VALUES = texture$TargetArr;
        $ENTRIES = a.a(texture$TargetArr);
    }

    public Texture$Target(String str, int i, int i2) {
        this.glesEnum = i2;
    }

    public static Texture$Target valueOf(String str) {
        return (Texture$Target) Enum.valueOf(Texture$Target.class, str);
    }

    public static Texture$Target[] values() {
        return (Texture$Target[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getGlesEnum() {
        return this.glesEnum;
    }
}
