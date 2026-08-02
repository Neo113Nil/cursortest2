package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.upload.impl.tasks.VideoUploadTaskNew;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: VideoUploadTaskNew.kt */
/* loaded from: classes6.dex */
public final class sot0 extends fhs0<Boolean> {
    public final /* synthetic */ VideoUploadTaskNew d;
    public final /* synthetic */ VideoFile e;
    public final /* synthetic */ VideoFile f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sot0(VideoUploadTaskNew videoUploadTaskNew, VideoFile videoFile, VideoFile videoFile2, Context context) {
        super(context);
        this.d = videoUploadTaskNew;
        this.e = videoFile;
        this.f = videoFile2;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        ((Boolean) obj).getClass();
        Intent intent = new Intent("com.vkontakte.android.RELOAD_VIDEO_ALBUMS");
        VideoUploadTaskNew videoUploadTaskNew = this.d;
        UserId userId = videoUploadTaskNew.m;
        List<Integer> list = videoUploadTaskNew.q;
        intent.putExtra("dialog_id", userId);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        n2i0.a(context, hf8.a, intent);
        gpt0 gpt0Var = gpt0.a;
        wjs0.a(new mxr0(this.e, userId, list, EmptyList.b));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            StringBuilder sb = new StringBuilder();
            sb.append(userId);
            sb.append('_');
            sb.append(intValue);
            wjs0.a(new cwr0(this.f, sb.toString(), 28));
        }
        wjs0.a(new fwr0(0));
    }
}
