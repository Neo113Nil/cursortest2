package androidx.media;

import defpackage.ka31;
import defpackage.ma31;

/* loaded from: classes10.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(ka31 ka31Var) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        ma31 ma31Var = audioAttributesCompat.a;
        if (ka31Var.e(1)) {
            ma31Var = ka31Var.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) ma31Var;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, ka31 ka31Var) {
        ka31Var.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        ka31Var.i(1);
        ka31Var.l(audioAttributesImpl);
    }
}
