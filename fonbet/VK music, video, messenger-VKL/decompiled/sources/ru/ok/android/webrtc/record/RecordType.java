package ru.ok.android.webrtc.record;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class RecordType {
    public static final RecordType NOTHING;
    public static final RecordType RECORD;
    public static final RecordType STREAM;
    public static final /* synthetic */ RecordType[] a;
    public static final /* synthetic */ zrp b;

    static {
        RecordType recordType = new RecordType("NOTHING", 0);
        NOTHING = recordType;
        RecordType recordType2 = new RecordType("RECORD", 1);
        RECORD = recordType2;
        RecordType recordType3 = new RecordType("STREAM", 2);
        STREAM = recordType3;
        RecordType[] recordTypeArr = {recordType, recordType2, recordType3};
        a = recordTypeArr;
        b = new asp(recordTypeArr);
    }

    public RecordType(String str, int i) {
    }

    public static zrp<RecordType> getEntries() {
        return b;
    }

    public static RecordType valueOf(String str) {
        return (RecordType) Enum.valueOf(RecordType.class, str);
    }

    public static RecordType[] values() {
        return (RecordType[]) a.clone();
    }
}
