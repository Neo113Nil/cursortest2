package xsna;

import android.view.View;
import com.vk.newsfeed.api.data.NewsComment;

/* compiled from: CommentViewAction.kt */
/* loaded from: classes3.dex */
public abstract class rdg {

    /* compiled from: CommentViewAction.kt */
    public static final class a extends rdg {
        public final View a;
        public final NewsComment b;
        public final aa c;

        public a(View view, NewsComment newsComment, aa aaVar) {
            this.a = view;
            this.b = newsComment;
            this.c = aaVar;
        }
    }

    /* compiled from: CommentViewAction.kt */
    public static final class b extends rdg {
        public final NewsComment a;
        public final aa b;

        public b(NewsComment newsComment, aa aaVar) {
            this.a = newsComment;
            this.b = aaVar;
        }
    }

    /* compiled from: CommentViewAction.kt */
    public static final class c extends rdg {
        public static final c a = new c();
    }

    /* compiled from: CommentViewAction.kt */
    public static final class d extends rdg {
        public final aa a;

        public d(aa aaVar) {
            this.a = aaVar;
        }
    }

    /* compiled from: CommentViewAction.kt */
    public static final class e extends rdg {
        public final View a;

        public e(View view) {
            this.a = view;
        }
    }

    /* compiled from: CommentViewAction.kt */
    public static final class f extends rdg {
        public final View a;

        public f(View view) {
            this.a = view;
        }
    }
}
