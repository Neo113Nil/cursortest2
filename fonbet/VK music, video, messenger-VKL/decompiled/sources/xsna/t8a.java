package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.hg1;

/* compiled from: CatalogLivesDelegate.kt */
/* loaded from: classes16.dex */
public final class t8a {
    public final m3a a;
    public final g7s0 b;
    public final o0r0 c;
    public io.reactivex.rxjava3.disposables.c d = EmptyDisposable.INSTANCE;
    public UserId e;

    /* compiled from: CatalogLivesDelegate.kt */
    public static final class a implements l3a {
        public final Context a;
        public final UserId b;
        public final MobileOfficialAppsCoreNavStat$EventScreen c;
        public final izs<qs80, s3q0> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Context context, UserId userId, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, izs<? super qs80, s3q0> izsVar) {
            this.a = context;
            this.b = userId;
            this.c = mobileOfficialAppsCoreNavStat$EventScreen;
            this.d = izsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int a = bh10.a(this.a.hashCode() * 31, 31, this.b.b);
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.c;
            return this.d.hashCode() + ((a + (mobileOfficialAppsCoreNavStat$EventScreen == null ? 0 : mobileOfficialAppsCoreNavStat$EventScreen.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AvatarLivesClickEvent(context=");
            sb.append(this.a);
            sb.append(", groupId=");
            sb.append(this.b);
            sb.append(", navScreen=");
            sb.append(this.c);
            sb.append(", callback=");
            return up.c(sb, this.d, ')');
        }
    }

    /* compiled from: CatalogLivesDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(a aVar) {
            a aVar2 = aVar;
            t8a t8aVar = (t8a) this.receiver;
            UserId userId = t8aVar.e;
            UserId userId2 = aVar2.b;
            if (!epx.f(userId, userId2)) {
                Context context = aVar2.a;
                t8aVar.e = userId2;
                t8aVar.b.Y().q(context, userId2, aVar2.c, new go3(aVar2, t8aVar, context, userId2, 1));
            }
            return s3q0.a;
        }
    }

    public t8a(m3a m3aVar, g7s0 g7s0Var, o0r0 o0r0Var) {
        this.a = m3aVar;
        this.b = g7s0Var;
        this.c = o0r0Var;
    }

    public final void a() {
        this.d.dispose();
        io.reactivex.rxjava3.subjects.f fVar = (io.reactivex.rxjava3.subjects.f) this.a.b;
        hg1.i iVar = new hg1.i();
        fVar.getClass();
        this.d = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, iVar).U(new hg1.h()).subscribe(new b00(new b(1, this, t8a.class, "handleClick", "handleClick(Lcom/vk/catalog2/common/ui/holders/util/CatalogLivesDelegate$AvatarLivesClickEvent;)V", 0), 7));
    }
}
