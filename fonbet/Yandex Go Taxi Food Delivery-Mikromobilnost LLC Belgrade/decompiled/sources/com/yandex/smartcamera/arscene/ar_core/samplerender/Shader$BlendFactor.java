package com.yandex.smartcamera.arscene.ar_core.samplerender;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/smartcamera/arscene/ar_core/samplerender/Shader$BlendFactor", "", "Lcom/yandex/smartcamera/arscene/ar_core/samplerender/Shader$BlendFactor;", "", "glesEnum", CA20Status.STATUS_USER_I, "a", "()I", "ZERO", "ONE", "SRC_ALPHA", "ONE_MINUS_SRC_ALPHA", "DST_ALPHA", "smartcam-arscene_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Shader$BlendFactor {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Shader$BlendFactor[] $VALUES;
    public static final Shader$BlendFactor DST_ALPHA;
    public static final Shader$BlendFactor ONE;
    public static final Shader$BlendFactor ONE_MINUS_SRC_ALPHA;
    public static final Shader$BlendFactor SRC_ALPHA;
    public static final Shader$BlendFactor ZERO;
    private final int glesEnum;

    static {
        Shader$BlendFactor shader$BlendFactor = new Shader$BlendFactor("ZERO", 0, 0);
        ZERO = shader$BlendFactor;
        Shader$BlendFactor shader$BlendFactor2 = new Shader$BlendFactor("ONE", 1, 1);
        ONE = shader$BlendFactor2;
        Shader$BlendFactor shader$BlendFactor3 = new Shader$BlendFactor("SRC_ALPHA", 2, 770);
        SRC_ALPHA = shader$BlendFactor3;
        Shader$BlendFactor shader$BlendFactor4 = new Shader$BlendFactor("ONE_MINUS_SRC_ALPHA", 3, 771);
        ONE_MINUS_SRC_ALPHA = shader$BlendFactor4;
        Shader$BlendFactor shader$BlendFactor5 = new Shader$BlendFactor("DST_ALPHA", 4, 772);
        DST_ALPHA = shader$BlendFactor5;
        Shader$BlendFactor[] shader$BlendFactorArr = {shader$BlendFactor, shader$BlendFactor2, shader$BlendFactor3, shader$BlendFactor4, shader$BlendFactor5};
        $VALUES = shader$BlendFactorArr;
        $ENTRIES = a.a(shader$BlendFactorArr);
    }

    public Shader$BlendFactor(String str, int i, int i2) {
        this.glesEnum = i2;
    }

    public static Shader$BlendFactor valueOf(String str) {
        return (Shader$BlendFactor) Enum.valueOf(Shader$BlendFactor.class, str);
    }

    public static Shader$BlendFactor[] values() {
        return (Shader$BlendFactor[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getGlesEnum() {
        return this.glesEnum;
    }
}
