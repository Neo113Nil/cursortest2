package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ClipItemClipState.kt */
/* loaded from: classes17.dex */
public final class m0d {
    public final SdkClipVideoFile a;
    public final String b;
    public final boolean c;
    public final h7e d;
    public final j7e e;
    public final m2m f;
    public final String g;
    public final ArrayList h;
    public final a i;
    public final t80 j;
    public final Object k = msy.a(LazyThreadSafetyMode.NONE, new s1(this, 20));

    /* compiled from: ClipItemClipState.kt */
    public interface a {

        /* compiled from: ClipItemClipState.kt */
        /* renamed from: xsna.m0d$a$a, reason: collision with other inner class name */
        public static final class C3314a implements a {
            public final UserId a;
            public final int b;

            public C3314a(UserId userId, int i) {
                this.a = userId;
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3314a)) {
                    return false;
                }
                C3314a c3314a = (C3314a) obj;
                return epx.f(this.a, c3314a.a) && this.b == c3314a.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Attached(ownerId=");
                sb.append(this.a);
                sb.append(", videoId=");
                return vu5.b(sb, this.b, ')');
            }
        }

        /* compiled from: ClipItemClipState.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -61008041;
            }

            public final String toString() {
                return "NotAttached";
            }
        }
    }

    public m0d(SdkClipVideoFile sdkClipVideoFile, String str, boolean z, h7e h7eVar, j7e j7eVar, m2m m2mVar, String str2, ArrayList arrayList, a aVar, t80 t80Var) {
        this.a = sdkClipVideoFile;
        this.b = str;
        this.c = z;
        this.d = h7eVar;
        this.e = j7eVar;
        this.f = m2mVar;
        this.g = str2;
        this.h = arrayList;
        this.i = aVar;
        this.j = t80Var;
    }

    public static m0d a(m0d m0dVar, t80 t80Var) {
        SdkClipVideoFile sdkClipVideoFile = m0dVar.a;
        String str = m0dVar.b;
        boolean z = m0dVar.c;
        h7e h7eVar = m0dVar.d;
        j7e j7eVar = m0dVar.e;
        m2m m2mVar = m0dVar.f;
        String str2 = m0dVar.g;
        ArrayList arrayList = m0dVar.h;
        a aVar = m0dVar.i;
        m0dVar.getClass();
        return new m0d(sdkClipVideoFile, str, z, h7eVar, j7eVar, m2mVar, str2, arrayList, aVar, t80Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final SdkClipVideoFile b() {
        return (SdkClipVideoFile) this.k.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0d)) {
            return false;
        }
        m0d m0dVar = (m0d) obj;
        return this.a.equals(m0dVar.a) && epx.f(this.b, m0dVar.b) && this.c == m0dVar.c && this.d.equals(m0dVar.d) && this.e.equals(m0dVar.e) && this.f.equals(m0dVar.f) && epx.f(this.g, m0dVar.g) && this.h.equals(m0dVar.h) && epx.f(this.i, m0dVar.i) && epx.f(this.j, m0dVar.j);
    }

    public final int hashCode() {
        int hashCode = (this.i.hashCode() + qr.a(this.h, urd0.a((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31, 31, this.g), 31)) * 31;
        t80 t80Var = this.j;
        return hashCode + (t80Var == null ? 0 : t80Var.hashCode());
    }

    public final String toString() {
        return "ClipItemClipState(clip=" + this.a + ", uniqueKey=" + this.b + ", hasClipCarouselAttaches=" + this.c + ", primaryBadges=" + this.d + ", secondaryBadges=" + this.e + ", descriptionState=" + this.f + ", coverUrl=" + this.g + ", approvedCoauthors=" + this.h + ", fullVideoAttachState=" + this.i + ", activitiesState=" + this.j + ')';
    }
}
