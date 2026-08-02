package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.story.api.domain.interactor.upload.IPersistingStoryUpload;
import com.vk.story.api.domain.interactor.upload.StoryTaskParams;
import com.vk.storycamera.upload.PersistingStoryUpload;
import java.io.File;
import java.util.ArrayList;

/* compiled from: IStoryUploadDelegate.kt */
/* loaded from: classes11.dex */
public interface tov {
    zjm0 a(int i);

    void b(int i);

    ArrayList c(int i, UserId userId);

    void clear();

    boolean d(int i);

    void e(zjm0 zjm0Var);

    zjm0 f(int i);

    void g(IPersistingStoryUpload iPersistingStoryUpload, StoryTaskParams storyTaskParams);

    void h(UserId userId, bnc0 bnc0Var);

    PersistingStoryUpload i(boolean z, File file, File file2, StoryTaskParams storyTaskParams, StoryUploadParams storyUploadParams);

    ArrayList j();

    zjm0 k(int i);

    void l(zjm0 zjm0Var);

    boolean m();

    int n(IPersistingStoryUpload iPersistingStoryUpload);

    void o(IPersistingStoryUpload iPersistingStoryUpload);

    IPersistingStoryUpload p(int i);

    int q(IPersistingStoryUpload iPersistingStoryUpload, StoryTaskParams storyTaskParams);

    zjm0 r(int i, String str);

    void s(IPersistingStoryUpload iPersistingStoryUpload);

    int t(ArrayList arrayList);
}
