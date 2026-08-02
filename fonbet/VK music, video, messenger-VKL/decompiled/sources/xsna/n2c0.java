package xsna;

import android.net.Uri;
import android.os.Parcelable;
import com.vk.api.generated.wall.dto.WallActionButtonGoalDto;
import com.vk.api.generated.wall.dto.WallActionButtonLevelDto;
import com.vk.api.generated.wall.dto.WallActionButtonTypeDto;
import com.vk.api.generated.wall.dto.WallAttachmentsActionButtonDto;
import com.vk.dto.common.Attachment;
import com.vk.dto.photo.Photo;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.VideoDto;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PostEditableDataExt.kt */
/* loaded from: classes4.dex */
public final class n2c0 {

    /* compiled from: PostEditableDataExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WallActionButtonTypeDto.values().length];
            try {
                iArr[WallActionButtonTypeDto.DONUT_LEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WallActionButtonTypeDto.DONUT_GOAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WallActionButtonTypeDto.VK_TICKET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ArrayList a(PostEditableData postEditableData) {
        List<PostingAttachment> list = postEditableData.p;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof PhotoDto) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PhotoDto photoDto = (PhotoDto) it.next();
            UploadDto.UploadState uploadState = photoDto.f;
            UploadDto.b7.getClass();
            Photo photo = null;
            if (epx.f(uploadState, UploadDto.a.b)) {
                Attachment attachment = photoDto.c;
                PhotoAttachment photoAttachment = attachment instanceof PhotoAttachment ? (PhotoAttachment) attachment : null;
                if (photoAttachment != null) {
                    photo = photoAttachment.l;
                }
            } else {
                Parcelable parcelable = photoDto.f.h;
                PhotoAttachment photoAttachment2 = parcelable instanceof PhotoAttachment ? (PhotoAttachment) parcelable : null;
                if (photoAttachment2 != null) {
                    photo = photoAttachment2.l;
                }
            }
            if (photo != null) {
                arrayList2.add(photo);
            }
        }
        return arrayList2;
    }

    public static final boolean b(PostEditableData postEditableData, w9c0 w9c0Var) {
        Uri uri;
        List<PostingAttachment> list = postEditableData.p;
        if (postEditableData.c.length() > 4000 || list.size() != 1) {
            return false;
        }
        Object a0 = j5g.a0(list);
        VideoDto videoDto = a0 instanceof VideoDto ? (VideoDto) a0 : null;
        if (videoDto == null) {
            return false;
        }
        String str = videoDto.f.c;
        if (str == null || (uri = Uri.parse(str)) == null) {
            uri = Uri.EMPTY;
        }
        return w9c0Var.a(uri);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (r4 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ActionButton c(PostEditableData postEditableData, PostingSettings postingSettings, boolean z) {
        Object obj;
        List<ActionButton> list = postingSettings.i;
        ActionButton actionButton = postEditableData.t;
        Object obj2 = null;
        if (actionButton == null) {
            actionButton = postingSettings.j;
            if (!z) {
                actionButton = null;
            }
        }
        WallAttachmentsActionButtonDto wallAttachmentsActionButtonDto = actionButton.b;
        int i = a.$EnumSwitchMapping$0[wallAttachmentsActionButtonDto.f().ordinal()];
        if (i == 1) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                WallActionButtonLevelDto e = ((ActionButton) next).b.e();
                Integer valueOf = e != null ? Integer.valueOf(e.d()) : null;
                WallActionButtonLevelDto e2 = wallAttachmentsActionButtonDto.e();
                if (epx.f(valueOf, e2 != null ? Integer.valueOf(e2.d()) : null)) {
                    obj2 = next;
                    break;
                }
            }
            return (ActionButton) obj2;
        }
        if (i == 2) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                WallActionButtonGoalDto d = ((ActionButton) next2).b.d();
                Integer valueOf2 = d != null ? Integer.valueOf(d.d()) : null;
                WallActionButtonGoalDto d2 = wallAttachmentsActionButtonDto.d();
                if (epx.f(valueOf2, d2 != null ? Integer.valueOf(d2.d()) : null)) {
                    obj2 = next2;
                    break;
                }
            }
            return (ActionButton) obj2;
        }
        if (i != 3) {
            Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next3 = it3.next();
                if (((ActionButton) next3).b.f() == wallAttachmentsActionButtonDto.f()) {
                    obj2 = next3;
                    break;
                }
            }
            return (ActionButton) obj2;
        }
        Iterator<T> it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj = null;
                break;
            }
            obj = it4.next();
            if (((ActionButton) obj).b.f() == wallAttachmentsActionButtonDto.f()) {
                break;
            }
        }
        ActionButton actionButton2 = (ActionButton) obj;
        if (actionButton2 != null) {
            return new ActionButton(actionButton2.b, actionButton.c);
        }
        return null;
    }

    public static final PrivacyPostType d(PostEditableData postEditableData, PostingSettings postingSettings) {
        Object obj;
        PrivacyPostType privacyPostType = postEditableData.i;
        if (!(privacyPostType instanceof PrivacyPostType.SingleDonutLevel)) {
            return privacyPostType;
        }
        Iterator<T> it = postingSettings.o.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            DonutLevel donutLevel = (DonutLevel) obj;
            DonutLevel donutLevel2 = ((PrivacyPostType.SingleDonutLevel) privacyPostType).b;
            if (donutLevel2 != null && donutLevel2.b == donutLevel.b) {
                break;
            }
        }
        DonutLevel donutLevel3 = (DonutLevel) obj;
        return donutLevel3 != null ? new PrivacyPostType.SingleDonutLevel(donutLevel3) : postingSettings.m ? PrivacyPostType.AllDonuts.b : PrivacyPostType.AllUsers.b;
    }
}
