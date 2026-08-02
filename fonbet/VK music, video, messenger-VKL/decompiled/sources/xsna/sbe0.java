package xsna;

import android.net.Uri;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.donut.DonutLevel;
import com.vk.video.ui.upload.impl.publish.domain.model.VideoAuthorDo;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsArguments;
import java.util.List;
import xsna.ikv0;

/* compiled from: PublishEvent.kt */
/* loaded from: classes7.dex */
public interface sbe0 extends pk50 {

    /* compiled from: PublishEvent.kt */
    public static final class a implements sbe0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1132794544;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: PublishEvent.kt */
    public static final class b implements sbe0 {
        public final SettingsArguments a;

        public b(SettingsArguments settingsArguments) {
            this.a = settingsArguments;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenAdvancedSettings(arguments=" + this.a + ')';
        }
    }

    /* compiled from: PublishEvent.kt */
    public static final class c implements sbe0 {
        public final List<VideoAuthorDo> a;
        public final int b;
        public final boolean c;

        public c(List<VideoAuthorDo> list, int i, boolean z) {
            this.a = list;
            this.b = i;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenAuthorModal(authors=");
            sb.append(this.a);
            sb.append(", selectedAuthorIndex=");
            sb.append(this.b);
            sb.append(", shouldConfirmChange=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: PublishEvent.kt */
    public static final class d implements sbe0 {
        public final Uri a;
        public final UserId b;

        public d(Uri uri, UserId userId) {
            this.a = uri;
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenClipPublishScreen(videoUri=");
            sb.append(this.a);
            sb.append(", ownerId=");
            return gp.b(sb, this.b, ')');
        }
    }

    /* compiled from: PublishEvent.kt */
    public static final class e implements sbe0 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -2011931634;
        }

        public final String toString() {
            return "OpenClipScreen";
        }
    }

    /* compiled from: PublishEvent.kt */
    public static final class f implements sbe0 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 868309887;
        }

        public final String toString() {
            return "OpenCoverPickerScreen";
        }
    }

    /* compiled from: PublishEvent.kt */
    public static final class g implements sbe0 {
        public final String a;
        public final Integer b;
        public final UserId c;
        public final boolean d;

        public g(String str, Integer num, UserId userId, boolean z) {
            this.a = str;
            this.b = num;
            this.c = userId;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c) && this.d == gVar.d;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            return Boolean.hashCode(this.d) + bh10.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenCoverScreen(coverPath=");
            sb.append(this.a);
            sb.append(", videoId=");
            sb.append(this.b);
            sb.append(", ownerId=");
            sb.append(this.c);
            sb.append(", isVideoVertical=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: PublishEvent.kt */
    public static final class h implements sbe0 {
        public final PrivacySetting a;

        public h(PrivacySetting privacySetting) {
            this.a = privacySetting;
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
            return "OpenPrivacyComments(privacy=" + this.a + ')';
        }
    }

    /* compiled from: PublishEvent.kt */
    public static final class i implements sbe0 {
        public final UserId a;
        public final PrivacySetting b;
        public final DonutLevel c;

        public i(UserId userId, PrivacySetting privacySetting, DonutLevel donutLevel) {
            this.a = userId;
            this.b = privacySetting;
            this.c = donutLevel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return epx.f(this.a, iVar.a) && epx.f(this.b, iVar.b) && epx.f(this.c, iVar.c);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31;
            DonutLevel donutLevel = this.c;
            return hashCode + (donutLevel == null ? 0 : donutLevel.hashCode());
        }

        public final String toString() {
            return "OpenPrivacyWatch(ownerId=" + this.a + ", privacy=" + this.b + ", donutLevel=" + this.c + ')';
        }
    }

    /* compiled from: PublishEvent.kt */
    public static final class j implements sbe0 {
        public final boolean a;
        public final UserId b;
        public final List<Integer> c;

        public j(boolean z, UserId userId, List<Integer> list) {
            this.a = z;
            this.b = userId;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.a == jVar.a && epx.f(this.b, jVar.b) && epx.f(this.c, jVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + bh10.a(Boolean.hashCode(this.a) * 31, 31, this.b.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenVideoChooseAlbum(isUpload=");
            sb.append(this.a);
            sb.append(", ownerId=");
            sb.append(this.b);
            sb.append(", selectedAlbumIds=");
            return ms9.a(')', sb, this.c);
        }
    }

    /* compiled from: PublishEvent.kt */
    public static final class k implements sbe0 {
        public final Uri a;

        public k(Uri uri) {
            this.a = uri;
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
            return alb0.b(new StringBuilder("OpenVideoPreview(videoUri="), this.a, ')');
        }
    }

    /* compiled from: PublishEvent.kt */
    public static final class l implements sbe0 {
        public static final l a = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -492778108;
        }

        public final String toString() {
            return "SendPreviewErrorStat";
        }
    }

    /* compiled from: PublishEvent.kt */
    public static final class m implements sbe0 {
        public final String a;
        public final Integer b;
        public final UserId c;

        public m(String str, Integer num, UserId userId) {
            this.a = str;
            this.b = num;
            this.c = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return epx.f(this.a, mVar.a) && epx.f(this.b, mVar.b) && epx.f(this.c, mVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            return Long.hashCode(this.c.b) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowDescriptionModal(description=");
            sb.append(this.a);
            sb.append(", videoId=");
            sb.append(this.b);
            sb.append(", ownerId=");
            return gp.b(sb, this.c, ')');
        }
    }

    /* compiled from: PublishEvent.kt */
    public static final class n implements sbe0 {
        public final ikv0.c a;
        public final ikv0.d b;

        public n() {
            this(null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return epx.f(this.a, nVar.a) && epx.f(this.b, nVar.b);
        }

        public final int hashCode() {
            ikv0.c cVar = this.a;
            int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
            ikv0.d dVar = this.b;
            return hashCode + (dVar != null ? dVar.hashCode() : 0);
        }

        public final String toString() {
            return "ShowExternalSnackbar(left=" + this.a + ", middle=" + this.b + ')';
        }

        public n(ikv0.c cVar, ikv0.d dVar) {
            this.a = cVar;
            this.b = dVar;
        }
    }

    /* compiled from: PublishEvent.kt */
    public static final class o implements sbe0 {
        public static final o a = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -1197262692;
        }

        public final String toString() {
            return "ShowSaveDraftConfirmationDialog";
        }
    }
}
