package com.yandex.go.platform.lottie_splash.domain;

import defpackage.buz;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/platform/lottie_splash/domain/LottiePositionPresentationModel;", "", "", "jsonName", "Ljava/lang/String;", "getJsonName", "()Ljava/lang/String;", "Companion", "buz", "TOP", "BOTTOM", "CENTER", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LottiePositionPresentationModel {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LottiePositionPresentationModel[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final LottiePositionPresentationModel BOTTOM;
    public static final LottiePositionPresentationModel CENTER;
    public static final buz Companion;
    public static final LottiePositionPresentationModel TOP;
    private final String jsonName;

    static {
        LottiePositionPresentationModel lottiePositionPresentationModel = new LottiePositionPresentationModel("TOP", 0, "top");
        TOP = lottiePositionPresentationModel;
        LottiePositionPresentationModel lottiePositionPresentationModel2 = new LottiePositionPresentationModel("BOTTOM", 1, "bottom");
        BOTTOM = lottiePositionPresentationModel2;
        LottiePositionPresentationModel lottiePositionPresentationModel3 = new LottiePositionPresentationModel("CENTER", 2, "center");
        CENTER = lottiePositionPresentationModel3;
        LottiePositionPresentationModel[] lottiePositionPresentationModelArr = {lottiePositionPresentationModel, lottiePositionPresentationModel2, lottiePositionPresentationModel3};
        $VALUES = lottiePositionPresentationModelArr;
        $ENTRIES = kotlin.enums.a.a(lottiePositionPresentationModelArr);
        Companion = new buz();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, LottiePositionPresentationModel$Companion$1.w);
    }

    public LottiePositionPresentationModel(String str, int i, String str2) {
        this.jsonName = str2;
    }

    public static LottiePositionPresentationModel valueOf(String str) {
        return (LottiePositionPresentationModel) Enum.valueOf(LottiePositionPresentationModel.class, str);
    }

    public static LottiePositionPresentationModel[] values() {
        return (LottiePositionPresentationModel[]) $VALUES.clone();
    }
}
