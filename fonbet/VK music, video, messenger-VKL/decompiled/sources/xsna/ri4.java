package xsna;

import com.vk.music.bottomsheets.audiobook.person.model.AudioBookPersonModel;
import java.util.List;

/* compiled from: AudioBookPersonState.kt */
/* loaded from: classes3.dex */
public final class ri4 implements km50 {
    public final List<AudioBookPersonModel> b;
    public final List<vh4> c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ri4() {
        this(3, r0, r0);
        List list = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri4)) {
            return false;
        }
        ri4 ri4Var = (ri4) obj;
        return epx.f(this.b, ri4Var.b) && epx.f(this.c, ri4Var.c);
    }

    public final int hashCode() {
        List<AudioBookPersonModel> list = this.b;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<vh4> list2 = this.c;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBookPersonState(personList=");
        sb.append(this.b);
        sb.append(", actionItemList=");
        return ms9.a(')', sb, this.c);
    }

    public /* synthetic */ ri4(int i, List list, List list2) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }

    public ri4(List<AudioBookPersonModel> list, List<vh4> list2) {
        this.b = list;
        this.c = list2;
    }
}
