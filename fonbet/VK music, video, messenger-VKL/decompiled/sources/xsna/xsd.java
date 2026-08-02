package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetTemplateExtendedResponseDto;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.clickable.ClickableMarketItem;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;
import com.vk.im.engine.models.attaches.AttachWithVideo;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import xsna.as30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class xsd implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xsd(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // xsna.gzs
    public final Object invoke() {
        ClickableStickers clickableStickers;
        List<ClickableSticker> list;
        switch (this.b) {
            case 0:
                atd atdVar = (atd) this.c;
                atdVar.c((jdo) this.d, (ShortVideoGetTemplateExtendedResponseDto) this.e);
                dw20 dw20Var = atdVar.j;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 1:
                com.vk.im.video.g gVar = (com.vk.im.video.g) this.c;
                c530 c530Var = (c530) this.d;
                ModerationRestriction moderationRestriction = (ModerationRestriction) this.e;
                if (gVar.v.size() > 1 || moderationRestriction == ModerationRestriction.NONE) {
                    as30.a aVar = gVar.s;
                    if (aVar == null) {
                        aVar = null;
                    }
                    as30<A> as30Var = as30.this;
                    bs30 bs30Var = as30Var.i;
                    if (bs30Var != null) {
                        Attach a = bs30Var.c.a();
                        AttachWithVideo attachWithVideo = a instanceof AttachWithVideo ? (AttachWithVideo) a : null;
                        if (attachWithVideo != null) {
                            VideoFile A = attachWithVideo.A();
                            ClipVideoFile clipVideoFile = A instanceof ClipVideoFile ? (ClipVideoFile) A : null;
                            if (clipVideoFile != null && (clickableStickers = clipVideoFile.C1) != null && (list = clickableStickers.d) != null) {
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : list) {
                                    if (obj instanceof ClickableMarketItem) {
                                        arrayList.add(obj);
                                    }
                                }
                                int i = clipVideoFile.c;
                                UserId userId = clipVideoFile.b;
                                String str = clipVideoFile.W;
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ClickableMarketItem clickableMarketItem = (ClickableMarketItem) it.next();
                                    Good good = clickableMarketItem.j;
                                    th30 th30Var = good != null ? new th30(good.b, good.c, clickableMarketItem.l, good.V) : null;
                                    if (th30Var != null) {
                                        arrayList2.add(th30Var);
                                    }
                                }
                                HashSet hashSet = new HashSet();
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (hashSet.add(((th30) next).e)) {
                                        arrayList3.add(next);
                                    }
                                }
                                uh30 uh30Var = new uh30(i, userId, str, arrayList3);
                                pk30 pk30Var = as30Var.h;
                                if (pk30Var != null) {
                                    pk30Var.x(uh30Var);
                                }
                            }
                        }
                    }
                } else {
                    t4w t4wVar = gVar.t;
                    w530 w530Var = (t4wVar != null ? t4wVar : null).D;
                    if (w530Var != null) {
                        w530Var.b(c530Var, moderationRestriction);
                    }
                }
                return s3q0.a;
            case 2:
                vtn0 vtn0Var = (vtn0) this.c;
                Context context = (Context) this.d;
                List list2 = (List) this.e;
                SpannableStringBuilder c = vtn0Var.c(context, vtn0Var.h);
                String string = context.getString(R.string.superapp_tabbar_tooltip_subtitle_review);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : list2) {
                    int intValue = ((Number) obj2).intValue();
                    Integer num = vtn0Var.h;
                    if (num == null || intValue != num.intValue()) {
                        arrayList4.add(obj2);
                    }
                }
                return vtn0Var.d(context, true, c, string, arrayList4);
            default:
                hmp0 hmp0Var = (hmp0) this.c;
                ImageView imageView = (ImageView) this.d;
                qeh qehVar = (qeh) this.e;
                ((ViewGroup) hmp0Var.a.getRootView()).removeView(imageView);
                if (qehVar != null) {
                    qehVar.E();
                }
                return s3q0.a;
        }
    }
}
