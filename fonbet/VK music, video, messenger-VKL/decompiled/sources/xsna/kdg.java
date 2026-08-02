package xsna;

import android.content.Context;
import com.vk.api.generated.wall.dto.WallRestoreThreadResponseDto;
import com.vk.catalog2.common.ui.holders.sticker.StickerPackVerticalListItemVh;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.api.data.NewsComment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.rv30;
import xsna.wv30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class kdg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kdg(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        switch (this.b) {
            case 0:
                mdg mdgVar = (mdg) this.d;
                iag iagVar = (iag) this.e;
                WallRestoreThreadResponseDto wallRestoreThreadResponseDto = (WallRestoreThreadResponseDto) ((it80) obj).a;
                boolean d = wallRestoreThreadResponseDto != null ? wallRestoreThreadResponseDto.d() : false;
                ?? r3 = mdgVar.e;
                ListDataSet<cbg> listDataSet = mdgVar.K;
                int i2 = 0;
                while (i2 < listDataSet.d.size()) {
                    cbg c = listDataSet.c(i2);
                    if (c != null) {
                        iag iagVar2 = c.a;
                        if (iagVar2 instanceof NewsComment) {
                            NewsComment newsComment = (NewsComment) iagVar2;
                            if (epx.f(newsComment.j, iagVar.getUid())) {
                                newsComment.b0 = false;
                                listDataSet.d(i2);
                            }
                            if (newsComment.u) {
                                boolean z = this.c;
                                newsComment.u = !z;
                                if (d) {
                                    newsComment.v = false;
                                    ArrayList V2 = mdgVar.V2(newsComment);
                                    i = V2.size();
                                    listDataSet.A(i2);
                                    listDataSet.y(i2, V2);
                                } else {
                                    i = 0;
                                }
                                if (z) {
                                    r3.bm(newsComment.i);
                                    r3.Rb(i2);
                                }
                            } else {
                                i = 0;
                            }
                            i2 += i + 1;
                        }
                    }
                }
                if (mdgVar.E7()) {
                    r3.y5(iagVar);
                }
                break;
            case 1:
                wv30 wv30Var = (wv30) this.d;
                Context context = (Context) this.e;
                wv30.a aVar = (wv30.a) obj;
                wv30Var.getClass();
                Dialog dialog = aVar.a;
                if (dialog != null && !wv30Var.d(dialog.Sb().longValue())) {
                    if (this.c) {
                        L l = L.a;
                        l.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l, L.LogType.w, new Object[]{"Hiding notification %s", context.getString(R.string.vkim_msg_request_push_accepted_body, wv30Var.a(aVar))});
                        }
                    } else {
                        new rv30(context, new rv30.a(aVar.a.Sb().longValue(), context.getString(R.string.vkim_msg_request_push_accepted_title), context.getString(R.string.vkim_msg_request_push_accepted_body, wv30Var.a(aVar))), null, null, null).h(context);
                    }
                }
                break;
            default:
                StickerPackVerticalListItemVh stickerPackVerticalListItemVh = (StickerPackVerticalListItemVh) this.d;
                StickerStockItem stickerStockItem = (StickerStockItem) this.e;
                if (this.c) {
                    f9l0 f9l0Var = stickerPackVerticalListItemVh.c;
                    Context context2 = stickerPackVerticalListItemVh.i;
                    f9l0Var.f(context2 != null ? context2 : null, stickerStockItem, stickerPackVerticalListItemVh.d, stickerPackVerticalListItemVh.e, stickerPackVerticalListItemVh.f, null);
                } else if (stickerStockItem.i) {
                    f9l0 f9l0Var2 = stickerPackVerticalListItemVh.c;
                    Context context3 = stickerPackVerticalListItemVh.i;
                    f9l0Var2.c(context3 != null ? context3 : null, stickerStockItem, stickerPackVerticalListItemVh.d);
                } else {
                    Context context4 = stickerPackVerticalListItemVh.i;
                    o5l0.a(context4 != null ? context4 : null, stickerStockItem);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ kdg(boolean z, StickerPackVerticalListItemVh stickerPackVerticalListItemVh, StickerStockItem stickerStockItem) {
        this.b = 2;
        this.c = z;
        this.d = stickerPackVerticalListItemVh;
        this.e = stickerStockItem;
    }
}
