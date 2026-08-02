package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.photo.Photo;
import java.util.Collection;

/* compiled from: NarrativeRepository.kt */
/* loaded from: classes3.dex */
public interface ou50 {
    io.reactivex.rxjava3.core.x a(int i, UserId userId, String str);

    io.reactivex.rxjava3.core.q b(int i, UserId userId, String str, boolean z);

    io.reactivex.rxjava3.core.x<Narrative> c(UserId userId, String str, Collection<Integer> collection, ju50 ju50Var);

    io.reactivex.rxjava3.core.x<Narrative> d(UserId userId, int i, String str, Iterable<Integer> iterable, ju50 ju50Var);

    io.reactivex.rxjava3.core.q<Photo> e(String str);

    io.reactivex.rxjava3.core.x<s3q0> f(UserId userId, Iterable<? extends us80> iterable);
}
