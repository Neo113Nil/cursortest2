package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.YandexNativeAdEntry;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.hint.a;
import com.vk.voip.ui.members.VoipDataProvider;
import com.vk.voip.ui.share.link.pager.view.VoipShareLinkPagerState;
import com.vk.voip.ui.share.link.pager.view.VoipShareLinkPagerView;
import com.vk.voip.ui.share.link.pager.view.c;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.g0x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ijw0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ijw0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                mjw0 mjw0Var = (mjw0) obj2;
                CallMemberId callMemberId = (CallMemberId) ((it80) obj).a;
                if (callMemberId != null) {
                    com.vk.voip.ui.hint.a aVar = mjw0Var.W;
                    aVar.getClass();
                    if (a.EnumC2056a.ScreenShareStarted.h() >= aVar.a()) {
                        com.vk.voip.ui.c.b.getClass();
                        VoipDataProvider voipDataProvider = com.vk.voip.ui.c.d0;
                        if (voipDataProvider == null) {
                            voipDataProvider = null;
                        }
                        io.reactivex.rxjava3.disposables.c e = io.reactivex.rxjava3.kotlin.c.e(voipDataProvider.o(callMemberId.b), new mmm0(callMemberId, 22), new zyl0(aVar, 24));
                        pgn pgnVar = aVar.h;
                        qcy<Object> qcyVar = com.vk.voip.ui.hint.a.m[1];
                        pgnVar.b(e);
                    }
                }
                return s3q0.a;
            case 1:
                int i2 = qqw0.j1;
                ((qqw0) obj2).getFeature().C((nqw0) obj);
                return s3q0.a;
            case 2:
                int i3 = otw0.i1;
                ((otw0) obj2).dismiss();
                return s3q0.a;
            case 3:
                ((j0x0) obj2).T(g0x0.a.c.b.b);
                return s3q0.a;
            case 4:
                VoipShareLinkPagerView voipShareLinkPagerView = (VoipShareLinkPagerView) obj2;
                VoipShareLinkPagerState voipShareLinkPagerState = (VoipShareLinkPagerState) obj;
                TextView textView = voipShareLinkPagerView.d;
                View view = voipShareLinkPagerView.c;
                ArrayList arrayList = voipShareLinkPagerState.b;
                bwt0.p0(view, arrayList.isEmpty());
                voipShareLinkPagerView.b.setItems(arrayList);
                com.vk.voip.ui.share.link.pager.view.c cVar = voipShareLinkPagerState.a;
                if (cVar instanceof c.a) {
                    String str = ((c.a) cVar).a;
                    voipShareLinkPagerView.i = str;
                    textView.setText(str);
                } else {
                    if (!(cVar instanceof c.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c.b bVar = (c.b) cVar;
                    String string = voipShareLinkPagerView.getContext().getString(R.string.voip_share_link_page_with_password_link, bVar.a, bVar.b);
                    voipShareLinkPagerView.i = string;
                    textView.setText(string);
                }
                VoipShareLinkPagerState.TypeControl typeControl = voipShareLinkPagerState.c;
                View view2 = voipShareLinkPagerView.g;
                View view3 = voipShareLinkPagerView.f;
                View view4 = voipShareLinkPagerView.e;
                int i4 = VoipShareLinkPagerView.a.$EnumSwitchMapping$0[typeControl.ordinal()];
                if (i4 == 1) {
                    bwt0.p0(view4, true);
                    bwt0.p0(view3, true);
                    bwt0.p0(view2, false);
                } else if (i4 == 2) {
                    bwt0.p0(view4, true);
                    bwt0.p0(view3, false);
                    bwt0.p0(view2, false);
                } else {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bwt0.p0(view4, false);
                    bwt0.p0(view3, false);
                    bwt0.p0(view2, true);
                }
                return s3q0.a;
            default:
                h5y0.q0(0, 0, 0);
                return ((YandexNativeAdEntry) ((NewsEntry) obj2)).i;
        }
    }

    public /* synthetic */ ijw0(h5y0 h5y0Var, NewsEntry newsEntry) {
        this.b = 5;
        this.c = newsEntry;
    }
}
