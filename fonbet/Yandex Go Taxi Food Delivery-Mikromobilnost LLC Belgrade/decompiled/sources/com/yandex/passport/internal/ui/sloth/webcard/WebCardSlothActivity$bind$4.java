package com.yandex.passport.internal.ui.sloth.webcard;

import com.yandex.passport.R;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.uc20;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/passport/internal/sloth/performers/webcard/f;", "cardEvent", "Lzy11;", "<anonymous>", "(Lcom/yandex/passport/internal/sloth/performers/webcard/f;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothActivity$bind$4", f = "WebCardSlothActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class WebCardSlothActivity$bind$4 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WebCardSlothActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebCardSlothActivity$bind$4(WebCardSlothActivity webCardSlothActivity, Continuation continuation) {
        super(2, continuation);
        this.this$0 = webCardSlothActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WebCardSlothActivity$bind$4 webCardSlothActivity$bind$4 = new WebCardSlothActivity$bind$4(this.this$0, continuation);
        webCardSlothActivity$bind$4.L$0 = obj;
        return webCardSlothActivity$bind$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        WebCardSlothActivity$bind$4 webCardSlothActivity$bind$4 = (WebCardSlothActivity$bind$4) create((com.yandex.passport.internal.sloth.performers.webcard.f) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        webCardSlothActivity$bind$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        s0 component;
        WebCardSlothUi$WebCardPosition webCardSlothUi$WebCardPosition;
        WebCardSlothUi$WebCardPosition webCardSlothUi$WebCardPosition2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.passport.internal.sloth.performers.webcard.f fVar = (com.yandex.passport.internal.sloth.performers.webcard.f) this.L$0;
        if (fVar instanceof com.yandex.passport.internal.sloth.performers.webcard.d) {
            component = this.this$0.getComponent();
            z0 ui = component.getUi();
            com.yandex.passport.internal.sloth.performers.webcard.d dVar = (com.yandex.passport.internal.sloth.performers.webcard.d) fVar;
            ui.getClass();
            String str = dVar.a;
            if (jl40.l(str, "fullscreen")) {
                ui.c(Float.valueOf(0.0f), 0, 0, 0, WebCardSlothUi$WebCardPosition.Mid, ui.B);
                ui.getRoot().setBackgroundColor(ui.c.getColor(R.color.passport_roundabout_background));
            } else {
                ui.getRoot().setBackgroundResource(R.drawable.passport_bg_webcard);
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -1383228885) {
                        if (hashCode != -1364013995) {
                            if (hashCode == 115029 && str.equals("top")) {
                                webCardSlothUi$WebCardPosition2 = WebCardSlothUi$WebCardPosition.Top;
                                webCardSlothUi$WebCardPosition = webCardSlothUi$WebCardPosition2;
                            }
                        } else if (str.equals("center")) {
                            webCardSlothUi$WebCardPosition2 = WebCardSlothUi$WebCardPosition.Mid;
                            webCardSlothUi$WebCardPosition = webCardSlothUi$WebCardPosition2;
                        }
                    } else if (str.equals("bottom")) {
                        webCardSlothUi$WebCardPosition2 = WebCardSlothUi$WebCardPosition.Bottom;
                        webCardSlothUi$WebCardPosition = webCardSlothUi$WebCardPosition2;
                    }
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "position " + webCardSlothUi$WebCardPosition, 8);
                    }
                    Float f = dVar.b;
                    Float valueOf = f == null ? Float.valueOf(f.floatValue() * uc20.a.density) : null;
                    Float f2 = dVar.d;
                    Integer valueOf2 = f2 == null ? Integer.valueOf((int) (f2.floatValue() * uc20.a.density)) : null;
                    Float f3 = dVar.c;
                    Integer valueOf3 = f3 == null ? Integer.valueOf((int) (f3.floatValue() * uc20.a.density)) : null;
                    Float f4 = dVar.e;
                    ui.c(valueOf, valueOf2, valueOf3, f4 != null ? Integer.valueOf((int) (f4.floatValue() * uc20.a.density)) : null, webCardSlothUi$WebCardPosition, ui.B);
                }
                webCardSlothUi$WebCardPosition = null;
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                }
                Float f5 = dVar.b;
                if (f5 == null) {
                }
                Float f22 = dVar.d;
                if (f22 == null) {
                }
                Float f32 = dVar.c;
                if (f32 == null) {
                }
                Float f42 = dVar.e;
                ui.c(valueOf, valueOf2, valueOf3, f42 != null ? Integer.valueOf((int) (f42.floatValue() * uc20.a.density)) : null, webCardSlothUi$WebCardPosition, ui.B);
            }
        } else if (fVar instanceof com.yandex.passport.internal.sloth.performers.webcard.c) {
            this.this$0.beginChangePassword(((com.yandex.passport.internal.sloth.performers.webcard.c) fVar).a);
        } else {
            if (!(fVar instanceof com.yandex.passport.internal.sloth.performers.webcard.e)) {
                w511.b();
                return null;
            }
            this.this$0.errorAlert();
        }
        return zy11.a;
    }
}
