package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.generated.market.dto.MarketGetItemsForReviewViewTypeDto;
import com.vk.auth.api.models.AuthResult;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import xsna.uxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class uy3 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uy3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        Parcelable parcelable;
        Object parcelable2;
        sht0 sht0Var;
        switch (this.b) {
            case 0:
                ((wy3) this.c).a.h.set(false);
                break;
            case 1:
                UserId userId = ((AuthResult) this.c).d;
                udx0 udx0Var = e370.i;
                if (udx0Var == null) {
                    udx0Var = null;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable(CommonConstant.RETKEY.USERID, userId);
                udx0Var.getClass();
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                rhp0 rhp0Var = new rhp0();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = bundle.getParcelable(CommonConstant.RETKEY.USERID, UserId.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable3 = bundle.getParcelable(CommonConstant.RETKEY.USERID);
                    if (!(parcelable3 instanceof UserId)) {
                        parcelable3 = null;
                    }
                    parcelable = (UserId) parcelable3;
                }
                UserId userId2 = (UserId) parcelable;
                Bundle bundle2 = rhp0Var.a;
                if (userId2 != null && fkq0.c(userId2)) {
                    bundle2.putLong(CommonConstant.RETKEY.USERID, userId2.b);
                }
                String string = bundle.getString("USER_NAME");
                if (string != null) {
                    bundle2.putString("USER_NAME", string);
                }
                String string2 = bundle.getString("STORE_NAME");
                if (string2 != null) {
                    bundle2.putString("STORE_NAME", string2);
                }
                bVar.f(bundle2);
                udx0 udx0Var2 = e370.i;
                (udx0Var2 != null ? udx0Var2 : null).getClass();
                bVar.d(userId.b);
                break;
            case 2:
                ((r46) this.c).k(uxd0.c.a);
                break;
            case 3:
                gzs<s3q0> gzsVar = ((b2b) this.c).i;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 4:
                mth mthVar = ((arh) this.c).e.b;
                mthVar.b.a(MarketGetItemsForReviewViewTypeDto.COMMUNITY_MAIN, mthVar.a.a, new px0(mthVar, 29));
                break;
            case 5:
                mwm mwmVar = (mwm) this.c;
                mwmVar.e.shutdown();
                mwmVar.f.shutdown();
                break;
            case 6:
                ((dfy) this.c).a.invoke();
                break;
            case 7:
                w2c0 w2c0Var = (w2c0) this.c;
                ((NewsFeedComponent) w2c0Var.f.getValue()).w().g(w2c0Var.i);
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                enj.s(context, w2c0Var.h);
                break;
            case 8:
                pjk0 pjk0Var = (pjk0) this.c;
                a2e0 a2e0Var = pjk0Var.d;
                if (a2e0Var != null) {
                    a2e0Var.a();
                }
                pjk0Var.d = null;
                pjk0Var.c = null;
                break;
            case 9:
                yg5 yg5Var = (yg5) this.c;
                VideoAutoPlay videoAutoPlay = yg5Var instanceof VideoAutoPlay ? (VideoAutoPlay) yg5Var : null;
                if (videoAutoPlay != null && (sht0Var = videoAutoPlay.l0) != null) {
                    o1b0.b(qu5.c(), sht0Var, 2);
                    break;
                }
                break;
            default:
                ((e8u0) this.c).d.invoke();
                break;
        }
    }

    public /* synthetic */ uy3(yg5 yg5Var, com.vk.libvideo.autoplay.background.controller.h hVar) {
        this.b = 9;
        this.c = yg5Var;
    }
}
