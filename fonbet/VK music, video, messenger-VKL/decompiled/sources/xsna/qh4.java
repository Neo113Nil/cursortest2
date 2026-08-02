package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.music.offline.api.model.moosic.VkMusicOldAudioBookEntity;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AudioBookOfflineInteractor.kt */
/* loaded from: classes.dex */
public interface qh4 {
    List A(int i, UserId userId);

    void B(UserId userId, AudioBook audioBook);

    void C(int i, UserId userId);

    List<AudioBook> D(UserId userId);

    List<AudioBook> E(UserId userId);

    void F(int i, UserId userId, boolean z);

    int f(int i, UserId userId);

    io.reactivex.rxjava3.core.q m(int i, UserId userId);

    void x(UserId userId, int i, VkMusicOldAudioBookEntity vkMusicOldAudioBookEntity);

    AudioBook y(int i, UserId userId);

    void z(UserId userId, AudioBook audioBook);

    /* compiled from: AudioBookOfflineInteractor.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final qh4 STUB = new C3561a();

        public final qh4 getSTUB() {
            return STUB;
        }

        /* compiled from: AudioBookOfflineInteractor.kt */
        /* renamed from: xsna.qh4$a$a, reason: collision with other inner class name */
        public static final class C3561a implements qh4 {
            @Override // xsna.qh4
            public final List A(int i, UserId userId) {
                return EmptyList.b;
            }

            @Override // xsna.qh4
            public final List<AudioBook> D(UserId userId) {
                return EmptyList.b;
            }

            @Override // xsna.qh4
            public final List<AudioBook> E(UserId userId) {
                return EmptyList.b;
            }

            @Override // xsna.qh4
            public final int f(int i, UserId userId) {
                return 0;
            }

            @Override // xsna.qh4
            public final io.reactivex.rxjava3.core.q m(int i, UserId userId) {
                return io.reactivex.rxjava3.internal.operators.observable.g0.b;
            }

            @Override // xsna.qh4
            public final AudioBook y(int i, UserId userId) {
                return null;
            }

            @Override // xsna.qh4
            public final void B(UserId userId, AudioBook audioBook) {
            }

            @Override // xsna.qh4
            public final void C(int i, UserId userId) {
            }

            @Override // xsna.qh4
            public final void z(UserId userId, AudioBook audioBook) {
            }

            @Override // xsna.qh4
            public final void F(int i, UserId userId, boolean z) {
            }

            @Override // xsna.qh4
            public final void x(UserId userId, int i, VkMusicOldAudioBookEntity vkMusicOldAudioBookEntity) {
            }
        }
    }
}
