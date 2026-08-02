package com.yandex.payment.sdk.nfcscanner.tools.ownimpl;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/payment/sdk/nfcscanner/tools/ownimpl/Command;", "", "", "cla", CA20Status.STATUS_USER_I, "a", "()I", "ins", "b", "p1", "c", "p2", "f", "SELECT", "READ_RECORD", "GPO", "GET_DATA", "nfcscanner_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Command {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Command[] $VALUES;
    public static final Command GET_DATA;
    public static final Command GPO;
    public static final Command READ_RECORD;
    public static final Command SELECT;
    private final int cla;
    private final int ins;
    private final int p1;
    private final int p2 = 0;

    static {
        Command command = new Command(0, 0, 164, 4, "SELECT");
        SELECT = command;
        Command command2 = new Command(1, 0, 178, 0, "READ_RECORD");
        READ_RECORD = command2;
        Command command3 = new Command(2, 128, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN, 0, "GPO");
        GPO = command3;
        Command command4 = new Command(3, 128, 202, 0, "GET_DATA");
        GET_DATA = command4;
        Command[] commandArr = {command, command2, command3, command4};
        $VALUES = commandArr;
        $ENTRIES = a.a(commandArr);
    }

    public Command(int i, int i2, int i3, int i4, String str) {
        this.cla = i2;
        this.ins = i3;
        this.p1 = i4;
    }

    public static Command valueOf(String str) {
        return (Command) Enum.valueOf(Command.class, str);
    }

    public static Command[] values() {
        return (Command[]) $VALUES.clone();
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
