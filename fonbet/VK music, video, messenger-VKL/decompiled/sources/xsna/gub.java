package xsna;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.vk.common.links.LinksParserData;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.live.LiveEventModel;
import com.vk.dto.user.ObsceneTextFilter;
import xsna.uij0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class gub implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ gub(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                LiveEventModel liveEventModel = (LiveEventModel) obj;
                liveEventModel.n = str;
                ucp ucpVar = ucp.a;
                liveEventModel.q = ucp.i(xwk.d().a().m(str));
                return liveEventModel;
            default:
                View view = (View) obj;
                if (view instanceof VkText) {
                    sdz a = xwk.d().a();
                    uij0.a aVar = uij0.a.a;
                    ObsceneTextFilter obsceneTextFilter = ObsceneTextFilter.UNAVAILABLE;
                    LinksParserData.HashtagService hashtagService = LinksParserData.HashtagService.Posts;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a.o(str, new LinksParserData(2827, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, obsceneTextFilter == ObsceneTextFilter.ENABLED, 8188), new vdz(0)));
                    ucp ucpVar2 = ucp.a;
                    ucp.i(spannableStringBuilder);
                    ((VkText) view).setText(spannableStringBuilder);
                }
                return s3q0.a;
        }
    }
}
