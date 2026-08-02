package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.clips.sdk.shared.api.comment.SdkReplyInfo;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.playlist.SdkClipsDraftablePlaylist;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.clips.external.ClipsDraftablePlaylist;
import com.vk.dto.common.ClipStatStoryData;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.DuetType;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.masks.Mask;
import com.vk.dto.music.MusicCameraData;
import com.vk.dto.music.MusicTrack;
import com.vk.libvideo.models.comment.ReplyInfo;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.j5f;

/* compiled from: ClipsBridge.kt */
/* loaded from: classes15.dex */
public interface pkd {
    public static final /* synthetic */ int a = 0;

    static {
        int i = a.a;
    }

    static /* synthetic */ void A(pkd pkdVar, u90 u90Var, int i, String str, String str2, Long l, String str3, String str4, ClipVideoFile clipVideoFile, MusicTrack musicTrack, int i2, String str5, Boolean bool, DuetType duetType, String str6, MusicCameraData musicCameraData, boolean z, UserId userId, int i3) {
        UserId userId2;
        pkd pkdVar2;
        u90 u90Var2;
        String str7;
        String str8;
        String str9;
        Boolean bool2 = Boolean.FALSE;
        int i4 = (i3 & 2) != 0 ? 0 : i;
        Long l2 = (i3 & 16) != 0 ? null : l;
        String str10 = (i3 & 32) != 0 ? null : str3;
        String str11 = (i3 & 64) != 0 ? null : str4;
        ClipVideoFile clipVideoFile2 = (i3 & 128) != 0 ? null : clipVideoFile;
        MusicTrack musicTrack2 = (i3 & 256) != 0 ? null : musicTrack;
        int i5 = (i3 & 512) != 0 ? 0 : i2;
        Boolean bool3 = (i3 & 2048) != 0 ? null : bool;
        DuetType duetType2 = (i3 & 4096) != 0 ? null : duetType;
        Boolean bool4 = (i3 & 8192) != 0 ? null : bool2;
        String str12 = (i3 & 16384) != 0 ? null : str6;
        MusicCameraData musicCameraData2 = (32768 & i3) != 0 ? null : musicCameraData;
        boolean z2 = (65536 & i3) != 0 ? true : z;
        if ((i3 & 131072) != 0) {
            userId2 = null;
            u90Var2 = u90Var;
            str7 = str;
            str8 = str2;
            str9 = str5;
            pkdVar2 = pkdVar;
        } else {
            userId2 = userId;
            pkdVar2 = pkdVar;
            u90Var2 = u90Var;
            str7 = str;
            str8 = str2;
            str9 = str5;
        }
        pkdVar2.o(u90Var2, i4, str7, str8, l2, str10, str11, clipVideoFile2, musicTrack2, i5, str9, bool3, duetType2, bool4, str12, musicCameraData2, z2, userId2);
    }

    unf Z();

    ClipsRouter a();

    default Integer b() {
        return null;
    }

    @ozl
    default boolean c(VideoFile videoFile) {
        return false;
    }

    @ozl
    default boolean d(VideoFile videoFile) {
        return false;
    }

    jwe e();

    s2f e0();

    v1e getExperiments();

    qwe getPrivacy();

    kgd h();

    default io.reactivex.rxjava3.core.x<List<tce>> j() {
        return sn.b("");
    }

    jgd k0();

    jie m();

    default boolean n() {
        return true;
    }

    default void o(u90 u90Var, int i, String str, String str2, Long l, String str3, String str4, ClipVideoFile clipVideoFile, MusicTrack musicTrack, int i2, String str5, Boolean bool, DuetType duetType, Boolean bool2, String str6, MusicCameraData musicCameraData, boolean z, UserId userId) {
    }

    default List<ClipFeedTab> p(ClipFeedTab.WithPayload.Payload payload) {
        return EmptyList.b;
    }

    pfu u();

    default boolean v(VideoFile videoFile) {
        return false;
    }

    default FragmentImpl x(String str) {
        throw new UnsupportedOperationException();
    }

    /* compiled from: ClipsBridge.kt */
    public static final class a {
        private static final pkd STUB = new C3515a();
        public static final /* synthetic */ int a = 0;

        public final pkd getSTUB() {
            return STUB;
        }

        /* compiled from: ClipsBridge.kt */
        /* renamed from: xsna.pkd$a$a, reason: collision with other inner class name */
        public static final class C3515a implements pkd {
            public final j5f.a.f b;
            public final j5f.a.j c;
            public final C3516a d;
            public final j5f.a.h e;
            public final j5f.a.m f;
            public final j5f.a.i g;
            public final j5f.a.c h;
            public final j5f.a.b i;
            public final sd9 j;
            public final j5f.a.e k;

            /* compiled from: ClipsBridge.kt */
            /* renamed from: xsna.pkd$a$a$a, reason: collision with other inner class name */
            public static final class C3516a implements s2f {
                @Override // xsna.s2f
                public final VideoFile a(SdkVideoFile sdkVideoFile) {
                    throw new IllegalStateException("Access ClipsSharedModelsAdapter.adaptToInternalVideoFile on STUB");
                }

                @Override // xsna.s2f
                public final SdkReplyInfo b(ReplyInfo replyInfo) {
                    throw new IllegalStateException("Access ClipsSharedModelsAdapter.adaptReplyInfo on STUB");
                }

