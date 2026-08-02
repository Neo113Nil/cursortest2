package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.material3.SheetValue;
import com.vk.api.generated.adsint.dto.AdsintEventTypeDto;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.friend.FriendsSuggestsVh;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;
import com.vk.superapp.core.api.models.BanInfo;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;
import xsna.dc3;
import xsna.wk50;
import xsna.xt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class yb3 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yb3(com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.b bVar, wk50.a aVar, vzh vzhVar, c.u.g gVar) {
        this.b = 2;
        this.c = aVar;
        this.d = vzhVar;
        this.e = gVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ovv0 J;
        dvv0 a;
        String obj;
        String str;
        int i = this.b;
        boolean z = true;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                JSONObject jSONObject = (JSONObject) obj4;
                final UserId userId = (UserId) obj3;
                final dc3.a aVar = (dc3.a) obj2;
                if (jSONObject != null && o25.a().b()) {
                    Serializer.c<BanInfo> cVar = BanInfo.CREATOR;
                    final BanInfo a2 = BanInfo.a.a(jSONObject);
                    final boolean a3 = o25.a().a(userId);
                    asu0.a.getClass();
                    asu0.l().execute(new Runnable() { // from class: xsna.zb3
                        @Override // java.lang.Runnable
                        public final void run() {
                            o25.a().O(new t200(Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, UserId.this, "banned", null, false, true, false));
                            if (a3) {
                                ((Handler) aVar.a.getValue()).postDelayed(new io.reactivex.rxjava3.android.a(a2, 1), 300L);
                            }
                        }
                    });
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                tx4 tx4Var = (tx4) obj2;
                return new ux4(new vx4((lx4) obj4, new m200()), new sf1(tx4Var, 7), (mlf0) obj3, new com.vk.im.engine.internal.storage.delegates.messages.b(tx4Var, 9));
            case 2:
                c.u.g gVar = (c.u.g) obj2;
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.b.e((wk50.a) obj4, (vzh) obj3, gVar.b, gVar.c, new ht(16));
                return s3q0.a;
            case 3:
                FriendsSuggestsVh friendsSuggestsVh = (FriendsSuggestsVh) obj4;
                UIBlockProfile uIBlockProfile = (UIBlockProfile) obj2;
                friendsSuggestsVh.g((Context) obj3, uIBlockProfile, nts.e((nts) friendsSuggestsVh.f.getValue(), uIBlockProfile.A.c, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS), null, uIBlockProfile.y.d, 10), new rm0(12, uIBlockProfile, friendsSuggestsVh));
                return s3q0.a;
            case 4:
                VkUiCommand vkUiCommand = (VkUiCommand) obj3;
                String str2 = (String) obj2;
                fvv0 M = ((r6y) obj4).M();
                if (M != null && (J = M.J()) != null && (a = J.a(vkUiCommand)) != null) {
                    a.a(str2);
                }
                return s3q0.a;
            case 5:
                rey reyVar = (rey) obj3;
                String str3 = (String) obj2;
                if (obj4 instanceof byte[]) {
                    str = "REPLACE INTO key_value(key, value_blob) VALUES(?,?)";
                    obj = obj4;
                } else {
                    obj = obj4 instanceof Boolean ? ((Boolean) obj4).booleanValue() ? "1" : "0" : obj4.toString();
                    str = "REPLACE INTO key_value(key, value_simple) VALUES(?,?)";
                }
                reyVar.b.execSQL(str, new Serializable[]{str3, obj});
                ReentrantLock reentrantLock = reyVar.d;
                reentrantLock.lock();
                try {
                    reyVar.c.put(str3, obj4);
                    s3q0 s3q0Var = s3q0.a;
                    reentrantLock.unlock();
                    return s3q0.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 6:
                yvj yvjVar = (yvj) obj3;
                gdj0 gdj0Var = (gdj0) obj2;
                if (((gdj0) obj4).d.d.invoke(SheetValue.Expanded).booleanValue()) {
                    myc0.h(yvjVar, null, null, new nx20(gdj0Var, null), 3);
                }
                return Boolean.TRUE;
            case 7:
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                AdsintEventTypeDto adsintEventTypeDto = AdsintEventTypeDto.MRC_CLICK_PRETTY_CARD;
                int layoutPosition = ((b3d0) obj2).getLayoutPosition();
                return new xt0.a(adsintEventTypeDto, str4, str5, layoutPosition < 0 ? xt0.c.b.a : new xt0.c.a(layoutPosition));
            default:
                gzs gzsVar = (gzs) obj3;
                View view = (View) obj2;
                Rect b = f4m.b((FrameLayout) obj4);
                int i2 = b.bottom - b.top;
                if ((gzsVar == null || ((Boolean) gzsVar.invoke()).booleanValue()) && view.getHeight() != i2) {
                    bwt0.c0(i2, view);
                    view.post(new hv2(view, 19));
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ yb3(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
