package xsna;

import com.vk.im.engine.models.contacts.Contact;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class pcj implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ pcj(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(Integer.valueOf(((Contact) obj).m.h()), Integer.valueOf(((Contact) obj2).m.h()));
            default:
                return jw5.b(Float.valueOf(((float[]) obj)[0]), Float.valueOf(((float[]) obj2)[0]));
        }
    }
}
