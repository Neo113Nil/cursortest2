package xsna;

import android.content.Context;
import android.util.Size;
import android.view.View;
import com.vk.camera.editor.stories.impl.multi.CameraPhotoDelegate;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.storycamera.builder.StoryEditorCameraParams;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.List;
import xsna.ds60;
import xsna.ikv0;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class osn implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ osn(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                com.vk.notifications.dnd.impl.a aVar = (com.vk.notifications.dnd.impl.a) obj2;
                View view = (View) obj;
                List<Long> list = lsn.a;
                Preference.F(0L, "notifications_prefs", "dnd_end");
                aVar.b.onNext(Boolean.FALSE);
                Context context = view.getContext();
                ikv0.a aVar2 = new ikv0.a(context);
                aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null, 12);
                aVar2.u = new ikv0.d(context.getString(R.string.dnd_disabled_message), (String) null, (ikv0.d.a) null, 6);
                io.reactivex.rxjava3.disposables.a aVar3 = new io.reactivex.rxjava3.disposables.a(new v71(aVar2.n(), 3));
                aVar.c = aVar3;
                hg1.b(view, aVar3);
                break;
            case 1:
                ((com.vk.newsfeed.posting.market_picker.presentation.base.view.f) obj2).v.remove(Integer.valueOf(((Photo) obj).c));
                break;
            case 2:
                u440 u440Var = (u440) obj2;
                CommonUploadParams commonUploadParams = u440Var.k;
                e2m0 e2m0Var = u440Var.r0;
                tam0 tam0Var = (tam0) obj;
                StoryEditorCameraParams x = u440Var.j.x();
                CameraPhotoDelegate cameraPhotoDelegate = u440Var.s0;
                bh9 bh9Var = u440Var.t0;
                WebStoryBox webStoryBox = x.e;
                if (webStoryBox != null && webStoryBox.Db()) {
                    boolean z = tam0Var.g;
                    zcl0 zcl0Var = tam0Var.h;
                    if (!z) {
                        if (!zcl0Var.u()) {
                            cameraPhotoDelegate.getClass();
                            cameraPhotoDelegate.d(tam0Var, CameraPhotoDelegate.ProcessType.SAVE, null);
                            break;
                        } else {
                            UserId userId = commonUploadParams.e;
                            e2m0Var.c(tam0Var);
                            break;
                        }
                    } else {
                        bh9Var.getClass();
                        if (!zcl0Var.u()) {
                            bh9Var.a.d(tam0Var, CameraPhotoDelegate.ProcessType.SAVE, null);
                            break;
                        } else {
                            e2m0 e2m0Var2 = bh9Var.b;
                            UserId.b bVar = UserId.c;
                            e2m0Var2.c(tam0Var);
                            break;
                        }
                    }
                } else if (!tam0Var.g) {
                    tam0 tam0Var2 = u440Var.B0;
                    if (tam0Var2 != null && tam0Var2.f()) {
                        cameraPhotoDelegate.getClass();
                        cameraPhotoDelegate.d(tam0Var, CameraPhotoDelegate.ProcessType.SAVE, null);
                        break;
                    } else if (u440Var.d8()) {
                        UserId userId2 = commonUploadParams.e;
                        e2m0Var.c(tam0Var);
                        break;
                    }
                } else {
                    bh9Var.getClass();
                    if (!tam0Var.h.u()) {
                        bh9Var.a.d(tam0Var, CameraPhotoDelegate.ProcessType.SAVE, null);
                        break;
                    } else {
                        e2m0 e2m0Var3 = bh9Var.b;
                        UserId.b bVar2 = UserId.c;
                        e2m0Var3.c(tam0Var);
                        break;
                    }
                }
                break;
            default:
                rq60 rq60Var = (rq60) obj2;
                ds60.c.j jVar = (ds60.c.j) obj;
                rq60Var.c(new yo60.h(new NewsfeedExternalAction.c.r(jVar.b)));
                NewsEntry newsEntry = jVar.b;
                if (!(newsEntry instanceof Photos)) {
                    rq60Var.c(new yo60.g.c(R.string.post_removed));
                    break;
                } else {
                    PhotoAttachment Mb = ((Photos) newsEntry).Mb();
                    Photo photo = Mb != null ? Mb.l : null;
                    ((NewsFeedBridgeComponent) rq60Var.k.getValue()).Ad().p0(photo != null ? Integer.valueOf(photo.d) : null, photo != null ? Integer.valueOf(photo.c) : null);
                    rq60Var.c(new yo60.g.c(R.string.photo_removed));
                    break;
                }
        }
    }
}
