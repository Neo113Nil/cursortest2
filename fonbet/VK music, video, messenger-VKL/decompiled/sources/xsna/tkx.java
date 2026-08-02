package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;

/* compiled from: InternalPostingDraftsRepository.kt */
/* loaded from: classes4.dex */
public interface tkx extends cfc0 {
    long a(UserId userId);

    io.reactivex.rxjava3.internal.operators.single.f0 c(UserId userId, PostEditableData postEditableData);

    io.reactivex.rxjava3.internal.operators.single.f0 e(long j, UserId userId);

    io.reactivex.rxjava3.internal.operators.single.f0 f(long j, UserId userId, PostEditableData postEditableData);
}
