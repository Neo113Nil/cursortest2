package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.narratives.Narrative;
import com.vk.games.presentation.utils.HapticHelper;
import com.vk.profile.design.view.cover.SnowballsCoverView;
import com.vk.profile.user.impl.ui.viewdelegates.SnowballsCoverHolder;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.verification.account.VerificationFlow;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import xsna.oap;
import xsna.q2b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class yy0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yy0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        String str;
        switch (this.b) {
            case 0:
                return new uw0(((b11) ((zy0) this.c).a.getValue()).h, (yux) this.d, (qw0) this.e);
            case 1:
                return (q2b.b) ((l7r0) this.c).d((ij20) this.d, (q2b.a) this.e);
            case 2:
                j7h j7hVar = (j7h) this.c;
                String str2 = (String) this.d;
                String str3 = (String) this.e;
                oap<ExtendedCommunityProfile, ? extends Group> oapVar = j7hVar.h;
                if (oapVar == null) {
                    oapVar = null;
                }
                j7hVar.f(oapVar, str2, null, str3);
                return s3q0.a;
            case 3:
                smq.f(((yah) this.c).e, (Context) this.d, (Narrative) this.e, null, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                return s3q0.a;
            case 4:
                View view = (View) this.c;
                yvj yvjVar = (yvj) this.d;
                mc90 mc90Var = (mc90) this.e;
                fdi.D(view, HapticHelper.LIGHT);
                myc0.h(yvjVar, null, null, new q6t(mc90Var, null), 3);
                return s3q0.a;
            case 5:
                ((w8t) this.c).a.invoke(t90.a((s90) this.d, (Integer) this.e));
                return s3q0.a;
            case 6:
                i910 i910Var = (i910) this.c;
                i910Var.g.a.b.d.j(new uu00(i910Var.c, (Good) this.d, (UIBlock) this.e, i910Var.k));
                return s3q0.a;
            case 7:
                SnowballsCoverHolder snowballsCoverHolder = (SnowballsCoverHolder) this.c;
                SnowballsCoverView.a aVar = (SnowballsCoverView.a) this.d;
                Context context = (Context) this.e;
                snowballsCoverHolder.c(SnowballsCoverHolder.SnowballModalEvent.ACTION_BUTTON_CLICK);
                dw20 dw20Var = snowballsCoverHolder.g;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                maz e = xwk.d().e();
                String valueOf = String.valueOf(aVar.c.b);
                d9f0 d9f0Var = snowballsCoverHolder.c;
                String str4 = null;
                String y = (d9f0Var == null || (str = d9f0Var.d.d) == null) ? null : brm0.y(str, "{user_id}", valueOf);
                if (y != null && y.length() != 0) {
                    str4 = y;
                }
                if (str4 == null) {
                    str4 = "https://vk.cc/snowballs";
                }
                maz.c(e, context, str4, LaunchContext.A, null, null, 24);
                return s3q0.a;
            case 8:
                return Boolean.valueOf(((com.vk.core.compose.component.topbar.b) this.c).f((com.vk.core.compose.component.topbar.k) this.d, ((Number) ((mtk0) this.e).getValue()).floatValue()));
            case 9:
                ((xsq0) this.c).m.a((Narrative) this.d, MobileOfficialAppsCoreNavStat$EventScreen.PROFILE).k((FragmentActivity) this.e);
                return s3q0.a;
            case 10:
                wh50 wh50Var = (wh50) this.c;
                ViewGroup viewGroup = (ViewGroup) this.d;
                ComposeView composeView = (ComposeView) this.e;
                wh50Var.setValue(Boolean.FALSE);
                viewGroup.removeView(composeView);
                return s3q0.a;
            case 11:
                peq0 peq0Var = (peq0) this.c;
                ydt0 ydt0Var = (ydt0) this.d;
                Context context2 = (Context) this.e;
                UserId userId = new UserId(peq0Var.c(1));
                ydt0Var.A(context2, (r27 & 2) != 0 ? null : new oap.b(userId), fkq0.d(userId) ? "videos_user" : fkq0.b(userId) ? "videos_group" : "video", (r27 & 8) == 0, (r27 & 16) != 0 ? null : context2.getString(fkq0.d(userId) ? R.string.user_videos : R.string.group_videos), (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? false : false, (r27 & 128) == 0, (r27 & 256) != 0 ? false : false, (r27 & 512) != 0 ? null : Boolean.TRUE, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null);
                return s3q0.a;
            default:
                Context context3 = (Context) this.c;
                jsv0 jsv0Var = (jsv0) this.d;
                return new z03(context3, (htk0) jsv0Var.e.getValue(), jsv0Var.c, new eml(0), (VerificationFlow) this.e);
        }
    }
}
