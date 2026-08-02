package xsna;

import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.newsfeed.posting.impl.domain.model.LinksParsingMetaData;
import com.vk.newsfeed.posting.impl.domain.model.LocalAlbum;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.VkMediaEntry$VkPhoto;
import com.vk.newsfeed.posting.impl.domain.model.VkMediaEntry$VkVideo;
import com.vk.newsfeed.posting.impl.domain.model.a;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingArticleDto;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingLinkDto;
import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vk.newsfeed.posting.impl.domain.request.ParsedAttachment;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: MediaPickerReducerDelegate.kt */
/* loaded from: classes4.dex */
public final class ju10 {
    public final wj50<fmc0> a;
    public final ibc0 b;
    public final gu10 c;
    public final cy10 d;

    public ju10(wj50<fmc0> wj50Var, com.vk.newsfeed.posting.impl.domain.model.upload.a aVar, ibc0 ibc0Var) {
        this.a = wj50Var;
        this.b = ibc0Var;
        this.c = new gu10(wj50Var);
        this.d = new cy10(wj50Var, aVar, ibc0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v30, types: [com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem] */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v32, types: [com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem$LocalMedia] */
    /* JADX WARN: Type inference failed for: r4v33, types: [com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem$LocalMedia] */
    public final PostingState a(PostingState postingState, e.b bVar) {
        int i;
        ArrayList arrayList;
        Object obj;
        MediaPickerSelectedItem mediaPickerSelectedItem = null;
        if (bVar instanceof e.b.h) {
            e.b.h hVar = (e.b.h) bVar;
            cy10 cy10Var = this.d;
            cy10Var.getClass();
            if (hVar instanceof e.b.h.c) {
                e.b.h.c cVar = (e.b.h.c) hVar;
                return cy10.a(cy10Var, postingState, cVar.b, cVar.c, null, null, 24);
            }
            if (hVar instanceof e.b.h.C1425b) {
                e.b.h.C1425b c1425b = (e.b.h.C1425b) hVar;
                return cy10.a(cy10Var, postingState, c1425b.b, true, null, c1425b.c, 8);
            }
            if (hVar instanceof e.b.h.f) {
                e.b.h.f fVar = (e.b.h.f) hVar;
                return cy10.a(cy10Var, postingState, new MediaPickerSelectedItem.VkVideo(fVar.b), fVar.c, null, null, 24);
            }
            if (hVar instanceof e.b.h.C1426e) {
                e.b.h.C1426e c1426e = (e.b.h.C1426e) hVar;
                return cy10.a(cy10Var, postingState, new MediaPickerSelectedItem.VkPhoto(c1426e.b), c1426e.c, null, null, 24);
            }
            if (hVar instanceof e.b.h.a) {
                e.b.h.a aVar = (e.b.h.a) hVar;
                ParsedAttachment parsedAttachment = aVar.b;
                Attachment attachment = parsedAttachment.b;
                if (!(attachment instanceof SnippetAttachment) && !(attachment instanceof ArticleAttachment)) {
                    if (attachment instanceof VideoAttachment) {
                        mediaPickerSelectedItem = new MediaPickerSelectedItem.VkVideo(new VkMediaEntry$VkVideo(((VideoAttachment) attachment).k));
                    } else if (attachment instanceof PhotoAttachment) {
                        mediaPickerSelectedItem = new MediaPickerSelectedItem.VkPhoto(new VkMediaEntry$VkPhoto(((PhotoAttachment) attachment).l));
                    }
                    return mediaPickerSelectedItem != null ? cy10.a(cy10Var, postingState, mediaPickerSelectedItem, true, aVar.b, null, 16) : postingState;
                }
                if (!(postingState instanceof PostingState.Editing)) {
                    return postingState;
                }
                PostingState.Editing editing = (PostingState.Editing) postingState;
                PostEditableData postEditableData = editing.i;
                if (!postEditableData.p.isEmpty()) {
                    return postingState;
                }
                PostingLinkDto postingLinkDto = postEditableData.h;
                LinksParsingMetaData linksParsingMetaData = postEditableData.w;
                if (postingLinkDto != null || postEditableData.g != null) {
                    return postingState;
                }
                Attachment attachment2 = parsedAttachment.b;
                String str = parsedAttachment.c;
                if (attachment2 instanceof ArticleAttachment) {
                    ArrayList arrayList2 = new ArrayList(linksParsingMetaData.c);
                    arrayList2.add(parsedAttachment);
                    return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(editing.i, null, null, null, null, new PostingArticleDto((ArticleAttachment) attachment2, str), null, null, null, null, null, null, null, null, null, null, null, null, null, LinksParsingMetaData.a(postEditableData.w, null, arrayList2, null, null, 13), null, null, false, null, 266338271), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
                }
                if (!(attachment2 instanceof SnippetAttachment)) {
                    return postingState;
                }
                ArrayList arrayList3 = new ArrayList(linksParsingMetaData.c);
                arrayList3.add(parsedAttachment);
                return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(editing.i, null, null, null, null, null, new PostingLinkDto((SnippetAttachment) attachment2, str), null, null, null, null, null, null, null, null, null, null, null, null, LinksParsingMetaData.a(postEditableData.w, null, arrayList3, null, null, 13), null, null, false, null, 266338239), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
            }
            if (!(hVar instanceof e.b.h.d)) {
                throw new NoWhenBranchMatchedException();
            }
            Attachment attachment3 = ((e.b.h.d) hVar).b;
            boolean z = attachment3 instanceof ArticleAttachment;
            int i2 = 1;
            if (!z && !(attachment3 instanceof SnippetAttachment)) {
                if (!(attachment3 instanceof AlbumAttachment)) {
                    return postingState;
                }
                AlbumAttachment albumAttachment = (AlbumAttachment) attachment3;
                if (!(postingState instanceof PostingState.Editing)) {
                    return postingState;
                }
                PostingState.Editing editing2 = (PostingState.Editing) postingState;
                PostEditableData postEditableData2 = editing2.i;
                ArrayList arrayList4 = new ArrayList(postEditableData2.p);
                g5g.D(arrayList4, true, new l2i(albumAttachment, 29));
                s3q0 s3q0Var = s3q0.a;
                return PostingState.Editing.a(editing2, null, null, null, null, null, PostEditableData.a(postEditableData2, null, null, null, null, null, null, null, null, null, null, null, null, null, arrayList4, null, null, null, null, null, null, null, false, null, 268419071), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
            }
            if (!(postingState instanceof PostingState.Editing)) {
                return postingState;
            }
            int i3 = 28;
            if (z) {
                PostingState.Editing editing3 = (PostingState.Editing) postingState;
                PostEditableData postEditableData3 = editing3.i;
                ArrayList arrayList5 = new ArrayList(postEditableData3.w.c);
                arrayList5.removeIf(new lqk(new wpg(attachment3, 28), i2));
                return PostingState.Editing.a(editing3, null, null, null, null, null, PostEditableData.a(postEditableData3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LinksParsingMetaData.a(postEditableData3.w, null, arrayList5, null, null, 13), null, null, false, null, 266338271), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
            }
            if (!(attachment3 instanceof SnippetAttachment)) {
                return postingState;
            }
            PostingState.Editing editing4 = (PostingState.Editing) postingState;
            PostEditableData postEditableData4 = editing4.i;
            ArrayList arrayList6 = new ArrayList(postEditableData4.w.c);
            arrayList6.removeIf(new ww6(new igh(attachment3, i3), i2));
            return PostingState.Editing.a(editing4, null, null, null, null, null, PostEditableData.a(postEditableData4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LinksParsingMetaData.a(postEditableData4.w, null, arrayList6, null, null, 13), null, null, false, null, 266338239), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
        }
        boolean z2 = bVar instanceof e.b.C1424e;
        gu10 gu10Var = this.c;
        if (z2) {
            gu10Var.getClass();
            ArrayList arrayList7 = ((e.b.C1424e) bVar).b;
            if (postingState instanceof PostingState.Editing) {
                PostingState.Editing editing5 = (PostingState.Editing) postingState;
                MediaPickerState mediaPickerState = editing5.f;
                return PostingState.Editing.a(editing5, null, null, null, MediaPickerState.a(mediaPickerState, a.b.a, null, 0, null, gu10.a(arrayList7, mediaPickerState.f), null, null, null, null, 494), null, null, null, null, null, null, false, null, false, null, null, null, null, null, 1048559);
            }
            if (!(postingState instanceof PostingState.Loading)) {
                throw new NoWhenBranchMatchedException();
            }
            PostingState.Loading loading = (PostingState.Loading) postingState;
            MediaPickerState mediaPickerState2 = loading.d;
            return PostingState.Loading.a(loading, null, MediaPickerState.a(mediaPickerState2, a.b.a, null, 0, null, gu10.a(arrayList7, mediaPickerState2.f), null, null, null, null, 494), null, null, null, null, false, null, null, null, null, null, 32763);
        }
        if (bVar instanceof e.b.c) {
            e.b.c cVar2 = (e.b.c) bVar;
            if (!(postingState instanceof PostingState.Editing)) {
                gu10Var.getClass();
                return postingState;
            }
            PostingState.Editing a = gu10Var.a.a((PostingState.Editing) postingState);
            MediaPickerState mediaPickerState3 = a.f;
            List<LocalAlbum> list = mediaPickerState3.c;
            if (list != null) {
                List<LocalAlbum> list2 = list;
                ArrayList arrayList8 = new ArrayList(c5g.u(list2, 10));
                for (LocalAlbum localAlbum : list2) {
                    int i4 = localAlbum.b;
                    if (i4 == mediaPickerState3.d) {
                        localAlbum = new LocalAlbum(i4, cVar2.c, localAlbum.d);
                    }
                    arrayList8.add(localAlbum);
                }
                arrayList = arrayList8;
            } else {
                arrayList = null;
            }
            List<MediaPickerSelectedItem> list3 = mediaPickerState3.e;
            ArrayList arrayList9 = new ArrayList(c5g.u(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                ?? r4 = (MediaPickerSelectedItem) it.next();
                if (r4 instanceof MediaPickerSelectedItem.LocalMedia) {
                    r4 = (MediaPickerSelectedItem.LocalMedia) r4;
                    LocalMediaEntry localMediaEntry = r4.b;
                    if (localMediaEntry instanceof LocalMediaEntry.Image) {
                        Iterator it2 = cVar2.b.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            if (((LocalMediaEntry) obj).ba().getId() == ((LocalMediaEntry.Image) localMediaEntry).b.j) {
                                break;
                            }
                        }
                        LocalMediaEntry localMediaEntry2 = (LocalMediaEntry) obj;
                        if (localMediaEntry2 != null) {
                            r4 = new MediaPickerSelectedItem.LocalMedia(localMediaEntry2);
                        }
                    }
                }
                arrayList9.add(r4);
            }
            return PostingState.Editing.a(a, null, null, null, MediaPickerState.a(mediaPickerState3, a.b.a, arrayList, 0, arrayList9, cVar2.b, null, null, null, null, 484), null, null, null, null, null, null, false, null, false, null, null, null, null, null, 1048559);
        }
        if (bVar instanceof e.b.f) {
            gu10Var.getClass();
            if (postingState instanceof PostingState.Editing) {
                PostingState.Editing editing6 = (PostingState.Editing) postingState;
                return PostingState.Editing.a(editing6, null, null, null, MediaPickerState.a(editing6.f, a.C1419a.a, null, 0, null, null, null, null, null, null, 510), null, null, null, null, null, null, false, null, false, null, null, null, null, null, 1048559);
            }
            if (!(postingState instanceof PostingState.Loading)) {
                throw new NoWhenBranchMatchedException();
            }
            PostingState.Loading loading2 = (PostingState.Loading) postingState;
            return PostingState.Loading.a(loading2, null, MediaPickerState.a(loading2.d, a.C1419a.a, null, 0, null, null, null, null, null, null, 510), null, null, null, null, false, null, null, null, null, null, 32763);
        }
        if (bVar instanceof e.b.d) {
            e.b.d dVar = (e.b.d) bVar;
            gu10Var.getClass();
            if (!(postingState instanceof PostingState.Editing)) {
                return postingState;
            }
            PostingState.Editing editing7 = (PostingState.Editing) postingState;
            return PostingState.Editing.a(editing7, null, null, null, MediaPickerState.a(editing7.f, new a.c(dVar.e), null, 0, null, null, null, null, null, null, 510), null, null, null, null, null, null, false, null, false, null, null, null, null, null, 1048559);
        }
        if (bVar instanceof e.b.a) {
            e.b.a aVar2 = (e.b.a) bVar;
            if (!(postingState instanceof PostingState.Editing)) {
                return postingState;
            }
            PostingState.Editing editing8 = (PostingState.Editing) postingState;
            MediaPickerState mediaPickerState4 = editing8.f;
            int i5 = mediaPickerState4.d;
            a.b bVar2 = a.b.a;
            int i6 = aVar2.b;
            return PostingState.Editing.a(editing8, null, null, null, MediaPickerState.a(mediaPickerState4, bVar2, null, i6, null, i5 == i6 ? mediaPickerState4.f : EmptyList.b, null, null, null, null, 490), null, null, null, null, null, null, false, null, false, null, null, null, null, null, 1048559);
        }
        if (!(bVar instanceof e.b.C1423b)) {
            if (bVar instanceof e.b.i) {
                e.b.i iVar = (e.b.i) bVar;
                if (!(postingState instanceof PostingState.Editing)) {
                    return postingState;
                }
                PostingState.Editing editing9 = (PostingState.Editing) postingState;
                return PostingState.Editing.a(editing9, null, null, null, MediaPickerState.a(editing9.f, null, null, 0, null, null, null, iVar.b, null, null, 447), null, null, null, null, null, null, false, null, false, null, null, null, null, null, 1048559);
            }
            if (bVar instanceof e.b.j) {
                e.b.j jVar = (e.b.j) bVar;
                if (!(postingState instanceof PostingState.Editing)) {
                    return postingState;
                }
                PostingState.Editing editing10 = (PostingState.Editing) postingState;
                return PostingState.Editing.a(editing10, null, null, null, MediaPickerState.a(editing10.f, null, null, 0, null, null, jVar.b, null, null, null, 479), null, null, null, null, null, null, false, null, false, null, null, null, null, null, 1048559);
            }
            if (!(bVar instanceof e.b.g)) {
                throw new NoWhenBranchMatchedException();
            }
            e.b.g gVar = (e.b.g) bVar;
            if (!(postingState instanceof PostingState.Editing)) {
                return postingState;
            }
            PostingState.Editing editing11 = (PostingState.Editing) postingState;
            MediaPickerState mediaPickerState5 = editing11.f;
            MediaPickerState.SheetState sheetState = mediaPickerState5.g;
            MediaPickerState.SheetState sheetState2 = gVar.b;
            return sheetState == sheetState2 ? PostingState.Editing.a(editing11, null, null, null, MediaPickerState.a(mediaPickerState5, null, null, 0, null, null, null, sheetState2, null, null, 415), null, null, null, null, null, null, false, null, false, null, null, null, null, null, 1048559) : PostingState.Editing.a(editing11, null, null, null, MediaPickerState.a(mediaPickerState5, null, null, 0, null, null, null, sheetState2, null, null, 447), null, null, null, null, null, null, false, null, false, null, null, null, null, null, 1048559);
        }
        e.b.C1423b c1423b = (e.b.C1423b) bVar;
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing12 = (PostingState.Editing) postingState;
        MediaPickerState mediaPickerState6 = editing12.f;
        int i7 = mediaPickerState6.d;
        List<LocalAlbum> list4 = c1423b.b;
        ArrayList arrayList10 = new ArrayList();
        int i8 = 0;
        for (Object obj2 : list4) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                e43.t();
                throw null;
            }
            if (((LocalAlbum) obj2).c > 0 || i8 == 0) {
                arrayList10.add(obj2);
            }
            i8 = i9;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList11 = new ArrayList();
        Iterator it3 = arrayList10.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (hashSet.add(Integer.valueOf(((LocalAlbum) next).b))) {
                arrayList11.add(next);
            }
        }
        if (!arrayList11.isEmpty()) {
            Iterator it4 = arrayList11.iterator();
            while (it4.hasNext()) {
                if (((LocalAlbum) it4.next()).b == i7) {
                    break;
                }
            }
        }
        LocalAlbum localAlbum2 = (LocalAlbum) j5g.a0(arrayList11);
        if (localAlbum2 == null) {
            i = 0;
            return PostingState.Editing.a(editing12, null, null, null, MediaPickerState.a(mediaPickerState6, null, arrayList11, i, null, null, null, null, null, null, 505), null, null, null, null, null, null, false, null, false, null, null, null, null, null, 1048559);
        }
        i7 = localAlbum2.b;
        i = i7;
        return PostingState.Editing.a(editing12, null, null, null, MediaPickerState.a(mediaPickerState6, null, arrayList11, i, null, null, null, null, null, null, 505), null, null, null, null, null, null, false, null, false, null, null, null, null, null, 1048559);
    }
}
