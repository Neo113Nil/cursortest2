package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.im.engine.models.contacts.Contact;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: NewContactsNotifyManager.kt */
/* loaded from: classes.dex */
public final class x660 {
    public final Context a;
    public final a1w b;
    public final String c;
    public final io.reactivex.rxjava3.core.w d;
    public final rej e;
    public final CopyOnWriteArrayList<Contact> f;
    public final CopyOnWriteArrayList<q660> g;
    public final bpn0 h;
    public final io.reactivex.rxjava3.disposables.b i;

    /* compiled from: NewContactsNotifyManager.kt */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Collection<? extends Contact>, s3q0> {
        public a(x660 x660Var) {
            super(1, x660Var, x660.class, "handleNewContacts", "handleNewContacts(Ljava/util/Collection;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Collection<? extends Contact> collection) {
            Object next;
            x660 x660Var = (x660) this.receiver;
            long j = ((SharedPreferences) x660Var.h.getValue()).getLong("import_time_threshold", 0L);
            ArrayList arrayList = new ArrayList();
            for (Object obj : collection) {
                if (((Contact) obj).l > j) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty() && ((Boolean) x660Var.e.invoke(arrayList)).booleanValue()) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        long j2 = ((Contact) next).l;
                        do {
                            Object next2 = it.next();
                            long j3 = ((Contact) next2).l;
                            if (j2 < j3) {
                                next = next2;
                                j2 = j3;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                Contact contact = (Contact) next;
                ((SharedPreferences) x660Var.h.getValue()).edit().putLong("import_time_threshold", (contact != null ? Long.valueOf(contact.l) : null).longValue()).apply();
                x660Var.f.addAll(arrayList);
                Iterator<q660> it2 = x660Var.g.iterator();
                while (it2.hasNext()) {
                    it2.next().a(arrayList);
                }
            }
            return s3q0.a;
        }
    }

    public x660() {
        throw null;
    }

    public x660(Context context, a1w a1wVar, rej rejVar) {
        asu0.a.getClass();
        io.reactivex.rxjava3.core.w wVar = (io.reactivex.rxjava3.core.w) asu0.i0.getValue();
        this.a = context;
        this.b = a1wVar;
        this.c = "new_contacts_notify_manager_config";
        this.d = wVar;
        this.e = rejVar;
        this.f = new CopyOnWriteArrayList<>();
        this.g = new CopyOnWriteArrayList<>();
        this.h = new bpn0(new s0f(this, 6));
        this.i = new io.reactivex.rxjava3.disposables.b();
    }

    public final void a(long j) {
        Contact contact;
        Iterator<Contact> it = this.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                contact = null;
                break;
            } else {
                contact = it.next();
                if (contact.G3() == j) {
                    break;
                }
            }
        }
        Contact contact2 = contact;
        if (contact2 != null) {
            Iterator<q660> it2 = this.g.iterator();
            while (it2.hasNext()) {
                it2.next().b(Collections.singletonList(contact2));
            }
        }
    }

    public final synchronized void b() {
        this.i.b(this.b.l.a().b0(g480.class).a0(this.d).subscribe(new q440(new owv(this, 14), 3)));
        this.i.b(this.b.l.a().b0(s380.class).a0(this.d).subscribe(new oo20(new pb00(this, 9), 5)));
        this.i.b(this.b.l.a().b0(l380.class).a0(this.d).subscribe(new lav(new zl20(this, 10), 12)));
        this.i.b(new io.reactivex.rxjava3.internal.operators.flowable.l(new io.reactivex.rxjava3.internal.operators.flowable.r(new io.reactivex.rxjava3.internal.operators.flowable.c0(new io.reactivex.rxjava3.internal.operators.observable.i0(this.b.l.a().a0(this.d), new d9(new n9w(11), 27)).D0(BackpressureStrategy.LATEST).g(new fl40(new f410(this, 14), 1), 1), new v34(new l140(2), 16)), new x34(new quz(7), 20))).subscribe(new c2y(new a(this), 12)));
    }
}
