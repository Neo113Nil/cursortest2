package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MusicBroadcastManager.kt */
/* loaded from: classes3.dex */
public interface mc40 {
    void a(MusicTrack musicTrack, ArrayList arrayList);

    List<UserId> b();

    void c(MusicTrack musicTrack);

    /* compiled from: MusicBroadcastManager.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final mc40 STUB = new C3337a();

        public final mc40 getSTUB() {
            return STUB;
        }

        /* compiled from: MusicBroadcastManager.kt */
        /* renamed from: xsna.mc40$a$a, reason: collision with other inner class name */
        public static final class C3337a implements mc40 {
            @Override // xsna.mc40
            public final List<UserId> b() {
                return EmptyList.b;
            }

            @Override // xsna.mc40
            public final void c(MusicTrack musicTrack) {
            }

            @Override // xsna.mc40
            public final void a(MusicTrack musicTrack, ArrayList arrayList) {
            }
        }
    }
}
