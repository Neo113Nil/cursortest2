package xsna;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.vk.common.links.LaunchContext;
import com.vk.lists.CustomSwipeRefreshLayout;
import com.vk.voip.ui.history.friends.ui.VoipHistoryFriendsFragment;
import com.vk.voip.ui.history.friends.ui.b;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.gm50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class gf2 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ gf2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
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
                if2 if2Var = (if2) obj5;
                kq2 kq2Var = (kq2) obj4;
                izs izsVar = (izs) obj3;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj2;
                gq2 gq2Var = (gq2) obj;
                nkn0.i(gq2Var, if2Var.c);
                zak0 zak0Var = (zak0) gq2Var.e;
                Object a = if2.a(if2Var, zak0Var.getValue());
                if (!epx.f(a, zak0Var.getValue())) {
                    ((zak0) if2Var.c.c).setValue(a);
                    ((zak0) kq2Var.c).setValue(a);
                    if (izsVar != null) {
                        izsVar.invoke(if2Var);
                    }
                    gq2Var.a();
                    ref$BooleanRef.element = true;
                } else if (izsVar != null) {
                    izsVar.invoke(if2Var);
                }
                break;
            case 1:
                Context context = (Context) obj5;
                yp80 yp80Var = (yp80) obj4;
                Uri uri = (Uri) obj3;
                LaunchContext launchContext = (LaunchContext) obj2;
                String str = (String) obj;
                if (str != null) {
                    com.vk.common.links.b.h(context, str, null, null, null);
                    if (yp80Var != null) {
                        yp80Var.onSuccess();
                    }
                } else {
                    com.vk.common.links.c.O(context, uri, launchContext, yp80Var);
                }
                break;
            default:
                CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) obj5;
                VoipHistoryFriendsFragment voipHistoryFriendsFragment = (VoipHistoryFriendsFragment) obj2;
                int i2 = VoipHistoryFriendsFragment.U;
                bwt0.p0(customSwipeRefreshLayout, true);
                bwt0.p0((View) obj4, false);
                bwt0.p0((View) obj3, false);
                gm50.a.a(voipHistoryFriendsFragment, ((b.a) obj).a, new r5i0(12, voipHistoryFriendsFragment, customSwipeRefreshLayout));
                break;
        }
        return s3q0.a;
    }
}
