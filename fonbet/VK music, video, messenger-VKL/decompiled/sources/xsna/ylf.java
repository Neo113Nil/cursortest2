package xsna;

import com.vk.clips.upload.model.ClipUploadData;
import com.vk.dto.common.ClipVideoFile;
import java.util.List;
import kotlin.Pair;

/* compiled from: ClipsUploadsInteractor.kt */
@ozl
/* loaded from: classes.dex */
public interface ylf {
    void a(ClipUploadData clipUploadData);

    io.reactivex.rxjava3.core.q<List<Pair<ClipVideoFile, eed>>> b();

    void c(ClipUploadData clipUploadData);

    void d(int i, String str);

    void e(xdd xddVar);

    void f(xdd xddVar, String str);

    io.reactivex.rxjava3.internal.operators.single.v g();
}
