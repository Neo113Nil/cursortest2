package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.bridges.ImageViewer;
import com.vk.contacts.AndroidContact;
import com.vk.im.engine.di.scope.ImScope;
import com.vk.im.engine.models.dialogs.DialogExt;

/* compiled from: ProfileInfoModelFactory.kt */
/* loaded from: classes2.dex */
public abstract class vxd0 {

    /* compiled from: ProfileInfoModelFactory.kt */
    public static final class a extends vxd0 {
        public final wxd0 a;
        public final kkm b;

        public a(q9b q9bVar, kkm kkmVar) {
            this.a = q9bVar;
            this.b = kkmVar;
        }

        @Override // xsna.vxd0
        public final kkm a() {
            return this.b;
        }
    }

    /* compiled from: ProfileInfoModelFactory.kt */
    public static final class b extends vxd0 {
        public final FragmentActivity a;
        public final Context b;
        public final DialogExt c;
        public final ImScope d;
        public final a1w e;
        public final lzv f;
        public final kbj0 g;
        public final mxv h;
        public final zdw i;
        public final ImageViewer j;
        public final jbs k;
        public final b25 l;
        public final kkm m;

        public b(FragmentActivity fragmentActivity, Context context, DialogExt dialogExt, ImScope imScope, a1w a1wVar, lzv lzvVar, kbj0 kbj0Var, mxv mxvVar, zdw zdwVar, ImageViewer imageViewer, jbs jbsVar, b25 b25Var, kkm kkmVar) {
            this.a = fragmentActivity;
            this.b = context;
            this.c = dialogExt;
            this.d = imScope;
            this.e = a1wVar;
            this.f = lzvVar;
            this.g = kbj0Var;
            this.h = mxvVar;
            this.i = zdwVar;
            this.j = imageViewer;
            this.k = jbsVar;
            this.l = b25Var;
            this.m = kkmVar;
        }

        @Override // xsna.vxd0
        public final kkm a() {
            return this.m;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h) && epx.f(this.i, bVar.i) && epx.f(this.j, bVar.j) && epx.f(this.k, bVar.k) && epx.f(this.l, bVar.l) && epx.f(this.m, bVar.m);
        }

        public final int hashCode() {
            return this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "ForDelegationModel(activity=" + this.a + ", context=" + this.b + ", dialogExt=" + this.c + ", dependenciesScope=" + this.d + ", engine=" + this.e + ", cmdExecutor=" + this.f + ", sharingBridge=" + this.g + ", bridge=" + this.h + ", uiModule=" + this.i + ", imageViewer=" + this.j + ", launcher=" + this.k + ", authBridge=" + this.l + ", dialogThemeBinder=" + this.m + ')';
        }
    }

    /* compiled from: ProfileInfoModelFactory.kt */
    public static final class c extends vxd0 {
        public final Context a;
        public final mxv b;
        public final AndroidContact c;
        public final kkm d = new kkm(0);

        public c(Context context, mxv mxvVar, AndroidContact androidContact) {
            this.a = context;
            this.b = mxvVar;
            this.c = androidContact;
        }

        @Override // xsna.vxd0
        public final kkm a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "ForPhonebookContact(context=" + this.a + ", bridge=" + this.b + ", contact=" + this.c + ')';
        }
    }

    public abstract kkm a();
}
