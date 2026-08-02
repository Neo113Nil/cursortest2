package defpackage;

import com.yandex.payment.sdk.nfcscanner.tools.ownimpl.enums.TagTypeEnum;
import com.yandex.payment.sdk.nfcscanner.tools.ownimpl.enums.TagValueTypeEnum;
import com.yandex.payment.sdk.nfcscanner.tools.ownimpl.models.INfcTag$Class;
import java.util.Arrays;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;

/* loaded from: classes2.dex */
public final class la60 {
    public final byte[] a;
    public final TagValueTypeEnum b;
    public final String c;
    public final INfcTag$Class d;
    public final TagTypeEnum e;

    public la60(byte[] bArr, TagValueTypeEnum tagValueTypeEnum, String str) {
        this.a = bArr;
        this.b = tagValueTypeEnum;
        this.c = str;
        if (bArr.length == 0) {
            ny61.g("Param id cannot be empty");
            throw null;
        }
        byte b = bArr[0];
        byte b2 = (byte) ((b >>> 6) & 3);
        this.d = b2 == 1 ? INfcTag$Class.APPLICATION : b2 == 2 ? INfcTag$Class.CONTEXT_SPECIFIC : b2 == 3 ? INfcTag$Class.PRIVATE : INfcTag$Class.UNIVERSAL;
        this.e = (b & BlobHeaderStructure.BLOB_VERSION) != 0 ? TagTypeEnum.CONSTRUCTED : TagTypeEnum.PRIMITIVE;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof la60)) {
            return false;
        }
        byte[] bArr = this.a;
        int length = bArr.length;
        byte[] bArr2 = ((la60) obj).a;
        if (length != bArr2.length) {
            return false;
        }
        return Arrays.equals(bArr, bArr2);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + 177;
    }

    public final String toString() {
        return "Tag[" + cdb1.c("%02x ", this.a) + "] Name=" + this.c + ", TagType=" + this.e + ", ValueType=" + this.b + ", Class=" + this.d;
    }

    public la60(String str, TagValueTypeEnum tagValueTypeEnum, String str2) {
        this(cdb1.d(str), tagValueTypeEnum, str2);
    }
}
