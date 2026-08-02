package com.yandex.go.settings.domain;

import android.content.Context;
import com.yandex.go.settings.presentation.models.AppSettingsTransitionMode;
import com.yandex.go.settings.presentation.models.SettingsItemId;
import defpackage.avj0;
import defpackage.ceb1;
import defpackage.cne0;
import defpackage.gja1;
import defpackage.i5z;
import defpackage.j5z;
import defpackage.jgb1;
import defpackage.keb1;
import defpackage.kyh0;
import defpackage.lx2;
import defpackage.mvg;
import defpackage.mx2;
import defpackage.ny61;
import defpackage.o8z;
import defpackage.pkb1;
import defpackage.qqt0;
import defpackage.scc;
import defpackage.t8r0;
import defpackage.u8r0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.y7z;
import defpackage.yri0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lmx2;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.settings.domain.SettingsUiStateInteractor$uiStateFlow$2", f = "SettingsUiStateInteractor.kt", l = {74}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SettingsUiStateInteractor$uiStateFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ lx2 $metadata;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsUiStateInteractor$uiStateFlow$2(b bVar, lx2 lx2Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$metadata = lx2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SettingsUiStateInteractor$uiStateFlow$2 settingsUiStateInteractor$uiStateFlow$2 = new SettingsUiStateInteractor$uiStateFlow$2(this.this$0, this.$metadata, continuation);
        settingsUiStateInteractor$uiStateFlow$2.L$0 = obj;
        return settingsUiStateInteractor$uiStateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsUiStateInteractor$uiStateFlow$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            lx2 lx2Var = this.$metadata;
            bVar.getClass();
            ArrayList arrayList = new ArrayList();
            SettingsItemId settingsItemId = SettingsItemId.LANGUAGE;
            avj0 avj0Var = (avj0) bVar.c;
            String h = avj0Var.h(kyh0.settings_lang);
            j5z j5zVar = bVar.d;
            i5z a = j5zVar.a.a();
            Context context = j5zVar.f;
            a.getClass();
            arrayList.add(new t8r0(settingsItemId, h, pkb1.e(), context.getResources().getString(a.c), 16));
            qqt0 qqt0Var = bVar.g;
            qqt0Var.b.getClass();
            if (qqt0Var.c) {
                arrayList.add(new u8r0(SettingsItemId.HAPTIC, avj0Var.h(kyh0.settings_splash_haptic_option), keb1.c(), qqt0Var.a(), (String) null, 48));
            }
            if (bVar.a()) {
                arrayList.add(new u8r0(SettingsItemId.HIDE_BALANCE, avj0Var.h(kyh0.hide_yandex_bank_balance_title), gja1.b(), bVar.h.a(), avj0Var.h(kyh0.hide_yandex_bank_balance_subtitle), 32));
            }
            o8z o8zVar = (o8z) bVar.k;
            boolean z = ((y7z) o8zVar.a.b()).b;
            EmptyList emptyList = EmptyList.a;
            List singletonList = !z ? emptyList : Collections.singletonList(new u8r0(SettingsItemId.LOCATION_DIAGNOSTIC, avj0Var.h(kyh0.location_diagnostic_switch), yri0.d(), o8zVar.a(), (String) null, 48));
            ru.yandex.taxi.utils.b bVar2 = bVar.j;
            ArrayList arrayList2 = new ArrayList();
            if (((cne0) bVar.e.b).f("show_sms_menu_settings")) {
                arrayList2.add(new u8r0(SettingsItemId.DONT_SMS, avj0Var.h(kyh0.settings_sms_order_status), ceb1.c(), bVar.f.a("FIELD_DONT_SMS", false), (String) null, 48));
            }
            if (bVar2.c().a) {
                arrayList2.add(new u8r0(SettingsItemId.LIVE_LOCATION, avj0Var.h(kyh0.location_sharing_control_button), jgb1.e(), bVar2.e(), avj0Var.h(kyh0.live_location_settings_details), true));
            }
            List g = scc.g(emptyList, arrayList, singletonList, arrayList2);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : g) {
                if (!((List) obj2).isEmpty()) {
                    arrayList3.add(obj2);
                }
            }
            mx2 mx2Var = new mx2(AppSettingsTransitionMode.Forward, arrayList3, lx2Var);
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(mx2Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
