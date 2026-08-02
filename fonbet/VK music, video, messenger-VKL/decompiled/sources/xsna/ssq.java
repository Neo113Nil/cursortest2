package xsna;

import android.content.res.ColorStateList;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.fave.fragments.FavesFragment;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.dw20;

/* compiled from: FavesFragment.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class ssq extends AdaptedFunctionReference implements gzs<s3q0> {
    public ssq(FavesFragment favesFragment) {
        super(0, favesFragment, FavesFragment.class, "openFilterDialog", "openFilterDialog()Z", 8);
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        dw20.a c;
        FavesFragment favesFragment = (FavesFragment) this.receiver;
        int i = FavesFragment.j0;
        FragmentActivity activity = favesFragment.getActivity();
        if (activity != null) {
            int i2 = fqq.h;
            FaveTag faveTag = favesFragment.U;
            fqq fqqVar = new fqq(activity);
            fqqVar.e();
            fqqVar.g = new y1o0(faveTag, new p5e(1, fqqVar, fqq.class, "selectClick", "selectClick(Lcom/vk/dto/newsfeed/FaveTag;)V", 0, 2));
            fqqVar.getPaginatedView().setAdapter(fqqVar.g);
            c = ((dw20.b) new dw20.b(activity, tzp0.a(null, 3)).v0(R.string.fave_tags_title).F(uko.e(m33.a(R.drawable.vk_icon_edit_outline_28, activity), ColorStateList.valueOf(dhr0.t.c(R.attr.vk_ui_icon_accent))), null)).b0(new eqq(fqqVar, 0)).D0(fqqVar, false).c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
            int i3 = omq.f;
            fqqVar.d = new WeakReference<>(((dw20.b) c).I0("omq"));
        }
        return s3q0.a;
    }
}
