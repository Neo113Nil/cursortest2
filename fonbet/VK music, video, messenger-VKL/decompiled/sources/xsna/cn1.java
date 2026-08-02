package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import java.util.Date;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AlbumsInteractor.kt */
/* loaded from: classes7.dex */
public interface cn1 {
    Object b(UserId userId, int i, int i2, ContinuationImpl continuationImpl);

    Object f(VideoFile videoFile, UserId userId, ContinuationImpl continuationImpl);

    Object g(List list, List list2, VideoFile videoFile, Date date, ContinuationImpl continuationImpl);
}
