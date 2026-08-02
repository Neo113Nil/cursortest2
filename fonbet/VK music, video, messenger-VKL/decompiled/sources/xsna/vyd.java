package xsna;

import android.app.Activity;
import com.vk.dto.clips.external.VideoToClipInput;
import com.vk.dto.clips.gallery.ClipsProcessedItem;
import com.vk.dto.clips.model.ClipsEditorInitParams;
import com.vk.dto.clips.model.ClipsEditorSessionParams;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import java.util.List;

/* compiled from: ClipsEditorNavigator.kt */
/* loaded from: classes.dex */
public interface vyd {

    /* compiled from: ClipsEditorNavigator.kt */
    /* loaded from: classes14.dex */
    public static final class a {
        public final String a;
        public final Integer b;
        public final boolean c;

        public /* synthetic */ a(int i, Integer num, String str) {
            this(str, (i & 4) != 0 ? null : num, (i & 8) == 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            int b = qoy.b(this.a.hashCode() * 31, 31, false);
            Integer num = this.b;
            return Boolean.hashCode(this.c) + ((b + (num != null ? num.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DraftInputData(draftId=");
            sb.append(this.a);
            sb.append(", fromCamera=false, sessionId=");
            sb.append(this.b);
            sb.append(", doNotOpenClipsTabOnFinish=");
            return defpackage.q0.a(sb, this.c, ')');
        }

        public a(String str, Integer num, boolean z) {
            this.a = str;
            this.b = num;
            this.c = z;
        }
    }

    /* compiled from: ClipsEditorNavigator.kt */
    /* loaded from: classes14.dex */
    public static final class b {
        public final List<ClipsProcessedItem> a;
        public final MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint b;
        public final ClipsEditorMusicInfo c;
        public final String d;
        public final String e;

        public b(List<ClipsProcessedItem> list, MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint, ClipsEditorMusicInfo clipsEditorMusicInfo, String str, String str2) {
            this.a = list;
            this.b = creationEntryPoint;
            this.c = clipsEditorMusicInfo;
            this.d = str;
            this.e = str2;
        }

        public final String a() {
            return this.e;
        }

        public final ClipsEditorMusicInfo b() {
            return this.c;
        }

        public final MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint c() {
            return this.b;
        }

        public final String d() {
            return this.d;
        }

        public final List<ClipsProcessedItem> e() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            ClipsEditorMusicInfo clipsEditorMusicInfo = this.c;
            int hashCode2 = (hashCode + (clipsEditorMusicInfo == null ? 0 : clipsEditorMusicInfo.hashCode())) * 31;
            String str = this.d;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GalleryInputData(items=");
            sb.append(this.a);
            sb.append(", entryPoint=");
            sb.append(this.b);
            sb.append(", clipsEditorMusicInfo=");
            sb.append(this.c);
            sb.append(", hashtag=");
            sb.append(this.d);
            sb.append(", attachedVideoId=");
            return ho8.a(sb, this.e, ')');
        }
    }

    /* compiled from: ClipsEditorNavigator.kt */
    /* loaded from: classes14.dex */
    public static final class c {
        public final int a;
        public final Integer b;
        public final boolean c;

        public c() {
            throw null;
        }

        public c(int i, int i2, Integer num) {
            boolean z = (i2 & 4) == 0;
            this.a = i;
            this.b = num;
            this.c = z;
        }

        public final boolean a() {
            return this.c;
        }

        public final Integer b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && epx.f(this.b, cVar.b) && this.c == cVar.c;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            Integer num = this.b;
            return qoy.b((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SessionParams(themeResId=");
            sb.append(this.a);
            sb.append(", requestCode=");
            sb.append(this.b);
            sb.append(", finishOnDone=");
            return n23.b(sb, this.c, ", launcher=null)");
        }
    }

    /* compiled from: ClipsEditorNavigator.kt */
    /* loaded from: classes14.dex */
    public static final class d {
        public final VideoToClipInput a;
        public final MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint b;
        public final boolean c;

        public d(VideoToClipInput videoToClipInput, MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint, boolean z) {
            this.a = videoToClipInput;
            this.b = creationEntryPoint;
            this.c = z;
        }

        public final boolean a() {
            return this.c;
        }

        public final MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint b() {
            return this.b;
        }

        public final VideoToClipInput c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && this.b == dVar.b && this.c == dVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VTCInputData(vtcInput=");
            sb.append(this.a);
            sb.append(", entryPoint=");
            sb.append(this.b);
            sb.append(", doNotOpenClipsTabOnFinish=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    void a(Activity activity, d dVar, c cVar);

    void b(Activity activity, a aVar, c cVar, ClipsEditorSessionParams clipsEditorSessionParams);

    void c(Activity activity, ClipsEditorInitParams clipsEditorInitParams, c cVar);

    void e(Activity activity, b bVar, c cVar, ClipsEditorSessionParams clipsEditorSessionParams);
}
