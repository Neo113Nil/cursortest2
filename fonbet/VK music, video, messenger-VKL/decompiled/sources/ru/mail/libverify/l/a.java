package ru.mail.libverify.l;

import ru.mail.verify.core.utils.Gsonable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class a implements Gsonable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    @ru.mail.libverify.q0.b("device")
    public static final a DEVICE;
    public static final a NOTHING;

    @ru.mail.libverify.q0.b("phone")
    public static final a PHONE;
    private final String value;

    static {
        a aVar = new a("DEVICE", 0, "device");
        DEVICE = aVar;
        a aVar2 = new a("PHONE", 1, "phone");
        PHONE = aVar2;
        a aVar3 = new a("NOTHING", 2, null);
        NOTHING = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = new asp(aVarArr);
    }

    private a(String str, int i, String str2) {
        this.value = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
