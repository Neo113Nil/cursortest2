package xsna;

import com.vk.im.engine.models.contacts.Contact;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class ncj<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return jw5.b(((Contact) t).c, ((Contact) t2).c);
    }
}
