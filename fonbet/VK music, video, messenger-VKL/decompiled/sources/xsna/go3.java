package xsna;

import android.content.Context;
import android.view.View;
import com.facebook.soloader.MinElf;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetTemplateExtendedResponseDto;
import com.vk.articles.ArticleFragment;
import com.vk.clips.editor.templates.impl.domain.ClipsVideoTemplateEditorInputModel;
import com.vk.clips.editor.templates.impl.views.main.ClipsTemplateEditorFragment;
import com.vk.dto.articles.Article;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.clips.ClipAudioTemplate;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import java.util.List;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.o0r0;
import xsna.qs80;
import xsna.t8a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class go3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ go3(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ArticleFragment articleFragment = (ArticleFragment) obj4;
                Article article = (Article) obj3;
                defpackage.r rVar = (defpackage.r) obj2;
                int i2 = ArticleFragment.E0;
                ((Owner) obj5).g(4, true);
                com.vk.articles.a aVar = articleFragment.m0;
                if (aVar != null) {
                    JSONObject jSONObject = new JSONObject();
                    Article article2 = articleFragment.T;
                    jSONObject.put("ownerId", article2 != null ? article2.c : null);
                    jSONObject.put("isSubscribed", true);
                    s3q0 s3q0Var = s3q0.a;
                    aVar.f("articleOwnerSubscribed", jSONObject);
                }
                if (!articleFragment.mo(article)) {
                    break;
                } else {
                    rVar.invoke();
                    break;
                }
            case 1:
                t8a t8aVar = (t8a) obj4;
                Context context = (Context) obj3;
                UserId userId = (UserId) obj2;
                qs80 qs80Var = (qs80) obj;
                ((t8a.a) obj5).d.invoke(qs80Var);
                if (qs80Var instanceof qs80.a) {
                    t8aVar.c.m(context, userId, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                }
                t8aVar.e = null;
                break;
            default:
                a9f a9fVar = (a9f) obj4;
                Pair pair = (Pair) obj;
                ClipVideoFile clipVideoFile = (ClipVideoFile) pair.d();
                List list = (List) pair.g();
                String str = ((ClipAudioTemplate) obj5).b;
                ClipsTemplateEditorFragment.a aVar2 = new ClipsTemplateEditorFragment.a();
                aVar2.y(new ClipsVideoTemplateEditorInputModel(str, clipVideoFile, (ShortVideoGetTemplateExtendedResponseDto) obj2, list, null, a9fVar.a));
                aVar2.s(true);
                aVar2.t();
                dhr0.a.getClass();
                aVar2.w(dhr0.u().c);
                aVar2.k(((View) obj3).getContext());
                a9fVar.b = null;
                break;
        }
        return s3q0.a;
    }
}
