package xsna;

import android.os.Bundle;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.dto.common.VideoFile;
import com.vk.dto.video.VideoSeason;

/* compiled from: VideoMinimizableDialogAction.kt */
/* loaded from: classes3.dex */
public interface vts0 {

    /* compiled from: VideoMinimizableDialogAction.kt */
    public static final class a implements j {
        public final DonutVideoAction a;

        public a(DonutVideoAction donutVideoAction) {
            this.a = donutVideoAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            DonutVideoAction donutVideoAction = this.a;
            if (donutVideoAction == null) {
                return 0;
            }
            return donutVideoAction.hashCode();
        }

        public final String toString() {
            return "OnSubtitleClicked(donutAction=" + this.a + ')';
        }
    }

    /* compiled from: VideoMinimizableDialogAction.kt */
    public static final class b implements vts0 {
        public static final b a = new b();
    }

    /* compiled from: VideoMinimizableDialogAction.kt */
    public static final class c implements vts0 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "OpenCommentReplies(arguments=null)";
        }
    }

    /* compiled from: VideoMinimizableDialogAction.kt */
    public static final class d implements vts0 {
        public static final d a = new d();
    }

    /* compiled from: VideoMinimizableDialogAction.kt */
    public static final class e implements vts0 {
        public final Bundle a;

        public e(Bundle bundle) {
            this.a = bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return uf3.c(new StringBuilder("OpenCommentsThread(args="), this.a, ')');
        }
    }

    /* compiled from: VideoMinimizableDialogAction.kt */
    public static final class f implements vts0 {
        public static final f a = new f();
    }

    /* compiled from: VideoMinimizableDialogAction.kt */
    public static final class g implements vts0 {
        public static final g a = new g();
    }

    /* compiled from: VideoMinimizableDialogAction.kt */
    public static final class h implements vts0 {
        public final b4 a;

        public h(b4 b4Var) {
            this.a = b4Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "VideoAboutDialogAction(action=" + this.a + ')';
        }
    }

    /* compiled from: VideoMinimizableDialogAction.kt */
    public interface i extends vts0 {

        /* compiled from: VideoMinimizableDialogAction.kt */
        public static final class a implements i {
            public final atp a;

            public a(atp atpVar) {
                this.a = atpVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OnEpisodeClick(item=" + this.a + ')';
            }
        }
    }

    /* compiled from: VideoMinimizableDialogAction.kt */
    public interface j extends vts0 {

        /* compiled from: VideoMinimizableDialogAction.kt */
        public static final class a implements j {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1850021162;
            }

            public final String toString() {
                return "CycleIconClicked";
            }
        }

        /* compiled from: VideoMinimizableDialogAction.kt */
        public static final class b implements j {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 937489044;
            }

            public final String toString() {
                return "OnLoadNextRequested";
            }
        }

        /* compiled from: VideoMinimizableDialogAction.kt */
        public static final class c implements j {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1013157232;
            }

            public final String toString() {
                return "OnLoadPreviousRequested";
            }
        }

        /* compiled from: VideoMinimizableDialogAction.kt */
        public static final class d implements j {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -17530444;
            }

            public final String toString() {
                return "OnReloadRequested";
            }
        }

        /* compiled from: VideoMinimizableDialogAction.kt */
        public static final class e implements j {
            public final VideoSeason a;

            public e(VideoSeason videoSeason) {
                this.a = videoSeason;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OnSeasonSelected(season=" + this.a + ')';
            }
        }

        /* compiled from: VideoMinimizableDialogAction.kt */
        public static final class f implements j {
            public final VideoFile a;

            public f(VideoFile videoFile) {
                this.a = videoFile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return lq.a(new StringBuilder("OnVideoClicked(videoFile="), this.a, ')');
            }
        }

        /* compiled from: VideoMinimizableDialogAction.kt */
        public static final class g implements j {
            public static final g a = new g();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return 351261879;
            }

            public final String toString() {
                return "ShuffleIconClicked";
            }
        }

        /* compiled from: VideoMinimizableDialogAction.kt */
        public static final class h implements j {
            public static final h a = new h();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return 1227709486;
            }

            public final String toString() {
                return "SortIconClicked";
            }
        }
    }
}
