package xsna;

import com.vk.im.engine.models.dialogs.DialogsCounters;
import java.util.Collection;

/* compiled from: StorageTriggerHandler.kt */
/* loaded from: classes.dex */
public final class fil0 {
    public final w2w a;
    public volatile boolean c;
    public volatile boolean b = true;
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: StorageTriggerHandler.kt */
    /* loaded from: classes2.dex */
    public static final class a implements izs<DialogsCounters, s3q0> {
        public final /* synthetic */ Collection b;
        public final /* synthetic */ fil0 c;

        public a(Collection collection, fil0 fil0Var) {
            this.b = collection;
            this.c = fil0Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(DialogsCounters dialogsCounters) {
            DialogsCounters dialogsCounters2 = dialogsCounters;
            for (DialogsCounters.Type type : this.b) {
                fil0 fil0Var = this.c;
                fil0Var.getClass();
                Integer a = dialogsCounters2.a(type).a();
                if (a != null) {
                    fil0Var.a.S0().U(type, a.intValue());
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: StorageTriggerHandler.kt */
    /* loaded from: classes2.dex */
    public static final class b implements izs<DialogsCounters, s3q0> {
        public final /* synthetic */ DialogsCounters.Type c;

        public b(DialogsCounters.Type type) {
            this.c = type;
        }

        @Override // xsna.izs
        public final s3q0 invoke(DialogsCounters dialogsCounters) {
            fil0 fil0Var = fil0.this;
            fil0Var.getClass();
            DialogsCounters.Type type = this.c;
            Integer a = dialogsCounters.a(type).a();
            if (a != null) {
                fil0Var.a.S0().U(type, a.intValue());
            }
            return s3q0.a;
        }
    }

    public fil0(w2w w2wVar) {
        this.a = w2wVar;
    }

    public final boolean a() {
        return this.b && !this.c;
    }

    public final void b(DialogsCounters.Type type) {
        if (a()) {
            this.d.b(hg1.i(new io.reactivex.rxjava3.internal.operators.single.v(new gil0(this)).q(asu0.a.c()), new b(type)));
        }
    }

    public final void c(Collection<? extends DialogsCounters.Type> collection) {
        if (a()) {
            this.d.b(hg1.i(new io.reactivex.rxjava3.internal.operators.single.v(new gil0(this)).q(asu0.a.c()), new a(collection, this)));
        }
    }
}
