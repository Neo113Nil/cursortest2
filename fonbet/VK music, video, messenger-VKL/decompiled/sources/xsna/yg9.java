package xsna;

import com.vk.accountmanager.di.AccountManagerComponent;
import com.vk.camera.clips.impl.di.CameraClipsComponentBase;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.games.di.GamesCatalogComponent;
import com.vk.games.di.GamesCatalogComponentImpl;
import com.vk.nspk.di.NspkSearchBanksFeatureInnerComponent;
import com.vk.superapp.statinteractor.api.di.StatInteractorComponent;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import xsna.vx70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class yg9 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yg9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 6;
        Object obj = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = CameraClipsComponentBase.i;
                return new xyd(((CameraClipsComponentBase) obj).c4());
            case 1:
                return ((k1q) obj).a().compileStatement("SELECT event_name FROM events WHERE event_name=? AND user_id=? AND date>=?");
            case 2:
                GamesCatalogComponentImpl gamesCatalogComponentImpl = (GamesCatalogComponentImpl) obj;
                ewy ewyVar = gamesCatalogComponentImpl.a;
                qcy<Object>[] qcyVarArr2 = GamesCatalogComponentImpl.s;
                qcy<Object> qcyVar = qcyVarArr2[0];
                wct wctVar = (wct) ewyVar.c();
                ewy ewyVar2 = gamesCatalogComponentImpl.b;
                qcy<Object> qcyVar2 = qcyVarArr2[1];
                l9t l9tVar = (l9t) ewyVar2.c();
                ewy ewyVar3 = gamesCatalogComponentImpl.g;
                qcy<Object> qcyVar3 = qcyVarArr2[6];
                return new bdt(wctVar, l9tVar, (het) ewyVar3.c());
            case 3:
                return ((GamesCatalogComponent) ((k7m) m7m.f((qjv) obj)).a(fpf0.a(GamesCatalogComponent.class))).E();
            case 4:
                return ((AccountManagerComponent) ((axw) obj).c().a(fpf0.a(AccountManagerComponent.class))).c();
            case 5:
                return Boolean.valueOf(((i850) ((n850) obj).b.getValue()) != i850.a.getSTUB());
            case 6:
                return ((ClipsConfigViewersComponent) m7m.a(((nx50) obj).b).a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            case 7:
                return Boolean.valueOf(((o260) obj).b.c);
            case 8:
                vx70.a aVar = (vx70.a) ((gzs) obj).invoke();
                return new drj0(aVar, new ho4(aVar, i2));
            case 9:
                return ((StatInteractorComponent) ((ybr0) obj).c().a(fpf0.a(StatInteractorComponent.class))).ie();
            case 10:
                return Boolean.valueOf(((qks0) obj).a);
            case 11:
                return new NspkSearchBanksFeatureInnerComponent.a(((jau0) obj).b);
            default:
                qcy<Object>[] qcyVarArr3 = VoipAnalyticsInternalComponent.b;
                return new htw0((und0) obj);
        }
    }
}
