package xsna;

/* compiled from: FileSectionType.java */
/* loaded from: classes12.dex */
public enum dar {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    dar(long j) {
        this.mValue = j;
    }

    public final long h() {
        return this.mValue;
    }
}
