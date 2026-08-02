package xsna;

import android.net.Uri;
import com.vk.clips.upload.ui.api.entities.cell.ClipUploadItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ClipUploadDescriptionInfo.kt */
/* loaded from: classes17.dex */
public final class bed {
    public final List<ClipUploadItem> a;
    public final b b;
    public final List<ClipUploadItem> c;

    /* compiled from: ClipUploadDescriptionInfo.kt */
    public static final class a {
        public final us2 a;
        public final String b;
        public final ArrayList c;
        public final String d;

        public a(us2 us2Var, String str, ArrayList arrayList, String str2) {
            this.a = us2Var;
            this.b = str;
            this.c = arrayList;
            this.d = str2;
        }
    }

    /* compiled from: ClipUploadDescriptionInfo.kt */
    public static final class b {
        public final Uri a;
        public final a b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final long f;

        public b(Uri uri, a aVar, boolean z, boolean z2, boolean z3, long j) {
            this.a = uri;
            this.b = aVar;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bed(List<? extends ClipUploadItem> list, b bVar, List<? extends ClipUploadItem> list2) {
        this.a = list;
        this.b = bVar;
        this.c = list2;
    }
}
