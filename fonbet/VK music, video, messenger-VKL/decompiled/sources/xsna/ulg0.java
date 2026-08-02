package xsna;

import androidx.room.RoomDatabase;

/* compiled from: RoomTrackingLiveData.android.kt */
/* loaded from: classes.dex */
public final class ulg0<T> extends androidx.room.o<T> {
    public final pxx0 s;

    public ulg0(RoomDatabase roomDatabase, pkg pkgVar, String[] strArr, pxx0 pxx0Var) {
        super(roomDatabase, pkgVar, strArr);
        this.s = pxx0Var;
    }

    @Override // androidx.room.o
    public final Object m() {
        return this.s.call();
    }
}
