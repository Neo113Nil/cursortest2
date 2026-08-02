package xsna;

import android.net.Uri;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$SeenMediaInfo;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;

/* compiled from: StoriesDownloadTechMetrics.kt */
/* loaded from: classes6.dex */
public interface vrl0 {
    void a(StoryEntry storyEntry, boolean z, boolean z2, boolean z3, Long l);

    void b(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid eventTypeAndroid, StoryEntry storyEntry, boolean z, Long l);

    void c(StoryEntry storyEntry, boolean z, boolean z2, boolean z3);

    void d(StoryEntry storyEntry, boolean z, boolean z2, boolean z3, MobileOfficialAppsConStoriesStat$SeenMediaInfo mobileOfficialAppsConStoriesStat$SeenMediaInfo);

    void e(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid eventTypeAndroid);

    void f(StoryEntry storyEntry, long j, long j2, Long l);

    void g();

    void h(StoryEntry storyEntry, StoryEntry storyEntry2, boolean z, Boolean bool);

    void i(long j, q7m0 q7m0Var, gzs gzsVar, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint);

    void j(StoryEntry storyEntry, Uri uri, Throwable th, Long l);

    void k(StoryEntry storyEntry, boolean z, Long l, MobileOfficialAppsConStoriesStat$SeenMediaInfo mobileOfficialAppsConStoriesStat$SeenMediaInfo, Integer num);

    void l();

    void m(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid eventTypeAndroid, StoryEntry storyEntry, boolean z, Integer num);

    void n(StoryEntry storyEntry, StoryEntry storyEntry2, boolean z, boolean z2);

    void o(boolean z);

    void onDestroy();

    void p(StoryEntry storyEntry, Throwable th, boolean z, Long l, Uri uri);

    void q(boolean z, StoryEntry storyEntry, boolean z2, Long l);

    void r(x1e0 x1e0Var);

    void s();

    /* compiled from: StoriesDownloadTechMetrics.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final vrl0 STUB = new C3899a();

        public final vrl0 getSTUB() {
            return STUB;
        }

        /* compiled from: StoriesDownloadTechMetrics.kt */
        /* renamed from: xsna.vrl0$a$a, reason: collision with other inner class name */
        public static final class C3899a implements vrl0 {
            @Override // xsna.vrl0
            public final void g() {
            }

            @Override // xsna.vrl0
            public final void l() {
            }

            @Override // xsna.vrl0
            public final void onDestroy() {
            }

            @Override // xsna.vrl0
            public final void s() {
            }

            @Override // xsna.vrl0
            public final void e(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid eventTypeAndroid) {
            }

            @Override // xsna.vrl0
            public final void o(boolean z) {
            }

            @Override // xsna.vrl0
            public final void r(x1e0 x1e0Var) {
            }

            @Override // xsna.vrl0
            public final void b(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid eventTypeAndroid, StoryEntry storyEntry, boolean z, Long l) {
            }

            @Override // xsna.vrl0
            public final void c(StoryEntry storyEntry, boolean z, boolean z2, boolean z3) {
            }

            @Override // xsna.vrl0
            public final void f(StoryEntry storyEntry, long j, long j2, Long l) {
            }

            @Override // xsna.vrl0
            public final void h(StoryEntry storyEntry, StoryEntry storyEntry2, boolean z, Boolean bool) {
            }

            @Override // xsna.vrl0
            public final void i(long j, q7m0 q7m0Var, gzs gzsVar, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
            }

            @Override // xsna.vrl0
            public final void j(StoryEntry storyEntry, Uri uri, Throwable th, Long l) {
            }

            @Override // xsna.vrl0
            public final void m(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid eventTypeAndroid, StoryEntry storyEntry, boolean z, Integer num) {
            }

            @Override // xsna.vrl0
            public final void n(StoryEntry storyEntry, StoryEntry storyEntry2, boolean z, boolean z2) {
            }

            @Override // xsna.vrl0
            public final void q(boolean z, StoryEntry storyEntry, boolean z2, Long l) {
            }

            @Override // xsna.vrl0
            public final void a(StoryEntry storyEntry, boolean z, boolean z2, boolean z3, Long l) {
            }

            @Override // xsna.vrl0
            public final void d(StoryEntry storyEntry, boolean z, boolean z2, boolean z3, MobileOfficialAppsConStoriesStat$SeenMediaInfo mobileOfficialAppsConStoriesStat$SeenMediaInfo) {
            }

            @Override // xsna.vrl0
            public final void k(StoryEntry storyEntry, boolean z, Long l, MobileOfficialAppsConStoriesStat$SeenMediaInfo mobileOfficialAppsConStoriesStat$SeenMediaInfo, Integer num) {
            }

            @Override // xsna.vrl0
            public final void p(StoryEntry storyEntry, Throwable th, boolean z, Long l, Uri uri) {
            }
        }
    }
}
