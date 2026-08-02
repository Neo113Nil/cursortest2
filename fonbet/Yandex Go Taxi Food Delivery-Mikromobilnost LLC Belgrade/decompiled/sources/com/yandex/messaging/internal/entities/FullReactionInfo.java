package com.yandex.messaging.internal.entities;

import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.oyr;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/yandex/messaging/internal/entities/FullReactionInfo;", "", "type", "", "count", "isChecked", "", "<init>", "(IIZ)V", "getType", "()I", "getCount", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class FullReactionInfo {
    public static final int $stable = 0;
    private final int count;
    private final boolean isChecked;
    private final int type;

    public FullReactionInfo(int i, int i2, boolean z) {
        this.type = i;
        this.count = i2;
        this.isChecked = z;
    }

    public static /* synthetic */ FullReactionInfo copy$default(FullReactionInfo fullReactionInfo, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = fullReactionInfo.type;
        }
        if ((i3 & 2) != 0) {
            i2 = fullReactionInfo.count;
        }
        if ((i3 & 4) != 0) {
            z = fullReactionInfo.isChecked;
        }
        return fullReactionInfo.copy(i, i2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    public final FullReactionInfo copy(int type, int count, boolean isChecked) {
        return new FullReactionInfo(type, count, isChecked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FullReactionInfo)) {
            return false;
        }
        FullReactionInfo fullReactionInfo = (FullReactionInfo) other;
        return this.type == fullReactionInfo.type && this.count == fullReactionInfo.count && this.isChecked == fullReactionInfo.isChecked;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isChecked) + oyr.b(this.count, Integer.hashCode(this.type) * 31, 31);
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public String toString() {
        int i = this.type;
        int i2 = this.count;
        return x4e.i(b64.s(i, i2, "FullReactionInfo(type=", ", count=", ", isChecked="), this.isChecked, Extension.C_BRAKE);
    }
}
