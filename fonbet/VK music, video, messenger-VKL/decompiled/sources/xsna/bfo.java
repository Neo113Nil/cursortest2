package xsna;

import android.os.Bundle;
import com.vk.common.links.LinksParserData;
import com.vk.core.serialize.Serializer;
import com.vk.draftslist.impl.ui.entity.DraftsListState;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.entries.DigestItem;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.user.ObsceneTextFilter;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.afo;

/* compiled from: DraftsListViewStateMapper.kt */
/* loaded from: classes18.dex */
public final class bfo implements izs<DraftsListState, afo> {
    public final bpn0 b = new bpn0(new d1(14));

    @Override // xsna.izs
    public final afo invoke(DraftsListState draftsListState) {
        boolean z;
        boolean z2;
        boolean z3;
        CharSequence charSequence;
        Image Ib;
        ImageSize Cb;
        String str;
        int i;
        VideoFile videoFile;
        DraftsListState draftsListState2 = draftsListState;
        List<Post> list = draftsListState2.c;
        DraftsListState.LoadingState loadingState = draftsListState2.d;
        if (loadingState == DraftsListState.LoadingState.LOADING_INITIAL) {
            return afo.d.b;
        }
        if (loadingState == DraftsListState.LoadingState.ERROR_INITIAL_LOAD) {
            return afo.c.b;
        }
        if (list.isEmpty()) {
            return afo.b.b;
        }
        List<Post> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (true) {
            boolean z4 = true;
            boolean z5 = false;
            r6 = 0;
            int i2 = 0;
            if (!it.hasNext()) {
                if (loadingState == DraftsListState.LoadingState.LOADING_REFRESH) {
                    z = true;
                } else {
                    z = true;
                    z4 = false;
                }
                if (loadingState == DraftsListState.LoadingState.LOADING_PAGINATION) {
                    z2 = false;
                    z5 = z;
                } else {
                    z2 = false;
                }
                if (loadingState == DraftsListState.LoadingState.ERROR_PAGINATION) {
                    z3 = z2;
                    z2 = z;
                } else {
                    z3 = z2;
                }
                if (loadingState == DraftsListState.LoadingState.ERROR_REFRESH) {
                    z3 = z;
                }
                return new afo.a(arrayList, z4, z5, z2, z3, draftsListState2.g);
            }
            Post post = (Post) it.next();
            int i3 = post.n;
            ArrayList<EntryAttachment> arrayList2 = post.z;
            if (((Boolean) this.b.getValue()).booleanValue()) {
                Serializer.c<DigestItem> cVar = DigestItem.CREATOR;
                String str2 = post.s;
                Bundle bundle = post.K;
                float f = post.N.d;
                cn70.b(6);
                LinksParserData linksParserData = new LinksParserData(43787, bundle, 0, 0, (String) null, (String) null, 0, 0, LinksParserData.HashtagService.Posts, (saz) null, 0, (taz) null, o25.a().i().U == ObsceneTextFilter.ENABLED, 1788);
                vdz vdzVar = new vdz(0);
                ucp ucpVar = ucp.a;
                charSequence = ucp.i(xwk.d().a().o(str2, linksParserData, vdzVar));
                post.l.Ab(68719476736L, vdzVar.a);
            } else {
                ej90 ej90Var = post.P;
                if (ej90Var == null || (charSequence = ej90Var.a) == null) {
                    charSequence = post.s;
                }
            }
            String i4 = pvo0.i(true, post.r, false, false);
            EntryAttachment entryAttachment = (EntryAttachment) j5g.a0(arrayList2);
            Integer num = null;
            Attachment attachment = entryAttachment != null ? entryAttachment.b : null;
            if (attachment instanceof PhotoAttachment) {
                ImageSize imageSize = ((PhotoAttachment) attachment).l.J;
                if (imageSize != null) {
                    str = imageSize.X7(ImageSizeKey.SIZE_P_0200.getWidth());
                }
                str = null;
            } else {
                if ((attachment instanceof VideoAttachment) && (Ib = ((VideoAttachment) attachment).Ib()) != null && (Cb = Ib.Cb(ImageSizeKey.SIZE_P_0200.getWidth(), true, false)) != null) {
                    str = Cb.d.d;
                }
                str = null;
            }
            if (arrayList2.isEmpty()) {
                i = 0;
            } else {
                Iterator<T> it2 = arrayList2.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if ((((EntryAttachment) it2.next()).b instanceof PhotoAttachment) && (i = i + 1) < 0) {
                        e43.s();
                        throw null;
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                Iterator<T> it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    if ((((EntryAttachment) it3.next()).b instanceof VideoAttachment) && (i2 = i2 + 1) < 0) {
                        e43.s();
                        throw null;
                    }
                }
            }
            int i5 = i2;
            EntryAttachment entryAttachment2 = (EntryAttachment) j5g.a0(arrayList2);
            Attachment attachment2 = entryAttachment2 != null ? entryAttachment2.b : null;
            VideoAttachment videoAttachment = attachment2 instanceof VideoAttachment ? (VideoAttachment) attachment2 : null;
            if (videoAttachment != null && (videoFile = videoAttachment.k) != null) {
                num = Integer.valueOf(videoFile.getDuration());
            }
            arrayList.add(new qdo(i3, charSequence, i4, str, i, i5, num));
        }
    }
}
