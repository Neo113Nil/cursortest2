package xsna;

import com.vk.voip.media.mute.model.VoipMediaMuteOption;
import com.vk.voip.ui.prodstat.analytics.base.screen.VoipAnalyticsEventScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.media_options.MediaOption;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import xsna.jdw0;

/* compiled from: VoipMediaMuteAnalyticsDelegateImpl.kt */
/* loaded from: classes11.dex */
public final class srw0 implements kdw0<b>, jdw0.b {
    public static final a b = new a();
    public final c3x0 a;

    /* compiled from: VoipMediaMuteAnalyticsDelegateImpl.kt */
    public static final class a implements jdw0.a {
        @Override // xsna.jdw0.a
        public final boolean a(mdw0 mdw0Var) {
            return mdw0Var instanceof b;
        }
    }

    /* compiled from: VoipMediaMuteAnalyticsDelegateImpl.kt */
    /* loaded from: classes7.dex */
    public static final class c {
        public final FunctionReferenceImpl a;
        public final izs<Boolean, s3q0> b;
        public final izs<Boolean, s3q0> c;
        public final FunctionReferenceImpl d;
        public final FunctionReferenceImpl e;

        /* JADX WARN: Multi-variable type inference failed */
        public c(izs<? super Boolean, s3q0> izsVar, izs<? super Boolean, s3q0> izsVar2, izs<? super Boolean, s3q0> izsVar3, izs<? super Boolean, s3q0> izsVar4, izs<? super Boolean, s3q0> izsVar5) {
            this.a = (FunctionReferenceImpl) izsVar;
            this.b = izsVar2;
            this.c = izsVar3;
            this.d = (FunctionReferenceImpl) izsVar4;
            this.e = (FunctionReferenceImpl) izsVar5;
        }

        public final izs<Boolean, s3q0> a() {
            return this.c;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs<java.lang.Boolean, xsna.s3q0>] */
        public final izs<Boolean, s3q0> b() {
            return this.a;
        }

        public final izs<Boolean, s3q0> c() {
            return this.b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs<java.lang.Boolean, xsna.s3q0>] */
        public final izs<Boolean, s3q0> d() {
            return this.d;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs<java.lang.Boolean, xsna.s3q0>] */
        public final izs<Boolean, s3q0> e() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b.equals(cVar.b) && this.c.equals(cVar.c) && this.d.equals(cVar.d) && this.e.equals(cVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + dq.c(dq.c(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
        }

        public final String toString() {
            return "MuteListener(onAdminMicsAndCameraDisabled=" + this.a + ", onAdminMicsDisabled=" + this.b + ", onAdminCameraDisabled=" + this.c + ", onAdminScreenSharingDisabled=" + this.d + ", onAdminWatchTogetherDisabled=" + this.e + ')';
        }
    }

    /* compiled from: VoipMediaMuteAnalyticsDelegateImpl.kt */
    /* loaded from: classes7.dex */
    public interface d {

        /* compiled from: VoipMediaMuteAnalyticsDelegateImpl.kt */
        public static final class a implements d {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1673786566;
            }

            public final String toString() {
                return "All";
            }
        }

        /* compiled from: VoipMediaMuteAnalyticsDelegateImpl.kt */
        public static final class b implements d {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -347173550;
            }

            public final String toString() {
                return "User";
            }
        }
    }

    public srw0(c3x0 c3x0Var) {
        this.a = c3x0Var;
    }

    public static void c(List list, c cVar) {
        if (ksw0.d(list) && ksw0.a(list)) {
            cVar.b().invoke(Boolean.valueOf(ksw0.f(list) || ksw0.c(list)));
            return;
        }
        if (ksw0.f(list)) {
            cVar.c().invoke(Boolean.TRUE);
            return;
        }
        if (ksw0.e(list)) {
            cVar.c().invoke(Boolean.FALSE);
            return;
        }
        if (ksw0.c(list)) {
            cVar.a().invoke(Boolean.TRUE);
            return;
        }
        if (ksw0.b(list)) {
            cVar.a().invoke(Boolean.FALSE);
            return;
        }
        if (ksw0.h(list)) {
            cVar.d().invoke(Boolean.TRUE);
            return;
        }
        if (ksw0.g(list)) {
            cVar.d().invoke(Boolean.FALSE);
        } else if (ksw0.j(list)) {
            cVar.e().invoke(Boolean.TRUE);
        } else if (ksw0.i(list)) {
            cVar.e().invoke(Boolean.FALSE);
        }
    }

    @Override // xsna.jdw0.b
    public final boolean a(mdw0 mdw0Var) {
        if (!(mdw0Var instanceof b)) {
            return false;
        }
        b((b) mdw0Var);
        return true;
    }

