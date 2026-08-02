package xsna;

import com.vk.dto.common.AttachmentType;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.music.MusicAttachDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.fic0;

/* compiled from: AttachmentReducerDelegate.kt */
/* loaded from: classes4.dex */
public final class t74 {
    public static PostingState a(PostingState postingState, fic0 fic0Var) {
        if (fic0Var instanceof fic0.g) {
            fic0.g gVar = (fic0.g) fic0Var;
            if (postingState instanceof PostingState.Editing) {
                PostingState.Editing editing = (PostingState.Editing) postingState;
                return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(editing.i, null, null, null, null, null, null, null, null, null, new MusicAttachDto.MusicPlaylistDto(gVar.b), null, null, null, null, null, null, null, null, null, null, null, false, null, 268434431), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
            }
        } else if (fic0Var instanceof fic0.i) {
            fic0.i iVar = (fic0.i) fic0Var;
            if (postingState instanceof PostingState.Editing) {
                PostingState.Editing editing2 = (PostingState.Editing) postingState;
                return PostingState.Editing.a(editing2, null, null, null, null, null, PostEditableData.a(editing2.i, null, null, null, null, null, null, null, null, null, new MusicAttachDto.MusicTracksDto(iVar.b), null, null, null, null, null, null, null, null, null, null, null, false, null, 268434431), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
            }
        } else if (fic0Var instanceof fic0.h) {
            fic0.h hVar = (fic0.h) fic0Var;
            if (postingState instanceof PostingState.Editing) {
                PostingState.Editing editing3 = (PostingState.Editing) postingState;
                return PostingState.Editing.a(editing3, null, null, null, null, null, PostEditableData.a(editing3.i, null, null, null, null, null, null, null, null, null, new MusicAttachDto.MusicSnippetDto(hVar.b), null, null, null, null, null, null, null, null, null, null, null, false, null, 268434431), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
            }
        } else if (fic0Var instanceof fic0.c) {
            if (postingState instanceof PostingState.Editing) {
                PostingState.Editing editing4 = (PostingState.Editing) postingState;
                return PostingState.Editing.a(editing4, null, null, null, null, null, PostEditableData.a(editing4.i, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 268434431), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
            }
        } else if (fic0Var instanceof fic0.f) {
            fic0.f fVar = (fic0.f) fic0Var;
            if (postingState instanceof PostingState.Editing) {
                PostingState.Editing editing5 = (PostingState.Editing) postingState;
                return PostingState.Editing.a(editing5, null, null, null, null, null, PostEditableData.a(editing5.i, null, null, null, null, null, null, null, null, null, null, fVar.b, null, null, null, null, null, null, null, null, null, null, false, null, 268433407), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
            }
        } else if (fic0Var instanceof fic0.b) {
            if (postingState instanceof PostingState.Editing) {
                PostingState.Editing editing6 = (PostingState.Editing) postingState;
                return PostingState.Editing.a(editing6, null, null, null, null, null, PostEditableData.a(editing6.i, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 268433407), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
            }
        } else if (fic0Var instanceof fic0.j) {
            fic0.j jVar = (fic0.j) fic0Var;
            if (postingState instanceof PostingState.Editing) {
                PostingState.Editing editing7 = (PostingState.Editing) postingState;
                return PostingState.Editing.a(editing7, null, null, null, null, null, PostEditableData.a(editing7.i, null, null, jVar.b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 268435447), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
            }
        } else if (fic0Var instanceof fic0.e) {
            if (postingState instanceof PostingState.Editing) {
                PostingState.Editing editing8 = (PostingState.Editing) postingState;
                return PostingState.Editing.a(editing8, null, null, null, null, null, PostEditableData.a(editing8.i, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 268435447), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
            }
        } else if (fic0Var instanceof fic0.a) {
            fic0.a aVar = (fic0.a) fic0Var;
            if (postingState instanceof PostingState.Editing) {
                PostingState.Editing editing9 = (PostingState.Editing) postingState;
                return PostingState.Editing.a(editing9, null, null, null, null, null, PostEditableData.a(editing9.i, null, null, null, aVar.b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 268435439), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
            }
        } else {
            if (!(fic0Var instanceof fic0.d)) {
                throw new NoWhenBranchMatchedException();
            }
            if (postingState instanceof PostingState.Editing) {
                PostingState.Editing editing10 = (PostingState.Editing) postingState;
                return PostingState.Editing.a(editing10, null, null, null, null, null, PostEditableData.a(editing10.i, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 268435439), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
            }
        }
        return postingState;
    }

    public static PostingState b(PostingState postingState, lic0 lic0Var) {
        int i = lic0Var.c;
        int i2 = lic0Var.b;
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        List<PostingAttachment> list = editing.i.p;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                e43.t();
                throw null;
            }
            PostingAttachment postingAttachment = (PostingAttachment) obj;
            Pair pair = (postingAttachment.getType() == AttachmentType.PHOTO || postingAttachment.getType() == AttachmentType.VIDEO) ? new Pair(Integer.valueOf(i3), postingAttachment) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
            i3 = i4;
        }
        int size = arrayList.size();
        if (i2 < 0 || i2 >= size) {
            return postingState;
        }
        int size2 = arrayList.size();
        if (i < 0 || i >= size2) {
            return postingState;
        }
        int intValue = ((Number) ((Pair) arrayList.get(i2)).d()).intValue();
        int intValue2 = ((Number) ((Pair) arrayList.get(i)).d()).intValue();
        ArrayList arrayList2 = new ArrayList(list);
        PostingAttachment postingAttachment2 = (PostingAttachment) j5g.b0(intValue, arrayList2);
        if (postingAttachment2 != null) {
            arrayList2.remove(postingAttachment2);
            arrayList2.add(intValue2, postingAttachment2);
        }
        return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(editing.i, null, null, null, null, null, null, null, null, null, null, null, null, null, arrayList2, null, null, null, null, null, null, null, false, null, 268419071), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
    }
}
