package xsna;

import android.view.Window;
import com.vk.attachpicker.screen.a;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.Publisher;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.WallOwner;
import com.vk.newsfeed.posting.crop_editor.domain.model.ImageCropResult;
import com.vk.newsfeed.posting.impl.domain.model.EditingPost;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerEntry;
import com.vk.newsfeed.posting.impl.domain.model.MediaViewerOpenPoint;
import com.vk.newsfeed.posting.impl.domain.model.PermissionType;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostPrivacyData;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.StoryRepostData;
import com.vk.newsfeed.posting.impl.domain.model.UserType;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.newsfeed.posting.impl.presentation.model.CoauthorDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import xsna.wq10;

/* compiled from: PostingSideEffect.kt */
/* loaded from: classes4.dex */
public interface fmc0 {

    /* compiled from: PostingSideEffect.kt */
    public static final class a implements fmc0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1370373513;
        }

        public final String toString() {
            return "ClearCurrentStepStack";
        }
    }

    /* compiled from: PostingSideEffect.kt */
    public static final class b implements fmc0 {
        public final ezw a;

        public b(ezw ezwVar) {
            this.a = ezwVar;
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
            return "DraftLoaded(initialData=" + this.a + ')';
        }
    }

    /* compiled from: PostingSideEffect.kt */
    public static abstract class c implements fmc0 {
        public final PermissionType a;

        /* compiled from: PostingSideEffect.kt */
        public static final class a extends c {
            public final boolean b;

            public a() {
                super(PermissionType.Camera);
                this.b = true;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Camera(openCameraAfterGranted="), this.b, ')');
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class b extends c {
            public static final b b = new b(PermissionType.GalleryView);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 964435021;
            }

            public final String toString() {
                return "GalleryView";
            }
        }

        public c(PermissionType permissionType) {
            this.a = permissionType;
        }
    }

    /* compiled from: PostingSideEffect.kt */
    public static final class d implements fmc0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1596001557;
        }

        public final String toString() {
            return "HideMessages";
        }
    }

    /* compiled from: PostingSideEffect.kt */
    public static final class e implements fmc0 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1096750531;
        }

        public final String toString() {
            return "HideProgressBar";
        }
    }

    /* compiled from: PostingSideEffect.kt */
    public interface f extends fmc0 {

        /* compiled from: PostingSideEffect.kt */
        public static final class a implements f {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -2023438281;
            }

            public final String toString() {
                return "OnResume";
            }
        }
    }

    /* compiled from: PostingSideEffect.kt */
    public static final class g implements fmc0 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 998195384;
        }

        public final String toString() {
            return "ListenClosePosting";
        }
    }

    /* compiled from: PostingSideEffect.kt */
    public interface h extends fmc0 {

        /* compiled from: PostingSideEffect.kt */
        public static final class a implements h {
            public final int a;
            public final int b;

            public a(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            public final int a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AlbumSelected(albumId=");
                sb.append(this.a);
                sb.append(", albumIndex=");
                return vu5.b(sb, this.b, ')');
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class b implements h {
            public final wq10.a a;
            public final boolean b;

            public b(wq10.a aVar, boolean z) {
                this.a = aVar;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && this.b == bVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.a.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("LocalMediaSelectionChanged(entry=");
                sb.append(this.a);
                sb.append(", isSelected=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class c implements h {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 727950001;
            }

            public final String toString() {
                return "PageViewCreated";
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class d implements h {
            public final int a;

            public d(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.a == ((d) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("ShowMaxCountMediaEnrichedSnackbar(maxCount="), this.a, ')');
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class e implements h {
            public final Photo a;
            public final boolean b;

            public e(Photo photo, boolean z) {
                this.a = photo;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.a, eVar.a) && this.b == eVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("VkPhotoSelectionChanged(photo=");
                sb.append(this.a);
                sb.append(", isSelected=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class f implements h {
            public final VideoFile a;
            public final boolean b;

            public f(VideoFile videoFile, boolean z) {
                this.a = videoFile;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return epx.f(this.a, fVar.a) && this.b == fVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("VkVideoSelectionChanged(video=");
                sb.append(this.a);
                sb.append(", isSelected=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }
    }

    /* compiled from: PostingSideEffect.kt */
    public interface i extends fmc0 {

        /* compiled from: PostingSideEffect.kt */
        public static final class a implements i {
            public final int a;

            public a(int i) {
                this.a = i;
            }

            public final int a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a == ((a) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("LocalPickerPlaceObjectChange(index="), this.a, ')');
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class b implements i {
            public final a.c a;

            public b(a.c cVar) {
                this.a = cVar;
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
                return "MediaPlaceObjectChanged(placeProviderObject=" + this.a + ')';
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class c implements i {
            public final int a;

            public c(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("MiniPreviewPlaceObjectChange(index="), this.a, ')');
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class d implements i {
            public final int a;

            public d(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.a == ((d) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("PreviewPlaceObjectChange(index="), this.a, ')');
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class e implements i {
            public final int a;

            public e(int i) {
                this.a = i;
            }

            public final int a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.a == ((e) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("VkPickerPlaceObjectChange(index="), this.a, ')');
            }
        }
    }

    /* compiled from: PostingSideEffect.kt */
    public interface j extends fmc0 {

        /* compiled from: PostingSideEffect.kt */
        public static final class a implements j {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 766787560;
            }

            public final String toString() {
                return "BackPressed";
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class b implements j {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -80659216;
            }

            public final String toString() {
                return "BackToStep1";
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class c implements j {
            public final boolean a;
            public final PostEditingReason b;
            public final boolean c;

            public c(PostEditingReason postEditingReason, boolean z, boolean z2) {
                this.a = z;
                this.b = postEditingReason;
                this.c = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a == cVar.a && epx.f(this.b, cVar.b) && this.c == cVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Close(isInterrupt=");
                sb.append(this.a);
                sb.append(", editingReason=");
                sb.append(this.b);
                sb.append(", goToOriginFeed=");
                return defpackage.q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class d implements j {
            public final List<ActionButton> a;
            public final ActionButton b;
            public final UUID c;
            public final WallOwner d;

            public d(List<ActionButton> list, ActionButton actionButton, UUID uuid, WallOwner wallOwner) {
                this.a = list;
                this.b = actionButton;
                this.c = uuid;
                this.d = wallOwner;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                ActionButton actionButton = this.b;
                return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (actionButton == null ? 0 : actionButton.hashCode())) * 31)) * 31);
            }

            public final String toString() {
                return "OpenActionButtonsList(availableActions=" + this.a + ", action=" + this.b + ", screenUniqueId=" + this.c + ", owner=" + this.d + ')';
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class e implements j {
            public final PostEditingReason a;
            public final WallOwner b;
            public final AdditionalSettingsConfiguration c;
            public final boolean d;
            public final boolean e;
            public final boolean f;
            public final boolean g;
            public final UserType h;
            public final boolean i;
            public final String j;
            public final String k;
            public final UUID l;

            public e(PostEditingReason postEditingReason, WallOwner wallOwner, AdditionalSettingsConfiguration additionalSettingsConfiguration, boolean z, boolean z2, boolean z3, boolean z4, UserType userType, boolean z5, String str, String str2, UUID uuid) {
                this.a = postEditingReason;
                this.b = wallOwner;
                this.c = additionalSettingsConfiguration;
                this.d = z;
                this.e = z2;
                this.f = z3;
                this.g = z4;
                this.h = userType;
                this.i = z5;
                this.j = str;
                this.k = str2;
                this.l = uuid;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && this.d == eVar.d && this.e == eVar.e && this.f == eVar.f && this.g == eVar.g && this.h == eVar.h && this.i == eVar.i && epx.f(this.j, eVar.j) && epx.f(this.k, eVar.k) && epx.f(this.l, eVar.l);
            }

            public final int hashCode() {
                int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
                AdditionalSettingsConfiguration additionalSettingsConfiguration = this.c;
                return this.l.hashCode() + urd0.a(urd0.a(qoy.b((this.h.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b((hashCode + (additionalSettingsConfiguration == null ? 0 : additionalSettingsConfiguration.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31, 31, this.i), 31, this.j), 31, this.k);
            }

            public final String toString() {
                return "OpenAdditionalSettingScreen(editingReason=" + this.a + ", owner=" + this.b + ", additionalSettingsConfiguration=" + this.c + ", shouldShowNotificationsButton=" + this.d + ", isCommunity=" + this.e + ", hasCoauthors=" + this.f + ", isCommentChangeAvailable=" + this.g + ", userType=" + this.h + ", isAdmin=" + this.i + ", signerFirstNameGen=" + this.j + ", signerLastNameGen=" + this.k + ", screenUniqueId=" + this.l + ')';
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class f implements j {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -1713706558;
            }

            public final String toString() {
                return "OpenCamera";
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class g implements j {
            public final UserId a;
            public final List<CoauthorDto> b;

            public g(UserId userId, List<CoauthorDto> list) {
                this.a = userId;
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b);
            }

            public final int hashCode() {
                int hashCode = Long.hashCode(this.a.b) * 31;
                List<CoauthorDto> list = this.b;
                return hashCode + (list == null ? 0 : list.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenCoAuthorsBottomSheet(authorId=");
                sb.append(this.a);
                sb.append(", preselectedCoauthors=");
                return ms9.a(')', sb, this.b);
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class h implements j {
            public final String a;
            public final String b;

            public h(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return epx.f(this.a, hVar.a) && epx.f(this.b, hVar.b);
            }

            public final int hashCode() {
                String str = this.a;
                return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenDonutTeaserBottomSheet(donutTeaserText=");
                sb.append(this.a);
                sb.append(", defaultDonutTeaserText=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class i implements j {
            public final UserId a;

            public i(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("OpenDraftsList(ownerId="), this.a, ')');
            }
        }

        /* compiled from: PostingSideEffect.kt */
        /* renamed from: xsna.fmc0$j$j, reason: collision with other inner class name */
        public static final class C2885j implements j {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2885j)) {
                    return false;
                }
                ((C2885j) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return 1746333021;
            }

            public final String toString() {
                return "OpenLink(url=https://m.vkvideo.ru/legal/terms)";
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class k implements j {
            public final ArrayList a;
            public final List<Pair<Integer, MediaStoreEntry>> b;
            public final MediaStoreEntry c;
            public final int d;
            public final boolean e;
            public final boolean f;
            public final MediaViewerOpenPoint g;
            public final u2u0 h;

            public k(ArrayList arrayList, List list, MediaStoreEntry mediaStoreEntry, int i, boolean z, boolean z2, MediaViewerOpenPoint mediaViewerOpenPoint, u2u0 u2u0Var) {
                this.a = arrayList;
                this.b = list;
                this.c = mediaStoreEntry;
                this.d = i;
                this.e = z;
                this.f = z2;
                this.g = mediaViewerOpenPoint;
                this.h = u2u0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof k)) {
                    return false;
                }
                k kVar = (k) obj;
                return this.a.equals(kVar.a) && epx.f(this.b, kVar.b) && epx.f(this.c, kVar.c) && this.d == kVar.d && this.e == kVar.e && this.f == kVar.f && this.g == kVar.g && epx.f(this.h, kVar.h);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                List<Pair<Integer, MediaStoreEntry>> list = this.b;
                return this.h.hashCode() + ((this.g.hashCode() + qoy.b(qoy.b(shy.a(this.d, (this.c.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31, 31), 31, this.e), 31, this.f)) * 31);
            }

            public final String toString() {
                return "OpenLocalMediaViewer(allEntries=" + this.a + ", selectedEntries=" + this.b + ", entryToOpen=" + this.c + ", entryIndex=" + this.d + ", isEditEnabled=" + this.e + ", isSelectedEnabled=" + this.f + ", openPoint=" + this.g + ", viewerCropType=" + this.h + ')';
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class l implements j {
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class m implements j {
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
                return ho8.a(new StringBuilder("OpenMiniApp(url="), this.a, ')');
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class n implements j {
            public static final n a = new n();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof n);
            }

            public final int hashCode() {
                return 1857674621;
            }

            public final String toString() {
                return "OpenNotificationDataLossDialog";
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class o implements j {
            public final MediaPickerEntry a;

            public o(MediaPickerEntry mediaPickerEntry) {
                this.a = mediaPickerEntry;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof o) && epx.f(this.a, ((o) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OpenPhotoEditor(entryToOpen=" + this.a + ')';
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class p implements j {
            public final PostPrivacyData a;

            public p(PostPrivacyData postPrivacyData) {
                this.a = postPrivacyData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof p) && epx.f(this.a, ((p) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OpenPrivacyBottomSheet(privacyData=" + this.a + ')';
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class q implements j {
            public final List<Photo> a;
            public final List<Pair<Integer, Photo>> b;
            public final Photo c;
            public final int d;
            public final MediaViewerOpenPoint e;

            public q(List list, List list2, Photo photo, int i, MediaViewerOpenPoint mediaViewerOpenPoint) {
                this.a = list;
                this.b = list2;
                this.c = photo;
                this.d = i;
                this.e = mediaViewerOpenPoint;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof q)) {
                    return false;
                }
                q qVar = (q) obj;
                return this.a.equals(qVar.a) && this.b.equals(qVar.b) && this.c.equals(qVar.c) && this.d == qVar.d && this.e == qVar.e;
            }

            public final int hashCode() {
                return this.e.hashCode() + qoy.b(qoy.b(shy.a(this.d, (this.c.hashCode() + fw3.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31, false), 31, true);
            }

            public final String toString() {
                return "OpenRemoteMediaViewer(allEntries=" + this.a + ", selectedEntries=" + this.b + ", entryToOpen=" + this.c + ", entryIndex=" + this.d + ", isEditEnabled=false, isSelectedEnabled=true, openPoint=" + this.e + ')';
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class r implements j {
            public final PostPrivacyData a;

            public r(PostPrivacyData postPrivacyData) {
                this.a = postPrivacyData;
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
                return "OpenSelectDonutLevel(privacyData=" + this.a + ')';
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class s implements j {
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class t implements j {
            public final VideoFile a;

            public t(VideoFile videoFile) {
                this.a = videoFile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof t) && epx.f(this.a, ((t) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return lq.a(new StringBuilder("OpenVkVideoViewer(video="), this.a, ')');
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class u implements j {
            public final boolean a;
            public final PostEditingReason b;

            public u(boolean z, PostEditingReason postEditingReason) {
                this.a = z;
                this.b = postEditingReason;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof u)) {
                    return false;
                }
                u uVar = (u) obj;
                return this.a == uVar.a && epx.f(this.b, uVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                return "ShowExitConfirmDialog(clearDraft=" + this.a + ", editingReason=" + this.b + ')';
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class v implements j {
            public final PostEditingReason a;

            public v(PostEditingReason postEditingReason) {
                this.a = postEditingReason;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof v) && epx.f(this.a, ((v) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ShowExitSaveDraftDialog(editingReason=" + this.a + ')';
            }
        }
    }

    /* compiled from: PostingSideEffect.kt */
    public static final class k implements fmc0 {
        public final vdc0 a;

        public k(vdc0 vdc0Var) {
            this.a = vdc0Var;
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
            return "NewRatioSet(crops=" + this.a + ')';
        }
    }

    /* compiled from: PostingSideEffect.kt */
    public static final class l implements fmc0 {
        public final VideoFile a;
        public final String b;
        public final UserId c;
        public final String d;

        public l(VideoFile videoFile, String str, UserId userId, String str2) {
            this.a = videoFile;
            this.b = str;
            this.c = userId;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return epx.f(this.a, lVar.a) && epx.f(this.b, lVar.b) && epx.f(this.c, lVar.c) && epx.f(this.d, lVar.d);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return this.d.hashCode() + bh10.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenClipsPublication(video=");
            sb.append(this.a);
            sb.append(", description=");
            sb.append(this.b);
            sb.append(", authorId=");
            sb.append(this.c);
            sb.append(", uriString=");
            return ho8.a(sb, this.d, ')');
        }
    }

    /* compiled from: PostingSideEffect.kt */
    public interface m extends fmc0 {

        /* compiled from: PostingSideEffect.kt */
        public static final class a implements m {
            public final boolean a;
            public final UserId b;

            public a(UserId userId, boolean z) {
                this.a = z;
                this.b = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && epx.f(this.b, aVar.b);
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b) + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ShowDraftSuccess(wasEdit=");
                sb.append(this.a);
                sb.append(", ownerId=");
                return gp.b(sb, this.b, ')');
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class b implements m {
            public final Throwable a;

            public b(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                Throwable th = this.a;
                return (th == null ? 0 : th.hashCode()) * 31;
            }

            public final String toString() {
                return "ShowError(throwable=" + this.a + ", message=null)";
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class c implements m {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 959575737;
            }

            public final String toString() {
                return "ShowLoading";
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class d implements m {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1161911453;
            }

            public final String toString() {
                return "ShowStoryRepostError";
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class e implements m {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 825785336;
            }

            public final String toString() {
                return "ShowStoryRepostPublishing";
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class f implements m {
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
                return ho8.a(new StringBuilder("ShowStoryRepostSuccess(ownerStoryId="), this.a, ')');
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class g implements m {
            public final boolean a;
            public final boolean b;
            public final boolean c;
            public final boolean d;
            public final boolean e;
            public final NewsEntry f;
            public final PostEditingReason g;
            public final int h;
            public final Publisher i;
            public final EditingPost j;
            public final StoryRepostData k;

            public g(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, NewsEntry newsEntry, PostEditingReason postEditingReason, int i, Publisher publisher, EditingPost editingPost, StoryRepostData storyRepostData) {
                this.a = z;
                this.b = z2;
                this.c = z3;
                this.d = z4;
                this.e = z5;
                this.f = newsEntry;
                this.g = postEditingReason;
                this.h = i;
                this.i = publisher;
                this.j = editingPost;
                this.k = storyRepostData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return this.a == gVar.a && this.b == gVar.b && this.c == gVar.c && this.d == gVar.d && this.e == gVar.e && epx.f(this.f, gVar.f) && epx.f(this.g, gVar.g) && this.h == gVar.h && epx.f(this.i, gVar.i) && epx.f(this.j, gVar.j) && epx.f(this.k, gVar.k);
            }

            public final int hashCode() {
                int a = shy.a(this.h, (this.g.hashCode() + e630.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31);
                Publisher publisher = this.i;
                int hashCode = (a + (publisher == null ? 0 : publisher.hashCode())) * 31;
                EditingPost editingPost = this.j;
                int hashCode2 = (hashCode + (editingPost == null ? 0 : editingPost.hashCode())) * 31;
                StoryRepostData storyRepostData = this.k;
                return hashCode2 + (storyRepostData != null ? storyRepostData.hashCode() : 0);
            }

            public final String toString() {
                return "ShowSuccess(wasEdit=" + this.a + ", isSuggest=" + this.b + ", isAdmin=" + this.c + ", isSnackBarRequired=" + this.d + ", isPostingSuccessToastRequired=" + this.e + ", publishedEntry=" + this.f + ", editingReason=" + this.g + ", editPostId=" + this.h + ", publisher=" + this.i + ", editingPost=" + this.j + ", storyRepostData=" + this.k + ')';
            }
        }
    }

    /* compiled from: PostingSideEffect.kt */
    public static final class n implements fmc0 {
        public final ImageCropResult a;

        public n(ImageCropResult imageCropResult) {
            this.a = imageCropResult;
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
            return "SetCropAreas(imageCropResult=" + this.a + ')';
        }
    }

    /* compiled from: PostingSideEffect.kt */
    public interface o extends fmc0 {
    }

    /* compiled from: PostingSideEffect.kt */
    public static final class q implements fmc0 {
        public static final q a = new q();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return 1514193882;
        }

        public final String toString() {
            return "ShowModalBackToStep1";
        }
    }

    /* compiled from: PostingSideEffect.kt */
    public static final class r implements fmc0 {
        public static final r a = new r();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof r);
        }

        public final int hashCode() {
            return -2091935326;
        }

        public final String toString() {
            return "ShowProgressBar";
        }
    }

    /* compiled from: PostingSideEffect.kt */
    public static final class s implements fmc0 {
        public final long a;

        public s(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && this.a == ((s) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("ShowSnackBarCropZoom(delay="));
        }
    }

    /* compiled from: PostingSideEffect.kt */
    public static final class t implements fmc0 {
        public static final t a = new t();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return 1375488268;
        }

        public final String toString() {
            return "ShowSnackbarPhotoWithGoodsInCarousel";
        }
    }

    /* compiled from: PostingSideEffect.kt */
    public interface u extends fmc0 {

        /* compiled from: PostingSideEffect.kt */
        public static final class a implements u {
            public final PostingAttachment a;

            public a(PostingAttachment postingAttachment) {
                this.a = postingAttachment;
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
                return "ScrollToAttachment(attachment=" + this.a + ')';
            }
        }
    }

    /* compiled from: PostingSideEffect.kt */
    public interface v extends fmc0 {

        /* compiled from: PostingSideEffect.kt */
        public static final class a implements v {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 938275852;
            }

            public final String toString() {
                return "MeasureColdStart";
            }
        }
    }

    /* compiled from: PostingSideEffect.kt */
    public interface w extends fmc0 {

        /* compiled from: PostingSideEffect.kt */
        public static final class a implements w {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -660419968;
            }

            public final String toString() {
                return "ParseLinks";
            }
        }

        /* compiled from: PostingSideEffect.kt */
        public static final class b implements w {
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
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("RemoveLink(link="), this.a, ')');
            }
        }
    }

    /* compiled from: PostingSideEffect.kt */
    public static final class x implements fmc0 {
        public final UiTrackingScreen a;
        public final boolean b;

        public x(UiTrackingScreen uiTrackingScreen, boolean z) {
            this.a = uiTrackingScreen;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return this.a.equals(xVar.a) && this.b == xVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TrackScreenNavigation(trackingScreen=");
            sb.append(this.a);
            sb.append(", isForward=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: PostingSideEffect.kt */
    public interface y extends fmc0 {

        /* compiled from: PostingSideEffect.kt */
        public static final class a implements y {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1797539955;
            }

            public final String toString() {
                return "DisposeStep1View";
            }
        }
    }

    /* compiled from: PostingSideEffect.kt */
    public static final class p implements fmc0 {
        public final PostingUserMessage a;
        public final PostingAction b;
        public final h4x c;
        public final Window d;

        public p(PostingUserMessage postingUserMessage, PostingAction postingAction, h4x h4xVar, Window window) {
            this.a = postingUserMessage;
            this.b = postingAction;
            this.c = h4xVar;
            this.d = window;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return epx.f(this.a, pVar.a) && epx.f(this.b, pVar.b) && epx.f(this.c, pVar.c) && epx.f(this.d, pVar.d);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            PostingAction postingAction = this.b;
            int hashCode2 = (this.c.hashCode() + ((hashCode + (postingAction == null ? 0 : postingAction.hashCode())) * 31)) * 31;
            Window window = this.d;
            return hashCode2 + (window != null ? window.hashCode() : 0);
        }

        public final String toString() {
            return "ShowMessage(message=" + this.a + ", originalAction=" + this.b + ", insets=" + this.c + ", customWindow=" + this.d + ')';
        }

        public /* synthetic */ p(PostingUserMessage postingUserMessage) {
            this(postingUserMessage, null, h4x.e, null);
        }
    }
}
