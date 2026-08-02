package xsna;

import com.vk.camera.editor.stories.impl.multi.CameraPhotoDelegate;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.story.api.media.StoryMediaData;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: CameraCompositeProcessor.kt */
/* loaded from: classes16.dex */
public final class bh9 {
    public final CameraPhotoDelegate a;
    public final e2m0 b;
    public final i440 c;
    public final x3i d;

    public bh9(CameraPhotoDelegate cameraPhotoDelegate, e2m0 e2m0Var, i440 i440Var, x3i x3iVar) {
        this.a = cameraPhotoDelegate;
        this.b = e2m0Var;
        this.c = i440Var;
        this.d = x3iVar;
    }

    public final StoryMediaData a(tam0 tam0Var, StoryUploadParams storyUploadParams) {
        nov novVar;
        nov novVar2;
        zcl0 zcl0Var = tam0Var.h;
        String str = storyUploadParams.i;
        if (str == null || str.length() == 0) {
            storyUploadParams.i = "usual";
        }
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = zcl0Var.a;
        int i = 0;
        int i2 = 0;
        while (true) {
            novVar = null;
            if (i2 == copyOnWriteArrayList.size()) {
                novVar2 = null;
                break;
            }
            if (copyOnWriteArrayList.get(i2) instanceof g7m0) {
                novVar2 = copyOnWriteArrayList.get(i2);
                break;
            }
            i2++;
        }
        if (novVar2 != null) {
            CopyOnWriteArrayList<nov> copyOnWriteArrayList2 = zcl0Var.a;
            while (true) {
                if (i == copyOnWriteArrayList2.size()) {
                    break;
                }
                if (copyOnWriteArrayList2.get(i) instanceof lo9) {
                    novVar = copyOnWriteArrayList2.get(i);
                    break;
                }
                i++;
            }
            if (zcl0Var.r() || novVar != null) {
                zcl0Var.w(novVar2);
            }
        }
        return zcl0Var.u() ? this.b.b(tam0Var, storyUploadParams) : this.a.d(tam0Var, CameraPhotoDelegate.ProcessType.STORY_SHARE, storyUploadParams);
    }
}
