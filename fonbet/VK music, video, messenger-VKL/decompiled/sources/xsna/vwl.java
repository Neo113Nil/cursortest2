package xsna;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.vk.dto.polls.PhotoPoll;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollBackground;
import com.vk.dto.polls.PollContentColor;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vkontakte.android.attachments.PollAttachment;
import java.io.File;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class vwl implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vwl(String str, Object obj, Object obj2, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.c = str;
        this.e = obj;
        this.f = obj2;
        this.d = q630Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007b A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:20:0x004d, B:23:0x0054, B:26:0x0060, B:28:0x006f, B:11:0x007b, B:13:0x008d, B:15:0x0094, B:9:0x0074), top: B:19:0x004d }] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        y2l0 y2l0Var;
        Bitmap decodeFile;
        int i = this.b;
        Object obj3 = this.d;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Serializable serializable = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                bxl.f((String) serializable, (DeliveryPoint.Service) obj5, (DeliveryPoint.PlaceMark) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                t1x.a((String) serializable, (s53) obj5, (r1x) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                o8m0 o8m0Var = (o8m0) obj5;
                r8m0 r8m0Var = (r8m0) obj4;
                dw20 dw20Var = (dw20) obj3;
                String str = (String) obj2;
                ((Ref$BooleanRef) serializable).element = true;
                Poll a = pdq.a(((PollAttachment) obj).f);
                PollBackground pollBackground = a.s;
                nov novVar = null;
                if (pollBackground instanceof PhotoPoll) {
                    if (str != null) {
                        try {
                            if (str.length() != 0) {
                                String K = com.vk.core.files.a.K(Uri.parse(str));
                                if (K == null) {
                                    K = "";
                                }
                                int t = ahn.t(new File(K));
                                decodeFile = BitmapFactory.decodeFile(K);
                                if (t != 0) {
                                    decodeFile = kd7.k(decodeFile, t, false);
                                }
                                if (decodeFile != null) {
                                    int i2 = (int) r8m0.Z;
                                    Bitmap b = kd7.b(decodeFile, i2, an10.b(i2 * 0.576f), false, false);
                                    PhotoPoll photoPoll = pollBackground != null ? (PhotoPoll) pollBackground : null;
                                    if (photoPoll != null) {
                                        photoPoll.f = decodeFile;
                                        photoPoll.g = b;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    decodeFile = ((PhotoPoll) pollBackground).f;
                    if (decodeFile != null) {
                    }
                }
                StickersDrawingViewGroup stickersDrawingViewGroup = o8m0Var.b;
                if (pollBackground instanceof PollContentColor) {
                    y2l0Var = ((w2l0) o8m0Var.h.getValue()).a(pollBackground != null ? pollBackground.c : 0);
                } else {
                    y2l0Var = null;
                }
                float f = r8m0.Z;
                if ((1 & 4) != 0) {
                    y2l0Var = null;
                }
                q8m0 q8m0Var = new q8m0(a, false, new s8m0(true, y2l0Var));
                if (r8m0Var == null) {
                    Iterator<nov> it = stickersDrawingViewGroup.getStickersState().a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            nov next = it.next();
                            if (next instanceof r8m0) {
                                novVar = next;
                            }
                        }
                    }
                    nov novVar2 = novVar;
                    if (novVar2 != null) {
                        stickersDrawingViewGroup.t(novVar2);
                    }
                    stickersDrawingViewGroup.f(new r8m0(q8m0Var, true));
                } else {
                    o8m0Var.a.o5().l(WebStickerType.QUESTION);
                    r8m0Var.h = q8m0Var;
                    r8m0Var.p();
                    stickersDrawingViewGroup.invalidate();
                }
                dw20Var.hide();
                break;
            default:
                ((Integer) obj2).getClass();
                r7p0.a(ne7.I(3073), (androidx.compose.runtime.a) obj, (String) serializable, (gzs) obj4, (izs) obj5, (q630) obj3);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ vwl(Ref$BooleanRef ref$BooleanRef, o8m0 o8m0Var, r8m0 r8m0Var, dw20 dw20Var) {
        this.b = 2;
        this.c = ref$BooleanRef;
        this.e = o8m0Var;
        this.f = r8m0Var;
        this.d = dw20Var;
    }
}
