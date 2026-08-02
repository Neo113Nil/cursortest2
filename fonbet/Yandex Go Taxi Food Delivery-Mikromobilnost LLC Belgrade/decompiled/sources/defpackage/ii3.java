package defpackage;

import android.content.Context;
import com.yandex.go.captcha.AuthChallengeExplainModalView;
import com.yandex.go.captcha.e;
import com.yandex.go.navigation.modals.coroutines.a;
import com.yandex.go.tips.ui.error.TipsErrorModalView;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.scooters.presentation.finish_info.input.ScootersFinishInfoInputModalView;

/* loaded from: classes12.dex */
public final class ii3 extends a {
    public final /* synthetic */ int F;
    public final w030 G;
    public final boolean H;
    public final Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ii3(w030 w030Var, Object obj, int i) {
        super(null);
        this.F = i;
        this.G = w030Var;
        this.I = obj;
        this.H = true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        switch (this.F) {
        }
        return this.G;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        switch (this.F) {
        }
        return this.H;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        int i = this.F;
        Object obj2 = this.I;
        switch (i) {
            case 0:
                final int i2 = 0;
                sls slsVar = new sls(this) { // from class: hi3
                    public final /* synthetic */ ii3 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i3 = i2;
                        zy11 zy11Var = zy11.a;
                        ii3 ii3Var = this.b;
                        switch (i3) {
                            case 0:
                                ii3Var.r(new f22(27));
                                break;
                            default:
                                ii3Var.r(new e());
                                break;
                        }
                        return zy11Var;
                    }
                };
                final int i3 = 1;
                sls slsVar2 = new sls(this) { // from class: hi3
                    public final /* synthetic */ ii3 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i32 = i3;
                        zy11 zy11Var = zy11.a;
                        ii3 ii3Var = this.b;
                        switch (i32) {
                            case 0:
                                ii3Var.r(new f22(27));
                                break;
                            default:
                                ii3Var.r(new e());
                                break;
                        }
                        return zy11Var;
                    }
                };
                return new AuthChallengeExplainModalView((Context) ((fi3) obj2).a.a.get(), slsVar, slsVar2, (ki3) obj);
            case 1:
                iin0 iin0Var = new iin0(3, this);
                return new ScootersFinishInfoInputModalView((Context) ((omn0) obj2).a.a.get(), (String) obj, iin0Var);
            default:
                return new TipsErrorModalView((Context) ((tfz0) obj2).a.a.get(), new n2v0(19, this));
        }
    }
}
