package com.objsys.asn1j.runtime;

import java.io.IOException;

/* loaded from: classes11.dex */
public class Asn1BerDecodeContext {
    protected int mDecBufByteCount;
    protected Asn1BerDecodeBuffer mDecodeBuffer;
    protected int mElemLength;
    protected boolean mExplicitTagging;
    protected Asn1Tag mTagHolder = new Asn1Tag();

    public Asn1BerDecodeContext(Asn1BerDecodeBuffer asn1BerDecodeBuffer, int i) {
        this.mDecodeBuffer = asn1BerDecodeBuffer;
        this.mDecBufByteCount = asn1BerDecodeBuffer.getByteCount();
        this.mElemLength = i;
    }

    public boolean expired() throws Asn1Exception, IOException {
        if (this.mElemLength != -9999) {
            return this.mDecodeBuffer.getByteCount() - this.mDecBufByteCount >= this.mElemLength;
        }
        boolean matchTag = this.mDecodeBuffer.matchTag((short) 0, (short) 0, 0, null, new IntHolder());
        if (matchTag) {
            this.mDecodeBuffer.reset();
        }
        return matchTag;
    }

    public boolean matchElemTag(short s, short s2, int i, IntHolder intHolder, boolean z) throws Asn1Exception, IOException {
        if (expired()) {
            return false;
        }
        boolean matchTag = this.mDecodeBuffer.matchTag(s, s2, i, this.mTagHolder, intHolder);
        if (this.mElemLength != -9999 && intHolder.value != -9999) {
            int byteCount = this.mDecodeBuffer.getByteCount() - this.mDecBufByteCount;
            int i2 = intHolder.value;
            if (i2 < 0 || i2 > this.mElemLength - byteCount) {
                throw new Asn1InvalidLengthException();
            }
        }
        if (matchTag && !z) {
            this.mDecodeBuffer.reset();
        }
        return matchTag;
    }

    public boolean matchElemTag(Asn1Tag asn1Tag, IntHolder intHolder, boolean z) throws Asn1Exception, IOException {
        return matchElemTag(asn1Tag.mClass, asn1Tag.mForm, asn1Tag.mIDCode, intHolder, z);
    }
}
