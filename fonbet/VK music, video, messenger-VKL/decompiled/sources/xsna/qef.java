package xsna;

import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.clips.attachments.api.publish.cta.ClipsInvolvementAttachesState;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewParams;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipAttachedVideoInfo;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadPrivacyData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.EasyPromoteUnavailabilityTarget;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.EasyPromoteUnavalabilityReason;
import com.vk.dto.common.Good;
import com.vk.dto.common.clips.ClipsLinkAttachment;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.dto.stories.entities.OrdData;
import java.util.List;

/* compiled from: ClipsUploadEvent.kt */
/* loaded from: classes17.dex */
public interface qef extends pk50 {

    /* compiled from: ClipsUploadEvent.kt */
    public static final class a implements qef {
        public static final a a = new a();
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class a0 implements qef {
        public final EasyPromoteUnavalabilityReason a;
        public final EasyPromoteUnavailabilityTarget b;

        public a0(EasyPromoteUnavalabilityReason easyPromoteUnavalabilityReason, EasyPromoteUnavailabilityTarget easyPromoteUnavailabilityTarget) {
            this.a = easyPromoteUnavalabilityReason;
            this.b = easyPromoteUnavailabilityTarget;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a0)) {
                return false;
            }
            a0 a0Var = (a0) obj;
            return this.a == a0Var.a && this.b == a0Var.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ShowEasyPromoteError(unavalabilityReason=" + this.a + ", target=" + this.b + ')';
        }
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class b implements qef {
        public final ClipsChoosePreviewParams a;

        public b(ClipsChoosePreviewParams clipsChoosePreviewParams) {
            this.a = clipsChoosePreviewParams;
        }
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class b0 implements qef {
        public static final b0 a = new b0();
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class c implements qef {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -2143600085;
        }

        public final String toString() {
            return "OpenCreateChannelBottomSheet";
        }
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class c0 implements qef {
        public static final c0 a = new c0();
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class d implements qef {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -188773949;
        }

        public final String toString() {
            return "OpenEasyPromoteSettings";
        }
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class d0 implements qef {
        public final boolean a;
        public final boolean b;

        public d0(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class e implements qef {
        public final int a;

        public e(int i) {
            this.a = i;
        }
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class e0 implements qef {
        public final UserId a;

        public e0(UserId userId) {
            this.a = userId;
        }
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class f implements qef {
        public final UserId a;
        public final ClipInvolvementActionButton<?> b;
        public final boolean c;
        public final ClipsInvolvementAttachesState d;
        public final String e;
        public final int f;

        public f(UserId userId, ClipInvolvementActionButton<?> clipInvolvementActionButton, boolean z, ClipsInvolvementAttachesState clipsInvolvementAttachesState, String str, int i) {
            this.a = userId;
            this.b = clipInvolvementActionButton;
            this.c = z;
            this.d = clipsInvolvementAttachesState;
            this.e = str;
            this.f = i;
        }
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class f0 implements qef {
        public final String a;
        public final String b;
        public final String c;

        public f0(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class g implements qef {
        public final String a;

        public g(String str) {
            this.a = str;
        }
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class h implements qef {
        public final List<Good> a;
        public final UserId b;

        /* JADX WARN: Multi-variable type inference failed */
        public h(List<? extends Good> list, UserId userId) {
            this.a = list;
            this.b = userId;
        }
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class i implements qef {
        public final UserId a;
        public final Integer b;

        public i(UserId userId, Integer num) {
            this.a = userId;
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return epx.f(this.a, iVar.a) && epx.f(this.b, iVar.b);
        }

        public final int hashCode() {
            UserId userId = this.a;
            int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
            Integer num = this.b;
            return hashCode + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenMarketMultiPicker(currentGroupId=");
            sb.append(this.a);
            sb.append(", sessionId=");
            return uqi.b(sb, this.b, ')');
        }
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class j implements qef {
        public static final j a = new j();
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class k implements qef {
        public final UserId a;

        public k(UserId userId) {
            this.a = userId;
        }
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class l implements qef {
        public static final l a = new l();
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class m implements qef {
        public static final m a = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -1957238995;
        }

        public final String toString() {
            return "OpenTrendingHashtagsLanding";
        }
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class n implements qef {
        public static final n a = new n();
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class o implements qef {
        public static final o a = new o();
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class p implements qef {
        public final List<CoOwnerItem> a;
        public final UserId b;

        public p(List<CoOwnerItem> list, UserId userId) {
            this.a = list;
            this.b = userId;
        }
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class q implements qef {
        public static final q a = new q();
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class r implements qef {
        public final ClipsLinkAttachment a;

        public r(ClipsLinkAttachment clipsLinkAttachment) {
            this.a = clipsLinkAttachment;
        }
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class s implements qef {
        public final UserId a;

        public s(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && epx.f(this.a, ((s) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("SelectNewChannelAsAuthor(channelId="), this.a, ')');
        }
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class t implements qef {
        public final OrdData a;

        public t(OrdData ordData) {
            this.a = ordData;
        }
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class u implements qef {
        public final Integer a;
        public final UserId b;

        public u(UserId userId, Integer num) {
            this.a = num;
            this.b = userId;
        }
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class v implements qef {
        public final PostingVisibilityMode a;

        public v(PostingVisibilityMode postingVisibilityMode) {
            this.a = postingVisibilityMode;
        }
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class w implements qef {
        public final ClipAttachedVideoInfo a;
        public final UserId b;

        public w(ClipAttachedVideoInfo clipAttachedVideoInfo, UserId userId) {
            this.a = clipAttachedVideoInfo;
            this.b = userId;
        }
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class x implements qef {
        public static final x a = new x();
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class y implements qef {
        public static final y a = new y();
    }

    /* compiled from: ClipsUploadEvent.kt */
    public static final class z implements qef {
        public final UserId a;
        public final ClipsUploadPrivacyData b;

        public z(UserId userId, ClipsUploadPrivacyData clipsUploadPrivacyData) {
            this.a = userId;
            this.b = clipsUploadPrivacyData;
        }
    }
}
