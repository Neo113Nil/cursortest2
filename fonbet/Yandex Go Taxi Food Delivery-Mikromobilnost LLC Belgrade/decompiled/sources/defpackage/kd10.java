package defpackage;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesCompat;

/* loaded from: classes10.dex */
public final class kd10 {
    public kd10(int i) {
        AudioAttributesCompat.a aVar = new AudioAttributesCompat.a();
        ((AudioAttributes.Builder) aVar.a.b).setLegacyStreamType(i);
        aVar.a();
    }
}
