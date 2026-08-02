package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.i1b0;
import xsna.wkh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f1b0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ f1b0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.h = obj6;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                final i1b0 i1b0Var = (i1b0) this.c;
                final izs izsVar = (izs) this.d;
                final mtk0 mtk0Var = (mtk0) this.e;
                final mtk0 mtk0Var2 = (mtk0) this.f;
                final mtk0 mtk0Var3 = (mtk0) this.g;
                mtk0 mtk0Var4 = (mtk0) this.h;
                nvy nvyVar = (nvy) obj;
                nvy.g(nvyVar, null, null, new jai(-937628627, new w9a(i1b0Var, 2), true), 3);
                nvy.g(nvyVar, null, null, kji.a, 3);
                nvy.g(nvyVar, null, null, new jai(1251204085, new yzs() { // from class: xsna.h1b0
                    @Override // xsna.yzs
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                        int intValue = ((Integer) obj4).intValue();
                        if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1251204085, intValue, -1, "com.vk.music.bottomsheets.equalizer.PlayerEqualizerSettingsMviView.LandscapeOrientationContent.<anonymous>.<anonymous>.<anonymous> (PlayerEqualizerSettingsMviView.kt:191)");
                            }
                            ytp ytpVar = (ytp) mtk0Var.getValue();
                            List<T> list = ((wow) mtk0Var2.getValue()).b;
                            boolean booleanValue = ((Boolean) mtk0Var3.getValue()).booleanValue();
                            izs izsVar2 = izs.this;
                            boolean J = aVar.J(izsVar2);
                            Object x = aVar.x();
                            a.C0011a.C0012a c0012a = a.C0011a.a;
                            if (J || x == c0012a) {
                                x = new com.vk.movika.tools.controls.seekbar.j(izsVar2, 9);
                                aVar.R(x);
                            }
                            wzs wzsVar = (wzs) x;
                            boolean J2 = aVar.J(izsVar2);
                            Object x2 = aVar.x();
                            if (J2 || x2 == c0012a) {
                                x2 = new gc0(izsVar2, 8);
                                aVar.R(x2);
                            }
                            t5v0.a(ytpVar, list, booleanValue, wzsVar, (gzs) x2, null, i1b0Var.f, aVar, 0, 32);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar.h();
                        }
                        return s3q0.a;
                    }
                }, true), 3);
                nvy.g(nvyVar, null, null, new jai(-622009452, new umo(izsVar, mtk0Var3), true), 3);
                List list = i1b0Var.g;
                wow wowVar = new wow(list);
                nvyVar.e(list.size(), null, new i1b0.e(wowVar), new jai(802480018, new i1b0.f(wowVar, izsVar, mtk0Var4), true));
                return s3q0.a;
            default:
                dym0 dym0Var = (dym0) this.c;
                UserId userId = (UserId) this.d;
                SdkVideoFile sdkVideoFile = (SdkVideoFile) this.e;
                wkh0.b bVar = (wkh0.b) this.f;
                Context context = (Context) this.g;
                rzl0 rzl0Var = (rzl0) this.h;
                io.reactivex.rxjava3.core.q a0 = dym0Var.a.k(userId, (AdminLeaveAction) obj, sdkVideoFile.r(), null).U(new bx80(new snj0(dym0Var, sdkVideoFile, userId), 11)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
                if (!(bVar instanceof wkh0.b.a)) {
                    if (!(bVar instanceof wkh0.b.C3939b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a0 = t7i.a(a0, context, context.getString(fkq0.b(userId) ? R.string.clip_author_unsubscribe_done_group : R.string.clip_author_unsubscribe_done_profile), context.getString(R.string.clip_action_progress));
                }
                a0.subscribe(new cym0(context, rzl0Var));
                return s3q0.a;
        }
    }
}
