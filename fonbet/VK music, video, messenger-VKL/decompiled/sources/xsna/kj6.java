package xsna;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.recyclerview.widget.GridLayoutManager;
import com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment;
import com.vk.newsfeed.posting.mediapicker.videovk.presentation.PickerRecyclerPaginatedView;
import com.vk.superapp.browser.internal.bridges.JsApiEvent;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vkontakte.android.R;
import org.json.JSONObject;
import xsna.bex0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class kj6 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kj6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        int i2 = 1;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                BasePhotoListFragment basePhotoListFragment = (BasePhotoListFragment) obj5;
                int intValue = ((Integer) obj2).intValue();
                ((Integer) obj3).getClass();
                int i3 = BasePhotoListFragment.l0;
                if (((View) obj4).getContext().getResources().getConfiguration().orientation == 2) {
                    int a = intValue / e3m.a(R.dimen.media_picker_photo_cell_size_in_landscape, basePhotoListFragment.requireContext());
                    if (a >= 1) {
                        i2 = a;
                    }
                } else {
                    i2 = 3;
                }
                basePhotoListFragment.Y = i2;
                GridLayoutManager gridLayoutManager = basePhotoListFragment.X;
                if ((gridLayoutManager == null ? null : gridLayoutManager).s != i2) {
                    if (gridLayoutManager == null) {
                        gridLayoutManager = null;
                    }
                    gridLayoutManager.setSpanCount(i2);
                    PickerRecyclerPaginatedView pickerRecyclerPaginatedView = basePhotoListFragment.a0;
                    if (pickerRecyclerPaginatedView == null) {
                        pickerRecyclerPaginatedView = null;
                    }
                    pickerRecyclerPaginatedView.getRecyclerView().invalidateItemDecorations();
                    PickerRecyclerPaginatedView pickerRecyclerPaginatedView2 = basePhotoListFragment.a0;
                    (pickerRecyclerPaginatedView2 != null ? pickerRecyclerPaginatedView2 : null).getRecyclerView().post(new vq3(basePhotoListFragment, 2));
                }
                break;
            case 1:
                vrt vrtVar = (vrt) obj5;
                Context context = (Context) obj4;
                int intValue2 = ((Integer) obj).intValue();
                String str = (String) obj2;
                long longValue = ((Long) obj3).longValue();
                r6y r6yVar = vrtVar.b;
                if (r6yVar != null) {
                    JsApiMethodType jsApiMethodType = JsApiMethodType.GET_WORKOUTS;
                    JSONObject jSONObject = new JSONObject();
                    JSONObject put = new JSONObject().put("count", intValue2).put("description", str).put("load_time", longValue);
                    if (str.equals("timeout")) {
                        vrtVar.d(context, put);
                        s3q0 s3q0Var = s3q0.a;
                    }
                    bex0.a.b(r6yVar, jsApiMethodType, jSONObject.put("result", put), null, 12);
                }
                xgx0.a.getClass();
                xgx0.a("VkWorkout.GetGoogleFitWorkoutsCommand.sendWorkoutsSyncCompletedEvent -> Workouts Sync Completed");
                r6y r6yVar2 = vrtVar.b;
                if (r6yVar2 != null) {
                    r6yVar2.x(JsApiEvent.WORKOUTS_SYNC_COMPLETED, new JSONObject().put("count", intValue2));
                }
                break;
            default:
                n030 n030Var = (n030) obj5;
                gzs gzsVar = (gzs) obj4;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(545667816, intValue3, -1, "com.vk.design.demo.presentation.screens.ModalPageScreenContent.Content.<anonymous> (ModalPageScreenContent.kt:145)");
                    }
                    boolean J = aVar.J(gzsVar);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new i030(0, gzsVar);
                        aVar.R(x);
                    }
                    n030Var.b((gzs) x, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }
}
