package xsna;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: ContentInfoCompat.java */
/* loaded from: classes11.dex */
public final class chj {
    public final e a;

    /* compiled from: ContentInfoCompat.java */
    public interface b {
        void a(ClipData clipData);

        void b(Uri uri);

        chj build();

        void setExtras(Bundle bundle);

        void setFlags(int i);
    }

    /* compiled from: ContentInfoCompat.java */
    public static final class c implements b {
        public ClipData a;
        public int b;
        public int c;
        public Uri d;
        public Bundle e;

        @Override // xsna.chj.b
        public final void a(ClipData clipData) {
            this.a = clipData;
        }

        @Override // xsna.chj.b
        public final void b(Uri uri) {
            this.d = uri;
        }

        @Override // xsna.chj.b
        public final chj build() {
            return new chj(new f(this));
        }

        @Override // xsna.chj.b
        public final void setExtras(Bundle bundle) {
            this.e = bundle;
        }

        @Override // xsna.chj.b
        public final void setFlags(int i) {
            this.c = i;
        }
    }

    /* compiled from: ContentInfoCompat.java */
    public static final class d implements e {
        public final ContentInfo a;

        public d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.a = tgj.c(contentInfo);
        }

        @Override // xsna.chj.e
        public final ClipData a() {
            ClipData clip;
            clip = this.a.getClip();
            return clip;
        }

        @Override // xsna.chj.e
        public final ContentInfo b() {
            return this.a;
        }

        @Override // xsna.chj.e
        public final Uri c() {
            Uri linkUri;
            linkUri = this.a.getLinkUri();
            return linkUri;
        }

        @Override // xsna.chj.e
        public final Bundle getExtras() {
            Bundle extras;
            extras = this.a.getExtras();
            return extras;
        }

        @Override // xsna.chj.e
        public final int getFlags() {
            int flags;
            flags = this.a.getFlags();
            return flags;
        }

        @Override // xsna.chj.e
        public final int t() {
            int source;
            source = this.a.getSource();
            return source;
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.a + "}";
        }
    }

    /* compiled from: ContentInfoCompat.java */
    public interface e {
        ClipData a();

        ContentInfo b();

        Uri c();

        Bundle getExtras();

        int getFlags();

        int t();
    }

    /* compiled from: ContentInfoCompat.java */
    public static final class f implements e {
        public final ClipData a;
        public final int b;
        public final int c;
        public final Uri d;
        public final Bundle e;

        public f(c cVar) {
            ClipData clipData = cVar.a;
            clipData.getClass();
            this.a = clipData;
            int i = cVar.b;
            obr.c(i, 5, "source");
            this.b = i;
            int i2 = cVar.c;
            if ((i2 & 1) == i2) {
                this.c = i2;
                this.d = cVar.d;
                this.e = cVar.e;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }

        @Override // xsna.chj.e
        public final ClipData a() {
            return this.a;
        }

        @Override // xsna.chj.e
        public final ContentInfo b() {
            return null;
        }

        @Override // xsna.chj.e
        public final Uri c() {
            return this.d;
        }

        @Override // xsna.chj.e
        public final Bundle getExtras() {
            return this.e;
        }

        @Override // xsna.chj.e
        public final int getFlags() {
            return this.c;
        }

        @Override // xsna.chj.e
        public final int t() {
            return this.b;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.a.getDescription());
            sb.append(", source=");
            int i = this.b;
            sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
            sb.append(", flags=");
            int i2 = this.c;
            sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
            Uri uri = this.d;
            if (uri == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb.append(str);
            return i5s.a(sb, this.e != null ? ", hasExtras" : "", "}");
        }
    }

    public chj(e eVar) {
        this.a = eVar;
    }

    public static ClipData a(ClipDescription clipDescription, ArrayList arrayList) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), (ClipData.Item) arrayList.get(0));
        for (int i = 1; i < arrayList.size(); i++) {
            clipData.addItem((ClipData.Item) arrayList.get(i));
        }
        return clipData;
    }

    public final ClipData b() {
        return this.a.a();
    }

    public final int c() {
        return this.a.getFlags();
    }

    public final int d() {
        return this.a.t();
    }

    public final Pair e(rmm0 rmm0Var) {
        b bVar;
        b bVar2;
        e eVar = this.a;
        ClipData a2 = eVar.a();
        if (a2.getItemCount() == 1) {
            boolean a3 = rmm0Var.a(a2.getItemAt(0));
            return Pair.create(a3 ? this : null, a3 ? null : this);
        }
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i = 0; i < a2.getItemCount(); i++) {
            ClipData.Item itemAt = a2.getItemAt(i);
            if (rmm0Var.a(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        Pair create = arrayList == null ? Pair.create(null, a2) : arrayList2 == null ? Pair.create(a2, null) : Pair.create(a(a2.getDescription(), arrayList), a(a2.getDescription(), arrayList2));
        if (create.first == null) {
            return Pair.create(null, this);
        }
        if (create.second == null) {
            return Pair.create(this, null);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            bVar = new a(this);
        } else {
            c cVar = new c();
            cVar.a = eVar.a();
            cVar.b = eVar.t();
            cVar.c = eVar.getFlags();
            cVar.d = eVar.c();
            cVar.e = eVar.getExtras();
            bVar = cVar;
        }
        bVar.a((ClipData) create.first);
        chj build = bVar.build();
        if (i2 >= 31) {
            bVar2 = new a(this);
        } else {
            c cVar2 = new c();
            cVar2.a = eVar.a();
            cVar2.b = eVar.t();
            cVar2.c = eVar.getFlags();
            cVar2.d = eVar.c();
            cVar2.e = eVar.getExtras();
            bVar2 = cVar2;
        }
        bVar2.a((ClipData) create.second);
        return Pair.create(build, bVar2.build());
    }

    public final String toString() {
        return this.a.toString();
    }

    /* compiled from: ContentInfoCompat.java */
    public static final class a implements b {
        public final ContentInfo.Builder a;

        public a(ClipData clipData, int i) {
            this.a = ygj.a(clipData, i);
        }

        @Override // xsna.chj.b
        public final void a(ClipData clipData) {
            this.a.setClip(clipData);
        }

        @Override // xsna.chj.b
        public final void b(Uri uri) {
            this.a.setLinkUri(uri);
        }

        @Override // xsna.chj.b
        public final chj build() {
            ContentInfo build;
            build = this.a.build();
            return new chj(new d(build));
        }

        @Override // xsna.chj.b
        public final void setExtras(Bundle bundle) {
            this.a.setExtras(bundle);
        }

        @Override // xsna.chj.b
        public final void setFlags(int i) {
            this.a.setFlags(i);
        }

        public a(chj chjVar) {
            ahj.b();
            ContentInfo b = chjVar.a.b();
            Objects.requireNonNull(b);
            this.a = zgj.a(tgj.c(b));
        }
    }
}
