package xsna;

import com.vk.music.podcast.api.menu.PodcastMenuItem;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PodcastAvailableMenuItems.kt */
/* loaded from: classes3.dex */
public interface dgb0 {

    /* compiled from: PodcastAvailableMenuItems.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final dgb0 STUB = new C2732a();

        /* compiled from: PodcastAvailableMenuItems.kt */
        /* renamed from: xsna.dgb0$a$a, reason: collision with other inner class name */
        public static final class C2732a implements dgb0 {
            @Override // xsna.dgb0
            public final List<PodcastMenuItem> get() {
                return EmptyList.b;
            }
        }

        public final dgb0 getSTUB() {
            return STUB;
        }
    }

    List<PodcastMenuItem> get();
}
