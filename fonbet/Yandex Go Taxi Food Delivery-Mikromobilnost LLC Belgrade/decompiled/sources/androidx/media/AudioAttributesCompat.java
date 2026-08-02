package androidx.media;

import android.media.AudioAttributes;
import android.util.SparseIntArray;
import defpackage.ma31;
import defpackage.ryh;

/* loaded from: classes10.dex */
public class AudioAttributesCompat implements ma31 {
    public static final /* synthetic */ int b = 0;
    public AudioAttributesImpl a;

    public static class a {
        public final ryh a;

        public a() {
            int i = AudioAttributesCompat.b;
            this.a = new ryh();
        }

        public final AudioAttributesCompat a() {
            AudioAttributes build = ((AudioAttributes.Builder) this.a.b).build();
            AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
            audioAttributesImplApi26.a = build;
            audioAttributesImplApi26.b = -1;
            AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
            audioAttributesCompat.a = audioAttributesImplApi26;
            return audioAttributesCompat;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesImpl audioAttributesImpl = this.a;
        AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).a;
        return audioAttributesImpl == null ? audioAttributesImpl2 == null : audioAttributesImpl.equals(audioAttributesImpl2);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
