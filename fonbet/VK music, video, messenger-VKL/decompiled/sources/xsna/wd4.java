package xsna;

import com.vk.music.bottomsheets.audiobook.presentation.model.AudioBookModel;
import java.util.List;

/* compiled from: AudioBookBottomSheetState.kt */
/* loaded from: classes3.dex */
public final class wd4 implements km50 {
    public final AudioBookModel b;
    public final List<s10> c;

    public wd4(AudioBookModel audioBookModel, List<s10> list) {
        this.b = audioBookModel;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd4)) {
            return false;
        }
        wd4 wd4Var = (wd4) obj;
        return epx.f(this.b, wd4Var.b) && epx.f(this.c, wd4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBookBottomSheetState(audioBook=");
        sb.append(this.b);
        sb.append(", actionList=");
        return ms9.a(')', sb, this.c);
    }
}
