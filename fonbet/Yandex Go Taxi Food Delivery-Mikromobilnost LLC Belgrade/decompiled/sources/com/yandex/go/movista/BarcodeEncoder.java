package com.yandex.go.movista;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import defpackage.k4o;
import defpackage.ptg0;
import defpackage.ukj;
import defpackage.yis0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/go/movista/BarcodeEncoder;", "", "Lcom/google/zxing/BarcodeFormat;", "format", "Lcom/google/zxing/BarcodeFormat;", "a", "()Lcom/google/zxing/BarcodeFormat;", "", "Lcom/google/zxing/EncodeHintType;", "", "hints", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "Lyis0;", "imageGeneratorSize", "Lyis0;", "c", "()Lyis0;", "imageViewSize", "getImageViewSize", "PDF417_CPPK", "movista"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BarcodeEncoder {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BarcodeEncoder[] $VALUES;
    public static final BarcodeEncoder PDF417_CPPK;
    private final BarcodeFormat format;
    private final Map<EncodeHintType, Object> hints;
    private final yis0 imageGeneratorSize = null;
    private final yis0 imageViewSize;

    static {
        BarcodeEncoder barcodeEncoder = new BarcodeEncoder(BarcodeFormat.PDF_417, b.i(new Pair(EncodeHintType.CHARACTER_SET, "ISO-8859-1"), new Pair(EncodeHintType.MARGIN, 0), new Pair(EncodeHintType.PDF417_DIMENSIONS, new ukj())), new yis0(ptg0.pdf417_image_width, ptg0.pdf417_image_height));
        PDF417_CPPK = barcodeEncoder;
        BarcodeEncoder[] barcodeEncoderArr = {barcodeEncoder};
        $VALUES = barcodeEncoderArr;
        $ENTRIES = a.a(barcodeEncoderArr);
    }

    public BarcodeEncoder(BarcodeFormat barcodeFormat, Map map, yis0 yis0Var) {
        this.format = barcodeFormat;
        this.hints = map;
        this.imageViewSize = yis0Var;
    }

    public static BarcodeEncoder valueOf(String str) {
        return (BarcodeEncoder) Enum.valueOf(BarcodeEncoder.class, str);
    }

    public static BarcodeEncoder[] values() {
        return (BarcodeEncoder[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final BarcodeFormat getFormat() {
        return this.format;
    }

    /* renamed from: b, reason: from getter */
    public final Map getHints() {
        return this.hints;
    }

    /* renamed from: c, reason: from getter */
    public final yis0 getImageGeneratorSize() {
        return this.imageGeneratorSize;
    }
}
