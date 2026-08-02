package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.catalog2.common.dto.ui.UIBlockVideoUpload;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.dialogslist.view.ViewPager2NestedRecyclerView;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.log.L;
import com.vk.stories.design.view.editor.verticalization.VerticalizationBannerView;
import com.vk.voip.ui.VoipStatManager;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.net.ConnectException;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.bjw0;
import xsna.k5x0;
import xsna.sjm0;
import xsna.tj50;
import xsna.yiw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class fyi0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ fyi0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                L.i((Throwable) obj);
                return s3q0.a;
            case 1:
                return ((qgl0) ((Enum) obj)).getKey();
            case 2:
                return ((StoriesContainer) obj).g;
            case 3:
                qgi0.r((tgi0) obj, "settings_button");
                return s3q0.a;
            case 4:
                tj50.a aVar = (tj50.a) obj;
                ijm0 ijm0Var = ijm0.b;
                ao8 ao8Var = ao8.d;
                return new sjm0.a(aVar.a(ijm0Var, ao8Var), aVar.a(jjm0.b, ao8Var), aVar.a(kjm0.b, ao8Var));
            case 5:
                return ((BaseBoolIntDto) obj) == BaseBoolIntDto.NO ? io.reactivex.rxjava3.core.a.k(new ConnectException()) : io.reactivex.rxjava3.internal.operators.completable.i.b;
            case 6:
                return Boolean.TRUE;
            case 7:
                ArrayList arrayList = new ArrayList();
                Iterator<ExtendedUserProfile.i> it = ((ExtendedUserProfile) obj).F0.iterator();
                while (it.hasNext()) {
                    ExtendedUserProfile.i next = it.next();
                    StringBuilder sb = new StringBuilder();
                    String str = next.a;
                    if (str != null) {
                        sb.append(str);
                    }
                    if ((next.d > 0 || next.c > 0) && myc0.f(sb)) {
                        sb.append(", ");
                    }
                    int i = next.d;
                    if (i > 0) {
                        sb.append(i);
                    }
                    if (next.d > 0 && next.c > 0) {
                        sb.append('-');
                    }
                    int i2 = next.c;
                    if (i2 > 0) {
                        sb.append(i2);
                    }
                    arrayList.add(new x4m(R.string.profile_military_unit, next.b + '\n' + ((Object) sb)));
                }
                if (!arrayList.isEmpty()) {
                    arrayList.add(0, new o4m(R.string.profile_military_service, 14, null));
                }
                return arrayList;
            case 8:
                float f = VerticalizationBannerView.h;
                return s3q0.a;
            case 9:
                return ((UIBlockVideoUpload) obj).y;
            case 10:
                int i3 = ViewPager2NestedRecyclerView.c;
                return Boolean.valueOf(((View) obj) instanceof RecyclerView);
            case 11:
                qcy<Object>[] qcyVarArr = VkTopBarSearchQueryVh.s;
                qgi0.r((tgi0) obj, "vk_top_bar_search_menu_btn");
                return s3q0.a;
            case 12:
                return new VoipActionsFeatureState.q(((Boolean) obj).booleanValue());
            case 13:
                int i4 = cdw0.o1;
                return ((pno0) obj).d().toString();
            case 14:
                yiw0.a aVar2 = (yiw0.a) obj;
                return new bjw0.b.a(aVar2.b, aVar2.c);
            default:
                k5x0.a aVar3 = (k5x0.a) obj;
                if (VoipStatManager.c && !epx.f(aVar3, k5x0.a.c)) {
                    VoipStatManager.a.l = true;
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ fyi0(rhq0 rhq0Var) {
        this.b = 7;
    }
}
