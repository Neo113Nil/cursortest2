package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import androidx.work.Data;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tips.Tooltip;
import com.vk.core.tips.c;
import com.vk.dto.common.VideoFile;
import com.vk.newsfeed.api.posting.viewpresenter.PreviewRatio;
import com.vk.profile.design.compose.buttons.ProfileButtons;
import com.vkontakte.android.R;
import java.util.Objects;
import java.util.UUID;
import xsna.skm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h24 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h24(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                fxc0.B().Y().z((Context) this.c, (VideoFile) this.d, (dz20) this.e);
                return s3q0.a;
            case 1:
                qcc0 qcc0Var = (qcc0) this.c;
                eye0 eye0Var = (eye0) this.d;
                PreviewRatio previewRatio = (PreviewRatio) this.e;
                qcc0Var.getClass();
                Context context = eye0Var.getContext();
                ry3 ry3Var = new ry3(qcc0Var, context, previewRatio, 7);
                Tooltip.l(new Tooltip(context, null, null, Tooltip.WindowStyle.DEFAULT_FLOATING, null, null, null, dhr0.t.c(R.attr.vk_ui_background_modal), 0, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 80, 0, false, null, 0, false, ry3Var, null, new c.d(iah0.b(10.0f)), null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Integer.valueOf(iah0.a(246)), null, false, iah0.a(6), null, null, null, null, -1175062672, 15), context, new RectF(bwt0.C(eye0Var)), false, false, false, false, 236);
                return s3q0.a;
            case 2:
                ((izs) this.c).invoke(new ProfileButtons.b((ProfileButtons.ButtonType) this.d, (zhf0) ((wh50) this.e).getValue()));
                return s3q0.a;
            case 3:
                Activity activity = (Activity) this.c;
                s6s0 s6s0Var = (s6s0) this.d;
                y6s0 y6s0Var = (y6s0) this.e;
                fxc0.B().g0(activity, s6s0Var.a, s6s0Var.d, new j4(22, y6s0Var, s6s0Var), new ml1(26, y6s0Var, s6s0Var));
                return s3q0.a;
            case 4:
                bp50 bp50Var = (bp50) this.c;
                b520 b520Var = (b520) this.d;
                skm0.a aVar = (skm0.a) this.e;
                bp50Var.d(b520Var);
                aVar.O0();
                return s3q0.a;
            default:
                twx0 twx0Var = (twx0) this.c;
                UUID uuid = (UUID) this.d;
                Data data = (Data) this.e;
                String uuid2 = uuid.toString();
                m100 c = m100.c();
                uuid.toString();
                Objects.toString(data);
                c.getClass();
                WorkDatabase workDatabase = twx0Var.a;
                workDatabase.c();
                try {
                    fxx0 j = workDatabase.D().j(uuid2);
                    if (j == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (j.b == WorkInfo.State.RUNNING) {
                        workDatabase.C().a(new nwx0(uuid2, data));
                    } else {
                        m100.c().getClass();
                    }
                    workDatabase.w();
                    workDatabase.q();
                    return null;
                } finally {
                }
        }
    }
}
