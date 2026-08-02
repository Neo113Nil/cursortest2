package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsClipItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import java.util.ArrayList;

/* compiled from: ClipsInternalNpsAnalyticsHelper.kt */
/* loaded from: classes17.dex */
public final class lie {
    public final ArrayList a = new ArrayList();

    /* compiled from: ClipsInternalNpsAnalyticsHelper.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TrackedInternalNpsViewQuestionKey(uniqueKey=");
            sb.append(this.a);
            sb.append(", questionsId=");
            sb.append(this.b);
            sb.append(", questionId=");
            return ho8.a(sb, this.c, ')');
        }
    }

    public static void a(MobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem.EventType eventType, VideoFile videoFile, String str, String str2, SchemeStat$TypeClipViewerItem.ScreenType screenType) {
        new iof(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS, new SchemeStat$TypeClipViewerItem(screenType, SchemeStat$TypeClipViewerItem.EventType.INTERNAL_NPS_EVENT, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsClipsStat$TypeClipInternalNpsEventItem(eventType, str, str2, new MobileOfficialAppsClipsStat$TypeClipsClipItem(videoFile.o0(), videoFile.I0().b, videoFile.r())), null, null, null, null, null, null, null, null, null, null, null, null, null, 1073676284, null)).q();
    }
}
