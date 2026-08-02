package com.squareup.wire.internal;

import com.adjust.sdk.Constants;
import defpackage.oo31;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0005J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/squareup/wire/internal/LongArrayList;", "", "", "initialCapacity", "<init>", "(I)V", "minCapacity", "Lzy11;", "ensureCapacity", "", "toArray", "()[J", "", Constants.LONG, "add", "(J)V", "", "isNotEmpty", "()Z", "", "toString", "()Ljava/lang/String;", io.appmetrica.analytics.rtm.internal.Constants.KEY_DATA, "[J", "size", CA20Status.STATUS_USER_I, "Companion", "wire-runtime"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LongArrayList {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long[] data;
    private int size;

    public LongArrayList(int i) {
        this.data = new long[i];
    }

    private final void ensureCapacity(int minCapacity) {
        long[] jArr = this.data;
        if (minCapacity > jArr.length) {
            this.data = Arrays.copyOf(jArr, oo31.c(jArr.length, 3, 2, 1, minCapacity));
        }
    }

    public final void add(long r4) {
        ensureCapacity(this.size + 1);
        long[] jArr = this.data;
        int i = this.size;
        this.size = i + 1;
        jArr[i] = r4;
    }

    public final boolean isNotEmpty() {
        return this.size > 0;
    }

    public final long[] toArray() {
        int i = this.size;
        long[] jArr = this.data;
        if (i < jArr.length) {
            this.data = Arrays.copyOf(jArr, i);
        }
        return this.data;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(this.data, this.size));
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/squareup/wire/internal/LongArrayList$Companion;", "", "<init>", "()V", "forDecoding", "Lcom/squareup/wire/internal/LongArrayList;", "minLengthInBytes", "", "minimumElementByteSize", "", "wire-runtime"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LongArrayList forDecoding(long minLengthInBytes, long minimumElementByteSize) {
            long j = minLengthInBytes / minimumElementByteSize;
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return new LongArrayList((int) j);
        }

        private Companion() {
        }

        public final LongArrayList forDecoding(int minLengthInBytes, int minimumElementByteSize) {
            return new LongArrayList(minLengthInBytes / minimumElementByteSize);
        }
    }
}
