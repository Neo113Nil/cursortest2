package com.objsys.asn1j.runtime;

import java.io.PrintStream;

/* loaded from: classes11.dex */
public abstract class Asn1PerTraceHandler {
    protected Asn1PerBitFieldList mBitFieldList;
    private Asn1PerMessageBuffer mMessageBuffer;

    public Asn1PerTraceHandler(Asn1PerMessageBuffer asn1PerMessageBuffer) {
        this.mMessageBuffer = asn1PerMessageBuffer;
    }

    public void addElemName(String str, int i) {
        Asn1PerBitFieldList asn1PerBitFieldList = this.mBitFieldList;
        if (asn1PerBitFieldList != null) {
            asn1PerBitFieldList.addElemName(str, i);
        }
    }

    public abstract void enable();

    public Asn1PerBitFieldList getBitFieldList() {
        return this.mBitFieldList;
    }

    public void newBitField(String str, int i) {
        Asn1PerBitFieldList asn1PerBitFieldList = this.mBitFieldList;
        if (asn1PerBitFieldList != null) {
            asn1PerBitFieldList.newBitField(str, this.mMessageBuffer.getMsgBitCnt(), i);
        }
    }

    public abstract void print(PrintStream printStream, String str);

    public void removeLastElemName() {
        Asn1PerBitFieldList asn1PerBitFieldList = this.mBitFieldList;
        if (asn1PerBitFieldList != null) {
            asn1PerBitFieldList.removeLastElemName();
        }
    }

    public abstract void reset();

    public void setBitCount() {
        Asn1PerBitField currBitField;
        Asn1PerBitFieldList asn1PerBitFieldList = this.mBitFieldList;
        if (asn1PerBitFieldList == null || (currBitField = asn1PerBitFieldList.getCurrBitField()) == null) {
            return;
        }
        currBitField.setBitCount(this.mMessageBuffer.getMsgBitCnt() - currBitField.getBitOffset());
    }

    public void setBitOffset() {
        Asn1PerBitFieldList asn1PerBitFieldList = this.mBitFieldList;
        if (asn1PerBitFieldList != null) {
            asn1PerBitFieldList.setBitOffset(this.mMessageBuffer.getMsgBitCnt());
        }
    }
}
