package xsna;

import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewResult;
import com.vk.clips.upload.model.ClipUploadData;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkNavigator;
import com.vk.clips.upload.vk.ui.impl.fragment.data.api.UploadUserInfo;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipAttachedVideoInfo;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadAuthorRelatedData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadPrivacyData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.CoauthorsData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.EasyPromoteData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.EasyPromoteUnavalabilityReason;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.OnboardingDetails;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalFeature;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalNumber;
import com.vk.dto.clips.external.ClipsDraftablePlaylist;
import com.vk.dto.common.clips.ClipsLinkAttachment;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.geo.GeoLocation;
import com.vk.dto.group.Group;
import com.vk.dto.stories.entities.OrdData;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: ClipsUploadPatch.kt */
/* loaded from: classes17.dex */
public interface ugf extends yl50 {

    /* compiled from: ClipsUploadPatch.kt */
    public interface a extends ugf {

        /* compiled from: ClipsUploadPatch.kt */
        /* renamed from: xsna.ugf$a$a, reason: collision with other inner class name */
        public static final class C3801a implements a {
            public final Group a;

            public C3801a(Group group) {
                this.a = group;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3801a) && epx.f(this.a, ((C3801a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "AddGroupAtStart(group=" + this.a + ')';
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class b implements a {
            public final UserId a;
            public final ClipsUploadAuthorRelatedData b;

            public b(UserId userId, ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData) {
                this.a = userId;
                this.b = clipsUploadAuthorRelatedData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
            }

            public final String toString() {
                return "AuthorSelected(userId=" + this.a + ", newAuthorRelatedData=" + this.b + ')';
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class c implements a {
            public final ArrayList a;
            public final boolean b;
            public final int c;

            public c(ArrayList arrayList, int i, boolean z) {
                this.a = arrayList;
                this.b = z;
                this.c = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a.equals(cVar.a) && this.b == cVar.b && this.c == cVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("GroupsBatchLoaded(groups=");
                sb.append(this.a);
                sb.append(", hasMore=");
                sb.append(this.b);
                sb.append(", loaded=");
                return vu5.b(sb, this.c, ')');
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class d implements a {
            public final CharSequence a;

            public d(CharSequence charSequence) {
                this.a = charSequence;
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
                return thl0.a(new StringBuilder("SetAgreementStatus(text="), this.a, ')');
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class e implements a {
            public final ClipsChoosePreviewResult a;

            public e(ClipsChoosePreviewResult clipsChoosePreviewResult) {
                this.a = clipsChoosePreviewResult;
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
                return "SetCover(coverResult=" + this.a + ')';
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class f implements a {
            public final String a;

            public f(String str) {
                this.a = str;
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
                return ho8.a(new StringBuilder("SetDescription(description="), this.a, ')');
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class g implements a {
            public final boolean a;

            public g(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.a == ((g) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("SetMarkForAuthorRefreshStatus(refresh="), this.a, ')');
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class h implements a {
            public final ArrayList a;

            public h(ArrayList arrayList) {
                this.a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.a.equals(((h) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("SetTrendingHashtags(trendingHashtags="), this.a);
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class i implements a {
            public final oap<Group, UploadUserInfo> a;
            public final ConditionalFeature.State b;
            public final ConditionalFeature.State c;
            public final EasyPromoteUnavalabilityReason d;

            /* JADX WARN: Multi-variable type inference failed */
            public i(oap<? extends Group, UploadUserInfo> oapVar, ConditionalFeature.State state, ConditionalFeature.State state2, EasyPromoteUnavalabilityReason easyPromoteUnavalabilityReason) {
                this.a = oapVar;
                this.b = state;
                this.c = state2;
                this.d = easyPromoteUnavalabilityReason;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return epx.f(this.a, iVar.a) && this.b == iVar.b && this.c == iVar.c && this.d == iVar.d;
            }

            public final int hashCode() {
                int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
                EasyPromoteUnavalabilityReason easyPromoteUnavalabilityReason = this.d;
                return hashCode + (easyPromoteUnavalabilityReason == null ? 0 : easyPromoteUnavalabilityReason.hashCode());
            }

            public final String toString() {
                return "UpdateAuthorData(author=" + this.a + ", coauthorsState=" + this.b + ", easyPromoteState=" + this.c + ", easyPromoteUnavalabilityReason=" + this.d + ')';
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class j implements a {
            public final ClipUploadData a;

            public j(ClipUploadData clipUploadData) {
                this.a = clipUploadData;
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
                return "UpdateWithNewUploadData(uploadData=" + this.a + ')';
            }
        }
    }

    /* compiled from: ClipsUploadPatch.kt */
    public interface b extends ugf {

        /* compiled from: ClipsUploadPatch.kt */
        public static final class a implements b {
            public final List<CoOwnerItem> a;

            public a(List<CoOwnerItem> list) {
                this.a = list;
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
                return ms9.a(')', new StringBuilder("SetCoauthors(coauthors="), this.a);
            }
        }
    }

    /* compiled from: ClipsUploadPatch.kt */
    public interface c extends ugf {

        /* compiled from: ClipsUploadPatch.kt */
        public static final class a implements c {
            public final boolean a;
            public final ConditionalFeature.State b;
            public final ConditionalNumber.State c;

            public a(boolean z, ConditionalFeature.State state, ConditionalNumber.State state2) {
                this.a = z;
                this.b = state;
                this.c = state2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
            }

            public final String toString() {
                return "EasyPromoteChanged(newValue=" + this.a + ", privacyState=" + this.b + ", publicationDateState=" + this.c + ')';
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class b implements c {
            public final int a;
            public final int b;

            public b(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && this.b == bVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("EasyPromoteSettingsApplied(durationDays=");
                sb.append(this.a);
                sb.append(", budgetRub=");
                return vu5.b(sb, this.b, ')');
            }
        }
    }

    /* compiled from: ClipsUploadPatch.kt */
    public interface d extends ugf {

        /* compiled from: ClipsUploadPatch.kt */
        public static final class a implements d {
            public static final a a = new a();
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class b implements d {
            public final GeoLocation a;

            public b(GeoLocation geoLocation) {
                this.a = geoLocation;
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
                return "SetGeolocation(geo=" + this.a + ')';
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class c implements d {
            public final List<GeoLocation> a;

            public c(List<GeoLocation> list) {
                this.a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("SetSuggestedGeoItems(places="), this.a);
            }
        }
    }

    /* compiled from: ClipsUploadPatch.kt */
    public interface e extends ugf {

        /* compiled from: ClipsUploadPatch.kt */
        public static final class a implements e {
            public final ClipsLinkAttachment a;

            public a(ClipsLinkAttachment clipsLinkAttachment) {
                this.a = clipsLinkAttachment;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                ClipsLinkAttachment clipsLinkAttachment = this.a;
                if (clipsLinkAttachment == null) {
                    return 0;
                }
                return clipsLinkAttachment.hashCode();
            }

            public final String toString() {
                return "SetLinkSelection(newLinkData=" + this.a + ')';
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class b implements e {
            public final ConditionalFeature.State a;

            public b(ConditionalFeature.State state) {
                this.a = state;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "SetLinksAvailable(newState=" + this.a + ')';
            }
        }
    }

    /* compiled from: ClipsUploadPatch.kt */
    public interface f extends ugf {

        /* compiled from: ClipsUploadPatch.kt */
        public static final class a implements f {
            public final ClipsUploadUiVkNavigator.ClipUploadDataCompact a;
            public final Set<Object> b;

            public a(ClipsUploadUiVkNavigator.ClipUploadDataCompact clipUploadDataCompact, Set<Object> set) {
                this.a = clipUploadDataCompact;
                this.b = set;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SetInitCompactError(inputParams=");
                sb.append(this.a);
                sb.append(", enabledFeatures=");
                return ur.c(sb, this.b, ')');
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class b implements f {
            public final ClipsUploadUiVkNavigator.ClipUploadDataFull a;
            public final Set<Object> b;

            public b(ClipsUploadUiVkNavigator.ClipUploadDataFull clipUploadDataFull, Set<Object> set) {
                this.a = clipUploadDataFull;
                this.b = set;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SetInitFullError(inputParams=");
                sb.append(this.a);
                sb.append(", enabledFeatures=");
                return ur.c(sb, this.b, ')');
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class c implements f {
            public final ClipsUploadDataInternal a;
            public final UploadUserInfo b;
            public final ArrayList c;
            public final boolean d;
            public final int e;
            public final Group f;

            public c(ClipsUploadDataInternal clipsUploadDataInternal, UploadUserInfo uploadUserInfo, ArrayList arrayList, boolean z, int i, Group group) {
                this.a = clipsUploadDataInternal;
                this.b = uploadUserInfo;
                this.c = arrayList;
                this.d = z;
                this.e = i;
                this.f = group;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a.equals(cVar.a) && epx.f(this.b, cVar.b) && this.c.equals(cVar.c) && this.d == cVar.d && this.e == cVar.e && epx.f(this.f, cVar.f);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                UploadUserInfo uploadUserInfo = this.b;
                int a = shy.a(this.e, qoy.b(qr.a(this.c, (hashCode + (uploadUserInfo == null ? 0 : uploadUserInfo.hashCode())) * 31, 31), 31, this.d), 31);
                Group group = this.f;
                return a + (group != null ? group.hashCode() : 0);
            }

            public final String toString() {
                return "SetInitialLoaded(uploadData=" + this.a + ", user=" + this.b + ", groups=" + this.c + ", hasMoreGroups=" + this.d + ", loadedGroups=" + this.e + ", selectedGroup=" + this.f + ')';
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class d implements f {
            public final Set<Object> a;

            public d(Set<Object> set) {
                this.a = set;
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
                return ur.c(new StringBuilder("SetLoadingState(enabledFeatures="), this.a, ')');
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class e implements f {
            public final ClipsUploadDataInternal a;
            public final UserId b;

            public e(ClipsUploadDataInternal clipsUploadDataInternal, UserId userId) {
                this.a = clipsUploadDataInternal;
                this.b = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                UserId userId = this.b;
                return hashCode + (userId == null ? 0 : Long.hashCode(userId.b));
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SetNetworkLoadingError(uploadData=");
                sb.append(this.a);
                sb.append(", pickedUser=");
                return gp.b(sb, this.b, ')');
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        /* renamed from: xsna.ugf$f$f, reason: collision with other inner class name */
        public static final class C3802f implements f {
            public final int a;

            public C3802f(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3802f) && this.a == ((C3802f) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("SetUploadId(id="), this.a, ')');
            }
        }
    }

    /* compiled from: ClipsUploadPatch.kt */
    public interface g extends ugf {

        /* compiled from: ClipsUploadPatch.kt */
        public static final class a implements g {
            public final boolean a;

            public a(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a == ((a) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("AllowRepostToStoryChanged(newValue="), this.a, ')');
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class b implements g {
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class c implements g {
            public final OnboardingDetails a;

            public c(OnboardingDetails onboardingDetails) {
                this.a = onboardingDetails;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "AllowRepostToStoryOnboardingChanged(details=" + this.a + ')';
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class d implements g {
            public final boolean a;

            public d(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.a == ((d) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("EnableCommentsChanged(newValue="), this.a, ')');
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class e implements g {
            public final boolean a;

            public e(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.a == ((e) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("EnableDuetsChanged(newValue="), this.a, ')');
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class f implements g {
            public final boolean a;

            public f(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.a == ((f) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("OpenChannelButtonOnboardingChanged(newValue="), this.a, ')');
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        /* renamed from: xsna.ugf$g$g, reason: collision with other inner class name */
        public static final class C3803g implements g {
            public final boolean a;

            public C3803g(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3803g) && this.a == ((C3803g) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("OpenModalChannelButtonOnboardingChanged(newValue="), this.a, ')');
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class h implements g {
            public final boolean a;

            public h(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.a == ((h) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("PostToWallChanged(newValue="), this.a, ')');
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class i implements g {
            public final boolean a;
            public final boolean b;

            public i(boolean z, boolean z2) {
                this.a = z;
                this.b = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return this.a == iVar.a && this.b == iVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PostToWallOnboardingAnimationEnd(communityValue=");
                sb.append(this.a);
                sb.append(", usersValue=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class j implements g {
            public final boolean a;
            public final boolean b;

            public j(boolean z, boolean z2) {
                this.a = z;
                this.b = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return this.a == jVar.a && this.b == jVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PostToWallOnboardingChanged(communityValue=");
                sb.append(this.a);
                sb.append(", usersValue=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class k implements g {
            public final ClipsUploadPrivacyData a;
            public final boolean b;
            public final ConditionalFeature<CoauthorsData> c;
            public final ConditionalFeature<EasyPromoteData> d;

            public k(ClipsUploadPrivacyData clipsUploadPrivacyData, boolean z, ConditionalFeature<CoauthorsData> conditionalFeature, ConditionalFeature<EasyPromoteData> conditionalFeature2) {
                this.a = clipsUploadPrivacyData;
                this.b = z;
                this.c = conditionalFeature;
                this.d = conditionalFeature2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof k)) {
                    return false;
                }
                k kVar = (k) obj;
                return epx.f(this.a, kVar.a) && this.b == kVar.b && epx.f(this.c, kVar.c) && epx.f(this.d, kVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + ((this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b)) * 31);
            }

            public final String toString() {
                return "PrivacyChanged(newPrivacySetting=" + this.a + ", isPostToWallEnabled=" + this.b + ", coauthorsState=" + this.c + ", easyPromoteData=" + this.d + ')';
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class l implements g {
            public final boolean a;

            public l(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof l) && this.a == ((l) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("TicketActionButtonTooltipChanged(newValue="), this.a, ')');
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class m implements g {
            public final boolean a;

            public m(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof m) && this.a == ((m) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("UseAsTemplateChanged(newValue="), this.a, ')');
            }
        }
    }

    /* compiled from: ClipsUploadPatch.kt */
    public interface h extends ugf {

        /* compiled from: ClipsUploadPatch.kt */
        public static final class a implements h {
            public final ClipInvolvementActionButton<?> a;

            public a(ClipInvolvementActionButton<?> clipInvolvementActionButton) {
                this.a = clipInvolvementActionButton;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                ClipInvolvementActionButton<?> clipInvolvementActionButton = this.a;
                if (clipInvolvementActionButton == null) {
                    return 0;
                }
                return clipInvolvementActionButton.hashCode();
            }

            public final String toString() {
                return "SetActionButtonItem(item=" + this.a + ')';
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class b implements h {
            public final ArrayList a;

            public b(ArrayList arrayList) {
                this.a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a.equals(((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("SetMarketAttachments(goods="), this.a);
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class c implements h {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 2091195363;
            }

            public final String toString() {
                return "SetModalOpenChannelOnboardingShown";
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class d implements h {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 966386500;
            }

            public final String toString() {
                return "SetOpenChannelOnboardingShown";
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class e implements h {
            public final OrdData a;

            public e(OrdData ordData) {
                this.a = ordData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
            }

            public final int hashCode() {
                OrdData ordData = this.a;
                if (ordData == null) {
                    return 0;
                }
                return ordData.hashCode();
            }

            public final String toString() {
                return "SetOrdData(data=" + this.a + ')';
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class f implements h {
            public final ClipsDraftablePlaylist a;

            public f(ClipsDraftablePlaylist clipsDraftablePlaylist) {
                this.a = clipsDraftablePlaylist;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
            }

            public final int hashCode() {
                ClipsDraftablePlaylist clipsDraftablePlaylist = this.a;
                if (clipsDraftablePlaylist == null) {
                    return 0;
                }
                return clipsDraftablePlaylist.hashCode();
            }

            public final String toString() {
                return "SetPlaylist(playlist=" + this.a + ')';
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class g implements h {
            public final Long a;

            public g(Long l) {
                this.a = l;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
            }

            public final int hashCode() {
                Long l = this.a;
                if (l == null) {
                    return 0;
                }
                return l.hashCode();
            }

            public final String toString() {
                return iq.b(new StringBuilder("SetPublicationDate(timeMs="), this.a, ')');
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        /* renamed from: xsna.ugf$h$h, reason: collision with other inner class name */
        public static final class C3804h implements h {
            public static final C3804h a = new C3804h();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3804h);
            }

            public final int hashCode() {
                return -343162935;
            }

            public final String toString() {
                return "SetTicketActionButtonTooltipShown";
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class i implements h {
            public final ClipAttachedVideoInfo a;

            public i(ClipAttachedVideoInfo clipAttachedVideoInfo) {
                this.a = clipAttachedVideoInfo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
            }

            public final int hashCode() {
                ClipAttachedVideoInfo clipAttachedVideoInfo = this.a;
                if (clipAttachedVideoInfo == null) {
                    return 0;
                }
                return clipAttachedVideoInfo.hashCode();
            }

            public final String toString() {
                return "SetVideoAttachmentData(data=" + this.a + ')';
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class j implements h {
            public final boolean a;

            public j(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && this.a == ((j) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("SetVideoClipAttachOnboardingChanged(hasOnboarding="), this.a, ')');
            }
        }
    }

    /* compiled from: ClipsUploadPatch.kt */
    public interface i extends ugf {

        /* compiled from: ClipsUploadPatch.kt */
        public static final class a implements i {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 562108452;
            }

            public final String toString() {
                return "ResetCTAMessageToBCTooltip";
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class b implements i {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1401944095;
            }

            public final String toString() {
                return "ResetCTAOnlineBookingTooltip";
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class c implements i {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1976112302;
            }

            public final String toString() {
                return "ResetCTAOpenChannelTooltip";
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class d implements i {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1383093619;
            }

            public final String toString() {
                return "ResetCoauthorsTooltip";
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class e implements i {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 1228143959;
            }

            public final String toString() {
                return "ResetDonutActionTooltip";
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class f implements i {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -1713522383;
            }

            public final String toString() {
                return "ResetEasyPromoteTooltip";
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class g implements i {
            public static final g a = new g();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return 831895175;
            }

            public final String toString() {
                return "ResetOnboarding";
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class h implements i {
            public static final h a = new h();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return -637664357;
            }

            public final String toString() {
                return "ResetRedirectTooltip";
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        /* renamed from: xsna.ugf$i$i, reason: collision with other inner class name */
        public static final class C3805i implements i {
            public static final C3805i a = new C3805i();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3805i);
            }

            public final int hashCode() {
                return -1017949992;
            }

            public final String toString() {
                return "ResetTrendingHashtagsBadgeTooltip";
            }
        }

        /* compiled from: ClipsUploadPatch.kt */
        public static final class j implements i {
            public static final j a = new j();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public final int hashCode() {
                return -1099659168;
            }

            public final String toString() {
                return "ResetVkTicketActionTooltip";
            }
        }
    }
}
