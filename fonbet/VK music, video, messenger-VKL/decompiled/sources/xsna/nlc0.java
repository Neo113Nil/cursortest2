package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PostingSelectedMediaFilter.kt */
/* loaded from: classes4.dex */
public final class nlc0 {
    public final wj50<fmc0> a;

    public nlc0(wj50<fmc0> wj50Var) {
        this.a = wj50Var;
    }

    public static boolean b(Uri uri) {
        if (!uri.isHierarchical()) {
            return false;
        }
        try {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return true;
            }
            openInputStream.close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final PostingState.Editing a(PostingState.Editing editing) {
        List<MediaPickerSelectedItem> list = editing.f.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            MediaPickerSelectedItem mediaPickerSelectedItem = (MediaPickerSelectedItem) obj;
            if (mediaPickerSelectedItem instanceof MediaPickerSelectedItem.LocalMedia ? b(((MediaPickerSelectedItem.LocalMedia) mediaPickerSelectedItem).b.ba().f()) : true) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        List<PostingAttachment> list2 = editing.i.p;
        ArrayList arrayList3 = new ArrayList();
        for (PostingAttachment postingAttachment : list2) {
            if ((postingAttachment.nb() instanceof cvz) && (postingAttachment instanceof UploadDto)) {
                String str = ((UploadDto) postingAttachment).I4().c;
                if (!(str != null ? b(Uri.parse(str)) : false)) {
                    arrayList2.add(postingAttachment);
                }
            }
            arrayList3.add(postingAttachment);
        }
        PostEditableData a = PostEditableData.a(editing.i, null, null, null, null, null, null, null, null, null, null, null, null, null, arrayList3, null, null, null, null, null, null, null, false, null, 268419071);
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                this.a.b(new rmc0((UploadDto) it.next()));
            }
        }
        return PostingState.Editing.a(editing, null, null, null, MediaPickerState.a(editing.f, null, null, 0, arrayList, null, null, null, null, null, 503), null, a, null, null, null, null, false, null, false, null, null, null, null, null, 1048431);
    }
}
