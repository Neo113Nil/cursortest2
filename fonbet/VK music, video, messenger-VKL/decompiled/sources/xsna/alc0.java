package xsna;

import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.common.Attachment;
import com.vk.dto.photo.Photo;
import com.vk.dto.tags.Tag;
import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.impl.domain.model.NearbyPlaces;
import com.vk.newsfeed.posting.impl.domain.model.PhotoTag;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostPrivacyData;
import com.vk.newsfeed.posting.impl.domain.model.PostingContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingHints;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.RepostToStoryOnboarding;
import com.vk.newsfeed.posting.impl.domain.model.attachment.LocalPhotoAttachment;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.presentation.model.GroupPrivacyType;
import com.vk.newsfeed.posting.impl.presentation.model.GroupWallPostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoDto;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoTagsData;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.UserWallPostingSettings;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PostingReducerDelegate.kt */
/* loaded from: classes4.dex */
public final class alc0 {
    public final evl0 a;

    public alc0(evl0 evl0Var) {
        this.a = evl0Var;
    }

    public static void a(Photo photo, Tag tag) {
        if (tag == null || photo.c != tag.e) {
            return;
        }
        List<Tag> list = photo.x;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Tag) it.next()).a == tag.a) {
                    return;
                }
            }
        }
        ArrayList q = p4g.q(photo.x);
        q.add(tag);
        photo.x = q;
    }

    public static PostingState b(PostingState postingState, eic0 eic0Var) {
        Map<Integer, List<PhotoTag>> map;
        Tag tag = eic0Var.c;
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        PostEditableData postEditableData = editing.i;
        PhotoTagsData photoTagsData = postEditableData.r;
        LinkedHashMap linkedHashMap = (photoTagsData == null || (map = photoTagsData.b) == null) ? new LinkedHashMap() : new LinkedHashMap(map);
        PhotoTag photoTag = eic0Var.b;
        List list = (List) linkedHashMap.get(Integer.valueOf(photoTag.g));
        ArrayList arrayList = list != null ? new ArrayList(list) : new ArrayList();
        arrayList.add(photoTag);
        linkedHashMap.put(Integer.valueOf(photoTag.g), arrayList);
        List<PostingAttachment> list2 = postEditableData.p;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            PostingAttachment postingAttachment = (PostingAttachment) it.next();
            if (postingAttachment instanceof PhotoDto) {
                PhotoDto photoDto = (PhotoDto) postingAttachment;
                Attachment attachment = photoDto.c;
                if (attachment instanceof LocalPhotoAttachment) {
                    Parcelable parcelable = photoDto.f.h;
                    PhotoAttachment photoAttachment = parcelable instanceof PhotoAttachment ? (PhotoAttachment) parcelable : null;
                    if (photoAttachment != null) {
                        a(photoAttachment.l, tag);
                    }
                } else if (attachment instanceof PhotoAttachment) {
                    a(((PhotoAttachment) attachment).l, tag);
                }
            }
            arrayList2.add(postingAttachment);
        }
        PhotoTagsData photoTagsData2 = postEditableData.r;
        return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(editing.i, null, null, null, null, null, null, null, null, null, null, null, null, null, arrayList2, null, photoTagsData2 != null ? PhotoTagsData.a(photoTagsData2, linkedHashMap, null, 6) : new PhotoTagsData(linkedHashMap, null, false, 6, null), null, null, null, null, null, false, null, 268353535), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
    }

    public static PostingState c(PostingState postingState, yic0 yic0Var) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(editing.i, null, null, null, null, null, null, yic0Var.b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 268435327), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
    }

    public static PostingState d(PostingState postingState, zic0 zic0Var) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(editing.i, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, zic0Var.b, false, null, 260046847), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
    }

    public static PostingState e(PostingState postingState, cjc0 cjc0Var) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        PostEditableData postEditableData = editing.i;
        PostPrivacyData postPrivacyData = cjc0Var.b;
        return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(postEditableData, null, null, null, null, null, null, postPrivacyData.d, null, null, null, null, null, null, null, null, null, null, null, null, postPrivacyData.g, postPrivacyData.h, false, null, 255852415), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
    }

    public static PostingState f(PostingState postingState, String str) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        return PostingState.Editing.a(editing, null, null, null, null, null, null, null, null, null, null, false, PostingHints.a(editing.o, null, str, false, 959), false, null, null, null, null, null, 1040383);
    }

    public static PostingState g(PostingState postingState) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        return PostingState.Editing.a(editing, null, null, null, null, null, null, null, null, null, null, false, PostingHints.a(editing.o, null, null, false, 767), false, null, null, null, null, null, 1040383);
    }

    public static PostingState h(PostingState postingState) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        return PostingState.Editing.a(editing, PostingContext.a(editing.c, null, false, null, null, null, 24575), null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, 1048573);
    }

    public static PostingState i(PostingState postingState) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        return PostingState.Editing.a(editing, null, null, null, null, null, null, null, null, null, null, false, PostingHints.a(editing.o, null, null, false, 991), false, null, null, null, null, null, 1040383);
    }

    public static PostingState j(PostingState postingState) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        return PostingState.Editing.a(editing, null, null, null, null, null, null, null, null, null, null, false, PostingHints.a(editing.o, null, null, false, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW), false, null, null, null, null, null, 1040383);
    }

    public static PostingState k(PostingState postingState, qic0 qic0Var) {
        PostingState.Editing editing;
        PostEditableData postEditableData;
        PhotoTagsData photoTagsData;
        Map<Integer, List<PhotoTag>> map;
        ArrayList arrayList;
        if (!(postingState instanceof PostingState.Editing) || (photoTagsData = (postEditableData = (editing = (PostingState.Editing) postingState).i).r) == null || (map = photoTagsData.b) == null) {
            return postingState;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        PhotoTag photoTag = qic0Var.b;
        int i = photoTag.g;
        List list = (List) linkedHashMap.get(Integer.valueOf(i));
        if (list != null) {
            arrayList = new ArrayList(list);
            arrayList.removeIf(new ygv(new xgv(photoTag, 29), 1));
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            linkedHashMap.remove(Integer.valueOf(i));
        } else {
            linkedHashMap.put(Integer.valueOf(i), arrayList);
        }
        List<PostingAttachment> list2 = postEditableData.p;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        for (PostingAttachment postingAttachment : list2) {
            if (postingAttachment instanceof PhotoDto) {
                PhotoDto photoDto = (PhotoDto) postingAttachment;
                Attachment attachment = photoDto.c;
                if (attachment instanceof LocalPhotoAttachment) {
                    Parcelable parcelable = photoDto.f.h;
                    PhotoAttachment photoAttachment = parcelable instanceof PhotoAttachment ? (PhotoAttachment) parcelable : null;
                    if (photoAttachment != null) {
                        x(photoAttachment.l, photoTag);
                    }
                } else if (attachment instanceof PhotoAttachment) {
                    x(((PhotoAttachment) attachment).l, photoTag);
                }
            }
            arrayList2.add(postingAttachment);
        }
        return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(editing.i, null, null, null, null, null, null, null, null, null, null, null, null, null, arrayList2, null, PhotoTagsData.a(postEditableData.r, linkedHashMap, null, 6), null, null, null, null, null, false, null, 268353535), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
    }

    public static PostingState l(PostingState postingState, ric0 ric0Var) {
        PostingState.Editing editing;
        PostEditableData postEditableData;
        PhotoTagsData photoTagsData;
        Map<Integer, List<PhotoTag>> map;
        if (!(postingState instanceof PostingState.Editing) || (photoTagsData = (postEditableData = (editing = (PostingState.Editing) postingState).i).r) == null || (map = photoTagsData.b) == null) {
            return postingState;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Iterator<T> it = ric0Var.b.iterator();
        while (it.hasNext()) {
            linkedHashMap.remove(Integer.valueOf(((Number) it.next()).intValue()));
        }
        return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(editing.i, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, PhotoTagsData.a(postEditableData.r, linkedHashMap, null, 6), null, null, null, null, null, false, null, 268369919), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
    }

    public static PostingState m(PostingState postingState) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        return PostingState.Editing.a(editing, null, null, null, null, null, null, null, null, null, null, false, PostingHints.a(editing.o, null, null, false, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT), false, null, null, null, null, null, 1040383);
    }

    public static PostingState n(PostingState postingState) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        return PostingState.Editing.a(editing, null, null, null, null, null, null, null, null, null, null, false, PostingHints.a(editing.o, null, null, false, 1019), false, null, null, null, null, null, 1040383);
    }

    public static PostingState o(PostingState postingState) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        return PostingState.Editing.a(editing, null, null, null, null, null, null, null, null, null, null, false, PostingHints.a(editing.o, null, null, false, 1015), false, null, null, null, null, null, 1040383);
    }

    public static PostingState p(PostingState postingState) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        return PostingState.Editing.a(editing, null, null, null, null, null, null, null, null, null, null, false, PostingHints.a(editing.o, null, null, false, 1007), false, null, null, null, null, null, 1040383);
    }

    public static PostingState q(PostingState postingState, ajc0 ajc0Var) {
        Map<Integer, List<PhotoTag>> map;
        List<PhotoTag> list = ajc0Var.c;
        Photo photo = ajc0Var.b;
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        PostEditableData postEditableData = editing.i;
        List<PostingAttachment> list2 = postEditableData.p;
        PhotoTagsData photoTagsData = postEditableData.r;
        List<PostingAttachment> list3 = list2;
        ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
        for (Parcelable parcelable : list3) {
            if (parcelable instanceof PhotoDto) {
                PhotoDto photoDto = (PhotoDto) parcelable;
                Attachment attachment = photoDto.c;
                if (!(attachment instanceof cvz)) {
                    PhotoAttachment photoAttachment = attachment instanceof PhotoAttachment ? (PhotoAttachment) attachment : null;
                    if (photoAttachment == null || photoAttachment.f != photo.c) {
                        UploadDto.UploadState uploadState = photoDto.f;
                        Parcelable parcelable2 = uploadState.h;
                        PhotoAttachment photoAttachment2 = parcelable2 instanceof PhotoAttachment ? (PhotoAttachment) parcelable2 : null;
                        parcelable = (photoAttachment2 == null || photoAttachment2.f != photo.c) ? photoDto : PhotoDto.a(photoDto, null, UploadDto.UploadState.a(uploadState, null, 0, 0, 0, new PhotoAttachment(photo), false, 191), 47);
                    } else {
                        parcelable = PhotoDto.a(photoDto, new PhotoAttachment(photo), null, 61);
                    }
                }
            }
            arrayList.add(parcelable);
        }
        LinkedHashMap linkedHashMap = (photoTagsData == null || (map = photoTagsData.b) == null) ? new LinkedHashMap() : new LinkedHashMap(map);
        if (list.isEmpty()) {
            linkedHashMap.remove(Integer.valueOf(photo.c));
        } else {
            linkedHashMap.put(Integer.valueOf(photo.c), list);
        }
        return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(editing.i, null, null, null, null, null, null, null, null, null, null, null, null, null, arrayList, null, photoTagsData != null ? PhotoTagsData.a(photoTagsData, linkedHashMap, null, 2) : new PhotoTagsData(linkedHashMap, null, true, 2, null), null, null, null, null, null, false, null, 268353535), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
    }

    public static PostingState r(PostingState postingState, NearbyPlaces nearbyPlaces) {
        if (postingState instanceof PostingState.Editing) {
            return PostingState.Editing.a((PostingState.Editing) postingState, null, null, nearbyPlaces, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, 1048567);
        }
        if (postingState instanceof PostingState.Loading) {
            return PostingState.Loading.a((PostingState.Loading) postingState, null, null, null, nearbyPlaces, null, null, false, null, null, null, null, null, 32751);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static PostingState s(PostingState postingState, iic0 iic0Var) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        PostEditableData postEditableData = editing.i;
        AdditionalSettingsConfiguration additionalSettingsConfiguration = postEditableData.q;
        return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(postEditableData, null, null, null, null, null, null, null, null, null, null, null, null, null, null, additionalSettingsConfiguration != null ? AdditionalSettingsConfiguration.a(additionalSettingsConfiguration, false, iic0Var.b, false, null, false, 29) : null, null, null, null, null, null, null, false, null, 268402687), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
    }

    public static PostingState u(PostingState postingState, vic0 vic0Var) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        PostEditableData postEditableData = editing.i;
        vic0Var.getClass();
        return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(postEditableData, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, RepostToStoryOnboarding.SUBTITLE, 134217727), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
    }

    public static PostingState v(PostingState postingState) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(editing.i, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, RepostToStoryOnboarding.NONE, 134217727), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
    }

    public static PostingState w(PostingState postingState) {
        PostingSettings a;
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        PostingContext postingContext = editing.c;
        PostingSettings postingSettings = editing.d;
        if (fkq0.b(postingContext.b.b)) {
            GroupWallPostingSettings groupWallPostingSettings = postingSettings.h;
            a = PostingSettings.a(postingSettings, null, null, groupWallPostingSettings != null ? GroupWallPostingSettings.a(groupWallPostingSettings, GroupPrivacyType.OPEN, false, 29) : null, null, 2097087);
        } else {
            UserWallPostingSettings userWallPostingSettings = postingSettings.g;
            a = PostingSettings.a(postingSettings, null, userWallPostingSettings != null ? new UserWallPostingSettings(false, userWallPostingSettings.c) : null, null, null, 2097119);
        }
        return PostingState.Editing.a(editing, null, a, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, 1048571);
    }

    public static void x(Photo photo, PhotoTag photoTag) {
        if (photo.c == photoTag.g) {
            List<Tag> list = photo.x;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Tag) obj).a != photoTag.b) {
                    arrayList.add(obj);
                }
            }
            photo.x = arrayList;
        }
    }

    public final PostingState t(PostingState postingState, jic0 jic0Var) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        this.a.b(jic0Var.b);
        PostingState.Editing editing = (PostingState.Editing) postingState;
        return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(editing.i, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, jic0Var.b, null, 201326591), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
    }
}
