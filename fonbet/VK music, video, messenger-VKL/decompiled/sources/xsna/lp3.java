package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.articles.ArticleFragment;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.articles.Article;

/* compiled from: ArticlePopupActionsDelegate.kt */
/* loaded from: classes15.dex */
public final class lp3 {
    public final FragmentActivity a;
    public final boolean b;
    public final defpackage.i c;
    public final defpackage.j d;
    public final defpackage.k e;
    public final b f;
    public VkContextMenu g;

    /* compiled from: ArticlePopupActionsDelegate.kt */
    public static abstract class a {
        public final int a;
        public final int b;

        /* compiled from: ArticlePopupActionsDelegate.kt */
        /* renamed from: xsna.lp3$a$a, reason: collision with other inner class name */
        public static final class C3282a extends a {
        }

        /* compiled from: ArticlePopupActionsDelegate.kt */
        public static final class b extends a {
        }

        /* compiled from: ArticlePopupActionsDelegate.kt */
        public static final class c extends a {
        }

        /* compiled from: ArticlePopupActionsDelegate.kt */
        public static final class d extends a {
        }

        /* compiled from: ArticlePopupActionsDelegate.kt */
        public static final class e extends a {
        }

        /* compiled from: ArticlePopupActionsDelegate.kt */
        public static final class f extends a {
        }

        /* compiled from: ArticlePopupActionsDelegate.kt */
        public static final class g extends a {
        }

        /* compiled from: ArticlePopupActionsDelegate.kt */
        public static final class h extends a {
        }

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* compiled from: ArticlePopupActionsDelegate.kt */
    public interface b {
        void a();

        void b(String str);

        void c();

        void d();

        void e();
    }

    public lp3(FragmentActivity fragmentActivity, boolean z, defpackage.i iVar, defpackage.j jVar, defpackage.k kVar, b bVar) {
        this.a = fragmentActivity;
        this.b = z;
        this.c = iVar;
        this.d = jVar;
        this.e = kVar;
        this.f = bVar;
    }

    public final Article a() {
        return ((ArticleFragment) this.c.c).T;
    }
}
