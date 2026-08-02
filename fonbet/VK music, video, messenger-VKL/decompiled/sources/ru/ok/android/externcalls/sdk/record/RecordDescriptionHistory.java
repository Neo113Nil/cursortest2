package ru.ok.android.externcalls.sdk.record;

import xsna.epx;

/* compiled from: RecordDescriptionHistory.kt */
/* loaded from: classes9.dex */
public final class RecordDescriptionHistory {
    private final RecordDescription currentState;
    private final RecordDescription previousState;

    public RecordDescriptionHistory(RecordDescription recordDescription, RecordDescription recordDescription2) {
        this.currentState = recordDescription;
        this.previousState = recordDescription2;
    }

    public static /* synthetic */ RecordDescriptionHistory copy$default(RecordDescriptionHistory recordDescriptionHistory, RecordDescription recordDescription, RecordDescription recordDescription2, int i, Object obj) {
        if ((i & 1) != 0) {
            recordDescription = recordDescriptionHistory.currentState;
        }
        if ((i & 2) != 0) {
            recordDescription2 = recordDescriptionHistory.previousState;
        }
        return recordDescriptionHistory.copy(recordDescription, recordDescription2);
    }

    public final RecordDescription component1() {
        return this.currentState;
    }

    public final RecordDescription component2() {
        return this.previousState;
    }

    public final RecordDescriptionHistory copy(RecordDescription recordDescription, RecordDescription recordDescription2) {
        return new RecordDescriptionHistory(recordDescription, recordDescription2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordDescriptionHistory)) {
            return false;
        }
        RecordDescriptionHistory recordDescriptionHistory = (RecordDescriptionHistory) obj;
        return epx.f(this.currentState, recordDescriptionHistory.currentState) && epx.f(this.previousState, recordDescriptionHistory.previousState);
    }

    public final RecordDescription getCurrentState() {
        return this.currentState;
    }

    public final RecordDescription getPreviousState() {
        return this.previousState;
    }

    public int hashCode() {
        RecordDescription recordDescription = this.currentState;
        int hashCode = (recordDescription == null ? 0 : recordDescription.hashCode()) * 31;
        RecordDescription recordDescription2 = this.previousState;
        return hashCode + (recordDescription2 != null ? recordDescription2.hashCode() : 0);
    }

    public String toString() {
        return "RecordDescriptionHistory(currentState=" + this.currentState + ", previousState=" + this.previousState + ")";
    }
}
