package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PublishNetworkApi.kt */
/* loaded from: classes7.dex */
public interface cde0 {
    Object a(ContinuationImpl continuationImpl);

    Object b(UserId userId, int i, int i2, ContinuationImpl continuationImpl);

    Object c(VideoFile videoFile, ContinuationImpl continuationImpl);

    Object d(String str, ContinuationImpl continuationImpl);

    Object e(ois0 ois0Var, ContinuationImpl continuationImpl);

    Object f(VideoFile videoFile, UserId userId, ContinuationImpl continuationImpl);

    Object g(UserId userId, ContinuationImpl continuationImpl);

    Object h(ois0 ois0Var, ContinuationImpl continuationImpl);

    Object i(VideoFile videoFile, ArrayList arrayList, ContinuationImpl continuationImpl);

    Object j(VideoFile videoFile, ArrayList arrayList, ContinuationImpl continuationImpl);
}
