package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.articles.ArticleFragment;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.photo.Photo;
import com.vk.fave.entities.FaveEntry;
import com.vk.photos.root.photoflow.presentation.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class zn3 implements bd70 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zn3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        int i3 = this.b;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                ArticleFragment articleFragment = (ArticleFragment) obj2;
                int i4 = ArticleFragment.E0;
                gmq gmqVar = ((FaveEntry) obj).i.f;
                if (i == 117 && (gmqVar instanceof ArticleAttachment)) {
                    ArticleAttachment articleAttachment = (ArticleAttachment) gmqVar;
                    if (epx.f(articleFragment.T, articleAttachment.f)) {
                        Article article = articleFragment.T;
                        if (article != null) {
                            article.n = articleAttachment.f.n;
                        }
                        FragmentActivity activity = articleFragment.getActivity();
                        if (activity != null) {
                            articleFragment.xo(activity);
                        }
                        Article article2 = articleFragment.T;
                        if (article2 != null) {
                            articleFragment.po(article2);
                            break;
                        }
                    }
                }
                break;
            default:
                com.vk.photos.root.photoflow.presentation.b bVar = (com.vk.photos.root.photoflow.presentation.b) obj2;
                Photo photo = (Photo) obj;
                if (i == 130) {
                    bVar.C(new a.t(photo, true));
                    break;
                } else if (i == 131) {
                    bVar.C(new a.t(photo, false));
                    break;
                }
                break;
        }
    }
}
