package defpackage;

import com.airbnb.lottie.model.content.MergePaths$MergePathsMode;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class lr10 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MergePaths$MergePathsMode.values().length];
        a = iArr;
        try {
            iArr[MergePaths$MergePathsMode.MERGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[MergePaths$MergePathsMode.ADD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[MergePaths$MergePathsMode.SUBTRACT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[MergePaths$MergePathsMode.INTERSECT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[MergePaths$MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
