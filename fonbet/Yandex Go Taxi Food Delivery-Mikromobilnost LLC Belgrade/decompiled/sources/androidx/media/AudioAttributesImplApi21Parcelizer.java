package androidx.media;

import android.media.AudioAttributes;
import defpackage.ka31;

/* loaded from: classes10.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(ka31 ka31Var) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) ka31Var.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = ka31Var.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, ka31 ka31Var) {
        ka31Var.getClass();
        ka31Var.k(audioAttributesImplApi21.a, 1);
        ka31Var.j(audioAttributesImplApi21.b, 2);
    }
}
