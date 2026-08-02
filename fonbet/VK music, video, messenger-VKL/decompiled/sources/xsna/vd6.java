package xsna;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.X3;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.core.analytics.tracking.StickerAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.group.BaseGroupVh;
import com.vk.catalog2.common.ui.holders.sticker.BaseStickerPackVh;
import com.vk.core.serialize.Serializer;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.Peer;
import com.vk.dto.group.Group;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.calls.a;
import com.vk.im.ui.fragments.ImStartGroupCallFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stickers.api.models.post.PostStickerStyle;
import com.vk.stickers.views.sticker.StickerPackPreview;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.InitializedLazyImpl;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class vd6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vd6(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        ChatSettings Hb;
        int i = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((BaseGroupVh) obj4).j((Group) obj3, true);
                T t = ((Ref$ObjectRef) obj2).element;
                (t != 0 ? (dw20) t : null).dismiss();
                return s3q0.a;
            case 1:
                BaseStickerPackVh baseStickerPackVh = (BaseStickerPackVh) obj4;
                UIBlock uIBlock = (UIBlock) obj3;
                StickerPackPreview stickerPackPreview = (StickerPackPreview) obj2;
                baseStickerPackVh.g.a(new cfp0(uIBlock, new StickerAnalyticsInfo(StickerAnalyticsInfo.ClickTarget.Tap)));
                SearchStatInfoProvider searchStatInfoProvider = baseStickerPackVh.h;
                SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.STICKERS;
                dfp0 dfp0Var = uIBlock instanceof dfp0 ? (dfp0) uIBlock : null;
                if (dfp0Var == null || (str = dfp0Var.r()) == null) {
                    str = "";
                }
                SearchStatsLoggingInfo b = searchStatInfoProvider.b(type, str, false);
                f9l0 f9l0Var = baseStickerPackVh.c;
                Context context = baseStickerPackVh.i;
                f9l0Var.b(context != null ? context : null, stickerPackPreview.b, baseStickerPackVh.d, baseStickerPackVh.e, baseStickerPackVh.f, b);
                return s3q0.a;
            case 2:
                Context context2 = (Context) obj4;
                VoipCallSource voipCallSource = (VoipCallSource) obj3;
                DialogExt dialogExt = (DialogExt) obj;
                Dialog Cb = dialogExt.Cb();
                if (Cb == null || (Hb = Cb.Hb()) == null) {
                    return s3q0.a;
                }
                com.vk.im.ui.calls.a c1141a = Hb.u ? a.b.a : Hb.j ? new a.C1141a(R.string.vkim_group_calls_unavailable_user_has_left_chat) : Hb.i ? new a.C1141a(R.string.vkim_group_calls_unavailable_user_has_been_kicked) : new a.C1141a(R.string.vkim_group_calls_unavailable);
                if (c1141a instanceof a.b) {
                    ImStartGroupCallFragment.a aVar = new ImStartGroupCallFragment.a(ImStartGroupCallFragment.class, null, null);
                    aVar.s(true);
                    Bundle bundle = aVar.j;
                    bundle.putBoolean("allow_empty", true);
                    long j = dialogExt.e;
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    bundle.putParcelable("dialog_id", Peer.a.b(j));
                    bundle.putBoolean("allow_empty", true);
                    bundle.putSerializable("visitSource", MobileOfficialAppsCoreNavStat$EventScreen.IM_CHAT);
                    bundle.putParcelable("source", voipCallSource);
                    aVar.k(context2);
                } else {
                    if (!(c1141a instanceof a.C1141a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    enj.q(((a.C1141a) c1141a).a, 0, context2);
                }
                return s3q0.a;
            case 3:
                String str2 = (String) obj4;
                smg smgVar = (smg) obj3;
                ud6 ud6Var = (ud6) obj2;
                StickerStockItem stickerStockItem = (StickerStockItem) obj;
                if (str2 == null) {
                    str2 = X3.i.U;
                }
                stickerStockItem.O = str2;
                ((obl0) ((InitializedLazyImpl) smgVar.b).getValue()).H7(stickerStockItem, ud6Var);
                return s3q0.a;
            default:
                ((v8m0) obj3).j((p7c0) obj2, (PostStickerStyle) ((List) obj4).get(((Integer) obj).intValue()), true);
                return s3q0.a;
        }
    }
}
