package xsna;

import android.app.Activity;
import com.vk.clips.sdk.models.ads.SdkAdsChoices;
import com.vk.clips.sdk.models.ads.SdkAdsChoicesOptions;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetSideEffectOptions;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdInfo;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdsType;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.feed.core.models.MyTargetAdsComplainOptions;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsMoreMenuItem;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.g8d;

/* compiled from: NotInterested.kt */
/* loaded from: classes17.dex */
public final class c770 extends ckd {
    public final xne b;
    public final ile c;
    public final n11 d;
    public final jwe e;

    /* compiled from: NotInterested.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SdkVideoAdsType.values().length];
            try {
                iArr[SdkVideoAdsType.MY_TARGET_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SdkVideoAdsType.MAIL_SHORT_VIDEO_KNOWN_OWNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SdkVideoAdsType.MAIL_PROMOTED_SHORT_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c770(sua suaVar, xne xneVar, ile ileVar, n11 n11Var) {
        super(ClipsBottomSheetOptions.NOT_INTERESTED.ordinal());
        this.b = xneVar;
        this.c = ileVar;
        this.d = n11Var;
        this.e = g620.f().e();
    }

    @Override // xsna.ckd
    public final yu20 a(Activity activity, ikd ikdVar) {
        ClipFeedTab clipFeedTab;
        g8d.a aVar = ikdVar.f;
        g8d.a.C2925a c2925a = aVar instanceof g8d.a.C2925a ? (g8d.a.C2925a) aVar : null;
        if (c2925a == null || (clipFeedTab = c2925a.a) == null || !ci90.b(ikdVar, this.b) || (clipFeedTab instanceof ClipFeedTab.UserSubscriptions) || (clipFeedTab instanceof ClipFeedTab.LikedClips) || (clipFeedTab instanceof ClipFeedTab.FavoriteFolder)) {
            return null;
        }
        return new ModalActionSheetListItem(this.a, ModalActionSheetListItem.Appearance.Default, activity.getString(R.string.clip_feed_not_interested), null, null, R.drawable.vk_icon_remove_circle_outline_28, ModalActionSheetListItem.IconSize.Large, false, false, 24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r5 != 3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00aa, code lost:
    
        if (r9 != 3) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.ArrayList] */
    @Override // xsna.ckd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Activity activity, ikd ikdVar, nkd nkdVar) {
        ?? r12;
        List<SdkAdsChoicesOptions> list;
        MyTargetAdsComplainOptions myTargetAdsComplainOptions;
        SdkVideoFile sdkVideoFile = ikdVar.a;
        SdkVideoAdInfo X0 = sdkVideoFile.X0();
        SdkAdsChoices sdkAdsChoices = X0 != null ? X0.n : null;
        String str = sdkAdsChoices != null ? sdkAdsChoices.d : null;
        if (sdkAdsChoices == null || (list = sdkAdsChoices.f) == null) {
            r12 = 0;
        } else {
            r12 = new ArrayList();
            for (SdkAdsChoicesOptions sdkAdsChoicesOptions : list) {
                Integer num = sdkAdsChoicesOptions.h;
                String str2 = sdkAdsChoicesOptions.d;
                String str3 = sdkAdsChoicesOptions.b;
                if (str2 != null && str3 != null && epx.f(sdkAdsChoicesOptions.c, "hide")) {
                    if (num == null) {
                        SdkVideoAdInfo X02 = sdkVideoFile.X0();
                        SdkVideoAdsType sdkVideoAdsType = X02 != null ? X02.h : null;
                        int i = sdkVideoAdsType == null ? -1 : a.$EnumSwitchMapping$0[sdkVideoAdsType.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                            }
                        }
                    }
                    myTargetAdsComplainOptions = new MyTargetAdsComplainOptions(num != null ? num.intValue() : 0, str2, str3);
                    if (myTargetAdsComplainOptions == null) {
                        r12.add(myTargetAdsComplainOptions);
                    }
                }
                myTargetAdsComplainOptions = null;
                if (myTargetAdsComplainOptions == null) {
                }
            }
        }
        if (r12 == 0) {
            r12 = EmptyList.b;
        }
        Collection collection = (Collection) r12;
        if (!collection.isEmpty()) {
            if (str == null) {
                SdkVideoAdInfo X03 = sdkVideoFile.X0();
                SdkVideoAdsType sdkVideoAdsType2 = X03 != null ? X03.h : null;
                int i2 = sdkVideoAdsType2 == null ? -1 : a.$EnumSwitchMapping$0[sdkVideoAdsType2.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                    }
                }
            }
            this.d.h(new l7s(activity, dhr0.a.v()), sdkVideoFile, str, (MyTargetAdsComplainOptions[]) collection.toArray(new MyTargetAdsComplainOptions[0]));
            return;
        }
        sih0 sih0Var = ikdVar.h;
        if (sih0Var != null) {
            sih0Var.a(ClipsBottomSheetOptions.NOT_INTERESTED);
        }
        if (nkdVar != null) {
            nkdVar.a(ClipsBottomSheetSideEffectOptions.NOT_INTERESTED, sdkVideoFile);
        }
        this.e.w();
        ile ileVar = this.c;
        if (ileVar != null) {
            ile.b(ikdVar.a, SchemeStat$TypeClipViewerItem.EventType.CLICK_MORE, MobileOfficialAppsClipsStat$ClipsMoreMenuItem.EventSubtype.NOT_INTERESTING, ileVar.a, null);
        }
    }
}
