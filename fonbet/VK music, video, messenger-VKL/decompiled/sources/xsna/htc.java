package xsna;

import com.vk.clips.viewer.edit.presentation.feature.state.util.ClipChangedValue;
import java.util.Set;
import xsna.ln50;
import xsna.on50;

/* compiled from: ClipEditSdkMviTask.kt */
/* loaded from: classes17.dex */
public interface htc extends hn50 {

    /* compiled from: ClipEditSdkMviTask.kt */
    public static final class a implements htc {
        public final String b;

        public a(String str) {
            this.b = str;
        }

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("LoadAttachVideoInfo(videoId="), this.b, ')');
        }
    }

    /* compiled from: ClipEditSdkMviTask.kt */
    public static final class b implements htc {
        public static final b b = new b();

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }
    }

    /* compiled from: ClipEditSdkMviTask.kt */
    public static final class c implements htc {
        public static final c b = new c();

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }
    }

    /* compiled from: ClipEditSdkMviTask.kt */
    public static final class d implements htc {
        public static final d b = new d();

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }
    }

    /* compiled from: ClipEditSdkMviTask.kt */
    public static final class e implements htc {
        public final Set<ClipChangedValue> b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Set<? extends ClipChangedValue> set) {
            this.b = set;
        }

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ur.c(new StringBuilder("UpdateClip(changedValues="), this.b, ')');
        }
    }
}
