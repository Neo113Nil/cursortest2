package com.yandex.payment.sdk.transportcards.nfc.model;

import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/yandex/payment/sdk/transportcards/nfc/model/ReadBlocks;", "", "block", "", "value", "", "<init>", "(ILjava/lang/String;)V", "getBlock", "()I", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReadBlocks {
    private final int block;
    private final String value;

    public ReadBlocks(int i, String str) {
        this.block = i;
        this.value = str;
    }

    public static /* synthetic */ ReadBlocks copy$default(ReadBlocks readBlocks, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = readBlocks.block;
        }
        if ((i2 & 2) != 0) {
            str = readBlocks.value;
        }
        return readBlocks.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBlock() {
        return this.block;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final ReadBlocks copy(int block, String value) {
        return new ReadBlocks(block, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadBlocks)) {
            return false;
        }
        ReadBlocks readBlocks = (ReadBlocks) other;
        return this.block == readBlocks.block && jl40.l(this.value, readBlocks.value);
    }

    public final int getBlock() {
        return this.block;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (Integer.hashCode(this.block) * 31);
    }

    public String toString() {
        return oyr.l(this.block, "ReadBlocks(block=", ", value=", this.value, Extension.C_BRAKE);
    }
}