    @Override // xsna.kdw0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void b(b bVar) {
        boolean z = bVar instanceof b.C3687b;
        c3x0 c3x0Var = this.a;
        if (z) {
            b.C3687b c3687b = (b.C3687b) bVar;
            d c2 = c3687b.c();
            if (c2 instanceof d.b) {
                c(c3687b.b(), new c(new xrw0(c3x0Var), new yrw0(c3x0Var), new zrw0(c3x0Var), new asw0(c3x0Var), new bsw0(c3x0Var)));
                return;
            } else {
                if (!(c2 instanceof d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                c(c3687b.b(), new c(new csw0(c3x0Var), new vnb0(9, this, c3687b), new csk0(7, this, c3687b), new dsw0(c3x0Var), new wrw0(c3x0Var)));
                return;
            }
        }
        if (!(bVar instanceof b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        b.a aVar = (b.a) bVar;
        d c3 = aVar.c();
        if (c3 instanceof d.b) {
            List<VoipMediaMuteOption> b2 = aVar.b();
            trw0 trw0Var = new trw0(c3x0Var);
            urw0 urw0Var = new urw0(c3x0Var);
            vrw0 vrw0Var = new vrw0(c3x0Var);
            VoipMediaMuteOption voipMediaMuteOption = VoipMediaMuteOption.MICROPHONE;
            if (b2.contains(voipMediaMuteOption) && b2.contains(VoipMediaMuteOption.CAMERA)) {
                trw0Var.invoke();
                return;
            } else if (b2.contains(voipMediaMuteOption)) {
                urw0Var.invoke();
                return;
            } else {
                if (b2.contains(VoipMediaMuteOption.CAMERA)) {
                    vrw0Var.invoke();
                    return;
                }
                return;
            }
        }
        if (!(c3 instanceof d.a)) {
            throw new NoWhenBranchMatchedException();
        }
        List<VoipMediaMuteOption> b3 = aVar.b();
        t9b t9bVar = new t9b(24, this, aVar);
        pk pkVar = new pk(25, this, aVar);
        qk qkVar = new qk(25, this, aVar);
        VoipMediaMuteOption voipMediaMuteOption2 = VoipMediaMuteOption.MICROPHONE;
        if (b3.contains(voipMediaMuteOption2) && b3.contains(VoipMediaMuteOption.CAMERA)) {
            t9bVar.invoke();
        } else if (b3.contains(voipMediaMuteOption2)) {
            pkVar.invoke();
        } else if (b3.contains(VoipMediaMuteOption.CAMERA)) {
            qkVar.invoke();
        }
    }

    /* compiled from: VoipMediaMuteAnalyticsDelegateImpl.kt */
    /* loaded from: classes7.dex */
    public interface b extends mdw0 {

        /* compiled from: VoipMediaMuteAnalyticsDelegateImpl.kt */
        public static final class a implements b {
            public final String a;
            public final d b;
            public final List<VoipMediaMuteOption> c;

            public a() {
                throw null;
            }

            public a(String str, d dVar, Set set) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(hsw0.a((MediaOption) it.next()));
                }
                List<VoipMediaMuteOption> O0 = j5g.O0(linkedHashSet);
                this.a = str;
                this.b = dVar;
                this.c = O0;
            }

            public final List<VoipMediaMuteOption> b() {
                return this.c;
            }

            public final d c() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AskUnmute(screen=");
                sb.append((Object) VoipAnalyticsEventScreen.d(this.a));
                sb.append(", userArea=");
                sb.append(this.b);
                sb.append(", mediaOption=");
                return ms9.a(')', sb, this.c);
            }
        }

        /* compiled from: VoipMediaMuteAnalyticsDelegateImpl.kt */
        /* renamed from: xsna.srw0$b$b, reason: collision with other inner class name */
        public static final class C3687b implements b {
            public final String a;
            public final d b;
            public final List<jsw0> c;

            public C3687b() {
                throw null;
            }

            public C3687b(d dVar, Pair pair) {
                this("", dVar, Collections.singletonList(new jsw0(hsw0.a((MediaOption) pair.i()), isw0.a((MediaOptionState) pair.j()))));
            }

            public final List<jsw0> b() {
                return this.c;
            }

            public final d c() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3687b)) {
                    return false;
                }
                C3687b c3687b = (C3687b) obj;
                return epx.f(this.a, c3687b.a) && epx.f(this.b, c3687b.b) && epx.f(this.c, c3687b.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Mute(screen=");
                sb.append((Object) VoipAnalyticsEventScreen.d(this.a));
                sb.append(", userArea=");
                sb.append(this.b);
                sb.append(", mediaMuteState=");
                return ms9.a(')', sb, this.c);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public C3687b(String str, d dVar, Map map) {
                this(str, dVar, r0);
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(new jsw0(hsw0.a((MediaOption) entry.getKey()), isw0.a((MediaOptionState) entry.getValue())));
                }
            }

            public C3687b(String str, d dVar, List list) {
                this.a = str;
                this.b = dVar;
                this.c = list;
            }

            public /* synthetic */ C3687b(d dVar, Map map) {
                this("", dVar, map);
            }
        }
    }
}
