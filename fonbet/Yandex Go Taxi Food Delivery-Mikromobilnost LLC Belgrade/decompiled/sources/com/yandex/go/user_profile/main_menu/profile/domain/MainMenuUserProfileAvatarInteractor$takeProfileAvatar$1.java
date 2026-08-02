package com.yandex.go.user_profile.main_menu.profile.domain;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.m600;
import defpackage.mvg;
import defpackage.nfv;
import defpackage.ny61;
import defpackage.r600;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lr600;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.user_profile.main_menu.profile.domain.MainMenuUserProfileAvatarInteractor$takeProfileAvatar$1", f = "MainMenuUserProfileAvatarInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, 56, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MainMenuUserProfileAvatarInteractor$takeProfileAvatar$1 extends SuspendLambda implements wls {
    final /* synthetic */ Drawable $placeholder;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ m600 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainMenuUserProfileAvatarInteractor$takeProfileAvatar$1(m600 m600Var, Drawable drawable, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = m600Var;
        this.$placeholder = drawable;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MainMenuUserProfileAvatarInteractor$takeProfileAvatar$1 mainMenuUserProfileAvatarInteractor$takeProfileAvatar$1 = new MainMenuUserProfileAvatarInteractor$takeProfileAvatar$1(this.this$0, this.$placeholder, this.$url, continuation);
        mainMenuUserProfileAvatarInteractor$takeProfileAvatar$1.L$0 = obj;
        return mainMenuUserProfileAvatarInteractor$takeProfileAvatar$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MainMenuUserProfileAvatarInteractor$takeProfileAvatar$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            r600 a = m600.a(this.this$0, true, this.$placeholder);
            this.L$0 = vprVar;
            this.label = 1;
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
            Drawable drawable = (BitmapDrawable) obj;
            m600 m600Var = this.this$0;
            if (drawable == null) {
                drawable = this.$placeholder;
            }
            r600 a2 = m600.a(m600Var, false, drawable);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        e eVar = this.this$0.d;
        String str = this.$url;
        this.L$0 = vprVar;
        this.label = 2;
        obj = e.k(eVar, str, nfv.a, this, 6);
    }
}
