package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.dto.common.id.UserId;
import kotlin.Pair;
import xsna.mk50;

/* compiled from: CommunityCategorySuggestionInfoBottomSheet.kt */
/* loaded from: classes5.dex */
public final class mtg extends tl50<ptg, wtg, ltg> {
    public static final /* synthetic */ int k1 = 0;
    public final qtg i1;
    public otg j1;

    /* compiled from: CommunityCategorySuggestionInfoBottomSheet.kt */
    public static final class a extends kmu0 {
        public final String h;
        public final String i;
        public final UserId j;
        public final maz k;

        public a(Context context, String str, String str2, UserId userId, maz mazVar) {
            super(context, tzp0.a(null, 3));
            this.h = str;
            this.i = str2;
            this.j = userId;
            this.k = mazVar;
            P0();
            O0();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            mtg mtgVar = new mtg(this.k);
            mtgVar.setArguments(yfb.b(new Pair(NativeAdContent.ViewTag.AD_TITLE, this.h), new Pair("INFO_TEXT", this.i), new Pair("GROUP_ID", this.j)));
            return mtgVar;
        }
    }

    public mtg(maz mazVar) {
        this.i1 = new qtg(this, mazVar);
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        otg otgVar = new otg(requireContext(), this);
        this.j1 = otgVar;
        return new mk50.c(otgVar.c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        wtg wtgVar = (wtg) ao50Var;
        otg otgVar = this.j1;
        if (otgVar == null) {
            otgVar = null;
        }
        otgVar.f(wtgVar, new q69(1, this, mtg.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 3));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((f4z) ((ptg) vk50Var).f.b).a(new xv2(1, this, mtg.class, "handleSideEffect", "handleSideEffect(Lcom/vk/profile/community/suggestions/impl/ui/categorysuggestionsinfo/CommunityCategorySuggestionInfoSideEffect;)V", 0, 6), this);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Object parcelable2;
        String string = bundle.getString(NativeAdContent.ViewTag.AD_TITLE);
        String string2 = bundle.getString("INFO_TEXT");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("GROUP_ID", UserId.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("GROUP_ID");
            if (!(parcelable3 instanceof UserId)) {
                parcelable3 = null;
            }
            parcelable = (UserId) parcelable3;
        }
        UserId userId = (UserId) parcelable;
        if (userId == null) {
            userId = UserId.d;
        }
        return new ptg(string, string2, userId);
    }
}
