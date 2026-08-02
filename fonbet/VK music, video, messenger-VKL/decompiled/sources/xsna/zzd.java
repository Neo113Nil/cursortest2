package xsna;

import android.content.Context;
import com.vk.dto.stickers.AnimatedStickerInfo;
import com.vk.media.MediaUtils;
import com.vk.rlottie.RLottieDrawable;
import com.vk.stickers.api.models.photo.PhotoStickerStyle;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.superapp.api.dto.story.WebTransform;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import xsna.c0e;
import xsna.szl0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class zzd implements Callable {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zzd(Context context, String str, String str2) {
        this.c = context;
        this.d = str;
        this.e = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List list;
        kr9 kr9Var;
        List list2;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                MediaUtils.d dVar = (MediaUtils.d) obj3;
                c0e.a aVar = (c0e.a) obj2;
                c0e.b bVar = (c0e.b) obj;
                int i2 = dVar.a;
                int i3 = dVar.b;
                int min = Math.min(i2, i3);
                WebStickerType webStickerType = aVar.a;
                String str = aVar.i;
                String str2 = aVar.c;
                boolean z = webStickerType == WebStickerType.EMOJI;
                String str3 = bVar.d;
                if (z) {
                    min /= 2;
                }
                int i4 = c0e.c.$EnumSwitchMapping$0[webStickerType.ordinal()];
                Object obj4 = null;
                if (i4 == 3) {
                    PhotoStickerStyle.Companion.getClass();
                    list = PhotoStickerStyle.patterns;
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (epx.f(((PhotoStickerStyle) next).m(), str3)) {
                                obj4 = next;
                            }
                        }
                    }
                    PhotoStickerStyle photoStickerStyle = (PhotoStickerStyle) obj4;
                    if (photoStickerStyle == null) {
                        PhotoStickerStyle.Companion.getClass();
                        list2 = PhotoStickerStyle.patterns;
                        photoStickerStyle = (PhotoStickerStyle) j5g.Y(list2);
                    }
                    c8m0 c8m0Var = new c8m0(aVar.b, photoStickerStyle, true, true);
                    c8m0Var.n = str2;
                    kr9Var = c8m0Var;
                } else if (i4 == 4) {
                    AnimatedStickerInfo animatedStickerInfo = aVar.h;
                    String str4 = str != null ? str : "";
                    o0m0 o0m0Var = o0m0.b;
                    bpn0 bpn0Var = yse0.a;
                    if (!RLottieDrawable.s || animatedStickerInfo == null) {
                        kr9Var = new s690(aVar.g, aVar.f, aVar.d, str3, str4);
                    } else {
                        String str5 = bVar.b;
                        kr9Var = new t690(aVar.g, aVar.f, animatedStickerInfo, str3, str5 != null ? str5 : null);
                    }
                } else if (i4 != 5) {
                    int i5 = aVar.f;
                    ad7 w690Var = i5 != 0 ? new w690(aVar.g, i5, aVar.b, min, str3) : new ad7(aVar.b, min, aVar.a, str3);
                    w690Var.n = str2;
                    kr9Var = w690Var;
                } else {
                    if (str == null) {
                        str = "";
                    }
                    kr9Var = new g4m0(aVar.e, str3, str);
                }
                WebTransform webTransform = bVar.e;
                if (webTransform != null) {
                    szl0.a.a(kr9Var, webTransform, i2, i3);
                    q500 q500Var = bVar.f;
                    if (q500Var != null) {
                        kr9Var.c.k = q500Var;
                    }
                }
                return kr9Var;
            default:
                return q700.c((Context) obj3, (String) obj2, (String) obj);
        }
    }

    public /* synthetic */ zzd(c0e c0eVar, MediaUtils.d dVar, c0e.a aVar, c0e.b bVar) {
        this.c = dVar;
        this.d = aVar;
        this.e = bVar;
    }
}
