package xsna;

import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewResult;
import com.vk.clips.upload.ui.impl.compose.state.viewstate.TrendingHashtagUiDto;

/* compiled from: ClipsUploadActionInternal.kt */
/* loaded from: classes17.dex */
public interface mbf {

    /* compiled from: ClipsUploadActionInternal.kt */
    public interface a extends mbf {

        /* compiled from: ClipsUploadActionInternal.kt */
        /* renamed from: xsna.mbf$a$a, reason: collision with other inner class name */
        public static final class C3331a implements a {
            public final m36 a;

            public C3331a(m36 m36Var) {
                this.a = m36Var;
            }

            @Override // xsna.mbf.a
            public final m36 getType() {
                return this.a;
            }
        }

        m36 getType();
    }

    /* compiled from: ClipsUploadActionInternal.kt */
    public interface b extends mbf {

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class a implements b {
            public final zoa a;

            public a(zoa zoaVar) {
                this.a = zoaVar;
            }

            @Override // xsna.mbf.b
            public final zoa getType() {
                return this.a;
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        /* renamed from: xsna.mbf$b$b, reason: collision with other inner class name */
        public static final class C3332b implements b {
            public final zoa a;

            public C3332b(zoa zoaVar) {
                this.a = zoaVar;
            }

            @Override // xsna.mbf.b
            public final zoa getType() {
                return this.a;
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class c implements b {
            public final zoa a;
            public final String b;

            public c(zoa zoaVar, String str) {
                this.a = zoaVar;
                this.b = str;
            }

            @Override // xsna.mbf.b
            public final zoa getType() {
                return this.a;
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class d implements b {
            public final zoa a;

            public d(zoa zoaVar) {
                this.a = zoaVar;
            }

            @Override // xsna.mbf.b
            public final zoa getType() {
                return this.a;
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class e implements b {
            public final zoa a;
            public final int b;

            public e(zoa zoaVar, int i) {
                this.a = zoaVar;
                this.b = i;
            }

            @Override // xsna.mbf.b
            public final zoa getType() {
                return this.a;
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class f implements b {
            public final zoa a;

            public f(zoa zoaVar) {
                this.a = zoaVar;
            }

            @Override // xsna.mbf.b
            public final zoa getType() {
                return this.a;
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class g implements b {
            public final zoa a;

            public g(zoa zoaVar) {
                this.a = zoaVar;
            }

            @Override // xsna.mbf.b
            public final zoa getType() {
                return this.a;
            }
        }

        zoa getType();
    }

    /* compiled from: ClipsUploadActionInternal.kt */
    public interface c extends mbf {

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class a implements c {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1962598601;
            }

            public final String toString() {
                return "AfterErrorReloadRequested";
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class b implements c {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1179675656;
            }

            public final String toString() {
                return "DraftClicked";
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        /* renamed from: xsna.mbf$c$c, reason: collision with other inner class name */
        public static final class C3333c implements c {
            public static final C3333c a = new C3333c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3333c);
            }

            public final int hashCode() {
                return -1190018345;
            }

            public final String toString() {
                return "OnAfterAuthorsItemClicked";
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class d implements c {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1856904123;
            }

            public final String toString() {
                return "OnAllowCommentsClicked";
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class e implements c {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -69366260;
            }

            public final String toString() {
                return "OnAllowDuetsClicked";
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class f implements c {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 1006951302;
            }

            public final String toString() {
                return "OnAllowTemplatesClicked";
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class g implements c {
            public final String a;

            public g(String str) {
                this.a = str;
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class h implements c {
            public final long a;

            public h(long j) {
                this.a = j;
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class i implements c {
            public static final i a = new i();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public final int hashCode() {
                return 1669475935;
            }

            public final String toString() {
                return "OnAuthorsListScrolledToEnd";
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class j implements c {
            public static final j a = new j();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public final int hashCode() {
                return -1087343761;
            }

            public final String toString() {
                return "OnBackClicked";
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class k implements c {
            public final ClipsChoosePreviewResult a;

            public k(ClipsChoosePreviewResult clipsChoosePreviewResult) {
                this.a = clipsChoosePreviewResult;
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class l implements c {
            public static final l a = new l();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof l);
            }

            public final int hashCode() {
                return -595063231;
            }

            public final String toString() {
                return "OnCoverSelectionClicked";
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class m implements c {
            public final String a;

            public m(String str) {
                this.a = str;
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class n implements c {
            public static final n a = new n();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof n);
            }

            public final int hashCode() {
                return 1598757756;
            }

            public final String toString() {
                return "OnDescriptionClicked";
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class o implements c {
            public static final o a = new o();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof o);
            }

            public final int hashCode() {
                return -324105717;
            }

            public final String toString() {
                return "OnFullscreenPreviewClicked";
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class p implements c {
            public static final p a = new p();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof p);
            }

            public final int hashCode() {
                return 136759597;
            }

            public final String toString() {
                return "OnOpenEditorButtonClicked";
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class q implements c {
            public static final q a = new q();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof q);
            }

            public final int hashCode() {
                return 45569527;
            }

            public final String toString() {
                return "OnOrdClicked";
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class r implements c {
            public static final r a = new r();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof r);
            }

            public final int hashCode() {
                return 713718705;
            }

            public final String toString() {
                return "OnPostToWallClicked";
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class s implements c {
            public static final s a = new s();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof s);
            }

            public final int hashCode() {
                return 1738088161;
            }

            public final String toString() {
                return "OnRulesClicked";
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class t implements c {
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class u implements c {
            public final TrendingHashtagUiDto a;

            public u(TrendingHashtagUiDto trendingHashtagUiDto) {
                this.a = trendingHashtagUiDto;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof u) && epx.f(this.a, ((u) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OnTrendingHashtagBadgeClicked(hashtag=" + this.a + ')';
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class v implements c {
            public static final v a = new v();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof v);
            }

            public final int hashCode() {
                return -884447263;
            }

            public final String toString() {
                return "OnTrendingHashtagBadgeOnboardingDismissed";
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class w implements c {
            public static final w a = new w();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof w);
            }

            public final int hashCode() {
                return 2077628595;
            }

            public final String toString() {
                return "OnTrendingHashtagsLandingLinkClicked";
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public interface x extends c {

            /* compiled from: ClipsUploadActionInternal.kt */
            public static final class a implements x {
                public final fpa a;

                public a(fpa fpaVar) {
                    this.a = fpaVar;
                }
            }

            /* compiled from: ClipsUploadActionInternal.kt */
            public static final class b implements x {
                public final Long a;

                public b(Long l) {
                    this.a = l;
                }
            }

            /* compiled from: ClipsUploadActionInternal.kt */
            /* renamed from: xsna.mbf$c$x$c, reason: collision with other inner class name */
            public static final class C3334c implements x {
                public static final C3334c a = new C3334c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C3334c);
                }

                public final int hashCode() {
                    return 795146824;
                }

                public final String toString() {
                    return "OnDatePickerDismissed";
                }
            }

            /* compiled from: ClipsUploadActionInternal.kt */
            public static final class d implements x {
                public final fpa a;

                public d(fpa fpaVar) {
                    this.a = fpaVar;
                }
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class y implements c {
            public static final y a = new y();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof y);
            }

            public final int hashCode() {
                return -699337654;
            }

            public final String toString() {
                return "PublishClicked";
            }
        }

        /* compiled from: ClipsUploadActionInternal.kt */
        public static final class z implements c {
            public final ajh0 a;

            public z(ajh0 ajh0Var) {
                this.a = ajh0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof z) && epx.f(this.a, ((z) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "SendSuggestsAnalyticsEvent(event=" + this.a + ')';
            }
        }
    }
}
