package xsna;

import com.vk.music.bottomsheets.audiobook.person.model.AudioBookPersonModel;
import java.util.List;

/* compiled from: AudioBookPersonViewState.kt */
/* loaded from: classes3.dex */
public final class ti4 implements fm50 {
    public final yzt0<List<AudioBookPersonModel>> a;

    public ti4(h0u0 h0u0Var) {
        this.a = h0u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ti4) && epx.f(this.a, ((ti4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tr.c(new StringBuilder("PersonList(personList="), this.a, ')');
    }
}
