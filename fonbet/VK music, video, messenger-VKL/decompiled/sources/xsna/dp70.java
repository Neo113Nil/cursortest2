package xsna;

import android.os.Build;
import android.system.Os;
import android.system.StructStat;
import com.facebook.soloader.MinElf;
import com.vk.core.apps.BuildInfo;
import com.vkontakte.android.VKApplication;
import java.io.File;

/* compiled from: OatFileReachabilityTask.kt */
/* loaded from: classes11.dex */
public final class dp70 implements gzs<s3q0> {
    public final VKApplication b;

    /* compiled from: OatFileReachabilityTask.kt */
    public static final class a {
        public final long a;
        public final long b;
        public final int c;
        public final boolean d;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + shy.a(this.c, bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OdexFileCheckResult(lastModified=");
            sb.append(this.a);
            sb.append(", size=");
            sb.append(this.b);
            sb.append(", mode=");
            sb.append(this.c);
            sb.append(", isExists=");
            return defpackage.q0.a(sb, this.d, ')');
        }

        public /* synthetic */ a(int i) {
            this(-1L, 1L, -1, false);
        }

        public a(long j, long j2, int i, boolean z) {
            this.a = j;
            this.b = j2;
            this.c = i;
            this.d = z;
        }
    }

    public dp70(VKApplication vKApplication) {
        this.b = vKApplication;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        String str;
        String sb;
        a aVar;
        if (BuildInfo.m()) {
            File file = new File(this.b.getPackageCodePath());
            String parent = file.getParent();
            int i = 0;
            if (parent == null) {
                sb = null;
            } else {
                String n0 = drm0.n0(file.getName(), ".");
                StringBuilder b = ho8.b(parent, "/oat/");
                for (String str2 : Build.SUPPORTED_ABIS) {
                    if (MinElf.ISA.AARCH64.equalsIgnoreCase(str2) || MinElf.ISA.X86_64.equalsIgnoreCase(str2)) {
                        str = "arm64";
                        break;
                    }
                }
                str = "arm";
                b.append(str);
                b.append('/');
                b.append(n0);
                b.append(".odex");
                sb = b.toString();
            }
            if (sb == null) {
                aVar = new a(i);
            } else {
                try {
                    StructStat stat = Os.stat(sb);
                    aVar = new a(stat.st_mtime, stat.st_size, stat.st_mode, true);
                } catch (Exception unused) {
                    aVar = new a(i);
                }
            }
            r6m.a.getClass();
            new ep70((int) r6m.c(), aVar.c, aVar.a, aVar.b, aVar.d).q();
        }
        return s3q0.a;
    }
}
