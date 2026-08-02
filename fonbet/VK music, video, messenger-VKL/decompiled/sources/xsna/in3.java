package xsna;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.articles.authorpage.ArticleAuthorPageSortType;
import com.vkontakte.android.R;

/* compiled from: ArticleAuthorPageSortHolder.kt */
/* loaded from: classes15.dex */
public final class in3 extends s770 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ in3(Object obj, int i) {
        this.c = i;
        this.d = obj;
    }

    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        switch (this.c) {
            case 0:
                ArticleAuthorPageSortType articleAuthorPageSortType = (ArticleAuthorPageSortType) obj;
                TextView textView = (TextView) hkpVar.f(R.id.title);
                View f = hkpVar.f(R.id.selected_icon);
                textView.setText(articleAuthorPageSortType.h());
                Object obj2 = ((kn3) this.d).l;
                if (obj2 == null) {
                    obj2 = null;
                }
                f.setVisibility(articleAuthorPageSortType == ((ln3) obj2).a ? 0 : 4);
                break;
            default:
                ((TextView) hkpVar.f(R.id.action_text)).setText(((e520) obj).a((Activity) this.d));
                break;
        }
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        switch (this.c) {
            case 0:
                hkp hkpVar = new hkp(7);
                hkpVar.d(view.findViewById(R.id.title));
                hkpVar.d(view.findViewById(R.id.selected_icon));
                return hkpVar;
            default:
                hkp hkpVar2 = new hkp(7);
                hkpVar2.d(view.findViewById(R.id.action_text));
                View findViewById = view.findViewById(R.id.action_icon);
                ImageView imageView = (ImageView) findViewById;
                imageView.setColorFilter(dhr0.t.c(R.attr.vk_ui_action_sheet_text));
                f4m.j(imageView);
                hkpVar2.d(findViewById);
                return hkpVar2;
        }
    }
}
