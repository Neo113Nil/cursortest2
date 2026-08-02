package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vk.api.base.Document;
import com.vk.bridges.ImageViewer;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.VideoFile;
import com.vk.dto.gift.CatalogedGift;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.polls.Poll;
import com.vk.pending.PendingStoryAttachment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WriteBarBridge.kt */
/* loaded from: classes7.dex */
public interface u0y0 {
    m6r0 a();

    boolean b();

    void c(CatalogedGift catalogedGift, ArrayList arrayList, Context context);

    void d(Activity activity, PhotoAlbum photoAlbum);

    void e();

    mq4 f();

    void g(Activity activity, Document document);

    boolean i();

    Poll j(int i, Intent intent);

    void k(Activity activity, String str);

    void l(Context context, VideoFile videoFile);

    List<PendingStoryAttachment> m(Intent intent);

    ImageViewer.ControlsOptions n();

    void o();

    boolean p(Intent intent);

    default void h(FragmentImpl fragmentImpl, Bundle bundle) {
    }
}
