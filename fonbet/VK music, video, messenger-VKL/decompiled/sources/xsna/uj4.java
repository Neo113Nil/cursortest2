package xsna;

import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.music.audiobook.AudioBook;

/* compiled from: AudioBookCellVh.kt */
/* loaded from: classes16.dex */
public final class uj4 implements VkCell.f {
    public final AudioBook a;

    public uj4(AudioBook audioBook) {
        this.a = audioBook;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uj4) && this.a.equals(((uj4) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AudioBookRightExtraViewParams(audioBook=" + this.a + ", isMenuVisible=true)";
    }
}
