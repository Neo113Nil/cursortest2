package com.google.i18n.phonenumbers;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class Phonemetadata$PhoneNumberDesc implements Externalizable {
    private static final long serialVersionUID = 1;
    private boolean hasExampleNumber;
    private boolean hasNationalNumberPattern;
    private String nationalNumberPattern_ = "";
    private List<Integer> possibleLength_ = new ArrayList();
    private List<Integer> possibleLengthLocalOnly_ = new ArrayList();
    private String exampleNumber_ = "";

    public final String a() {
        return this.nationalNumberPattern_;
    }

    public final int b() {
        return this.possibleLength_.get(0).intValue();
    }

    public final int c() {
        return this.possibleLength_.size();
    }

    public final List f() {
        return this.possibleLength_;
    }

    public final List g() {
        return this.possibleLengthLocalOnly_;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.hasNationalNumberPattern = true;
            this.nationalNumberPattern_ = readUTF;
        }
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            this.possibleLength_.add(Integer.valueOf(objectInput.readInt()));
        }
        int readInt2 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.possibleLengthLocalOnly_.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.hasExampleNumber = true;
            this.exampleNumber_ = readUTF2;
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.hasNationalNumberPattern);
        if (this.hasNationalNumberPattern) {
            objectOutput.writeUTF(this.nationalNumberPattern_);
        }
        int size = this.possibleLength_.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeInt(this.possibleLength_.get(i).intValue());
        }
        int size2 = this.possibleLengthLocalOnly_.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            objectOutput.writeInt(this.possibleLengthLocalOnly_.get(i2).intValue());
        }
        objectOutput.writeBoolean(this.hasExampleNumber);
        if (this.hasExampleNumber) {
            objectOutput.writeUTF(this.exampleNumber_);
        }
    }
}
