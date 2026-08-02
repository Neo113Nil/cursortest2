package com.yandex.payment.divkit.repository;

import com.yandex.payment.divkit.api.DivKitApi;
import defpackage.g8e;
import defpackage.h8;
import defpackage.jl40;
import defpackage.l5j0;
import defpackage.m5j0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.qv90;
import defpackage.rvj0;
import defpackage.rwo;
import defpackage.vfc;
import defpackage.wg10;
import defpackage.wms;
import defpackage.y22;
import defpackage.y891;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import org.json.JSONObject;
import retrofit2.Response;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class a {
    public final DivKitApi a;
    public final rwo b;

    public a(DivKitApi divKitApi, rwo rwoVar) {
        this.a = divKitApi;
        this.b = rwoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9 A[EDGE_INSN: B:20:0x00a9->B:21:0x00a9 BREAK  A[LOOP:0: B:11:0x0064->B:18:0x0064], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(JSONObject jSONObject, ContinuationImpl continuationImpl) {
        DivKitRepositoryImpl$fetchScreen$1 divKitRepositoryImpl$fetchScreen$1;
        int i;
        wg10 wg10Var;
        rvj0 rvj0Var;
        Iterator it;
        h8 h8Var;
        String string;
        if (continuationImpl instanceof DivKitRepositoryImpl$fetchScreen$1) {
            divKitRepositoryImpl$fetchScreen$1 = (DivKitRepositoryImpl$fetchScreen$1) continuationImpl;
            int i2 = divKitRepositoryImpl$fetchScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                divKitRepositoryImpl$fetchScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = divKitRepositoryImpl$fetchScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = divKitRepositoryImpl$fetchScreen$1.label;
                if (i != 0) {
                    b.b(obj);
                    int i3 = m5j0.a;
                    String jSONObject2 = jSONObject.toString();
                    Regex regex = wg10.e;
                    try {
                        wg10Var = qje.o("application/json");
                    } catch (IllegalArgumentException unused) {
                        wg10Var = null;
                    }
                    l5j0 a = wms.a(jSONObject2, wg10Var);
                    divKitRepositoryImpl$fetchScreen$1.L$0 = null;
                    divKitRepositoryImpl$fetchScreen$1.label = 1;
                    obj = this.a.a(a, divKitRepositoryImpl$fetchScreen$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                Response response = (Response) obj;
                rvj0Var = (rvj0) response.b;
                it = response.a.y.iterator();
                while (true) {
                    h8Var = (h8) it;
                    if (h8Var.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) h8Var.next();
                    String str = (String) pair.getFirst();
                    String str2 = (String) pair.getSecond();
                    if (jl40.l(str, "X-Yandex-TestIds")) {
                        qv90.a.getClass();
                        ((y22) this.b).a(y891.c("template_renderer_active_experiments", vfc.i(0, "test_ids", str2, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Текущие активные эксперименты в Template Renderer: ".concat(str2))));
                    }
                }
                if (rvj0Var == null && (string = rvj0Var.string()) != null) {
                    return new JSONObject(string);
                }
                rvj0 rvj0Var2 = response.c;
                throw new IllegalStateException(g8e.o("Body is null. ", rvj0Var2 != null ? rvj0Var2.string() : null));
            }
        }
        divKitRepositoryImpl$fetchScreen$1 = new DivKitRepositoryImpl$fetchScreen$1(this, continuationImpl);
        Object obj2 = divKitRepositoryImpl$fetchScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = divKitRepositoryImpl$fetchScreen$1.label;
        if (i != 0) {
        }
        Response response2 = (Response) obj2;
        rvj0Var = (rvj0) response2.b;
        it = response2.a.y.iterator();
        while (true) {
            h8Var = (h8) it;
            if (h8Var.hasNext()) {
            }
        }
        if (rvj0Var == null) {
        }
        rvj0 rvj0Var22 = response2.c;
        throw new IllegalStateException(g8e.o("Body is null. ", rvj0Var22 != null ? rvj0Var22.string() : null));
    }
}
