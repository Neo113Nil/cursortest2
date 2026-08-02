package com.google.firebase.sessions;

import defpackage.k4o;
import defpackage.yn60;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/google/firebase/sessions/DataCollectionState;", "Lyn60;", "", "", "number", CA20Status.STATUS_USER_I, "getNumber", "()I", "COLLECTION_UNKNOWN", "COLLECTION_SDK_NOT_INSTALLED", "COLLECTION_ENABLED", "COLLECTION_DISABLED", "COLLECTION_DISABLED_REMOTE", "COLLECTION_SAMPLED", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DataCollectionState implements yn60 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DataCollectionState[] $VALUES;
    public static final DataCollectionState COLLECTION_DISABLED;
    public static final DataCollectionState COLLECTION_DISABLED_REMOTE;
    public static final DataCollectionState COLLECTION_ENABLED;
    public static final DataCollectionState COLLECTION_SAMPLED;
    public static final DataCollectionState COLLECTION_SDK_NOT_INSTALLED;
    public static final DataCollectionState COLLECTION_UNKNOWN;
    private final int number;

    static {
        DataCollectionState dataCollectionState = new DataCollectionState("COLLECTION_UNKNOWN", 0, 0);
        COLLECTION_UNKNOWN = dataCollectionState;
        DataCollectionState dataCollectionState2 = new DataCollectionState("COLLECTION_SDK_NOT_INSTALLED", 1, 1);
        COLLECTION_SDK_NOT_INSTALLED = dataCollectionState2;
        DataCollectionState dataCollectionState3 = new DataCollectionState("COLLECTION_ENABLED", 2, 2);
        COLLECTION_ENABLED = dataCollectionState3;
        DataCollectionState dataCollectionState4 = new DataCollectionState("COLLECTION_DISABLED", 3, 3);
        COLLECTION_DISABLED = dataCollectionState4;
        DataCollectionState dataCollectionState5 = new DataCollectionState("COLLECTION_DISABLED_REMOTE", 4, 4);
        COLLECTION_DISABLED_REMOTE = dataCollectionState5;
        DataCollectionState dataCollectionState6 = new DataCollectionState("COLLECTION_SAMPLED", 5, 5);
        COLLECTION_SAMPLED = dataCollectionState6;
        DataCollectionState[] dataCollectionStateArr = {dataCollectionState, dataCollectionState2, dataCollectionState3, dataCollectionState4, dataCollectionState5, dataCollectionState6};
        $VALUES = dataCollectionStateArr;
        $ENTRIES = kotlin.enums.a.a(dataCollectionStateArr);
    }

    public DataCollectionState(String str, int i, int i2) {
        this.number = i2;
    }

    public static DataCollectionState valueOf(String str) {
        return (DataCollectionState) Enum.valueOf(DataCollectionState.class, str);
    }

    public static DataCollectionState[] values() {
        return (DataCollectionState[]) $VALUES.clone();
    }

    @Override // defpackage.yn60
    public final int getNumber() {
        return this.number;
    }
}
