package com.squareup.wire.internal;

import defpackage.oo31;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0005J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0005J\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/squareup/wire/internal/IntArrayList;", "", "", "initialCapacity", "<init>", "(I)V", "minCapacity", "Lzy11;", "ensureCapacity", "", "toArray", "()[I", "int", "add", "", "isNotEmpty", "()Z", "", "toString", "()Ljava/lang/String;", Constants.KEY_DATA, "[I", "size", CA20Status.STATUS_USER_I, "Companion", "wire-runtime"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class IntArrayList {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int[] data;
    private int size;

    public IntArrayList(int i) {
        this.data = new int[i];
    }

    private final void ensureCapacity(int minCapacity) {
        int[] iArr = this.data;
        if (minCapacity > iArr.length) {
            this.data = Arrays.copyOf(iArr, oo31.c(iArr.length, 3, 2, 1, minCapacity));
        }
    }

    public final void add(int r4) {
        ensureCapacity(this.size + 1);
        int[] iArr = this.data;
        int i = this.size;
        this.size = i + 1;
        iArr[i] = r4;
    }

    public final boolean isNotEmpty() {
        return this.size > 0;
    }

    public final int[] toArray() {
        int i = this.size;
        int[] iArr = this.data;
        if (i < iArr.length) {
            this.data = Arrays.copyOf(iArr, i);
        }
        return this.data;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(this.data, this.size));
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/squareup/wire/internal/IntArrayList$Companion;", "", "<init>", "()V", "forDecoding", "Lcom/squareup/wire/internal/IntArrayList;", "minLengthInBytes", "", "minimumElementByteSize", "", "wire-runtime"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IntArrayList forDecoding(long minLengthInBytes, long minimumElementByteSize) {
            long j = minLengthInBytes / minimumElementByteSize;
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return new IntArrayList((int) j);
        }

        private Companion() {
        }

        public final IntArrayList forDecoding(int minLengthInBytes, int minimumElementByteSize) {
            return new IntArrayList(minLengthInBytes / minimumElementByteSize);
        }
    }
}
