package xsna;

import android.net.Uri;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class zai0 {
    public final MediaPickerSelectedItem a;
    public final a b;

    /* compiled from: PostingViewState.kt */
    public interface a {

        /* compiled from: PostingViewState.kt */
        /* renamed from: xsna.zai0$a$a, reason: collision with other inner class name */
        public static final class C4170a implements a {
            public final Uri a;

            public C4170a(Uri uri) {
                this.a = uri;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4170a) && epx.f(this.a, ((C4170a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return alb0.b(new StringBuilder("Local(uri="), this.a, ')');
            }
        }

        /* compiled from: PostingViewState.kt */
        public static final class b implements a {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Url(url="), this.a, ')');
            }
        }
    }

    public zai0(MediaPickerSelectedItem mediaPickerSelectedItem, a aVar) {
        this.a = mediaPickerSelectedItem;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zai0)) {
            return false;
        }
        zai0 zai0Var = (zai0) obj;
        return epx.f(this.a, zai0Var.a) && epx.f(this.b, zai0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectedMediaPreviewItem(id=" + this.a + ", previewImageId=" + this.b + ')';
    }
}
