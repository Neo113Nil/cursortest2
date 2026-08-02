package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Curator;

/* compiled from: MusicSocialModel.kt */
/* loaded from: classes3.dex */
public interface c750 {
    io.reactivex.rxjava3.internal.operators.observable.b0 a(Artist artist, String str);

    io.reactivex.rxjava3.internal.operators.observable.b0 b(Artist artist, String str);

    io.reactivex.rxjava3.internal.operators.observable.b0 c(Curator curator);

    io.reactivex.rxjava3.internal.operators.observable.b0 d(UserId userId);

    io.reactivex.rxjava3.internal.operators.observable.b0 e(UserId userId);

    io.reactivex.rxjava3.internal.operators.observable.b0 f(Curator curator);
}
