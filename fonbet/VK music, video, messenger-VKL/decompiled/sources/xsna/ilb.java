package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.audiobook.AudioBookChapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ChapterOfflineInteractor.kt */
/* loaded from: classes.dex */
public interface ilb {
    String a(String str);

    void b(UserId userId, AudioBookChapter audioBookChapter, int i);

    List c(UserId userId, ArrayList arrayList);

    AudioBookChapter d(UserId userId, String str);

    void e(UserId userId, int i, int i2, ArrayList arrayList);

    void f(UserId userId, String str, String str2);

    void g(int i, int i2, String str, String str2);

    void h(String str, DownloadingState downloadingState);

    /* compiled from: ChapterOfflineInteractor.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final ilb STUB = new C3059a();

        public final ilb getSTUB() {
            return STUB;
        }

        /* compiled from: ChapterOfflineInteractor.kt */
        /* renamed from: xsna.ilb$a$a, reason: collision with other inner class name */
        public static final class C3059a implements ilb {
            @Override // xsna.ilb
            public final String a(String str) {
                return null;
            }

            @Override // xsna.ilb
            public final List c(UserId userId, ArrayList arrayList) {
                return EmptyList.b;
            }

            @Override // xsna.ilb
            public final AudioBookChapter d(UserId userId, String str) {
                return null;
            }

            @Override // xsna.ilb
            public final void h(String str, DownloadingState downloadingState) {
            }

            @Override // xsna.ilb
            public final void b(UserId userId, AudioBookChapter audioBookChapter, int i) {
            }

            @Override // xsna.ilb
            public final void f(UserId userId, String str, String str2) {
            }

            @Override // xsna.ilb
            public final void e(UserId userId, int i, int i2, ArrayList arrayList) {
            }

            @Override // xsna.ilb
            public final void g(int i, int i2, String str, String str2) {
            }
        }
    }
}
