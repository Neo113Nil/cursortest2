package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.dto.common.VideoFile;
import com.vk.lists.CustomSwipeRefreshLayout;
import com.vk.profile.design.compose.header.sink.AuthorHeaderEvent;
import com.vk.voip.ui.history.friends.ui.VoipHistoryFriendsFragment;
import com.vk.voip.ui.history.friends.ui.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.gm50;
import xsna.kja0;
import xsna.t2e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class p2e implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ p2e(View view, CustomSwipeRefreshLayout customSwipeRefreshLayout, View view2, VoipHistoryFriendsFragment voipHistoryFriendsFragment, TextView textView) {
        this.b = 2;
        this.e = view;
        this.c = customSwipeRefreshLayout;
        this.d = view2;
        this.f = voipHistoryFriendsFragment;
        this.g = textView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        AuthorHeaderEvent.a dVar;
        int i = this.b;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.e;
        switch (i) {
            case 0:
                q2e.e((zlq) obj5, (q2e) obj4, (View) obj6, (VideoFile) obj3, (za) obj2, new t2e.a(EmptyList.b));
                return s3q0.a;
            case 1:
                lja0 lja0Var = (lja0) obj5;
                dmb0 dmb0Var = (dmb0) obj4;
                izs izsVar = (izs) obj6;
                kja0 kja0Var = (kja0) obj3;
                wh50 wh50Var = (wh50) obj2;
                long j = ((ov70) obj).a;
                int i2 = (int) (j & 4294967295L);
                if (Float.intBitsToFloat(i2) < lja0Var.a || Float.intBitsToFloat(i2) > ((int) (4294967295L & dmb0Var.a())) - lja0Var.b) {
                    return s3q0.a;
                }
                float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                int a = (int) (dmb0Var.a() >> 32);
                zhf0 zhf0Var = (zhf0) wh50Var.getValue();
                float f = a;
                float f2 = 0.25f * f;
                float f3 = f * 0.75f;
                if (intBitsToFloat < f2) {
                    dVar = new AuthorHeaderEvent.a.c.C1665c(zhf0Var);
                } else if (intBitsToFloat > f3) {
                    dVar = new AuthorHeaderEvent.a.c.e(zhf0Var);
                } else if (epx.f(kja0Var, kja0.a.a)) {
                    dVar = new AuthorHeaderEvent.a.c.C1664a(zhf0Var);
                } else if (epx.f(kja0Var, kja0.b.a)) {
                    dVar = new AuthorHeaderEvent.a.c.b(zhf0Var);
                } else {
                    if (!epx.f(kja0Var, kja0.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar = new AuthorHeaderEvent.a.c.d(zhf0Var);
                }
                izsVar.invoke(dVar);
                return s3q0.a;
            default:
                VoipHistoryFriendsFragment voipHistoryFriendsFragment = (VoipHistoryFriendsFragment) obj3;
                int i3 = VoipHistoryFriendsFragment.U;
                bwt0.p0((View) obj6, true);
                bwt0.p0((CustomSwipeRefreshLayout) obj5, false);
                bwt0.p0((View) obj4, false);
                gm50.a.a(voipHistoryFriendsFragment, ((b.C2060b) obj).a, new npw0(0, (TextView) obj2, voipHistoryFriendsFragment));
                return s3q0.a;
        }
    }

    public /* synthetic */ p2e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }
}
