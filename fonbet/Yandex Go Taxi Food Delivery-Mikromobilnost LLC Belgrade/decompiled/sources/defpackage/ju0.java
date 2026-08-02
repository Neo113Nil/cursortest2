package defpackage;

/* loaded from: classes12.dex */
public interface ju0 {
    default int a() {
        int index = getIndex() - 1;
        if (index < 0) {
            return 0;
        }
        return index;
    }

    int getIndex();
}
