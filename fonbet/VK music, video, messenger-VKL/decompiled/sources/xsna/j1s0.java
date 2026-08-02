package xsna;

import android.content.ContextWrapper;
import android.content.Intent;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.i1s0;

/* compiled from: VideoAlbumsController.kt */
/* loaded from: classes7.dex */
public final class j1s0 extends fhs0<Boolean> {
    public final /* synthetic */ ContextWrapper d;
    public final /* synthetic */ i1s0 e;
    public final /* synthetic */ ArrayList<Integer> f;
    public final /* synthetic */ ArrayList<Integer> g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1s0(ContextWrapper contextWrapper, i1s0 i1s0Var, ArrayList arrayList, ArrayList arrayList2) {
        super(contextWrapper);
        this.d = contextWrapper;
        this.e = i1s0Var;
        this.f = arrayList;
        this.g = arrayList2;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        Object obj2;
        Object obj3;
        ((Boolean) obj).getClass();
        Intent intent = new Intent("com.vkontakte.android.RELOAD_VIDEO_ALBUMS");
        i1s0 i1s0Var = this.e;
        UserId userId = i1s0Var.b;
        intent.putExtra("dialog_id", userId);
        String str = hf8.a;
        ContextWrapper contextWrapper = this.d;
        n2i0.a(contextWrapper, str, intent);
        gpt0 gpt0Var = gpt0.a;
        VideoFile videoFile = i1s0Var.c;
        ArrayList<Integer> arrayList = this.f;
        ArrayList<Integer> arrayList2 = this.g;
        wjs0.a(new mxr0(videoFile, userId, arrayList, arrayList2));
        i1s0.a aVar = i1s0Var.h;
        if (arrayList.size() == 1) {
            Iterator it = ((ArrayList) aVar.y0()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                int i = ((i1s0.b) obj3).a;
                Integer num = arrayList.get(0);
                if (num != null && i == num.intValue()) {
                    break;
                }
            }
            i1s0.b bVar = (i1s0.b) obj3;
            cvk.w(contextWrapper.getString(R.string.video_added_into_playlist, videoFile.getTitle(), bVar != null ? bVar.b : null), false);
        } else if (arrayList.size() > 1) {
            cvk.w(contextWrapper.getString(R.string.video_added_into_playlists, videoFile.getTitle()), false);
        } else if (arrayList2.size() == 1) {
            Iterator it2 = ((ArrayList) aVar.y0()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                int i2 = ((i1s0.b) obj2).a;
                Integer num2 = arrayList2.get(0);
                if (num2 != null && i2 == num2.intValue()) {
                    break;
                }
            }
            i1s0.b bVar2 = (i1s0.b) obj2;
            cvk.w(contextWrapper.getString(R.string.video_removed_from_playlist, videoFile.getTitle(), bVar2 != null ? bVar2.b : null), false);
        } else if (arrayList2.size() > 1) {
            cvk.w(contextWrapper.getString(R.string.video_removed_from_playlists, videoFile.getTitle()), false);
        }
        wjs0.a(new fwr0(0));
        Iterator<Integer> it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            int intValue = it3.next().intValue();
            Serializer.c<VideoAlbum> cVar = VideoAlbum.CREATOR;
            wjs0.a(new wxr0(videoFile, null, VideoAlbum.a.a(intValue, userId), 2));
        }
    }
}
