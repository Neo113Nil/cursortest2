package defpackage;

import com.yandex.go.sql.BaseDatabaseHelper;
import com.yandex.mob.api.model.MobContourAvailabilityCheckStrategyName;
import com.yandex.mob.api.model.MobPingPolicy;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executors;
import ru.yandex.taxi.plus.api.dto.state.plaque.MicroWidgetDto;
import ru.yandex.taxi.plus.api.dto.state.plaque.MicroWidgetPlaqueDto;
import ru.yandex.taxi.plus.api.dto.state.plaque.a0;
import ru.yandex.taxi.plus.api.dto.state.plaque.d0;
import ru.yandex.taxi.plus.api.dto.state.plaque.e0;
import ru.yandex.taxi.plus.api.dto.state.plaque.g;
import ru.yandex.taxi.plus.api.dto.state.plaque.o;
import ru.yandex.taxi.plus.api.dto.state.plaque.x;

/* loaded from: classes6.dex */
public final /* synthetic */ class g320 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ g320(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return h320.d();
            case 1:
                return i320.d();
            case 2:
                return j320.d();
            case 3:
                return l320.d();
            case 4:
                return m320.d();
            case 5:
                return n320.d();
            case 6:
                return o320.d();
            case 7:
                return p320.d();
            case 8:
                return q320.d();
            case 9:
                af20 af20Var = df20.Companion;
                return new p53(auu0.a, 0);
            case 10:
                af20 af20Var2 = df20.Companion;
                return new p53(auu0.a, 0);
            case 11:
                af20 af20Var3 = df20.Companion;
                return new p53(auu0.a, 0);
            case 12:
                af20 af20Var4 = df20.Companion;
                return new p53(bf20.a, 0);
            case 13:
                af20 af20Var5 = df20.Companion;
                return new p53(bf20.a, 0);
            case 14:
                af20 af20Var6 = df20.Companion;
                return new p53(auu0.a, 0);
            case 15:
                af20 af20Var7 = df20.Companion;
                return new p53(auu0.a, 0);
            case 16:
                ef20 ef20Var = MicroWidgetDto.Companion;
                return MicroWidgetDto.Type.Companion.serializer();
            case 17:
                ef20 ef20Var2 = MicroWidgetDto.Companion;
                return new p53(auu0.a, 0);
            case 18:
                o oVar = MicroWidgetDto.c.Companion;
                return new p53(auu0.a, 0);
            case 19:
                return vez0.g("ru.yandex.taxi.plus.api.dto.state.plaque.MicroWidgetDto.Type", MicroWidgetDto.Type.values(), new String[]{BaseDatabaseHelper.TYPE_TEXT, "SPACER", "BUTTON", "ICON", "SWITCH", "BALANCE"}, new Annotation[][]{null, null, null, null, null, null});
            case 20:
                ff20 ff20Var = x.Companion;
                return new p53(auu0.a, 0);
            case 21:
                fg20 fg20Var = MicroWidgetPlaqueDto.Companion;
                return new p53(auu0.a, 0);
            case 22:
                fg20 fg20Var2 = MicroWidgetPlaqueDto.Companion;
                return new p53(ha20.a, 0);
            case 23:
                a0 a0Var = MicroWidgetPlaqueDto.IconInCornerDto.Companion;
                return MicroWidgetPlaqueDto.IconInCornerDto.Position.Companion.serializer();
            case 24:
                return vez0.g("ru.yandex.taxi.plus.api.dto.state.plaque.MicroWidgetPlaqueDto.IconInCornerDto.Position", MicroWidgetPlaqueDto.IconInCornerDto.Position.values(), new String[]{"LEFT_TOP", "RIGHT_TOP"}, new Annotation[][]{null, null});
            case 25:
                d0 d0Var = e0.a.Companion;
                return new p53(g.a, 0);
            case 26:
                return Executors.newSingleThreadExecutor();
            case 27:
                return Executors.newSingleThreadExecutor();
            case 28:
                rl20 rl20Var = sl20.Companion;
                return MobPingPolicy.Companion.serializer();
            default:
                cn20 cn20Var = dn20.Companion;
                return MobContourAvailabilityCheckStrategyName.Companion.serializer();
        }
    }
}
