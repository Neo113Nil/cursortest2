package xsna;

import android.util.ArraySet;
import com.vk.im.engine.models.contacts.Contact;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ContactsStorageManager.kt */
/* loaded from: classes2.dex */
public interface hdj {
    void a(long j);

    void b();

    Contact c(long j);

    Map<Long, Contact> d(Collection<Long> collection);

    void e(Collection<Contact> collection);

    void f(Collection<Long> collection);

    boolean g();

    List<Contact> getAll();

    boolean h();

    void i(ArraySet arraySet);

    void j(boolean z);

    LinkedHashMap k(Collection collection);

    void l();

    void m(boolean z);

    void n(long j, long j2);

    boolean o();

    boolean p();

    void q(boolean z);
}
