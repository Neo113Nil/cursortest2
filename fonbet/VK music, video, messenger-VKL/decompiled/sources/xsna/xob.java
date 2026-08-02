package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.decoration.ClipsDecorationPaginationKey;
import com.vk.clips.sdk.shared.decoration.ClipsFeedDecorationPayload;
import com.vk.im.chat.clips.decoration.api.models.ImChatPaginationKey;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: ChatClipsPaginatorImpl.kt */
/* loaded from: classes2.dex */
public final class xob implements kpe {
    public final gob a;
    public static final b b = new b();
    private static final kpe STUB = new a();

    /* compiled from: ChatClipsPaginatorImpl.kt */
    public static final class a implements kpe {

        /* compiled from: ChatClipsPaginatorImpl.kt */
        /* renamed from: xsna.xob$a$a, reason: collision with other inner class name */
        public static final class C4029a implements apd {
            public final EmptyList a = EmptyList.b;

            @Override // xsna.apd
            public final List<Pair<SdkClipVideoFile, ClipsFeedDecorationPayload>> b() {
                return this.a;
            }

            @Override // xsna.apd
            public final ClipsDecorationPaginationKey s1() {
                return null;
            }
        }

        @Override // xsna.kpe
        public final io.reactivex.rxjava3.core.x<apd> a(ClipsDecorationPaginationKey clipsDecorationPaginationKey, int i, boolean z) {
            return io.reactivex.rxjava3.core.x.k(new C4029a());
        }
    }

    /* compiled from: ChatClipsPaginatorImpl.kt */
    public static final class b {
        public final kpe getSTUB() {
            return xob.STUB;
        }
    }

    public xob(nob nobVar) {
        this.a = nobVar;
    }

    @Override // xsna.kpe
    public final io.reactivex.rxjava3.core.x<apd> a(ClipsDecorationPaginationKey clipsDecorationPaginationKey, int i, boolean z) {
        return !(clipsDecorationPaginationKey instanceof ImChatPaginationKey) ? io.reactivex.rxjava3.core.x.i(new IllegalArgumentException("ChatClipsPaginatorImpl should be used only with ImChatPaginationKey")) : this.a.a((ImChatPaginationKey) clipsDecorationPaginationKey, i, z);
    }
}
