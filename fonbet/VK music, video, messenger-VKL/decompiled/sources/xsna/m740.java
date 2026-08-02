package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.multiplecoownership.model.MultipleCoownershipModel;
import com.vk.multiplecoownership.model.MultipleCoownershipType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.k740;
import xsna.mk50;

/* compiled from: MultipleCoownershipBottomSheet.kt */
/* loaded from: classes3.dex */
public final class m740 extends tl50<n740, z740, k740> implements w8i {
    public static final /* synthetic */ int l1 = 0;
    public y740 i1;
    public MultipleCoownershipModel j1;
    public final Object k1 = msy.a(LazyThreadSafetyMode.NONE, new rkt(this, 11));

    /* compiled from: MultipleCoownershipBottomSheet.kt */
    public static final class a extends kmu0 {
        public final MultipleCoownershipModel h;

        public a(Context context, MultipleCoownershipModel multipleCoownershipModel) {
            super(context, tzp0.a(null, 3));
            this.h = multipleCoownershipModel;
            F0(true);
            J();
            n0(0);
            o0(0);
            p0(0);
            m0(0);
            N0();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            m740 m740Var = new m740();
            m740Var.setArguments(yfb.b(new Pair("arg_users", this.h)));
            return m740Var;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        y740 y740Var = new y740(requireContext(), this, new e40(this, 20));
        this.i1 = y740Var;
        return new mk50.c(y740Var.c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        z740 z740Var = (z740) ao50Var;
        y740 y740Var = this.i1;
        if (y740Var != null) {
            y740Var.f(z740Var, new ui(1, this, m740.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 6));
        }
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((n740) vk50Var).f.a(new s55(1, this, m740.class, "handleSideEffect", "handleSideEffect(Lcom/vk/multiplecoownership/presentation/bottomsheet/MultipleCoownershipSideEffect;)V", 0, 10), this);
    }

    @Override // xsna.dw20, androidx.fragment.app.d
    public final int vn() {
        return R.style.NewsFeedCoownersListBottomSheetStyle;
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        UserId userId;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("arg_users", MultipleCoownershipModel.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("arg_users");
            if (!(parcelable3 instanceof MultipleCoownershipModel)) {
                parcelable3 = null;
            }
            parcelable = (MultipleCoownershipModel) parcelable3;
        }
        if (parcelable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        MultipleCoownershipModel multipleCoownershipModel = (MultipleCoownershipModel) parcelable;
        this.j1 = multipleCoownershipModel;
        k740.b bVar = new k740.b();
        List<NewsfeedCoowners.CoownerRequest> list = multipleCoownershipModel.b;
        List<NewsfeedCoowners.CoownerRequest> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((NewsfeedCoowners.CoownerRequest) it.next()).c);
        }
        MultipleCoownershipType multipleCoownershipType = multipleCoownershipModel.c;
        NewsfeedCoowners.CoownerRequest coownerRequest = (NewsfeedCoowners.CoownerRequest) j5g.a0(list);
        if (coownerRequest == null || (userId = coownerRequest.c.b) == null) {
            userId = UserId.d;
        }
        return new n740(bVar, new r740(new w740(arrayList, multipleCoownershipType, userId), new p740(new s740(requireContext()))));
    }
}
