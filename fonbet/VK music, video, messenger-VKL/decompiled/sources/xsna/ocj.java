package xsna;

import com.vk.im.engine.models.contacts.Contact;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class ocj implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ ocj(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(((Contact) obj).c, ((Contact) obj2).c);
            default:
                return jw5.b(Integer.valueOf(((com.vk.im.engine.models.dialogs.b) obj2).b()), Integer.valueOf(((com.vk.im.engine.models.dialogs.b) obj).b()));
        }
    }
}
