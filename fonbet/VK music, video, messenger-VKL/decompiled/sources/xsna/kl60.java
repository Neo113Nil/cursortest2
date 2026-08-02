package xsna;

import android.content.Context;
import com.vk.clips.uploader.api.model.ClipUploadJob;
import com.vk.clips.uploader.api.model.ClipUploaderData;
import com.vk.core.tips.Tooltip;
import com.vk.dto.common.Image;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.OrdersListItem;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.voip.ui.broadcast.list.ui.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONArray;
import ru.ok.android.commons.http.HttpHeader;
import xsna.e3m;
import xsna.f5h0;
import xsna.fs1;
import xsna.gij;
import xsna.v6t0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class kl60 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ kl60(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0225 A[Catch: all -> 0x023a, TryCatch #2 {all -> 0x023a, blocks: (B:98:0x01fb, B:99:0x0200, B:101:0x0206, B:103:0x0210, B:106:0x0217, B:108:0x0225, B:112:0x0231, B:113:0x022d, B:116:0x023c, B:117:0x0243), top: B:97:0x01fb }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x023c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String, xsna.zcl] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Image image;
        int i = 2;
        zjo0 zjo0Var = 0;
        zjo0Var = 0;
        boolean z = true;
        switch (this.b) {
            case 0:
                Context context = (Context) obj;
                int i2 = -cn70.b(6);
                int b = cn70.b(256);
                e3m.a aVar = e3m.a;
                return new Tooltip.f(context.getColor(R.color.vk_tip_background), Integer.valueOf(context.getColor(R.color.vk_white)), Integer.valueOf(b), 48, null, i2, 32497449);
            case 1:
                return ((HttpHeader) obj).toString();
            case 2:
                return Long.valueOf(((OrdersListItem.Order.a) obj).a);
            case 3:
                qgi0.r((tgi0) obj, "seller_comment_text");
                return s3q0.a;
            case 4:
                return a.c.a;
            case 5:
                return (String) ((Map.Entry) obj).getKey();
            case 6:
                qgi0.r((tgi0) obj, "pin_review_community_name");
                return s3q0.a;
            case 7:
                ((tdu) obj).Q0(1);
                return s3q0.a;
            case 8:
                return Boolean.valueOf(((l3b0) obj).i);
            case 9:
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM playlist");
                try {
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } finally {
                }
            case 10:
                int i3 = ((u1c0) obj).c;
                if (i3 != 73 && i3 != 341) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                return Boolean.valueOf(((awd0) obj) instanceof oju);
            case 12:
                return ((PostingState.Editing) obj).i.f;
            case 13:
                f4m.t(com.vk.qrcode.d.j, ((dw20) obj).Jn());
                return s3q0.a;
            case 14:
                qyg0 V02 = ((hyg0) obj).V0("SELECT `recent_gif`.`id` AS `id`, `recent_gif`.`image` AS `image`, `recent_gif`.`preview` AS `preview` FROM recent_gif");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (V02.step()) {
                        String l2 = V02.l2(0);
                        String l22 = V02.l2(1);
                        if (l22 != null && !drm0.N(l22)) {
                            image = new Image(new JSONArray(l22), zjo0Var, i, zjo0Var);
                            if (image != null) {
                                throw new IllegalStateException("Expected NON-NULL 'com.vk.dto.common.Image', but it was NULL.");
                            }
                            arrayList.add(new j9f0(l2, image, V02.isNull(2) ? null : V02.l2(2)));
                        }
                        image = null;
                        if (image != null) {
                        }
                    }
                    return arrayList;
                } catch (Throwable th) {
                    throw th;
                }
            case 15:
                return s3q0.a;
            case 16:
                List list = (List) obj;
                Object obj2 = list.get(0);
                j2h0 j2h0Var = i2h0.s;
                Boolean bool = Boolean.FALSE;
                epx.f(obj2, bool);
                int i4 = (obj2 != null ? (obo0) j2h0Var.c.invoke(obj2) : null).a;
                Object obj3 = list.get(1);
                j2h0 j2h0Var2 = i2h0.t;
                epx.f(obj3, bool);
                int i5 = (obj3 != null ? (udo0) j2h0Var2.c.invoke(obj3) : null).a;
                Object obj4 = list.get(2);
                gno0[] gno0VarArr = fno0.b;
                j2h0 j2h0Var3 = i2h0.x;
                epx.f(obj4, bool);
                long j = (obj4 != null ? (fno0) j2h0Var3.c.invoke(obj4) : null).a;
                Object obj5 = list.get(3);
                iio0 iio0Var = iio0.c;
                iio0 iio0Var2 = (epx.f(obj5, bool) || obj5 == null) ? null : (iio0) ((izs) i2h0.m.c).invoke(obj5);
                Object obj6 = list.get(4);
                yta0 yta0Var = yta0.c;
                yta0 yta0Var2 = (epx.f(obj6, bool) || obj6 == null) ? null : (yta0) ((izs) k2h0.a.c).invoke(obj6);
                Object obj7 = list.get(5);
                t7z t7zVar = t7z.d;
                t7z t7zVar2 = (epx.f(obj7, bool) || obj7 == null) ? null : (t7z) ((izs) i2h0.C.c).invoke(obj7);
                Object obj8 = list.get(6);
                int i6 = ((epx.f(obj8, bool) || obj8 == null) ? null : (q7z) ((izs) k2h0.c.c).invoke(obj8)).a;
                Object obj9 = list.get(7);
                j2h0 j2h0Var4 = i2h0.u;
                epx.f(obj9, bool);
                int i7 = (obj9 != null ? (plv) j2h0Var4.c.invoke(obj9) : null).a;
                Object obj10 = list.get(8);
                boolean f = epx.f(obj10, bool);
                fh9 fh9Var = k2h0.d;
                if (!f && obj10 != null) {
                    zjo0Var = (zjo0) ((izs) fh9Var.c).invoke(obj10);
                }
                return new fh90(i4, i5, j, iio0Var2, yta0Var2, t7zVar2, i6, i7, zjo0Var);
            case 17:
                return ((pno0) obj).d().toString();
            case 18:
                qyg0 V03 = ((hyg0) obj).V0("DELETE FROM stickers_suggests");
                try {
                    V03.step();
                    V03.close();
                    return s3q0.a;
                } finally {
                }
            case 19:
                ((ojt) obj).l = f5h0.m.a;
                return s3q0.a;
            case 20:
                PostDonut postDonut = ((MsgFromChannel) obj).I.g;
                return Boolean.valueOf(postDonut != null ? postDonut.b : false);
            case 21:
                Pair pair = (Pair) obj;
                ClipUploaderData.Author author = ((ClipUploadJob) pair.i()).c;
                UserId e = author != null ? author.e() : null;
                boolean f2 = epx.f(((ClipUploadJob) pair.i()).k, Boolean.TRUE);
                PostingCreationEntryPoint.a aVar2 = PostingCreationEntryPoint.Companion;
                String str = ((ClipUploadJob) pair.i()).h;
                aVar2.getClass();
                return new gij.a(e, PostingCreationEntryPoint.a.a(str), f2);
            case 22:
                return ((Photo) ((xtw) obj).b).Cb();
            case 23:
                return Optional.of((VKList) obj);
            case 24:
                return s3q0.a;
            case 25:
                fs1 a = ((c9t0) obj).a();
                if (a instanceof fs1.b) {
                    ((fs1.b) a).getClass();
                    return new v6t0.b();
                }
                if (epx.f(a, fs1.a.a)) {
                    return v6t0.a.a;
                }
                if (epx.f(a, fs1.c.a)) {
                    return v6t0.c.a;
                }
                throw new NoWhenBranchMatchedException();
            case 26:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            default:
                return ((yqx0) obj).f;
        }
    }

    public /* synthetic */ kl60(o9t0 o9t0Var) {
        this.b = 25;
    }
}
