package xsna;

import android.app.Activity;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.g8d;

/* compiled from: AddToFavorites.kt */
/* loaded from: classes17.dex */
public final class eo0 extends ckd {
    public final c5e b;
    public final b25 c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AddToFavorites.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ADD_TO_FAVORITES;
        public static final a DELETE_FROM_FAVORITES;
        public static final a UNAVAILABLE;

        static {
            a aVar = new a("UNAVAILABLE", 0);
            UNAVAILABLE = aVar;
            a aVar2 = new a("ADD_TO_FAVORITES", 1);
            ADD_TO_FAVORITES = aVar2;
            a aVar3 = new a("DELETE_FROM_FAVORITES", 2);
            DELETE_FROM_FAVORITES = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: AddToFavorites.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.ADD_TO_FAVORITES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.DELETE_FROM_FAVORITES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.UNAVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public eo0(sua suaVar, c5e c5eVar, b25 b25Var) {
        super(ClipsBottomSheetOptions.ADD_TO_FAVORITES.ordinal());
        this.b = c5eVar;
        this.c = b25Var;
    }

    public static a c(ikd ikdVar) {
        g8d.a aVar = ikdVar.f;
        SdkVideoFile sdkVideoFile = ikdVar.a;
        return (aVar != null && aVar.a() && ci90.m(ikdVar) && ci90.h(ikdVar) && sdkVideoFile.k1() == 0 && !sdkVideoFile.Q0()) ? k15.A(sdkVideoFile).X() ? a.DELETE_FROM_FAVORITES : a.ADD_TO_FAVORITES : a.UNAVAILABLE;
    }

    @Override // xsna.ckd
    public final yu20 a(Activity activity, ikd ikdVar) {
        int i = b.$EnumSwitchMapping$0[c(ikdVar).ordinal()];
        if (i == 1) {
            return new ModalActionSheetListItem(this.a, ModalActionSheetListItem.Appearance.Default, activity.getString(R.string.clips_more_menu_add_to_favorites_title), null, null, R.drawable.vk_icon_bookmark_outline_28, ModalActionSheetListItem.IconSize.Large, false, false, 24);
        }
        if (i != 2) {
            if (i == 3) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        return new ModalActionSheetListItem(this.a, ModalActionSheetListItem.Appearance.Default, activity.getString(R.string.clips_more_menu_delete_from_favorites_title), null, null, R.drawable.vk_icon_bookmark_slash_outline_28, ModalActionSheetListItem.IconSize.Large, false, false, 24);
    }

    @Override // xsna.ckd
    public final void b(Activity activity, ikd ikdVar, nkd nkdVar) {
        SdkVideoFile sdkVideoFile = ikdVar.a;
        int i = b.$EnumSwitchMapping$0[c(ikdVar).ordinal()];
        b25 b25Var = this.c;
        c5e c5eVar = this.b;
        if (i == 1) {
            c5eVar.d(b25Var.c(), k15.A(sdkVideoFile), activity);
        } else if (i == 2) {
            c5eVar.e(b25Var.c(), k15.A(sdkVideoFile), activity);
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
