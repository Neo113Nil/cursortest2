package xsna;

import android.content.Context;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.dto.group.GroupContentTabType;
import com.vk.imageloader.ImageScreenSize;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.cvd0;

/* compiled from: CommunityProfileContentClipsFeatureDelegateBase.kt */
/* loaded from: classes5.dex */
public class ggh extends nfh<Clips, xaf> {
    public static final int p = iah0.a(120);
    public static final int q = iah0.a(Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE);
    public static final List<BaseUserGroupFieldsDto> r = e43.l(BaseUserGroupFieldsDto.VERIFIED, BaseUserGroupFieldsDto.URL);
    public static final List<BaseUserGroupFieldsDto> s = Collections.singletonList(BaseUserGroupFieldsDto.PHOTO_BASE);
    public final ynh j;
    public ExtendedCommunityProfile k;
    public Clips l;
    public Clips m;
    public boolean n;
    public final Object o;

    /* compiled from: CommunityProfileContentClipsFeatureDelegateBase.kt */
    public static final class a {
        public final GroupsGetContentForTabsResponseDto a;
        public final GroupsGetContentForTabsResponseDto b;
        public final gud c;
        public final Clips.ContentTabCollection d;
        public final Integer e;

        public a(GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto, GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto2, gud gudVar, Clips.ContentTabCollection contentTabCollection, Integer num) {
            this.a = groupsGetContentForTabsResponseDto;
            this.b = groupsGetContentForTabsResponseDto2;
            this.c = gudVar;
            this.d = contentTabCollection;
            this.e = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto = this.a;
            int hashCode = (groupsGetContentForTabsResponseDto == null ? 0 : groupsGetContentForTabsResponseDto.hashCode()) * 31;
            GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto2 = this.b;
            int hashCode2 = (hashCode + (groupsGetContentForTabsResponseDto2 == null ? 0 : groupsGetContentForTabsResponseDto2.hashCode())) * 31;
            gud gudVar = this.c;
            int hashCode3 = (hashCode2 + (gudVar == null ? 0 : gudVar.hashCode())) * 31;
            Clips.ContentTabCollection contentTabCollection = this.d;
            int hashCode4 = (hashCode3 + (contentTabCollection == null ? 0 : contentTabCollection.hashCode())) * 31;
            Integer num = this.e;
            return hashCode4 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClipsTabData(videoResponse=");
            sb.append(this.a);
            sb.append(", playlistsResponse=");
            sb.append(this.b);
            sb.append(", draftsResponse=");
            sb.append(this.c);
            sb.append(", contentTabCollection=");
            sb.append(this.d);
            sb.append(", coOwnerInvitationsCount=");
            return uqi.b(sb, this.e, ')');
        }
    }

    /* compiled from: CommunityProfileContentClipsFeatureDelegateBase.kt */
    public static final class b {
        public final Clips a;
        public final ExtendedCommunityProfile b;
        public final boolean c;

