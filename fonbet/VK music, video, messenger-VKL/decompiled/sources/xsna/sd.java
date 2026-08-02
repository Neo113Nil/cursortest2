package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.animation.Animation;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.billing.GoogleStorePurchasesManagerImpl;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.confirmaccount.impl.VkConfirmUserByServiceActivity;
import com.vk.core.ui.themes.NavigationBarStyle;
import com.vk.im.ui.views.msg.MsgPartSnippetView;
import com.vk.sqliteext.observer.SQLiteContentObserver;
import com.vk.storycamera.screen.StoryCameraActivity;
import com.vk.voip.ui.service.BaseVoipService;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.ml.MLFeaturesManagerImpl;
import ru.ok.tensorflow.tflite.Model;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class sd implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sd(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = td.k;
                ((td) obj).p();
                break;
            case 1:
                jf0 jf0Var = (jf0) obj;
                Animation animation = jf0Var.R;
                View view = jf0Var.J;
                if (animation != null) {
                    bwt0.p0(view, true);
                    view.startAnimation(animation);
                    break;
                }
                break;
            case 2:
                ((u440) obj).O7(true);
                break;
            case 3:
                BaseVoipService baseVoipService = (BaseVoipService) obj;
                boolean z = BaseVoipService.k;
                baseVoipService.stopForeground(false);
                baseVoipService.stopSelf();
                break;
            case 4:
                ren renVar = ((sen) obj).c;
                Drawable drawable = renVar.e;
                if (drawable != null) {
                    drawable.setState(ren.i);
                }
                View view2 = renVar.h;
                if (view2 != null) {
                    view2.setPressed(false);
                    break;
                }
                break;
            case 5:
                evs evsVar = (evs) obj;
                try {
                    bwt0.n(evsVar.E.I, new r3h(evsVar, 16));
                    break;
                } catch (IllegalStateException unused) {
                    return;
                }
            case 6:
                GoogleStorePurchasesManagerImpl googleStorePurchasesManagerImpl = (GoogleStorePurchasesManagerImpl) obj;
                new com.vk.billing.h(null, googleStorePurchasesManagerImpl.b, googleStorePurchasesManagerImpl.a, new tno(), null).l(false);
                break;
            case 7:
                MLFeaturesManagerImpl.setNsParams$lambda$0((MLFeaturesManagerImpl) obj);
                break;
            case 8:
                ((s820) obj).g = false;
                break;
            case 9:
                ((Model) obj).lambda$createCopyShader$2();
                break;
            case 10:
                MsgPartSnippetView.a((MsgPartSnippetView) obj);
                break;
            case 11:
                androidx.profileinstaller.c.b((Context) obj, new ddk(), androidx.profileinstaller.c.a, false);
                break;
            case 12:
                ((f3g0) obj).q();
                break;
            case 13:
                SQLiteContentObserver.throwExceptionOnMainThread$lambda$3((Throwable) obj);
                break;
            case 14:
                int i3 = StoryCameraActivity.G;
                dhr0.u0(((StoryCameraActivity) obj).getWindow(), NavigationBarStyle.DARK);
                break;
            case 15:
                VideoCatalogRootVh videoCatalogRootVh = (VideoCatalogRootVh) obj;
                g3a.a(videoCatalogRootVh.P, videoCatalogRootVh);
                break;
            case 16:
                VkConfirmUserByServiceActivity vkConfirmUserByServiceActivity = (VkConfirmUserByServiceActivity) obj;
                List<String> list = vkConfirmUserByServiceActivity.l;
                if (list == null) {
                    list = null;
                }
                Iterator<String> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        try {
                            vkConfirmUserByServiceActivity.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(it.next())).addCategory("android.intent.category.BROWSABLE").addFlags(268435456).addFlags(1024));
                        } catch (Throwable unused2) {
                        }
                    } else {
                        rex0 rex0Var = e370.j;
                        if (rex0Var == null) {
                            rex0Var = null;
                        }
                        String str = vkConfirmUserByServiceActivity.k;
                        rex0Var.b(vkConfirmUserByServiceActivity, Uri.parse(str != null ? str : null));
                    }
                }
                vkConfirmUserByServiceActivity.h = true;
                break;
            default:
                yads.ek0.a((yads.ek0) obj);
                break;
        }
    }
}
