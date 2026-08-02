package ru.ok.tracer.base.drop;

import xsna.epx;
import xsna.h5s;
import xsna.urd0;
import xsna.xe9;

/* compiled from: DropRecord.kt */
/* loaded from: classes9.dex */
public final class DropRecord {
    private final int count;
    private final String event;
    private final String reason;

    public DropRecord(String str, String str2, int i) {
        this.event = str;
        this.reason = str2;
        this.count = i;
    }

    public final DropRecord copyIncrementCount$tracer_base_release(int i) {
        return new DropRecord(this.event, this.reason, this.count + i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropRecord)) {
            return false;
        }
        DropRecord dropRecord = (DropRecord) obj;
        return epx.f(this.event, dropRecord.event) && epx.f(this.reason, dropRecord.reason) && this.count == dropRecord.count;
    }

    public final int getCount$tracer_base_release() {
        return this.count;
    }

    public final String getEvent$tracer_base_release() {
        return this.event;
    }

    public final String getReason$tracer_base_release() {
        return this.reason;
    }

    public int hashCode() {
        return urd0.a(this.event.hashCode() * 31, 31, this.reason) + this.count;
    }

    public String toString() {
        return h5s.c(this.count, ")", xe9.a("DropRecord(event='", this.event, "', reason='", this.reason, "', count="));
    }
}
