package com.yandex.go.image.api.domain.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/image/api/domain/models/ImageLoadPriority;", "", "", "priority", CA20Status.STATUS_USER_I, "a", "()I", "IMMEDIATE", "HIGH", "NORMAL", "LOW", "go-client-android.libs.image_loader:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageLoadPriority {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ImageLoadPriority[] $VALUES;
    public static final ImageLoadPriority HIGH;
    public static final ImageLoadPriority IMMEDIATE;
    public static final ImageLoadPriority LOW;
    public static final ImageLoadPriority NORMAL;
    private final int priority;

    static {
        ImageLoadPriority imageLoadPriority = new ImageLoadPriority("IMMEDIATE", 0, 4);
        IMMEDIATE = imageLoadPriority;
        ImageLoadPriority imageLoadPriority2 = new ImageLoadPriority("HIGH", 1, 3);
        HIGH = imageLoadPriority2;
        ImageLoadPriority imageLoadPriority3 = new ImageLoadPriority("NORMAL", 2, 2);
        NORMAL = imageLoadPriority3;
        ImageLoadPriority imageLoadPriority4 = new ImageLoadPriority("LOW", 3, 1);
        LOW = imageLoadPriority4;
        ImageLoadPriority[] imageLoadPriorityArr = {imageLoadPriority, imageLoadPriority2, imageLoadPriority3, imageLoadPriority4};
        $VALUES = imageLoadPriorityArr;
        $ENTRIES = a.a(imageLoadPriorityArr);
    }

    public ImageLoadPriority(String str, int i, int i2) {
        this.priority = i2;
    }

    public static ImageLoadPriority valueOf(String str) {
        return (ImageLoadPriority) Enum.valueOf(ImageLoadPriority.class, str);
    }

    public static ImageLoadPriority[] values() {
        return (ImageLoadPriority[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }
}
