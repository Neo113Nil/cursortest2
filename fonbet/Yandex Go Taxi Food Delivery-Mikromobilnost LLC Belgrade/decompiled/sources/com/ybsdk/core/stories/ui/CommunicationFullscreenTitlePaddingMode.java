package com.ybsdk.core.stories.ui;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/core/stories/ui/CommunicationFullscreenTitlePaddingMode;", "", "paddingDp", "", "<init>", "(Ljava/lang/String;II)V", "getPaddingDp", "()I", "ZERO", "MULTIPLE", "EMPTY_TOOLBAR", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommunicationFullscreenTitlePaddingMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CommunicationFullscreenTitlePaddingMode[] $VALUES;
    private final int paddingDp;
    public static final CommunicationFullscreenTitlePaddingMode ZERO = new CommunicationFullscreenTitlePaddingMode("ZERO", 0, 0);
    public static final CommunicationFullscreenTitlePaddingMode MULTIPLE = new CommunicationFullscreenTitlePaddingMode("MULTIPLE", 1, 55);
    public static final CommunicationFullscreenTitlePaddingMode EMPTY_TOOLBAR = new CommunicationFullscreenTitlePaddingMode("EMPTY_TOOLBAR", 2, 44);

    private static final /* synthetic */ CommunicationFullscreenTitlePaddingMode[] $values() {
        return new CommunicationFullscreenTitlePaddingMode[]{ZERO, MULTIPLE, EMPTY_TOOLBAR};
    }

    static {
        CommunicationFullscreenTitlePaddingMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CommunicationFullscreenTitlePaddingMode(String str, int i, int i2) {
        this.paddingDp = i2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CommunicationFullscreenTitlePaddingMode valueOf(String str) {
        return (CommunicationFullscreenTitlePaddingMode) Enum.valueOf(CommunicationFullscreenTitlePaddingMode.class, str);
    }

    public static CommunicationFullscreenTitlePaddingMode[] values() {
        return (CommunicationFullscreenTitlePaddingMode[]) $VALUES.clone();
    }

    public final int getPaddingDp() {
        return this.paddingDp;
    }
}
