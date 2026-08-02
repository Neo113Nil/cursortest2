package ru.ok.android.externcalls.sdk.id.local;

import java.util.concurrent.atomic.AtomicInteger;
import xsna.tgw;
import xsna.zcl;

/* compiled from: LocalParticipantId.kt */
/* loaded from: classes9.dex */
public final class LocalParticipantId {
    public static final Companion Companion = new Companion(null);
    private static final AtomicInteger sequence = new AtomicInteger(0);
    private final int id;

    /* compiled from: LocalParticipantId.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final LocalParticipantId nextId() {
            return new LocalParticipantId(LocalParticipantId.sequence.getAndIncrement(), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ LocalParticipantId(int i, zcl zclVar) {
        this(i);
    }

    public static /* synthetic */ LocalParticipantId copy$default(LocalParticipantId localParticipantId, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = localParticipantId.id;
        }
        return localParticipantId.copy(i);
    }

    public static final LocalParticipantId nextId() {
        return Companion.nextId();
    }

    public final int component1() {
        return this.id;
    }

    public final LocalParticipantId copy(int i) {
        return new LocalParticipantId(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalParticipantId) && this.id == ((LocalParticipantId) obj).id;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        return Integer.hashCode(this.id);
    }

    public String toString() {
        return tgw.b(this.id, "LocalParticipantId(id=", ")");
    }

    private LocalParticipantId(int i) {
        this.id = i;
    }
}
