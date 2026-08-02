package defpackage;

import com.ybsdk.core.stories.entities.HorizontalAlignmentEntity;
import com.ybsdk.core.stories.entities.StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class csc {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode.values().length];
        try {
            iArr[StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode.OFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode.ONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[HorizontalAlignmentEntity.values().length];
        try {
            iArr2[HorizontalAlignmentEntity.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[HorizontalAlignmentEntity.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[HorizontalAlignmentEntity.RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
