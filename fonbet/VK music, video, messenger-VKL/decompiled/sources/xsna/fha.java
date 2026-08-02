package xsna;

import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference0Impl;
import xsna.hg1;

/* compiled from: CatalogStoriesDelegate.kt */
/* loaded from: classes16.dex */
public final class fha {
    public final m3a a;
    public final q3a b;
    public io.reactivex.rxjava3.disposables.c c;
    public io.reactivex.rxjava3.disposables.c d;
    public final Object e;
    public final Object f;

    /* compiled from: CatalogStoriesDelegate.kt */
    public static final class a implements l3a {
        public final View a;
        public final StoryOwner b;
        public final MobileOfficialAppsConStoriesStat$ViewEntryPoint c;
        public final MobileOfficialAppsCoreNavStat$EventScreen d;
        public final gzs<s3q0> e;

        public a(View view, StoryOwner storyOwner, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, gzs<s3q0> gzsVar) {
            this.a = view;
            this.b = storyOwner;
            this.c = mobileOfficialAppsConStoriesStat$ViewEntryPoint;
            this.d = mobileOfficialAppsCoreNavStat$EventScreen;
            this.e = gzsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
            gzs<s3q0> gzsVar = this.e;
            return hashCode + (gzsVar == null ? 0 : gzsVar.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StoriesClickEvent(anchor=");
            sb.append(this.a);
            sb.append(", storyOwner=");
            sb.append(this.b);
            sb.append(", viewEntryPoint=");
            sb.append(this.c);
            sb.append(", screen=");
            sb.append(this.d);
            sb.append(", onEmptyStoriesLoaded=");
            return uf3.d(sb, this.e, ')');
        }
    }

    /* compiled from: CatalogStoriesDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<UserId, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(UserId userId) {
            UserId userId2 = userId;
            fha fhaVar = (fha) this.receiver;
            q3a q3aVar = fhaVar.b;
            q3aVar.b(new buz(12, new he3(3, fhaVar, userId2), new at0(1, fhaVar, userId2)), false);
            q3aVar.b(new t8f0(new d05(5, fhaVar, userId2), false), false);
            return s3q0.a;
        }
    }

    public fha(m3a m3aVar, q3a q3aVar, PropertyReference0Impl propertyReference0Impl, PropertyReference0Impl propertyReference0Impl2) {
        this.a = m3aVar;
        this.b = q3aVar;
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.c = emptyDisposable;
        this.d = emptyDisposable;
        we0 we0Var = new we0(propertyReference0Impl, 12);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, we0Var);
        this.f = msy.a(lazyThreadSafetyMode, new s1(propertyReference0Impl2, 13));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void a() {
        oul0 oul0Var = (oul0) this.f.getValue();
        this.c.dispose();
        this.d.dispose();
        this.c = oul0Var.a(new b(1, this, fha.class, "markStoriesAsSeenLocal", "markStoriesAsSeenLocal(Lcom/vk/dto/common/id/UserId;)V", 0));
        io.reactivex.rxjava3.subjects.f fVar = (io.reactivex.rxjava3.subjects.f) this.a.b;
        hg1.m mVar = new hg1.m();
        fVar.getClass();
        this.d = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, mVar).U(new hg1.l()).subscribe(new xn(new p1(this, 17), 6));
    }

    public final void b() {
        this.c.dispose();
        this.d.dispose();
    }
}