                @Override // xsna.s2f
                public final SdkVideoFile c(VideoFile videoFile) {
                    throw new IllegalStateException("Access ClipsSharedModelsAdapter.adaptVideoFile on STUB");
                }

                @Override // xsna.s2f
                public final ClipsDraftablePlaylist d(SdkClipsDraftablePlaylist sdkClipsDraftablePlaylist) {
                    throw new IllegalStateException("Access ClipsSharedModelsAdapter.adaptDraftablePlaylist on STUB");
                }

                @Override // xsna.s2f
                public final SdkClipVideoFile e(ClipVideoFile clipVideoFile) {
                    throw new IllegalStateException("Access ClipsSharedModelsAdapter.adaptVideoFile on STUB");
                }
            }

            public C3515a() {
                j5f.a.getClass();
                this.b = j5f.a.i;
                this.c = j5f.a.h;
                this.d = new C3516a();
                this.e = j5f.a.f;
                this.f = j5f.a.g;
                this.g = j5f.a.k;
                j5f.a.C3093a c3093a = j5f.a.l;
                this.h = j5f.a.j;
                this.i = j5f.a.m;
                this.j = new sd9();
                this.k = j5f.a.n;
            }

            @Override // xsna.pkd
            public final unf Z() {
                return this.f;
            }

            @Override // xsna.pkd
            public final ClipsRouter a() {
                return this.c;
            }

            @Override // xsna.pkd
            public final Integer b() {
                return null;
            }

            @Override // xsna.pkd
            @ozl
            public final boolean c(VideoFile videoFile) {
                return false;
            }

            @Override // xsna.pkd
            @ozl
            public final boolean d(VideoFile videoFile) {
                return false;
            }

            @Override // xsna.pkd
            public final jwe e() {
                return this.e;
            }

            @Override // xsna.pkd
            public final s2f e0() {
                return this.d;
            }

            @Override // xsna.pkd
            public final v1e getExperiments() {
                return this.b;
            }

            @Override // xsna.pkd
            public final qwe getPrivacy() {
                return this.g;
            }

            @Override // xsna.pkd
            public final kgd h() {
                return this.h;
            }

            @Override // xsna.pkd
            public final jgd k0() {
                return this.i;
            }

            @Override // xsna.pkd
            public final jie m() {
                return this.k;
            }

            @Override // xsna.pkd
            public final boolean n() {
                return true;
            }

            @Override // xsna.pkd
            public final void o(u90 u90Var, int i, String str, String str2, Long l, String str3, String str4, ClipVideoFile clipVideoFile, MusicTrack musicTrack, int i2, String str5, Boolean bool, DuetType duetType, Boolean bool2, String str6, MusicCameraData musicCameraData, boolean z, UserId userId) {
            }

            @Override // xsna.pkd
            public final List<ClipFeedTab> p(ClipFeedTab.WithPayload.Payload payload) {
                return EmptyList.b;
            }

            @Override // xsna.pkd
            public final pfu u() {
                return this.j;
            }

            @Override // xsna.pkd
            public final boolean v(VideoFile videoFile) {
                return false;
            }

            @Override // xsna.pkd
            public final FragmentImpl x(String str) {
                throw new UnsupportedOperationException();
            }

            @Override // xsna.pkd
            public final void r() {
            }

            @Override // xsna.pkd
            public final void B(Context context) {
            }

            @Override // xsna.pkd
            public final void t(Context context) {
            }

            @Override // xsna.pkd
            public final void f(Context context, String str) {
            }

            @Override // xsna.pkd
            public final void y(Activity activity, fju fjuVar) {
            }

            @Override // xsna.pkd
            public final void k(UserId userId, Context context, ClipsRouter.GridForcedTab gridForcedTab) {
            }

            @Override // xsna.pkd
            public final void s(ClipVideoFile clipVideoFile, String str, String str2) {
            }

            @Override // xsna.pkd
            public final void w(FragmentActivity fragmentActivity, String str, String str2) {
            }

            @Override // xsna.pkd
            public final void i(Activity activity, String str, MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint, Mask mask, UserId userId, String str2, ClipVideoFile clipVideoFile, MusicTrack musicTrack, int i, String str3) {
            }

            @Override // xsna.pkd
            public final void g(Context context, String str, String str2, long j) {
            }

            @Override // xsna.pkd
            public final void l(Context context, String str, String str2, String str3) {
            }

            @Override // xsna.pkd
            public final void q(bc6 bc6Var, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint creationEntryPoint, ClipStatStoryData clipStatStoryData) {
            }
        }
    }

    default void r() {
    }

    default void B(Context context) {
    }

    default void t(Context context) {
    }

    default void f(Context context, String str) {
    }

    default void y(Activity activity, fju fjuVar) {
    }

    default void k(UserId userId, Context context, ClipsRouter.GridForcedTab gridForcedTab) {
    }

    default void s(ClipVideoFile clipVideoFile, String str, String str2) {
    }

    default void w(FragmentActivity fragmentActivity, String str, String str2) {
    }

    default void i(Activity activity, String str, MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint, Mask mask, UserId userId, String str2, ClipVideoFile clipVideoFile, MusicTrack musicTrack, int i, String str3) {
    }

    default void g(Context context, String str, String str2, long j) {
    }

    default void l(Context context, String str, String str2, String str3) {
    }

    default void q(bc6 bc6Var, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint creationEntryPoint, ClipStatStoryData clipStatStoryData) {
    }
}
