package xsna;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.gms.internal.mlkit_vision_barcode.zznc;
import com.google.android.gms.internal.mlkit_vision_barcode.zznd;
import com.google.android.gms.internal.mlkit_vision_barcode.zznf;
import com.google.android.gms.internal.mlkit_vision_barcode.zznu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzro;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.music.player.presentation.widgets.PlayerBigWidget;
import com.vk.music.player.presentation.widgets.PlayerSmallWidget;
import com.vk.music.playerservice.impl.PlayerService;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import java.util.concurrent.TimeUnit;

/* compiled from: MsgViewContentComponent.kt */
/* loaded from: classes2.dex */
public final class k140 implements vb80, i5b0, i64, zzrk {
    public Object b;

    public /* synthetic */ k140(Object obj) {
        this.b = obj;
    }

    public static void g(Context context, Class cls, wzs wzsVar) {
        try {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) cls));
            if (appWidgetIds == null || appWidgetIds.length == 0) {
                return;
            }
            wzsVar.invoke(appWidgetManager, appWidgetIds);
        } catch (Exception e) {
            bn40.c(e, new Object[0]);
        }
    }

    @Override // xsna.i64
    public void c(float f, float f2) {
        com.vk.attachpicker.screen.k kVar = (com.vk.attachpicker.screen.k) this.b;
        if (kVar.u) {
            View view = kVar.p;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = kVar.q;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = kVar.r;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            View view4 = kVar.s;
            if (view4 != null) {
                view4.setVisibility(0);
            }
            View view5 = kVar.l;
            if (view5 != null) {
                view5.setVisibility(0);
            }
            VkTopBar vkTopBar = kVar.x;
            if (vkTopBar != null) {
                vkTopBar.setVisibility(0);
            }
            View view6 = kVar.y;
            if (view6 != null) {
                view6.setVisibility(0);
            }
            View view7 = kVar.j;
            if (view7 != null) {
                view7.setSystemUiVisibility(CoverVideoUploadTask.y);
            }
        } else {
            View view8 = kVar.p;
            if (view8 != null) {
                view8.setVisibility(4);
            }
            View view9 = kVar.q;
            if (view9 != null) {
                view9.setVisibility(4);
            }
            View view10 = kVar.r;
            if (view10 != null) {
                view10.setVisibility(4);
            }
            View view11 = kVar.s;
            if (view11 != null) {
                view11.setVisibility(4);
            }
            View view12 = kVar.l;
            if (view12 != null) {
                view12.setVisibility(4);
            }
            VkTopBar vkTopBar2 = kVar.x;
            if (vkTopBar2 != null) {
                vkTopBar2.setVisibility(4);
            }
            View view13 = kVar.y;
            if (view13 != null) {
                view13.setVisibility(4);
            }
            View view14 = kVar.j;
            if (view14 != null) {
                view14.setSystemUiVisibility(kVar.C | 2);
            }
        }
        kVar.u = !kVar.u;
    }

    public vha d(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        z160 z160Var;
        if (catalogConfiguration$Companion$ContainerType != CatalogConfiguration$Companion$ContainerType.VERTICAL) {
            return new s4a();
        }
        izs izsVar = (izs) this.b;
        return (izsVar == null || (z160Var = (z160) izsVar.invoke(u4aVar)) == null) ? new z160(new onh0(), u4aVar.b.I, 4) : z160Var;
    }

    public void e() {
        q55 q55Var = q55.a;
        SignUpDataHolder signUpDataHolder = q55.c().a;
        wug0 wug0Var = new wug0(this, 20);
        if (signUpDataHolder.K == null) {
            signUpDataHolder.K = new Bundle();
        }
        wug0Var.invoke(signUpDataHolder.K);
    }

    public void f(Context context) {
        PlayerService playerService = (PlayerService) context;
        g(context, PlayerSmallWidget.class, new com.vk.movika.sdk.android.defaultplayer.control.l(playerService, 9));
        g(context, PlayerBigWidget.class, new fd4(playerService, 8));
    }

    public void h(Context context) {
        io.reactivex.rxjava3.core.r rVar = (io.reactivex.rxjava3.core.r) this.b;
        if (rVar != null) {
            rVar.onNext(context);
        }
    }

    @Override // xsna.vb80
    public void k(ClickableSpan clickableSpan, View view) {
        uxv uxvVar = ((j140) this.b).V;
        if (uxvVar != null) {
            uxvVar.k(clickableSpan, view);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzrk
    public zzra zza() {
        zznd zzndVar = (zznd) this.b;
        zznf zznfVar = new zznf();
        zznfVar.zze(c201.d() ? zznc.TYPE_THICK : zznc.TYPE_THIN);
        zznu zznuVar = new zznu();
        zznuVar.zzb(zzndVar);
        zznfVar.zzh(zznuVar.zzc());
        return zzro.zzf(zznfVar);
    }

    public k140() {
        new io.reactivex.rxjava3.internal.operators.observable.q(new xx40(this, 4)).y(200L, TimeUnit.MILLISECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b()).r0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new dh40(new bws(this), 10));
    }

    @Override // xsna.i64
    public void a() {
    }

    @Override // xsna.i64
    public void b(float f, float f2) {
    }
}
