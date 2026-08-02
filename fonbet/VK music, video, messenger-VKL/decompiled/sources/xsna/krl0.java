package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StorySessionParams;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.dto.stories.model.clickable.ClickablePoll;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.storycamera.screen.StoryGalleryActivity;
import java.io.File;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: StoriesBridge.kt */
/* loaded from: classes15.dex */
public interface krl0 {
    public static final a a = a.a;

    /* compiled from: StoriesBridge.kt */
    public static final class b {
        public final o1d a;
        public final String b;
        public final ClickablePoll c;

        public b(o1d o1dVar, String str, ClickablePoll clickablePoll) {
            this.a = o1dVar;
            this.b = str;
            this.c = clickablePoll;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(((this.a.hashCode() * 31) - 1895159231) * 31, 31, this.b);
        }

        public final String toString() {
            return "PollParams(view=" + this.a + ", voteContext=clips_view, trackCode=" + this.b + ", sticker=" + this.c + ')';
        }
    }

    default boolean d() {
        return false;
    }

    default String e(CommonUploadParams commonUploadParams, StoryUploadParams storyUploadParams) {
        return "";
    }

    default boolean g(b bVar, t9 t9Var, t40 t40Var) {
        return false;
    }

    default boolean h(boolean z, String str, Boolean bool, w2j0 w2j0Var) {
        return true;
    }

    default StorySessionParams i() {
        return new StorySessionParams(null, null, null);
    }

    default Intent k(StoryGalleryActivity storyGalleryActivity) {
        return null;
    }

    default String m(int i) {
        return "";
    }

    default io.reactivex.rxjava3.core.x<File> p(String str, String str2) {
        return io.reactivex.rxjava3.internal.operators.single.a0.b;
    }

    /* compiled from: StoriesBridge.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final krl0 STUB = new C3200a();

        public final krl0 getSTUB() {
            return STUB;
        }

        /* compiled from: StoriesBridge.kt */
        /* renamed from: xsna.krl0$a$a, reason: collision with other inner class name */
        public static final class C3200a implements krl0 {
            @Override // xsna.krl0
            public final boolean d() {
                return false;
            }

            @Override // xsna.krl0
            public final String e(CommonUploadParams commonUploadParams, StoryUploadParams storyUploadParams) {
                return "";
            }

            @Override // xsna.krl0
            public final boolean g(b bVar, t9 t9Var, t40 t40Var) {
                return false;
            }

            @Override // xsna.krl0
            public final boolean h(boolean z, String str, Boolean bool, w2j0 w2j0Var) {
                return true;
            }

            @Override // xsna.krl0
            public final Intent k(StoryGalleryActivity storyGalleryActivity) {
                return null;
            }

            @Override // xsna.krl0
            public final String m(int i) {
                return "";
            }

            @Override // xsna.krl0
            public final io.reactivex.rxjava3.core.x<File> p(String str, String str2) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.krl0
            public final void j() {
            }

            @Override // xsna.krl0
            public final void l(Integer num) {
            }

            @Override // xsna.krl0
            public final void a(Context context, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
            }

            @Override // xsna.krl0
            public final void n(Context context, StoryEntry storyEntry) {
            }

            @Override // xsna.krl0
            public final void q(Context context, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, ListBuilder listBuilder) {
            }

            @Override // xsna.krl0
            public final void o(Context context, String str, String str2, String str3, boolean z, StoryEntry storyEntry) {
            }

            @Override // xsna.krl0
            public final void b(Context context, UserId userId, String str, String str2) {
            }

            @Override // xsna.krl0
            public final void f(Context context, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint creationEntryPoint, List<String> list) {
            }
        }
    }

    default void j() {
    }

    default void l(Integer num) {
    }

    default void a(Context context, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
    }

    default void n(Context context, StoryEntry storyEntry) {
    }

    default void q(Context context, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, ListBuilder listBuilder) {
    }

    default void o(Context context, String str, String str2, String str3, boolean z, StoryEntry storyEntry) {
    }

    default void b(Context context, UserId userId, String str, String str2) {
    }

    default void f(Context context, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint creationEntryPoint, List<String> list) {
    }
}
