package xsna;

import android.view.View;
import com.vk.articles.authorpage.ArticleAuthorPageSortType;
import com.vk.core.view.components.context.menu.VkContextMenu;
import xsna.av20;

/* compiled from: ArticleAuthorPageSortHolder.kt */
/* loaded from: classes15.dex */
public final class jn3 implements av20.b<ArticleAuthorPageSortType> {
    public final /* synthetic */ kn3 a;

    public jn3(kn3 kn3Var) {
        this.a = kn3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.av20.b
    public final void a(View view, Object obj, int i, wmg wmgVar) {
        ArticleAuthorPageSortType articleAuthorPageSortType = (ArticleAuthorPageSortType) obj;
        kn3 kn3Var = this.a;
        VkContextMenu vkContextMenu = kn3Var.o;
        if (vkContextMenu != null) {
            vkContextMenu.b();
        }
        Object obj2 = kn3Var.l;
        if (((ln3) (obj2 != null ? obj2 : null)).a != articleAuthorPageSortType) {
            ((ln3) (obj2 != null ? obj2 : null)).a = articleAuthorPageSortType;
            Object obj3 = obj2;
            if (obj2 == null) {
                obj3 = null;
            }
            kn3Var.n.setText(((ln3) obj3).a.h());
            kn3Var.m.invoke(articleAuthorPageSortType);
        }
    }
}
