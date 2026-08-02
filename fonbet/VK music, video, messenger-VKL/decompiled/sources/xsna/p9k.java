package xsna;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.vk.contacts.AndroidContact;
import com.vk.log.L;
import java.lang.ref.WeakReference;

/* compiled from: CreatePhonebookContactDelegate.kt */
/* loaded from: classes2.dex */
public final class p9k {
    public final a1w a;
    public final szv b;
    public final com.vk.contacts.a c;
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();
    public io.reactivex.rxjava3.subjects.a<q2a0> e = new io.reactivex.rxjava3.subjects.a<>();

    /* compiled from: CreatePhonebookContactDelegate.kt */
    public static final class a {
        public volatile boolean a;
        public volatile ner0 b;
        public final n9k c;
        public final Handler d = new Handler(Looper.getMainLooper());

        public a(WeakReference weakReference, bu1 bu1Var) {
            this.c = new n9k(weakReference, this, bu1Var, 0);
        }
    }

    /* compiled from: CreatePhonebookContactDelegate.kt */
    public static abstract class b {

        /* compiled from: CreatePhonebookContactDelegate.kt */
        public static final class a extends b {
            public static final a a = new a();
        }

        /* compiled from: CreatePhonebookContactDelegate.kt */
        /* renamed from: xsna.p9k$b$b, reason: collision with other inner class name */
        public static final class C3500b extends b {
            public final long a;

            public C3500b(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3500b) && this.a == ((C3500b) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return vu5.a(')', this.a, new StringBuilder("ExistingContact(contactPeerId="));
            }
        }

        /* compiled from: CreatePhonebookContactDelegate.kt */
        public static final class c extends b {
            public final AndroidContact a;

            public c(AndroidContact androidContact) {
                this.a = androidContact;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "NonExistingContact(phonebookContact=" + this.a + ')';
            }
        }
    }

    public p9k(a1w a1wVar, szv szvVar, com.vk.contacts.a aVar) {
        this.a = a1wVar;
        this.b = szvVar;
        this.c = aVar;
    }

    public final io.reactivex.rxjava3.internal.operators.single.j a(Activity activity, String str) {
        if (!this.e.N0()) {
            this.e.onError(new IllegalStateException("CreatePhonebookContactDelegate create contact call before got result of previous"));
        }
        WeakReference weakReference = new WeakReference(activity);
        io.reactivex.rxjava3.subjects.a<q2a0> aVar = new io.reactivex.rxjava3.subjects.a<>();
        this.e = aVar;
        return new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.observable.c0(aVar, new pp3(new yf7(weakReference, this, str, 3), 17), io.reactivex.rxjava3.internal.functions.a.c).m0(), new cm4(this, 4));
    }

    public final void b(Activity activity, int i, int i2, Intent intent) {
        Uri data;
        if (i == 13289) {
            io.reactivex.rxjava3.subjects.a<q2a0> aVar = this.e;
            if (aVar.N0()) {
                return;
            }
            if (aVar.b.get() != io.reactivex.rxjava3.subjects.a.f || aVar.c == null) {
                if (i2 != -1) {
                    this.e.onComplete();
                } else if (intent != null && (data = intent.getData()) != null) {
                    szv.a(this.b, activity, null, new sk(12, this, data), new com.vk.movika.sdk.base.logic.processor.h(this, 28), new tbh(this, 5), 2);
                } else {
                    L.G("CreatePhonebookContactDelegate", "Error on contact creation");
                    this.e.onError(new RuntimeException("CreatePhonebookContactDelegate failed to create contact"));
                }
            }
        }
    }
}
