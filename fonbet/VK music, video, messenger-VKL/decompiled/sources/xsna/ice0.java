package xsna;

import android.net.Uri;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import java.io.Serializable;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PublishInteractor.kt */
/* loaded from: classes7.dex */
public interface ice0 {
    Object a(ContinuationImpl continuationImpl);

    Object c(VideoFile videoFile, ContinuationImpl continuationImpl);

    Object d(String str, ContinuationImpl continuationImpl);

    Object e(ois0 ois0Var, ContinuationImpl continuationImpl);

    Object g(UserId userId, ContinuationImpl continuationImpl);

    Object h(ois0 ois0Var, ContinuationImpl continuationImpl);

    Object i(List list, ContinuationImpl continuationImpl);

    Object j(Uri uri, ContinuationImpl continuationImpl);

    Object k(Uri uri, ContinuationImpl continuationImpl);

    Serializable l(ContinuationImpl continuationImpl);
}
