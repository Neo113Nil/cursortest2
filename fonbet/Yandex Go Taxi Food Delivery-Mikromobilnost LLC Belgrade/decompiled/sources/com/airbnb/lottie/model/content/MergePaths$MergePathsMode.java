package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class MergePaths$MergePathsMode {
    private static final /* synthetic */ MergePaths$MergePathsMode[] $VALUES;
    public static final MergePaths$MergePathsMode ADD;
    public static final MergePaths$MergePathsMode EXCLUDE_INTERSECTIONS;
    public static final MergePaths$MergePathsMode INTERSECT;
    public static final MergePaths$MergePathsMode MERGE;
    public static final MergePaths$MergePathsMode SUBTRACT;

    static {
        MergePaths$MergePathsMode mergePaths$MergePathsMode = new MergePaths$MergePathsMode("MERGE", 0);
        MERGE = mergePaths$MergePathsMode;
        MergePaths$MergePathsMode mergePaths$MergePathsMode2 = new MergePaths$MergePathsMode("ADD", 1);
        ADD = mergePaths$MergePathsMode2;
        MergePaths$MergePathsMode mergePaths$MergePathsMode3 = new MergePaths$MergePathsMode("SUBTRACT", 2);
        SUBTRACT = mergePaths$MergePathsMode3;
        MergePaths$MergePathsMode mergePaths$MergePathsMode4 = new MergePaths$MergePathsMode("INTERSECT", 3);
        INTERSECT = mergePaths$MergePathsMode4;
        MergePaths$MergePathsMode mergePaths$MergePathsMode5 = new MergePaths$MergePathsMode("EXCLUDE_INTERSECTIONS", 4);
        EXCLUDE_INTERSECTIONS = mergePaths$MergePathsMode5;
        $VALUES = new MergePaths$MergePathsMode[]{mergePaths$MergePathsMode, mergePaths$MergePathsMode2, mergePaths$MergePathsMode3, mergePaths$MergePathsMode4, mergePaths$MergePathsMode5};
    }

    public static MergePaths$MergePathsMode valueOf(String str) {
        return (MergePaths$MergePathsMode) Enum.valueOf(MergePaths$MergePathsMode.class, str);
    }

    public static MergePaths$MergePathsMode[] values() {
        return (MergePaths$MergePathsMode[]) $VALUES.clone();
    }
}
