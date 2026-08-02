package androidx.media;

import android.media.AudioAttributes;
import defpackage.ka31;

/* loaded from: classes10.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(ka31 ka31Var) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) ka31Var.g(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = ka31Var.f(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, ka31 ka31Var) {
        ka31Var.getClass();
        ka31Var.k(audioAttributesImplApi26.a, 1);
        ka31Var.j(audioAttributesImplApi26.b, 2);
    }
}
