package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.DialogsFilter;

/* compiled from: TaskInvalidateHistoryViaNetwork.java */
/* loaded from: classes2.dex */
public final class i6o0 extends zzp0<Void> {
    public static final f9w h = e9w.a(i6o0.class);

    @NonNull
    public final com.vk.im.ui.components.dialogs_list.c d;
    public final p8v e;

    @NonNull
    public final String f;

    @Nullable
    public io.reactivex.rxjava3.disposables.c g;

    /* compiled from: TaskInvalidateHistoryViaNetwork.java */
    public static class a extends le6<Boolean> {

        @NonNull
        public final p8v b;

        @NonNull
        public final DialogsFilter c;

        @Nullable
        public final String d = "DialogsListPresenter";

        public a(@NonNull p8v p8vVar, @NonNull DialogsFilter dialogsFilter) {
            this.b = p8vVar;
            this.c = dialogsFilter;
        }

        @Override // xsna.le6
        public final Boolean e(@NonNull w2w w2wVar) throws Exception {
            p8v p8vVar = this.b;
            w2wVar.J0(this, new lrm(new drm((gkx0) p8vVar.c, this.c, p8vVar.b, Source.NETWORK, true, (Object) this, toString()))).await();
            Source source = Source.ACTUAL;
            w2wVar.J0(this, new gnm(source, true)).await();
            DialogsFilter dialogsFilter = DialogsFilter.BUSINESS_NOTIFY;
            String str = this.d;
            w2wVar.L0(this, new qpm(dialogsFilter, source, true, str));
            w2wVar.L0(this, new qpm(DialogsFilter.ARCHIVE, source, true, str));
            return Boolean.TRUE;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            p8v p8vVar = aVar.b;
            String str = aVar.d;
            if (!this.b.equals(p8vVar)) {
                return false;
            }
            String str2 = this.d;
            return str2 != null ? str2.equals(str) : str == null;
        }

        @Override // xsna.le6, xsna.e1w
        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.d;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // xsna.e1w
        public final String toString() {
            StringBuilder sb = new StringBuilder("RefreshCmd{args=");
            sb.append(this.b);
            sb.append(", changerTag=");
            return tq.f(sb, this.d, '}');
        }
    }

    public i6o0(@NonNull com.vk.im.ui.components.dialogs_list.c cVar, @NonNull p8v p8vVar, @NonNull String str) {
        this.d = cVar;
        this.e = p8vVar;
        this.f = str;
    }

    @Override // xsna.zzp0
    public final void a() {
        io.reactivex.rxjava3.disposables.c cVar = this.g;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.zzp0
    public final void c(Throwable th) {
        h.a(th);
        if (this.d.f() != null) {
            zk70.e(th);
        }
    }

    @Override // xsna.zzp0
    public final void d() {
        com.vk.im.ui.components.dialogs_list.c cVar = this.d;
        this.g = cVar.d.C(this, new a(this.e, cVar.i)).q(asu0.a.c()).subscribe(new h6o0(this));
    }

    @Override // xsna.zzp0
    public final void e(Void r5) {
        p8v p8vVar = this.e;
        gkx0 gkx0Var = (gkx0) p8vVar.c;
        int i = p8vVar.b;
        com.vk.im.ui.components.dialogs_list.c cVar = this.d;
        if (cVar.h.y) {
            return;
        }
        cVar.F(this, new com.vk.im.ui.components.dialogs_list.k(cVar, gkx0Var, i, true));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaskInvalidateHistoryViaNetwork{args=");
        sb.append(this.e);
        sb.append(",hp=");
        return i5s.a(sb, this.f, "}");
    }
}
