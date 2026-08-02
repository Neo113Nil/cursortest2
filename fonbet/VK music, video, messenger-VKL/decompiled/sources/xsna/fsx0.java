package xsna;

import com.vk.dto.common.Attachment;
import com.vk.feed.core.models.attachment.EntryAttachment;
import java.util.Iterator;
import java.util.List;

/* compiled from: WithAttachments.kt */
/* loaded from: classes18.dex */
public interface fsx0 {
    default boolean M6(Attachment attachment) {
        List<EntryAttachment> N7 = N7();
        if (N7 == null) {
            return false;
        }
        Iterator<EntryAttachment> it = N7.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (epx.f(it.next().b, attachment)) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    List<EntryAttachment> N7();

    default Attachment R1() {
        EntryAttachment entryAttachment;
        List<EntryAttachment> N7 = N7();
        if (N7 == null || (entryAttachment = (EntryAttachment) j5g.a0(N7)) == null) {
            return null;
        }
        return entryAttachment.b;
    }

    default int T2(Attachment attachment) {
        List<EntryAttachment> N7 = N7();
        if (N7 == null) {
            return -1;
        }
        Iterator<EntryAttachment> it = N7.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (epx.f(it.next().b, attachment)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    default void V5(int i, Attachment attachment) {
        EntryAttachment entryAttachment;
        List<EntryAttachment> N7 = N7();
        if (N7 == null || (entryAttachment = N7.get(i)) == null) {
            return;
        }
        entryAttachment.b = attachment;
    }

    default Attachment l9(int i) {
        EntryAttachment entryAttachment;
        List<EntryAttachment> N7 = N7();
        if (N7 == null || (entryAttachment = N7.get(i)) == null) {
            return null;
        }
        return entryAttachment.b;
    }
}
