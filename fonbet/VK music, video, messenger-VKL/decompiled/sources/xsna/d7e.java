package xsna;

import android.view.View;
import com.vk.clips.design.view.sidecontrols.renderer.model.Mode;
import com.vk.clips.design.view.sidecontrols.side.favorites.FavoritesLoadingState;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ClipsFeedItemFavoritesLiteView.kt */
/* loaded from: classes17.dex */
public final class d7e extends dh2<itq> {
    public final dsc d;
    public itq e;

    /* compiled from: ClipsFeedItemFavoritesLiteView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FavoritesLoadingState.values().length];
            try {
                iArr[FavoritesLoadingState.LOAD_ADD_TO_FAVORITES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FavoritesLoadingState.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d7e(ggd ggdVar, dsc dscVar) {
        super(ggdVar);
        this.d = dscVar;
    }

    @Override // xsna.dh2
    public final void b(itq itqVar) {
        itq itqVar2 = itqVar;
        FavoritesLoadingState favoritesLoadingState = itqVar2.c;
        if (epx.f(this.e, itqVar2)) {
            return;
        }
        boolean h = itqVar2.a.c.h();
        etq etqVar = itqVar2.b;
        ch2 ch2Var = new ch2(h, etqVar.a, etqVar.c, Mode.BUTTON, new afj(this.c.getContext().getResources().getString(etqVar.c ? R.string.clips_edit_favorites : R.string.clips_add_to_favorites), 2), new ily(6), new ok2(1.3f, 1.3f, R.drawable.clips_favorites_icon_state_list, R.raw.bookmark_outline_to_fill_shadow_medium_48, R.raw.bookmark_fill_to_outline_shadow_medium_48));
        ggd ggdVar = this.a;
        ggdVar.c(ch2Var);
        izs<? super View, s3q0> izsVar = favoritesLoadingState == FavoritesLoadingState.NONE ? this.d : null;
        if (izsVar == null) {
            izsVar = new bz(10);
        }
        ggdVar.a(izsVar);
        int i = a.$EnumSwitchMapping$0[favoritesLoadingState.ordinal()];
        if (i == 1) {
            ggdVar.b(true);
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        this.e = itqVar2;
    }
}
