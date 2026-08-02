package xsna;

import android.widget.Toast;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.superapp.api.dto.identity.WebIdentityCard;
import com.vk.toggle.b;
import com.vk.toggle.internal.ToggleManager;
import com.vk.video.profile.presentation.views.creatoronboarding.videocounter.VideoProfileCreatorOnboardingVideoCounterView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.d1x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class p0p0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p0p0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.fragment.app.Fragment, xsna.zzu0] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ToggleManager toggleManager = (ToggleManager) obj2;
                ArrayList arrayList = new ArrayList();
                Iterator<E> it = ((zrp) obj3).iterator();
                while (it.hasNext()) {
                    b.d i2 = toggleManager.i((b.a) ((Enum) it.next()));
                    if (i2 != null) {
                        arrayList.add(i2);
                    }
                }
                return arrayList;
            case 1:
                ((nrr0) obj3).l.q(((ChatSettings) obj2).A);
                return s3q0.a;
            case 2:
                int i3 = VideoProfileCreatorOnboardingVideoCounterView.o;
                ((wh50) obj2).setValue(new pco(((azl) obj3).j1((int) (((tny) obj).a() >> 32))));
                return s3q0.a;
            case 3:
                ?? r0 = ((yzu0) obj3).b;
                WebIdentityCard webIdentityCard = (WebIdentityCard) obj2;
                if (((Boolean) obj).booleanValue()) {
                    r0.Ce(webIdentityCard);
                } else {
                    Toast.makeText(r0.getContext(), R.string.vk_common_network_error, 0).show();
                    r0.reset();
                }
                return s3q0.a;
            case 4:
                ((l8w0) obj3).b.g((hyg0) obj, (List) obj2);
                return s3q0.a;
            case 5:
                uzw0 uzw0Var = (uzw0) obj3;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) obj2;
                d1x0.b bVar = (d1x0.b) obj;
                int i4 = com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.a.l1;
                if (!(bVar instanceof d1x0.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                uzw0Var.setItems(((d1x0.b.a) bVar).a);
                swipeRefreshLayout.setRefreshing(false);
                return s3q0.a;
            default:
                rzo rzoVar = (rzo) obj3;
                UserId userId = rzoVar.a;
                int i5 = rzoVar.b;
                ArrayList arrayList2 = ((f9x0) obj2).a.a;
                cxt cxtVar = new cxt("wall.getComment");
                cxtVar.C(i5, "comment_id");
                cxtVar.F(userId, "owner_id");
                cxtVar.C(1, "extended");
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((BaseUserGroupFieldsDto) it2.next()).i());
                }
                cxtVar.G("fields", arrayList3);
                cxtVar.C(1, "photo_sizes");
                return rsg0.y0(cxtVar, null, null, 3);
        }
    }
}
