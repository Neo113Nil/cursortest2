package com.yandex.messaging.domain.poll;

import defpackage.k4o;
import defpackage.mxd0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/messaging/domain/poll/PollMessageVote$OperationType", "", "Lcom/yandex/messaging/domain/poll/PollMessageVote$OperationType;", "", "type", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "mxd0", "SetVote", "ResetVote", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PollMessageVote$OperationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PollMessageVote$OperationType[] $VALUES;
    public static final mxd0 Companion;
    public static final PollMessageVote$OperationType ResetVote;
    public static final PollMessageVote$OperationType SetVote;
    private final int type;

    static {
        PollMessageVote$OperationType pollMessageVote$OperationType = new PollMessageVote$OperationType("SetVote", 0, 0);
        SetVote = pollMessageVote$OperationType;
        PollMessageVote$OperationType pollMessageVote$OperationType2 = new PollMessageVote$OperationType("ResetVote", 1, 1);
        ResetVote = pollMessageVote$OperationType2;
        PollMessageVote$OperationType[] pollMessageVote$OperationTypeArr = {pollMessageVote$OperationType, pollMessageVote$OperationType2};
        $VALUES = pollMessageVote$OperationTypeArr;
        $ENTRIES = kotlin.enums.a.a(pollMessageVote$OperationTypeArr);
        Companion = new mxd0();
    }

    public PollMessageVote$OperationType(String str, int i, int i2) {
        this.type = i2;
    }

    public static PollMessageVote$OperationType valueOf(String str) {
        return (PollMessageVote$OperationType) Enum.valueOf(PollMessageVote$OperationType.class, str);
    }

    public static PollMessageVote$OperationType[] values() {
        return (PollMessageVote$OperationType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getType() {
        return this.type;
    }
}
