package xsna;

import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewParams;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewResult;

/* compiled from: ClipsUploadAction.kt */
/* loaded from: classes17.dex */
public interface yaf {

    /* compiled from: ClipsUploadAction.kt */
    public interface a extends yaf {

        /* compiled from: ClipsUploadAction.kt */
        @ozl
        /* renamed from: xsna.yaf$a$a, reason: collision with other inner class name */
        public static final class C4087a implements a {
            public final ClipsChoosePreviewResult a;

            public C4087a(ClipsChoosePreviewResult clipsChoosePreviewResult) {
                this.a = clipsChoosePreviewResult;
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class b implements a {
            public final String a;

            public b(String str) {
                this.a = str;
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1326244632;
            }

            public final String toString() {
                return "ErrorReloadRequest";
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class d implements a {
            public final long a;

            public d(long j) {
                this.a = j;
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class e implements a {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 410451591;
            }

            public final String toString() {
                return "OnAuthorsListScrolledToEnd";
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class f implements a {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 1659142727;
            }

            public final String toString() {
                return "OnBackClicked";
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class g implements a {
            public final ClipsChoosePreviewParams a;

            public g(ClipsChoosePreviewParams clipsChoosePreviewParams) {
                this.a = clipsChoosePreviewParams;
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class h implements a {
            public static final h a = new h();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return -1457602446;
            }

            public final String toString() {
                return "PublishClicked";
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class i implements a {
            public final String a;
            public final String b;
            public final String c;

            public i(String str, String str2, String str3) {
                this.a = str;
                this.b = str2;
                this.c = str3;
            }
        }
    }

    /* compiled from: ClipsUploadAction.kt */
    public interface b extends yaf {

        /* compiled from: ClipsUploadAction.kt */
        public static final class a implements b {
            public final int a;

            public a(int i) {
                this.a = i;
            }

            @Override // xsna.yaf.b
            public final int getId() {
                return this.a;
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        /* renamed from: xsna.yaf$b$b, reason: collision with other inner class name */
        public static final class C4088b implements b {
            public final int a;

            public C4088b(int i) {
                this.a = i;
            }

            @Override // xsna.yaf.b
            public final int getId() {
                return this.a;
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class c implements b {
            public final int a;

            public c(int i) {
                this.a = i;
            }

            @Override // xsna.yaf.b
            public final int getId() {
                return this.a;
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class d implements b {
            public final int a;
            public final String b;

            public d(int i, String str) {
                this.a = i;
                this.b = str;
            }

            @Override // xsna.yaf.b
            public final int getId() {
                return this.a;
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class e implements b {
            public final int a;

            public e(int i) {
                this.a = i;
            }

            @Override // xsna.yaf.b
            public final int getId() {
                return this.a;
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class f implements b {
            public final int a;
            public final int b;

            public f(int i, int i2) {
                this.a = i2;
                this.b = i;
            }

            @Override // xsna.yaf.b
            public final int getId() {
                return this.b;
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class g implements b {
            public final int a;

            public g(int i) {
                this.a = i;
            }

            @Override // xsna.yaf.b
            public final int getId() {
                return this.a;
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class h implements b {
            public final int a;

            public h(int i) {
                this.a = i;
            }

            @Override // xsna.yaf.b
            public final int getId() {
                return this.a;
            }
        }

        int getId();
    }

    /* compiled from: ClipsUploadAction.kt */
    public interface c extends yaf {

        /* compiled from: ClipsUploadAction.kt */
        public static final class a implements c {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1828698457;
            }

            public final String toString() {
                return "DraftClicked";
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class b implements c {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 512697480;
            }

            public final String toString() {
                return "OnAfterAuthorsItemClicked";
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        /* renamed from: xsna.yaf$c$c, reason: collision with other inner class name */
        public static final class C4089c implements c {
            public static final C4089c a = new C4089c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C4089c);
            }

            public final int hashCode() {
                return -1331789910;
            }

            public final String toString() {
                return "OnAllowCommentsClicked";
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class d implements c {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1666299779;
            }

            public final String toString() {
                return "OnAllowDuetsClicked";
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class e implements c {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 920477306;
            }

            public final String toString() {
                return "OnFullscreenPreviewClicked";
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class f implements c {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -1638039248;
            }

            public final String toString() {
                return "OnOpenEditorClicked";
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class g implements c {
            public static final g a = new g();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return -603453274;
            }

            public final String toString() {
                return "OnOrdClicked";
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class h implements c {
            public static final h a = new h();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return -883214814;
            }

            public final String toString() {
                return "OnPostToWallClicked";
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class i implements c {
            public static final i a = new i();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public final int hashCode() {
                return 797434320;
            }

            public final String toString() {
                return "OnRulesClicked";
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class j implements c {
        }
    }
}