        public b(Clips clips, ExtendedCommunityProfile extendedCommunityProfile, boolean z) {
            this.a = clips;
            this.b = extendedCommunityProfile;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            ExtendedCommunityProfile extendedCommunityProfile = this.b;
            return Boolean.hashCode(this.c) + ((hashCode + (extendedCommunityProfile == null ? 0 : extendedCommunityProfile.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadData(contentItem=");
            sb.append(this.a);
            sb.append(", community=");
            sb.append(this.b);
            sb.append(", firstLoad=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: CommunityProfileContentClipsFeatureDelegateBase.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupContentTabType.values().length];
            try {
                iArr[GroupContentTabType.SHORT_VIDEOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ggh(UserId userId, io.reactivex.rxjava3.disposables.b bVar, po5 po5Var, bw6 bw6Var, p99 p99Var, ynh ynhVar, boolean z) {
        super(userId, bVar, bw6Var, p99Var, po5Var, z);
        this.j = ynhVar;
        this.o = msy.a(LazyThreadSafetyMode.NONE, new yv2(10));
    }

    public static void A(ggh gghVar, Clips clips, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2, CommunityProfileContentItem.State state3, int i) {
        CommunityProfileContentItem.State state4 = (i & 2) != 0 ? null : state;
        CommunityProfileContentItem.State state5 = (i & 4) != 0 ? null : state2;
        CommunityProfileContentItem.State state6 = (i & 8) == 0 ? state3 : null;
        izs<com.vk.profile.community.impl.ui.profile.d, s3q0> izsVar = gghVar.c;
        if (state4 == null) {
            state4 = clips.s;
        }
        CommunityProfileContentItem.State state7 = state4;
        if (state5 == null) {
            state5 = clips.u;
        }
        CommunityProfileContentItem.State state8 = state5;
        if (state6 == null) {
            state6 = clips.v;
        }
        izsVar.invoke(new d.f(Clips.i(clips, null, null, null, null, false, false, null, null, state7, state8, state6, null, false, 255487)));
    }

    public static Clips r(Clips clips, VideoFileOld videoFileOld) {
        cvd0.f fVar = clips.j;
        ArrayList arrayList = fVar != null ? new ArrayList(fVar.a) : new ArrayList();
        arrayList.add(0, videoFileOld);
        return Clips.i(clips, new cvd0.f(arrayList), null, null, null, false, false, null, null, CommunityProfileContentItem.State.LOADED, null, null, null, false, 523774);
    }

    public static Clips s(Clips clips) {
        List<ClipsPlaylist> list;
        List<ClipsPlaylist> list2;
        List<ClipsPlaylist> list3 = clips.k;
        cvd0.f fVar = clips.j;
        CommunityProfileContentItem.ContentType contentType = clips.l;
        if (contentType.l()) {
            ArrayList arrayList = fVar != null ? fVar.a : null;
            if (arrayList == null || arrayList.isEmpty()) {
                return Clips.i(clips, null, null, CommunityProfileContentItem.ContentType.ALBUMS, null, false, false, null, null, null, null, null, null, false, 524283);
            }
        }
        if (contentType.l() && ((list2 = list3) == null || list2.isEmpty())) {
            return Clips.i(clips, null, null, CommunityProfileContentItem.ContentType.ITEMS, null, false, false, null, null, null, null, null, null, false, 524283);
        }
        if (contentType.h()) {
            ArrayList arrayList2 = fVar != null ? fVar.a : null;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                return Clips.i(clips, null, null, CommunityProfileContentItem.ContentType.MIXED, null, false, false, null, null, null, null, null, null, false, 524283);
            }
        }
        return (!contentType.j() || (list = list3) == null || list.isEmpty()) ? clips : Clips.i(clips, null, null, CommunityProfileContentItem.ContentType.MIXED, null, false, false, null, null, null, null, null, null, false, 524283);
    }

    public static VideoFileOld u(gud gudVar, UserId userId) {
        int i;
        if (gudVar == null || (i = gudVar.a) == 0) {
            return null;
        }
        VideoFileOld videoFileOld = new VideoFileOld();
        if (userId == null) {
            userId = UserId.d;
        }
        videoFileOld.b = userId;
        Serializer.c<Image> cVar = Image.CREATOR;
        String str = gudVar.b;
        m900<String, ImageSize> m900Var = ImageSize.e;
        int i2 = p;
        int i3 = q;
        videoFileOld.I0 = Image.b.c(str, i2, i3, ImageSize.b.c(i2, i3));
        videoFileOld.l = String.valueOf(i);
        videoFileOld.p = "tab_collection_draft_dummy";
        return videoFileOld;
    }

    public static VideoFileOld v(Clips.ContentTabCollection contentTabCollection, ExtendedCommunityProfile extendedCommunityProfile) {
        Clips.ContentTabCollection.ContentTabCollectionImage contentTabCollectionImage;
        if (extendedCommunityProfile == null || extendedCommunityProfile.a0 < 2 || contentTabCollection == null || (contentTabCollectionImage = (Clips.ContentTabCollection.ContentTabCollectionImage) j5g.a0(contentTabCollection.c)) == null) {
            return null;
        }
        VideoFileOld videoFileOld = new VideoFileOld();
        videoFileOld.b = UserId.d;
        Serializer.c<Image> cVar = Image.CREATOR;
        String str = contentTabCollectionImage.a;
        int i = contentTabCollectionImage.b;
        int i2 = contentTabCollectionImage.c;
        m900<String, ImageSize> m900Var = ImageSize.e;
        videoFileOld.I0 = Image.b.c(str, i, i2, ImageSize.b.c(i, i2));
        videoFileOld.l = String.valueOf(contentTabCollection.b);
        videoFileOld.p = "tab_collection_scheduled_dummy";
        return videoFileOld;
    }

    @Override // xsna.nfh, xsna.jxg
    public final void a(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        if (extendedCommunityProfile != null) {
            this.d.invoke(new d.j.l0(extendedCommunityProfile.a.c));
        }
    }

    @Override // xsna.nfh, xsna.jxg
    public final void b(ContentTab contentTab, ExtendedCommunityProfile extendedCommunityProfile) {
        GroupContentTabSetting w;
        this.i = true;
        if (!this.n || !(contentTab instanceof ContentTab.Clip) || (w = w(extendedCommunityProfile)) == null || extendedCommunityProfile == null) {
            return;
        }
        Clips t = t(w, extendedCommunityProfile, true);
        this.c.invoke(new d.f(t));
        k(t, extendedCommunityProfile);
    }

    @Override // xsna.nfh, xsna.jxg
    public final void c(CommunityProfileState communityProfileState) {
        ExtendedCommunityProfile extendedCommunityProfile = communityProfileState.b;
        GroupContentTabSetting w = w(extendedCommunityProfile);
        if (w == null || extendedCommunityProfile == null) {
            return;
        }
        Clips t = t(w, extendedCommunityProfile, true);
        this.c.invoke(new d.f(t));
        if (this.i && (communityProfileState.e instanceof ContentTab.Clip)) {
            k(t, extendedCommunityProfile);
        } else {
            this.n = true;
        }
    }

    @Override // xsna.jxg
    public final void d(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        k((Clips) communityProfileContentItem, extendedCommunityProfile);
    }

    @Override // xsna.nfh, xsna.jxg
    public final void e(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        if (extendedCommunityProfile != null) {
            this.d.invoke(new d.j.n.e(extendedCommunityProfile));
        }
    }

    @Override // xsna.jxg
    public final void g(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        if (extendedCommunityProfile != null) {
            this.d.invoke(new d.j.AbstractC1595d.b(extendedCommunityProfile));
        }
    }

    @Override // xsna.jxg
    public final void i(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        f((Clips) communityProfileContentItem, extendedCommunityProfile);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.nfh
    public final io.reactivex.rxjava3.core.q<xaf> m() {
        io.reactivex.rxjava3.subjects.f<bwr0> fVar = wjs0.b;
        l8 l8Var = new l8(new fgh(this, 0), 19);
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, l8Var).L(new nb(new k60(21), 11), false);
    }

    public final Clips t(GroupContentTabSetting groupContentTabSetting, ExtendedCommunityProfile extendedCommunityProfile, boolean z) {
        String str;
        GroupContentTabSetting.GroupContentTabSpecialValues groupContentTabSpecialValues = groupContentTabSetting.h;
        ArrayList arrayList = null;
        Integer num = groupContentTabSpecialValues != null ? groupContentTabSpecialValues.b : null;
        this.k = extendedCommunityProfile;
        GroupContentTabType groupContentTabType = groupContentTabSetting.b;
        List<GroupContentTabType> list = groupContentTabSetting.c;
        CommunityProfileContentItem.ContentType contentType = c.$EnumSwitchMapping$0[groupContentTabType.ordinal()] == 1 ? (list == null || !list.contains(GroupContentTabType.SHORT_VIDEOS_PLAYLISTS)) ? CommunityProfileContentItem.ContentType.ITEMS : CommunityProfileContentItem.ContentType.MIXED : CommunityProfileContentItem.ContentType.ITEMS;
        Integer valueOf = Integer.valueOf(R.string.community_content_create_content);
        if (num != null) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            str = context.getResources().getQuantityString(R.plurals.community_profile_coauthors_invitations, num.intValue(), num);
        } else {
            str = null;
        }
        CommunityProfileContentItem.b p2 = nfh.p(this, groupContentTabSetting, R.string.community_content_clips_empty, valueOf, str, 4);
        CommunityProfileContentItem.c cVar = new CommunityProfileContentItem.c(R.string.community_content_clips_error);
        CommunityProfileContentItem.State state = z ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.INITIAL;
        CommunityProfileContentItem.d n = nfh.n(this, groupContentTabSetting, R.string.community_content_create_content, 0, false, 120);
        CommunityProfileContentItem.State state2 = CommunityProfileContentItem.State.INITIAL;
        List<GroupContentTabSetting.GroupContentTabCollection> list2 = groupContentTabSetting.g;
        if (list2 != null) {
            List<GroupContentTabSetting.GroupContentTabCollection> list3 = list2;
            arrayList = new ArrayList(c5g.u(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(Clips.a.c((GroupContentTabSetting.GroupContentTabCollection) it.next()));
            }
        }
        Clips clips = new Clips(contentType, p2, cVar, state, n, state2, state2, false, arrayList, num, w2h.b(extendedCommunityProfile), 286720);
        this.m = clips;
        return clips;
    }

    public GroupContentTabSetting w(ExtendedCommunityProfile extendedCommunityProfile) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    public final ClipsPlaylist x(ShortVideoPlaylistFullDto shortVideoPlaylistFullDto) {
        int id = shortVideoPlaylistFullDto.getId();
        String title = shortVideoPlaylistFullDto.getTitle();
        List<List<BaseImageDto>> e = shortVideoPlaylistFullDto.e();
        EmptyList emptyList = null;
        if (e != null) {
            List<List<BaseImageDto>> list = e;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List list2 = (List) it.next();
                ((ne6) this.o.getValue()).getClass();
                ImageSize Cb = ne6.a(list2).Cb(ImageScreenSize.VERY_SMALL.h(), true, false);
                String str = Cb != null ? Cb.d.d : null;
                if (str == null) {
                    str = "";
                }
                arrayList.add(str);
            }
            emptyList = arrayList;
        }
        if (emptyList == null) {
            emptyList = EmptyList.b;
        }
        return new ClipsPlaylist(id, title, emptyList, shortVideoPlaylistFullDto.getCount(), shortVideoPlaylistFullDto.q(), false, null, 64, null);
    }

    @Override // xsna.jxg
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void f(Clips clips, ExtendedCommunityProfile extendedCommunityProfile) {
        throw null;
    }

    public final void z(Clips clips) {
        cvd0.f fVar = clips.j;
        ArrayList arrayList = fVar != null ? fVar.a : null;
        if (arrayList == null || arrayList.isEmpty()) {
            A(this, clips, CommunityProfileContentItem.State.ERROR, null, null, 12);
        } else {
            A(this, clips, null, CommunityProfileContentItem.State.ERROR, null, 10);
        }
    }
}
