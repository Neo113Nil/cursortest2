package com.yandex.smartcamera.arscene.ar_core.samplerender;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/smartcamera/arscene/ar_core/samplerender/Mesh$PrimitiveMode", "", "Lcom/yandex/smartcamera/arscene/ar_core/samplerender/Mesh$PrimitiveMode;", "", "glesEnum", CA20Status.STATUS_USER_I, "a", "()I", "POINTS", "TRIANGLE_STRIP", "TRIANGLES", "smartcam-arscene_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Mesh$PrimitiveMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Mesh$PrimitiveMode[] $VALUES;
    public static final Mesh$PrimitiveMode POINTS;
    public static final Mesh$PrimitiveMode TRIANGLES;
    public static final Mesh$PrimitiveMode TRIANGLE_STRIP;
    private final int glesEnum;

    static {
        Mesh$PrimitiveMode mesh$PrimitiveMode = new Mesh$PrimitiveMode("POINTS", 0, 0);
        POINTS = mesh$PrimitiveMode;
        Mesh$PrimitiveMode mesh$PrimitiveMode2 = new Mesh$PrimitiveMode("TRIANGLE_STRIP", 1, 5);
        TRIANGLE_STRIP = mesh$PrimitiveMode2;
        Mesh$PrimitiveMode mesh$PrimitiveMode3 = new Mesh$PrimitiveMode("TRIANGLES", 2, 4);
        TRIANGLES = mesh$PrimitiveMode3;
        Mesh$PrimitiveMode[] mesh$PrimitiveModeArr = {mesh$PrimitiveMode, mesh$PrimitiveMode2, mesh$PrimitiveMode3};
        $VALUES = mesh$PrimitiveModeArr;
        $ENTRIES = a.a(mesh$PrimitiveModeArr);
    }

    public Mesh$PrimitiveMode(String str, int i, int i2) {
        this.glesEnum = i2;
    }

    public static Mesh$PrimitiveMode valueOf(String str) {
        return (Mesh$PrimitiveMode) Enum.valueOf(Mesh$PrimitiveMode.class, str);
    }

    public static Mesh$PrimitiveMode[] values() {
        return (Mesh$PrimitiveMode[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getGlesEnum() {
        return this.glesEnum;
    }
}
