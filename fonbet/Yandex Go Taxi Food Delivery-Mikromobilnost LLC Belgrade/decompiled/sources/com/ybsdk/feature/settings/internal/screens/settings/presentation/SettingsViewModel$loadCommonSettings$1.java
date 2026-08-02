package com.ybsdk.feature.settings.internal.screens.settings.presentation;

import com.adjust.sdk.Constants;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.settings.api.domain.SettingsItemEntity$Type;
import defpackage.bqg;
import defpackage.cqg;
import defpackage.dqg;
import defpackage.dzh0;
import defpackage.hh51;
import defpackage.j59;
import defpackage.krl0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o8r0;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.tse;
import defpackage.u8j0;
import defpackage.unr0;
import defpackage.v7r0;
import defpackage.w511;
import defpackage.wdr0;
import defpackage.wls;
import defpackage.wt51;
import defpackage.x4c;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.settings.internal.screens.settings.presentation.SettingsViewModel$loadCommonSettings$1", f = "SettingsViewModel.kt", l = {110, HProv.PP_SAME_MEDIA}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SettingsViewModel$loadCommonSettings$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$loadCommonSettings$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsViewModel$loadCommonSettings$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsViewModel$loadCommonSettings$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x003a, code lost:
    
        if (r2 == r1) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        u8j0 s8j0Var;
        Object b2;
        u8j0 u8j0Var;
        u8j0 r8j0Var;
        j59 j59Var;
        j59 a;
        j59 j59Var2;
        pz40 Y;
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.ybsdk.feature.settings.internal.screens.settings.domain.a aVar = this.this$0.B;
            this.label = 1;
            b = aVar.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                u8j0 u8j0Var2 = (u8j0) this.L$0;
                b.b(obj);
                b2 = obj;
                u8j0Var = u8j0Var2;
                j59Var = (j59) b2;
                a = this.this$0.C.a();
                com.ybsdk.feature.settings.internal.screens.settings.domain.a aVar2 = this.this$0.B;
                aVar2.getClass();
                Text.Resource h = unr0.h(Text.Companion, dzh0.ybsdk_settings_settings_push_category_title);
                SettingsItemEntity$Type settingsItemEntity$Type = SettingsItemEntity$Type.SWITCH;
                krl0 krl0Var = aVar2.d;
                boolean a2 = ((com.ybsdk.feature.push.impl.data.b) ((com.ybsdk.feature.push.impl.a) ((wt51) krl0Var.a)).c.getValue()).a();
                j59Var2 = new j59("push_settings_category", h, Collections.singletonList(new o8r0(Constants.PUSH, settingsItemEntity$Type, new Text.Resource(dzh0.ybsdk_settings_settings_push_toggle_title), new Text.Resource(dzh0.ybsdk_settings_settings_push_category_subtitle), null, ((Boolean) ((hh51) krl0Var.b).j.getValue()).booleanValue(), a2, null, null, null, null, 3984)));
                this.this$0.J.getClass();
                Y = this.this$0.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, wdr0.a((wdr0) value, u8j0Var, null, null, null, false, null, j59Var, j59Var2, a, false, 3134)));
                return zy11.a;
            }
            b.b(obj);
            b = ((Result) obj).getValue();
        }
        a aVar3 = this.this$0;
        Throwable a3 = Result.a(b);
        if (a3 == null) {
            dqg dqgVar = (dqg) b;
            if (dqgVar instanceof bqg) {
                bqg bqgVar = (bqg) dqgVar;
                aVar3.getClass();
                r8j0Var = new s8j0(new FailDataException(bqgVar.a, (String) null, bqgVar.d, (String) null, 22, bqgVar.f));
            } else {
                if (!(dqgVar instanceof cqg)) {
                    w511.b();
                    return null;
                }
                r8j0Var = new r8j0(((cqg) dqgVar).a, null, 14);
            }
            s8j0Var = r8j0Var;
        } else {
            x4c.g("Load settings error", a3, null, null, 12);
            s8j0Var = new s8j0(a3);
        }
        com.ybsdk.feature.settings.internal.domain.security.a aVar4 = this.this$0.I;
        v7r0 v7r0Var = (v7r0) s8j0Var.a();
        this.L$0 = s8j0Var;
        this.label = 2;
        b2 = aVar4.b(v7r0Var, this);
        if (b2 != coroutineSingletons) {
            u8j0Var = s8j0Var;
            j59Var = (j59) b2;
            a = this.this$0.C.a();
            com.ybsdk.feature.settings.internal.screens.settings.domain.a aVar22 = this.this$0.B;
            aVar22.getClass();
            Text.Resource h2 = unr0.h(Text.Companion, dzh0.ybsdk_settings_settings_push_category_title);
            SettingsItemEntity$Type settingsItemEntity$Type2 = SettingsItemEntity$Type.SWITCH;
            krl0 krl0Var2 = aVar22.d;
            boolean a22 = ((com.ybsdk.feature.push.impl.data.b) ((com.ybsdk.feature.push.impl.a) ((wt51) krl0Var2.a)).c.getValue()).a();
            j59Var2 = new j59("push_settings_category", h2, Collections.singletonList(new o8r0(Constants.PUSH, settingsItemEntity$Type2, new Text.Resource(dzh0.ybsdk_settings_settings_push_toggle_title), new Text.Resource(dzh0.ybsdk_settings_settings_push_category_subtitle), null, ((Boolean) ((hh51) krl0Var2.b).j.getValue()).booleanValue(), a22, null, null, null, null, 3984)));
            this.this$0.J.getClass();
            Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, wdr0.a((wdr0) value, u8j0Var, null, null, null, false, null, j59Var, j59Var2, a, false, 3134)));
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
