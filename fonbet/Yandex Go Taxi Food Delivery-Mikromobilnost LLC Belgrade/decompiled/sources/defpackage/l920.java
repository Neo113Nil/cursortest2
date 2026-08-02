package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes11.dex */
public final class l920 {
    public static final Logger a = Logger.getLogger(l920.class.getName());

    /* JADX WARN: Removed duplicated region for block: B:28:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadataCollection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List a(InputStream inputStream) {
        Throwable th;
        IOException e;
        Logger logger = a;
        if (inputStream == null) {
            return Collections.EMPTY_LIST;
        }
        InputStream inputStream2 = null;
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
                try {
                    ?? r2 = new Externalizable() { // from class: com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadataCollection
                        private static final long serialVersionUID = 1;
                        private List<Phonemetadata$PhoneMetadata> metadata_ = new ArrayList();

                        public final List a() {
                            return this.metadata_;
                        }

                        @Override // java.io.Externalizable
                        public final void readExternal(ObjectInput objectInput) {
                            int readInt = objectInput.readInt();
                            for (int i = 0; i < readInt; i++) {
                                Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata = new Phonemetadata$PhoneMetadata();
                                phonemetadata$PhoneMetadata.readExternal(objectInput);
                                this.metadata_.add(phonemetadata$PhoneMetadata);
                            }
                        }

                        @Override // java.io.Externalizable
                        public final void writeExternal(ObjectOutput objectOutput) {
                            int size = this.metadata_.size();
                            objectOutput.writeInt(size);
                            for (int i = 0; i < size; i++) {
                                this.metadata_.get(i).writeExternal(objectOutput);
                            }
                        }
                    };
                    r2.readExternal(objectInputStream);
                    if (r2.a().isEmpty()) {
                        throw new IllegalStateException("Empty metadata");
                    }
                    List a2 = r2.a();
                    try {
                        objectInputStream.close();
                    } catch (IOException e2) {
                        logger.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e2);
                    }
                    return a2;
                } catch (IOException e3) {
                    e = e3;
                    throw new IllegalStateException("Unable to parse metadata file", e);
                }
            } catch (Throwable th2) {
                th = th2;
                if (0 == 0) {
                    try {
                        inputStream2.close();
                    } catch (IOException e4) {
                        logger.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e4);
                    }
                } else {
                    try {
                        inputStream.close();
                    } catch (IOException e5) {
                        logger.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e5);
                    }
                }
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
        } catch (Throwable th3) {
            th = th3;
            if (0 == 0) {
            }
            throw th;
        }
    }
}
