package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.music.offline.api.model.CorruptedReason;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;

/* compiled from: TrackOfflineInteractor.kt */
/* loaded from: classes.dex */
public interface kgp0 {
    static /* synthetic */ void f(kgp0 kgp0Var, UserId userId, MusicTrack musicTrack, String str, boolean z, String str2, CorruptedReason corruptedReason, int i) {
        CorruptedReason corruptedReason2;
        kgp0 kgp0Var2;
        UserId userId2;
        MusicTrack musicTrack2;
        String str3;
        if ((i & 8) != 0) {
            z = true;
        }
        boolean z2 = z;
        String str4 = (i & 16) != 0 ? null : str2;
        if ((i & 32) != 0) {
            corruptedReason2 = null;
            userId2 = userId;
            musicTrack2 = musicTrack;
            str3 = str;
            kgp0Var2 = kgp0Var;
        } else {
            corruptedReason2 = corruptedReason;
            kgp0Var2 = kgp0Var;
            userId2 = userId;
            musicTrack2 = musicTrack;
            str3 = str;
        }
        kgp0Var2.b(userId2, musicTrack2, str3, z2, str4, corruptedReason2);
    }

    void E(int i, UserId userId, String str, String str2);

    void I(UserId userId, ArrayList arrayList);

    List<MusicTrack> a();

    void b(UserId userId, MusicTrack musicTrack, String str, boolean z, String str2, CorruptedReason corruptedReason);

    void c(String str, MusicOfflineCacheStorage musicOfflineCacheStorage);

    MusicOfflineCacheStorage d(String str);

    MusicOfflineCacheStorage e();

    int g(UserId userId);

    io.reactivex.rxjava3.core.x h(ArrayList arrayList);

    void i(UserId userId, MusicTrack musicTrack, String str);

    int j(UserId userId);

    List<MusicTrack> k(UserId userId, boolean z);

    String l(String str);

    int m(UserId userId, MusicTrack musicTrack, String str);

    void n(MusicTrack musicTrack, CorruptedReason corruptedReason);

    void o(UserId userId, String str, String str2);

    List<MusicTrack> p(UserId userId, List<String> list);

    int q(UserId userId, String str, List list);

    List<MusicTrack> r(UserId userId, List<String> list);

    MusicTrack s(UserId userId, String str);

    void t(String str, DownloadingState downloadingState);

    void v(int i, LinkedHashMap linkedHashMap, Map map);

    int w(UserId userId, String str, List list);

    void z(int i, Map map, Map map2, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, Set set, Set set2);

    /* compiled from: TrackOfflineInteractor.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final kgp0 STUB = new C3180a();

        public final kgp0 getSTUB() {
            return STUB;
        }

        /* compiled from: TrackOfflineInteractor.kt */
        /* renamed from: xsna.kgp0$a$a, reason: collision with other inner class name */
        public static final class C3180a implements kgp0 {
            @Override // xsna.kgp0
            public final List<MusicTrack> a() {
                return EmptyList.b;
            }

            @Override // xsna.kgp0
            public final MusicOfflineCacheStorage d(String str) {
                return null;
            }

            @Override // xsna.kgp0
            public final MusicOfflineCacheStorage e() {
                return null;
            }

            @Override // xsna.kgp0
            public final int g(UserId userId) {
                return 0;
            }

            @Override // xsna.kgp0
            public final io.reactivex.rxjava3.core.x h(ArrayList arrayList) {
                return io.reactivex.rxjava3.core.x.k(EmptyList.b);
            }

            @Override // xsna.kgp0
            public final int j(UserId userId) {
                return 0;
            }

            @Override // xsna.kgp0
            public final List<MusicTrack> k(UserId userId, boolean z) {
                return EmptyList.b;
            }

            @Override // xsna.kgp0
            public final String l(String str) {
                return null;
            }

            @Override // xsna.kgp0
            public final int m(UserId userId, MusicTrack musicTrack, String str) {
                return 0;
            }

            @Override // xsna.kgp0
            public final List<MusicTrack> p(UserId userId, List<String> list) {
                return EmptyList.b;
            }

            @Override // xsna.kgp0
            public final int q(UserId userId, String str, List list) {
                return 0;
            }

            @Override // xsna.kgp0
            public final List<MusicTrack> r(UserId userId, List<String> list) {
                return EmptyList.b;
            }

            @Override // xsna.kgp0
            public final MusicTrack s(UserId userId, String str) {
                return null;
            }

            @Override // xsna.kgp0
            public final int w(UserId userId, String str, List list) {
                return 0;
            }

            @Override // xsna.kgp0
            public final void I(UserId userId, ArrayList arrayList) {
            }

            @Override // xsna.kgp0
            public final void c(String str, MusicOfflineCacheStorage musicOfflineCacheStorage) {
            }

            @Override // xsna.kgp0
            public final void n(MusicTrack musicTrack, CorruptedReason corruptedReason) {
            }

            @Override // xsna.kgp0
            public final void t(String str, DownloadingState downloadingState) {
            }

            @Override // xsna.kgp0
            public final void i(UserId userId, MusicTrack musicTrack, String str) {
            }

            @Override // xsna.kgp0
            public final void o(UserId userId, String str, String str2) {
            }

            @Override // xsna.kgp0
            public final void v(int i, LinkedHashMap linkedHashMap, Map map) {
            }

            @Override // xsna.kgp0
            public final void E(int i, UserId userId, String str, String str2) {
            }

            @Override // xsna.kgp0
            public final void b(UserId userId, MusicTrack musicTrack, String str, boolean z, String str2, CorruptedReason corruptedReason) {
            }

            @Override // xsna.kgp0
            public final void z(int i, Map map, Map map2, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, Set set, Set set2) {
            }
        }
    }
}
