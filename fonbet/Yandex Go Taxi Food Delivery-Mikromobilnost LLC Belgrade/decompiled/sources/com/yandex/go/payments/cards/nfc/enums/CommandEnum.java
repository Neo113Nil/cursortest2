package com.yandex.go.payments.cards.nfc.enums;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/payments/cards/nfc/enums/CommandEnum;", "", "", "cla", CA20Status.STATUS_USER_I, "ins", "p1", "p2", "SELECT", "READ_RECORD", "GPO", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CommandEnum {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CommandEnum[] $VALUES;
    public static final CommandEnum GPO;
    public static final CommandEnum READ_RECORD;
    public static final CommandEnum SELECT;
    private final int cla;
    private final int ins;
    private final int p1;
    private final int p2 = 0;

    static {
        CommandEnum commandEnum = new CommandEnum(0, 0, 164, 4, "SELECT");
        SELECT = commandEnum;
        CommandEnum commandEnum2 = new CommandEnum(1, 0, 178, 0, "READ_RECORD");
        READ_RECORD = commandEnum2;
        CommandEnum commandEnum3 = new CommandEnum(2, 128, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN, 0, "GPO");
        GPO = commandEnum3;
        CommandEnum[] commandEnumArr = {commandEnum, commandEnum2, commandEnum3};
        $VALUES = commandEnumArr;
        $ENTRIES = a.a(commandEnumArr);
    }

    public CommandEnum(int i, int i2, int i3, int i4, String str) {
        this.cla = i2;
        this.ins = i3;
        this.p1 = i4;
    }

    public static CommandEnum valueOf(String str) {
        return (CommandEnum) Enum.valueOf(CommandEnum.class, str);
    }

    public static CommandEnum[] values() {
        return (CommandEnum[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getCla() {
        return this.cla;
    }

    /* renamed from: b, reason: from getter */
    public final int getIns() {
        return this.ins;
    }

    /* renamed from: c, reason: from getter */
    public final int getP1() {
        return this.p1;
    }

    /* renamed from: f, reason: from getter */
    public final int getP2() {
        return this.p2;
    }
}
