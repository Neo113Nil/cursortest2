package xsna;

import android.net.Uri;
import android.os.Parcelable;
import com.vk.dto.common.Attachment;
import com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink;
import com.vk.newsfeed.posting.crop_editor.domain.model.LocalImageLink;
import com.vk.newsfeed.posting.crop_editor.domain.model.RemoteImageLink;
import com.vk.newsfeed.posting.impl.domain.model.EmptyCropArea;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.PhotoVideoAttachmentsCropData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostingPreviewRatio;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.attachment.LocalPhotoAttachment;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.hic0;

/* compiled from: PhotoCropFeatureDelegate.kt */
/* loaded from: classes4.dex */
public final class w5a0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static PostingState a(PostingState postingState, hic0 hic0Var) {
        ArrayList<ImageCropArea> arrayList;
        ImageCropArea imageCropArea;
        Object obj;
        Object obj2;
        Integer g;
        if (hic0Var instanceof hic0.g) {
            hic0.g gVar = (hic0.g) hic0Var;
            if (postingState instanceof PostingState.Editing) {
                PostingState.Editing editing = (PostingState.Editing) postingState;
                return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(editing.i, null, null, null, null, null, null, null, gVar.b, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 268435199), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
            }
        } else {
            EmptyCropArea emptyCropArea = null;
            if (hic0Var instanceof hic0.e) {
                hic0.e eVar = (hic0.e) hic0Var;
                if (postingState instanceof PostingState.Editing) {
                    PostingState.Editing editing2 = (PostingState.Editing) postingState;
                    PostEditableData postEditableData = editing2.i;
                    List<PostingAttachment> list = postEditableData.p;
                    ImageCropArea imageCropArea2 = eVar.b;
                    Attachment attachment = eVar.d;
                    if (agc0.e(imageCropArea2.b)) {
                        if (attachment != null) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it.next();
                                if (epx.f(((PostingAttachment) obj2).nb(), attachment)) {
                                    break;
                                }
                            }
                            PhotoDto photoDto = obj2 instanceof PhotoDto ? (PhotoDto) obj2 : null;
                            if (photoDto != null) {
                                UploadDto.UploadState uploadState = photoDto.f;
                                if (epx.f(uploadState.b, UploadDto.UploadStep.Uploaded.b)) {
                                    Parcelable parcelable = uploadState.h;
                                    PhotoAttachment photoAttachment = parcelable instanceof PhotoAttachment ? (PhotoAttachment) parcelable : null;
                                    if (photoAttachment != null) {
                                        imageCropArea2 = ImageCropArea.a(imageCropArea2, photoAttachment.Hb(), 0, 0, 0, 0, null, 254);
                                    }
                                }
                            }
                        }
                        ImageCropArea imageCropArea3 = imageCropArea2;
                        Uri uri = imageCropArea3.c;
                        if (agc0.e(imageCropArea3.b) && uri == null) {
                            Iterator<T> it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it2.next();
                                Attachment nb = ((PostingAttachment) obj).nb();
                                if ((nb instanceof LocalPhotoAttachment) && epx.f(((LocalPhotoAttachment) nb).getUri(), uri)) {
                                    break;
                                }
                            }
                            PhotoDto photoDto2 = obj instanceof PhotoDto ? (PhotoDto) obj : null;
                            if (photoDto2 != null) {
                                UploadDto.UploadState uploadState2 = photoDto2.f;
                                if (epx.f(uploadState2.b, UploadDto.UploadStep.Uploaded.b)) {
                                    Parcelable parcelable2 = uploadState2.h;
                                    PhotoAttachment photoAttachment2 = parcelable2 instanceof PhotoAttachment ? (PhotoAttachment) parcelable2 : null;
                                    if (photoAttachment2 != null) {
                                        imageCropArea2 = ImageCropArea.a(imageCropArea3, photoAttachment2.Hb(), 0, 0, 0, 0, null, 254);
                                    }
                                }
                            }
                        }
                        imageCropArea = imageCropArea3;
                        List<ImageCropArea> list2 = postEditableData.j.b;
                        ArrayList arrayList2 = list2 == null ? new ArrayList(list2) : new ArrayList();
                        g = i7o0.g(arrayList2, new cww(imageCropArea, 27));
                        if (g != null) {
                            arrayList2.add(imageCropArea);
                        } else if (eVar.c) {
                            int intValue = g.intValue();
                            if (agc0.e(imageCropArea.b)) {
                                imageCropArea = ImageCropArea.a(imageCropArea, ((ImageCropArea) arrayList2.get(g.intValue())).b, 0, 0, 0, 0, null, 254);
                            }
                            arrayList2.set(intValue, imageCropArea);
                        }
                        return PostingState.Editing.a(editing2, null, null, null, null, null, PostEditableData.a(postEditableData, null, null, null, null, null, null, null, PhotoVideoAttachmentsCropData.a(postEditableData.j, arrayList2, null, null, null, 14), null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 268435199), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
                    }
                    imageCropArea = imageCropArea2;
                    List<ImageCropArea> list22 = postEditableData.j.b;
                    if (list22 == null) {
                    }
                    g = i7o0.g(arrayList2, new cww(imageCropArea, 27));
                    if (g != null) {
                    }
                    return PostingState.Editing.a(editing2, null, null, null, null, null, PostEditableData.a(postEditableData, null, null, null, null, null, null, null, PhotoVideoAttachmentsCropData.a(postEditableData.j, arrayList2, null, null, null, 14), null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 268435199), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
                }
            } else if (hic0Var instanceof hic0.a) {
                hic0.a aVar = (hic0.a) hic0Var;
                if (postingState instanceof PostingState.Editing) {
                    PostingState.Editing editing3 = (PostingState.Editing) postingState;
                    PostEditableData postEditableData2 = editing3.i;
                    List<ImageCropArea> list3 = postEditableData2.j.b;
                    ArrayList arrayList3 = list3 != null ? new ArrayList(list3) : new ArrayList();
                    List<EmptyCropArea> list4 = postEditableData2.j.c;
                    ArrayList arrayList4 = list4 != null ? new ArrayList(list4) : new ArrayList();
                    arrayList3.removeIf(new jdg(new uh40(aVar, 6), 2));
                    arrayList4.removeIf(new lqk(new q130(aVar, 13), 2));
                    return PostingState.Editing.a(editing3, null, null, null, null, null, PostEditableData.a(postEditableData2, null, null, null, null, null, null, null, PhotoVideoAttachmentsCropData.a(postEditableData2.j, arrayList3, arrayList4, null, null, 12), null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 268435199), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
                }
            } else if (hic0Var instanceof hic0.c) {
                hic0.c cVar = (hic0.c) hic0Var;
                ImageLink imageLink = cVar.b;
                if (postingState instanceof PostingState.Editing) {
                    PostingState.Editing editing4 = (PostingState.Editing) postingState;
                    PostEditableData postEditableData3 = editing4.i;
                    PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData = postEditableData3.j;
                    PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData2 = postEditableData3.j;
                    List<ImageCropArea> list5 = photoVideoAttachmentsCropData.b;
                    ArrayList arrayList5 = list5 != null ? new ArrayList(list5) : new ArrayList();
                    arrayList5.removeIf(new a53(new wq20(cVar, 15), 2));
                    List<EmptyCropArea> list6 = photoVideoAttachmentsCropData2.c;
                    ArrayList<EmptyCropArea> arrayList6 = list6 != null ? new ArrayList(list6) : new ArrayList();
                    PostingPreviewRatio postingPreviewRatio = photoVideoAttachmentsCropData2.e;
                    boolean z = imageLink instanceof LocalImageLink;
                    if (z) {
                        emptyCropArea = new EmptyCropArea("", ((LocalImageLink) imageLink).b, postingPreviewRatio);
                    } else if (imageLink instanceof RemoteImageLink) {
                        RemoteImageLink remoteImageLink = (RemoteImageLink) imageLink;
                        emptyCropArea = new EmptyCropArea(remoteImageLink.b, remoteImageLink.d, postingPreviewRatio);
                    }
                    if (emptyCropArea != null) {
                        if (!arrayList6.isEmpty()) {
                            for (EmptyCropArea emptyCropArea2 : arrayList6) {
                                if (z) {
                                    Uri uri2 = ((LocalImageLink) imageLink).b;
                                    Uri uri3 = emptyCropArea2.c;
                                    if (uri3 != null && uri3.equals(uri2)) {
                                        break;
                                    }
                                } else if (imageLink instanceof RemoteImageLink) {
                                    String str = ((RemoteImageLink) imageLink).b;
                                    String str2 = emptyCropArea2.b;
                                    if (!agc0.e(str2) && str2.equals(str)) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        arrayList6.add(emptyCropArea);
                    }
                    return PostingState.Editing.a(editing4, null, null, null, null, null, PostEditableData.a(postEditableData3, null, null, null, null, null, null, null, PhotoVideoAttachmentsCropData.a(postEditableData3.j, arrayList5, arrayList6, null, null, 12), null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 268435199), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
                }
            } else if (hic0Var instanceof hic0.d) {
                hic0.d dVar = (hic0.d) hic0Var;
                if (postingState instanceof PostingState.Editing) {
                    PostingState.Editing editing5 = (PostingState.Editing) postingState;
                    PostEditableData postEditableData4 = editing5.i;
                    return PostingState.Editing.a(editing5, null, null, null, null, null, PostEditableData.a(postEditableData4, null, null, null, null, null, null, null, PhotoVideoAttachmentsCropData.a(postEditableData4.j, null, null, dVar.c, dVar.b, 3), null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 268435199), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
                }
            } else if (hic0Var instanceof hic0.f) {
                List<ImageCropArea> list7 = ((hic0.f) hic0Var).b;
                if (postingState instanceof PostingState.Editing) {
                    PostingState.Editing editing6 = (PostingState.Editing) postingState;
                    PostEditableData postEditableData5 = editing6.i;
                    List<ImageCropArea> list8 = postEditableData5.j.b;
                    if (list8 != null) {
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj3 : list8) {
                            ImageCropArea imageCropArea4 = (ImageCropArea) obj3;
                            List<ImageCropArea> list9 = list7;
                            if (!(list9 instanceof Collection) || !list9.isEmpty()) {
                                for (ImageCropArea imageCropArea5 : list9) {
                                    if (!agc0.c(imageCropArea5, imageCropArea4) || !w65.l(imageCropArea5, imageCropArea4)) {
                                    }
                                }
                            }
                            arrayList7.add(obj3);
                        }
                        arrayList = new ArrayList(arrayList7);
                    } else {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(list7);
                    List<ImageCropArea> list10 = postEditableData5.j.b;
                    Object[] objArr = list10 == null || list10.isEmpty();
                    ArrayList arrayList8 = new ArrayList(c5g.u(arrayList, 10));
                    for (ImageCropArea imageCropArea6 : arrayList) {
                        arrayList8.add(ImageCropArea.a(imageCropArea6, null, 0, 0, 0, 0, new azw(objArr == true || imageCropArea6.i.a), 127));
                    }
                    return PostingState.Editing.a(editing6, null, null, null, null, null, PostEditableData.a(postEditableData5, null, null, null, null, null, null, null, PhotoVideoAttachmentsCropData.a(postEditableData5.j, arrayList8, null, null, null, 14), null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 268435199), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
                }
            } else {
                if (!(hic0Var instanceof hic0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                hic0.b bVar = (hic0.b) hic0Var;
                if (postingState instanceof PostingState.Editing) {
                    PostingState.Editing editing7 = (PostingState.Editing) postingState;
                    PostEditableData postEditableData6 = editing7.i;
                    List<ImageCropArea> list11 = postEditableData6.j.b;
                    ArrayList arrayList9 = list11 != null ? new ArrayList(list11) : new ArrayList();
                    arrayList9.removeIf(new ww6(new uv20(bVar, 17), 2));
                    return PostingState.Editing.a(editing7, null, null, null, null, null, PostEditableData.a(postEditableData6, null, null, null, null, null, null, null, PhotoVideoAttachmentsCropData.a(postEditableData6.j, arrayList9, null, null, null, 14), null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 268435199), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
                }
            }
        }
        return postingState;
    }
}
