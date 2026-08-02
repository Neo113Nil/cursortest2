package xsna;

import com.vk.clips.sdk.models.SdkCompilation;
import com.vk.clips.sdk.models.SdkMask;
import com.vk.clips.sdk.models.SdkMusicTrack;
import com.vk.clips.sdk.models.SdkVideoRestriction;
import com.vk.clips.sdk.shared.api.deps.SdkOriginalSoundStatus;
import com.vk.clips.sdk.shared.api.deps.dtos.SdkGeoPlace;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.clips.SdkClipAudioTemplate;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: ClipItemNavigationEvent.kt */
/* loaded from: classes17.dex */
public interface t1d {

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class a implements t1d {
        public final SdkClipVideoFile a;

        public a(SdkClipVideoFile sdkClipVideoFile) {
            this.a = sdkClipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return cq.d(new StringBuilder("OpenActualLive(clip="), this.a, ')');
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class a0 implements t1d {
        public static final a0 a = new a0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a0);
        }

        public final int hashCode() {
            return -241547606;
        }

        public final String toString() {
            return "ScrollToNextClip";
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class b implements t1d {
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class b0 implements t1d {
        public final List<mih0> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b0(List<? extends mih0> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b0) && epx.f(this.a, ((b0) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("ShowBadgesDialog(badges="), this.a);
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class c implements t1d {
        public final SdkClipVideoFile a;
        public final kih0 b;
        public final y0r c;

        public c(SdkClipVideoFile sdkClipVideoFile, kih0 kih0Var, y0r y0rVar) {
            this.a = sdkClipVideoFile;
            this.b = kih0Var;
            this.c = y0rVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            y0r y0rVar = this.c;
            return hashCode + (y0rVar == null ? 0 : y0rVar.hashCode());
        }

        public final String toString() {
            return "OpenAutoSubtitlesSelector(clip=" + this.a + ", autoPlay=" + this.b + ", cacheInfo=" + this.c + ')';
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class c0 implements t1d {
        public final SdkVideoRestriction a;

        public c0(SdkVideoRestriction sdkVideoRestriction) {
            this.a = sdkVideoRestriction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c0) && epx.f(this.a, ((c0) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowFullVideoRestrictedDialog(restriction=" + this.a + ')';
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class d implements t1d {
        public final SdkMask a;

        public d(SdkMask sdkMask) {
            this.a = sdkMask;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenCameraMaskGrid(mask=" + this.a + ')';
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class d0 implements t1d {
        public final SdkMask a;

        public d0(SdkMask sdkMask) {
            this.a = sdkMask;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d0) && epx.f(this.a, ((d0) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowMaskDialog(mask=" + this.a + ')';
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class e implements t1d {
        public final String a;

        public e(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenClip(videoId="), this.a, ')');
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class e0 implements t1d {
        public final SdkClipVideoFile a;

        public e0(SdkClipVideoFile sdkClipVideoFile) {
            this.a = sdkClipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e0) && epx.f(this.a, ((e0) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return cq.d(new StringBuilder("ShowNotInterestedBottomSheet(clip="), this.a, ')');
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class f implements t1d {
        public final SdkClipVideoFile a;

        public f(SdkClipVideoFile sdkClipVideoFile) {
            this.a = sdkClipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return cq.d(new StringBuilder("OpenClipsTemplateEditor(clip="), this.a, ')');
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class f0 implements t1d {
        public final SdkVideoRestriction a;

        public f0(SdkVideoRestriction sdkVideoRestriction) {
            this.a = sdkVideoRestriction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f0) && epx.f(this.a, ((f0) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowRestrictionDialog(restriction=" + this.a + ')';
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class g implements t1d {
        public final SdkClipVideoFile a;

        public g(SdkClipVideoFile sdkClipVideoFile) {
            this.a = sdkClipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return cq.d(new StringBuilder("OpenCoauthorDialog(clip="), this.a, ')');
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class g0 implements t1d {
        public final kih0 a;

        public g0(kih0 kih0Var) {
            this.a = kih0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g0) && epx.f(this.a, ((g0) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowTrafficSavingBottomSheet(autoPlay=" + this.a + ')';
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class h implements t1d {
        public final SdkClipVideoFile a;

        public h(SdkClipVideoFile sdkClipVideoFile) {
            this.a = sdkClipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return cq.d(new StringBuilder("OpenCoauthorsBottomSheet(clip="), this.a, ')');
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class h0 implements t1d {
        public final izs<SdkClipVideoFile, s3q0> a;

        public h0() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h0) && epx.f(this.a, ((h0) obj).a);
        }

        public final int hashCode() {
            izs<SdkClipVideoFile, s3q0> izsVar = this.a;
            if (izsVar == null) {
                return 0;
            }
            return izsVar.hashCode();
        }

        public final String toString() {
            return up.c(new StringBuilder("ShowUnsubscribeBottomSheet(onUnsubscribe="), this.a, ')');
        }

        /* JADX WARN: Multi-variable type inference failed */
        public h0(izs<? super SdkClipVideoFile, s3q0> izsVar) {
            this.a = izsVar;
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class i implements t1d {
        public final SdkCompilation a;

        public i(SdkCompilation sdkCompilation) {
            this.a = sdkCompilation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenCompilationGrid(compilation=" + this.a + ')';
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class j implements t1d {
        public final SdkClipVideoFile a;

        public j(SdkClipVideoFile sdkClipVideoFile) {
            this.a = sdkClipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.a, ((j) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return cq.d(new StringBuilder("OpenFavoriteFolderPicker(clip="), this.a, ')');
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class k implements t1d {
        public final SdkGeoPlace a;

        public k(SdkGeoPlace sdkGeoPlace) {
            this.a = sdkGeoPlace;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.a, ((k) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenGeoPlaceGrid(place=" + this.a + ')';
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class l implements t1d {
        public final String a;

        public l(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && epx.f(this.a, ((l) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenHashtagGrid(hashtag="), this.a, ')');
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class m implements t1d {
        public final String a;

        public m(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && epx.f(this.a, ((m) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenLink(url="), this.a, ')');
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class n implements t1d {
        public final SdkClipVideoFile a;

        public n(SdkClipVideoFile sdkClipVideoFile) {
            this.a = sdkClipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && epx.f(this.a, ((n) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return cq.d(new StringBuilder("OpenMoreMenu(clip="), this.a, ')');
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class o implements t1d {
        public final SdkMusicTrack a;
        public final SdkClipAudioTemplate b;

        public o(SdkMusicTrack sdkMusicTrack, SdkClipAudioTemplate sdkClipAudioTemplate) {
            this.a = sdkMusicTrack;
            this.b = sdkClipAudioTemplate;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return epx.f(this.a, oVar.a) && epx.f(this.b, oVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            SdkClipAudioTemplate sdkClipAudioTemplate = this.b;
            return hashCode + (sdkClipAudioTemplate == null ? 0 : sdkClipAudioTemplate.b.hashCode());
        }

        public final String toString() {
            return "OpenMusicGrid(track=" + this.a + ", audioTemplate=" + this.b + ')';
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class p implements t1d {
        public final String a;
        public final String b;

        public p(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return epx.f(this.a, pVar.a) && epx.f(this.b, pVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenNewsMonothemeGrid(monothemeObjectId=");
            sb.append(this.a);
            sb.append(", header=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class q implements t1d {
        public final SdkOriginalSoundStatus a;

        public q(SdkOriginalSoundStatus sdkOriginalSoundStatus) {
            this.a = sdkOriginalSoundStatus;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.a == ((q) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenOriginalSoundStatusBottomSheet(status=" + this.a + ')';
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class r implements t1d {
        public final SdkClipVideoFile a;

        public r(SdkClipVideoFile sdkClipVideoFile) {
            this.a = sdkClipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && epx.f(this.a, ((r) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return cq.d(new StringBuilder("OpenOwnerGrid(clip="), this.a, ')');
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class s implements t1d {
        public final SdkClipVideoFile a;

        public s(SdkClipVideoFile sdkClipVideoFile) {
            this.a = sdkClipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && epx.f(this.a, ((s) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return cq.d(new StringBuilder("OpenPrivacyBottomSheet(clip="), this.a, ')');
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class t implements t1d {
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class u implements t1d {
        public final UserId a;

        public u(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && epx.f(this.a, ((u) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenProfile(ownerId="), this.a, ')');
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class v implements t1d {
        public final UserId a;
        public final boolean b;

        public v(UserId userId, boolean z) {
            this.a = userId;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return epx.f(this.a, vVar.a) && this.b == vVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenProfileGridScreen(author=");
            sb.append(this.a);
            sb.append(", isOwnerGrid=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class w implements t1d {
        public final SdkClipVideoFile a;
        public final SdkClipVideoFile b;

        public w(SdkClipVideoFile sdkClipVideoFile, SdkClipVideoFile sdkClipVideoFile2) {
            this.a = sdkClipVideoFile;
            this.b = sdkClipVideoFile2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            return epx.f(this.a, wVar.a) && epx.f(this.b, wVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            SdkClipVideoFile sdkClipVideoFile = this.b;
            return hashCode + (sdkClipVideoFile == null ? 0 : sdkClipVideoFile.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenShopsScreen(currentClip=");
            sb.append(this.a);
            sb.append(", similarClip=");
            return cq.d(sb, this.b, ')');
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class x implements t1d {
        public final String a;

        public x(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && epx.f(this.a, ((x) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenTrendButtonLink(url="), this.a, ')');
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class y implements t1d {
        public final SdkClipVideoFile a;

        public y(SdkClipVideoFile sdkClipVideoFile) {
            this.a = sdkClipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && epx.f(this.a, ((y) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return cq.d(new StringBuilder("OpenUserLink(clip="), this.a, ')');
        }
    }

    /* compiled from: ClipItemNavigationEvent.kt */
    public static final class z implements t1d {
        public final SdkVideoFile a;

        public z(SdkVideoFile sdkVideoFile) {
            this.a = sdkVideoFile;
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
            return "OpenVideoFile(videoFile=" + this.a + ')';
        }
    }
}
