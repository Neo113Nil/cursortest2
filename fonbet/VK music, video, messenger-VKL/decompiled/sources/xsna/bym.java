package xsna;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.vk.catalog2.common.ui.mvp.holder.sticker.StickerTopBarBonusBalanceVh;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.DigestItem;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.photo.editor.views.ToolButton;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchVideoRootVh;
import com.vkontakte.android.data.b;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.Lazy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class bym implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bym(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Digest q6;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                cym cymVar = (cym) obj2;
                mym mymVar = (mym) obj;
                jn4 jn4Var = cymVar.c;
                if (jn4Var != null) {
                    Post post = ((DigestItem) cymVar.b.get(mymVar.d)).g;
                    dym dymVar = (dym) jn4Var.b;
                    Lazy lazy = dymVar.C;
                    if (!jjc.b() && (q6 = dymVar.q6()) != null) {
                        String str = q6.j;
                        if (str == null || str.length() == 0) {
                            NewsfeedRouter.E((NewsfeedRouter) lazy.getValue(), dymVar.itemView.getContext(), post, null, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        } else {
                            Digest q62 = dymVar.q6();
                            if (q62 != null) {
                                NewsfeedRouter newsfeedRouter = (NewsfeedRouter) lazy.getValue();
                                Context context = dymVar.itemView.getContext();
                                ArrayList arrayList = q62.q;
                                String str2 = dymVar.u;
                                Digest.Header header = q62.k;
                                newsfeedRouter.q(context, str, arrayList, header != null ? header.c : "", post.Ab(), str2);
                            }
                        }
                        b.d dVar = new b.d("digest_post_open");
                        dVar.b(q6.o, "track_code");
                        dVar.b(post.Bb(), "post_id");
                        dVar.e();
                        break;
                    }
                }
                break;
            case 1:
                com.vk.inappreview.impl.fake.a aVar = (com.vk.inappreview.impl.fake.a) obj2;
                aVar.An(true);
                ((View) obj).removeCallbacks(new vb(aVar.z, 7));
                aVar.dismiss();
                break;
            case 2:
                ((wet0) obj2).d(((GlobalSearchVideoRootVh) obj).b);
                break;
            case 3:
                wfy wfyVar = (wfy) obj;
                y4l0 y4l0Var = ((vfy) obj2).l;
                if (y4l0Var != null) {
                    y4l0Var.h(wfyVar.d, wfyVar.f);
                    break;
                }
                break;
            case 4:
                StickerTopBarBonusBalanceVh stickerTopBarBonusBalanceVh = (StickerTopBarBonusBalanceVh) obj;
                g2v.d().a().b(((TextView) obj2).getRootView().getContext(), stickerTopBarBonusBalanceVh.c, stickerTopBarBonusBalanceVh.d);
                break;
            default:
                izs izsVar = (izs) obj2;
                ToolButton toolButton = (ToolButton) obj;
                int i2 = ToolButton.h;
                if (izsVar != null) {
                    izsVar.invoke(toolButton);
                    break;
                }
                break;
        }
    }
}
