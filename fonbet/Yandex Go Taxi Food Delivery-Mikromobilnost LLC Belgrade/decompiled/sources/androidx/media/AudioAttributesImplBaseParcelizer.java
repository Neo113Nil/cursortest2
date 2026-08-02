package androidx.media;

import defpackage.ka31;

/* loaded from: classes10.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(ka31 ka31Var) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = ka31Var.f(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = ka31Var.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = ka31Var.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = ka31Var.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, ka31 ka31Var) {
        ka31Var.getClass();
        ka31Var.j(audioAttributesImplBase.a, 1);
        ka31Var.j(audioAttributesImplBase.b, 2);
        ka31Var.j(audioAttributesImplBase.c, 3);
        ka31Var.j(audioAttributesImplBase.d, 4);
    }
}
