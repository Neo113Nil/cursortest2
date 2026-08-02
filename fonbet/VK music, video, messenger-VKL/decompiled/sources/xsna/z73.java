package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.bonus.StickersBonusResult;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stickers.roulette.StickersRouletteFragment;
import com.vk.stickers.roulette.roulett_view.RouletteView;
import com.vk.vas.design.view.VKStickerPackView;
import com.vkontakte.android.R;
import kotlin.Triple;
import xsna.dw20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class z73 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z73(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                Triple<? extends Intent, ? extends ResolveInfo, String> triple = (Triple) obj3;
                ResolveInfo resolveInfo = (ResolveInfo) obj2;
                Context context = (Context) obj;
                b83 b83Var = ((a83) obj4).c;
                c83 c83Var = b83Var.d;
                Intent intent = (Intent) triple.i();
                try {
                    String str = resolveInfo.resolvePackageName;
                    if (str == null) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        str = activityInfo != null ? activityInfo.packageName : null;
                    }
                    intent.setPackage(str);
                    context.startActivity(intent);
                    izs<Triple<? extends Intent, ? extends ResolveInfo, String>, s3q0> izsVar = b83Var.c;
                    if (izsVar != null) {
                        izsVar.invoke(triple);
                    }
                } finally {
                    try {
                        return s3q0.a;
                    } finally {
                    }
                }
                return s3q0.a;
            default:
                StickersRouletteFragment stickersRouletteFragment = (StickersRouletteFragment) obj4;
                StickerStockItem stickerStockItem = (StickerStockItem) obj3;
                String str2 = (String) obj2;
                StickersBonusResult stickersBonusResult = (StickersBonusResult) obj;
                int i2 = StickersRouletteFragment.o0;
                if (!stickersRouletteFragment.isAdded()) {
                    return s3q0.a;
                }
                RouletteView rouletteView = stickersRouletteFragment.W;
                if (rouletteView != null) {
                    rouletteView.b();
                }
                k7x k7xVar = new k7x(stickersRouletteFragment, str2, stickersBonusResult, 3);
                ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(stickersRouletteFragment.requireContext()).inflate(R.layout.roulette_congrats_view, (ViewGroup) null);
                dgr0.a((VKStickerPackView) viewGroup.findViewById(R.id.pack_image), stickerStockItem);
                ((TextView) viewGroup.findViewById(R.id.dialog_title_text)).setText(stickersRouletteFragment.getResources().getString(R.string.congrats_title, stickerStockItem.d));
                ((TextView) viewGroup.findViewById(R.id.dialog_message_text)).setText(stickersRouletteFragment.getResources().getString(R.string.congrats_message));
                new dw20.b(stickersRouletteFragment.requireContext(), tzp0.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.STICKERS, Long.valueOf(stickerStockItem.b), null, null, null, null, 60, null), 2)).D0(viewGroup, false).j0(stickersRouletteFragment.getResources().getString(R.string.ok_text), new iri0(k7xVar, 4)).Y(new wb7(k7xVar)).I0(null);
                return s3q0.a;
        }
    }
}
