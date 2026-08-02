package com.yandex.messaging.audio;

import android.net.Uri;
import android.widget.Toast;
import com.yandex.messaging.internal.ServerMessageRef;
import defpackage.a1r;
import defpackage.az31;
import defpackage.bct;
import defpackage.izc0;
import defpackage.kg3;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyh0;
import defpackage.p8b;
import defpackage.pzt0;
import defpackage.rh3;
import defpackage.rp3;
import defpackage.sh3;
import defpackage.tse;
import defpackage.tyc0;
import defpackage.wls;
import defpackage.ww90;
import defpackage.y4a0;
import defpackage.ydz;
import defpackage.z0r;
import defpackage.z83;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.audio.PlayerHolder$play$1", f = "PlayerHolder.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PlayerHolder$play$1 extends SuspendLambda implements wls {
    final /* synthetic */ izc0 $playlist;
    int label;
    final /* synthetic */ tyc0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerHolder$play$1(tyc0 tyc0Var, izc0 izc0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tyc0Var;
        this.$playlist = izc0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlayerHolder$play$1(this.this$0, this.$playlist, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerHolder$play$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        az31 az31Var;
        String str;
        ServerMessageRef serverMessageRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.a();
            izc0 izc0Var = this.$playlist;
            this.label = 1;
            if (izc0Var.e(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.$playlist.reset();
        tyc0 tyc0Var = this.this$0;
        izc0 izc0Var2 = this.$playlist;
        tyc0Var.e = izc0Var2;
        rh3 j = izc0Var2.j();
        if (j != null) {
            if ((j instanceof az31) && (str = (az31Var = (az31) j).h) != null && (serverMessageRef = az31Var.g) != null) {
                pzt0 b = com.yandex.messaging.extension.flow.c.b(tyc0Var.a.a(new bct(p8b.a(str), serverMessageRef)), tyc0Var.h, new PlayerHolder$subscribeToVoiceMessageChanges$1(tyc0Var, az31Var, null));
                rp3 rp3Var = tyc0Var.d;
                kgx kgxVar = tyc0.j[0];
                rp3Var.a(b);
            }
            sh3 sh3Var = (sh3) j;
            Uri uri = sh3Var.d;
            if (uri == null || uri.equals(Uri.EMPTY)) {
                rh3 j2 = tyc0Var.e.j();
                d dVar = j2 != null ? (d) tyc0Var.g.get(j2) : null;
                if (dVar != null) {
                    tyc0 tyc0Var2 = dVar.a;
                    rh3 rh3Var = dVar.h;
                    tyc0Var2.getClass();
                    String str2 = rh3Var instanceof az31 ? ((az31) rh3Var).f : null;
                    if (str2 != null) {
                        y4a0 y4a0Var = new y4a0(tyc0Var2, rh3Var, false, 14);
                        LinkedHashMap linkedHashMap = tyc0Var2.f;
                        a1r a1rVar = tyc0Var2.b;
                        a1rVar.getClass();
                        linkedHashMap.put(rh3Var, new z0r(a1rVar, str2, y4a0Var));
                    }
                    dVar.e.A();
                }
                sh3Var.e = new ww90(27, tyc0Var, j);
            } else {
                kg3 kg3Var = tyc0Var.c;
                kg3Var.getClass();
                z83.i();
                Toast.makeText(kg3Var.a, oyh0.messaging_check_alis_error_unknown, 0).show();
            }
        } else if (ydz.a.a()) {
            ydz.d();
        }
        return zy11.a;
    }
}
