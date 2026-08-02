package xsna;

import androidx.car.app.hardware.common.CarZone;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsCatalogBaseActionDto;
import com.vk.api.generated.apps.dto.AppsGamesCatalogDto;
import com.vk.api.generated.apps.dto.AppsGetAndroidGamesCatalogScreenDto;
import com.vk.api.generated.apps.dto.AppsGetGamesCatalogScreenDto;
import com.vk.api.generated.apps.dto.AppsMiniappsAchievementsModalInfoDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogPwaModalInfoDto;
import com.vk.api.generated.apps.dto.AppsMiniappsGiftIconDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.games.model.GamesCatalogActionType;
import com.vk.games.model.GamesCatalogScreenTab;
import com.vk.games.model.GamesCatalogSection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.bdt;
import xsna.ldt;

/* compiled from: GamesCatalogRepositoryImpl.kt */
@b6l(c = "com.vk.games.data.repository.GamesCatalogRepositoryImpl$loadCatalog$2", f = "GamesCatalogRepositoryImpl.kt", l = {CarZone.CAR_ZONE_COLUMN_DRIVER}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class odt extends SuspendLambda implements wzs<yvj, spj<? super adt>, Object> {
    final /* synthetic */ int $count;
    final /* synthetic */ boolean $isCatalogCachingEnabled;
    final /* synthetic */ int $offset;
    final /* synthetic */ GamesCatalogScreenTab $tab;
    int label;
    final /* synthetic */ ldt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odt(ldt ldtVar, GamesCatalogScreenTab gamesCatalogScreenTab, int i, int i2, boolean z, spj<? super odt> spjVar) {
        super(2, spjVar);
        this.this$0 = ldtVar;
        this.$tab = gamesCatalogScreenTab;
        this.$count = i;
        this.$offset = i2;
        this.$isCatalogCachingEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new odt(this.this$0, this.$tab, this.$count, this.$offset, this.$isCatalogCachingEnabled, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super adt> spjVar) {
        return ((odt) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AppsGetGamesCatalogScreenDto appsGetGamesCatalogScreenDto;
        ufx ufxVar;
        Object p;
        AppsGetAndroidGamesCatalogScreenDto appsGetAndroidGamesCatalogScreenDto;
        i9t i9tVar;
        AppsMiniappsGiftIconDto f;
        GamesCatalogActionType gamesCatalogActionType;
        ?? singletonList;
        i9t i9tVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (((Boolean) this.this$0.g.getValue()).booleanValue()) {
                ldt ldtVar = this.this$0;
                GamesCatalogScreenTab gamesCatalogScreenTab = this.$tab;
                ldtVar.getClass();
                int i2 = ldt.a.$EnumSwitchMapping$0[gamesCatalogScreenTab.ordinal()];
                if (i2 == 1) {
                    appsGetAndroidGamesCatalogScreenDto = AppsGetAndroidGamesCatalogScreenDto.MAIN_TAB;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    appsGetAndroidGamesCatalogScreenDto = AppsGetAndroidGamesCatalogScreenDto.CATALOG_TAB;
                }
                Integer num = new Integer(this.$count);
                Integer num2 = new Integer(this.$offset);
                ufxVar = new ufx("apps.getAndroidGamesCatalog", new io.reactivex.rxjava3.internal.operators.mixed.k(2), new io.reactivex.rxjava3.internal.operators.mixed.n(2));
                ufx.k(ufxVar, "count", num.intValue(), 0, 8);
                ufx.k(ufxVar, SignalingProtocol.KEY_OFFSET, num2.intValue(), 0, 8);
                if (appsGetAndroidGamesCatalogScreenDto != null) {
                    ufx.n(ufxVar, "screen", appsGetAndroidGamesCatalogScreenDto.i(), 0, 12);
                }
            } else {
                ldt ldtVar2 = this.this$0;
                GamesCatalogScreenTab gamesCatalogScreenTab2 = this.$tab;
                ldtVar2.getClass();
                int i3 = ldt.a.$EnumSwitchMapping$0[gamesCatalogScreenTab2.ordinal()];
                if (i3 == 1) {
                    appsGetGamesCatalogScreenDto = AppsGetGamesCatalogScreenDto.MAIN_TAB;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    appsGetGamesCatalogScreenDto = AppsGetGamesCatalogScreenDto.CATALOG_TAB;
                }
                Integer num3 = new Integer(this.$count);
                Integer num4 = new Integer(this.$offset);
                ufx ufxVar2 = new ufx("apps.getGamesCatalog", new io.reactivex.rxjava3.subjects.b(3), new io.reactivex.rxjava3.subjects.c(4));
                ufx.k(ufxVar2, "count", num3.intValue(), 0, 8);
                ufx.k(ufxVar2, SignalingProtocol.KEY_OFFSET, num4.intValue(), 0, 8);
                if (appsGetGamesCatalogScreenDto != null) {
                    ufx.n(ufxVar2, "screen", appsGetGamesCatalogScreenDto.i(), 0, 12);
                }
                ufxVar = ufxVar2;
            }
            iz2 A = yfb.A(ufxVar);
            this.label = 1;
            p = evj.p(A, this);
            if (p == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            p = obj;
        }
        AppsGamesCatalogDto appsGamesCatalogDto = (AppsGamesCatalogDto) p;
        List<AppsAppDto> e = appsGamesCatalogDto.e();
        ldt ldtVar3 = this.this$0;
        ArrayList arrayList = new ArrayList(c5g.u(e, 10));
        for (AppsAppDto appsAppDto : e) {
            ldtVar3.d.getClass();
            arrayList.add(ykg.c(appsAppDto));
        }
        this.this$0.b.a(arrayList);
        this.this$0.b.c(appsGamesCatalogDto.j());
        bdt bdtVar = this.this$0.a;
        wct wctVar = bdtVar.a;
        AppsMiniappsCatalogPwaModalInfoDto k = appsGamesCatalogDto.k();
        wctVar.getClass();
        zbt zbtVar = null;
        tct tctVar = k != null ? new tct(k.getTitle(), k.getDescription(), k.getUrl(), k.e(), k.d()) : null;
        if (uca.a()) {
            l9t l9tVar = bdtVar.b;
            AppsMiniappsAchievementsModalInfoDto d = appsGamesCatalogDto.d();
            l9tVar.getClass();
            if (d != null) {
                List<BaseImageDto> e2 = d.e();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : e2) {
                    if (((BaseImageDto) obj2).d() != BaseImageDto.ThemeDto.DARK) {
                        arrayList2.add(obj2);
                    }
                }
                List<BaseImageDto> e3 = d.e();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : e3) {
                    if (((BaseImageDto) obj3).d() == BaseImageDto.ThemeDto.DARK) {
                        arrayList3.add(obj3);
                    }
                }
                i9tVar2 = new i9t(d.getTitle(), d.i(), d.d(), new wpo0(!arrayList2.isEmpty() ? l9t.a(arrayList2) : null, !arrayList3.isEmpty() ? l9t.a(arrayList3) : null), d.g(), d.f());
            } else {
                i9tVar2 = null;
            }
            i9tVar = i9tVar2;
        } else {
            i9tVar = null;
        }
        het hetVar = bdtVar.c;
        List<AppsMiniappsCatalogItemDto> i4 = appsGamesCatalogDto.i();
        hetVar.getClass();
        o1e o1eVar = new o1e(hetVar, 27);
        ArrayList arrayList4 = new ArrayList();
        Iterator it = i4.iterator();
        while (it.hasNext()) {
            Object invoke = o1eVar.invoke((AppsMiniappsCatalogItemDto) it.next());
            if (invoke instanceof Iterable) {
                singletonList = new ArrayList();
                for (Object obj4 : (Iterable) invoke) {
                    if (obj4 instanceof GamesCatalogSection) {
                        singletonList.add(obj4);
                    }
                }
            } else {
                singletonList = invoke instanceof GamesCatalogSection ? Collections.singletonList(invoke) : EmptyList.b;
            }
            g5g.y((Iterable) singletonList, arrayList4);
        }
        Boolean g = appsGamesCatalogDto.g();
        boolean booleanValue = g != null ? g.booleanValue() : false;
        int size = appsGamesCatalogDto.i().size();
        int count = appsGamesCatalogDto.getCount();
        if (uca.a() && (f = appsGamesCatalogDto.f()) != null) {
            boolean e4 = f.e();
            AppsCatalogBaseActionDto d2 = f.d();
            int i5 = bdt.a.$EnumSwitchMapping$0[d2.e().ordinal()];
            if (i5 == 1) {
                gamesCatalogActionType = GamesCatalogActionType.OPEN_URL;
            } else if (i5 == 2) {
                gamesCatalogActionType = GamesCatalogActionType.OPEN_MINI_APP;
            } else if (i5 == 3) {
                gamesCatalogActionType = GamesCatalogActionType.OPEN_GAME;
            } else {
                if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                gamesCatalogActionType = GamesCatalogActionType.OPEN_ACHIEVEMENT_MODAL;
            }
            zbtVar = new zbt(e4, new izt(gamesCatalogActionType, d2.getUrl()), f.f());
        }
        adt adtVar = new adt(tctVar, i9tVar, arrayList4, count, size, booleanValue, zbtVar);
        if (this.$offset == 0 && this.$isCatalogCachingEnabled) {
            cct cctVar = this.this$0.b;
            GamesCatalogScreenTab gamesCatalogScreenTab3 = this.$tab;
            ey8 ey8Var = new ey8(size, count, arrayList4, booleanValue);
            cctVar.getClass();
            try {
                cctVar.d.put(gamesCatalogScreenTab3, ey8Var);
            } catch (Throwable unused) {
            }
        }
        return adtVar;
    }
}
