package xsna;

import com.vk.clips.uploader.api.model.ClipUploadJob;
import com.vk.clips.uploader.api.model.ClipUploaderData;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import java.io.File;
import java.util.List;
import java.util.Set;
import kotlin.Pair;

/* compiled from: ClipsUploadController.kt */
/* loaded from: classes17.dex */
public interface eef {
    void a(int i);

    io.reactivex.rxjava3.core.q<List<Pair<ClipUploadJob, ded>>> b();

    void c(int i);

    void clear();

    void d(int i);

    List<Pair<ClipUploadJob, ded>> e();

    io.reactivex.rxjava3.core.q f();

    ClipUploadJob g(Integer num, ClipUploaderData clipUploaderData);

    ClipUploadJob h(ClipsEncoderParameters clipsEncoderParameters);

    io.reactivex.rxjava3.core.q<Pair<ClipUploadJob, ded>> i();

    Set<File> s0();
}
