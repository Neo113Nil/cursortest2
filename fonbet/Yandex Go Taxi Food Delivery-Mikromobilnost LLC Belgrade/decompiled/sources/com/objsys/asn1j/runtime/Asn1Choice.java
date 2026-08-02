package com.objsys.asn1j.runtime;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes11.dex */
public abstract class Asn1Choice extends Asn1Type {
    private static final long serialVersionUID = 6889852132238282206L;
    protected transient int choiceID = 0;
    protected transient Asn1Type element = null;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        objectInputStream.readShort();
        this.choiceID = objectInputStream.readInt();
        this.element = (Asn1Type) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeShort(1);
        objectOutputStream.writeInt(this.choiceID);
        objectOutputStream.writeObject(this.element);
    }

    public boolean equals(Object obj) {
        Asn1Choice asn1Choice = (Asn1Choice) obj;
        if (this.choiceID != asn1Choice.choiceID) {
            return false;
        }
        return this.element.equals(asn1Choice.element);
    }

    public int getChoiceID() {
        return this.choiceID;
    }

    public abstract String getElemName();

    public Asn1Type getElement() {
        return this.element;
    }

    public void setElement(int i, Asn1Type asn1Type) {
        this.choiceID = i;
        this.element = asn1Type;
    }
}
